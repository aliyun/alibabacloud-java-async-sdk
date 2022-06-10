// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("Avatar")
    private String avatar;

    @NameInMap("Categories")
    private java.util.List < Categories> categories;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("EditStatus")
    private String editStatus;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("Introduction")
    private String introduction;

    @NameInMap("LanguageCode")
    private String languageCode;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RobotType")
    private String robotType;

    @NameInMap("TimeZone")
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
         * 机器人头像的URL
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * 类目列表
         */
        public Builder categories(java.util.List < Categories> categories) {
            this.categories = categories;
            return this;
        }

        /**
         * 机器人创建的 UTC 时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 机器人状态： EDITING(编辑中)、 PUBLISHED(已发布)
         */
        public Builder editStatus(String editStatus) {
            this.editStatus = editStatus;
            return this;
        }

        /**
         * 机器人唯一标识
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 机器人备注
         */
        public Builder introduction(String introduction) {
            this.introduction = introduction;
            return this;
        }

        /**
         * 机器人服务的语言，如zh-cn、en-us
         */
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        /**
         * 机器人名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 机器人类型
         */
        public Builder robotType(String robotType) {
            this.robotType = robotType;
            return this;
        }

        /**
         * 机器人的时区，参考《公共-时区码》
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

    public static class Categories extends TeaModel {
        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentCategoryId")
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
             * 类目id
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * 类目名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 父类目id，-1表示根目录
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
