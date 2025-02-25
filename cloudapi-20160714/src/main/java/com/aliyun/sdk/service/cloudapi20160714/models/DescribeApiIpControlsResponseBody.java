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
 * {@link DescribeApiIpControlsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiIpControlsResponseBody</p>
 */
public class DescribeApiIpControlsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiIpControls")
    private ApiIpControls apiIpControls;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApiIpControlsResponseBody(Builder builder) {
        this.apiIpControls = builder.apiIpControls;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiIpControlsResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiIpControls
     */
    public ApiIpControls getApiIpControls() {
        return this.apiIpControls;
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
        private ApiIpControls apiIpControls; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The information about the ACLs. The information is an array of ApiIpControlItem data.</p>
         */
        public Builder apiIpControls(ApiIpControls apiIpControls) {
            this.apiIpControls = apiIpControls;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApiIpControlsResponseBody build() {
            return new DescribeApiIpControlsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiIpControlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiIpControlsResponseBody</p>
     */
    public static class ApiIpControlItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("BoundTime")
        private String boundTime;

        @com.aliyun.core.annotation.NameInMap("IpControlId")
        private String ipControlId;

        @com.aliyun.core.annotation.NameInMap("IpControlName")
        private String ipControlName;

        private ApiIpControlItem(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.boundTime = builder.boundTime;
            this.ipControlId = builder.ipControlId;
            this.ipControlName = builder.ipControlName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiIpControlItem create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return boundTime
         */
        public String getBoundTime() {
            return this.boundTime;
        }

        /**
         * @return ipControlId
         */
        public String getIpControlId() {
            return this.ipControlId;
        }

        /**
         * @return ipControlName
         */
        public String getIpControlName() {
            return this.ipControlName;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String boundTime; 
            private String ipControlId; 
            private String ipControlName; 

            /**
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>46fbb52840d146f186e38e8e70fc8c90</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The name of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>testapi</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The time of binding.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-23T08:28:48Z</p>
             */
            public Builder boundTime(String boundTime) {
                this.boundTime = boundTime;
                return this;
            }

            /**
             * <p>The ID of the ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>dd05f1c54d6749eda95f9fa6d491449a</p>
             */
            public Builder ipControlId(String ipControlId) {
                this.ipControlId = ipControlId;
                return this;
            }

            /**
             * <p>The name of the ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>testControlName</p>
             */
            public Builder ipControlName(String ipControlName) {
                this.ipControlName = ipControlName;
                return this;
            }

            public ApiIpControlItem build() {
                return new ApiIpControlItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApiIpControlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiIpControlsResponseBody</p>
     */
    public static class ApiIpControls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiIpControlItem")
        private java.util.List<ApiIpControlItem> apiIpControlItem;

        private ApiIpControls(Builder builder) {
            this.apiIpControlItem = builder.apiIpControlItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiIpControls create() {
            return builder().build();
        }

        /**
         * @return apiIpControlItem
         */
        public java.util.List<ApiIpControlItem> getApiIpControlItem() {
            return this.apiIpControlItem;
        }

        public static final class Builder {
            private java.util.List<ApiIpControlItem> apiIpControlItem; 

            /**
             * ApiIpControlItem.
             */
            public Builder apiIpControlItem(java.util.List<ApiIpControlItem> apiIpControlItem) {
                this.apiIpControlItem = apiIpControlItem;
                return this;
            }

            public ApiIpControls build() {
                return new ApiIpControls(this);
            } 

        } 

    }
}
