// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCatalogListRequest} extends {@link RequestModel}
 *
 * <p>GetCatalogListRequest</p>
 */
public class GetCatalogListRequest extends Request {
    @Query
    @NameInMap("CorpId")
    private String corpId;

    @Query
    @NameInMap("IsvSubId")
    @Validation(required = true)
    private String isvSubId;

    private GetCatalogListRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.isvSubId = builder.isvSubId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetCatalogListRequest, Builder> {
        private String corpId; 
        private String isvSubId; 

        private Builder() {
            super();
        } 

        private Builder(GetCatalogListRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.isvSubId = response.isvSubId;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putQueryParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * IsvSubId.
         */
        public Builder isvSubId(String isvSubId) {
            this.putQueryParameter("IsvSubId", isvSubId);
            this.isvSubId = isvSubId;
            return this;
        }

        @Override
        public GetCatalogListRequest build() {
            return new GetCatalogListRequest(this);
        } 

    } 

}
