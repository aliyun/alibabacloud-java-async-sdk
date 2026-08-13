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
         * <p>企业标识（必须与 listAvailableConfigs 返回的 corpId 一致）</p>
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
         * <p>部门列表（至少包含一个根部门）</p>
         * <p>This parameter is required.</p>
         */
        public Builder departments(java.util.List<Departments> departments) {
            String departmentsShrink = shrink(departments, "departments", "json");
            this.putBodyParameter("departments", departmentsShrink);
            this.departments = departments;
            return this;
        }

        /**
         * <p>成员列表（syncMembers=true 时必须提供）</p>
         */
        public Builder members(java.util.List<Members> members) {
            String membersShrink = shrink(members, "members", "json");
            this.putBodyParameter("members", membersShrink);
            this.members = members;
            return this;
        }

        /**
         * <p>平台类型: saml / oauth2 / custom</p>
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
         * <p>SSO 配置 ID（SAML/OAuth2 可选：不传时按 corpId 自动推导；若存在多个 IdP 使用相同 corpId 则必须显式传入，否则报 AMBIGUOUS 错误；custom 不需要）</p>
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
         * <p>是否同步成员关系（custom 模式强制为 false）</p>
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
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
             * <p>部门 ID（外部标识，客户端自行保证唯一性）</p>
             * 
             * <strong>example:</strong>
             * <p>exampleDeptId</p>
             */
            public Builder deptId(String deptId) {
                this.deptId = deptId;
                return this;
            }

            /**
             * <p>部门名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            /**
             * <p>排序号（数值越小越靠前）</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Long order) {
                this.order = order;
                return this;
            }

            /**
             * <p>父部门 ID（null 表示一级部门/根部门）</p>
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
             * <p>用户标识（SAML 场景为邮箱/UPN，需与 rbj_user_account.account_id 匹配）</p>
             * 
             * <strong>example:</strong>
             * <p>exampleAccountId</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>所属部门 ID（必须与 departments 中的 deptId 对应）</p>
             * 
             * <strong>example:</strong>
             * <p>exampleDeptId</p>
             */
            public Builder deptId(String deptId) {
                this.deptId = deptId;
                return this;
            }

            /**
             * <p>用户姓名（展示用，可选）</p>
             * 
             * <strong>example:</strong>
             * <p>示例名称.pdf</p>
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
