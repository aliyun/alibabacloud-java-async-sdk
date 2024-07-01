// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePerformanceViewsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePerformanceViewsResponseBody</p>
 */
public class DescribePerformanceViewsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Views")
    private java.util.List < Views> views;

    private DescribePerformanceViewsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.requestId = builder.requestId;
        this.views = builder.views;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePerformanceViewsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return views
     */
    public java.util.List < Views> getViews() {
        return this.views;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String requestId; 
        private java.util.List < Views> views; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Views.
         */
        public Builder views(java.util.List < Views> views) {
            this.views = views;
            return this;
        }

        public DescribePerformanceViewsResponseBody build() {
            return new DescribePerformanceViewsResponseBody(this);
        } 

    } 

    public static class Views extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("ViewName")
        private String viewName;

        private Views(Builder builder) {
            this.createTime = builder.createTime;
            this.updateTime = builder.updateTime;
            this.viewName = builder.viewName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Views create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return viewName
         */
        public String getViewName() {
            return this.viewName;
        }

        public static final class Builder {
            private String createTime; 
            private String updateTime; 
            private String viewName; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * ViewName.
             */
            public Builder viewName(String viewName) {
                this.viewName = viewName;
                return this;
            }

            public Views build() {
                return new Views(this);
            } 

        } 

    }
}
