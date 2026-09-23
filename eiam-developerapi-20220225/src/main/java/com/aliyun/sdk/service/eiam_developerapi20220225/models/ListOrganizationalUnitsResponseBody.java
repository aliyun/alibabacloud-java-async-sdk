// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link ListOrganizationalUnitsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationalUnitsResponseBody</p>
 */
public class ListOrganizationalUnitsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListOrganizationalUnitsResponseBody(Builder builder) {
        this.data = builder.data;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationalUnitsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListOrganizationalUnitsResponseBody model) {
            this.data = model.data;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of data objects.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("organizationalUnitExternalId")
        private String organizationalUnitExternalId;

        @com.aliyun.core.annotation.NameInMap("organizationalUnitId")
        private String organizationalUnitId;

        @com.aliyun.core.annotation.NameInMap("organizationalUnitName")
        private String organizationalUnitName;

        @com.aliyun.core.annotation.NameInMap("organizationalUnitSourceId")
        private String organizationalUnitSourceId;

        @com.aliyun.core.annotation.NameInMap("organizationalUnitSourceType")
        private String organizationalUnitSourceType;

        @com.aliyun.core.annotation.NameInMap("parentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
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

        public static Data create() {
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
            private String organizationalUnitExternalId; 
            private String organizationalUnitId; 
            private String organizationalUnitName; 
            private String organizationalUnitSourceId; 
            private String organizationalUnitSourceType; 
            private String parentId; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.organizationalUnitExternalId = model.organizationalUnitExternalId;
                this.organizationalUnitId = model.organizationalUnitId;
                this.organizationalUnitName = model.organizationalUnitName;
                this.organizationalUnitSourceId = model.organizationalUnitSourceId;
                this.organizationalUnitSourceType = model.organizationalUnitSourceType;
                this.parentId = model.parentId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the organization was created. This is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652083425923</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the organization.</p>
             * 
             * <strong>example:</strong>
             * <p>测试组织</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The external ID of the organization. This ID is used to map external data to the organization\&quot;s data in IDaaS. The default value is the IDaaS organization ID.</p>
             * <p>Note: The external ID must be unique for the same source type and source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
             */
            public Builder organizationalUnitExternalId(String organizationalUnitExternalId) {
                this.organizationalUnitExternalId = organizationalUnitExternalId;
                return this;
            }

            /**
             * <p>The organization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
             */
            public Builder organizationalUnitId(String organizationalUnitId) {
                this.organizationalUnitId = organizationalUnitId;
                return this;
            }

            /**
             * <p>The organization name.</p>
             * 
             * <strong>example:</strong>
             * <p>name001</p>
             */
            public Builder organizationalUnitName(String organizationalUnitName) {
                this.organizationalUnitName = organizationalUnitName;
                return this;
            }

            /**
             * <p>The source ID of the organization.</p>
             * <p>For the \<code>build_in\\</code> type, the default value is the instance ID. For other types, the value is the enterprise ID from the source. For example, if the source is DingTalk, the value is the \<code>corpId\\</code> of the DingTalk enterprise.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder organizationalUnitSourceId(String organizationalUnitSourceId) {
                this.organizationalUnitSourceId = organizationalUnitSourceId;
                return this;
            }

            /**
             * <p>The source type of the organization. Valid values:</p>
             * <ul>
             * <li><p>\<code>build_in\\</code>: The organization is created in IDaaS.</p>
             * </li>
             * <li><p>\<code>ding_talk\\</code>: The organization is imported from DingTalk.</p>
             * </li>
             * <li><p>\<code>ad\\</code>: The organization is imported from Active Directory (AD).</p>
             * </li>
             * <li><p>\<code>ldap\\</code>: The organization is imported from LDAP.</p>
             * </li>
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
             * <p>The parent organization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The time when the organization was last updated. This is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652083425923</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
