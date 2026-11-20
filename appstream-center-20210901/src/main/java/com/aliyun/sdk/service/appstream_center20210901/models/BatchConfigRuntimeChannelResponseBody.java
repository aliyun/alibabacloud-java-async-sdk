// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link BatchConfigRuntimeChannelResponseBody} extends {@link TeaModel}
 *
 * <p>BatchConfigRuntimeChannelResponseBody</p>
 */
public class BatchConfigRuntimeChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private BatchConfigRuntimeChannelResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchConfigRuntimeChannelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(BatchConfigRuntimeChannelResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of batch configuration results. Each channel configuration item corresponds to one result.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of configuration results, which is the same as the number of configuration items in ChannelConfigs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public BatchConfigRuntimeChannelResponseBody build() {
            return new BatchConfigRuntimeChannelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchConfigRuntimeChannelResponseBody} extends {@link TeaModel}
     *
     * <p>BatchConfigRuntimeChannelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RuntimeId")
        private String runtimeId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.code = builder.code;
            this.errorCode = builder.errorCode;
            this.message = builder.message;
            this.runtimeId = builder.runtimeId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return runtimeId
         */
        public String getRuntimeId() {
            return this.runtimeId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private String errorCode; 
            private String message; 
            private String runtimeId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.errorCode = model.errorCode;
                this.message = model.message;
                this.runtimeId = model.runtimeId;
                this.success = model.success;
            } 

            /**
             * <p>The third-party channel code.</p>
             * 
             * <strong>example:</strong>
             * <p>dingtalk-connector</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error code returned when the configuration fails. This parameter is returned only when Success is false.</p>
             * 
             * <strong>example:</strong>
             * <p>ConfigFailed</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned when the configuration fails. This parameter is returned only when Success is false.</p>
             * 
             * <strong>example:</strong>
             * <p>The runtime is not found.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The agent runtime ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-xgads</p>
             */
            public Builder runtimeId(String runtimeId) {
                this.runtimeId = runtimeId;
                return this;
            }

            /**
             * <p>Specifies whether the channel configuration item is configured successfully. Valid values:</p>
             * <ul>
             * <li>true: The configuration is successful.</li>
             * <li>false: The configuration failed. For the cause of the failure, see ErrorCode and Message.</li>
             * </ul>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
