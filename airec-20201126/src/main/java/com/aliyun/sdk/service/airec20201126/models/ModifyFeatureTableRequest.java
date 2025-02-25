// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyFeatureTableRequest} extends {@link RequestModel}
 *
 * <p>ModifyFeatureTableRequest</p>
 */
public class ModifyFeatureTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("featureTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureTableId;

    private ModifyFeatureTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.type = builder.type;
        this.featureTableId = builder.featureTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFeatureTableRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return featureTableId
     */
    public String getFeatureTableId() {
        return this.featureTableId;
    }

    public static final class Builder extends Request.Builder<ModifyFeatureTableRequest, Builder> {
        private String instanceId; 
        private String type; 
        private String featureTableId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFeatureTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.type = request.type;
            this.featureTableId = request.featureTableId;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>PUT /v2/openapi/instances/{instanceId}/feature-tables/{type}/{featureTableId}</p>
         * <p>{</p>
         * <pre><code>    &quot;metaType&quot;:&quot;FeatureTable&quot;,
         *     &quot;featureList&quot;:[
         *         {
         *             &quot;featureName&quot;:&quot;fn11&quot;,
         *             &quot;fieldName&quot;:&quot;fieldName11&quot;,
         *             &quot;comment&quot;:&quot;com11&quot;
         *         },
         *         {
         *             &quot;featureName&quot;:&quot;fn22&quot;,
         *             &quot;fieldName&quot;:&quot;fieldName22&quot;,
         *             &quot;comment&quot;:&quot;com2222&quot;
         *         }
         *     ]
         * }
         * </code></pre>
         * <p>}</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UserFeatureTable</p>
         */
        public Builder type(String type) {
            this.putPathParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The type of the feature table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder featureTableId(String featureTableId) {
            this.putPathParameter("featureTableId", featureTableId);
            this.featureTableId = featureTableId;
            return this;
        }

        @Override
        public ModifyFeatureTableRequest build() {
            return new ModifyFeatureTableRequest(this);
        } 

    } 

}
