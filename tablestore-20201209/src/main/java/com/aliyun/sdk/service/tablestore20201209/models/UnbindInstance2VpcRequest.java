// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link UnbindInstance2VpcRequest} extends {@link RequestModel}
 *
 * <p>UnbindInstance2VpcRequest</p>
 */
public class UnbindInstance2VpcRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceVpcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceVpcName;

    private UnbindInstance2VpcRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.instanceVpcName = builder.instanceVpcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindInstance2VpcRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceVpcName
     */
    public String getInstanceVpcName() {
        return this.instanceVpcName;
    }

    public static final class Builder extends Request.Builder<UnbindInstance2VpcRequest, Builder> {
        private String instanceName; 
        private String instanceVpcName; 

        private Builder() {
            super();
        } 

        private Builder(UnbindInstance2VpcRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.instanceVpcName = request.instanceVpcName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mkdd-test</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xu6666</p>
         */
        public Builder instanceVpcName(String instanceVpcName) {
            this.putBodyParameter("InstanceVpcName", instanceVpcName);
            this.instanceVpcName = instanceVpcName;
            return this;
        }

        @Override
        public UnbindInstance2VpcRequest build() {
            return new UnbindInstance2VpcRequest(this);
        } 

    } 

}
