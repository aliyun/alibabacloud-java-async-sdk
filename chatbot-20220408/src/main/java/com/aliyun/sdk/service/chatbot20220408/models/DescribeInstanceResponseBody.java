// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Avatar")
    private String avatar;

    @com.aliyun.core.annotation.NameInMap("Categories")
    private java.util.List<Categories> categories;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("EditStatus")
    private String editStatus;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Introduction")
    private String introduction;

    @com.aliyun.core.annotation.NameInMap("LanguageCode")
    private String languageCode;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RobotType")
    private String robotType;

    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    private DescribeInstanceResponseBody(Builder builder) {
        this.avatar = builder.avatar;
        this.categories = builder.categories;
        this.createTime = builder.createTime;
        this.editStatus = builder.editStatus;
        this.instanceId = builder.instanceId;
        this.introduction = builder.introduction;
        this.languageCode = builder.languageCode;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.robotType = builder.robotType;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return categories
     */
    public java.util.List<Categories> getCategories() {
        return this.categories;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return editStatus
     */
    public String getEditStatus() {
        return this.editStatus;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return robotType
     */
    public String getRobotType() {
        return this.robotType;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder {
        private String avatar; 
        private java.util.List<Categories> categories; 
        private String createTime; 
        private String editStatus; 
        private String instanceId; 
        private String introduction; 
        private String languageCode; 
        private String name; 
        private String requestId; 
        private String robotType; 
        private String timeZone; 

        private Builder() {
        } 

        private Builder(DescribeInstanceResponseBody model) {
            this.avatar = model.avatar;
            this.categories = model.categories;
            this.createTime = model.createTime;
            this.editStatus = model.editStatus;
            this.instanceId = model.instanceId;
            this.introduction = model.introduction;
            this.languageCode = model.languageCode;
            this.name = model.name;
            this.requestId = model.requestId;
            this.robotType = model.robotType;
            this.timeZone = model.timeZone;
        } 

        /**
         * <p>The URL of the chatbot avatar.</p>
         * 
         * <strong>example:</strong>
         * <p>/alimefe/meebot/robot/0.0.5/img/xxx-90-97.png</p>
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * <p>The list of categories.</p>
         */
        public Builder categories(java.util.List<Categories> categories) {
            this.categories = categories;
            return this;
        }

        /**
         * <p>The UTC time when the chatbot was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-12T16:00:01Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The status of the chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        public Builder editStatus(String editStatus) {
            this.editStatus = editStatus;
            return this;
        }

        /**
         * <p>The unique identifier of the chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-mp90s2lrk00050</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The remarks of the chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>A chatbot for consumer Q&amp;A</p>
         */
        public Builder introduction(String introduction) {
            this.introduction = introduction;
            return this;
        }

        /**
         * <p>The language of the chatbot service, such as zh-cn or en-us.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-cn</p>
         */
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        /**
         * <p>The name of the chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>Intelligent Customer Service - Bot C</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>907AA5F2-0521-49AB-80AB-1ADEFAB2B901</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of the chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>scenario_im</p>
         */
        public Builder robotType(String robotType) {
            this.robotType = robotType;
            return this;
        }

        /**
         * <p>The time zone of the chatbot. For more information, see the common time zone codes.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Chongqing</p>
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class Categories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbilityType")
        private String abilityType;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentCategoryId")
        private Long parentCategoryId;

        private Categories(Builder builder) {
            this.abilityType = builder.abilityType;
            this.categoryId = builder.categoryId;
            this.name = builder.name;
            this.parentCategoryId = builder.parentCategoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
            return builder().build();
        }

        /**
         * @return abilityType
         */
        public String getAbilityType() {
            return this.abilityType;
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentCategoryId
         */
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

        public static final class Builder {
            private String abilityType; 
            private Long categoryId; 
            private String name; 
            private Long parentCategoryId; 

            private Builder() {
            } 

            private Builder(Categories model) {
                this.abilityType = model.abilityType;
                this.categoryId = model.categoryId;
                this.name = model.name;
                this.parentCategoryId = model.parentCategoryId;
            } 

            /**
             * <p>The ability type of the category, such as FAQ (frequently asked questions) or MRC (document).</p>
             * 
             * <strong>example:</strong>
             * <p>FAQ</p>
             */
            public Builder abilityType(String abilityType) {
                this.abilityType = abilityType;
                return this;
            }

            /**
             * <p>The category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30000066832</p>
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>Pandemic Prevention Policy</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parent category ID. A value of -1 indicates the root directory.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder parentCategoryId(Long parentCategoryId) {
                this.parentCategoryId = parentCategoryId;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
}
