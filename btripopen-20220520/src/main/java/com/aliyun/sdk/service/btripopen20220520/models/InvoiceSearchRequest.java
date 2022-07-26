// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvoiceSearchRequest} extends {@link RequestModel}
 *
 * <p>InvoiceSearchRequest</p>
 */
public class InvoiceSearchRequest extends Request {
    @Body
    @NameInMap("authority")
    private Boolean authority;

    @Query
    @NameInMap("corp_id")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("title")
    private String title;

    @Query
    @NameInMap("user_id")
    private String userId;

    private InvoiceSearchRequest(Builder builder) {
        super(builder);
        this.authority = builder.authority;
        this.corpId = builder.corpId;
        this.title = builder.title;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvoiceSearchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authority
     */
    public Boolean getAuthority() {
        return this.authority;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<InvoiceSearchRequest, Builder> {
        private Boolean authority; 
        private String corpId; 
        private String title; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(InvoiceSearchRequest request) {
            super(request);
            this.authority = request.authority;
            this.corpId = request.corpId;
            this.title = request.title;
            this.userId = request.userId;
        } 

        /**
         * authority.
         */
        public Builder authority(Boolean authority) {
            this.putBodyParameter("authority", authority);
            this.authority = authority;
            return this;
        }

        /**
         * corp_id.
         */
        public Builder corpId(String corpId) {
            this.putQueryParameter("corp_id", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * 无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public InvoiceSearchRequest build() {
            return new InvoiceSearchRequest(this);
        } 

    } 

}
