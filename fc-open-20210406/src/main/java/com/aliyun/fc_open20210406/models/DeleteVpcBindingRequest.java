// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteVpcBindingRequest} extends {@link RequestModel}
 *
 * <p>DeleteVpcBindingRequest</p>
 */
public class DeleteVpcBindingRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("vpcId")
    private String vpcId;


    private DeleteVpcBindingRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVpcBindingRequest create() {
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
         * <p>serviceName.</p>
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
            this.putPathParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        public DeleteVpcBindingRequest build() {
            return new DeleteVpcBindingRequest(this);
        } 

    } 

}
