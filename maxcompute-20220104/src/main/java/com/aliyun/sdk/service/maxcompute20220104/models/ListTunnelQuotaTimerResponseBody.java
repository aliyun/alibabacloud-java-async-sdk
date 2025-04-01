// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListTunnelQuotaTimerResponseBody} extends {@link TeaModel}
 *
 * <p>ListTunnelQuotaTimerResponseBody</p>
 */
public class ListTunnelQuotaTimerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListTunnelQuotaTimerResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTunnelQuotaTimerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListTunnelQuotaTimerResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OBJECT_NOT_EXIST</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>This object does not exist.</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>1xx: informational response. The request is received and is being processed.</li>
         * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
         * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
         * <li>4xx: client error. The request contains invalid request parameters or syntaxes, or specific request conditions cannot be met.</li>
         * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0be3e0b716671885050924814e3623</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTunnelQuotaTimerResponseBody build() {
            return new ListTunnelQuotaTimerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTunnelQuotaTimerResponseBody} extends {@link TeaModel}
     *
     * <p>ListTunnelQuotaTimerResponseBody</p>
     */
    public static class TunnelQuotaParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("elasticReservedSlotNum")
        private Long elasticReservedSlotNum;

        @com.aliyun.core.annotation.NameInMap("slotNum")
        private Long slotNum;

        private TunnelQuotaParameter(Builder builder) {
            this.elasticReservedSlotNum = builder.elasticReservedSlotNum;
            this.slotNum = builder.slotNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelQuotaParameter create() {
            return builder().build();
        }

        /**
         * @return elasticReservedSlotNum
         */
        public Long getElasticReservedSlotNum() {
            return this.elasticReservedSlotNum;
        }

        /**
         * @return slotNum
         */
        public Long getSlotNum() {
            return this.slotNum;
        }

        public static final class Builder {
            private Long elasticReservedSlotNum; 
            private Long slotNum; 

            private Builder() {
            } 

            private Builder(TunnelQuotaParameter model) {
                this.elasticReservedSlotNum = model.elasticReservedSlotNum;
                this.slotNum = model.slotNum;
            } 

            /**
             * <p>The number of elastically reserved slots.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder elasticReservedSlotNum(Long elasticReservedSlotNum) {
                this.elasticReservedSlotNum = elasticReservedSlotNum;
                return this;
            }

            /**
             * <p>The number of reserved slots.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder slotNum(Long slotNum) {
                this.slotNum = slotNum;
                return this;
            }

            public TunnelQuotaParameter build() {
                return new TunnelQuotaParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTunnelQuotaTimerResponseBody} extends {@link TeaModel}
     *
     * <p>ListTunnelQuotaTimerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("beginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("tunnelQuotaParameter")
        private TunnelQuotaParameter tunnelQuotaParameter;

        private Data(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.timezone = builder.timezone;
            this.tunnelQuotaParameter = builder.tunnelQuotaParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return tunnelQuotaParameter
         */
        public TunnelQuotaParameter getTunnelQuotaParameter() {
            return this.tunnelQuotaParameter;
        }

        public static final class Builder {
            private String beginTime; 
            private String endTime; 
            private String timezone; 
            private TunnelQuotaParameter tunnelQuotaParameter; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.beginTime = model.beginTime;
                this.endTime = model.endTime;
                this.timezone = model.timezone;
                this.tunnelQuotaParameter = model.tunnelQuotaParameter;
            } 

            /**
             * <p>The start time of the time-specific configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The end time of the time-specific configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time zone property for the time-specific configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The parameters for the time-specific configuration.</p>
             */
            public Builder tunnelQuotaParameter(TunnelQuotaParameter tunnelQuotaParameter) {
                this.tunnelQuotaParameter = tunnelQuotaParameter;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
