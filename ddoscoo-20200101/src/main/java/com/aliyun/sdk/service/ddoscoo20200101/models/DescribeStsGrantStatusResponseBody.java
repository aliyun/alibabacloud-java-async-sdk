// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStsGrantStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStsGrantStatusResponseBody</p>
 */
public class DescribeStsGrantStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StsGrant")
    private StsGrant stsGrant;

    private DescribeStsGrantStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stsGrant = builder.stsGrant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStsGrantStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stsGrant
     */
    public StsGrant getStsGrant() {
        return this.stsGrant;
    }

    public static final class Builder {
        private String requestId; 
        private StsGrant stsGrant; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The authorization status of Anti-DDoS Pro or Anti-DDoS Premium.
         */
        public Builder stsGrant(StsGrant stsGrant) {
            this.stsGrant = stsGrant;
            return this;
        }

        public DescribeStsGrantStatusResponseBody build() {
            return new DescribeStsGrantStatusResponseBody(this);
        } 

    } 

    public static class StsGrant extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private StsGrant(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StsGrant create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer status; 

            /**
             * The authorization status. Valid values:
             * <p>
             * 
             * *   **0**: Anti-DDoS Pro or Anti-DDoS Premium is not authorized to access other cloud services.
             * *   **1**: Anti-DDoS Pro or Anti-DDoS Premium is authorized to access other cloud services.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public StsGrant build() {
                return new StsGrant(this);
            } 

        } 

    }
}
