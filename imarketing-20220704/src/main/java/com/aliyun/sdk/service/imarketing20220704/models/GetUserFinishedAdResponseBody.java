// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserFinishedAdResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserFinishedAdResponseBody</p>
 */
public class GetUserFinishedAdResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Ext")
    private java.util.Map < String, String > ext;

    @NameInMap("Header")
    private GetUserFinishedAdResponseBodyHeader header;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private GetUserFinishedAdResponseBody(Builder builder) {
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

    public static GetUserFinishedAdResponseBody create() {
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
    public GetUserFinishedAdResponseBodyHeader getHeader() {
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
        private GetUserFinishedAdResponseBodyHeader header; 
        private String requestId; 
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
        public Builder ext(java.util.Map < String, String > ext) {
            this.ext = ext;
            return this;
        }

        /**
         * Header.
         */
        public Builder header(GetUserFinishedAdResponseBodyHeader header) {
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUserFinishedAdResponseBody build() {
            return new GetUserFinishedAdResponseBody(this);
        } 

    } 

    public static class GetUserFinishedAdResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        private Long costTime;

        @NameInMap("RpcId")
        private String rpcId;

        @NameInMap("TraceId")
        private String traceId;

        @NameInMap("Version")
        private String version;

        private GetUserFinishedAdResponseBodyHeader(Builder builder) {
            this.costTime = builder.costTime;
            this.rpcId = builder.rpcId;
            this.traceId = builder.traceId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetUserFinishedAdResponseBodyHeader create() {
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
             * CostTime.
             */
            public Builder costTime(Long costTime) {
                this.costTime = costTime;
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

            public GetUserFinishedAdResponseBodyHeader build() {
                return new GetUserFinishedAdResponseBodyHeader(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Commission")
        private String commission;

        @NameInMap("Id")
        private String id;

        @NameInMap("MarketingType")
        private String marketingType;

        @NameInMap("Objective")
        private String objective;

        @NameInMap("Success")
        private Boolean success;

        private Result(Builder builder) {
            this.commission = builder.commission;
            this.id = builder.id;
            this.marketingType = builder.marketingType;
            this.objective = builder.objective;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return commission
         */
        public String getCommission() {
            return this.commission;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return marketingType
         */
        public String getMarketingType() {
            return this.marketingType;
        }

        /**
         * @return objective
         */
        public String getObjective() {
            return this.objective;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String commission; 
            private String id; 
            private String marketingType; 
            private String objective; 
            private Boolean success; 

            /**
             * Commission.
             */
            public Builder commission(String commission) {
                this.commission = commission;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MarketingType.
             */
            public Builder marketingType(String marketingType) {
                this.marketingType = marketingType;
                return this;
            }

            /**
             * Objective.
             */
            public Builder objective(String objective) {
                this.objective = objective;
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
