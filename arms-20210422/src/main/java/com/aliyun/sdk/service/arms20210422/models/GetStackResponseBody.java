// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link GetStackResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackResponseBody</p>
 */
public class GetStackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackInfo")
    private java.util.List<StackInfo> stackInfo;

    private GetStackResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackInfo = builder.stackInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackInfo
     */
    public java.util.List<StackInfo> getStackInfo() {
        return this.stackInfo;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StackInfo> stackInfo; 

        private Builder() {
        } 

        private Builder(GetStackResponseBody model) {
            this.requestId = model.requestId;
            this.stackInfo = model.stackInfo;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StackInfo.
         */
        public Builder stackInfo(java.util.List<StackInfo> stackInfo) {
            this.stackInfo = stackInfo;
            return this;
        }

        public GetStackResponseBody build() {
            return new GetStackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
     */
    public static class ExtInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Info")
        private String info;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ExtInfo(Builder builder) {
            this.info = builder.info;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtInfo create() {
            return builder().build();
        }

        /**
         * @return info
         */
        public String getInfo() {
            return this.info;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String info; 
            private String type; 

            private Builder() {
            } 

            private Builder(ExtInfo model) {
                this.info = model.info;
                this.type = model.type;
            } 

            /**
             * Info.
             */
            public Builder info(String info) {
                this.info = info;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ExtInfo build() {
                return new ExtInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
     */
    public static class StackInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Api")
        private String api;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Exception")
        private String exception;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private ExtInfo extInfo;

        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        @com.aliyun.core.annotation.NameInMap("RpcId")
        private String rpcId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private StackInfo(Builder builder) {
            this.api = builder.api;
            this.duration = builder.duration;
            this.exception = builder.exception;
            this.extInfo = builder.extInfo;
            this.line = builder.line;
            this.rpcId = builder.rpcId;
            this.serviceName = builder.serviceName;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackInfo create() {
            return builder().build();
        }

        /**
         * @return api
         */
        public String getApi() {
            return this.api;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return exception
         */
        public String getException() {
            return this.exception;
        }

        /**
         * @return extInfo
         */
        public ExtInfo getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        /**
         * @return rpcId
         */
        public String getRpcId() {
            return this.rpcId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String api; 
            private Long duration; 
            private String exception; 
            private ExtInfo extInfo; 
            private String line; 
            private String rpcId; 
            private String serviceName; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(StackInfo model) {
                this.api = model.api;
                this.duration = model.duration;
                this.exception = model.exception;
                this.extInfo = model.extInfo;
                this.line = model.line;
                this.rpcId = model.rpcId;
                this.serviceName = model.serviceName;
                this.startTime = model.startTime;
            } 

            /**
             * Api.
             */
            public Builder api(String api) {
                this.api = api;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Exception.
             */
            public Builder exception(String exception) {
                this.exception = exception;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(ExtInfo extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * Line.
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * RpcId.
             */
            public Builder rpcId(String rpcId) {
                this.rpcId = rpcId;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public StackInfo build() {
                return new StackInfo(this);
            } 

        } 

    }
}
