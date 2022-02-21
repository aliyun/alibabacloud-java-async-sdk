// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProfileCatalogRequest} extends {@link RequestModel}
 *
 * <p>DeleteProfileCatalogRequest</p>
 */
public class DeleteProfileCatalogRequest extends Request {
    @Body
    @NameInMap("CatalogId")
    @Validation(required = true)
    private String catalogId;

    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("IsvSubId")
    @Validation(required = true)
    private String isvSubId;

    private DeleteProfileCatalogRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.corpId = builder.corpId;
        this.isvSubId = builder.isvSubId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProfileCatalogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return isvSubId
     */
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public static final class Builder extends Request.Builder<DeleteProfileCatalogRequest, Builder> {
        private String catalogId; 
        private String corpId; 
        private String isvSubId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProfileCatalogRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.corpId = response.corpId;
            this.isvSubId = response.isvSubId;
        } 

        /**
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * IsvSubId.
         */
        public Builder isvSubId(String isvSubId) {
            this.putBodyParameter("IsvSubId", isvSubId);
            this.isvSubId = isvSubId;
            return this;
        }

        @Override
        public DeleteProfileCatalogRequest build() {
            return new DeleteProfileCatalogRequest(this);
        } 

    } 

}
