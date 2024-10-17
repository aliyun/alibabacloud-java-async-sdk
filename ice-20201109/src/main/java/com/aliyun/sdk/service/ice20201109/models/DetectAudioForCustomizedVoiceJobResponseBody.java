// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetectAudioForCustomizedVoiceJobResponseBody} extends {@link TeaModel}
 *
 * <p>DetectAudioForCustomizedVoiceJobResponseBody</p>
 */
public class DetectAudioForCustomizedVoiceJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DetectAudioForCustomizedVoiceJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectAudioForCustomizedVoiceJobResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DetectAudioForCustomizedVoiceJobResponseBody build() {
            return new DetectAudioForCustomizedVoiceJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetectAudioForCustomizedVoiceJobResponseBody} extends {@link TeaModel}
     *
     * <p>DetectAudioForCustomizedVoiceJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Pass")
        private Boolean pass;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private Data(Builder builder) {
            this.pass = builder.pass;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pass
         */
        public Boolean getPass() {
            return this.pass;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private Boolean pass; 
            private String reason; 

            /**
             * Pass.
             */
            public Builder pass(Boolean pass) {
                this.pass = pass;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
