// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAddonRequest} extends {@link RequestModel}
 *
 * <p>GetAddonRequest</p>
 */
public class GetAddonRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addonId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private GetAddonRequest(Builder builder) {
        super(builder);
        this.addonId = builder.addonId;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAddonRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonId
     */
    public String getAddonId() {
        return this.addonId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<GetAddonRequest, Builder> {
        private String addonId; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(GetAddonRequest request) {
            super(request);
            this.addonId = request.addonId;
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The addon ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Login-1.0-W4g****</p>
         */
        public Builder addonId(String addonId) {
            this.putQueryParameter("AddonId", addonId);
            this.addonId = addonId;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public GetAddonRequest build() {
            return new GetAddonRequest(this);
        } 

    } 

}
