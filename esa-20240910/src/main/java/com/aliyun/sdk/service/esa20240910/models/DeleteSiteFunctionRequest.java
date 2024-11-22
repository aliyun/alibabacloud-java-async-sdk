// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteSiteFunctionRequest} extends {@link RequestModel}
 *
 * <p>DeleteSiteFunctionRequest</p>
 */
public class DeleteSiteFunctionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private DeleteSiteFunctionRequest(Builder builder) {
        super(builder);
        this.configIds = builder.configIds;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSiteFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configIds
     */
    public String getConfigIds() {
        return this.configIds;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<DeleteSiteFunctionRequest, Builder> {
        private String configIds; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSiteFunctionRequest request) {
            super(request);
            this.configIds = request.configIds;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>33793140540****,33793140540****</p>
         */
        public Builder configIds(String configIds) {
            this.putQueryParameter("ConfigIds", configIds);
            this.configIds = configIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>611133661****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public DeleteSiteFunctionRequest build() {
            return new DeleteSiteFunctionRequest(this);
        } 

    } 

}
