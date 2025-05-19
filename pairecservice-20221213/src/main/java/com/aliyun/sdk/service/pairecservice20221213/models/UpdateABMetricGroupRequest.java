// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link UpdateABMetricGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateABMetricGroupRequest</p>
 */
public class UpdateABMetricGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ABMetricGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ABMetricGroupId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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

    public static final class Builder extends Request.Builder<UpdateABMetricGroupRequest, Builder> {
        private String ABMetricGroupId; 
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

        private Builder(UpdateABMetricGroupRequest request) {
            super(request);
            this.ABMetricGroupId = request.ABMetricGroupId;
            this.regionId = request.regionId;
            this.ABMetricIds = request.ABMetricIds;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.realtime = request.realtime;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ABMetricGroupId(String ABMetricGroupId) {
            this.putPathParameter("ABMetricGroupId", ABMetricGroupId);
            this.ABMetricGroupId = ABMetricGroupId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        public Builder ABMetricIds(String ABMetricIds) {
            this.putBodyParameter("ABMetricIds", ABMetricIds);
            this.ABMetricIds = ABMetricIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-test1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>visits</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder realtime(Boolean realtime) {
            this.putBodyParameter("Realtime", realtime);
            this.realtime = realtime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
