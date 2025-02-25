// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateABMetricGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateABMetricGroupRequest</p>
 */
public class UpdateABMetricGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ABMetricGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ABMetricGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ABMetricIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ABMetricIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Realtime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean realtime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private UpdateABMetricGroupRequest(Builder builder) {
        super(builder);
        this.ABMetricGroupId = builder.ABMetricGroupId;
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

    public static UpdateABMetricGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ABMetricGroupId
     */
    public String getABMetricGroupId() {
        return this.ABMetricGroupId;
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

    public static final class Builder extends Request.Builder<UpdateABMetricGroupRequest, Builder> {
        private String ABMetricGroupId; 
        private String ABMetricIds; 
        private String description; 
        private String instanceId; 
        private String name; 
        private Boolean realtime; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateABMetricGroupRequest request) {
            super(request);
            this.ABMetricGroupId = request.ABMetricGroupId;
            this.ABMetricIds = request.ABMetricIds;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.realtime = request.realtime;
            this.sceneId = request.sceneId;
        } 

        /**
         * ABMetricGroupId.
         */
        public Builder ABMetricGroupId(String ABMetricGroupId) {
            this.putPathParameter("ABMetricGroupId", ABMetricGroupId);
            this.ABMetricGroupId = ABMetricGroupId;
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
        public UpdateABMetricGroupRequest build() {
            return new UpdateABMetricGroupRequest(this);
        } 

    } 

}
