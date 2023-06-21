// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrganizationalUnitsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationalUnitsResponseBody</p>
 */
public class ListOrganizationalUnitsResponseBody extends TeaModel {
    @NameInMap("OrganizationalUnits")
    private java.util.List < OrganizationalUnits> organizationalUnits;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListOrganizationalUnitsResponseBody(Builder builder) {
        this.organizationalUnits = builder.organizationalUnits;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationalUnitsResponseBody create() {
        return builder().build();
    }

    /**
     * @return organizationalUnits
     */
    public java.util.List < OrganizationalUnits> getOrganizationalUnits() {
        return this.organizationalUnits;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < OrganizationalUnits> organizationalUnits; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The list of data objects of organizational units.
         */
        public Builder organizationalUnits(java.util.List < OrganizationalUnits> organizationalUnits) {
            this.organizationalUnits = organizationalUnits;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries in the list.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOrganizationalUnitsResponseBody build() {
            return new ListOrganizationalUnitsResponseBody(this);
        } 

    } 

    public static class OrganizationalUnits extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Leaf")
        private Boolean leaf;

        @NameInMap("OrganizationalUnitExternalId")
        private String organizationalUnitExternalId;

        @NameInMap("OrganizationalUnitId")
        private String organizationalUnitId;

        @NameInMap("OrganizationalUnitName")
        private String organizationalUnitName;

        @NameInMap("OrganizationalUnitSourceId")
        private String organizationalUnitSourceId;

        @NameInMap("OrganizationalUnitSourceType")
        private String organizationalUnitSourceType;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private OrganizationalUnits(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.leaf = builder.leaf;
            this.organizationalUnitExternalId = builder.organizationalUnitExternalId;
            this.organizationalUnitId = builder.organizationalUnitId;
            this.organizationalUnitName = builder.organizationalUnitName;
            this.organizationalUnitSourceId = builder.organizationalUnitSourceId;
            this.organizationalUnitSourceType = builder.organizationalUnitSourceType;
            this.parentId = builder.parentId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnits create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return leaf
         */
        public Boolean getLeaf() {
            return this.leaf;
        }

        /**
         * @return organizationalUnitExternalId
         */
        public String getOrganizationalUnitExternalId() {
            return this.organizationalUnitExternalId;
        }

        /**
         * @return organizationalUnitId
         */
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        /**
         * @return organizationalUnitName
         */
        public String getOrganizationalUnitName() {
            return this.organizationalUnitName;
        }

        /**
         * @return organizationalUnitSourceId
         */
        public String getOrganizationalUnitSourceId() {
            return this.organizationalUnitSourceId;
        }

        /**
         * @return organizationalUnitSourceType
         */
        public String getOrganizationalUnitSourceType() {
            return this.organizationalUnitSourceType;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private String instanceId; 
            private Boolean leaf; 
            private String organizationalUnitExternalId; 
            private String organizationalUnitId; 
            private String organizationalUnitName; 
            private String organizationalUnitSourceId; 
            private String organizationalUnitSourceType; 
            private String parentId; 
            private Long updateTime; 

            /**
             * The time when the organizational unit was created. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the organizational unit.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the node is a leaf node.
             */
            public Builder leaf(Boolean leaf) {
                this.leaf = leaf;
                return this;
            }

            /**
             * The external ID of the organizational unit. The external ID can be used by external data to map the data of the organizational unit in IDaaS EIAM. By default, the external ID is the organizational unit ID.
             * <p>
             * 
             * For organizational units with the same source type and source ID, each organizational unit has a unique external ID.
             */
            public Builder organizationalUnitExternalId(String organizationalUnitExternalId) {
                this.organizationalUnitExternalId = organizationalUnitExternalId;
                return this;
            }

            /**
             * The ID of the organizational unit.
             */
            public Builder organizationalUnitId(String organizationalUnitId) {
                this.organizationalUnitId = organizationalUnitId;
                return this;
            }

            /**
             * 组织名称。
             */
            public Builder organizationalUnitName(String organizationalUnitName) {
                this.organizationalUnitName = organizationalUnitName;
                return this;
            }

            /**
             * The source ID of the organizational unit.
             */
            public Builder organizationalUnitSourceId(String organizationalUnitSourceId) {
                this.organizationalUnitSourceId = organizationalUnitSourceId;
                return this;
            }

            /**
             * The source type of the organizational unit. Valid values:
             * <p>
             * 
             * *   build_in: The organizational unit was created in IDaaS.
             * *   ding_talk: The organizational unit was imported from DingTalk.
             * *   ad: The organizational unit was imported from Microsoft Active Directory (AD).
             * *   ldap: The organizational unit was imported from a Lightweight Directory Access Protocol (LDAP) service.
             */
            public Builder organizationalUnitSourceType(String organizationalUnitSourceType) {
                this.organizationalUnitSourceType = organizationalUnitSourceType;
                return this;
            }

            /**
             * The ID of the parent organizational unit.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The time when the organizational unit was last updated. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public OrganizationalUnits build() {
                return new OrganizationalUnits(this);
            } 

        } 

    }
}
