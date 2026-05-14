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
 * {@link CloudGetQueueResponseBody} extends {@link TeaModel}
 *
 * <p>CloudGetQueueResponseBody</p>
 */
public class CloudGetQueueResponseBody extends TeaModel {
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

    private CloudGetQueueResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudGetQueueResponseBody create() {
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

        private Builder(CloudGetQueueResponseBody model) {
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

        public CloudGetQueueResponseBody build() {
            return new CloudGetQueueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudGetQueueResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetQueueResponseBody</p>
     */
    public static class Queue extends TeaModel {
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

        private Queue(Builder builder) {
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

        public static Queue create() {
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

            private Builder(Queue model) {
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
             * <p>0</p>
             */
            public Builder announcePosition(Long announcePosition) {
                this.announcePosition = announcePosition;
                return this;
            }

            /**
             * <p>位置播报周期，秒数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder announcePositionFrequency(Long announcePositionFrequency) {
                this.announcePositionFrequency = announcePositionFrequency;
                return this;
            }

            /**
             * <p>多余少余n个时播报，必须大于等于2</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder announcePositionParam(Long announcePositionParam) {
                this.announcePositionParam = announcePositionParam;
                return this;
            }

            /**
             * <p>是否播报&quot;您是下一位&quot;,0关闭，1开启</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder announcePositionYouarenext(Long announcePositionYouarenext) {
                this.announcePositionYouarenext = announcePositionYouarenext;
                return this;
            }

            /**
             * <p>播报固定语音 0关闭 1打开</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder announceSound(Long announceSound) {
                this.announceSound = announceSound;
                return this;
            }

            /**
             * <p>固定语音文件</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder announceSoundFile(String announceSoundFile) {
                this.announceSoundFile = announceSoundFile;
                return this;
            }

            /**
             * <p>播放固定语音周期，秒数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder announceSoundFrequency(Long announceSoundFrequency) {
                this.announceSoundFrequency = announceSoundFrequency;
                return this;
            }

            /**
             * <p>创建时间，格式: yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-30 06:12:33</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>队列名</p>
             * 
             * <strong>example:</strong>
             * <p>queueName</p>
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
             * <p>54473</p>
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
             * <p>60</p>
             */
            public Builder memberTimeout(Long memberTimeout) {
                this.memberTimeout = memberTimeout;
                return this;
            }

            /**
             * <p>等待语音class</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder musicClass(String musicClass) {
                this.musicClass = musicClass;
                return this;
            }

            /**
             * <p>队列号</p>
             * 
             * <strong>example:</strong>
             * <p>2632</p>
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
             * <p>5</p>
             */
            public Builder retry(Long retry) {
                this.retry = retry;
                return this;
            }

            /**
             * <p>语音报号，true:播报，false:不播报</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sayAgentno(Boolean sayAgentno) {
                this.sayAgentno = sayAgentno;
                return this;
            }

            /**
             * <p>服务水平秒数，低于此时间内接听的认为是高服务水平</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
             * <p>0</p>
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

            public Queue build() {
                return new Queue(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudGetQueueResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetQueueResponseBody</p>
     */
    public static class QueueSkills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private Long enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("QueueId")
        private Long queueId;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private Long skillId;

        @com.aliyun.core.annotation.NameInMap("SkillLevel")
        private Long skillLevel;

        private QueueSkills(Builder builder) {
            this.createTime = builder.createTime;
            this.enterpriseId = builder.enterpriseId;
            this.id = builder.id;
            this.queueId = builder.queueId;
            this.skillId = builder.skillId;
            this.skillLevel = builder.skillLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueSkills create() {
            return builder().build();
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return queueId
         */
        public Long getQueueId() {
            return this.queueId;
        }

        /**
         * @return skillId
         */
        public Long getSkillId() {
            return this.skillId;
        }

        /**
         * @return skillLevel
         */
        public Long getSkillLevel() {
            return this.skillLevel;
        }

        public static final class Builder {
            private String createTime; 
            private Long enterpriseId; 
            private Long id; 
            private Long queueId; 
            private Long skillId; 
            private Long skillLevel; 

            private Builder() {
            } 

            private Builder(QueueSkills model) {
                this.createTime = model.createTime;
                this.enterpriseId = model.enterpriseId;
                this.id = model.id;
                this.queueId = model.queueId;
                this.skillId = model.skillId;
                this.skillLevel = model.skillLevel;
            } 

            /**
             * <p>创建时间，格式: yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-30 06:12:33</p>
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
             * <p>queueSkill关系表中id</p>
             * 
             * <strong>example:</strong>
             * <p>51937</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>队列id</p>
             * 
             * <strong>example:</strong>
             * <p>51937</p>
             */
            public Builder queueId(Long queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * <p>skill的id</p>
             * 
             * <strong>example:</strong>
             * <p>48734</p>
             */
            public Builder skillId(Long skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>技能值</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder skillLevel(Long skillLevel) {
                this.skillLevel = skillLevel;
                return this;
            }

            public QueueSkills build() {
                return new QueueSkills(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudGetQueueResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetQueueResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Queue")
        private Queue queue;

        @com.aliyun.core.annotation.NameInMap("QueueSkills")
        private java.util.List<QueueSkills> queueSkills;

        private Data(Builder builder) {
            this.queue = builder.queue;
            this.queueSkills = builder.queueSkills;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return queue
         */
        public Queue getQueue() {
            return this.queue;
        }

        /**
         * @return queueSkills
         */
        public java.util.List<QueueSkills> getQueueSkills() {
            return this.queueSkills;
        }

        public static final class Builder {
            private Queue queue; 
            private java.util.List<QueueSkills> queueSkills; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.queue = model.queue;
                this.queueSkills = model.queueSkills;
            } 

            /**
             * <p>队列配置信息</p>
             */
            public Builder queue(Queue queue) {
                this.queue = queue;
                return this;
            }

            /**
             * <p>队列所需技能数组</p>
             */
            public Builder queueSkills(java.util.List<QueueSkills> queueSkills) {
                this.queueSkills = queueSkills;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
