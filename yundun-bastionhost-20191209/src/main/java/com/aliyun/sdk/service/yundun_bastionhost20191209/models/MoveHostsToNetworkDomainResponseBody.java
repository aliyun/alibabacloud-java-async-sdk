// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MoveHostsToNetworkDomainResponseBody} extends {@link TeaModel}
 *
 * <p>MoveHostsToNetworkDomainResponseBody</p>
 */
public class MoveHostsToNetworkDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List < Results> results;

    private MoveHostsToNetworkDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveHostsToNetworkDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List < Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Results> results; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F9B9E190-9C8E-5FEE-B963-7E9F1FD7FB4E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the call.</p>
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        public MoveHostsToNetworkDomainResponseBody build() {
            return new MoveHostsToNetworkDomainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MoveHostsToNetworkDomainResponseBody} extends {@link TeaModel}
     *
     * <p>MoveHostsToNetworkDomainResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Results(Builder builder) {
            this.code = builder.code;
            this.hostId = builder.hostId;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String hostId; 
            private String message; 

            /**
             * <p>The return code that indicates whether the host is added to the network domain.</p>
             * <blockquote>
             * <p>The code LICENSE_OUT_OF_LIMIT indicates that the network domain feature is not supported by the current Bastionhost edition.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The host ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The error message that is returned.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
