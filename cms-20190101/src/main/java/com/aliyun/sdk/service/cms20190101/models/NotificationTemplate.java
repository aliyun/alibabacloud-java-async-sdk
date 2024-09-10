// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NotificationTemplate} extends {@link TeaModel}
 *
 * <p>NotificationTemplate</p>
 */
public class NotificationTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EnContent")
    private String enContent;

    @com.aliyun.core.annotation.NameInMap("EnItemContent")
    private String enItemContent;

    @com.aliyun.core.annotation.NameInMap("EnTitle")
    private String enTitle;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    @com.aliyun.core.annotation.NameInMap("WraperType")
    private String wraperType;

    @com.aliyun.core.annotation.NameInMap("ZhContent")
    private String zhContent;

    @com.aliyun.core.annotation.NameInMap("ZhItemContent")
    private String zhItemContent;

    @com.aliyun.core.annotation.NameInMap("ZhTitle")
    private String zhTitle;

    private NotificationTemplate(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.enContent = builder.enContent;
        this.enItemContent = builder.enItemContent;
        this.enTitle = builder.enTitle;
        this.name = builder.name;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
        this.wraperType = builder.wraperType;
        this.zhContent = builder.zhContent;
        this.zhItemContent = builder.zhItemContent;
        this.zhTitle = builder.zhTitle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotificationTemplate create() {
        return builder().build();
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
     * @return enContent
     */
    public String getEnContent() {
        return this.enContent;
    }

    /**
     * @return enItemContent
     */
    public String getEnItemContent() {
        return this.enItemContent;
    }

    /**
     * @return enTitle
     */
    public String getEnTitle() {
        return this.enTitle;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return wraperType
     */
    public String getWraperType() {
        return this.wraperType;
    }

    /**
     * @return zhContent
     */
    public String getZhContent() {
        return this.zhContent;
    }

    /**
     * @return zhItemContent
     */
    public String getZhItemContent() {
        return this.zhItemContent;
    }

    /**
     * @return zhTitle
     */
    public String getZhTitle() {
        return this.zhTitle;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private String enContent; 
        private String enItemContent; 
        private String enTitle; 
        private String name; 
        private String type; 
        private String updateTime; 
        private String userId; 
        private String uuid; 
        private String wraperType; 
        private String zhContent; 
        private String zhItemContent; 
        private String zhTitle; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EnContent.
         */
        public Builder enContent(String enContent) {
            this.enContent = enContent;
            return this;
        }

        /**
         * EnItemContent.
         */
        public Builder enItemContent(String enItemContent) {
            this.enItemContent = enItemContent;
            return this;
        }

        /**
         * EnTitle.
         */
        public Builder enTitle(String enTitle) {
            this.enTitle = enTitle;
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
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * WraperType.
         */
        public Builder wraperType(String wraperType) {
            this.wraperType = wraperType;
            return this;
        }

        /**
         * ZhContent.
         */
        public Builder zhContent(String zhContent) {
            this.zhContent = zhContent;
            return this;
        }

        /**
         * ZhItemContent.
         */
        public Builder zhItemContent(String zhItemContent) {
            this.zhItemContent = zhItemContent;
            return this;
        }

        /**
         * ZhTitle.
         */
        public Builder zhTitle(String zhTitle) {
            this.zhTitle = zhTitle;
            return this;
        }

        public NotificationTemplate build() {
            return new NotificationTemplate(this);
        } 

    } 

}
