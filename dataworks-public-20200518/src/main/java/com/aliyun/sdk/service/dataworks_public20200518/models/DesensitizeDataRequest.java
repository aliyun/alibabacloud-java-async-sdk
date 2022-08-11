// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DesensitizeDataRequest} extends {@link RequestModel}
 *
 * <p>DesensitizeDataRequest</p>
 */
public class DesensitizeDataRequest extends Request {
    @Body
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("SceneCode")
    @Validation(required = true)
    private String sceneCode;

    private DesensitizeDataRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.regionId = builder.regionId;
        this.sceneCode = builder.sceneCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DesensitizeDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    public static final class Builder extends Request.Builder<DesensitizeDataRequest, Builder> {
        private String data; 
        private String regionId; 
        private String sceneCode; 

        private Builder() {
            super();
        } 

        private Builder(DesensitizeDataRequest request) {
            super(request);
            this.data = request.data;
            this.regionId = request.regionId;
            this.sceneCode = request.sceneCode;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
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
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putBodyParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        @Override
        public DesensitizeDataRequest build() {
            return new DesensitizeDataRequest(this);
        } 

    } 

}
