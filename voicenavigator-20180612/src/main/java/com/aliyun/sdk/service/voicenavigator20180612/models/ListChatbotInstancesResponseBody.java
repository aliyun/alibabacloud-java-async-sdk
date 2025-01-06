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

        /**
         * Bots.
         */
        public Builder bots(java.util.List<Bots> bots) {
            this.bots = bots;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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

            /**
             * Avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * InstanceId.
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
             * LanguageCode.
             */
            public Builder languageCode(String languageCode) {
                this.languageCode = languageCode;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TimeZone.
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
