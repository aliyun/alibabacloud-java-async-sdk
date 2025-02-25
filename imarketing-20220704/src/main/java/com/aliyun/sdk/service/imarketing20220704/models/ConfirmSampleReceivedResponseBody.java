// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmSampleReceivedResponseBody} extends {@link TeaModel}
 *
 * <p>ConfirmSampleReceivedResponseBody</p>
 */
public class ConfirmSampleReceivedResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Ext")
    private java.util.Map < String, ? > ext;

    @NameInMap("Header")
    private ConfirmSampleReceivedResponseBodyHeader header;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private ConfirmSampleReceivedResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.ext = builder.ext;
        this.header = builder.header;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmSampleReceivedResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return ext
     */
    public java.util.Map < String, ? > getExt() {
        return this.ext;
    }

    /**
     * @return header
     */
    public ConfirmSampleReceivedResponseBodyHeader getHeader() {
        return this.header;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private java.util.Map < String, ? > ext; 
        private ConfirmSampleReceivedResponseBodyHeader header; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Ext.
         */
        public Builder ext(java.util.Map < String, ? > ext) {
            this.ext = ext;
            return this;
        }

        /**
         * Header.
         */
        public Builder header(ConfirmSampleReceivedResponseBodyHeader header) {
            this.header = header;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ConfirmSampleReceivedResponseBody build() {
            return new ConfirmSampleReceivedResponseBody(this);
        } 

    } 

    public static class ConfirmSampleReceivedResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        private Long costTime;

        @NameInMap("InnerErrorCode")
        private String innerErrorCode;

        @NameInMap("InnerErrorMsg")
        private String innerErrorMsg;

        @NameInMap("RpcId")
        private String rpcId;

        @NameInMap("TraceId")
        private String traceId;

        @NameInMap("Version")
        private String version;

        private ConfirmSampleReceivedResponseBodyHeader(Builder builder) {
            this.costTime = builder.costTime;
            this.innerErrorCode = builder.innerErrorCode;
            this.innerErrorMsg = builder.innerErrorMsg;
            this.rpcId = builder.rpcId;
            this.traceId = builder.traceId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfirmSampleReceivedResponseBodyHeader create() {
            return builder().build();
        }

        /**
         * @return costTime
         */
        public Long getCostTime() {
            return this.costTime;
        }

        /**
         * @return innerErrorCode
         */
        public String getInnerErrorCode() {
            return this.innerErrorCode;
        }

        /**
         * @return innerErrorMsg
         */
        public String getInnerErrorMsg() {
            return this.innerErrorMsg;
        }

        /**
         * @return rpcId
         */
        public String getRpcId() {
            return this.rpcId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long costTime; 
            private String innerErrorCode; 
            private String innerErrorMsg; 
            private String rpcId; 
            private String traceId; 
            private String version; 

            /**
             * CostTime.
             */
            public Builder costTime(Long costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * InnerErrorCode.
             */
            public Builder innerErrorCode(String innerErrorCode) {
                this.innerErrorCode = innerErrorCode;
                return this;
            }

            /**
             * InnerErrorMsg.
             */
            public Builder innerErrorMsg(String innerErrorMsg) {
                this.innerErrorMsg = innerErrorMsg;
                return this;
            }

            /**
             * RPC ID
             */
            public Builder rpcId(String rpcId) {
                this.rpcId = rpcId;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ConfirmSampleReceivedResponseBodyHeader build() {
                return new ConfirmSampleReceivedResponseBodyHeader(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("Success")
        private Boolean success;

        private Result(Builder builder) {
            this.requestId = builder.requestId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
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
            private String requestId; 
            private Boolean success; 

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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
