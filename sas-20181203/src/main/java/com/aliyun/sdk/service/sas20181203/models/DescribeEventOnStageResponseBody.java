// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEventOnStageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventOnStageResponseBody</p>
 */
public class DescribeEventOnStageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityEventStageResponse")
    private SecurityEventStageResponse securityEventStageResponse;

    private DescribeEventOnStageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityEventStageResponse = builder.securityEventStageResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventOnStageResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityEventStageResponse
     */
    public SecurityEventStageResponse getSecurityEventStageResponse() {
        return this.securityEventStageResponse;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityEventStageResponse securityEventStageResponse; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-E332241XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The platforms that are supported by the feature of container threat detection.</p>
         */
        public Builder securityEventStageResponse(SecurityEventStageResponse securityEventStageResponse) {
            this.securityEventStageResponse = securityEventStageResponse;
            return this;
        }

        public DescribeEventOnStageResponseBody build() {
            return new DescribeEventOnStageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventOnStageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventOnStageResponseBody</p>
     */
    public static class SecurityEventStageResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityEventOnStag")
        private java.util.Map < String, ? > securityEventOnStag;

        private SecurityEventStageResponse(Builder builder) {
            this.securityEventOnStag = builder.securityEventOnStag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEventStageResponse create() {
            return builder().build();
        }

        /**
         * @return securityEventOnStag
         */
        public java.util.Map < String, ? > getSecurityEventOnStag() {
            return this.securityEventOnStag;
        }

        public static final class Builder {
            private java.util.Map < String, ? > securityEventOnStag; 

            /**
             * <p>The platform that is supported by the feature of container threat detection. Valid values:</p>
             * <ul>
             * <li><strong>container</strong></li>
             * <li><strong>linux</strong></li>
             * <li><strong>windows</strong></li>
             * </ul>
             */
            public Builder securityEventOnStag(java.util.Map < String, ? > securityEventOnStag) {
                this.securityEventOnStag = securityEventOnStag;
                return this;
            }

            public SecurityEventStageResponse build() {
                return new SecurityEventStageResponse(this);
            } 

        } 

    }
}
