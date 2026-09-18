// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link TestConnectivityResponseBody} extends {@link TeaModel}
 *
 * <p>TestConnectivityResponseBody</p>
 */
public class TestConnectivityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TestConnectivityResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestConnectivityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(TestConnectivityResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The result details of the connectivity test.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The unique identifier of the request, used for troubleshooting and log tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TestConnectivityResponseBody build() {
            return new TestConnectivityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TestConnectivityResponseBody} extends {@link TeaModel}
     *
     * <p>TestConnectivityResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private String checkId;

        @com.aliyun.core.annotation.NameInMap("LatencyMs")
        private Long latencyMs;

        @com.aliyun.core.annotation.NameInMap("VerifyMessage")
        private String verifyMessage;

        @com.aliyun.core.annotation.NameInMap("VerifyStatus")
        private String verifyStatus;

        private Data(Builder builder) {
            this.checkId = builder.checkId;
            this.latencyMs = builder.latencyMs;
            this.verifyMessage = builder.verifyMessage;
            this.verifyStatus = builder.verifyStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public String getCheckId() {
            return this.checkId;
        }

        /**
         * @return latencyMs
         */
        public Long getLatencyMs() {
            return this.latencyMs;
        }

        /**
         * @return verifyMessage
         */
        public String getVerifyMessage() {
            return this.verifyMessage;
        }

        /**
         * @return verifyStatus
         */
        public String getVerifyStatus() {
            return this.verifyStatus;
        }

        public static final class Builder {
            private String checkId; 
            private Long latencyMs; 
            private String verifyMessage; 
            private String verifyStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.checkId = model.checkId;
                this.latencyMs = model.latencyMs;
                this.verifyMessage = model.verifyMessage;
                this.verifyStatus = model.verifyStatus;
            } 

            /**
             * <p>The tracking identifier of the connectivity test. The system generates this value for the first call. For polling calls, this value is the same as the CheckId in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>conn-a1b2c3d4e5f67890</p>
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The end-to-end latency of the target service response, in milliseconds. This value may be 0 or not returned when VerifyStatus is checking.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder latencyMs(Long latencyMs) {
                this.latencyMs = latencyMs;
                return this;
            }

            /**
             * <p>The detailed information of the verification result. When VerifyStatus is verified, this value is a snippet of the response returned by the target service. When VerifyStatus is failed, this value describes the error cause, such as authentication failure, timeout, or empty response.</p>
             * 
             * <strong>example:</strong>
             * <p>Connectivity verification succeeded</p>
             */
            public Builder verifyMessage(String verifyMessage) {
                this.verifyMessage = verifyMessage;
                return this;
            }

            /**
             * <p>The current status of the connectivity verification.</p>
             * 
             * <strong>example:</strong>
             * <p>verified</p>
             */
            public Builder verifyStatus(String verifyStatus) {
                this.verifyStatus = verifyStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
