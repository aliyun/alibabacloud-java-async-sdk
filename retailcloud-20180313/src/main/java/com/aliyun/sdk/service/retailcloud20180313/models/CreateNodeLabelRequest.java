// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNodeLabelRequest} extends {@link RequestModel}
 *
 * <p>CreateNodeLabelRequest</p>
 */
public class CreateNodeLabelRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("LabelKey")
    @Validation(required = true)
    private String labelKey;

    @Query
    @NameInMap("LabelValue")
    @Validation(required = true)
    private String labelValue;

    private CreateNodeLabelRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.labelKey = builder.labelKey;
        this.labelValue = builder.labelValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNodeLabelRequest create() {
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

    public static final class Builder extends Request.Builder<CreateNodeLabelRequest, Builder> {
        private String clusterId; 
        private String labelKey; 
        private String labelValue; 

        private Builder() {
            super();
        } 

        private Builder(CreateNodeLabelRequest request) {
            super(request);
            this.clusterId = request.clusterId;
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
        public CreateNodeLabelRequest build() {
            return new CreateNodeLabelRequest(this);
        } 

    } 

}
