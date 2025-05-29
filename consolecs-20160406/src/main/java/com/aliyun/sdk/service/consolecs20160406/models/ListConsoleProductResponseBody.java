// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.consolecs20160406.models;

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
 * {@link ListConsoleProductResponseBody} extends {@link TeaModel}
 *
 * <p>ListConsoleProductResponseBody</p>
 */
public class ListConsoleProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListConsoleProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsoleProductResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListConsoleProductResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListConsoleProductResponseBody build() {
            return new ListConsoleProductResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConsoleProductResponseBody} extends {@link TeaModel}
     *
     * <p>ListConsoleProductResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BelongedCategory")
        private String belongedCategory;

        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List<String> categories;

        @com.aliyun.core.annotation.NameInMap("ChannelLinks")
        private java.util.List<String> channelLinks;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private java.util.List<String> keywords;

        @com.aliyun.core.annotation.NameInMap("Names")
        private String names;

        @com.aliyun.core.annotation.NameInMap("Pinyin")
        private String pinyin;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("RelatedConsoleAppId")
        private String relatedConsoleAppId;

        @com.aliyun.core.annotation.NameInMap("RelatedPipId")
        private String relatedPipId;

        @com.aliyun.core.annotation.NameInMap("ShowInNav")
        private Boolean showInNav;

        @com.aliyun.core.annotation.NameInMap("SupportedAccounts")
        private java.util.List<String> supportedAccounts;

        @com.aliyun.core.annotation.NameInMap("SupportedChannels")
        private java.util.List<String> supportedChannels;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("TagExpireTime")
        private String tagExpireTime;

        private Data(Builder builder) {
            this.belongedCategory = builder.belongedCategory;
            this.categories = builder.categories;
            this.channelLinks = builder.channelLinks;
            this.docId = builder.docId;
            this.keywords = builder.keywords;
            this.names = builder.names;
            this.pinyin = builder.pinyin;
            this.productId = builder.productId;
            this.relatedConsoleAppId = builder.relatedConsoleAppId;
            this.relatedPipId = builder.relatedPipId;
            this.showInNav = builder.showInNav;
            this.supportedAccounts = builder.supportedAccounts;
            this.supportedChannels = builder.supportedChannels;
            this.tag = builder.tag;
            this.tagExpireTime = builder.tagExpireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return belongedCategory
         */
        public String getBelongedCategory() {
            return this.belongedCategory;
        }

        /**
         * @return categories
         */
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        /**
         * @return channelLinks
         */
        public java.util.List<String> getChannelLinks() {
            return this.channelLinks;
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return keywords
         */
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        /**
         * @return names
         */
        public String getNames() {
            return this.names;
        }

        /**
         * @return pinyin
         */
        public String getPinyin() {
            return this.pinyin;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return relatedConsoleAppId
         */
        public String getRelatedConsoleAppId() {
            return this.relatedConsoleAppId;
        }

        /**
         * @return relatedPipId
         */
        public String getRelatedPipId() {
            return this.relatedPipId;
        }

        /**
         * @return showInNav
         */
        public Boolean getShowInNav() {
            return this.showInNav;
        }

        /**
         * @return supportedAccounts
         */
        public java.util.List<String> getSupportedAccounts() {
            return this.supportedAccounts;
        }

        /**
         * @return supportedChannels
         */
        public java.util.List<String> getSupportedChannels() {
            return this.supportedChannels;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return tagExpireTime
         */
        public String getTagExpireTime() {
            return this.tagExpireTime;
        }

        public static final class Builder {
            private String belongedCategory; 
            private java.util.List<String> categories; 
            private java.util.List<String> channelLinks; 
            private String docId; 
            private java.util.List<String> keywords; 
            private String names; 
            private String pinyin; 
            private String productId; 
            private String relatedConsoleAppId; 
            private String relatedPipId; 
            private Boolean showInNav; 
            private java.util.List<String> supportedAccounts; 
            private java.util.List<String> supportedChannels; 
            private String tag; 
            private String tagExpireTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.belongedCategory = model.belongedCategory;
                this.categories = model.categories;
                this.channelLinks = model.channelLinks;
                this.docId = model.docId;
                this.keywords = model.keywords;
                this.names = model.names;
                this.pinyin = model.pinyin;
                this.productId = model.productId;
                this.relatedConsoleAppId = model.relatedConsoleAppId;
                this.relatedPipId = model.relatedPipId;
                this.showInNav = model.showInNav;
                this.supportedAccounts = model.supportedAccounts;
                this.supportedChannels = model.supportedChannels;
                this.tag = model.tag;
                this.tagExpireTime = model.tagExpireTime;
            } 

            /**
             * BelongedCategory.
             */
            public Builder belongedCategory(String belongedCategory) {
                this.belongedCategory = belongedCategory;
                return this;
            }

            /**
             * Categories.
             */
            public Builder categories(java.util.List<String> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * ChannelLinks.
             */
            public Builder channelLinks(java.util.List<String> channelLinks) {
                this.channelLinks = channelLinks;
                return this;
            }

            /**
             * DocId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * Keywords.
             */
            public Builder keywords(java.util.List<String> keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * Names.
             */
            public Builder names(String names) {
                this.names = names;
                return this;
            }

            /**
             * Pinyin.
             */
            public Builder pinyin(String pinyin) {
                this.pinyin = pinyin;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * RelatedConsoleAppId.
             */
            public Builder relatedConsoleAppId(String relatedConsoleAppId) {
                this.relatedConsoleAppId = relatedConsoleAppId;
                return this;
            }

            /**
             * RelatedPipId.
             */
            public Builder relatedPipId(String relatedPipId) {
                this.relatedPipId = relatedPipId;
                return this;
            }

            /**
             * ShowInNav.
             */
            public Builder showInNav(Boolean showInNav) {
                this.showInNav = showInNav;
                return this;
            }

            /**
             * SupportedAccounts.
             */
            public Builder supportedAccounts(java.util.List<String> supportedAccounts) {
                this.supportedAccounts = supportedAccounts;
                return this;
            }

            /**
             * SupportedChannels.
             */
            public Builder supportedChannels(java.util.List<String> supportedChannels) {
                this.supportedChannels = supportedChannels;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * TagExpireTime.
             */
            public Builder tagExpireTime(String tagExpireTime) {
                this.tagExpireTime = tagExpireTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
