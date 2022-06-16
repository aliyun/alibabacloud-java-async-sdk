// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEciConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEciConfigResponseBody</p>
 */
public class DescribeEciConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeEciConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEciConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
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

    public static final class Builder {
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 

        /**
         * code
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * errMsg
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeEciConfigResponseBody build() {
            return new DescribeEciConfigResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AppEnvId")
        private Long appEnvId;

        @NameInMap("EipBandwidth")
        private Integer eipBandwidth;

        @NameInMap("EnableEciSchedulePolicy")
        private Boolean enableEciSchedulePolicy;

        @NameInMap("MirrorCache")
        private Boolean mirrorCache;

        @NameInMap("NormalInstanceLimit")
        private Integer normalInstanceLimit;

        @NameInMap("ScheduleVirtualNode")
        private Boolean scheduleVirtualNode;

        private Result(Builder builder) {
            this.appEnvId = builder.appEnvId;
            this.eipBandwidth = builder.eipBandwidth;
            this.enableEciSchedulePolicy = builder.enableEciSchedulePolicy;
            this.mirrorCache = builder.mirrorCache;
            this.normalInstanceLimit = builder.normalInstanceLimit;
            this.scheduleVirtualNode = builder.scheduleVirtualNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appEnvId
         */
        public Long getAppEnvId() {
            return this.appEnvId;
        }

        /**
         * @return eipBandwidth
         */
        public Integer getEipBandwidth() {
            return this.eipBandwidth;
        }

        /**
         * @return enableEciSchedulePolicy
         */
        public Boolean getEnableEciSchedulePolicy() {
            return this.enableEciSchedulePolicy;
        }

        /**
         * @return mirrorCache
         */
        public Boolean getMirrorCache() {
            return this.mirrorCache;
        }

        /**
         * @return normalInstanceLimit
         */
        public Integer getNormalInstanceLimit() {
            return this.normalInstanceLimit;
        }

        /**
         * @return scheduleVirtualNode
         */
        public Boolean getScheduleVirtualNode() {
            return this.scheduleVirtualNode;
        }

        public static final class Builder {
            private Long appEnvId; 
            private Integer eipBandwidth; 
            private Boolean enableEciSchedulePolicy; 
            private Boolean mirrorCache; 
            private Integer normalInstanceLimit; 
            private Boolean scheduleVirtualNode; 

            /**
             * appEnvId
             */
            public Builder appEnvId(Long appEnvId) {
                this.appEnvId = appEnvId;
                return this;
            }

            /**
             * eipBandwidth
             */
            public Builder eipBandwidth(Integer eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * enableEciSchedulePolicy
             */
            public Builder enableEciSchedulePolicy(Boolean enableEciSchedulePolicy) {
                this.enableEciSchedulePolicy = enableEciSchedulePolicy;
                return this;
            }

            /**
             * mirrorCache
             */
            public Builder mirrorCache(Boolean mirrorCache) {
                this.mirrorCache = mirrorCache;
                return this;
            }

            /**
             * normalInstanceLimit
             */
            public Builder normalInstanceLimit(Integer normalInstanceLimit) {
                this.normalInstanceLimit = normalInstanceLimit;
                return this;
            }

            /**
             * scheduleVirtualNode
             */
            public Builder scheduleVirtualNode(Boolean scheduleVirtualNode) {
                this.scheduleVirtualNode = scheduleVirtualNode;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
