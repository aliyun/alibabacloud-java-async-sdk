// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link AddAddressBookRequest} extends {@link RequestModel}
 *
 * <p>AddAddressBookRequest</p>
 */
public class AddAddressBookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressList")
    private String addressList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoAddTagEcs")
    private String autoAddTagEcs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256, minLength = 2)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagList")
    private java.util.List<TagList> tagList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagRelation")
    private String tagRelation;

    private AddAddressBookRequest(Builder builder) {
        super(builder);
        this.addressList = builder.addressList;
        this.autoAddTagEcs = builder.autoAddTagEcs;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.tagList = builder.tagList;
        this.tagRelation = builder.tagRelation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAddressBookRequest create() {
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
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
    public java.util.List<TagList> getTagList() {
        return this.tagList;
    }

    /**
     * @return tagRelation
     */
    public String getTagRelation() {
        return this.tagRelation;
    }

    public static final class Builder extends Request.Builder<AddAddressBookRequest, Builder> {
        private String addressList; 
        private String autoAddTagEcs; 
        private String description; 
        private String groupName; 
        private String groupType; 
        private String lang; 
        private String sourceIp; 
        private java.util.List<TagList> tagList; 
        private String tagRelation; 

        private Builder() {
            super();
        } 

        private Builder(AddAddressBookRequest request) {
            super(request);
            this.addressList = request.addressList;
            this.autoAddTagEcs = request.autoAddTagEcs;
            this.description = request.description;
            this.groupName = request.groupName;
            this.groupType = request.groupType;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.tagList = request.tagList;
            this.tagRelation = request.tagRelation;
        } 

        /**
         * <p>The addresses that you want to add to the address book. Separate multiple addresses with commas (,).</p>
         * <blockquote>
         * <p> If you set GroupType to <code>ip</code>, <code>port</code> or <code>domain</code>, you must specify AddressList.</p>
         * </blockquote>
         * <ul>
         * <li>If you set GroupType to <code>ip</code>, you must add IP addresses to the address book. Example: 192.0.XX.XX/32,192.0.XX.XX/24.</li>
         * <li>If you set GroupType to <code>port</code>, you must add port numbers or port ranges to the address book. Example: 80,100/200.</li>
         * <li>If you set GroupType to <code>domain</code>, you must add domain names to the address book. Example: example.com,aliyundoc.com.</li>
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
         * <p>Specifies whether to automatically add public IP addresses of ECS instances to the address book if the instances match the specified tags. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong> (default): no</li>
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
         * <p>sz-001</p>
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
         * <p>sz-001</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The type of the address book. Valid values:</p>
         * <ul>
         * <li><strong>ip</strong>: IP address book</li>
         * <li><strong>domain</strong>: domain address book</li>
         * <li><strong>port</strong>: port address book</li>
         * <li><strong>tag</strong>: ECS tag-based address book</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
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
        public Builder tagList(java.util.List<TagList> tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * <p>The logical relation among the ECS tags that you want to match. Valid values:</p>
         * <ul>
         * <li><strong>and</strong> (default): Only the public IP addresses of ECS instances that match all the specified tags can be added to the address book.</li>
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
        public AddAddressBookRequest build() {
            return new AddAddressBookRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddAddressBookRequest} extends {@link TeaModel}
     *
     * <p>AddAddressBookRequest</p>
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

            private Builder() {
            } 

            private Builder(TagList model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The key of the ECS tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TXY</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the ECS tag.</p>
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
