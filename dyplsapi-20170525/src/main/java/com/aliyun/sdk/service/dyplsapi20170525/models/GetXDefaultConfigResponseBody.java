// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link GetXDefaultConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetXDefaultConfigResponseBody</p>
 */
public class GetXDefaultConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetXDefaultConfigResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetXDefaultConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetXDefaultConfigResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>返回是否成功 true  表示成功 false表示失败</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetXDefaultConfigResponseBody build() {
            return new GetXDefaultConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetXDefaultConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetXDefaultConfigResponseBody</p>
     */
    public static class ReachJson extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallDir")
        private String callDir;

        @com.aliyun.core.annotation.NameInMap("CallStatus")
        private String callStatus;

        @com.aliyun.core.annotation.NameInMap("ReceiveDir")
        private String receiveDir;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("TempId")
        private String tempId;

        private ReachJson(Builder builder) {
            this.callDir = builder.callDir;
            this.callStatus = builder.callStatus;
            this.receiveDir = builder.receiveDir;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
            this.tempId = builder.tempId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReachJson create() {
            return builder().build();
        }

        /**
         * @return callDir
         */
        public String getCallDir() {
            return this.callDir;
        }

        /**
         * @return callStatus
         */
        public String getCallStatus() {
            return this.callStatus;
        }

        /**
         * @return receiveDir
         */
        public String getReceiveDir() {
            return this.receiveDir;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return tempId
         */
        public String getTempId() {
            return this.tempId;
        }

        public static final class Builder {
            private String callDir; 
            private String callStatus; 
            private String receiveDir; 
            private String ruleId; 
            private String ruleName; 
            private String ruleType; 
            private String tempId; 

            private Builder() {
            } 

            private Builder(ReachJson model) {
                this.callDir = model.callDir;
                this.callStatus = model.callStatus;
                this.receiveDir = model.receiveDir;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleType = model.ruleType;
                this.tempId = model.tempId;
            } 

            /**
             * <p>呼叫方向 1:员工B呼叫客户A 2:客户A呼叫员工B</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callDir(String callDir) {
                this.callDir = callDir;
                return this;
            }

            /**
             * <p>通话状态 1:通话振铃 2:接通前 3:接通后 4:通话结束 5:已接通6:未接通</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callStatus(String callStatus) {
                this.callStatus = callStatus;
                return this;
            }

            /**
             * <p>接收方向 1:主叫 2:被叫</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder receiveDir(String receiveDir) {
                this.receiveDir = receiveDir;
                return this;
            }

            /**
             * <p>规则ID</p>
             * 
             * <strong>example:</strong>
             * <p>345</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>规则名称</p>
             * 
             * <strong>example:</strong>
             * <p>企业名片-短信规则</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>规则类型： 1：企业名片-短信 2：企业名片-闪信 3：企业名片-视频 4：企业名片-音频</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>模板ID</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder tempId(String tempId) {
                this.tempId = tempId;
                return this;
            }

            public ReachJson build() {
                return new ReachJson(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetXDefaultConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetXDefaultConfigResponseBody</p>
     */
    public static class SequenceCall extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SequenceCallNoPlayCode")
        private String sequenceCallNoPlayCode;

        @com.aliyun.core.annotation.NameInMap("SequenceCalledNo")
        private String sequenceCalledNo;

        @com.aliyun.core.annotation.NameInMap("SequenceCalledPlayCode")
        private String sequenceCalledPlayCode;

        private SequenceCall(Builder builder) {
            this.sequenceCallNoPlayCode = builder.sequenceCallNoPlayCode;
            this.sequenceCalledNo = builder.sequenceCalledNo;
            this.sequenceCalledPlayCode = builder.sequenceCalledPlayCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SequenceCall create() {
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

            private Builder() {
            } 

            private Builder(SequenceCall model) {
                this.sequenceCallNoPlayCode = model.sequenceCallNoPlayCode;
                this.sequenceCalledNo = model.sequenceCalledNo;
                this.sequenceCalledPlayCode = model.sequenceCalledPlayCode;
            } 

            /**
             * <p>顺振提示音放音编号，格式如callNoPlayCode</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder sequenceCallNoPlayCode(String sequenceCallNoPlayCode) {
                this.sequenceCallNoPlayCode = sequenceCallNoPlayCode;
                return this;
            }

            /**
             * <p>顺振被叫号码</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder sequenceCalledNo(String sequenceCalledNo) {
                this.sequenceCalledNo = sequenceCalledNo;
                return this;
            }

            /**
             * <p>接通后主被叫放音编号，格式如calledPlayCode</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder sequenceCalledPlayCode(String sequenceCalledPlayCode) {
                this.sequenceCalledPlayCode = sequenceCalledPlayCode;
                return this;
            }

            public SequenceCall build() {
                return new SequenceCall(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetXDefaultConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetXDefaultConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallAbility")
        private String callAbility;

        @com.aliyun.core.annotation.NameInMap("GNFlag")
        private String GNFlag;

        @com.aliyun.core.annotation.NameInMap("ReachJson")
        private java.util.List<ReachJson> reachJson;

        @com.aliyun.core.annotation.NameInMap("SequenceCall")
        private java.util.List<SequenceCall> sequenceCall;

        @com.aliyun.core.annotation.NameInMap("SequenceEndTime")
        private String sequenceEndTime;

        @com.aliyun.core.annotation.NameInMap("SequenceStartTime")
        private String sequenceStartTime;

        @com.aliyun.core.annotation.NameInMap("SmsAbility")
        private String smsAbility;

        @com.aliyun.core.annotation.NameInMap("SmsSignMode")
        private String smsSignMode;

        private Data(Builder builder) {
            this.callAbility = builder.callAbility;
            this.GNFlag = builder.GNFlag;
            this.reachJson = builder.reachJson;
            this.sequenceCall = builder.sequenceCall;
            this.sequenceEndTime = builder.sequenceEndTime;
            this.sequenceStartTime = builder.sequenceStartTime;
            this.smsAbility = builder.smsAbility;
            this.smsSignMode = builder.smsSignMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return callAbility
         */
        public String getCallAbility() {
            return this.callAbility;
        }

        /**
         * @return GNFlag
         */
        public String getGNFlag() {
            return this.GNFlag;
        }

        /**
         * @return reachJson
         */
        public java.util.List<ReachJson> getReachJson() {
            return this.reachJson;
        }

        /**
         * @return sequenceCall
         */
        public java.util.List<SequenceCall> getSequenceCall() {
            return this.sequenceCall;
        }

        /**
         * @return sequenceEndTime
         */
        public String getSequenceEndTime() {
            return this.sequenceEndTime;
        }

        /**
         * @return sequenceStartTime
         */
        public String getSequenceStartTime() {
            return this.sequenceStartTime;
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

        public static final class Builder {
            private String callAbility; 
            private String GNFlag; 
            private java.util.List<ReachJson> reachJson; 
            private java.util.List<SequenceCall> sequenceCall; 
            private String sequenceEndTime; 
            private String sequenceStartTime; 
            private String smsAbility; 
            private String smsSignMode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callAbility = model.callAbility;
                this.GNFlag = model.GNFlag;
                this.reachJson = model.reachJson;
                this.sequenceCall = model.sequenceCall;
                this.sequenceEndTime = model.sequenceEndTime;
                this.sequenceStartTime = model.sequenceStartTime;
                this.smsAbility = model.smsAbility;
                this.smsSignMode = model.smsSignMode;
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
             * <p>是否透传来显为真实主叫： 00-非透传：互相拨打时都显示工作号; 10-透传：A客户为主叫时,B员工的来显为客户A号码;B员工为主叫时,A客户的来显为工作号; 默认为 00</p>
             * 
             * <strong>example:</strong>
             * <p>00</p>
             */
            public Builder GNFlag(String GNFlag) {
                this.GNFlag = GNFlag;
                return this;
            }

            /**
             * <p>企业名片规则控制参数</p>
             */
            public Builder reachJson(java.util.List<ReachJson> reachJson) {
                this.reachJson = reachJson;
                return this;
            }

            /**
             * <p>顺振控制参数</p>
             */
            public Builder sequenceCall(java.util.List<SequenceCall> sequenceCall) {
                this.sequenceCall = sequenceCall;
                return this;
            }

            /**
             * <p>顺振结束时间 格式：HH:mm:ss 18:00:00</p>
             * 
             * <strong>example:</strong>
             * <p>09:00:00</p>
             */
            public Builder sequenceEndTime(String sequenceEndTime) {
                this.sequenceEndTime = sequenceEndTime;
                return this;
            }

            /**
             * <p>顺振开启时间 格式：HH:mm:ss 09:00:00</p>
             * 
             * <strong>example:</strong>
             * <p>09:00:00</p>
             */
            public Builder sequenceStartTime(String sequenceStartTime) {
                this.sequenceStartTime = sequenceStartTime;
                return this;
            }

            /**
             * <p>开/关短信功能状态： ‘0’：禁用； ‘1’：开启；</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder smsAbility(String smsAbility) {
                this.smsAbility = smsAbility;
                return this;
            }

            /**
             * <p>是否透传来显为真实主叫： 00-非透传：互相拨打时都显示工作号; 10-透传：A客户为主叫时,B员工的来显为客户A号码;B员工为主叫时,A客户的来显为工作号; 默认为 00</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder smsSignMode(String smsSignMode) {
                this.smsSignMode = smsSignMode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
