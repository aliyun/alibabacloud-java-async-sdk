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
 * {@link CloudCreateQueueSkillResponseBody} extends {@link TeaModel}
 *
 * <p>CloudCreateQueueSkillResponseBody</p>
 */
public class CloudCreateQueueSkillResponseBody extends TeaModel {
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

    private CloudCreateQueueSkillResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudCreateQueueSkillResponseBody create() {
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

        private Builder(CloudCreateQueueSkillResponseBody model) {
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

        public CloudCreateQueueSkillResponseBody build() {
            return new CloudCreateQueueSkillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudCreateQueueSkillResponseBody} extends {@link TeaModel}
     *
     * <p>CloudCreateQueueSkillResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private Long enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Qno")
        private Long qno;

        @com.aliyun.core.annotation.NameInMap("QueueId")
        private Long queueId;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private Long skillId;

        @com.aliyun.core.annotation.NameInMap("SkillLevel")
        private Long skillLevel;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.enterpriseId = builder.enterpriseId;
            this.id = builder.id;
            this.qno = builder.qno;
            this.queueId = builder.queueId;
            this.skillId = builder.skillId;
            this.skillLevel = builder.skillLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return qno
         */
        public Long getQno() {
            return this.qno;
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
            private Long qno; 
            private Long queueId; 
            private Long skillId; 
            private Long skillLevel; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.enterpriseId = model.enterpriseId;
                this.id = model.id;
                this.qno = model.qno;
                this.queueId = model.queueId;
                this.skillId = model.skillId;
                this.skillLevel = model.skillLevel;
            } 

            /**
             * <p>创建时间，格式: yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-30 06:12:34</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>企业编号</p>
             * 
             * <strong>example:</strong>
             * <p>7122600</p>
             */
            public Builder enterpriseId(Long enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>54475</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>队列号</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder qno(Long qno) {
                this.qno = qno;
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
             * <p>48735</p>
             */
            public Builder skillId(Long skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>技能值</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder skillLevel(Long skillLevel) {
                this.skillLevel = skillLevel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
