// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateModelFeatureFGInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelFeatureFGInfoRequest</p>
 */
public class UpdateModelFeatureFGInfoRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelFeatureId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelFeatureId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    private UpdateModelFeatureFGInfoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modelFeatureId = builder.modelFeatureId;
        this.regionId = builder.regionId;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelFeatureFGInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modelFeatureId
     */
    public String getModelFeatureId() {
        return this.modelFeatureId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder extends Request.Builder<UpdateModelFeatureFGInfoRequest, Builder> {
        private String instanceId; 
        private String modelFeatureId; 
        private String regionId; 
        private String content; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelFeatureFGInfoRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modelFeatureId = request.modelFeatureId;
            this.regionId = request.regionId;
            this.content = request.content;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder modelFeatureId(String modelFeatureId) {
            this.putPathParameter("ModelFeatureId", modelFeatureId);
            this.modelFeatureId = modelFeatureId;
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
         * <p>{&quot;features&quot;: [{&quot;feature_name&quot;: &quot;item_id&quot;,&quot;feature_type&quot;: &quot;id_feature&quot;,&quot;value_type&quot;: &quot;String&quot;,&quot;expression&quot;: &quot;item:item_id&quot;,&quot;default_value&quot;: &quot;-1024&quot;,&quot;combiner&quot;: &quot;mean&quot;,&quot;need_prefix&quot;: false},{&quot;feature_name&quot;: &quot;f1&quot;,&quot;feature_type&quot;: &quot;lookup_feature&quot;,&quot;value_type&quot;: &quot;Integer&quot;,&quot;map&quot;: &quot;item:f1&quot;,&quot;key&quot;: &quot;user:1&quot;,&quot;default_value&quot;: &quot;0&quot;,&quot;combiner&quot;: &quot;mean&quot;,&quot;need_prefix&quot;: false,&quot;needDiscrete&quot;: false,&quot;needWeighting&quot;: false,&quot;needKey&quot;: false}],&quot;reserves&quot;: [&quot;f1&quot;]}</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        @Override
        public UpdateModelFeatureFGInfoRequest build() {
            return new UpdateModelFeatureFGInfoRequest(this);
        } 

    } 

}
