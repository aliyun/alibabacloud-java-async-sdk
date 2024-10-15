// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The addresses in the address book. Separate multiple addresses with commas (,). If you set GroupType to <strong>ip</strong>, <strong>port</strong>, or <strong>domain</strong>, you must specify this parameter.</p>
         * <ul>
         * <li>If you set GroupType to <strong>ip</strong>, you must specify IP addresses for the address book. Example: 1.2.XX.XX/32,1.2.XX.XX/24.</li>
         * <li>If you set GroupType to <strong>port</strong>, you must specify port numbers or port ranges for the address book. Example: 80/80,100/200.</li>
         * <li>If you set GroupType to <strong>domain</strong>, you must specify domain names for the address book. Example: demo1.aliyun.com,demo2.aliyun.com.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/32, 192.0.XX.XX/24</p>
         */
        public Builder addressList(String addressList) {
            this.putQueryParameter("AddressList", addressList);
            this.addressList = addressList;
            return this;
        }

        /**
         * <p>Specifies whether to automatically add public IP addresses of Elastic Compute Service (ECS) instances to the address book if the instances match the specified tags. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoAddTagEcs(String autoAddTagEcs) {
            this.putQueryParameter("AutoAddTagEcs", autoAddTagEcs);
            this.autoAddTagEcs = autoAddTagEcs;
            return this;
        }

        /**
         * <p>The description of the address book.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bj-001</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the address book.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bj-001</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The ID of the address book.</p>
         * <blockquote>
         * <p> To modify the address book, you must provide the ID of the address book. You can call the <a href="https://help.aliyun.com/document_detail/138869.html">DescribeAddressBook</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0657ab9d-fe8b-4174-b2a6-6baf358e****</p>
         */
        public Builder groupUuid(String groupUuid) {
            this.putQueryParameter("GroupUuid", groupUuid);
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Modification mode with the following values:</p>
         * <ul>
         * <li><strong>Cover</strong>: Use the value of the AddressList parameter to overwrite the original address book.</li>
         * <li><strong>Append</strong>: After the original address book, append addresses using the value of the AddressList parameter.</li>
         * <li><strong>Delete</strong>: Delete addresses using the value of the AddressList parameter from the address book.</li>
         * </ul>
         * <blockquote>
         * <p>When GroupType is <strong>ip</strong>, <strong>ipv6</strong>, <strong>port</strong>, or <strong>domain</strong>, if this parameter is not configured, the default is to use the <strong>Cover</strong> method to modify the address book.
         * Notice: When GroupType is <strong>tag</strong>, this parameter must be empty.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The ECS tags that you want to match.</p>
         */
        public Builder tagList(java.util.List < TagList> tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * <p>The logical relationship among ECS tags. Valid values:</p>
         * <ul>
         * <li><strong>and</strong>: Only the public IP addresses of ECS instances that match all the specified tags can be added to the address book.</li>
         * <li><strong>or</strong>: The public IP addresses of ECS instances that match one of the specified tags can be added to the address book.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>and</p>
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

    /**
     * 
     * {@link ModifyAddressBookRequest} extends {@link TeaModel}
     *
     * <p>ModifyAddressBookRequest</p>
     */
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
             * <p>The key of ECS tag N that you want to match.</p>
             * 
             * <strong>example:</strong>
             * <p>TXY</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of ECS tag N that you want to match.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
