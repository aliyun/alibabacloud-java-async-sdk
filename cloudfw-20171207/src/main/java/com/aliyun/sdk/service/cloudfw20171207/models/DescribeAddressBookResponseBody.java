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
 * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAddressBookResponseBody</p>
 */
public class DescribeAddressBookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Acls")
    private java.util.List<Acls> acls;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private String pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeAddressBookResponseBody(Builder builder) {
        this.acls = builder.acls;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddressBookResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acls
     */
    public java.util.List<Acls> getAcls() {
        return this.acls;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Acls> acls; 
        private String pageNo; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAddressBookResponseBody model) {
            this.acls = model.acls;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the address book.</p>
         */
        public Builder acls(java.util.List<Acls> acls) {
            this.acls = acls;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B36F150A-1E27-43AA-B72C-D2AC712F09DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the returned address books.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAddressBookResponseBody build() {
            return new DescribeAddressBookResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddressBookResponseBody</p>
     */
    public static class Addresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        private Addresses(Builder builder) {
            this.address = builder.address;
            this.note = builder.note;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addresses create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        public static final class Builder {
            private String address; 
            private String note; 

            private Builder() {
            } 

            private Builder(Addresses model) {
                this.address = model.address;
                this.note = model.note;
            } 

            /**
             * <p>Address information in the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1/32</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Single address description.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            public Addresses build() {
                return new Addresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddressBookResponseBody</p>
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
             * <p>company</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the ECS tag.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
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
    /**
     * 
     * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddressBookResponseBody</p>
     */
    public static class Acls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressList")
        private java.util.List<String> addressList;

        @com.aliyun.core.annotation.NameInMap("AddressListCount")
        private Integer addressListCount;

        @com.aliyun.core.annotation.NameInMap("Addresses")
        private java.util.List<Addresses> addresses;

        @com.aliyun.core.annotation.NameInMap("AutoAddTagEcs")
        private Integer autoAddTagEcs;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("GroupUuid")
        private String groupUuid;

        @com.aliyun.core.annotation.NameInMap("ReferenceCount")
        private Integer referenceCount;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<TagList> tagList;

        @com.aliyun.core.annotation.NameInMap("TagRelation")
        private String tagRelation;

        private Acls(Builder builder) {
            this.addressList = builder.addressList;
            this.addressListCount = builder.addressListCount;
            this.addresses = builder.addresses;
            this.autoAddTagEcs = builder.autoAddTagEcs;
            this.description = builder.description;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.groupUuid = builder.groupUuid;
            this.referenceCount = builder.referenceCount;
            this.tagList = builder.tagList;
            this.tagRelation = builder.tagRelation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acls create() {
            return builder().build();
        }

        /**
         * @return addressList
         */
        public java.util.List<String> getAddressList() {
            return this.addressList;
        }

        /**
         * @return addressListCount
         */
        public Integer getAddressListCount() {
            return this.addressListCount;
        }

        /**
         * @return addresses
         */
        public java.util.List<Addresses> getAddresses() {
            return this.addresses;
        }

        /**
         * @return autoAddTagEcs
         */
        public Integer getAutoAddTagEcs() {
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
         * @return groupUuid
         */
        public String getGroupUuid() {
            return this.groupUuid;
        }

        /**
         * @return referenceCount
         */
        public Integer getReferenceCount() {
            return this.referenceCount;
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

        public static final class Builder {
            private java.util.List<String> addressList; 
            private Integer addressListCount; 
            private java.util.List<Addresses> addresses; 
            private Integer autoAddTagEcs; 
            private String description; 
            private String groupName; 
            private String groupType; 
            private String groupUuid; 
            private Integer referenceCount; 
            private java.util.List<TagList> tagList; 
            private String tagRelation; 

            private Builder() {
            } 

            private Builder(Acls model) {
                this.addressList = model.addressList;
                this.addressListCount = model.addressListCount;
                this.addresses = model.addresses;
                this.autoAddTagEcs = model.autoAddTagEcs;
                this.description = model.description;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.groupUuid = model.groupUuid;
                this.referenceCount = model.referenceCount;
                this.tagList = model.tagList;
                this.tagRelation = model.tagRelation;
            } 

            /**
             * <p>The addresses in the address book.</p>
             */
            public Builder addressList(java.util.List<String> addressList) {
                this.addressList = addressList;
                return this;
            }

            /**
             * <p>The number of addresses in the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder addressListCount(Integer addressListCount) {
                this.addressListCount = addressListCount;
                return this;
            }

            /**
             * <p>A list of addresses in the address book, each with a single address description.</p>
             */
            public Builder addresses(java.util.List<Addresses> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>Indicates whether the public IP addresses of ECS instances are automatically added to the address book if the instances match the specified tags. The setting takes effect on both newly purchased ECS instances whose tag settings are complete and ECS instances whose tag settings are modified. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoAddTagEcs(Integer autoAddTagEcs) {
                this.autoAddTagEcs = autoAddTagEcs;
                return this;
            }

            /**
             * <p>The description of the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>my address book</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_address_book</p>
             */
            public Builder groupName(String groupName) {
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
             * <li><strong>allCloud</strong>: cloud service address book</li>
             * <li><strong>threat</strong>: threat intelligence address book</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The UUID of the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>f04ac7ce-628b-4cb7-be61-310222b7****</p>
             */
            public Builder groupUuid(String groupUuid) {
                this.groupUuid = groupUuid;
                return this;
            }

            /**
             * <p>The number of times that the address book is referenced.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder referenceCount(Integer referenceCount) {
                this.referenceCount = referenceCount;
                return this;
            }

            /**
             * <p>The details about the ECS tags that can be automatically added to the address book.</p>
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The logical relationship among ECS tags. Valid values:</p>
             * <ul>
             * <li><strong>and</strong>: Only the public IP addresses of ECS instances that match all the specified tags can be added to the address book.</li>
             * <li><strong>or</strong>: The public IP addresses of ECS instances that match any of the specified tags can be added to the address book.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>and</p>
             */
            public Builder tagRelation(String tagRelation) {
                this.tagRelation = tagRelation;
                return this;
            }

            public Acls build() {
                return new Acls(this);
            } 

        } 

    }
}
