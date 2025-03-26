// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTextbookAssistantBooksResponseBody} extends {@link TeaModel}
 *
 * <p>ListTextbookAssistantBooksResponseBody</p>
 */
public class ListTextbookAssistantBooksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListTextbookAssistantBooksResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTextbookAssistantBooksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListTextbookAssistantBooksResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B695B377-7029-5805-9DE2-1AAE06C1BF6B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTextbookAssistantBooksResponseBody build() {
            return new ListTextbookAssistantBooksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTextbookAssistantBooksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantBooksResponseBody</p>
     */
    public static class BookList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("bookId")
        private String bookId;

        @com.aliyun.core.annotation.NameInMap("bookName")
        private String bookName;

        @com.aliyun.core.annotation.NameInMap("coverImage")
        private String coverImage;

        @com.aliyun.core.annotation.NameInMap("edition")
        private String edition;

        @com.aliyun.core.annotation.NameInMap("grade")
        private String grade;

        @com.aliyun.core.annotation.NameInMap("impression")
        private String impression;

        @com.aliyun.core.annotation.NameInMap("isbn")
        private String isbn;

        @com.aliyun.core.annotation.NameInMap("publisher")
        private String publisher;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("volume")
        private String volume;

        private BookList(Builder builder) {
            this.author = builder.author;
            this.bookId = builder.bookId;
            this.bookName = builder.bookName;
            this.coverImage = builder.coverImage;
            this.edition = builder.edition;
            this.grade = builder.grade;
            this.impression = builder.impression;
            this.isbn = builder.isbn;
            this.publisher = builder.publisher;
            this.subject = builder.subject;
            this.version = builder.version;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BookList create() {
            return builder().build();
        }

        /**
         * @return author
         */
        public String getAuthor() {
            return this.author;
        }

        /**
         * @return bookId
         */
        public String getBookId() {
            return this.bookId;
        }

        /**
         * @return bookName
         */
        public String getBookName() {
            return this.bookName;
        }

        /**
         * @return coverImage
         */
        public String getCoverImage() {
            return this.coverImage;
        }

        /**
         * @return edition
         */
        public String getEdition() {
            return this.edition;
        }

        /**
         * @return grade
         */
        public String getGrade() {
            return this.grade;
        }

        /**
         * @return impression
         */
        public String getImpression() {
            return this.impression;
        }

        /**
         * @return isbn
         */
        public String getIsbn() {
            return this.isbn;
        }

        /**
         * @return publisher
         */
        public String getPublisher() {
            return this.publisher;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return volume
         */
        public String getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String author; 
            private String bookId; 
            private String bookName; 
            private String coverImage; 
            private String edition; 
            private String grade; 
            private String impression; 
            private String isbn; 
            private String publisher; 
            private String subject; 
            private String version; 
            private String volume; 

            private Builder() {
            } 

            private Builder(BookList model) {
                this.author = model.author;
                this.bookId = model.bookId;
                this.bookName = model.bookName;
                this.coverImage = model.coverImage;
                this.edition = model.edition;
                this.grade = model.grade;
                this.impression = model.impression;
                this.isbn = model.isbn;
                this.publisher = model.publisher;
                this.subject = model.subject;
                this.version = model.version;
                this.volume = model.volume;
            } 

            /**
             * author.
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * bookId.
             */
            public Builder bookId(String bookId) {
                this.bookId = bookId;
                return this;
            }

            /**
             * bookName.
             */
            public Builder bookName(String bookName) {
                this.bookName = bookName;
                return this;
            }

            /**
             * coverImage.
             */
            public Builder coverImage(String coverImage) {
                this.coverImage = coverImage;
                return this;
            }

            /**
             * edition.
             */
            public Builder edition(String edition) {
                this.edition = edition;
                return this;
            }

            /**
             * grade.
             */
            public Builder grade(String grade) {
                this.grade = grade;
                return this;
            }

            /**
             * impression.
             */
            public Builder impression(String impression) {
                this.impression = impression;
                return this;
            }

            /**
             * isbn.
             */
            public Builder isbn(String isbn) {
                this.isbn = isbn;
                return this;
            }

            /**
             * publisher.
             */
            public Builder publisher(String publisher) {
                this.publisher = publisher;
                return this;
            }

            /**
             * subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * volume.
             */
            public Builder volume(String volume) {
                this.volume = volume;
                return this;
            }

            public BookList build() {
                return new BookList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantBooksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantBooksResponseBody</p>
     */
    public static class PaginationData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("maxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        private PaginationData(Builder builder) {
            this.currentPage = builder.currentPage;
            this.maxResults = builder.maxResults;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PaginationData create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer maxResults; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PaginationData model) {
                this.currentPage = model.currentPage;
                this.maxResults = model.maxResults;
                this.totalCount = model.totalCount;
            } 

            /**
             * currentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * maxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * totalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PaginationData build() {
                return new PaginationData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantBooksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantBooksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bookList")
        private java.util.List<BookList> bookList;

        @com.aliyun.core.annotation.NameInMap("paginationData")
        private PaginationData paginationData;

        private Data(Builder builder) {
            this.bookList = builder.bookList;
            this.paginationData = builder.paginationData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bookList
         */
        public java.util.List<BookList> getBookList() {
            return this.bookList;
        }

        /**
         * @return paginationData
         */
        public PaginationData getPaginationData() {
            return this.paginationData;
        }

        public static final class Builder {
            private java.util.List<BookList> bookList; 
            private PaginationData paginationData; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bookList = model.bookList;
                this.paginationData = model.paginationData;
            } 

            /**
             * bookList.
             */
            public Builder bookList(java.util.List<BookList> bookList) {
                this.bookList = bookList;
                return this;
            }

            /**
             * paginationData.
             */
            public Builder paginationData(PaginationData paginationData) {
                this.paginationData = paginationData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
