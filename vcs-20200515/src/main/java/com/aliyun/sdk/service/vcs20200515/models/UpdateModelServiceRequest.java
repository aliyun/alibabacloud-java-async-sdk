// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelServiceRequest</p>
 */
public class UpdateModelServiceRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("ModelServiceId")
    private String modelServiceId;

    @Body
    @NameInMap("ModelServiceName")
    private String modelServiceName;

    @Body
    @NameInMap("QpsRequired")
    private Integer qpsRequired;

    private UpdateModelServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.modelServiceId = builder.modelServiceId;
        this.modelServiceName = builder.modelServiceName;
        this.qpsRequired = builder.qpsRequired;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return modelServiceId
     */
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    /**
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    /**
     * @return qpsRequired
     */
    public Integer getQpsRequired() {
        return this.qpsRequired;
    }

    public static final class Builder extends Request.Builder<UpdateModelServiceRequest, Builder> {
        private String clientToken; 
        private String modelServiceId; 
        private String modelServiceName; 
        private Integer qpsRequired; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelServiceRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.modelServiceId = response.modelServiceId;
            this.modelServiceName = response.modelServiceName;
            this.qpsRequired = response.qpsRequired;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ModelServiceId.
         */
        public Builder modelServiceId(String modelServiceId) {
            this.putBodyParameter("ModelServiceId", modelServiceId);
            this.modelServiceId = modelServiceId;
            return this;
        }

        /**
         * ModelServiceName.
         */
        public Builder modelServiceName(String modelServiceName) {
            this.putBodyParameter("ModelServiceName", modelServiceName);
            this.modelServiceName = modelServiceName;
            return this;
        }

        /**
         * QpsRequired.
         */
        public Builder qpsRequired(Integer qpsRequired) {
            this.putBodyParameter("QpsRequired", qpsRequired);
            this.qpsRequired = qpsRequired;
            return this;
        }

        @Override
        public UpdateModelServiceRequest build() {
            return new UpdateModelServiceRequest(this);
        } 

    } 

}
