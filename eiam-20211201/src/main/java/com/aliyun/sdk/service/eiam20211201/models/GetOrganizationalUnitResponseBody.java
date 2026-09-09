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
 * {@link GetOrganizationalUnitResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrganizationalUnitResponseBody</p>
 */
public class GetOrganizationalUnitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnit")
    private OrganizationalUnit organizationalUnit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOrganizationalUnitResponseBody(Builder builder) {
        this.organizationalUnit = builder.organizationalUnit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrganizationalUnitResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationalUnit
     */
    public OrganizationalUnit getOrganizationalUnit() {
        return this.organizationalUnit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OrganizationalUnit organizationalUnit; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetOrganizationalUnitResponseBody model) {
            this.organizationalUnit = model.organizationalUnit;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Organizational unit data object.</p>
         */
        public Builder organizationalUnit(OrganizationalUnit organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOrganizationalUnitResponseBody build() {
            return new GetOrganizationalUnitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOrganizationalUnitResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrganizationalUnitResponseBody</p>
     */
    public static class OrganizationalUnit extends TeaModel {
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

        private OrganizationalUnit(Builder builder) {
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

        public static OrganizationalUnit create() {
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

            private Builder() {
            } 

            private Builder(OrganizationalUnit model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.leaf = model.leaf;
                this.organizationalUnitExternalId = model.organizationalUnitExternalId;
                this.organizationalUnitId = model.organizationalUnitId;
                this.organizationalUnitName = model.organizationalUnitName;
                this.organizationalUnitSourceId = model.organizationalUnitSourceId;
                this.organizationalUnitSourceType = model.organizationalUnitSourceType;
                this.parentId = model.parentId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the organizational unit was created, in Unix timestamp format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Description of the organizational unit.</p>
             * 
             * <strong>example:</strong>
             * <p>Test organization</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the organizational unit is a leaf node. A value of true indicates that the organizational unit has no child nodes, and a value of false indicates that the organizational unit has child nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder leaf(Boolean leaf) {
                this.leaf = leaf;
                return this;
            }

            /**
             * <p>Organizational unit external ID, used for mapping between external data and IDaaS organizational units. The default value is the IDaaS organizational unit ID.</p>
             * <p>Note: The external ID is unique within the same source type and source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
             */
            public Builder organizationalUnitExternalId(String organizationalUnitExternalId) {
                this.organizationalUnitExternalId = organizationalUnitExternalId;
                return this;
            }

            /**
             * <p>Organizational unit ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
             */
            public Builder organizationalUnitId(String organizationalUnitId) {
                this.organizationalUnitId = organizationalUnitId;
                return this;
            }

            /**
             * <p>Organizational unit name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_organizationalUnit_name</p>
             */
            public Builder organizationalUnitName(String organizationalUnitName) {
                this.organizationalUnitName = organizationalUnitName;
                return this;
            }

            /**
             * <p>Organizational unit source ID.</p>
             * <p>The default value for the self-built type is the instance ID. For other types, the value corresponds to the enterprise ID of the respective source. For example, the DingTalk source corresponds to the corpId of the DingTalk enterprise.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder organizationalUnitSourceId(String organizationalUnitSourceId) {
                this.organizationalUnitSourceId = organizationalUnitSourceId;
                return this;
            }

            /**
             * <p>Account source type. Valid values:</p>
             * <ul>
             * <li>build_in: self-built.</li>
             * <li>ding_talk: imported from DingTalk.</li>
             * <li>ad: imported from AD.</li>
             * <li>ldap: imported from LDAP.</li>
             * <li>we_com: imported from WeCom.</li>
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
             * <p>Parent organizational unit ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The time when the organizational unit was last updated, in Unix timestamp format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public OrganizationalUnit build() {
                return new OrganizationalUnit(this);
            } 

        } 

    }
}
