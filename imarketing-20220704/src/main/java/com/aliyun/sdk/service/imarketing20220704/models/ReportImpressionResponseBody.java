// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportImpressionResponseBody} extends {@link TeaModel}
 *
 * <p>ReportImpressionResponseBody</p>
 */
public class ReportImpressionResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Ext")
    private java.util.Map < String, String > ext;

    @NameInMap("Header")
    private ReportImpressionResponseBodyHeader header;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private ReportImpressionResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.ext = builder.ext;
        this.header = builder.header;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportImpressionResponseBody create() {
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
    public java.util.Map < String, String > getExt() {
        return this.ext;
    }

    /**
     * @return header
     */
    public ReportImpressionResponseBodyHeader getHeader() {
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
        private java.util.Map < String, String > ext; 
        private ReportImpressionResponseBodyHeader header; 
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
         * ext
         */
        public Builder ext(java.util.Map < String, String > ext) {
            this.ext = ext;
            return this;
        }

        /**
         * header
         */
        public Builder header(ReportImpressionResponseBodyHeader header) {
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

        public ReportImpressionResponseBody build() {
            return new ReportImpressionResponseBody(this);
        } 

    } 

    public static class ReportImpressionResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        private Long costTime;

        @NameInMap("RpcId")
        private String rpcId;

        @NameInMap("TraceId")
        private String traceId;

        @NameInMap("Version")
        private String version;

        private ReportImpressionResponseBodyHeader(Builder builder) {
            this.costTime = builder.costTime;
            this.rpcId = builder.rpcId;
            this.traceId = builder.traceId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportImpressionResponseBodyHeader create() {
            return builder().build();
        }

        /**
         * @return costTime
         */
        public Long getCostTime() {
            return this.costTime;
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

            public ReportImpressionResponseBodyHeader build() {
                return new ReportImpressionResponseBodyHeader(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Bidid")
        private String bidid;

        @NameInMap("Success")
        private Boolean success;

        private Result(Builder builder) {
            this.bidid = builder.bidid;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bidid
         */
        public String getBidid() {
            return this.bidid;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String bidid; 
            private Boolean success; 

            /**
             * Bidid.
             */
            public Builder bidid(String bidid) {
                this.bidid = bidid;
                return this;
            }

            /**
             * success
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
