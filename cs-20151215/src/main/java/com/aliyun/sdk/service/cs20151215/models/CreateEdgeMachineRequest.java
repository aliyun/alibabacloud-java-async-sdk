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
    @NameInMap("model")
    @Validation(required = true)
    private String model;

    @Body
    @NameInMap("sn")
    @Validation(required = true)
    private String sn;

    private CreateEdgeMachineRequest(Builder builder) {
        super(builder);
        this.hostname = builder.hostname;
        this.model = builder.model;
        this.sn = builder.sn;
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
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    public static final class Builder extends Request.Builder<CreateEdgeMachineRequest, Builder> {
        private String hostname; 
        private String model; 
        private String sn; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeMachineRequest request) {
            super(request);
            this.hostname = request.hostname;
            this.model = request.model;
            this.sn = request.sn;
        } 

        /**
         * hostname
         */
        public Builder hostname(String hostname) {
            this.putBodyParameter("hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * model
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * sn
         */
        public Builder sn(String sn) {
            this.putBodyParameter("sn", sn);
            this.sn = sn;
            return this;
        }

        @Override
        public CreateEdgeMachineRequest build() {
            return new CreateEdgeMachineRequest(this);
        } 

    } 

}
