// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetScenegroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetScenegroupResponseBody</p>
 */
public class GetScenegroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("groupUrl")
    private String groupUrl;

    @com.aliyun.core.annotation.NameInMap("icon")
    private String icon;

    @com.aliyun.core.annotation.NameInMap("managementOptions")
    private ManagementOptions managementOptions;

    @com.aliyun.core.annotation.NameInMap("openConversationId")
    private String openConversationId;

    @com.aliyun.core.annotation.NameInMap("ownerStaffId")
    private String ownerStaffId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("subAdminStaffIds")
    private java.util.List<String> subAdminStaffIds;

    @com.aliyun.core.annotation.NameInMap("templateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetScenegroupResponseBody(Builder builder) {
        this.groupUrl = builder.groupUrl;
        this.icon = builder.icon;
        this.managementOptions = builder.managementOptions;
        this.openConversationId = builder.openConversationId;
        this.ownerStaffId = builder.ownerStaffId;
        this.requestId = builder.requestId;
        this.subAdminStaffIds = builder.subAdminStaffIds;
        this.templateId = builder.templateId;
        this.title = builder.title;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScenegroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupUrl
     */
    public String getGroupUrl() {
        return this.groupUrl;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return managementOptions
     */
    public ManagementOptions getManagementOptions() {
        return this.managementOptions;
    }

    /**
     * @return openConversationId
     */
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    /**
     * @return ownerStaffId
     */
    public String getOwnerStaffId() {
        return this.ownerStaffId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subAdminStaffIds
     */
    public java.util.List<String> getSubAdminStaffIds() {
        return this.subAdminStaffIds;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String groupUrl; 
        private String icon; 
        private ManagementOptions managementOptions; 
        private String openConversationId; 
        private String ownerStaffId; 
        private String requestId; 
        private java.util.List<String> subAdminStaffIds; 
        private String templateId; 
        private String title; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetScenegroupResponseBody model) {
            this.groupUrl = model.groupUrl;
            this.icon = model.icon;
            this.managementOptions = model.managementOptions;
            this.openConversationId = model.openConversationId;
            this.ownerStaffId = model.ownerStaffId;
            this.requestId = model.requestId;
            this.subAdminStaffIds = model.subAdminStaffIds;
            this.templateId = model.templateId;
            this.title = model.title;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * groupUrl.
         */
        public Builder groupUrl(String groupUrl) {
            this.groupUrl = groupUrl;
            return this;
        }

        /**
         * icon.
         */
        public Builder icon(String icon) {
            this.icon = icon;
            return this;
        }

        /**
         * managementOptions.
         */
        public Builder managementOptions(ManagementOptions managementOptions) {
            this.managementOptions = managementOptions;
            return this;
        }

        /**
         * openConversationId.
         */
        public Builder openConversationId(String openConversationId) {
            this.openConversationId = openConversationId;
            return this;
        }

        /**
         * ownerStaffId.
         */
        public Builder ownerStaffId(String ownerStaffId) {
            this.ownerStaffId = ownerStaffId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * subAdminStaffIds.
         */
        public Builder subAdminStaffIds(java.util.List<String> subAdminStaffIds) {
            this.subAdminStaffIds = subAdminStaffIds;
            return this;
        }

        /**
         * templateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetScenegroupResponseBody build() {
            return new GetScenegroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScenegroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetScenegroupResponseBody</p>
     */
    public static class ManagementOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChatBannedType")
        private String chatBannedType;

        @com.aliyun.core.annotation.NameInMap("ManagementType")
        private String managementType;

        @com.aliyun.core.annotation.NameInMap("MentionAllAuthority")
        private String mentionAllAuthority;

        @com.aliyun.core.annotation.NameInMap("Searchable")
        private String searchable;

        @com.aliyun.core.annotation.NameInMap("ShowHistoryType")
        private String showHistoryType;

        @com.aliyun.core.annotation.NameInMap("ValidationType")
        private String validationType;

        private ManagementOptions(Builder builder) {
            this.chatBannedType = builder.chatBannedType;
            this.managementType = builder.managementType;
            this.mentionAllAuthority = builder.mentionAllAuthority;
            this.searchable = builder.searchable;
            this.showHistoryType = builder.showHistoryType;
            this.validationType = builder.validationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagementOptions create() {
            return builder().build();
        }

        /**
         * @return chatBannedType
         */
        public String getChatBannedType() {
            return this.chatBannedType;
        }

        /**
         * @return managementType
         */
        public String getManagementType() {
            return this.managementType;
        }

        /**
         * @return mentionAllAuthority
         */
        public String getMentionAllAuthority() {
            return this.mentionAllAuthority;
        }

        /**
         * @return searchable
         */
        public String getSearchable() {
            return this.searchable;
        }

        /**
         * @return showHistoryType
         */
        public String getShowHistoryType() {
            return this.showHistoryType;
        }

        /**
         * @return validationType
         */
        public String getValidationType() {
            return this.validationType;
        }

        public static final class Builder {
            private String chatBannedType; 
            private String managementType; 
            private String mentionAllAuthority; 
            private String searchable; 
            private String showHistoryType; 
            private String validationType; 

            private Builder() {
            } 

            private Builder(ManagementOptions model) {
                this.chatBannedType = model.chatBannedType;
                this.managementType = model.managementType;
                this.mentionAllAuthority = model.mentionAllAuthority;
                this.searchable = model.searchable;
                this.showHistoryType = model.showHistoryType;
                this.validationType = model.validationType;
            } 

            /**
             * ChatBannedType.
             */
            public Builder chatBannedType(String chatBannedType) {
                this.chatBannedType = chatBannedType;
                return this;
            }

            /**
             * ManagementType.
             */
            public Builder managementType(String managementType) {
                this.managementType = managementType;
                return this;
            }

            /**
             * MentionAllAuthority.
             */
            public Builder mentionAllAuthority(String mentionAllAuthority) {
                this.mentionAllAuthority = mentionAllAuthority;
                return this;
            }

            /**
             * Searchable.
             */
            public Builder searchable(String searchable) {
                this.searchable = searchable;
                return this;
            }

            /**
             * ShowHistoryType.
             */
            public Builder showHistoryType(String showHistoryType) {
                this.showHistoryType = showHistoryType;
                return this;
            }

            /**
             * ValidationType.
             */
            public Builder validationType(String validationType) {
                this.validationType = validationType;
                return this;
            }

            public ManagementOptions build() {
                return new ManagementOptions(this);
            } 

        } 

    }
}
