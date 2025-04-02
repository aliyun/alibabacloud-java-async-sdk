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
 * {@link FinishTicketRequest} extends {@link RequestModel}
 *
 * <p>FinishTicketRequest</p>
 */
public class FinishTicketRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Notify")
    private Notify notify;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenTeamId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openTeamId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenTicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openTicketId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TicketMemo")
    private TicketMemo ticketMemo;

    private FinishTicketRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.notify = builder.notify;
        this.openTeamId = builder.openTeamId;
        this.openTicketId = builder.openTicketId;
        this.tenantContext = builder.tenantContext;
        this.ticketMemo = builder.ticketMemo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FinishTicketRequest create() {
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
     * @return notify
     */
    public Notify getNotify() {
        return this.notify;
    }

    /**
     * @return openTeamId
     */
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    /**
     * @return openTicketId
     */
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return ticketMemo
     */
    public TicketMemo getTicketMemo() {
        return this.ticketMemo;
    }

    public static final class Builder extends Request.Builder<FinishTicketRequest, Builder> {
        private AccountContext accountContext; 
        private Notify notify; 
        private String openTeamId; 
        private String openTicketId; 
        private TenantContext tenantContext; 
        private TicketMemo ticketMemo; 

        private Builder() {
            super();
        } 

        private Builder(FinishTicketRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.notify = request.notify;
            this.openTeamId = request.openTeamId;
            this.openTicketId = request.openTicketId;
            this.tenantContext = request.tenantContext;
            this.ticketMemo = request.ticketMemo;
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
         * Notify.
         */
        public Builder notify(Notify notify) {
            String notifyShrink = shrink(notify, "Notify", "json");
            this.putBodyParameter("Notify", notifyShrink);
            this.notify = notify;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eKWh3xxxxiE</p>
         */
        public Builder openTeamId(String openTeamId) {
            this.putBodyParameter("OpenTeamId", openTeamId);
            this.openTeamId = openTeamId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Dq9hP8Sk2v6vQxxxxiE</p>
         */
        public Builder openTicketId(String openTicketId) {
            this.putBodyParameter("OpenTicketId", openTicketId);
            this.openTicketId = openTicketId;
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
         * TicketMemo.
         */
        public Builder ticketMemo(TicketMemo ticketMemo) {
            String ticketMemoShrink = shrink(ticketMemo, "TicketMemo", "json");
            this.putBodyParameter("TicketMemo", ticketMemoShrink);
            this.ticketMemo = ticketMemo;
            return this;
        }

        @Override
        public FinishTicketRequest build() {
            return new FinishTicketRequest(this);
        } 

    } 

    /**
     * 
     * {@link FinishTicketRequest} extends {@link TeaModel}
     *
     * <p>FinishTicketRequest</p>
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
     * {@link FinishTicketRequest} extends {@link TeaModel}
     *
     * <p>FinishTicketRequest</p>
     */
    public static class Notify extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupNoticeReceiverUserIds")
        private java.util.List<String> groupNoticeReceiverUserIds;

        @com.aliyun.core.annotation.NameInMap("NoticeAllGroupMember")
        private Boolean noticeAllGroupMember;

        @com.aliyun.core.annotation.NameInMap("WorkNoticeReceiverUserIds")
        private java.util.List<String> workNoticeReceiverUserIds;

        private Notify(Builder builder) {
            this.groupNoticeReceiverUserIds = builder.groupNoticeReceiverUserIds;
            this.noticeAllGroupMember = builder.noticeAllGroupMember;
            this.workNoticeReceiverUserIds = builder.workNoticeReceiverUserIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notify create() {
            return builder().build();
        }

        /**
         * @return groupNoticeReceiverUserIds
         */
        public java.util.List<String> getGroupNoticeReceiverUserIds() {
            return this.groupNoticeReceiverUserIds;
        }

        /**
         * @return noticeAllGroupMember
         */
        public Boolean getNoticeAllGroupMember() {
            return this.noticeAllGroupMember;
        }

        /**
         * @return workNoticeReceiverUserIds
         */
        public java.util.List<String> getWorkNoticeReceiverUserIds() {
            return this.workNoticeReceiverUserIds;
        }

        public static final class Builder {
            private java.util.List<String> groupNoticeReceiverUserIds; 
            private Boolean noticeAllGroupMember; 
            private java.util.List<String> workNoticeReceiverUserIds; 

            private Builder() {
            } 

            private Builder(Notify model) {
                this.groupNoticeReceiverUserIds = model.groupNoticeReceiverUserIds;
                this.noticeAllGroupMember = model.noticeAllGroupMember;
                this.workNoticeReceiverUserIds = model.workNoticeReceiverUserIds;
            } 

            /**
             * GroupNoticeReceiverUserIds.
             */
            public Builder groupNoticeReceiverUserIds(java.util.List<String> groupNoticeReceiverUserIds) {
                this.groupNoticeReceiverUserIds = groupNoticeReceiverUserIds;
                return this;
            }

            /**
             * NoticeAllGroupMember.
             */
            public Builder noticeAllGroupMember(Boolean noticeAllGroupMember) {
                this.noticeAllGroupMember = noticeAllGroupMember;
                return this;
            }

            /**
             * WorkNoticeReceiverUserIds.
             */
            public Builder workNoticeReceiverUserIds(java.util.List<String> workNoticeReceiverUserIds) {
                this.workNoticeReceiverUserIds = workNoticeReceiverUserIds;
                return this;
            }

            public Notify build() {
                return new Notify(this);
            } 

        } 

    }
    /**
     * 
     * {@link FinishTicketRequest} extends {@link TeaModel}
     *
     * <p>FinishTicketRequest</p>
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
    /**
     * 
     * {@link FinishTicketRequest} extends {@link TeaModel}
     *
     * <p>FinishTicketRequest</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private Attachments(Builder builder) {
            this.fileName = builder.fileName;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String fileName; 
            private String key; 

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.fileName = model.fileName;
                this.key = model.key;
            } 

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
    /**
     * 
     * {@link FinishTicketRequest} extends {@link TeaModel}
     *
     * <p>FinishTicketRequest</p>
     */
    public static class TicketMemo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attachments")
        private java.util.List<Attachments> attachments;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        private TicketMemo(Builder builder) {
            this.attachments = builder.attachments;
            this.memo = builder.memo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TicketMemo create() {
            return builder().build();
        }

        /**
         * @return attachments
         */
        public java.util.List<Attachments> getAttachments() {
            return this.attachments;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        public static final class Builder {
            private java.util.List<Attachments> attachments; 
            private String memo; 

            private Builder() {
            } 

            private Builder(TicketMemo model) {
                this.attachments = model.attachments;
                this.memo = model.memo;
            } 

            /**
             * Attachments.
             */
            public Builder attachments(java.util.List<Attachments> attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * Memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            public TicketMemo build() {
                return new TicketMemo(this);
            } 

        } 

    }
}
