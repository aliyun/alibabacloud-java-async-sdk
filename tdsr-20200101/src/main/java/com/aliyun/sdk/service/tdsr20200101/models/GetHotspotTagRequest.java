// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotspotTagRequest} extends {@link RequestModel}
 *
 * <p>GetHotspotTagRequest</p>
 */
public class GetHotspotTagRequest extends Request {
    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("Enabled")
    private Boolean enabled;

    @Query
    @NameInMap("PreviewToken")
    private String previewToken;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SubSceneUuid")
    private String subSceneUuid;

    @Query
    @NameInMap("Type")
    private String type;

    private GetHotspotTagRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.enabled = builder.enabled;
        this.previewToken = builder.previewToken;
        this.regionId = builder.regionId;
        this.subSceneUuid = builder.subSceneUuid;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotspotTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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

    /**
     * @return subSceneUuid
     */
    public String getSubSceneUuid() {
        return this.subSceneUuid;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetHotspotTagRequest, Builder> {
        private String domain; 
        private Boolean enabled; 
        private String previewToken; 
        private String regionId; 
        private String subSceneUuid; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetHotspotTagRequest request) {
            super(request);
            this.domain = request.domain;
            this.enabled = request.enabled;
            this.previewToken = request.previewToken;
            this.regionId = request.regionId;
            this.subSceneUuid = request.subSceneUuid;
            this.type = request.type;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SubSceneUuid.
         */
        public Builder subSceneUuid(String subSceneUuid) {
            this.putQueryParameter("SubSceneUuid", subSceneUuid);
            this.subSceneUuid = subSceneUuid;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetHotspotTagRequest build() {
            return new GetHotspotTagRequest(this);
        } 

    } 

}
