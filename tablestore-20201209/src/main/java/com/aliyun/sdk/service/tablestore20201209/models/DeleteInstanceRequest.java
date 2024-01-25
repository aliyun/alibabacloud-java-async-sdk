// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceRequest</p>
 */
public class DeleteInstanceRequest extends Request {
    @Body
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    private DeleteInstanceRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteInstanceRequest, Builder> {
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceRequest request) {
            super(request);
            this.instanceName = request.instanceName;
        } 

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public DeleteInstanceRequest build() {
            return new DeleteInstanceRequest(this);
        } 

    } 

}
