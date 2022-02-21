// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProfileCatalogRequest} extends {@link RequestModel}
 *
 * <p>UpdateProfileCatalogRequest</p>
 */
public class UpdateProfileCatalogRequest extends Request {
    @Body
    @NameInMap("CatalogId")
    @Validation(required = true, maximum = 9999999999999D, minimum = 1)
    private Long catalogId;

    @Body
    @NameInMap("CatalogName")
    @Validation(required = true)
    private String catalogName;

    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("IsvSubId")
    @Validation(required = true)
    private String isvSubId;

    private UpdateProfileCatalogRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.catalogName = builder.catalogName;
        this.corpId = builder.corpId;
        this.isvSubId = builder.isvSubId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProfileCatalogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public Long getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
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

    public static final class Builder extends Request.Builder<UpdateProfileCatalogRequest, Builder> {
        private Long catalogId; 
        private String catalogName; 
        private String corpId; 
        private String isvSubId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProfileCatalogRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.catalogName = response.catalogName;
            this.corpId = response.corpId;
            this.isvSubId = response.isvSubId;
        } 

        /**
         * CatalogId.
         */
        public Builder catalogId(Long catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * CatalogName.
         */
        public Builder catalogName(String catalogName) {
            this.putBodyParameter("CatalogName", catalogName);
            this.catalogName = catalogName;
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
        public UpdateProfileCatalogRequest build() {
            return new UpdateProfileCatalogRequest(this);
        } 

    } 

}
