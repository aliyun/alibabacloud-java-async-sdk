// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link ListRobotNodeResponseBody} extends {@link TeaModel}
 *
 * <p>ListRobotNodeResponseBody</p>
 */
public class ListRobotNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRobotNodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRobotNodeResponseBody create() {
        return builder().build();
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(java.util.List<Data> data) {
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

        public ListRobotNodeResponseBody build() {
            return new ListRobotNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRobotNodeResponseBody} extends {@link TeaModel}
     *
     * <p>ListRobotNodeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsOutput")
        private Integer isOutput;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("NodeIdentifier")
        private String nodeIdentifier;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        private Data(Builder builder) {
            this.isOutput = builder.isOutput;
            this.modelName = builder.modelName;
            this.nodeIdentifier = builder.nodeIdentifier;
            this.nodeName = builder.nodeName;
            this.processName = builder.processName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isOutput
         */
        public Integer getIsOutput() {
            return this.isOutput;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return nodeIdentifier
         */
        public String getNodeIdentifier() {
            return this.nodeIdentifier;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        public static final class Builder {
            private Integer isOutput; 
            private String modelName; 
            private String nodeIdentifier; 
            private String nodeName; 
            private String processName; 

            /**
             * IsOutput.
             */
            public Builder isOutput(Integer isOutput) {
                this.isOutput = isOutput;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * NodeIdentifier.
             */
            public Builder nodeIdentifier(String nodeIdentifier) {
                this.nodeIdentifier = nodeIdentifier;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * ProcessName.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
