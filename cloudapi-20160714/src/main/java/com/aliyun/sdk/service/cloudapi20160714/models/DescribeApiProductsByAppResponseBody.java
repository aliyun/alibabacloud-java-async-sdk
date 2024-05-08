// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiProductsByAppResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiProductsByAppResponseBody</p>
 */
public class DescribeApiProductsByAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiProductInfoList")
    private ApiProductInfoList apiProductInfoList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApiProductsByAppResponseBody(Builder builder) {
        this.apiProductInfoList = builder.apiProductInfoList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiProductsByAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiProductInfoList
     */
    public ApiProductInfoList getApiProductInfoList() {
        return this.apiProductInfoList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ApiProductInfoList apiProductInfoList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about API products.
         */
        public Builder apiProductInfoList(ApiProductInfoList apiProductInfoList) {
            this.apiProductInfoList = apiProductInfoList;
            return this;
        }

        /**
         * The page number. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApiProductsByAppResponseBody build() {
            return new DescribeApiProductsByAppResponseBody(this);
        } 

    } 

    public static class ApiProductInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiProductId")
        private String apiProductId;

        private ApiProductInfo(Builder builder) {
            this.apiProductId = builder.apiProductId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiProductInfo create() {
            return builder().build();
        }

        /**
         * @return apiProductId
         */
        public String getApiProductId() {
            return this.apiProductId;
        }

        public static final class Builder {
            private String apiProductId; 

            /**
             * The ID of the API product.
             */
            public Builder apiProductId(String apiProductId) {
                this.apiProductId = apiProductId;
                return this;
            }

            public ApiProductInfo build() {
                return new ApiProductInfo(this);
            } 

        } 

    }
    public static class ApiProductInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiProductInfo")
        private java.util.List < ApiProductInfo> apiProductInfo;

        private ApiProductInfoList(Builder builder) {
            this.apiProductInfo = builder.apiProductInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiProductInfoList create() {
            return builder().build();
        }

        /**
         * @return apiProductInfo
         */
        public java.util.List < ApiProductInfo> getApiProductInfo() {
            return this.apiProductInfo;
        }

        public static final class Builder {
            private java.util.List < ApiProductInfo> apiProductInfo; 

            /**
             * ApiProductInfo.
             */
            public Builder apiProductInfo(java.util.List < ApiProductInfo> apiProductInfo) {
                this.apiProductInfo = apiProductInfo;
                return this;
            }

            public ApiProductInfoList build() {
                return new ApiProductInfoList(this);
            } 

        } 

    }
}
