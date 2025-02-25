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
         * <p>The returned throttling policy information. It is an array consisting of ApiTrafficControlItem data.</p>
         */
        public Builder apiTrafficControls(ApiTrafficControls apiTrafficControls) {
            this.apiTrafficControls = apiTrafficControls;
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
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApiTrafficControlsResponseBody build() {
            return new DescribeApiTrafficControlsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiTrafficControlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiTrafficControlsResponseBody</p>
     */
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
             * <p>API operation</p>
             * 
             * <strong>example:</strong>
             * <p>testapi</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The binding time of the throttling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-23T08:28:48Z</p>
             */
            public Builder boundTime(String boundTime) {
                this.boundTime = boundTime;
                return this;
            }

            /**
             * <p>The ID of the throttling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>dd05f1c54d6749eda95f9fa6d491449a</p>
             */
            public Builder trafficControlId(String trafficControlId) {
                this.trafficControlId = trafficControlId;
                return this;
            }

            /**
             * <p>The name of the throttling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>backendsignature</p>
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
    /**
     * 
     * {@link DescribeApiTrafficControlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiTrafficControlsResponseBody</p>
     */
    public static class ApiTrafficControls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiTrafficControlItem")
        private java.util.List<ApiTrafficControlItem> apiTrafficControlItem;

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
        public java.util.List<ApiTrafficControlItem> getApiTrafficControlItem() {
            return this.apiTrafficControlItem;
        }

        public static final class Builder {
            private java.util.List<ApiTrafficControlItem> apiTrafficControlItem; 

            /**
             * ApiTrafficControlItem.
             */
            public Builder apiTrafficControlItem(java.util.List<ApiTrafficControlItem> apiTrafficControlItem) {
                this.apiTrafficControlItem = apiTrafficControlItem;
                return this;
            }

            public ApiTrafficControls build() {
                return new ApiTrafficControls(this);
            } 

        } 

    }
}
