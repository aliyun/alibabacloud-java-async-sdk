// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefreshFeatureTableRequest} extends {@link RequestModel}
 *
 * <p>RefreshFeatureTableRequest</p>
 */
public class RefreshFeatureTableRequest extends Request {
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

    private RefreshFeatureTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.type = builder.type;
        this.featureTableId = builder.featureTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshFeatureTableRequest create() {
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

    public static final class Builder extends Request.Builder<RefreshFeatureTableRequest, Builder> {
        private String instanceId; 
        private String type; 
        private String featureTableId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshFeatureTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.type = request.type;
            this.featureTableId = request.featureTableId;
        } 

        /**
         * <p>The instance ID.</p>
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
         * <p>The type of the feature table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder type(String type) {
            this.putPathParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The feature table ID.</p>
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
        public RefreshFeatureTableRequest build() {
            return new RefreshFeatureTableRequest(this);
        } 

    } 

}
