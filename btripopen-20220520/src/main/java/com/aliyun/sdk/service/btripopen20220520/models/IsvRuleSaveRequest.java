// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IsvRuleSaveRequest} extends {@link RequestModel}
 *
 * <p>IsvRuleSaveRequest</p>
 */
public class IsvRuleSaveRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apply_need")
    private Boolean applyNeed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("book_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bookType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bookuser_list")
    private java.util.List < BookuserList> bookuserList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rule_need")
    private Boolean ruleNeed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private IsvRuleSaveRequest(Builder builder) {
        super(builder);
        this.applyNeed = builder.applyNeed;
        this.bookType = builder.bookType;
        this.bookuserList = builder.bookuserList;
        this.ruleNeed = builder.ruleNeed;
        this.status = builder.status;
        this.userId = builder.userId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IsvRuleSaveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyNeed
     */
    public Boolean getApplyNeed() {
        return this.applyNeed;
    }

    /**
     * @return bookType
     */
    public String getBookType() {
        return this.bookType;
    }

    /**
     * @return bookuserList
     */
    public java.util.List < BookuserList> getBookuserList() {
        return this.bookuserList;
    }

    /**
     * @return ruleNeed
     */
    public Boolean getRuleNeed() {
        return this.ruleNeed;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<IsvRuleSaveRequest, Builder> {
        private Boolean applyNeed; 
        private String bookType; 
        private java.util.List < BookuserList> bookuserList; 
        private Boolean ruleNeed; 
        private Integer status; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IsvRuleSaveRequest request) {
            super(request);
            this.applyNeed = request.applyNeed;
            this.bookType = request.bookType;
            this.bookuserList = request.bookuserList;
            this.ruleNeed = request.ruleNeed;
            this.status = request.status;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * apply_need.
         */
        public Builder applyNeed(Boolean applyNeed) {
            this.putBodyParameter("apply_need", applyNeed);
            this.applyNeed = applyNeed;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bookType(String bookType) {
            this.putBodyParameter("book_type", bookType);
            this.bookType = bookType;
            return this;
        }

        /**
         * bookuser_list.
         */
        public Builder bookuserList(java.util.List < BookuserList> bookuserList) {
            String bookuserListShrink = shrink(bookuserList, "bookuser_list", "json");
            this.putBodyParameter("bookuser_list", bookuserListShrink);
            this.bookuserList = bookuserList;
            return this;
        }

        /**
         * rule_need.
         */
        public Builder ruleNeed(Boolean ruleNeed) {
            this.putBodyParameter("rule_need", ruleNeed);
            this.ruleNeed = ruleNeed;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public IsvRuleSaveRequest build() {
            return new IsvRuleSaveRequest(this);
        } 

    } 

    /**
     * 
     * {@link IsvRuleSaveRequest} extends {@link TeaModel}
     *
     * <p>IsvRuleSaveRequest</p>
     */
    public static class BookuserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entity_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("entity_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer entityType;

        private BookuserList(Builder builder) {
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BookuserList create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityType
         */
        public Integer getEntityType() {
            return this.entityType;
        }

        public static final class Builder {
            private String entityId; 
            private Integer entityType; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder entityType(Integer entityType) {
                this.entityType = entityType;
                return this;
            }

            public BookuserList build() {
                return new BookuserList(this);
            } 

        } 

    }
}
