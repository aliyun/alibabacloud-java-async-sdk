// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudGetAgentResponseBody} extends {@link TeaModel}
 *
 * <p>CloudGetAgentResponseBody</p>
 */
public class CloudGetAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudGetAgentResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudGetAgentResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudGetAgentResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloudGetAgentResponseBody build() {
            return new CloudGetAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudGetAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetAgentResponseBody</p>
     */
    public static class Agent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Long active;

        @com.aliyun.core.annotation.NameInMap("AgentType")
        private Long agentType;

        @com.aliyun.core.annotation.NameInMap("AreaCode")
        private String areaCode;

        @com.aliyun.core.annotation.NameInMap("AsrCallType")
        private String asrCallType;

        @com.aliyun.core.annotation.NameInMap("BindTel")
        private String bindTel;

        @com.aliyun.core.annotation.NameInMap("BindTelType")
        private Long bindTelType;

        @com.aliyun.core.annotation.NameInMap("CallPower")
        private Long callPower;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private Long enterpriseId;

        @com.aliyun.core.annotation.NameInMap("IbRecord")
        private Long ibRecord;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsAsr")
        private Long isAsr;

        @com.aliyun.core.annotation.NameInMap("IsAxbCall")
        private String isAxbCall;

        @com.aliyun.core.annotation.NameInMap("IsOb")
        private Long isOb;

        @com.aliyun.core.annotation.NameInMap("IsObRemember")
        private String isObRemember;

        @com.aliyun.core.annotation.NameInMap("LoginTime")
        private String loginTime;

        @com.aliyun.core.annotation.NameInMap("MrcpProperty")
        private String mrcpProperty;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObClid")
        private String obClid;

        @com.aliyun.core.annotation.NameInMap("ObClidProperty")
        private String obClidProperty;

        @com.aliyun.core.annotation.NameInMap("ObClidType")
        private Long obClidType;

        @com.aliyun.core.annotation.NameInMap("ObRecord")
        private Long obRecord;

        @com.aliyun.core.annotation.NameInMap("PermitObPreviewTime")
        private String permitObPreviewTime;

        @com.aliyun.core.annotation.NameInMap("Power")
        private Long power;

        @com.aliyun.core.annotation.NameInMap("Property")
        private String property;

        @com.aliyun.core.annotation.NameInMap("QueueList")
        private java.util.List<String> queueList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("WebrtcUrlType")
        private String webrtcUrlType;

        @com.aliyun.core.annotation.NameInMap("Wrapup")
        private Long wrapup;

