// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MonthBillGetResponseBody} extends {@link TeaModel}
 *
 * <p>MonthBillGetResponseBody</p>
 */
public class MonthBillGetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("module")
    private java.util.List < Module> module;

    @NameInMap("result_code")
    private Integer resultCode;

    @NameInMap("result_msg")
    private String resultMsg;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private MonthBillGetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.module = builder.module;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonthBillGetResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return module
     */
    public java.util.List < Module> getModule() {
        return this.module;
    }

    /**
     * @return resultCode
     */
    public Integer getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Module> module; 
        private Integer resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 返回值，服务端返回，没有结果或发生异常都返回空
         */
        public Builder module(java.util.List < Module> module) {
            this.module = module;
            return this;
        }

        /**
         * 结果代码
         */
        public Builder resultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * 备注，结果的备注，如对结果的说明
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * 成功标识，由服务端设置，发生异常时为false。结果为null设置为false。
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public MonthBillGetResponseBody build() {
            return new MonthBillGetResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("end_date")
        private String endDate;

        @NameInMap("start_date")
        private String startDate;

        @NameInMap("url")
        private String url;

        private Module(Builder builder) {
            this.endDate = builder.endDate;
            this.startDate = builder.startDate;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String endDate; 
            private String startDate; 
            private String url; 

            /**
             * 结束时间
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * 开始时间
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * 数据地址
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
