// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindNodeLabelRequest} extends {@link RequestModel}
 *
 * <p>BindNodeLabelRequest</p>
 */
public class BindNodeLabelRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LabelKey")
    @Validation(required = true)
    private String labelKey;

    @Query
    @NameInMap("LabelValue")
    @Validation(required = true)
    private String labelValue;

    private BindNodeLabelRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instanceId = builder.instanceId;
        this.labelKey = builder.labelKey;
        this.labelValue = builder.labelValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindNodeLabelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return labelKey
     */
    public String getLabelKey() {
        return this.labelKey;
    }

    /**
     * @return labelValue
     */
    public String getLabelValue() {
        return this.labelValue;
    }

    public static final class Builder extends Request.Builder<BindNodeLabelRequest, Builder> {
        private String clusterId; 
        private String instanceId; 
        private String labelKey; 
        private String labelValue; 

        private Builder() {
            super();
        } 

        private Builder(BindNodeLabelRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instanceId = request.instanceId;
            this.labelKey = request.labelKey;
            this.labelValue = request.labelValue;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LabelKey.
         */
        public Builder labelKey(String labelKey) {
            this.putQueryParameter("LabelKey", labelKey);
            this.labelKey = labelKey;
            return this;
        }

        /**
         * LabelValue.
         */
        public Builder labelValue(String labelValue) {
            this.putQueryParameter("LabelValue", labelValue);
            this.labelValue = labelValue;
            return this;
        }

        @Override
        public BindNodeLabelRequest build() {
            return new BindNodeLabelRequest(this);
        } 

    } 

}
