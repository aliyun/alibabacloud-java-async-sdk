// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details about the access denial.</p>
         * <blockquote>
         * <p> This parameter is returned only if Resource Access Management (RAM) permission verification failed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
         *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
         *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
         *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
         *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
         *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
         *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
         * }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3A8F6106-6AFD-5A34-9C80-8DE2C42D06E8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>the list of view.</p>
         */
        public Builder views(java.util.List < Views> views) {
            this.views = views;
            return this;
        }

        public DescribePerformanceViewsResponseBody build() {
            return new DescribePerformanceViewsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePerformanceViewsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePerformanceViewsResponseBody</p>
     */
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
             * <p>The time when created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-18T07:06:53.000+00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-18T07:07:32.000+00:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The name of the view.</p>
             * 
             * <strong>example:</strong>
             * <p>Basic</p>
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
