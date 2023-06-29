# blog
# 요구사항

1. 요구사항을 기반으로 Use Case 그려보기

2. 전체 게시글 목록 조회 API
    - 제목, 작성자명, 작성 내용, 작성 날짜를 조회하기
    - 작성 날짜 기준 내림차순으로 정렬하기
3. 게시글 작성 API 
    - 제목, 작성자명, 비밀번호, 작성 내용을 저장하고
    - 저장된 게시글을 Client 로 반환하기
4. 선택한 게시글 조회 API 
    - 선택한 게시글의 제목, 작성자명, 작성 날짜, 작성 내용을 조회하기 
    (검색 기능이 아닙니다. 간단한 게시글 조회만 구현해주세요.)
5. 선택한 게시글 수정 API
    - 수정을 요청할 때 수정할 데이터와 비밀번호를 같이 보내서 서버에서 비밀번호 일치 여부를 확인 한 후
    - 제목, 작성자명, 작성 내용을 수정하고 수정된 게시글을 Client 로 반환하기
6. 선택한 게시글 삭제 API
    - 삭제를 요청할 때 비밀번호를 같이 보내서 서버에서 비밀번호 일치 여부를 확인 한 후
    - 선택한 게시글을 삭제하고 Client 로 성공했다는 표시 반환하기
   
# Use Case Diagram
![use Case Diagram](https://github.com/uiseongsang/blog/assets/40707686/389ff67f-1cf5-47a5-9c8a-4d25bc7c2430)

# API 
![API specification](https://github.com/uiseongsang/blog/assets/40707686/1abd2931-4dad-4e53-b915-db36d72bdd4b)

# Postman Test

## Post Test
Post - /api/post
![](https://velog.velcdn.com/images/uiseongsang/post/39ff530e-fffb-4d0a-8644-0b6e632eddc0/image.png)

## Get Test
Get - /api/posts
![](https://velog.velcdn.com/images/uiseongsang/post/c4a462aa-89ed-42fd-922e-2f74f22bf9a3/image.png)

Get - /api/post/2
![](https://velog.velcdn.com/images/uiseongsang/post/fa335fcd-6529-4ceb-a48d-9ea086508c6a/image.png)

## Put Test
Put = /api/post/4

1. 먼저 Post를 만들어 준다
![](https://velog.velcdn.com/images/uiseongsang/post/9ffec36b-fd6f-4793-ab9d-e41b3b5f139b/image.png)
2. 수정하기
![](https://velog.velcdn.com/images/uiseongsang/post/dfeda253-5152-439a-aa3a-160c15764995/image.png)
3. 수정 확인하기
![](https://velog.velcdn.com/images/uiseongsang/post/3b36cfcd-a272-4ff3-a62f-115ed10e7a81/image.png)

## Delete Test
Delete - /api/post/4

1.삭제하기
![](https://velog.velcdn.com/images/uiseongsang/post/ca03a2ac-bc03-485d-9d78-6e214829a0b9/image.png)
2.삭제확인
![](https://velog.velcdn.com/images/uiseongsang/post/86452faf-6421-429e-bad3-5a86833634c9/image.png)

3.모든 포스트확인
![](https://velog.velcdn.com/images/uiseongsang/post/bbf9bca3-c000-49a3-a671-89e434d141c8/image.png)

