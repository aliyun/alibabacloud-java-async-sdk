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
 * {@link UpdateVideoConferenceSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateVideoConferenceSettingRequest</p>
 */
public class UpdateVideoConferenceSettingRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowUnmuteSelf")
    private Boolean allowUnmuteSelf;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoTransferHost")
    private Boolean autoTransferHost;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForbiddenShareScreen")
    private Boolean forbiddenShareScreen;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LockConference")
    private Boolean lockConference;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MuteAll")
    private Boolean muteAll;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnlyInternalEmployeesJoin")
    private Boolean onlyInternalEmployeesJoin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conferenceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conferenceId;

    private UpdateVideoConferenceSettingRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.allowUnmuteSelf = builder.allowUnmuteSelf;
        this.autoTransferHost = builder.autoTransferHost;
        this.forbiddenShareScreen = builder.forbiddenShareScreen;
        this.lockConference = builder.lockConference;
        this.muteAll = builder.muteAll;
        this.onlyInternalEmployeesJoin = builder.onlyInternalEmployeesJoin;
        this.tenantContext = builder.tenantContext;
        this.conferenceId = builder.conferenceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVideoConferenceSettingRequest create() {
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
     * @return allowUnmuteSelf
     */
    public Boolean getAllowUnmuteSelf() {
        return this.allowUnmuteSelf;
    }

    /**
     * @return autoTransferHost
     */
    public Boolean getAutoTransferHost() {
        return this.autoTransferHost;
    }

    /**
     * @return forbiddenShareScreen
     */
    public Boolean getForbiddenShareScreen() {
        return this.forbiddenShareScreen;
    }

    /**
     * @return lockConference
     */
    public Boolean getLockConference() {
        return this.lockConference;
    }

    /**
     * @return muteAll
     */
    public Boolean getMuteAll() {
        return this.muteAll;
    }

    /**
     * @return onlyInternalEmployeesJoin
     */
    public Boolean getOnlyInternalEmployeesJoin() {
        return this.onlyInternalEmployeesJoin;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static final class Builder extends Request.Builder<UpdateVideoConferenceSettingRequest, Builder> {
        private AccountContext accountContext; 
        private Boolean allowUnmuteSelf; 
        private Boolean autoTransferHost; 
        private Boolean forbiddenShareScreen; 
        private Boolean lockConference; 
        private Boolean muteAll; 
        private Boolean onlyInternalEmployeesJoin; 
        private TenantContext tenantContext; 
        private String conferenceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVideoConferenceSettingRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.allowUnmuteSelf = request.allowUnmuteSelf;
            this.autoTransferHost = request.autoTransferHost;
            this.forbiddenShareScreen = request.forbiddenShareScreen;
            this.lockConference = request.lockConference;
            this.muteAll = request.muteAll;
            this.onlyInternalEmployeesJoin = request.onlyInternalEmployeesJoin;
            this.tenantContext = request.tenantContext;
            this.conferenceId = request.conferenceId;
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
         * AllowUnmuteSelf.
         */
        public Builder allowUnmuteSelf(Boolean allowUnmuteSelf) {
            this.putBodyParameter("AllowUnmuteSelf", allowUnmuteSelf);
            this.allowUnmuteSelf = allowUnmuteSelf;
            return this;
        }

        /**
         * AutoTransferHost.
         */
        public Builder autoTransferHost(Boolean autoTransferHost) {
            this.putBodyParameter("AutoTransferHost", autoTransferHost);
            this.autoTransferHost = autoTransferHost;
            return this;
        }

        /**
         * ForbiddenShareScreen.
         */
        public Builder forbiddenShareScreen(Boolean forbiddenShareScreen) {
            this.putBodyParameter("ForbiddenShareScreen", forbiddenShareScreen);
            this.forbiddenShareScreen = forbiddenShareScreen;
            return this;
        }

        /**
         * LockConference.
         */
        public Builder lockConference(Boolean lockConference) {
            this.putBodyParameter("LockConference", lockConference);
            this.lockConference = lockConference;
            return this;
        }

        /**
         * MuteAll.
         */
        public Builder muteAll(Boolean muteAll) {
            this.putBodyParameter("MuteAll", muteAll);
            this.muteAll = muteAll;
            return this;
        }

        /**
         * OnlyInternalEmployeesJoin.
         */
        public Builder onlyInternalEmployeesJoin(Boolean onlyInternalEmployeesJoin) {
            this.putBodyParameter("OnlyInternalEmployeesJoin", onlyInternalEmployeesJoin);
            this.onlyInternalEmployeesJoin = onlyInternalEmployeesJoin;
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

        @Override
        public UpdateVideoConferenceSettingRequest build() {
            return new UpdateVideoConferenceSettingRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateVideoConferenceSettingRequest} extends {@link TeaModel}
     *
     * <p>UpdateVideoConferenceSettingRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(AccountContext model) {
                this.accountId = model.accountId;
            } 

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
    /**
     * 
     * {@link UpdateVideoConferenceSettingRequest} extends {@link TeaModel}
     *
     * <p>UpdateVideoConferenceSettingRequest</p>
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
