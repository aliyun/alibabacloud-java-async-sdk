// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBotResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBotResponseBody</p>
 */
public class DescribeBotResponseBody extends TeaModel {
    @NameInMap("Avatar")
    private String avatar;

    @NameInMap("Categories")
    private java.util.List < Categories> categories;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("Introduction")
    private String introduction;

    @NameInMap("LanguageCode")
    private String languageCode;

    @NameInMap("Logo")
    private String logo;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeZone")
    private String timeZone;

    private DescribeBotResponseBody(Builder builder) {
        this.avatar = builder.avatar;
        this.categories = builder.categories;
        this.createTime = builder.createTime;
        this.instanceId = builder.instanceId;
        this.introduction = builder.introduction;
        this.languageCode = builder.languageCode;
        this.logo = builder.logo;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBotResponseBody create() {
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
     * @return logo
     */
    public String getLogo() {
        return this.logo;
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
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder {
        private String avatar; 
        private java.util.List < Categories> categories; 
        private String createTime; 
        private String instanceId; 
        private String introduction; 
        private String languageCode; 
        private String logo; 
        private String name; 
        private String requestId; 
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
         * Logo.
         */
        public Builder logo(String logo) {
            this.logo = logo;
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
         * TimeZone.
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public DescribeBotResponseBody build() {
            return new DescribeBotResponseBody(this);
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
