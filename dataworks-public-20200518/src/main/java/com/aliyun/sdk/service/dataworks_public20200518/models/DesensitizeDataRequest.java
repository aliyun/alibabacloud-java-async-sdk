// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DesensitizeDataRequest} extends {@link RequestModel}
 *
 * <p>DesensitizeDataRequest</p>
 */
public class DesensitizeDataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneCode;

    private DesensitizeDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.data = builder.data;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    public static final class Builder extends Request.Builder<DesensitizeDataRequest, Builder> {
        private String regionId; 
        private String data; 
        private String sceneCode; 

        private Builder() {
            super();
        } 

        private Builder(DesensitizeDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.data = request.data;
            this.sceneCode = request.sceneCode;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The data that you want to mask.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15365291784</p>
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The code of the data masking scenario. You can view the code on the Data Masking Management page in Data Security Guard of the DataWorks console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>_default_scene_code</p>
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
