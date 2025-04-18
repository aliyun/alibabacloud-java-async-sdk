// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link IsCompletedResponseBody} extends {@link TeaModel}
 *
 * <p>IsCompletedResponseBody</p>
 */
public class IsCompletedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private IsCompletedResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IsCompletedResponseBody create() {
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

        private Builder(IsCompletedResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public IsCompletedResponseBody build() {
            return new IsCompletedResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IsCompletedResponseBody} extends {@link TeaModel}
     *
     * <p>IsCompletedResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("taskKey")
        private String taskKey;

        @com.aliyun.core.annotation.NameInMap("taskShortResult")
        private String taskShortResult;

        @com.aliyun.core.annotation.NameInMap("taskStatus")
        private String taskStatus;

        private Data(Builder builder) {
            this.modifiedTime = builder.modifiedTime;
            this.taskKey = builder.taskKey;
            this.taskShortResult = builder.taskShortResult;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return taskKey
         */
        public String getTaskKey() {
            return this.taskKey;
        }

        /**
         * @return taskShortResult
         */
        public String getTaskShortResult() {
            return this.taskShortResult;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private Long modifiedTime; 
            private String taskKey; 
            private String taskShortResult; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.modifiedTime = model.modifiedTime;
                this.taskKey = model.taskKey;
                this.taskShortResult = model.taskShortResult;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * <p>Modified time in milliseconds, e.g. 1711438780000.</p>
             * 
             * <strong>example:</strong>
             * <p>1711438780000</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The unique key of this generation task.</p>
             * 
             * <strong>example:</strong>
             * <p>550c2b7b-f2e0-4176-ab0a-53ea4b355721</p>
             */
            public Builder taskKey(String taskKey) {
                this.taskKey = taskKey;
                return this;
            }

            /**
             * <p>Unused temporarily.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder taskShortResult(String taskShortResult) {
                this.taskShortResult = taskShortResult;
                return this;
            }

            /**
             * <p>The status of the report generation task. The possible values are <code>running</code>, <code>success</code>, and <code>error</code>, which mean generating, generating succeeded, and generating failed, respectively. If you encounter a result generation failure, check the model, correct the model, and then generate the result again.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
