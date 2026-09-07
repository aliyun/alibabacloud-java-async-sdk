// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link UpdateSyncQualityCheckDataResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSyncQualityCheckDataResponseBody</p>
 */
public class UpdateSyncQualityCheckDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateSyncQualityCheckDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSyncQualityCheckDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateSyncQualityCheckDataResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The Result code. A value of 200 indicates Succeeded. Any other value indicates failed. The API caller can determine the cause of failure based on this field.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The complete response Content.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Details of the error when an error occurs; &quot;successful&quot; when the operation succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is the UUID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>76DB5D8C-5BD9-42A7-B527-5AF3A5F8***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the Request succeeded. The API caller can use this field to determine whether the Request succeeded: true indicates success; false or null indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateSyncQualityCheckDataResponseBody build() {
            return new UpdateSyncQualityCheckDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSyncQualityCheckDataResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateSyncQualityCheckDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Tid")
        private String tid;

        private Data(Builder builder) {
            this.taskId = builder.taskId;
            this.tid = builder.tid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return tid
         */
        public String getTid() {
            return this.tid;
        }

        public static final class Builder {
            private String taskId; 
            private String tid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.taskId = model.taskId;
                this.tid = model.tid;
            } 

            /**
             * <p>The Job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123123D8C-5BD9-42A7-B527-1235F8**</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The UUID of the call.</p>
             * 
             * <strong>example:</strong>
             * <p>20210101-1212121***</p>
             */
            public Builder tid(String tid) {
                this.tid = tid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
