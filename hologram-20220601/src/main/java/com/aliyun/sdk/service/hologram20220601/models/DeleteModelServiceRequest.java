// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link DeleteModelServiceRequest} extends {@link RequestModel}
 *
 * <p>DeleteModelServiceRequest</p>
 */
public class DeleteModelServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelServiceName")
    private String modelServiceName;

    private DeleteModelServiceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modelServiceName = builder.modelServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelServiceRequest create() {
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
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    public static final class Builder extends Request.Builder<DeleteModelServiceRequest, Builder> {
        private String instanceId; 
        private String modelServiceName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModelServiceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modelServiceName = request.modelServiceName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-xxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * modelServiceName.
         */
        public Builder modelServiceName(String modelServiceName) {
            this.putQueryParameter("modelServiceName", modelServiceName);
            this.modelServiceName = modelServiceName;
            return this;
        }

        @Override
        public DeleteModelServiceRequest build() {
            return new DeleteModelServiceRequest(this);
        } 

    } 

}
