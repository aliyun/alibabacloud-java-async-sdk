// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetXConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetXConfigResponseBody</p>
 */
public class GetXConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("CallAbility")
    private String callAbility;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GNFlag")
    private String GNFlag;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("SequenceCalls")
    private java.util.List < SequenceCalls> sequenceCalls;

    @com.aliyun.core.annotation.NameInMap("SequenceMode")
    private String sequenceMode;

    @com.aliyun.core.annotation.NameInMap("SmsAbility")
    private String smsAbility;

    @com.aliyun.core.annotation.NameInMap("SmsSignMode")
    private String smsSignMode;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TelX")
    private String telX;

    private GetXConfigResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.callAbility = builder.callAbility;
        this.code = builder.code;
        this.GNFlag = builder.GNFlag;
        this.message = builder.message;
        this.sequenceCalls = builder.sequenceCalls;
        this.sequenceMode = builder.sequenceMode;
        this.smsAbility = builder.smsAbility;
        this.smsSignMode = builder.smsSignMode;
        this.success = builder.success;
        this.telX = builder.telX;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetXConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return callAbility
     */
    public String getCallAbility() {
        return this.callAbility;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return GNFlag
     */
    public String getGNFlag() {
        return this.GNFlag;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return sequenceCalls
     */
    public java.util.List < SequenceCalls> getSequenceCalls() {
        return this.sequenceCalls;
    }

    /**
     * @return sequenceMode
     */
    public String getSequenceMode() {
        return this.sequenceMode;
    }

    /**
     * @return smsAbility
     */
    public String getSmsAbility() {
        return this.smsAbility;
    }

    /**
     * @return smsSignMode
     */
    public String getSmsSignMode() {
        return this.smsSignMode;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return telX
     */
    public String getTelX() {
        return this.telX;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String callAbility; 
        private String code; 
        private String GNFlag; 
        private String message; 
        private java.util.List < SequenceCalls> sequenceCalls; 
        private String sequenceMode; 
        private String smsAbility; 
        private String smsSignMode; 
        private Boolean success; 
        private String telX; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>开/关呼叫能力状态： ‘0’：禁用； ‘1’：开启；</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder callAbility(String callAbility) {
            this.callAbility = callAbility;
            return this;
        }

        /**
         * <p>返回状态码 0000表示成功 其他表示失败</p>
         * 
         * <strong>example:</strong>
         * <p>0000</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>是否透传来显为真实主叫： 00-非透传：互相拨打时都显示工作号; 10-透传：A客户为主叫时,B员工的来显为客户A号码;B员工为主叫时,A客户的来显为工作号; 默认为 00</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder GNFlag(String GNFlag) {
            this.GNFlag = GNFlag;
            return this;
        }

        /**
         * <p>返回信息</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>顺振控制参数</p>
         */
        public Builder sequenceCalls(java.util.List < SequenceCalls> sequenceCalls) {
            this.sequenceCalls = sequenceCalls;
            return this;
        }

        /**
         * <p>顺振模式： 0-不顺振（默认） 1-有条件顺振，先接续calledNo指定被叫，如果该被叫未能接通，再顺振sequenceCalls号码列表 2-无条件顺振，不接续calledNo指定被叫，直接顺振sequenceCalls号码列表</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sequenceMode(String sequenceMode) {
            this.sequenceMode = sequenceMode;
            return this;
        }

        /**
         * <p>开/关短信功能状态： ‘0’：禁用；‘1’：开启；</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder smsAbility(String smsAbility) {
            this.smsAbility = smsAbility;
            return this;
        }

        /**
         * <p>是否透传来显为真实用户 0：不透传; 1：透传 默认：0不透传</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder smsSignMode(String smsSignMode) {
            this.smsSignMode = smsSignMode;
            return this;
        }

        /**
         * <p>返回是否成功 true  表示成功 false表示失败</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>X号码</p>
         * 
         * <strong>example:</strong>
         * <p>17*******22</p>
         */
        public Builder telX(String telX) {
            this.telX = telX;
            return this;
        }

        public GetXConfigResponseBody build() {
            return new GetXConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetXConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetXConfigResponseBody</p>
     */
    public static class SequenceCalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SequenceCallNoPlayCode")
        private String sequenceCallNoPlayCode;

        @com.aliyun.core.annotation.NameInMap("SequenceCalledNo")
        private String sequenceCalledNo;

        @com.aliyun.core.annotation.NameInMap("SequenceCalledPlayCode")
        private String sequenceCalledPlayCode;

        private SequenceCalls(Builder builder) {
            this.sequenceCallNoPlayCode = builder.sequenceCallNoPlayCode;
            this.sequenceCalledNo = builder.sequenceCalledNo;
            this.sequenceCalledPlayCode = builder.sequenceCalledPlayCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SequenceCalls create() {
            return builder().build();
        }

        /**
         * @return sequenceCallNoPlayCode
         */
        public String getSequenceCallNoPlayCode() {
            return this.sequenceCallNoPlayCode;
        }

        /**
         * @return sequenceCalledNo
         */
        public String getSequenceCalledNo() {
            return this.sequenceCalledNo;
        }

        /**
         * @return sequenceCalledPlayCode
         */
        public String getSequenceCalledPlayCode() {
            return this.sequenceCalledPlayCode;
        }

        public static final class Builder {
            private String sequenceCallNoPlayCode; 
            private String sequenceCalledNo; 
            private String sequenceCalledPlayCode; 

            /**
             * <p>顺振提示音放音编号，格式如callNoPlayCode</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder sequenceCallNoPlayCode(String sequenceCallNoPlayCode) {
                this.sequenceCallNoPlayCode = sequenceCallNoPlayCode;
                return this;
            }

            /**
             * <p>顺振被叫号码</p>
             * 
             * <strong>example:</strong>
             * <p>18*******33</p>
             */
            public Builder sequenceCalledNo(String sequenceCalledNo) {
                this.sequenceCalledNo = sequenceCalledNo;
                return this;
            }

            /**
             * <p>接通后主被叫放音编号，格式如calledPlayCode</p>
             * 
             * <strong>example:</strong>
             * <p>02</p>
             */
            public Builder sequenceCalledPlayCode(String sequenceCalledPlayCode) {
                this.sequenceCalledPlayCode = sequenceCalledPlayCode;
                return this;
            }

            public SequenceCalls build() {
                return new SequenceCalls(this);
            } 

        } 

    }
}
