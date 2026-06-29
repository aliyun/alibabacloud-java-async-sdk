// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link GetTokenPlanAccountDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetTokenPlanAccountDetailResponseBody</p>
 */
public class GetTokenPlanAccountDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTokenPlanAccountDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenPlanAccountDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTokenPlanAccountDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTokenPlanAccountDetailResponseBody build() {
            return new GetTokenPlanAccountDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTokenPlanAccountDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetTokenPlanAccountDetailResponseBody</p>
     */
    public static class Workspaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberStatus")
        private String memberStatus;

        @com.aliyun.core.annotation.NameInMap("RoleCode")
        private String roleCode;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Workspaces(Builder builder) {
            this.memberStatus = builder.memberStatus;
            this.roleCode = builder.roleCode;
            this.roleId = builder.roleId;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workspaces create() {
            return builder().build();
        }

        /**
         * @return memberStatus
         */
        public String getMemberStatus() {
            return this.memberStatus;
        }

        /**
         * @return roleCode
         */
        public String getRoleCode() {
            return this.roleCode;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String memberStatus; 
            private String roleCode; 
            private String roleId; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Workspaces model) {
                this.memberStatus = model.memberStatus;
                this.roleCode = model.roleCode;
                this.roleId = model.roleId;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * MemberStatus.
             */
            public Builder memberStatus(String memberStatus) {
                this.memberStatus = memberStatus;
                return this;
            }

            /**
             * RoleCode.
             */
            public Builder roleCode(String roleCode) {
                this.roleCode = roleCode;
                return this;
            }

            /**
             * RoleId.
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Workspaces build() {
                return new Workspaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTokenPlanAccountDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetTokenPlanAccountDetailResponseBody</p>
     */
    public static class OrgMemberships extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberStatus")
        private String memberStatus;

        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("RoleCode")
        private String roleCode;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("Workspaces")
        private java.util.List<Workspaces> workspaces;

        private OrgMemberships(Builder builder) {
            this.memberStatus = builder.memberStatus;
            this.orgId = builder.orgId;
            this.roleCode = builder.roleCode;
            this.roleId = builder.roleId;
            this.workspaces = builder.workspaces;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrgMemberships create() {
            return builder().build();
        }

        /**
         * @return memberStatus
         */
        public String getMemberStatus() {
            return this.memberStatus;
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return roleCode
         */
        public String getRoleCode() {
            return this.roleCode;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        /**
         * @return workspaces
         */
        public java.util.List<Workspaces> getWorkspaces() {
            return this.workspaces;
        }

        public static final class Builder {
            private String memberStatus; 
            private String orgId; 
            private String roleCode; 
            private String roleId; 
            private java.util.List<Workspaces> workspaces; 

            private Builder() {
            } 

            private Builder(OrgMemberships model) {
                this.memberStatus = model.memberStatus;
                this.orgId = model.orgId;
                this.roleCode = model.roleCode;
                this.roleId = model.roleId;
                this.workspaces = model.workspaces;
            } 

            /**
             * MemberStatus.
             */
            public Builder memberStatus(String memberStatus) {
                this.memberStatus = memberStatus;
                return this;
            }

            /**
             * OrgId.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * RoleCode.
             */
            public Builder roleCode(String roleCode) {
                this.roleCode = roleCode;
                return this;
            }

            /**
             * RoleId.
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * Workspaces.
             */
            public Builder workspaces(java.util.List<Workspaces> workspaces) {
                this.workspaces = workspaces;
                return this;
            }

            public OrgMemberships build() {
                return new OrgMemberships(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTokenPlanAccountDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetTokenPlanAccountDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("IsDeleted")
        private Boolean isDeleted;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrgMemberships")
        private java.util.List<OrgMemberships> orgMemberships;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.accountType = builder.accountType;
            this.aliyunUid = builder.aliyunUid;
            this.createdAt = builder.createdAt;
            this.email = builder.email;
            this.isDeleted = builder.isDeleted;
            this.name = builder.name;
            this.orgMemberships = builder.orgMemberships;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orgMemberships
         */
        public java.util.List<OrgMemberships> getOrgMemberships() {
            return this.orgMemberships;
        }

        public static final class Builder {
            private String accountId; 
            private String accountType; 
            private String aliyunUid; 
            private String createdAt; 
            private String email; 
            private Boolean isDeleted; 
            private String name; 
            private java.util.List<OrgMemberships> orgMemberships; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.accountType = model.accountType;
                this.aliyunUid = model.aliyunUid;
                this.createdAt = model.createdAt;
                this.email = model.email;
                this.isDeleted = model.isDeleted;
                this.name = model.name;
                this.orgMemberships = model.orgMemberships;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * IsDeleted.
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OrgMemberships.
             */
            public Builder orgMemberships(java.util.List<OrgMemberships> orgMemberships) {
                this.orgMemberships = orgMemberships;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
