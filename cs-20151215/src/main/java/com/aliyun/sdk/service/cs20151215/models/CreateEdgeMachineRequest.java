// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEdgeMachineRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeMachineRequest</p>
 */
public class CreateEdgeMachineRequest extends Request {
    @Body
    @NameInMap("hostname")
    @Validation(required = true)
    private String hostname;

    @Body
    @NameInMap("sn")
    @Validation(required = true)
    private String sn;

    @Body
    @NameInMap("model")
    @Validation(required = true)
    private String model;

    private CreateEdgeMachineRequest(Builder builder) {
        super(builder);
        this.hostname = builder.hostname;
        this.sn = builder.sn;
        this.model = builder.model;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeMachineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    public static final class Builder extends Request.Builder<CreateEdgeMachineRequest, Builder> {
        private String hostname; 
        private String sn; 
        private String model; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeMachineRequest request) {
            super(request);
            this.hostname = request.hostname;
            this.sn = request.sn;
            this.model = request.model;
        } 

        /**
         * Cloud-native all-in-one machine "hostname ".
         * <p>
         * 
         * > after the cloud-native all-in-one machine is activated, the "hostname" of the host is automatically modified. The "hostname" is prefixed with the product model, followed by a random string.
         */
        public Builder hostname(String hostname) {
            this.putBodyParameter("hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * SN serial number of cloud native all-in-one machine
         */
        public Builder sn(String sn) {
            this.putBodyParameter("sn", sn);
            this.sn = sn;
            return this;
        }

        /**
         * Cloud Native all-in-one machine model
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        @Override
        public CreateEdgeMachineRequest build() {
            return new CreateEdgeMachineRequest(this);
        } 

    } 

}
