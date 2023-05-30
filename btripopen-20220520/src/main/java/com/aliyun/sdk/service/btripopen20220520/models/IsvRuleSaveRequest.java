// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IsvRuleSaveRequest} extends {@link RequestModel}
 *
 * <p>IsvRuleSaveRequest</p>
 */
public class IsvRuleSaveRequest extends Request {
    @Body
    @NameInMap("book_type")
    @Validation(required = true)
    private String bookType;

    @Body
    @NameInMap("bookuser_list")
    private java.util.List < BookuserList> bookuserList;

    @Body
    @NameInMap("status")
    @Validation(required = true)
    private Integer status;

    @Body
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private IsvRuleSaveRequest(Builder builder) {
        super(builder);
        this.bookType = builder.bookType;
        this.bookuserList = builder.bookuserList;
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
        private String bookType; 
        private java.util.List < BookuserList> bookuserList; 
        private Integer status; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IsvRuleSaveRequest request) {
            super(request);
            this.bookType = request.bookType;
            this.bookuserList = request.bookuserList;
            this.status = request.status;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * book_type.
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
         * status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * user_id.
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

    public static class BookuserList extends TeaModel {
        @NameInMap("entity_id")
        @Validation(required = true)
        private String entityId;

        @NameInMap("entity_type")
        @Validation(required = true)
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
             * entity_id.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * entity_type.
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
