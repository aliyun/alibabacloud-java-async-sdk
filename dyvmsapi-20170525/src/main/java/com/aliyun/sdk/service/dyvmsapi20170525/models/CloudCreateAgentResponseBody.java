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
 * {@link CloudCreateAgentResponseBody} extends {@link TeaModel}
 *
 * <p>CloudCreateAgentResponseBody</p>
 */
public class CloudCreateAgentResponseBody extends TeaModel {
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

    private CloudCreateAgentResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudCreateAgentResponseBody create() {
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

        private Builder(CloudCreateAgentResponseBody model) {
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

        public CloudCreateAgentResponseBody build() {
            return new CloudCreateAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudCreateAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CloudCreateAgentResponseBody</p>
     */
    public static class Agent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private String active;

        @com.aliyun.core.annotation.NameInMap("AreaCode")
        private String areaCode;

        @com.aliyun.core.annotation.NameInMap("BindTel")
        private String bindTel;

        @com.aliyun.core.annotation.NameInMap("BindTelType")
        private String bindTelType;

        @com.aliyun.core.annotation.NameInMap("CallPower")
        private String callPower;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("IbRecord")
        private String ibRecord;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsAsr")
        private String isAsr;

        @com.aliyun.core.annotation.NameInMap("IsOb")
        private String isOb;

        @com.aliyun.core.annotation.NameInMap("IsQualityCheck")
        private String isQualityCheck;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObClid")
        private String obClid;

        @com.aliyun.core.annotation.NameInMap("ObClidProperty")
        private String obClidProperty;

        @com.aliyun.core.annotation.NameInMap("ObClidType")
        private String obClidType;

        @com.aliyun.core.annotation.NameInMap("ObRecord")
        private String obRecord;

        @com.aliyun.core.annotation.NameInMap("Power")
        private String power;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WebrtcUrlType")
        private String webrtcUrlType;

        @com.aliyun.core.annotation.NameInMap("Wrapup")
        private String wrapup;

        private Agent(Builder builder) {
            this.active = builder.active;
            this.areaCode = builder.areaCode;
            this.bindTel = builder.bindTel;
            this.bindTelType = builder.bindTelType;
            this.callPower = builder.callPower;
            this.cno = builder.cno;
            this.createTime = builder.createTime;
            this.enterpriseId = builder.enterpriseId;
            this.ibRecord = builder.ibRecord;
            this.id = builder.id;
            this.isAsr = builder.isAsr;
            this.isOb = builder.isOb;
            this.isQualityCheck = builder.isQualityCheck;
            this.name = builder.name;
            this.obClid = builder.obClid;
            this.obClidProperty = builder.obClidProperty;
            this.obClidType = builder.obClidType;
            this.obRecord = builder.obRecord;
            this.power = builder.power;
            this.status = builder.status;
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
        public String getActive() {
            return this.active;
        }

        /**
         * @return areaCode
         */
        public String getAreaCode() {
            return this.areaCode;
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
        public String getBindTelType() {
            return this.bindTelType;
        }

        /**
         * @return callPower
         */
        public String getCallPower() {
            return this.callPower;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
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
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return ibRecord
         */
        public String getIbRecord() {
            return this.ibRecord;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isAsr
         */
        public String getIsAsr() {
            return this.isAsr;
        }

        /**
         * @return isOb
         */
        public String getIsOb() {
            return this.isOb;
        }

        /**
         * @return isQualityCheck
         */
        public String getIsQualityCheck() {
            return this.isQualityCheck;
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
        public String getObClidType() {
            return this.obClidType;
        }

        /**
         * @return obRecord
         */
        public String getObRecord() {
            return this.obRecord;
        }

        /**
         * @return power
         */
        public String getPower() {
            return this.power;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
        public String getWrapup() {
            return this.wrapup;
        }

        public static final class Builder {
            private String active; 
            private String areaCode; 
            private String bindTel; 
            private String bindTelType; 
            private String callPower; 
            private String cno; 
            private String createTime; 
            private String enterpriseId; 
            private String ibRecord; 
            private String id; 
            private String isAsr; 
            private String isOb; 
            private String isQualityCheck; 
            private String name; 
            private String obClid; 
            private String obClidProperty; 
            private String obClidType; 
            private String obRecord; 
            private String power; 
            private String status; 
            private String webrtcUrlType; 
            private String wrapup; 

            private Builder() {
            } 

            private Builder(Agent model) {
                this.active = model.active;
                this.areaCode = model.areaCode;
                this.bindTel = model.bindTel;
                this.bindTelType = model.bindTelType;
                this.callPower = model.callPower;
                this.cno = model.cno;
                this.createTime = model.createTime;
                this.enterpriseId = model.enterpriseId;
                this.ibRecord = model.ibRecord;
                this.id = model.id;
                this.isAsr = model.isAsr;
                this.isOb = model.isOb;
                this.isQualityCheck = model.isQualityCheck;
                this.name = model.name;
                this.obClid = model.obClid;
                this.obClidProperty = model.obClidProperty;
                this.obClidType = model.obClidType;
                this.obRecord = model.obRecord;
                this.power = model.power;
                this.status = model.status;
                this.webrtcUrlType = model.webrtcUrlType;
                this.wrapup = model.wrapup;
            } 

            /**
             * <p>是否启用，0：停用，1：启用，默认启用</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder active(String active) {
                this.active = active;
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
             * <p>座席绑定电话</p>
             * 
             * <strong>example:</strong>
             * <p>2222333</p>
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
            public Builder bindTelType(String bindTelType) {
                this.bindTelType = bindTelType;
                return this;
            }

            /**
             * <p>呼叫权限，0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callPower(String callPower) {
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
             * <p>创建时间，格式: yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-30 08:00:00</p>
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
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>呼入是否录音，0：不录用，1：录音，默认录音</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ibRecord(String ibRecord) {
                this.ibRecord = ibRecord;
                return this;
            }

            /**
             * <p>座席id</p>
             * 
             * <strong>example:</strong>
             * <p>355</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>是否开启ASR转写：0：不开启，1：开启，默认不开启</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isAsr(String isAsr) {
                this.isAsr = isAsr;
                return this;
            }

            /**
             * <p>是否允许外呼，0：不允许，1：可以，默认允许</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isOb(String isOb) {
                this.isOb = isOb;
                return this;
            }

            /**
             * IsQualityCheck.
             */
            public Builder isQualityCheck(String isQualityCheck) {
                this.isQualityCheck = isQualityCheck;
                return this;
            }

            /**
             * <p>座席姓名</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>外显号码</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxx</p>
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
            public Builder obClidType(String obClidType) {
                this.obClidType = obClidType;
                return this;
            }

            /**
             * <p>外呼是否录音，0：不录音，1：录音，默认录音</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder obRecord(String obRecord) {
                this.obRecord = obRecord;
                return this;
            }

            /**
             * <p>1：班长席，0：普通座席，默认普通座席</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder power(String power) {
                this.power = power;
                return this;
            }

            /**
             * <p>座席状态，0:离线，1：在线</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>webrtc软电话返回地址，0：企业默认 1：公网域名 2：专线域名 3：公网IP 4：专线IP</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder webrtcUrlType(String webrtcUrlType) {
                this.webrtcUrlType = webrtcUrlType;
                return this;
            }

            /**
             * <p>整理时间，秒数，默认10秒</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder wrapup(String wrapup) {
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
     * {@link CloudCreateAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CloudCreateAgentResponseBody</p>
     */
    public static class AgentSkills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("SkillLevel")
        private String skillLevel;

        private AgentSkills(Builder builder) {
            this.agentId = builder.agentId;
            this.cno = builder.cno;
            this.createTime = builder.createTime;
            this.enterpriseId = builder.enterpriseId;
            this.id = builder.id;
            this.skillId = builder.skillId;
            this.skillLevel = builder.skillLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentSkills create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
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
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        /**
         * @return skillLevel
         */
        public String getSkillLevel() {
            return this.skillLevel;
        }

        public static final class Builder {
            private String agentId; 
            private String cno; 
            private String createTime; 
            private String enterpriseId; 
            private String id; 
            private String skillId; 
            private String skillLevel; 

            private Builder() {
            } 

            private Builder(AgentSkills model) {
                this.agentId = model.agentId;
                this.cno = model.cno;
                this.createTime = model.createTime;
                this.enterpriseId = model.enterpriseId;
                this.id = model.id;
                this.skillId = model.skillId;
                this.skillLevel = model.skillLevel;
            } 

            /**
             * <p>座席id</p>
             * 
             * <strong>example:</strong>
             * <p>2333</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
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
             * <p>创建时间，格式: yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-30 08:00:00</p>
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
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>queueSkill关系表中id</p>
             * 
             * <strong>example:</strong>
             * <p>355</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>skill的id</p>
             * 
             * <strong>example:</strong>
             * <p>233</p>
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>技能值</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder skillLevel(String skillLevel) {
                this.skillLevel = skillLevel;
                return this;
            }

            public AgentSkills build() {
                return new AgentSkills(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudCreateAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CloudCreateAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private Agent agent;

        @com.aliyun.core.annotation.NameInMap("AgentSkills")
        private java.util.List<AgentSkills> agentSkills;

        private Data(Builder builder) {
            this.agent = builder.agent;
            this.agentSkills = builder.agentSkills;
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
        public Agent getAgent() {
            return this.agent;
        }

        /**
         * @return agentSkills
         */
        public java.util.List<AgentSkills> getAgentSkills() {
            return this.agentSkills;
        }

        public static final class Builder {
            private Agent agent; 
            private java.util.List<AgentSkills> agentSkills; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agent = model.agent;
                this.agentSkills = model.agentSkills;
            } 

            /**
             * <p>座席配置信息</p>
             */
            public Builder agent(Agent agent) {
                this.agent = agent;
                return this;
            }

            /**
             * <p>座席所需技能数组</p>
             */
            public Builder agentSkills(java.util.List<AgentSkills> agentSkills) {
                this.agentSkills = agentSkills;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
