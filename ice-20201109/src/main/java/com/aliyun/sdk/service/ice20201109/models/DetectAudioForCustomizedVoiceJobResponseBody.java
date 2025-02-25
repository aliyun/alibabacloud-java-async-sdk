// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true false</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>Indicates whether the audio file passes the check. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder pass(Boolean pass) {
                this.pass = pass;
                return this;
            }

            /**
             * <p>The reason returned if the audio file failed to pass the check.</p>
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
