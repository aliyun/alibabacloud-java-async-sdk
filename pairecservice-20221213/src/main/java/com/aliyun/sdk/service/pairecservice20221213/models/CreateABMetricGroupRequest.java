// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateABMetricGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateABMetricGroupRequest</p>
 */
public class CreateABMetricGroupRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ABMetricIds")
    @Validation(required = true)
    private String ABMetricIds;

    @Body
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("Realtime")
    @Validation(required = true)
    private Boolean realtime;

    @Body
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private CreateABMetricGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ABMetricIds = builder.ABMetricIds;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.realtime = builder.realtime;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateABMetricGroupRequest create() {
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
     * @return ABMetricIds
     */
    public String getABMetricIds() {
        return this.ABMetricIds;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return realtime
     */
    public Boolean getRealtime() {
        return this.realtime;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<CreateABMetricGroupRequest, Builder> {
        private String regionId; 
        private String ABMetricIds; 
        private String description; 
        private String instanceId; 
        private String name; 
        private Boolean realtime; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateABMetricGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ABMetricIds = request.ABMetricIds;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.realtime = request.realtime;
            this.sceneId = request.sceneId;
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
         * ABMetricIds.
         */
        public Builder ABMetricIds(String ABMetricIds) {
            this.putBodyParameter("ABMetricIds", ABMetricIds);
            this.ABMetricIds = ABMetricIds;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Realtime.
         */
        public Builder realtime(Boolean realtime) {
            this.putBodyParameter("Realtime", realtime);
            this.realtime = realtime;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public CreateABMetricGroupRequest build() {
            return new CreateABMetricGroupRequest(this);
        } 

    } 

}
