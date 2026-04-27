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
 * {@link CloudQueryAgentResponseBody} extends {@link TeaModel}
 *
 * <p>CloudQueryAgentResponseBody</p>
 */
public class CloudQueryAgentResponseBody extends TeaModel {
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

    private CloudQueryAgentResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudQueryAgentResponseBody create() {
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

        private Builder(CloudQueryAgentResponseBody model) {
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

        public CloudQueryAgentResponseBody build() {
            return new CloudQueryAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudQueryAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryAgentResponseBody</p>
     */
    public static class Agent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private String active;

        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

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
            this.agentType = builder.agentType;
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
         * @return agentType
         */
        public String getAgentType() {
            return this.agentType;
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
            private String agentType; 
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
                this.agentType = model.agentType;
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
             * <p>座席类型，1：电话座席，2：电脑座席，默认电话座席</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentType(String agentType) {
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
             * <p>座席绑定电话</p>
             * 
             * <strong>example:</strong>
             * <p>41008502</p>
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
             * <p>133</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>是否开启ASR转写：0：不开启，1：开启，默认不开启</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>name1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>外显号码</p>
             * 
             * <strong>example:</strong>
             * <p>41008502</p>
             */
            public Builder obClid(String obClid) {
                this.obClid = obClid;
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
             * <p>1</p>
             */
            public Builder power(String power) {
                this.power = power;
                return this;
            }

            /**
             * <p>座席状态，0:离线，1：在线</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
     * {@link CloudQueryAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryAgentResponseBody</p>
     */
    public static class QueueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnouncePosition")
        private Long announcePosition;

        @com.aliyun.core.annotation.NameInMap("AnnouncePositionFrequency")
        private Long announcePositionFrequency;

        @com.aliyun.core.annotation.NameInMap("AnnouncePositionParam")
        private Long announcePositionParam;

        @com.aliyun.core.annotation.NameInMap("AnnouncePositionYouarenext")
        private Long announcePositionYouarenext;

        @com.aliyun.core.annotation.NameInMap("AnnounceSound")
        private Long announceSound;

        @com.aliyun.core.annotation.NameInMap("AnnounceSoundFile")
        private String announceSoundFile;

        @com.aliyun.core.annotation.NameInMap("AnnounceSoundFrequency")
        private Long announceSoundFrequency;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private Long enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("JoinEmpty")
        private Long joinEmpty;

        @com.aliyun.core.annotation.NameInMap("MaxLen")
        private Long maxLen;

        @com.aliyun.core.annotation.NameInMap("MemberTimeout")
        private Long memberTimeout;

        @com.aliyun.core.annotation.NameInMap("MusicClass")
        private String musicClass;

        @com.aliyun.core.annotation.NameInMap("Qno")
        private String qno;

        @com.aliyun.core.annotation.NameInMap("QueueTimeout")
        private Long queueTimeout;

        @com.aliyun.core.annotation.NameInMap("Retry")
        private Long retry;

        @com.aliyun.core.annotation.NameInMap("SayAgentno")
        private Boolean sayAgentno;

        @com.aliyun.core.annotation.NameInMap("ServiceLevel")
        private Long serviceLevel;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private String strategy;

        @com.aliyun.core.annotation.NameInMap("VipSupport")
        private Long vipSupport;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Long weight;

        @com.aliyun.core.annotation.NameInMap("WrapupTime")
        private Long wrapupTime;

        private QueueList(Builder builder) {
            this.announcePosition = builder.announcePosition;
            this.announcePositionFrequency = builder.announcePositionFrequency;
            this.announcePositionParam = builder.announcePositionParam;
            this.announcePositionYouarenext = builder.announcePositionYouarenext;
            this.announceSound = builder.announceSound;
            this.announceSoundFile = builder.announceSoundFile;
            this.announceSoundFrequency = builder.announceSoundFrequency;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.enterpriseId = builder.enterpriseId;
            this.id = builder.id;
            this.joinEmpty = builder.joinEmpty;
            this.maxLen = builder.maxLen;
            this.memberTimeout = builder.memberTimeout;
            this.musicClass = builder.musicClass;
            this.qno = builder.qno;
            this.queueTimeout = builder.queueTimeout;
            this.retry = builder.retry;
            this.sayAgentno = builder.sayAgentno;
            this.serviceLevel = builder.serviceLevel;
            this.strategy = builder.strategy;
            this.vipSupport = builder.vipSupport;
            this.weight = builder.weight;
            this.wrapupTime = builder.wrapupTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueList create() {
            return builder().build();
        }

        /**
         * @return announcePosition
         */
        public Long getAnnouncePosition() {
            return this.announcePosition;
        }

        /**
         * @return announcePositionFrequency
         */
        public Long getAnnouncePositionFrequency() {
            return this.announcePositionFrequency;
        }

        /**
         * @return announcePositionParam
         */
        public Long getAnnouncePositionParam() {
            return this.announcePositionParam;
        }

        /**
         * @return announcePositionYouarenext
         */
        public Long getAnnouncePositionYouarenext() {
            return this.announcePositionYouarenext;
        }

        /**
         * @return announceSound
         */
        public Long getAnnounceSound() {
            return this.announceSound;
        }

        /**
         * @return announceSoundFile
         */
        public String getAnnounceSoundFile() {
            return this.announceSoundFile;
        }

        /**
         * @return announceSoundFrequency
         */
        public Long getAnnounceSoundFrequency() {
            return this.announceSoundFrequency;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enterpriseId
         */
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return joinEmpty
         */
        public Long getJoinEmpty() {
            return this.joinEmpty;
        }

        /**
         * @return maxLen
         */
        public Long getMaxLen() {
            return this.maxLen;
        }

        /**
         * @return memberTimeout
         */
        public Long getMemberTimeout() {
            return this.memberTimeout;
        }

        /**
         * @return musicClass
         */
        public String getMusicClass() {
            return this.musicClass;
        }

        /**
         * @return qno
         */
        public String getQno() {
            return this.qno;
        }

        /**
         * @return queueTimeout
         */
        public Long getQueueTimeout() {
            return this.queueTimeout;
        }

        /**
         * @return retry
         */
        public Long getRetry() {
            return this.retry;
        }

        /**
         * @return sayAgentno
         */
        public Boolean getSayAgentno() {
            return this.sayAgentno;
        }

        /**
         * @return serviceLevel
         */
        public Long getServiceLevel() {
            return this.serviceLevel;
        }

        /**
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        /**
         * @return vipSupport
         */
        public Long getVipSupport() {
            return this.vipSupport;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        /**
         * @return wrapupTime
         */
        public Long getWrapupTime() {
            return this.wrapupTime;
        }

        public static final class Builder {
            private Long announcePosition; 
            private Long announcePositionFrequency; 
            private Long announcePositionParam; 
            private Long announcePositionYouarenext; 
            private Long announceSound; 
            private String announceSoundFile; 
            private Long announceSoundFrequency; 
            private String createTime; 
            private String description; 
            private Long enterpriseId; 
            private Long id; 
            private Long joinEmpty; 
            private Long maxLen; 
            private Long memberTimeout; 
            private String musicClass; 
            private String qno; 
            private Long queueTimeout; 
            private Long retry; 
            private Boolean sayAgentno; 
            private Long serviceLevel; 
            private String strategy; 
            private Long vipSupport; 
            private Long weight; 
            private Long wrapupTime; 

            private Builder() {
            } 

            private Builder(QueueList model) {
                this.announcePosition = model.announcePosition;
                this.announcePositionFrequency = model.announcePositionFrequency;
                this.announcePositionParam = model.announcePositionParam;
                this.announcePositionYouarenext = model.announcePositionYouarenext;
                this.announceSound = model.announceSound;
                this.announceSoundFile = model.announceSoundFile;
                this.announceSoundFrequency = model.announceSoundFrequency;
                this.createTime = model.createTime;
                this.description = model.description;
                this.enterpriseId = model.enterpriseId;
                this.id = model.id;
                this.joinEmpty = model.joinEmpty;
                this.maxLen = model.maxLen;
                this.memberTimeout = model.memberTimeout;
                this.musicClass = model.musicClass;
                this.qno = model.qno;
                this.queueTimeout = model.queueTimeout;
                this.retry = model.retry;
                this.sayAgentno = model.sayAgentno;
                this.serviceLevel = model.serviceLevel;
                this.strategy = model.strategy;
                this.vipSupport = model.vipSupport;
                this.weight = model.weight;
                this.wrapupTime = model.wrapupTime;
            } 

            /**
             * <p>位置播报 0关闭 1大于announce_position_param时播放 2小于等于announce_position_param时播放</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder announcePosition(Long announcePosition) {
                this.announcePosition = announcePosition;
                return this;
            }

            /**
             * <p>位置播报周期，秒数</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder announcePositionFrequency(Long announcePositionFrequency) {
                this.announcePositionFrequency = announcePositionFrequency;
                return this;
            }

            /**
             * <p>多余少余n个时播报，必须大于等于2</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder announcePositionParam(Long announcePositionParam) {
                this.announcePositionParam = announcePositionParam;
                return this;
            }

            /**
             * <p>是否播报&quot;您是下一位&quot;,0关闭，1开启</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder announcePositionYouarenext(Long announcePositionYouarenext) {
                this.announcePositionYouarenext = announcePositionYouarenext;
                return this;
            }

            /**
             * <p>播报固定语音 0关闭 1打开</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder announceSound(Long announceSound) {
                this.announceSound = announceSound;
                return this;
            }

            /**
             * <p>固定语音文件</p>
             * 
             * <strong>example:</strong>
             * <p>voice_filexxxxx</p>
             */
            public Builder announceSoundFile(String announceSoundFile) {
                this.announceSoundFile = announceSoundFile;
                return this;
            }

            /**
             * <p>播放固定语音周期，秒数</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder announceSoundFrequency(Long announceSoundFrequency) {
                this.announceSoundFrequency = announceSoundFrequency;
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
             * <p>队列名</p>
             * 
             * <strong>example:</strong>
             * <p>queue_name</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>队列id</p>
             * 
             * <strong>example:</strong>
             * <p>76</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>队列中为空时是否可以join，取值：1：置忙 2：通话中 4：振铃 8：无效 16：整理</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder joinEmpty(Long joinEmpty) {
                this.joinEmpty = joinEmpty;
                return this;
            }

            /**
             * <p>最大等待数，设置范围0-999，0表示不做任何限制</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxLen(Long maxLen) {
                this.maxLen = maxLen;
                return this;
            }

            /**
             * <p>座席超时时间，取值范围20-60秒，默认25秒</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder memberTimeout(Long memberTimeout) {
                this.memberTimeout = memberTimeout;
                return this;
            }

            /**
             * <p>等待语音class</p>
             * 
             * <strong>example:</strong>
             * <p>class1</p>
             */
            public Builder musicClass(String musicClass) {
                this.musicClass = musicClass;
                return this;
            }

            /**
             * <p>队列号</p>
             * 
             * <strong>example:</strong>
             * <p>322</p>
             */
            public Builder qno(String qno) {
                this.qno = qno;
                return this;
            }

            /**
             * <p>队列超时时间，取值范围5-600秒，默认600秒</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder queueTimeout(Long queueTimeout) {
                this.queueTimeout = queueTimeout;
                return this;
            }

            /**
             * <p>座席超时无应答,呼叫下一座席的延迟秒数</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder retry(Long retry) {
                this.retry = retry;
                return this;
            }

            /**
             * <p>语音报号，true:播报，false:不播报</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sayAgentno(Boolean sayAgentno) {
                this.sayAgentno = sayAgentno;
                return this;
            }

            /**
             * <p>服务水平秒数，低于此时间内接听的认为是高服务水平</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder serviceLevel(Long serviceLevel) {
                this.serviceLevel = serviceLevel;
                return this;
            }

            /**
             * <p>呼叫策略：rrordered:技能优先 rrmemory:轮选 fewestcalls:平均 random:随机 linear:顺序 leastrecent:最长空闲时间</p>
             * 
             * <strong>example:</strong>
             * <p>rrordered</p>
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * <p>是否支持vip，1:支持，0:不支持</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vipSupport(Long vipSupport) {
                this.vipSupport = vipSupport;
                return this;
            }

            /**
             * <p>队列优先级，取值范围1-10，数值越高，优先级越高</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            /**
             * <p>整理时间，取值范围3-3600秒</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder wrapupTime(Long wrapupTime) {
                this.wrapupTime = wrapupTime;
                return this;
            }

            public QueueList build() {
                return new QueueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudQueryAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryAgentResponseBody</p>
     */
    public static class Agents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private Agent agent;

        @com.aliyun.core.annotation.NameInMap("QueueList")
        private java.util.List<QueueList> queueList;

        private Agents(Builder builder) {
            this.agent = builder.agent;
            this.queueList = builder.queueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agents create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public Agent getAgent() {
            return this.agent;
        }

        /**
         * @return queueList
         */
        public java.util.List<QueueList> getQueueList() {
            return this.queueList;
        }

        public static final class Builder {
            private Agent agent; 
            private java.util.List<QueueList> queueList; 

            private Builder() {
            } 

            private Builder(Agents model) {
                this.agent = model.agent;
                this.queueList = model.queueList;
            } 

            /**
             * <p>座席信息</p>
             */
            public Builder agent(Agent agent) {
                this.agent = agent;
                return this;
            }

            /**
             * <p>座席所属队列信息</p>
             */
            public Builder queueList(java.util.List<QueueList> queueList) {
                this.queueList = queueList;
                return this;
            }

            public Agents build() {
                return new Agents(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudQueryAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agents")
        private java.util.List<Agents> agents;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.agents = builder.agents;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agents
         */
        public java.util.List<Agents> getAgents() {
            return this.agents;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Agents> agents; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agents = model.agents;
                this.total = model.total;
            } 

            /**
             * <p>座席列表数组</p>
             */
            public Builder agents(java.util.List<Agents> agents) {
                this.agents = agents;
                return this;
            }

            /**
             * <p>总数</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
