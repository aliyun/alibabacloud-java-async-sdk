// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateModelServiceRequest</p>
 */
public class CreateModelServiceRequest extends Request {
    @Body
    @NameInMap("AlgorithmCode")
    private String algorithmCode;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("InstanceName")
    private String instanceName;

    @Body
    @NameInMap("QPSRequired")
    private Integer QPSRequired;

    private CreateModelServiceRequest(Builder builder) {
        super(builder);
        this.algorithmCode = builder.algorithmCode;
        this.clientToken = builder.clientToken;
        this.instanceName = builder.instanceName;
        this.QPSRequired = builder.QPSRequired;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmCode
     */
    public String getAlgorithmCode() {
        return this.algorithmCode;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return QPSRequired
     */
    public Integer getQPSRequired() {
        return this.QPSRequired;
    }

    public static final class Builder extends Request.Builder<CreateModelServiceRequest, Builder> {
        private String algorithmCode; 
        private String clientToken; 
        private String instanceName; 
        private Integer QPSRequired; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelServiceRequest response) {
            super(response);
            this.algorithmCode = response.algorithmCode;
            this.clientToken = response.clientToken;
            this.instanceName = response.instanceName;
            this.QPSRequired = response.QPSRequired;
        } 

        /**
         * AlgorithmCode.
         */
        public Builder algorithmCode(String algorithmCode) {
            this.putBodyParameter("AlgorithmCode", algorithmCode);
            this.algorithmCode = algorithmCode;
            return this;
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
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * QPSRequired.
         */
        public Builder QPSRequired(Integer QPSRequired) {
            this.putBodyParameter("QPSRequired", QPSRequired);
            this.QPSRequired = QPSRequired;
            return this;
        }

        @Override
        public CreateModelServiceRequest build() {
            return new CreateModelServiceRequest(this);
        } 

    } 

}
