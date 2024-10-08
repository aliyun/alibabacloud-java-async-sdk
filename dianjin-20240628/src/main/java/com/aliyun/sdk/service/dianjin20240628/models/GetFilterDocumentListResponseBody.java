// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFilterDocumentListResponseBody} extends {@link TeaModel}
 *
 * <p>GetFilterDocumentListResponseBody</p>
 */
public class GetFilterDocumentListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private GetFilterDocumentListResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFilterDocumentListResponseBody create() {
        return builder().build();
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private Data data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        /**
         * cost.
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
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
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
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

        /**
         * time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public GetFilterDocumentListResponseBody build() {
            return new GetFilterDocumentListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFilterDocumentListResponseBody} extends {@link TeaModel}
     *
     * <p>GetFilterDocumentListResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("docId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("documentMeta")
        private java.util.Map < String, ? > documentMeta;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("libraryId")
        private String libraryId;

        @com.aliyun.core.annotation.NameInMap("statusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Records(Builder builder) {
            this.docId = builder.docId;
            this.documentMeta = builder.documentMeta;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.libraryId = builder.libraryId;
            this.statusCode = builder.statusCode;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return documentMeta
         */
        public java.util.Map < String, ? > getDocumentMeta() {
            return this.documentMeta;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return libraryId
         */
        public String getLibraryId() {
            return this.libraryId;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String docId; 
            private java.util.Map < String, ? > documentMeta; 
            private String fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private String libraryId; 
            private String statusCode; 
            private String title; 
            private String url; 

            /**
             * docId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * documentMeta.
             */
            public Builder documentMeta(java.util.Map < String, ? > documentMeta) {
                this.documentMeta = documentMeta;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * libraryId.
             */
            public Builder libraryId(String libraryId) {
                this.libraryId = libraryId;
                return this;
            }

            /**
             * statusCode.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFilterDocumentListResponseBody} extends {@link TeaModel}
     *
     * <p>GetFilterDocumentListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("records")
        private java.util.List < Records> records;

        @com.aliyun.core.annotation.NameInMap("totalPages")
        private Long totalPages;

        @com.aliyun.core.annotation.NameInMap("totalRecords")
        private Long totalRecords;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalPages = builder.totalPages;
            this.totalRecords = builder.totalRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalPages
         */
        public Long getTotalPages() {
            return this.totalPages;
        }

        /**
         * @return totalRecords
         */
        public Long getTotalRecords() {
            return this.totalRecords;
        }

        public static final class Builder {
            private Long currentPage; 
            private Long pageSize; 
            private java.util.List < Records> records; 
            private Long totalPages; 
            private Long totalRecords; 

            /**
             * currentPage.
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * totalPages.
             */
            public Builder totalPages(Long totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            /**
             * totalRecords.
             */
            public Builder totalRecords(Long totalRecords) {
                this.totalRecords = totalRecords;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