        private Agent(Builder builder) {
            this.active = builder.active;
            this.agentType = builder.agentType;
            this.areaCode = builder.areaCode;
            this.asrCallType = builder.asrCallType;
            this.bindTel = builder.bindTel;
            this.bindTelType = builder.bindTelType;
            this.callPower = builder.callPower;
            this.cno = builder.cno;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.enterpriseId = builder.enterpriseId;
            this.ibRecord = builder.ibRecord;
            this.id = builder.id;
            this.isAsr = builder.isAsr;
            this.isAxbCall = builder.isAxbCall;
            this.isOb = builder.isOb;
            this.isObRemember = builder.isObRemember;
            this.loginTime = builder.loginTime;
            this.mrcpProperty = builder.mrcpProperty;
            this.name = builder.name;
            this.obClid = builder.obClid;
            this.obClidProperty = builder.obClidProperty;
            this.obClidType = builder.obClidType;
            this.obRecord = builder.obRecord;
            this.permitObPreviewTime = builder.permitObPreviewTime;
            this.power = builder.power;
            this.property = builder.property;
            this.queueList = builder.queueList;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.webrtcUrlType = builder.webrtcUrlType;
            this.wrapup = builder.wrapup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agent create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Long getActive() {
            return this.active;
        }

        /**
         * @return agentType
         */
        public Long getAgentType() {
            return this.agentType;
        }

        /**
         * @return areaCode
         */
        public String getAreaCode() {
            return this.areaCode;
        }

        /**
         * @return asrCallType
         */
        public String getAsrCallType() {
            return this.asrCallType;
        }

        /**
         * @return bindTel
         */
        public String getBindTel() {
            return this.bindTel;
        }

        /**
         * @return bindTelType
         */
        public Long getBindTelType() {
            return this.bindTelType;
        }

        /**
         * @return callPower
         */
        public Long getCallPower() {
            return this.callPower;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enterpriseId
         */
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return ibRecord
         */
        public Long getIbRecord() {
            return this.ibRecord;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isAsr
         */
        public Long getIsAsr() {
            return this.isAsr;
        }

        /**
         * @return isAxbCall
         */
        public String getIsAxbCall() {
            return this.isAxbCall;
        }

        /**
         * @return isOb
         */
        public Long getIsOb() {
            return this.isOb;
        }

        /**
         * @return isObRemember
         */
        public String getIsObRemember() {
            return this.isObRemember;
        }

        /**
         * @return loginTime
         */
        public String getLoginTime() {
            return this.loginTime;
        }

        /**
         * @return mrcpProperty
         */
        public String getMrcpProperty() {
            return this.mrcpProperty;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return obClid
         */
        public String getObClid() {
            return this.obClid;
        }

        /**
         * @return obClidProperty
         */
        public String getObClidProperty() {
            return this.obClidProperty;
        }

        /**
         * @return obClidType
         */
        public Long getObClidType() {
            return this.obClidType;
        }

        /**
         * @return obRecord
         */
        public Long getObRecord() {
            return this.obRecord;
        }

        /**
         * @return permitObPreviewTime
         */
        public String getPermitObPreviewTime() {
            return this.permitObPreviewTime;
        }

        /**
         * @return power
         */
        public Long getPower() {
            return this.power;
        }

        /**
         * @return property
         */
        public String getProperty() {
            return this.property;
        }

        /**
         * @return queueList
         */
        public java.util.List<String> getQueueList() {
            return this.queueList;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return webrtcUrlType
         */
        public String getWebrtcUrlType() {
            return this.webrtcUrlType;
        }

        /**
         * @return wrapup
         */
        public Long getWrapup() {
            return this.wrapup;
        }

        public static final class Builder {
            private Long active; 
            private Long agentType; 
            private String areaCode; 
            private String asrCallType; 
            private String bindTel; 
            private Long bindTelType; 
            private Long callPower; 
            private String cno; 
            private String comment; 
            private String createTime; 
            private Long enterpriseId; 
            private Long ibRecord; 
            private Long id; 
            private Long isAsr; 
            private String isAxbCall; 
            private Long isOb; 
            private String isObRemember; 
            private String loginTime; 
            private String mrcpProperty; 
            private String name; 
            private String obClid; 
            private String obClidProperty; 
            private Long obClidType; 
            private Long obRecord; 
            private String permitObPreviewTime; 
            private Long power; 
            private String property; 
            private java.util.List<String> queueList; 
            private Long status; 
            private String updateTime; 
            private String webrtcUrlType; 
            private Long wrapup; 

            private Builder() {
            } 

            private Builder(Agent model) {
                this.active = model.active;
                this.agentType = model.agentType;
                this.areaCode = model.areaCode;
                this.asrCallType = model.asrCallType;
                this.bindTel = model.bindTel;
                this.bindTelType = model.bindTelType;
                this.callPower = model.callPower;
                this.cno = model.cno;
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.enterpriseId = model.enterpriseId;
                this.ibRecord = model.ibRecord;
                this.id = model.id;
                this.isAsr = model.isAsr;
                this.isAxbCall = model.isAxbCall;
                this.isOb = model.isOb;
                this.isObRemember = model.isObRemember;
                this.loginTime = model.loginTime;
                this.mrcpProperty = model.mrcpProperty;
                this.name = model.name;
                this.obClid = model.obClid;
                this.obClidProperty = model.obClidProperty;
                this.obClidType = model.obClidType;
                this.obRecord = model.obRecord;
                this.permitObPreviewTime = model.permitObPreviewTime;
                this.power = model.power;
                this.property = model.property;
                this.queueList = model.queueList;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.webrtcUrlType = model.webrtcUrlType;
                this.wrapup = model.wrapup;
            } 

            /**
             * <p>是否启用，0：停用，1：启用，默认启用</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder active(Long active) {
                this.active = active;
                return this;
            }

            /**
             * <p>座席类型，1：电话座席，2：电脑座席，默认电话座席</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentType(Long agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>区号格式</p>
             * 
             * <strong>example:</strong>
             * <p>010</p>
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * <p>允许语音识别的通话类型，1:呼入 4：预览外呼 9：主叫外呼 5：预测外呼 2：webcall</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder asrCallType(String asrCallType) {
                this.asrCallType = asrCallType;
                return this;
            }

            /**
             * <p>座席绑定电话</p>
             * 
             * <strong>example:</strong>
             * <p>22223333</p>
             */
            public Builder bindTel(String bindTel) {
                this.bindTel = bindTel;
                return this;
            }

            /**
             * <p>电话类型，1:固话 2:手机 3:分机 4:软电话</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bindTelType(Long bindTelType) {
                this.bindTelType = bindTelType;
                return this;
            }

            /**
             * <p>呼叫权限，0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callPower(Long callPower) {
                this.callPower = callPower;
                return this;
            }

            /**
             * <p>座席工号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>备注</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>创建时间，格式: yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20 10:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>企业编号</p>
             * 
             * <strong>example:</strong>
             * <p>7000002</p>
             */
            public Builder enterpriseId(Long enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>呼入是否录音，0：不录用，1：录音，默认录音</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ibRecord(Long ibRecord) {
                this.ibRecord = ibRecord;
                return this;
            }

            /**
             * <p>座席id</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>是否开启ASR转写：0：不开启，1：开启，默认不开启</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isAsr(Long isAsr) {
                this.isAsr = isAsr;
                return this;
            }

            /**
             * <p>是否允许axb外呼，默认1开启 0关闭</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isAxbCall(String isAxbCall) {
                this.isAxbCall = isAxbCall;
                return this;
            }

            /**
             * <p>是否允许外呼，0：不允许，1：可以，默认允许</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isOb(Long isOb) {
                this.isOb = isOb;
                return this;
            }

            /**
             * <p>外呼主叫记忆 1：开启 0：关闭</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isObRemember(String isObRemember) {
                this.isObRemember = isObRemember;
                return this;
            }

            /**
             * <p>坐席最后一次登陆的时间</p>
             * 
             * <strong>example:</strong>
             * <p>1774821736</p>
             */
            public Builder loginTime(String loginTime) {
                this.loginTime = loginTime;
                return this;
            }

            /**
             * <p>座席axb外呼是否使用mrcp方式推送语音流配置JSON Str格式数据</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder mrcpProperty(String mrcpProperty) {
                this.mrcpProperty = mrcpProperty;
                return this;
            }

            /**
             * <p>座席姓名</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>外显号码</p>
             * 
             * <strong>example:</strong>
             * <p>22223333</p>
             */
            public Builder obClid(String obClid) {
                this.obClid = obClid;
                return this;
            }

            /**
             * <p>外显规则属性，JSON格式</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;isMatchCapital&quot;:0,&quot;areaCodeRule&quot;:1,&quot;isRandom&quot;:1}</p>
             */
            public Builder obClidProperty(String obClidProperty) {
                this.obClidProperty = obClidProperty;
                return this;
            }

            /**
             * <p>外显规则 1：企业默认 2：随机 3：按区号 4：动态外显</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder obClidType(Long obClidType) {
                this.obClidType = obClidType;
                return this;
            }

            /**
             * <p>外呼是否录音，0：不录音，1：录音，默认录音</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder obRecord(Long obRecord) {
                this.obRecord = obRecord;
                return this;
            }

            /**
             * <p>可外呼时间段用,号分割</p>
             * 
             * <strong>example:</strong>
             * <p>08:00,20:00</p>
             */
            public Builder permitObPreviewTime(String permitObPreviewTime) {
                this.permitObPreviewTime = permitObPreviewTime;
                return this;
            }

            /**
             * <p>1：班长席，0：普通座席，默认普通座席</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder power(Long power) {
                this.power = power;
                return this;
            }

            /**
             * <p>座席主动挂机配置Json Str 格式数据 unLink 是否允许主动挂断, 0:关, 1:开，prohibitDuration禁止时长</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * <p>坐席所属队列</p>
             */
            public Builder queueList(java.util.List<String> queueList) {
                this.queueList = queueList;
                return this;
            }

            /**
             * <p>座席状态，0:离线，1：在线</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>更新时间，格式: yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20 10:00:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>webrtc软电话返回地址，0：企业默认 1：公网域名 2：专线域名 3：公网IP 4：专线IP</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder webrtcUrlType(String webrtcUrlType) {
                this.webrtcUrlType = webrtcUrlType;
                return this;
            }

            /**
             * <p>整理时间，秒数，默认10秒</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder wrapup(Long wrapup) {
                this.wrapup = wrapup;
                return this;
            }

            public Agent build() {
                return new Agent(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudGetAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private java.util.List<Agent> agent;

        private Data(Builder builder) {
            this.agent = builder.agent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public java.util.List<Agent> getAgent() {
            return this.agent;
        }

        public static final class Builder {
            private java.util.List<Agent> agent; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agent = model.agent;
            } 

            /**
             * <p>座席列表数组</p>
             */
            public Builder agent(java.util.List<Agent> agent) {
                this.agent = agent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
