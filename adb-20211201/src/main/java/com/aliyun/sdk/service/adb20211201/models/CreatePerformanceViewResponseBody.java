// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link CreatePerformanceViewResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePerformanceViewResponseBody</p>
 */
public class CreatePerformanceViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("CreateStatus")
    private String createStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePerformanceViewResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.createStatus = builder.createStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePerformanceViewResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return createStatus
     */
    public String getCreateStatus() {
        return this.createStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String createStatus; 
        private String requestId; 

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
         * <p>The creation result. Valid values:</p>
         * <ul>
         * <li><strong>SUCCESS</strong></li>
         * <li><strong>FAILED</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder createStatus(String createStatus) {
            this.createStatus = createStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E031AABF-BD56-5966-A063-4283EF18DB45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePerformanceViewResponseBody build() {
            return new CreatePerformanceViewResponseBody(this);
        } 

    } 

}
