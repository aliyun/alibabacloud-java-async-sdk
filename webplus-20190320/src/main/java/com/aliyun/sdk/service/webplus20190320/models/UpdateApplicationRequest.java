// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationRequest</p>
 */
public class UpdateApplicationRequest extends Request {
    @Body
    @NameInMap("AppDescription")
    private String appDescription;

    @Body
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private UpdateApplicationRequest(Builder builder) {
        super(builder);
        this.appDescription = builder.appDescription;
        this.appId = builder.appId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appDescription
     */
    public String getAppDescription() {
        return this.appDescription;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationRequest, Builder> {
        private String appDescription; 
        private String appId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationRequest response) {
            super(response);
            this.appDescription = response.appDescription;
            this.appId = response.appId;
            this.regionId = response.regionId;
        } 

        /**
         * AppDescription.
         */
        public Builder appDescription(String appDescription) {
            this.putBodyParameter("AppDescription", appDescription);
            this.appDescription = appDescription;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateApplicationRequest build() {
            return new UpdateApplicationRequest(this);
        } 

    } 

}
