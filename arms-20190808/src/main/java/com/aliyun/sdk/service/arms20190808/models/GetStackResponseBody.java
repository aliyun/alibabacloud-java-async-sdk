// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B34C3A43-A901-5F94-9DAD-758CE4******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the method stack.</p>
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

            /**
             * <p>The content of the custom parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>input=254275&amp;</p>
             */
            public Builder info(String info) {
                this.info = info;
                return this;
            }

            /**
             * <p>The type of the custom parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>41</p>
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

        @com.aliyun.core.annotation.NameInMap("CallCount")
        private String callCount;

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
            this.callCount = builder.callCount;
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
         * @return callCount
         */
        public String getCallCount() {
            return this.callCount;
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
            private String callCount; 
            private Long duration; 
            private String exception; 
            private ExtInfo extInfo; 
            private String line; 
            private String rpcId; 
            private String serviceName; 
            private Long startTime; 

            /**
             * <p>The name of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Tomcat Servlet Process</p>
             */
            public Builder api(String api) {
                this.api = api;
                return this;
            }

            /**
             * CallCount.
             */
            public Builder callCount(String callCount) {
                this.callCount = callCount;
                return this;
            }

            /**
             * <p>The duration. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NullPointerException</p>
             */
            public Builder exception(String exception) {
                this.exception = exception;
                return this;
            }

            /**
             * <p>The information about the array object.</p>
             */
            public Builder extInfo(ExtInfo extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * <p>The number of rows in the method stack information.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * <p>The ID of the RPC mode.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder rpcId(String rpcId) {
                this.rpcId = rpcId;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>/com/test</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The start time of the call method.</p>
             * 
             * <strong>example:</strong>
             * <p>1653555396</p>
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
