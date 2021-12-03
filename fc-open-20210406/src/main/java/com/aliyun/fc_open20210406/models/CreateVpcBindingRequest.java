// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateVpcBindingRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcBindingRequest</p>
 */
public class CreateVpcBindingRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Body
    @NameInMap("vpcId")
    private String vpcId;


    private CreateVpcBindingRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcBindingRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String vpcId; 

        /**
         * <p>A short description of struct</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>vpcId.</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        public CreateVpcBindingRequest build() {
            return new CreateVpcBindingRequest(this);
        } 

    } 

}
