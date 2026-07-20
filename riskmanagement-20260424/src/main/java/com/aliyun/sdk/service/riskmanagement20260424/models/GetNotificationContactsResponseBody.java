// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetNotificationContactsResponseBody} extends {@link TeaModel}
 *
 * <p>GetNotificationContactsResponseBody</p>
 */
public class GetNotificationContactsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetNotificationContactsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNotificationContactsResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetNotificationContactsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetNotificationContactsResponseBody build() {
            return new GetNotificationContactsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNotificationContactsResponseBody} extends {@link TeaModel}
     *
     * <p>GetNotificationContactsResponseBody</p>
     */
    public static class ChannelConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("CheckedState")
        private String checkedState;

        @com.aliyun.core.annotation.NameInMap("DefaultChecked")
        private String defaultChecked;

        @com.aliyun.core.annotation.NameInMap("FatigueDayLimit")
        private Integer fatigueDayLimit;

        @com.aliyun.core.annotation.NameInMap("Optional")
        private String optional;

        private ChannelConfigs(Builder builder) {
            this.channelType = builder.channelType;
            this.checkedState = builder.checkedState;
            this.defaultChecked = builder.defaultChecked;
            this.fatigueDayLimit = builder.fatigueDayLimit;
            this.optional = builder.optional;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelConfigs create() {
            return builder().build();
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return checkedState
         */
        public String getCheckedState() {
            return this.checkedState;
        }

        /**
         * @return defaultChecked
         */
        public String getDefaultChecked() {
            return this.defaultChecked;
        }

        /**
         * @return fatigueDayLimit
         */
        public Integer getFatigueDayLimit() {
            return this.fatigueDayLimit;
        }

        /**
         * @return optional
         */
        public String getOptional() {
            return this.optional;
        }

        public static final class Builder {
            private String channelType; 
            private String checkedState; 
            private String defaultChecked; 
            private Integer fatigueDayLimit; 
            private String optional; 

            private Builder() {
            } 

            private Builder(ChannelConfigs model) {
                this.channelType = model.channelType;
                this.checkedState = model.checkedState;
                this.defaultChecked = model.defaultChecked;
                this.fatigueDayLimit = model.fatigueDayLimit;
                this.optional = model.optional;
            } 

            /**
             * ChannelType.
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * CheckedState.
             */
            public Builder checkedState(String checkedState) {
                this.checkedState = checkedState;
                return this;
            }

            /**
             * DefaultChecked.
             */
            public Builder defaultChecked(String defaultChecked) {
                this.defaultChecked = defaultChecked;
                return this;
            }

            /**
             * FatigueDayLimit.
             */
            public Builder fatigueDayLimit(Integer fatigueDayLimit) {
                this.fatigueDayLimit = fatigueDayLimit;
                return this;
            }

            /**
             * Optional.
             */
            public Builder optional(String optional) {
                this.optional = optional;
                return this;
            }

            public ChannelConfigs build() {
                return new ChannelConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNotificationContactsResponseBody} extends {@link TeaModel}
     *
     * <p>GetNotificationContactsResponseBody</p>
     */
    public static class ContactInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("BindContact")
        private Boolean bindContact;

        @com.aliyun.core.annotation.NameInMap("ContactEmail")
        private String contactEmail;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Long contactId;

        @com.aliyun.core.annotation.NameInMap("ContactMobile")
        private String contactMobile;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("EmailConfirmed")
        private Boolean emailConfirmed;

        @com.aliyun.core.annotation.NameInMap("MobileConfirmed")
        private Boolean mobileConfirmed;

        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        private ContactInfoList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bindContact = builder.bindContact;
            this.contactEmail = builder.contactEmail;
            this.contactId = builder.contactId;
            this.contactMobile = builder.contactMobile;
            this.contactName = builder.contactName;
            this.emailConfirmed = builder.emailConfirmed;
            this.mobileConfirmed = builder.mobileConfirmed;
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactInfoList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bindContact
         */
        public Boolean getBindContact() {
            return this.bindContact;
        }

        /**
         * @return contactEmail
         */
        public String getContactEmail() {
            return this.contactEmail;
        }

        /**
         * @return contactId
         */
        public Long getContactId() {
            return this.contactId;
        }

        /**
         * @return contactMobile
         */
        public String getContactMobile() {
            return this.contactMobile;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return emailConfirmed
         */
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        /**
         * @return mobileConfirmed
         */
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        public static final class Builder {
            private Long aliUid; 
            private Boolean bindContact; 
            private String contactEmail; 
            private Long contactId; 
            private String contactMobile; 
            private String contactName; 
            private Boolean emailConfirmed; 
            private Boolean mobileConfirmed; 
            private String position; 

            private Builder() {
            } 

            private Builder(ContactInfoList model) {
                this.aliUid = model.aliUid;
                this.bindContact = model.bindContact;
                this.contactEmail = model.contactEmail;
                this.contactId = model.contactId;
                this.contactMobile = model.contactMobile;
                this.contactName = model.contactName;
                this.emailConfirmed = model.emailConfirmed;
                this.mobileConfirmed = model.mobileConfirmed;
                this.position = model.position;
            } 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * BindContact.
             */
            public Builder bindContact(Boolean bindContact) {
                this.bindContact = bindContact;
                return this;
            }

            /**
             * ContactEmail.
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * ContactId.
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * ContactMobile.
             */
            public Builder contactMobile(String contactMobile) {
                this.contactMobile = contactMobile;
                return this;
            }

            /**
             * ContactName.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * EmailConfirmed.
             */
            public Builder emailConfirmed(Boolean emailConfirmed) {
                this.emailConfirmed = emailConfirmed;
                return this;
            }

            /**
             * MobileConfirmed.
             */
            public Builder mobileConfirmed(Boolean mobileConfirmed) {
                this.mobileConfirmed = mobileConfirmed;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            public ContactInfoList build() {
                return new ContactInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNotificationContactsResponseBody} extends {@link TeaModel}
     *
     * <p>GetNotificationContactsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("CategoryCode")
        private String categoryCode;

        @com.aliyun.core.annotation.NameInMap("CategoryDesc")
        private String categoryDesc;

        @com.aliyun.core.annotation.NameInMap("CategoryGroupCode")
        private String categoryGroupCode;

        @com.aliyun.core.annotation.NameInMap("CategoryGroupName")
        private String categoryGroupName;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("ChannelConfigs")
        private java.util.List<ChannelConfigs> channelConfigs;

        @com.aliyun.core.annotation.NameInMap("ChooseAllChannel")
        private Boolean chooseAllChannel;

        @com.aliyun.core.annotation.NameInMap("ContactInfoList")
        private java.util.List<ContactInfoList> contactInfoList;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.categoryCode = builder.categoryCode;
            this.categoryDesc = builder.categoryDesc;
            this.categoryGroupCode = builder.categoryGroupCode;
            this.categoryGroupName = builder.categoryGroupName;
            this.categoryName = builder.categoryName;
            this.channelConfigs = builder.channelConfigs;
            this.chooseAllChannel = builder.chooseAllChannel;
            this.contactInfoList = builder.contactInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return categoryCode
         */
        public String getCategoryCode() {
            return this.categoryCode;
        }

        /**
         * @return categoryDesc
         */
        public String getCategoryDesc() {
            return this.categoryDesc;
        }

        /**
         * @return categoryGroupCode
         */
        public String getCategoryGroupCode() {
            return this.categoryGroupCode;
        }

        /**
         * @return categoryGroupName
         */
        public String getCategoryGroupName() {
            return this.categoryGroupName;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return channelConfigs
         */
        public java.util.List<ChannelConfigs> getChannelConfigs() {
            return this.channelConfigs;
        }

        /**
         * @return chooseAllChannel
         */
        public Boolean getChooseAllChannel() {
            return this.chooseAllChannel;
        }

        /**
         * @return contactInfoList
         */
        public java.util.List<ContactInfoList> getContactInfoList() {
            return this.contactInfoList;
        }

        public static final class Builder {
            private Long aliUid; 
            private String categoryCode; 
            private String categoryDesc; 
            private String categoryGroupCode; 
            private String categoryGroupName; 
            private String categoryName; 
            private java.util.List<ChannelConfigs> channelConfigs; 
            private Boolean chooseAllChannel; 
            private java.util.List<ContactInfoList> contactInfoList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliUid = model.aliUid;
                this.categoryCode = model.categoryCode;
                this.categoryDesc = model.categoryDesc;
                this.categoryGroupCode = model.categoryGroupCode;
                this.categoryGroupName = model.categoryGroupName;
                this.categoryName = model.categoryName;
                this.channelConfigs = model.channelConfigs;
                this.chooseAllChannel = model.chooseAllChannel;
                this.contactInfoList = model.contactInfoList;
            } 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * CategoryCode.
             */
            public Builder categoryCode(String categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * CategoryDesc.
             */
            public Builder categoryDesc(String categoryDesc) {
                this.categoryDesc = categoryDesc;
                return this;
            }

            /**
             * CategoryGroupCode.
             */
            public Builder categoryGroupCode(String categoryGroupCode) {
                this.categoryGroupCode = categoryGroupCode;
                return this;
            }

            /**
             * CategoryGroupName.
             */
            public Builder categoryGroupName(String categoryGroupName) {
                this.categoryGroupName = categoryGroupName;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * ChannelConfigs.
             */
            public Builder channelConfigs(java.util.List<ChannelConfigs> channelConfigs) {
                this.channelConfigs = channelConfigs;
                return this;
            }

            /**
             * ChooseAllChannel.
             */
            public Builder chooseAllChannel(Boolean chooseAllChannel) {
                this.chooseAllChannel = chooseAllChannel;
                return this;
            }

            /**
             * ContactInfoList.
             */
            public Builder contactInfoList(java.util.List<ContactInfoList> contactInfoList) {
                this.contactInfoList = contactInfoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
