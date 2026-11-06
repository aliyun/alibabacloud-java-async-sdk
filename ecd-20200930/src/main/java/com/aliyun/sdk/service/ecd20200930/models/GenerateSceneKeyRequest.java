// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link GenerateSceneKeyRequest} extends {@link RequestModel}
 *
 * <p>GenerateSceneKeyRequest</p>
 */
public class GenerateSceneKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    private GenerateSceneKeyRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.expireTime = builder.expireTime;
        this.regionId = builder.regionId;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateSceneKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return expireTime
     */
    public Integer getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<GenerateSceneKeyRequest, Builder> {
        private String desktopId; 
        private Integer expireTime; 
        private String regionId; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(GenerateSceneKeyRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.expireTime = request.expireTime;
            this.regionId = request.regionId;
            this.scene = request.scene;
        } 

        /**
         * <p>The cloud desktop ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The validity period of the key, in hours. A value of 0 indicates that the key never expires. If this parameter is not specified, the default server value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>AgentGateway</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public GenerateSceneKeyRequest build() {
            return new GenerateSceneKeyRequest(this);
        } 

    } 

}
