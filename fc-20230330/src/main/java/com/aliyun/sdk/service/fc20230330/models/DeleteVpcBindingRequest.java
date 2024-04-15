// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcBindingRequest} extends {@link RequestModel}
 *
 * <p>DeleteVpcBindingRequest</p>
 */
public class DeleteVpcBindingRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Path
    @NameInMap("vpcId")
    @Validation(required = true)
    private String vpcId;

    private DeleteVpcBindingRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVpcBindingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DeleteVpcBindingRequest, Builder> {
        private String functionName; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVpcBindingRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.vpcId = request.vpcId;
        } 

        /**
         * The function name.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC).
         */
        public Builder vpcId(String vpcId) {
            this.putPathParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DeleteVpcBindingRequest build() {
            return new DeleteVpcBindingRequest(this);
        } 

    } 

}
