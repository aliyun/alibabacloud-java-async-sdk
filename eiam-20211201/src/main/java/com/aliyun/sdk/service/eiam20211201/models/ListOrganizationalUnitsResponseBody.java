// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListOrganizationalUnitsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationalUnitsResponseBody</p>
 */
public class ListOrganizationalUnitsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnits")
    private java.util.List<OrganizationalUnits> organizationalUnits;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<OrganizationalUnits> getOrganizationalUnits() {
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
        private java.util.List<OrganizationalUnits> organizationalUnits; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The list of data objects of organizational units.</p>
         */
        public Builder organizationalUnits(java.util.List<OrganizationalUnits> organizationalUnits) {
            this.organizationalUnits = organizationalUnits;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOrganizationalUnitsResponseBody build() {
            return new ListOrganizationalUnitsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOrganizationalUnitsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrganizationalUnitsResponseBody</p>
     */
    public static class OrganizationalUnits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Leaf")
        private Boolean leaf;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitExternalId")
        private String organizationalUnitExternalId;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitId")
        private String organizationalUnitId;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitName")
        private String organizationalUnitName;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitSourceId")
        private String organizationalUnitSourceId;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitSourceType")
        private String organizationalUnitSourceType;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The time when the organizational unit was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the organizational unit.</p>
             * 
             * <strong>example:</strong>
             * <p>Test organizational unit</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the node is a leaf node.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder leaf(Boolean leaf) {
                this.leaf = leaf;
                return this;
            }

            /**
             * <p>The external ID of the organizational unit. The external ID can be used by external data to map the data of the organizational unit in IDaaS EIAM. By default, the external ID is the organizational unit ID.</p>
             * <p>For organizational units with the same source type and source ID, each organizational unit has a unique external ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
             */
            public Builder organizationalUnitExternalId(String organizationalUnitExternalId) {
                this.organizationalUnitExternalId = organizationalUnitExternalId;
                return this;
            }

            /**
             * <p>The ID of the organizational unit.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
             */
            public Builder organizationalUnitId(String organizationalUnitId) {
                this.organizationalUnitId = organizationalUnitId;
                return this;
            }

            /**
             * <p>组织名称。</p>
             * 
             * <strong>example:</strong>
             * <p>test_organizationalUnit_name</p>
             */
            public Builder organizationalUnitName(String organizationalUnitName) {
                this.organizationalUnitName = organizationalUnitName;
                return this;
            }

            /**
             * <p>The source ID of the organizational unit.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder organizationalUnitSourceId(String organizationalUnitSourceId) {
                this.organizationalUnitSourceId = organizationalUnitSourceId;
                return this;
            }

            /**
             * <p>The source type of the organizational unit. Valid values:</p>
             * <ul>
             * <li>build_in: The organizational unit was created in IDaaS.</li>
             * <li>ding_talk: The organizational unit was imported from DingTalk.</li>
             * <li>ad: The organizational unit was imported from Microsoft Active Directory (AD).</li>
             * <li>ldap: The organizational unit was imported from a Lightweight Directory Access Protocol (LDAP) service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>build_in</p>
             */
            public Builder organizationalUnitSourceType(String organizationalUnitSourceType) {
                this.organizationalUnitSourceType = organizationalUnitSourceType;
                return this;
            }

            /**
             * <p>The ID of the parent organizational unit.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The time when the organizational unit was last updated. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
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
