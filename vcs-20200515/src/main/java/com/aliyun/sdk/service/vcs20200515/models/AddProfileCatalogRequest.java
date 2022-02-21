// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProfileCatalogRequest} extends {@link RequestModel}
 *
 * <p>AddProfileCatalogRequest</p>
 */
public class AddProfileCatalogRequest extends Request {
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

    @Body
    @NameInMap("ParentCatalogId")
    @Validation(maximum = 9999999999999D)
    private Long parentCatalogId;

    private AddProfileCatalogRequest(Builder builder) {
        super(builder);
        this.catalogName = builder.catalogName;
        this.corpId = builder.corpId;
        this.isvSubId = builder.isvSubId;
        this.parentCatalogId = builder.parentCatalogId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProfileCatalogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return parentCatalogId
     */
    public Long getParentCatalogId() {
        return this.parentCatalogId;
    }

    public static final class Builder extends Request.Builder<AddProfileCatalogRequest, Builder> {
        private String catalogName; 
        private String corpId; 
        private String isvSubId; 
        private Long parentCatalogId; 

        private Builder() {
            super();
        } 

        private Builder(AddProfileCatalogRequest response) {
            super(response);
            this.catalogName = response.catalogName;
            this.corpId = response.corpId;
            this.isvSubId = response.isvSubId;
            this.parentCatalogId = response.parentCatalogId;
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

        /**
         * ParentCatalogId.
         */
        public Builder parentCatalogId(Long parentCatalogId) {
            this.putBodyParameter("ParentCatalogId", parentCatalogId);
            this.parentCatalogId = parentCatalogId;
            return this;
        }

        @Override
        public AddProfileCatalogRequest build() {
            return new AddProfileCatalogRequest(this);
        } 

    } 

}
