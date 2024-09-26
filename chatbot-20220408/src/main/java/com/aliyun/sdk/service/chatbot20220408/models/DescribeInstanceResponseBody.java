// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
    private java.util.List < Categories> categories;

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

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return categories
     */
    public java.util.List < Categories> getCategories() {
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
        private java.util.List < Categories> categories; 
        private String createTime; 
        private String editStatus; 
        private String instanceId; 
        private String introduction; 
        private String languageCode; 
        private String name; 
        private String requestId; 
        private String robotType; 
        private String timeZone; 

        /**
         * Avatar.
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * Categories.
         */
        public Builder categories(java.util.List < Categories> categories) {
            this.categories = categories;
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
         * EditStatus.
         */
        public Builder editStatus(String editStatus) {
            this.editStatus = editStatus;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RobotType.
         */
        public Builder robotType(String robotType) {
            this.robotType = robotType;
            return this;
        }

        /**
         * TimeZone.
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
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentCategoryId")
        private Long parentCategoryId;

        private Categories(Builder builder) {
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
            private Long categoryId; 
            private String name; 
            private Long parentCategoryId; 

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
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
             * ParentCategoryId.
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
