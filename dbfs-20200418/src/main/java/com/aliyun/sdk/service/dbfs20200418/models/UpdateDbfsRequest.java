// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDbfsRequest} extends {@link RequestModel}
 *
 * <p>UpdateDbfsRequest</p>
 */
public class UpdateDbfsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedFeatures")
    private String advancedFeatures;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedScene")
    private String usedScene;

    private UpdateDbfsRequest(Builder builder) {
        super(builder);
        this.advancedFeatures = builder.advancedFeatures;
        this.fsId = builder.fsId;
        this.instanceType = builder.instanceType;
        this.regionId = builder.regionId;
        this.usedScene = builder.usedScene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDbfsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedFeatures
     */
    public String getAdvancedFeatures() {
        return this.advancedFeatures;
    }

    /**
     * @return fsId
     */
    public String getFsId() {
        return this.fsId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return usedScene
     */
    public String getUsedScene() {
        return this.usedScene;
    }

    public static final class Builder extends Request.Builder<UpdateDbfsRequest, Builder> {
        private String advancedFeatures; 
        private String fsId; 
        private String instanceType; 
        private String regionId; 
        private String usedScene; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDbfsRequest request) {
            super(request);
            this.advancedFeatures = request.advancedFeatures;
            this.fsId = request.fsId;
            this.instanceType = request.instanceType;
            this.regionId = request.regionId;
            this.usedScene = request.usedScene;
        } 

        /**
         * AdvancedFeatures.
         */
        public Builder advancedFeatures(String advancedFeatures) {
            this.putQueryParameter("AdvancedFeatures", advancedFeatures);
            this.advancedFeatures = advancedFeatures;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbfs-GOrr********Yd0VLOyBpg</p>
         */
        public Builder fsId(String fsId) {
            this.putQueryParameter("FsId", fsId);
            this.fsId = fsId;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
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
         * UsedScene.
         */
        public Builder usedScene(String usedScene) {
            this.putQueryParameter("UsedScene", usedScene);
            this.usedScene = usedScene;
            return this;
        }

        @Override
        public UpdateDbfsRequest build() {
            return new UpdateDbfsRequest(this);
        } 

    } 

}
