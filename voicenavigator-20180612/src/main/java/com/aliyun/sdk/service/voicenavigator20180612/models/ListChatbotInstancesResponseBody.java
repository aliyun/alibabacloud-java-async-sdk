// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link ListChatbotInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListChatbotInstancesResponseBody</p>
 */
public class ListChatbotInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bots")
    private java.util.List<Bots> bots;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListChatbotInstancesResponseBody(Builder builder) {
        this.bots = builder.bots;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatbotInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bots
     */
    public java.util.List<Bots> getBots() {
        return this.bots;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Bots> bots; 
        private Integer pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListChatbotInstancesResponseBody model) {
            this.bots = model.bots;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of instances.</p>
         */
        public Builder bots(java.util.List<Bots> bots) {
            this.bots = bots;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChatbotInstancesResponseBody build() {
            return new ListChatbotInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChatbotInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListChatbotInstancesResponseBody</p>
     */
    public static class Bots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Introduction")
        private String introduction;

        @com.aliyun.core.annotation.NameInMap("LanguageCode")
        private String languageCode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private Bots(Builder builder) {
            this.avatar = builder.avatar;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.introduction = builder.introduction;
            this.languageCode = builder.languageCode;
            this.name = builder.name;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bots create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return introduction
         */
        public String getIntroduction() {
            return this.introduction;
        }

        /**
         * @return languageCode
         */
        public String getLanguageCode() {
            return this.languageCode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String avatar; 
            private String createTime; 
            private String instanceId; 
            private String introduction; 
            private String languageCode; 
            private String name; 
            private String timeZone; 

            private Builder() {
            } 

            private Builder(Bots model) {
                this.avatar = model.avatar;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.introduction = model.introduction;
                this.languageCode = model.languageCode;
                this.name = model.name;
                this.timeZone = model.timeZone;
            } 

            /**
             * <p>The icon of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dss0.ali.com/70cFuHS.jpg">https://dss0.ali.com/70cFuHS.jpg</a></p>
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1582266750353</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Introduction.
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * <p>The language code.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-cn</p>
             */
            public Builder languageCode(String languageCode) {
                this.languageCode = languageCode;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>测试机器人</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>UTC+8</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public Bots build() {
                return new Bots(this);
            } 

        } 

    }
}
