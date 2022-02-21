// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWindowConfigRequest} extends {@link RequestModel}
 *
 * <p>GetWindowConfigRequest</p>
 */
public class GetWindowConfigRequest extends Request {
    @Query
    @NameInMap("PreviewToken")
    private String previewToken;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetWindowConfigRequest(Builder builder) {
        super(builder);
        this.previewToken = builder.previewToken;
        this.regionId = builder.regionId;
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
     * @return previewToken
     */
    public String getPreviewToken() {
        return this.previewToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetWindowConfigRequest, Builder> {
        private String previewToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetWindowConfigRequest response) {
            super(response);
            this.previewToken = response.previewToken;
            this.regionId = response.regionId;
        } 

        /**
         * PreviewToken.
         */
        public Builder previewToken(String previewToken) {
            this.putQueryParameter("PreviewToken", previewToken);
            this.previewToken = previewToken;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetWindowConfigRequest build() {
            return new GetWindowConfigRequest(this);
        } 

    } 

}
