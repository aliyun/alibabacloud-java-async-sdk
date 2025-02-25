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
 * {@link CreateLiveRequest} extends {@link RequestModel}
 *
 * <p>CreateLiveRequest</p>
 */
public class CreateLiveRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CoverUrl")
    private String coverUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Introduction")
    private String introduction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long preEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long preStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublicType")
    private Long publicType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private CreateLiveRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.coverUrl = builder.coverUrl;
        this.introduction = builder.introduction;
        this.preEndTime = builder.preEndTime;
        this.preStartTime = builder.preStartTime;
        this.publicType = builder.publicType;
        this.tenantContext = builder.tenantContext;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveRequest create() {
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
     * @return coverUrl
     */
    public String getCoverUrl() {
        return this.coverUrl;
    }

    /**
     * @return introduction
     */
    public String getIntroduction() {
        return this.introduction;
    }

    /**
     * @return preEndTime
     */
    public Long getPreEndTime() {
        return this.preEndTime;
    }

    /**
     * @return preStartTime
     */
    public Long getPreStartTime() {
        return this.preStartTime;
    }

    /**
     * @return publicType
     */
    public Long getPublicType() {
        return this.publicType;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateLiveRequest, Builder> {
        private AccountContext accountContext; 
        private String coverUrl; 
        private String introduction; 
        private Long preEndTime; 
        private Long preStartTime; 
        private Long publicType; 
        private TenantContext tenantContext; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateLiveRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.coverUrl = request.coverUrl;
            this.introduction = request.introduction;
            this.preEndTime = request.preEndTime;
            this.preStartTime = request.preStartTime;
            this.publicType = request.publicType;
            this.tenantContext = request.tenantContext;
            this.title = request.title;
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
         * CoverUrl.
         */
        public Builder coverUrl(String coverUrl) {
            this.putBodyParameter("CoverUrl", coverUrl);
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * Introduction.
         */
        public Builder introduction(String introduction) {
            this.putBodyParameter("Introduction", introduction);
            this.introduction = introduction;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1698596800000</p>
         */
        public Builder preEndTime(Long preEndTime) {
            this.putBodyParameter("PreEndTime", preEndTime);
            this.preEndTime = preEndTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1691596800000</p>
         */
        public Builder preStartTime(Long preStartTime) {
            this.putBodyParameter("PreStartTime", preStartTime);
            this.preStartTime = preStartTime;
            return this;
        }

        /**
         * PublicType.
         */
        public Builder publicType(Long publicType) {
            this.putBodyParameter("PublicType", publicType);
            this.publicType = publicType;
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
         * <p>标题</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateLiveRequest build() {
            return new CreateLiveRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLiveRequest} extends {@link TeaModel}
     *
     * <p>CreateLiveRequest</p>
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
     * {@link CreateLiveRequest} extends {@link TeaModel}
     *
     * <p>CreateLiveRequest</p>
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
