// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAddressBookRequest} extends {@link RequestModel}
 *
 * <p>ModifyAddressBookRequest</p>
 */
public class ModifyAddressBookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressList")
    private String addressList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoAddTagEcs")
    private String autoAddTagEcs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyMode")
    private String modifyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagList")
    private java.util.List < TagList> tagList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagRelation")
    private String tagRelation;

    private ModifyAddressBookRequest(Builder builder) {
        super(builder);
        this.addressList = builder.addressList;
        this.autoAddTagEcs = builder.autoAddTagEcs;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.groupUuid = builder.groupUuid;
        this.lang = builder.lang;
        this.modifyMode = builder.modifyMode;
        this.sourceIp = builder.sourceIp;
        this.tagList = builder.tagList;
        this.tagRelation = builder.tagRelation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAddressBookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressList
     */
    public String getAddressList() {
        return this.addressList;
    }

    /**
     * @return autoAddTagEcs
     */
    public String getAutoAddTagEcs() {
        return this.autoAddTagEcs;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupUuid
     */
    public String getGroupUuid() {
        return this.groupUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return tagList
     */
    public java.util.List < TagList> getTagList() {
        return this.tagList;
    }

    /**
     * @return tagRelation
     */
    public String getTagRelation() {
        return this.tagRelation;
    }

    public static final class Builder extends Request.Builder<ModifyAddressBookRequest, Builder> {
        private String addressList; 
        private String autoAddTagEcs; 
        private String description; 
        private String groupName; 
        private String groupUuid; 
        private String lang; 
        private String modifyMode; 
        private String sourceIp; 
        private java.util.List < TagList> tagList; 
        private String tagRelation; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAddressBookRequest request) {
            super(request);
            this.addressList = request.addressList;
            this.autoAddTagEcs = request.autoAddTagEcs;
            this.description = request.description;
            this.groupName = request.groupName;
            this.groupUuid = request.groupUuid;
            this.lang = request.lang;
            this.modifyMode = request.modifyMode;
            this.sourceIp = request.sourceIp;
            this.tagList = request.tagList;
            this.tagRelation = request.tagRelation;
        } 

        /**
         * The addresses in the address book. Separate multiple addresses with commas (,). If you set GroupType to **ip**, **port**, or **domain**, you must specify this parameter.
         * <p>
         * 
         * *   If you set GroupType to **ip**, you must specify IP addresses for the address book. Example: 1.2.XX.XX/32,1.2.XX.XX/24.
         * *   If you set GroupType to **port**, you must specify port numbers or port ranges for the address book. Example: 80/80,100/200.
         * *   If you set GroupType to **domain**, you must specify domain names for the address book. Example: demo1.aliyun.com,demo2.aliyun.com.
         */
        public Builder addressList(String addressList) {
            this.putQueryParameter("AddressList", addressList);
            this.addressList = addressList;
            return this;
        }

        /**
         * Specifies whether to automatically add public IP addresses of Elastic Compute Service (ECS) instances to the address book if the instances match the specified tags. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder autoAddTagEcs(String autoAddTagEcs) {
            this.putQueryParameter("AutoAddTagEcs", autoAddTagEcs);
            this.autoAddTagEcs = autoAddTagEcs;
            return this;
        }

        /**
         * The description of the address book.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the address book.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The ID of the address book.
         * <p>
         * 
         * >  To modify the address book, you must provide the ID of the address book. You can call the [DescribeAddressBook](~~138869~~) operation to query the ID.
         */
        public Builder groupUuid(String groupUuid) {
            this.putQueryParameter("GroupUuid", groupUuid);
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Modification mode with the following values:
         * <p>
         * 
         * - **Cover**: Use the value of the AddressList parameter to overwrite the original address book.
         * - **Append**: After the original address book, append addresses using the value of the AddressList parameter.
         * - **Delete**: Delete addresses using the value of the AddressList parameter from the address book.
         * 
         * >When GroupType is **ip**, **ipv6**, **port**, or **domain**, if this parameter is not configured, the default is to use the **Cover** method to modify the address book.
         * ><notice>When GroupType is **tag**, this parameter must be empty.</notice>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The ECS tags that you want to match.
         */
        public Builder tagList(java.util.List < TagList> tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * The logical relationship among ECS tags. Valid values:
         * <p>
         * 
         * *   **and**: Only the public IP addresses of ECS instances that match all the specified tags can be added to the address book.
         * *   **or**: The public IP addresses of ECS instances that match one of the specified tags can be added to the address book.
         */
        public Builder tagRelation(String tagRelation) {
            this.putQueryParameter("TagRelation", tagRelation);
            this.tagRelation = tagRelation;
            return this;
        }

        @Override
        public ModifyAddressBookRequest build() {
            return new ModifyAddressBookRequest(this);
        } 

    } 

    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TagList(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The key of ECS tag N that you want to match.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of ECS tag N that you want to match.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
}
