// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetSecurityCheckBaseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecurityCheckBaseInfoResponseBody</p>
 */
public class GetSecurityCheckBaseInfoResponseBody extends TeaModel {
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

    private GetSecurityCheckBaseInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityCheckBaseInfoResponseBody create() {
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

        private Builder(GetSecurityCheckBaseInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetSecurityCheckBaseInfoResponseBody build() {
            return new GetSecurityCheckBaseInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecurityCheckBaseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityCheckBaseInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("TaskCompleted")
        private Boolean taskCompleted;

        private Data(Builder builder) {
            this.enabled = builder.enabled;
            this.taskCompleted = builder.taskCompleted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return taskCompleted
         */
        public Boolean getTaskCompleted() {
            return this.taskCompleted;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Boolean taskCompleted; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.enabled = model.enabled;
                this.taskCompleted = model.taskCompleted;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * TaskCompleted.
             */
            public Builder taskCompleted(Boolean taskCompleted) {
                this.taskCompleted = taskCompleted;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
