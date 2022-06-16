// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNodeLabelRequest} extends {@link RequestModel}
 *
 * <p>DeleteNodeLabelRequest</p>
 */
public class DeleteNodeLabelRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Force")
    @Validation(required = true)
    private Boolean force;

    @Query
    @NameInMap("LabelKey")
    @Validation(required = true)
    private String labelKey;

    @Query
    @NameInMap("LabelValue")
    @Validation(required = true)
    private String labelValue;

    private DeleteNodeLabelRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.force = builder.force;
        this.labelKey = builder.labelKey;
        this.labelValue = builder.labelValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNodeLabelRequest create() {
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
     * @return force
     */
    public Boolean getForce() {
        return this.force;
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

    public static final class Builder extends Request.Builder<DeleteNodeLabelRequest, Builder> {
        private String clusterId; 
        private Boolean force; 
        private String labelKey; 
        private String labelValue; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNodeLabelRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.force = request.force;
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
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
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
        public DeleteNodeLabelRequest build() {
            return new DeleteNodeLabelRequest(this);
        } 

    } 

}
