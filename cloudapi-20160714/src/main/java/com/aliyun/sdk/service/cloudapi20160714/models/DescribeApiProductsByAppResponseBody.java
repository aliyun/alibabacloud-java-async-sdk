// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeApiProductsByAppResponseBody model) {
            this.apiProductInfoList = model.apiProductInfoList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about API products.</p>
         */
        public Builder apiProductInfoList(ApiProductInfoList apiProductInfoList) {
            this.apiProductInfoList = apiProductInfoList;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B805201-AF4C-5788-AC9E-C3EEC83DC82A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApiProductsByAppResponseBody build() {
            return new DescribeApiProductsByAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiProductsByAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiProductsByAppResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ApiProductInfo model) {
                this.apiProductId = model.apiProductId;
            } 

            /**
             * <p>The ID of the API product.</p>
             * 
             * <strong>example:</strong>
             * <p>117b7a64a8b3f064eaa4a47ac62aac5e</p>
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
    /**
     * 
     * {@link DescribeApiProductsByAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiProductsByAppResponseBody</p>
     */
    public static class ApiProductInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiProductInfo")
        private java.util.List<ApiProductInfo> apiProductInfo;

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
        public java.util.List<ApiProductInfo> getApiProductInfo() {
            return this.apiProductInfo;
        }

        public static final class Builder {
            private java.util.List<ApiProductInfo> apiProductInfo; 

            private Builder() {
            } 

            private Builder(ApiProductInfoList model) {
                this.apiProductInfo = model.apiProductInfo;
            } 

            /**
             * ApiProductInfo.
             */
            public Builder apiProductInfo(java.util.List<ApiProductInfo> apiProductInfo) {
                this.apiProductInfo = apiProductInfo;
                return this;
            }

            public ApiProductInfoList build() {
                return new ApiProductInfoList(this);
            } 

        } 

    }
}
