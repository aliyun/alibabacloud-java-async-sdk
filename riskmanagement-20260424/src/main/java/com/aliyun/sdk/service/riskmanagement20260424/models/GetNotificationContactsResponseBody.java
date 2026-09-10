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
         * <p>The status code.</p>
         * <ul>
         * <li><strong>200</strong>: Success.</li>
         * <li><strong>Other (400, 500)</strong>: Failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query result.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2FBDD713-00A5-5C98-B661-3FD31A349B6E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful.</p>
         * <ul>
         * <li><strong>true</strong>: Success.</li>
         * <li><strong>false</strong>: Failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The channel type.</p>
             * 
             * <strong>example:</strong>
             * <p>email</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>Indicates whether the subscription is configured.</p>
             * <ul>
             * <li><strong>NO</strong></li>
             * <li><strong>YES</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder checkedState(String checkedState) {
                this.checkedState = checkedState;
                return this;
            }

            /**
             * <p>Indicates whether the channel is selected by default.</p>
             * <ul>
             * <li><strong>NO</strong></li>
             * <li><strong>YES</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder defaultChecked(String defaultChecked) {
                this.defaultChecked = defaultChecked;
                return this;
            }

            /**
             * <p>The fatigue limit.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder fatigueDayLimit(Integer fatigueDayLimit) {
                this.fatigueDayLimit = fatigueDayLimit;
                return this;
            }

            /**
             * <p>Indicates whether the channel is modifiable.</p>
             * <ul>
             * <li><strong>NO</strong></li>
             * <li><strong>YES</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
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
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1492387044070147</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>Indicates whether the contact is bound.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>fasle</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bindContact(Boolean bindContact) {
                this.bindContact = bindContact;
                return this;
            }

            /**
             * <p>The contact email address.</p>
             * 
             * <strong>example:</strong>
             * <p>t*@qq.*</p>
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * <p>The Account Center contact ID. A value of 0 indicates the account contact.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The Account Center contact mobile number (masked).</p>
             * 
             * <strong>example:</strong>
             * <p>13580xxx136</p>
             */
            public Builder contactMobile(String contactMobile) {
                this.contactMobile = contactMobile;
                return this;
            }

            /**
             * <p>The Account Center contact name.</p>
             * 
             * <strong>example:</strong>
             * <p>shianyu</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>Indicates whether the email address is verified.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder emailConfirmed(Boolean emailConfirmed) {
                this.emailConfirmed = emailConfirmed;
                return this;
            }

            /**
             * <p>Indicates whether the Account Center contact mobile number is verified.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mobileConfirmed(Boolean mobileConfirmed) {
                this.mobileConfirmed = mobileConfirmed;
                return this;
            }

            /**
             * <p>The Account Center contact position.</p>
             * 
             * <strong>example:</strong>
             * <p>CEO</p>
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
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1355290655619147</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The message category code.</p>
             * 
             * <strong>example:</strong>
             * <p>prod_edu_content</p>
             */
            public Builder categoryCode(String categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * <p>The message category description.</p>
             * 
             * <strong>example:</strong>
             * <p>Product usage scenarios and technical sharing content.</p>
             */
            public Builder categoryDesc(String categoryDesc) {
                this.categoryDesc = categoryDesc;
                return this;
            }

            /**
             * <p>The category group code.</p>
             * 
             * <strong>example:</strong>
             * <p>prod_msg</p>
             */
            public Builder categoryGroupCode(String categoryGroupCode) {
                this.categoryGroupCode = categoryGroupCode;
                return this;
            }

            /**
             * <p>The category group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Product messages.</p>
             */
            public Builder categoryGroupName(String categoryGroupName) {
                this.categoryGroupName = categoryGroupName;
                return this;
            }

            /**
             * <p>The message category name.</p>
             * 
             * <strong>example:</strong>
             * <p>Product educational content.</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The channel list.</p>
             */
            public Builder channelConfigs(java.util.List<ChannelConfigs> channelConfigs) {
                this.channelConfigs = channelConfigs;
                return this;
            }

            /**
             * <p>Indicates whether all notification methods are selected.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder chooseAllChannel(Boolean chooseAllChannel) {
                this.chooseAllChannel = chooseAllChannel;
                return this;
            }

            /**
             * <p>The general contact list.</p>
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
