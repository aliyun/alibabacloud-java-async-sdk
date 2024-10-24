// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6623EA1F-30FB-5BC8-BEC9-74D55F6F08F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The authorization status of Anti-DDoS Pro or Anti-DDoS Premium.</p>
         */
        public Builder stsGrant(StsGrant stsGrant) {
            this.stsGrant = stsGrant;
            return this;
        }

        public DescribeStsGrantStatusResponseBody build() {
            return new DescribeStsGrantStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStsGrantStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStsGrantStatusResponseBody</p>
     */
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
             * <p>The authorization status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Anti-DDoS Pro or Anti-DDoS Premium is not authorized to access other cloud services.</li>
             * <li><strong>1</strong>: Anti-DDoS Pro or Anti-DDoS Premium is authorized to access other cloud services.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
