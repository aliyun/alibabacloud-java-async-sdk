// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSearchKeywordRequest} extends {@link RequestModel}
 *
 * <p>CreateSearchKeywordRequest</p>
 */
public class CreateSearchKeywordRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResId")
    private String resId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIdList")
    private java.util.List < String > userIdList;

    private CreateSearchKeywordRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.content = builder.content;
        this.endTime = builder.endTime;
        this.resId = builder.resId;
        this.startTime = builder.startTime;
        this.tenantContext = builder.tenantContext;
        this.userIdList = builder.userIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSearchKeywordRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return resId
     */
    public String getResId() {
        return this.resId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return userIdList
     */
    public java.util.List < String > getUserIdList() {
        return this.userIdList;
    }

    public static final class Builder extends Request.Builder<CreateSearchKeywordRequest, Builder> {
        private AccountContext accountContext; 
        private String content; 
        private Long endTime; 
        private String resId; 
        private Long startTime; 
        private TenantContext tenantContext; 
        private java.util.List < String > userIdList; 

        private Builder() {
            super();
        } 

        private Builder(CreateSearchKeywordRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.content = request.content;
            this.endTime = request.endTime;
            this.resId = request.resId;
            this.startTime = request.startTime;
            this.tenantContext = request.tenantContext;
            this.userIdList = request.userIdList;
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
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ResId.
         */
        public Builder resId(String resId) {
            this.putBodyParameter("ResId", resId);
            this.resId = resId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
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
         * UserIdList.
         */
        public Builder userIdList(java.util.List < String > userIdList) {
            String userIdListShrink = shrink(userIdList, "UserIdList", "json");
            this.putBodyParameter("UserIdList", userIdListShrink);
            this.userIdList = userIdList;
            return this;
        }

        @Override
        public CreateSearchKeywordRequest build() {
            return new CreateSearchKeywordRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSearchKeywordRequest} extends {@link TeaModel}
     *
     * <p>CreateSearchKeywordRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("userToken")
        private String userToken;

        private AccountContext(Builder builder) {
            this.userToken = builder.userToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return userToken
         */
        public String getUserToken() {
            return this.userToken;
        }

        public static final class Builder {
            private String userToken; 

            /**
             * userToken.
             */
            public Builder userToken(String userToken) {
                this.userToken = userToken;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSearchKeywordRequest} extends {@link TeaModel}
     *
     * <p>CreateSearchKeywordRequest</p>
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
