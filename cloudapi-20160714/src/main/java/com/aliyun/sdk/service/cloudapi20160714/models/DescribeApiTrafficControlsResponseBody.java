// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiTrafficControlsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiTrafficControlsResponseBody</p>
 */
public class DescribeApiTrafficControlsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiTrafficControls")
    private ApiTrafficControls apiTrafficControls;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApiTrafficControlsResponseBody(Builder builder) {
        this.apiTrafficControls = builder.apiTrafficControls;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiTrafficControlsResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiTrafficControls
     */
    public ApiTrafficControls getApiTrafficControls() {
        return this.apiTrafficControls;
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
        private ApiTrafficControls apiTrafficControls; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The returned throttling policy information. It is an array consisting of ApiTrafficControlItem data.
         */
        public Builder apiTrafficControls(ApiTrafficControls apiTrafficControls) {
            this.apiTrafficControls = apiTrafficControls;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
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

        public DescribeApiTrafficControlsResponseBody build() {
            return new DescribeApiTrafficControlsResponseBody(this);
        } 

    } 

    public static class ApiTrafficControlItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("BoundTime")
        private String boundTime;

        @com.aliyun.core.annotation.NameInMap("TrafficControlId")
        private String trafficControlId;

        @com.aliyun.core.annotation.NameInMap("TrafficControlName")
        private String trafficControlName;

        private ApiTrafficControlItem(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.boundTime = builder.boundTime;
            this.trafficControlId = builder.trafficControlId;
            this.trafficControlName = builder.trafficControlName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiTrafficControlItem create() {
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
         * @return trafficControlId
         */
        public String getTrafficControlId() {
            return this.trafficControlId;
        }

        /**
         * @return trafficControlName
         */
        public String getTrafficControlName() {
            return this.trafficControlName;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String boundTime; 
            private String trafficControlId; 
            private String trafficControlName; 

            /**
             * The ID of the API.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * API operation
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * The binding time of the throttling policy.
             */
            public Builder boundTime(String boundTime) {
                this.boundTime = boundTime;
                return this;
            }

            /**
             * The ID of the throttling policy.
             */
            public Builder trafficControlId(String trafficControlId) {
                this.trafficControlId = trafficControlId;
                return this;
            }

            /**
             * The name of the throttling policy.
             */
            public Builder trafficControlName(String trafficControlName) {
                this.trafficControlName = trafficControlName;
                return this;
            }

            public ApiTrafficControlItem build() {
                return new ApiTrafficControlItem(this);
            } 

        } 

    }
    public static class ApiTrafficControls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiTrafficControlItem")
        private java.util.List < ApiTrafficControlItem> apiTrafficControlItem;

        private ApiTrafficControls(Builder builder) {
            this.apiTrafficControlItem = builder.apiTrafficControlItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiTrafficControls create() {
            return builder().build();
        }

        /**
         * @return apiTrafficControlItem
         */
        public java.util.List < ApiTrafficControlItem> getApiTrafficControlItem() {
            return this.apiTrafficControlItem;
        }

        public static final class Builder {
            private java.util.List < ApiTrafficControlItem> apiTrafficControlItem; 

            /**
             * ApiTrafficControlItem.
             */
            public Builder apiTrafficControlItem(java.util.List < ApiTrafficControlItem> apiTrafficControlItem) {
                this.apiTrafficControlItem = apiTrafficControlItem;
                return this;
            }

            public ApiTrafficControls build() {
                return new ApiTrafficControls(this);
            } 

        } 

    }
}
