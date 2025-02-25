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
 * {@link DeleteAvatarTrainingJobResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAvatarTrainingJobResponseBody</p>
 */
public class DeleteAvatarTrainingJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteAvatarTrainingJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAvatarTrainingJobResponseBody create() {
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
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteAvatarTrainingJobResponseBody build() {
            return new DeleteAvatarTrainingJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteAvatarTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteAvatarTrainingJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        private Data(Builder builder) {
            this.jobId = builder.jobId;
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

        public static final class Builder {
            private String jobId; 

            /**
             * <p>The ID of the digital human training job.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>d718e2ff4f018ccf419a7b71</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
