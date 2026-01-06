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
 * {@link GetDingtalkProjectionInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDingtalkProjectionInfoRequest</p>
 */
public class GetDingtalkProjectionInfoRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("client")
    private String client;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTs")
    private Long endTs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orgId")
    private String orgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pubWorkNo")
    private String pubWorkNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roomId")
    private String roomId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTs")
    private Long startTs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subUid")
    private String subUid;

    private GetDingtalkProjectionInfoRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.client = builder.client;
        this.endTs = builder.endTs;
        this.orgId = builder.orgId;
        this.pubWorkNo = builder.pubWorkNo;
        this.roomId = builder.roomId;
        this.startTs = builder.startTs;
        this.subUid = builder.subUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDingtalkProjectionInfoRequest create() {
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
     * @return client
     */
    public String getClient() {
        return this.client;
    }

    /**
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pubWorkNo
     */
    public String getPubWorkNo() {
        return this.pubWorkNo;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    /**
     * @return subUid
     */
    public String getSubUid() {
        return this.subUid;
    }

    public static final class Builder extends Request.Builder<GetDingtalkProjectionInfoRequest, Builder> {
        private AccountContext accountContext; 
        private TenantContext tenantContext; 
        private String client; 
        private Long endTs; 
        private String orgId; 
        private String pubWorkNo; 
        private String roomId; 
        private Long startTs; 
        private String subUid; 

        private Builder() {
            super();
        } 

        private Builder(GetDingtalkProjectionInfoRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.tenantContext = request.tenantContext;
            this.client = request.client;
            this.endTs = request.endTs;
            this.orgId = request.orgId;
            this.pubWorkNo = request.pubWorkNo;
            this.roomId = request.roomId;
            this.startTs = request.startTs;
            this.subUid = request.subUid;
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
         * client.
         */
        public Builder client(String client) {
            this.putBodyParameter("client", client);
            this.client = client;
            return this;
        }

        /**
         * endTs.
         */
        public Builder endTs(Long endTs) {
            this.putBodyParameter("endTs", endTs);
            this.endTs = endTs;
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
         * pubWorkNo.
         */
        public Builder pubWorkNo(String pubWorkNo) {
            this.putBodyParameter("pubWorkNo", pubWorkNo);
            this.pubWorkNo = pubWorkNo;
            return this;
        }

        /**
         * roomId.
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("roomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * startTs.
         */
        public Builder startTs(Long startTs) {
            this.putBodyParameter("startTs", startTs);
            this.startTs = startTs;
            return this;
        }

        /**
         * subUid.
         */
        public Builder subUid(String subUid) {
            this.putBodyParameter("subUid", subUid);
            this.subUid = subUid;
            return this;
        }

        @Override
        public GetDingtalkProjectionInfoRequest build() {
            return new GetDingtalkProjectionInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetDingtalkProjectionInfoRequest} extends {@link TeaModel}
     *
     * <p>GetDingtalkProjectionInfoRequest</p>
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
     * {@link GetDingtalkProjectionInfoRequest} extends {@link TeaModel}
     *
     * <p>GetDingtalkProjectionInfoRequest</p>
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
