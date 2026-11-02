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
 * {@link SubmitCosyVoiceCustomizedVoiceJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitCosyVoiceCustomizedVoiceJobResponseBody</p>
 */
public class SubmitCosyVoiceCustomizedVoiceJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SubmitCosyVoiceCustomizedVoiceJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCosyVoiceCustomizedVoiceJobResponseBody create() {
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

        private Builder() {
        } 

        private Builder(SubmitCosyVoiceCustomizedVoiceJobResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C0C02296-113C-5838-8FE9-8F3A32998DDC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SubmitCosyVoiceCustomizedVoiceJobResponseBody build() {
            return new SubmitCosyVoiceCustomizedVoiceJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitCosyVoiceCustomizedVoiceJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitCosyVoiceCustomizedVoiceJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        private Data(Builder builder) {
            this.jobId = builder.jobId;
            this.voiceId = builder.voiceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        public static final class Builder {
            private String jobId; 
            private String voiceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.jobId = model.jobId;
                this.voiceId = model.voiceId;
            } 

            /**
             * <p>The ID of the voice cloning job.</p>
             * 
             * <strong>example:</strong>
             * <p>bfb786c639894f4d80648792021****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The ID of the voice.</p>
             * 
             * <strong>example:</strong>
             * <p>Voice-l*****</p>
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
