// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantHonorRequest} extends {@link RequestModel}
 *
 * <p>GrantHonorRequest</p>
 */
public class GrantHonorRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expirationTime")
    private Long expirationTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grantReason")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grantReason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("granterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String granterName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("honorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("noticeAnnouncer")
    private Boolean noticeAnnouncer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("noticeSingle")
    private Boolean noticeSingle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("openConversationIds")
    private java.util.List < String > openConversationIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("receiverUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > receiverUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("senderUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String senderUserId;

    private GrantHonorRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.expirationTime = builder.expirationTime;
        this.grantReason = builder.grantReason;
        this.granterName = builder.granterName;
        this.honorId = builder.honorId;
        this.noticeAnnouncer = builder.noticeAnnouncer;
        this.noticeSingle = builder.noticeSingle;
        this.openConversationIds = builder.openConversationIds;
        this.orgId = builder.orgId;
        this.receiverUserIds = builder.receiverUserIds;
        this.senderUserId = builder.senderUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantHonorRequest create() {
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
     * @return expirationTime
     */
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * @return grantReason
     */
    public String getGrantReason() {
        return this.grantReason;
    }

    /**
     * @return granterName
     */
    public String getGranterName() {
        return this.granterName;
    }

    /**
     * @return honorId
     */
    public String getHonorId() {
        return this.honorId;
    }

    /**
     * @return noticeAnnouncer
     */
    public Boolean getNoticeAnnouncer() {
        return this.noticeAnnouncer;
    }

    /**
     * @return noticeSingle
     */
    public Boolean getNoticeSingle() {
        return this.noticeSingle;
    }

    /**
     * @return openConversationIds
     */
    public java.util.List < String > getOpenConversationIds() {
        return this.openConversationIds;
    }

    /**
     * @return orgId
     */
    public Long getOrgId() {
        return this.orgId;
    }

    /**
     * @return receiverUserIds
     */
    public java.util.List < String > getReceiverUserIds() {
        return this.receiverUserIds;
    }

    /**
     * @return senderUserId
     */
    public String getSenderUserId() {
        return this.senderUserId;
    }

    public static final class Builder extends Request.Builder<GrantHonorRequest, Builder> {
        private AccountContext accountContext; 
        private TenantContext tenantContext; 
        private Long expirationTime; 
        private String grantReason; 
        private String granterName; 
        private String honorId; 
        private Boolean noticeAnnouncer; 
        private Boolean noticeSingle; 
        private java.util.List < String > openConversationIds; 
        private Long orgId; 
        private java.util.List < String > receiverUserIds; 
        private String senderUserId; 

        private Builder() {
            super();
        } 

        private Builder(GrantHonorRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.tenantContext = request.tenantContext;
            this.expirationTime = request.expirationTime;
            this.grantReason = request.grantReason;
            this.granterName = request.granterName;
            this.honorId = request.honorId;
            this.noticeAnnouncer = request.noticeAnnouncer;
            this.noticeSingle = request.noticeSingle;
            this.openConversationIds = request.openConversationIds;
            this.orgId = request.orgId;
            this.receiverUserIds = request.receiverUserIds;
            this.senderUserId = request.senderUserId;
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
         * expirationTime.
         */
        public Builder expirationTime(Long expirationTime) {
            this.putBodyParameter("expirationTime", expirationTime);
            this.expirationTime = expirationTime;
            return this;
        }

        /**
         * grantReason.
         */
        public Builder grantReason(String grantReason) {
            this.putBodyParameter("grantReason", grantReason);
            this.grantReason = grantReason;
            return this;
        }

        /**
         * granterName.
         */
        public Builder granterName(String granterName) {
            this.putBodyParameter("granterName", granterName);
            this.granterName = granterName;
            return this;
        }

        /**
         * honorId.
         */
        public Builder honorId(String honorId) {
            this.putBodyParameter("honorId", honorId);
            this.honorId = honorId;
            return this;
        }

        /**
         * noticeAnnouncer.
         */
        public Builder noticeAnnouncer(Boolean noticeAnnouncer) {
            this.putBodyParameter("noticeAnnouncer", noticeAnnouncer);
            this.noticeAnnouncer = noticeAnnouncer;
            return this;
        }

        /**
         * noticeSingle.
         */
        public Builder noticeSingle(Boolean noticeSingle) {
            this.putBodyParameter("noticeSingle", noticeSingle);
            this.noticeSingle = noticeSingle;
            return this;
        }

        /**
         * openConversationIds.
         */
        public Builder openConversationIds(java.util.List < String > openConversationIds) {
            String openConversationIdsShrink = shrink(openConversationIds, "openConversationIds", "json");
            this.putBodyParameter("openConversationIds", openConversationIdsShrink);
            this.openConversationIds = openConversationIds;
            return this;
        }

        /**
         * orgId.
         */
        public Builder orgId(Long orgId) {
            this.putBodyParameter("orgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * receiverUserIds.
         */
        public Builder receiverUserIds(java.util.List < String > receiverUserIds) {
            String receiverUserIdsShrink = shrink(receiverUserIds, "receiverUserIds", "json");
            this.putBodyParameter("receiverUserIds", receiverUserIdsShrink);
            this.receiverUserIds = receiverUserIds;
            return this;
        }

        /**
         * senderUserId.
         */
        public Builder senderUserId(String senderUserId) {
            this.putBodyParameter("senderUserId", senderUserId);
            this.senderUserId = senderUserId;
            return this;
        }

        @Override
        public GrantHonorRequest build() {
            return new GrantHonorRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
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

            /**
             * accountId.
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
