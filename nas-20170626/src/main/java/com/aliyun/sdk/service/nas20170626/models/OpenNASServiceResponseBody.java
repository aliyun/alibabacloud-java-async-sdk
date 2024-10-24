// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OpenNASServiceResponseBody} extends {@link TeaModel}
 *
 * <p>OpenNASServiceResponseBody</p>
 */
public class OpenNASServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OpenNASServiceResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenNASServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String orderId; 
        private String requestId; 

        /**
         * <p>The details about the failed permission verification.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
         *     &quot;AuthPrincipalOwnerId&quot;: &quot;178321033379****&quot;,
         *     &quot;EncodedDiagnosticMessage&quot;: &quot;AJpt/382mjxDSIYIqa/cUIFvOg9tajlLyN+LJA0C78kWfKIl****&quot;,
         *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
         *     &quot;AuthPrincipalDisplayName&quot;: &quot;21794847602038****&quot;,
         *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
         *     &quot;AuthAction&quot;: &quot;nas:OpenNASService&quot;
         *   }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20671870151****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>427DB0B3-9436-4A3C-B2BC-B961F95E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OpenNASServiceResponseBody build() {
            return new OpenNASServiceResponseBody(this);
        } 

    } 

}
