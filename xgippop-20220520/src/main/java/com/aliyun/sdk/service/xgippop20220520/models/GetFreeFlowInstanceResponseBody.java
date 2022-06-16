// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFreeFlowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetFreeFlowInstanceResponseBody</p>
 */
public class GetFreeFlowInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rt")
    private Long rt;

    @NameInMap("Success")
    private Boolean success;

    private GetFreeFlowInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.rt = builder.rt;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFreeFlowInstanceResponseBody create() {
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
    public java.util.List < Data> getData() {
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
     * @return rt
     */
    public Long getRt() {
        return this.rt;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Long rt; 
        private Boolean success; 

        /**
         * 结果码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 结果
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 结果描述
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求链路ID，如POP请求进来的requestId，返回时原样返回
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 服务端处理耗时，ms
         */
        public Builder rt(Long rt) {
            this.rt = rt;
            return this;
        }

        /**
         * 是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetFreeFlowInstanceResponseBody build() {
            return new GetFreeFlowInstanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InstanceMemo")
        private String instanceMemo;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("OpenTime")
        private String openTime;

        @NameInMap("SpecType")
        private String specType;

        @NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.appCode = builder.appCode;
            this.appName = builder.appName;
            this.endTime = builder.endTime;
            this.instanceMemo = builder.instanceMemo;
            this.instanceStatus = builder.instanceStatus;
            this.openTime = builder.openTime;
            this.specType = builder.specType;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceMemo
         */
        public String getInstanceMemo() {
            return this.instanceMemo;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return openTime
         */
        public String getOpenTime() {
            return this.openTime;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String appCode; 
            private String appName; 
            private String endTime; 
            private String instanceMemo; 
            private String instanceStatus; 
            private String openTime; 
            private String specType; 
            private String startTime; 

            /**
             * APP编号
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * APP名称
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * 产品失效时间
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 实例名称
             */
            public Builder instanceMemo(String instanceMemo) {
                this.instanceMemo = instanceMemo;
                return this;
            }

            /**
             * 实例状态
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * 产品开通时间
             */
            public Builder openTime(String openTime) {
                this.openTime = openTime;
                return this;
            }

            /**
             * 规格类型
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * 产品生效时间
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
