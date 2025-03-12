// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

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
 * {@link GetWindowConfigRequest} extends {@link RequestModel}
 *
 * <p>GetWindowConfigRequest</p>
 */
public class GetWindowConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviewToken")
    private String previewToken;

    private GetWindowConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.previewToken = builder.previewToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWindowConfigRequest create() {
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
     * @return previewToken
     */
    public String getPreviewToken() {
        return this.previewToken;
    }

    public static final class Builder extends Request.Builder<GetWindowConfigRequest, Builder> {
        private String regionId; 
        private String previewToken; 

        private Builder() {
            super();
        } 

        private Builder(GetWindowConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.previewToken = request.previewToken;
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
         * PreviewToken.
         */
        public Builder previewToken(String previewToken) {
            this.putQueryParameter("PreviewToken", previewToken);
            this.previewToken = previewToken;
            return this;
        }

        @Override
        public GetWindowConfigRequest build() {
            return new GetWindowConfigRequest(this);
        } 

    } 

}
