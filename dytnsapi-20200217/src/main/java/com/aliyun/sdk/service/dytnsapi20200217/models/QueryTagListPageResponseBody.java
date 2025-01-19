// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
         * <p>The response code. <strong>OK</strong> indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A4475657-BB7E-585D-9E09-37934F096103</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTagListPageResponseBody build() {
            return new QueryTagListPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTagListPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTagListPageResponseBody</p>
     */
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
             * <p>The API operation that is called by the frontend.</p>
             * 
             * <strong>example:</strong>
             * <p>TwoElementsVerification</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>Code</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The URL for the API documentation.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://help.aliyun.com/document_detail/388997.html?spm=a2c4g.388997.0.0.cf804cc7DX4vlP">https://help.aliyun.com/document_detail/388997.html?spm=a2c4g.388997.0.0.cf804cc7DX4vlP</a></p>
             */
            public Builder docAddress(String docAddress) {
                this.docAddress = docAddress;
                return this;
            }

            /**
             * <p>The tag ID.</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The industry ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder industryId(Long industryId) {
                this.industryId = industryId;
                return this;
            }

            /**
             * <p>The industry name.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder industryName(String industryName) {
                this.industryName = industryName;
                return this;
            }

            /**
             * <p>The tag description.</p>
             * 
             * <strong>example:</strong>
             * <p>for autotest new</p>
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * <p>Indicates whether the number is activated.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder isOpen(Long isOpen) {
                this.isOpen = isOpen;
                return this;
            }

            /**
             * <p>The tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <ul>
             * <li>0: The number is hidden.</li>
             * <li>1: The number is public.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder saleStatusStr(String saleStatusStr) {
                this.saleStatusStr = saleStatusStr;
                return this;
            }

            /**
             * <p>The scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The scene name.</p>
             * 
             * <strong>example:</strong>
             * <p>check</p>
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
    /**
     * 
     * {@link QueryTagListPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTagListPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

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
        public java.util.List<Records> getRecords() {
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
            private java.util.List<Records> records; 
            private Long totalCount; 
            private Long totalPage; 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The retruned data.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The total number of returned pages.</p>
             * 
             * <strong>example:</strong>
             * <p>91</p>
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
