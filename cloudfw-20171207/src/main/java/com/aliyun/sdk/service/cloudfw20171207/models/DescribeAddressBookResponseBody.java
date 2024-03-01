// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAddressBookResponseBody</p>
 */
public class DescribeAddressBookResponseBody extends TeaModel {
    @NameInMap("Acls")
    private java.util.List < Acls> acls;

    @NameInMap("PageNo")
    private String pageNo;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return acls
     */
    public java.util.List < Acls> getAcls() {
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
        private java.util.List < Acls> acls; 
        private String pageNo; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * The information about the address book.
         */
        public Builder acls(java.util.List < Acls> acls) {
            this.acls = acls;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of the returned address books.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAddressBookResponseBody build() {
            return new DescribeAddressBookResponseBody(this);
        } 

    } 

    public static class TagList extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
             * The key of the ECS tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the ECS tag.
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
    public static class Acls extends TeaModel {
        @NameInMap("AddressList")
        private java.util.List < String > addressList;

        @NameInMap("AddressListCount")
        private Integer addressListCount;

        @NameInMap("AutoAddTagEcs")
        private Integer autoAddTagEcs;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("GroupUuid")
        private String groupUuid;

        @NameInMap("ReferenceCount")
        private Integer referenceCount;

        @NameInMap("TagList")
        private java.util.List < TagList> tagList;

        @NameInMap("TagRelation")
        private String tagRelation;

        private Acls(Builder builder) {
            this.addressList = builder.addressList;
            this.addressListCount = builder.addressListCount;
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
        public java.util.List < String > getAddressList() {
            return this.addressList;
        }

        /**
         * @return addressListCount
         */
        public Integer getAddressListCount() {
            return this.addressListCount;
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
        public java.util.List < TagList> getTagList() {
            return this.tagList;
        }

        /**
         * @return tagRelation
         */
        public String getTagRelation() {
            return this.tagRelation;
        }

        public static final class Builder {
            private java.util.List < String > addressList; 
            private Integer addressListCount; 
            private Integer autoAddTagEcs; 
            private String description; 
            private String groupName; 
            private String groupType; 
            private String groupUuid; 
            private Integer referenceCount; 
            private java.util.List < TagList> tagList; 
            private String tagRelation; 

            /**
             * The addresses in the address book.
             */
            public Builder addressList(java.util.List < String > addressList) {
                this.addressList = addressList;
                return this;
            }

            /**
             * The number of addresses in the address book.
             */
            public Builder addressListCount(Integer addressListCount) {
                this.addressListCount = addressListCount;
                return this;
            }

            /**
             * Indicates whether the public IP addresses of ECS instances are automatically added to the address book if the instances match the specified tags. The setting takes effect on both newly purchased ECS instances whose tag settings are complete and ECS instances whose tag settings are modified. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder autoAddTagEcs(Integer autoAddTagEcs) {
                this.autoAddTagEcs = autoAddTagEcs;
                return this;
            }

            /**
             * The description of the address book.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the address book.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The type of the address book. Valid values:
             * <p>
             * 
             * *   **ip**: IP address book
             * *   **domain**: domain address book
             * *   **port**: port address book
             * *   **tag**: ECS tag-based address book
             * *   **allCloud**: cloud service address book
             * *   **threat**: threat intelligence address book
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * The UUID of the address book.
             */
            public Builder groupUuid(String groupUuid) {
                this.groupUuid = groupUuid;
                return this;
            }

            /**
             * The number of times that the address book is referenced.
             */
            public Builder referenceCount(Integer referenceCount) {
                this.referenceCount = referenceCount;
                return this;
            }

            /**
             * The details about the ECS tags that can be automatically added to the address book.
             */
            public Builder tagList(java.util.List < TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * The logical relationship among ECS tags. Valid values:
             * <p>
             * 
             * *   **and**: Only the public IP addresses of ECS instances that match all the specified tags can be added to the address book.
             * *   **or**: The public IP addresses of ECS instances that match any of the specified tags can be added to the address book.
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
