// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAdvertisingForE2ResponseBody} extends {@link TeaModel}
 *
 * <p>GetAdvertisingForE2ResponseBody</p>
 */
public class GetAdvertisingForE2ResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Header")
    private GetAdvertisingForE2ResponseBodyHeader header;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private GetAdvertisingForE2ResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.header = builder.header;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdvertisingForE2ResponseBody create() {
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
     * @return header
     */
    public GetAdvertisingForE2ResponseBodyHeader getHeader() {
        return this.header;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private GetAdvertisingForE2ResponseBodyHeader header; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * errorCode
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * header
         */
        public Builder header(GetAdvertisingForE2ResponseBodyHeader header) {
            this.header = header;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAdvertisingForE2ResponseBody build() {
            return new GetAdvertisingForE2ResponseBody(this);
        } 

    } 

    public static class GetAdvertisingForE2ResponseBodyHeader extends TeaModel {
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

        private GetAdvertisingForE2ResponseBodyHeader(Builder builder) {
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

        public static GetAdvertisingForE2ResponseBodyHeader create() {
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
             * costTime
             */
            public Builder costTime(Long costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * innerErrorCode
             */
            public Builder innerErrorCode(String innerErrorCode) {
                this.innerErrorCode = innerErrorCode;
                return this;
            }

            /**
             * innerErrorMsg
             */
            public Builder innerErrorMsg(String innerErrorMsg) {
                this.innerErrorMsg = innerErrorMsg;
                return this;
            }

            /**
             * rpcId
             */
            public Builder rpcId(String rpcId) {
                this.rpcId = rpcId;
                return this;
            }

            /**
             * traceId
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * version
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public GetAdvertisingForE2ResponseBodyHeader build() {
                return new GetAdvertisingForE2ResponseBodyHeader(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("ImgUrl")
        private String imgUrl;

        @NameInMap("TargetUrl")
        private String targetUrl;

        private Result(Builder builder) {
            this.imgUrl = builder.imgUrl;
            this.targetUrl = builder.targetUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return imgUrl
         */
        public String getImgUrl() {
            return this.imgUrl;
        }

        /**
         * @return targetUrl
         */
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public static final class Builder {
            private String imgUrl; 
            private String targetUrl; 

            /**
             * ImgUrl.
             */
            public Builder imgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
                return this;
            }

            /**
             * TargetUrl.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
