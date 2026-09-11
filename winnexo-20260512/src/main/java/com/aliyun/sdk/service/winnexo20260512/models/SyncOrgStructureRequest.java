// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link SyncOrgStructureRequest} extends {@link RequestModel}
 *
 * <p>SyncOrgStructureRequest</p>
 */
public class SyncOrgStructureRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("corpId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String corpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("departments")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Departments> departments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("members")
    private java.util.List<Members> members;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("platformType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platformType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ssoSettingsId")
    private String ssoSettingsId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("syncMembers")
    private Boolean syncMembers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private SyncOrgStructureRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.departments = builder.departments;
        this.members = builder.members;
        this.platformType = builder.platformType;
        this.ssoSettingsId = builder.ssoSettingsId;
        this.syncMembers = builder.syncMembers;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncOrgStructureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return departments
     */
    public java.util.List<Departments> getDepartments() {
        return this.departments;
    }

    /**
     * @return members
     */
    public java.util.List<Members> getMembers() {
        return this.members;
    }

    /**
     * @return platformType
     */
    public String getPlatformType() {
        return this.platformType;
    }

    /**
     * @return ssoSettingsId
     */
    public String getSsoSettingsId() {
        return this.ssoSettingsId;
    }

    /**
     * @return syncMembers
     */
    public Boolean getSyncMembers() {
        return this.syncMembers;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<SyncOrgStructureRequest, Builder> {
        private String corpId; 
        private java.util.List<Departments> departments; 
        private java.util.List<Members> members; 
        private String platformType; 
        private String ssoSettingsId; 
        private Boolean syncMembers; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(SyncOrgStructureRequest request) {
            super(request);
            this.corpId = request.corpId;
            this.departments = request.departments;
            this.members = request.members;
            this.platformType = request.platformType;
            this.ssoSettingsId = request.ssoSettingsId;
            this.syncMembers = request.syncMembers;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The enterprise identifier. This value must match the corpId returned by listAvailableConfigs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCorpId</p>
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("corpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * <p>The department list. At least one root department must be included.</p>
         * <p>This parameter is required.</p>
         */
        public Builder departments(java.util.List<Departments> departments) {
            String departmentsShrink = shrink(departments, "departments", "json");
            this.putBodyParameter("departments", departmentsShrink);
            this.departments = departments;
            return this;
        }

        /**
         * <p>The member list. This parameter is required when syncMembers is set to true.</p>
         */
        public Builder members(java.util.List<Members> members) {
            String membersShrink = shrink(members, "members", "json");
            this.putBodyParameter("members", membersShrink);
            this.members = members;
            return this;
        }

        /**
         * <p>The platform type. Valid values: saml, oauth2, or custom.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>saml</p>
         */
        public Builder platformType(String platformType) {
            this.putBodyParameter("platformType", platformType);
            this.platformType = platformType;
            return this;
        }

        /**
         * <p>The SSO configuration ID. For SAML/OAuth2, this parameter is optional. If not specified, the value is automatically derived based on corpId. If multiple IdPs use the same corpId, you must explicitly specify this parameter. Otherwise, an AMBIGUOUS error is returned. This parameter is not required for custom.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSsoSettingsId</p>
         */
        public Builder ssoSettingsId(String ssoSettingsId) {
            this.putBodyParameter("ssoSettingsId", ssoSettingsId);
            this.ssoSettingsId = ssoSettingsId;
            return this;
        }

        /**
         * <p>Specifies whether to synchronize member relationships. In custom mode, this parameter is forced to false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder syncMembers(Boolean syncMembers) {
            this.putBodyParameter("syncMembers", syncMembers);
            this.syncMembers = syncMembers;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public SyncOrgStructureRequest build() {
            return new SyncOrgStructureRequest(this);
        } 

    } 

    /**
     * 
     * {@link SyncOrgStructureRequest} extends {@link TeaModel}
     *
     * <p>SyncOrgStructureRequest</p>
     */
    public static class Departments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deptId")
        private String deptId;

        @com.aliyun.core.annotation.NameInMap("deptName")
        private String deptName;

        @com.aliyun.core.annotation.NameInMap("order")
        private Long order;

        @com.aliyun.core.annotation.NameInMap("parentDeptId")
        private String parentDeptId;

        private Departments(Builder builder) {
            this.deptId = builder.deptId;
            this.deptName = builder.deptName;
            this.order = builder.order;
            this.parentDeptId = builder.parentDeptId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Departments create() {
            return builder().build();
        }

        /**
         * @return deptId
         */
        public String getDeptId() {
            return this.deptId;
        }

        /**
         * @return deptName
         */
        public String getDeptName() {
            return this.deptName;
        }

        /**
         * @return order
         */
        public Long getOrder() {
            return this.order;
        }

        /**
         * @return parentDeptId
         */
        public String getParentDeptId() {
            return this.parentDeptId;
        }

        public static final class Builder {
            private String deptId; 
            private String deptName; 
            private Long order; 
            private String parentDeptId; 

            private Builder() {
            } 

            private Builder(Departments model) {
                this.deptId = model.deptId;
                this.deptName = model.deptName;
                this.order = model.order;
                this.parentDeptId = model.parentDeptId;
            } 

            /**
             * <p>The department ID. This is an external identifier. The client is responsible for ensuring uniqueness.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleDeptId</p>
             */
            public Builder deptId(String deptId) {
                this.deptId = deptId;
                return this;
            }

            /**
             * <p>The department name.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            /**
             * <p>The sort order. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Long order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The parent department ID. A value of null indicates a top-level department or root department.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleParentDeptId</p>
             */
            public Builder parentDeptId(String parentDeptId) {
                this.parentDeptId = parentDeptId;
                return this;
            }

            public Departments build() {
                return new Departments(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncOrgStructureRequest} extends {@link TeaModel}
     *
     * <p>SyncOrgStructureRequest</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("deptId")
        private String deptId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Members(Builder builder) {
            this.accountId = builder.accountId;
            this.deptId = builder.deptId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return deptId
         */
        public String getDeptId() {
            return this.deptId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String accountId; 
            private String deptId; 
            private String name; 

            private Builder() {
            } 

            private Builder(Members model) {
                this.accountId = model.accountId;
                this.deptId = model.deptId;
                this.name = model.name;
            } 

            /**
             * <p>The user identifier. In the SAML scenario, this is an email address or UPN, which must match rbj_user_account.account_id.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleAccountId</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The department ID to which the member belongs. This value must correspond to a deptId in the departments list.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleDeptId</p>
             */
            public Builder deptId(String deptId) {
                this.deptId = deptId;
                return this;
            }

            /**
             * <p>The username for display purposes. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleName.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
}
