// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAgenticAgentByInstallTokenRequest} extends {@link RequestModel}
 *
 * <p>GetAgenticAgentByInstallTokenRequest</p>
 */
public class GetAgenticAgentByInstallTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstallToken")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256)
    private String installToken;

    private GetAgenticAgentByInstallTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.installToken = builder.installToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgenticAgentByInstallTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return installToken
     */
    public String getInstallToken() {
        return this.installToken;
    }

    public static final class Builder extends Request.Builder<GetAgenticAgentByInstallTokenRequest, Builder> {
        private String regionId; 
        private String installToken; 

        private Builder() {
            super();
        } 

        private Builder(GetAgenticAgentByInstallTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.installToken = request.installToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The one-time install token issued by IssueAgenticInstallToken. The token starts with dit_ followed by 40 URL-safe Base64 characters, making a total length of 44 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dit_0123456789abcdefghijklmnopqrstuvwxyzABCD</p>
         */
        public Builder installToken(String installToken) {
            this.putQueryParameter("InstallToken", installToken);
            this.installToken = installToken;
            return this;
        }

        @Override
        public GetAgenticAgentByInstallTokenRequest build() {
            return new GetAgenticAgentByInstallTokenRequest(this);
        } 

    } 

}
