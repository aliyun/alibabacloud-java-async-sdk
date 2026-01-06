// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetDingtalkMeetingMemberListRequest} extends {@link RequestModel}
 *
 * <p>GetDingtalkMeetingMemberListRequest</p>
 */
public class GetDingtalkMeetingMemberListRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conferenceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conferenceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orgId")
    private String orgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private GetDingtalkMeetingMemberListRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.clusterName = builder.clusterName;
        this.conferenceId = builder.conferenceId;
        this.currentPage = builder.currentPage;
        this.orgId = builder.orgId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDingtalkMeetingMemberListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<GetDingtalkMeetingMemberListRequest, Builder> {
        private AccountContext accountContext; 
        private TenantContext tenantContext; 
        private String clusterName; 
        private String conferenceId; 
        private Integer currentPage; 
        private String orgId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetDingtalkMeetingMemberListRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.tenantContext = request.tenantContext;
            this.clusterName = request.clusterName;
            this.conferenceId = request.conferenceId;
            this.currentPage = request.currentPage;
            this.orgId = request.orgId;
            this.pageSize = request.pageSize;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * TenantContext.
         */
        public Builder tenantContext(TenantContext tenantContext) {
            String tenantContextShrink = shrink(tenantContext, "TenantContext", "json");
            this.putBodyParameter("TenantContext", tenantContextShrink);
            this.tenantContext = tenantContext;
            return this;
        }

        /**
         * clusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putBodyParameter("clusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61289fxxx</p>
         */
        public Builder conferenceId(String conferenceId) {
            this.putBodyParameter("conferenceId", conferenceId);
            this.conferenceId = conferenceId;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * orgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("orgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetDingtalkMeetingMemberListRequest build() {
            return new GetDingtalkMeetingMemberListRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetDingtalkMeetingMemberListRequest} extends {@link TeaModel}
     *
     * <p>GetDingtalkMeetingMemberListRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            private Builder() {
            } 

            private Builder(AccountContext model) {
                this.accountId = model.accountId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>012345</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDingtalkMeetingMemberListRequest} extends {@link TeaModel}
     *
     * <p>GetDingtalkMeetingMemberListRequest</p>
     */
    public static class TenantContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        private TenantContext(Builder builder) {
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantContext create() {
            return builder().build();
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String tenantId; 

            private Builder() {
            } 

            private Builder(TenantContext model) {
                this.tenantId = model.tenantId;
            } 

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public TenantContext build() {
                return new TenantContext(this);
            } 

        } 

    }
}
