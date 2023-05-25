// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiIpControlsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiIpControlsResponseBody</p>
 */
public class DescribeApiIpControlsResponseBody extends TeaModel {
    @NameInMap("ApiIpControls")
    private ApiIpControls apiIpControls;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The ID of the API.
         */
        public Builder apiIpControls(ApiIpControls apiIpControls) {
            this.apiIpControls = apiIpControls;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The information about the ACLs. The information is an array of ApiIpControlItem data.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time of binding.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApiIpControlsResponseBody build() {
            return new DescribeApiIpControlsResponseBody(this);
        } 

    } 

    public static class ApiIpControlItem extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("BoundTime")
        private String boundTime;

        @NameInMap("IpControlId")
        private String ipControlId;

        @NameInMap("IpControlName")
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
             * The name of the ACL.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * Queries the access control lists (ACLs) that are bound to all the APIs in an API group in a specified environment.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * The ID of the ACL.
             */
            public Builder boundTime(String boundTime) {
                this.boundTime = boundTime;
                return this;
            }

            /**
             * The name of the API.
             */
            public Builder ipControlId(String ipControlId) {
                this.ipControlId = ipControlId;
                return this;
            }

            /**
             * *   This operation is intended for API callers.
             * <p>
             * *   If an optional parameter is not specified, all results are returned on separate pages.
             * 
             * ·
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
    public static class ApiIpControls extends TeaModel {
        @NameInMap("ApiIpControlItem")
        private java.util.List < ApiIpControlItem> apiIpControlItem;

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
        public java.util.List < ApiIpControlItem> getApiIpControlItem() {
            return this.apiIpControlItem;
        }

        public static final class Builder {
            private java.util.List < ApiIpControlItem> apiIpControlItem; 

            /**
             * ApiIpControlItem.
             */
            public Builder apiIpControlItem(java.util.List < ApiIpControlItem> apiIpControlItem) {
                this.apiIpControlItem = apiIpControlItem;
                return this;
            }

            public ApiIpControls build() {
                return new ApiIpControls(this);
            } 

        } 

    }
}
