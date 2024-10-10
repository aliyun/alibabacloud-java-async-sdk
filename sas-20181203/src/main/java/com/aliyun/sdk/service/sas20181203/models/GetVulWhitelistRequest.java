// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVulWhitelistRequest} extends {@link RequestModel}
 *
 * <p>GetVulWhitelistRequest</p>
 */
public class GetVulWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulWhitelistId")
    private Long vulWhitelistId;

    private GetVulWhitelistRequest(Builder builder) {
        super(builder);
        this.vulWhitelistId = builder.vulWhitelistId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVulWhitelistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vulWhitelistId
     */
    public Long getVulWhitelistId() {
        return this.vulWhitelistId;
    }

    public static final class Builder extends Request.Builder<GetVulWhitelistRequest, Builder> {
        private Long vulWhitelistId; 

        private Builder() {
            super();
        } 

        private Builder(GetVulWhitelistRequest request) {
            super(request);
            this.vulWhitelistId = request.vulWhitelistId;
        } 

        /**
         * <p>The ID of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>1275</p>
         */
        public Builder vulWhitelistId(Long vulWhitelistId) {
            this.putQueryParameter("VulWhitelistId", vulWhitelistId);
            this.vulWhitelistId = vulWhitelistId;
            return this;
        }

        @Override
        public GetVulWhitelistRequest build() {
            return new GetVulWhitelistRequest(this);
        } 

    } 

}
