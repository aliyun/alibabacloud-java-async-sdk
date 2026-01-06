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
 * {@link GetDingtalkMeetingMemberEventRequest} extends {@link RequestModel}
 *
 * <p>GetDingtalkMeetingMemberEventRequest</p>
 */
public class GetDingtalkMeetingMemberEventRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("beginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conferenceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conferenceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orgId")
    private String orgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workNo")
    private String workNo;

    private GetDingtalkMeetingMemberEventRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.beginTime = builder.beginTime;
        this.conferenceId = builder.conferenceId;
        this.endTime = builder.endTime;
        this.orgId = builder.orgId;
        this.workNo = builder.workNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDingtalkMeetingMemberEventRequest create() {
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
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return workNo
     */
    public String getWorkNo() {
        return this.workNo;
    }

    public static final class Builder extends Request.Builder<GetDingtalkMeetingMemberEventRequest, Builder> {
        private AccountContext accountContext; 
        private TenantContext tenantContext; 
        private Long beginTime; 
        private String conferenceId; 
        private Long endTime; 
        private String orgId; 
        private String workNo; 

        private Builder() {
            super();
        } 

        private Builder(GetDingtalkMeetingMemberEventRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.tenantContext = request.tenantContext;
            this.beginTime = request.beginTime;
            this.conferenceId = request.conferenceId;
            this.endTime = request.endTime;
            this.orgId = request.orgId;
            this.workNo = request.workNo;
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
         * beginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putBodyParameter("beginTime", beginTime);
            this.beginTime = beginTime;
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
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
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
         * workNo.
         */
        public Builder workNo(String workNo) {
            this.putBodyParameter("workNo", workNo);
            this.workNo = workNo;
            return this;
        }

        @Override
        public GetDingtalkMeetingMemberEventRequest build() {
            return new GetDingtalkMeetingMemberEventRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetDingtalkMeetingMemberEventRequest} extends {@link TeaModel}
     *
     * <p>GetDingtalkMeetingMemberEventRequest</p>
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
     * {@link GetDingtalkMeetingMemberEventRequest} extends {@link TeaModel}
     *
     * <p>GetDingtalkMeetingMemberEventRequest</p>
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
