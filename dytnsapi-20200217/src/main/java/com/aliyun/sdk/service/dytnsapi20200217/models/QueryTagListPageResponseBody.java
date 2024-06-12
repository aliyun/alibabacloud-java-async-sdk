// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTagListPageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTagListPageResponseBody</p>
 */
public class QueryTagListPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryTagListPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTagListPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response code. **OK** indicates that the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTagListPageResponseBody build() {
            return new QueryTagListPageResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DocAddress")
        private String docAddress;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IndustryId")
        private Long industryId;

        @com.aliyun.core.annotation.NameInMap("IndustryName")
        private String industryName;

        @com.aliyun.core.annotation.NameInMap("Introduction")
        private String introduction;

        @com.aliyun.core.annotation.NameInMap("IsOpen")
        private Long isOpen;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SaleStatusStr")
        private String saleStatusStr;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private Long sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        private Records(Builder builder) {
            this.apiName = builder.apiName;
            this.code = builder.code;
            this.docAddress = builder.docAddress;
            this.id = builder.id;
            this.industryId = builder.industryId;
            this.industryName = builder.industryName;
            this.introduction = builder.introduction;
            this.isOpen = builder.isOpen;
            this.name = builder.name;
            this.saleStatusStr = builder.saleStatusStr;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return docAddress
         */
        public String getDocAddress() {
            return this.docAddress;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return industryId
         */
        public Long getIndustryId() {
            return this.industryId;
        }

        /**
         * @return industryName
         */
        public String getIndustryName() {
            return this.industryName;
        }

        /**
         * @return introduction
         */
        public String getIntroduction() {
            return this.introduction;
        }

        /**
         * @return isOpen
         */
        public Long getIsOpen() {
            return this.isOpen;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return saleStatusStr
         */
        public String getSaleStatusStr() {
            return this.saleStatusStr;
        }

        /**
         * @return sceneId
         */
        public Long getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        public static final class Builder {
            private String apiName; 
            private String code; 
            private String docAddress; 
            private Long id; 
            private Long industryId; 
            private String industryName; 
            private String introduction; 
            private Long isOpen; 
            private String name; 
            private String saleStatusStr; 
            private Long sceneId; 
            private String sceneName; 

            /**
             * The API operation that is called by the frontend.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * Code
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The URL for the API documentation.
             */
            public Builder docAddress(String docAddress) {
                this.docAddress = docAddress;
                return this;
            }

            /**
             * The tag ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The industry ID.
             */
            public Builder industryId(Long industryId) {
                this.industryId = industryId;
                return this;
            }

            /**
             * The industry name.
             */
            public Builder industryName(String industryName) {
                this.industryName = industryName;
                return this;
            }

            /**
             * The tag description.
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * Indicates whether the number is activated.
             */
            public Builder isOpen(Long isOpen) {
                this.isOpen = isOpen;
                return this;
            }

            /**
             * The tag name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * *   0: The number is hidden.
             * <p>
             * *   1: The number is public.
             */
            public Builder saleStatusStr(String saleStatusStr) {
                this.saleStatusStr = saleStatusStr;
                return this;
            }

            /**
             * The scene ID.
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * The scene name.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List < Records> records;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Long totalPage;

        private Data(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Long pageNo; 
            private Long pageSize; 
            private java.util.List < Records> records; 
            private Long totalCount; 
            private Long totalPage; 

            /**
             * The page number.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The retruned data.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * The total number of returned entries.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The total number of returned pages.
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
