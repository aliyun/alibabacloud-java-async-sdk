// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAIInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteAIInstanceRequest</p>
 */
public class DeleteAIInstanceRequest extends Request {
    @Body
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private java.util.List < String > instanceIds;

    private DeleteAIInstanceRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAIInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<DeleteAIInstanceRequest, Builder> {
        private java.util.List < String > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAIInstanceRequest response) {
            super(response);
            this.instanceIds = response.instanceIds;
        } 

        /**
         * 需要删除的计算实例id
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putBodyParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public DeleteAIInstanceRequest build() {
            return new DeleteAIInstanceRequest(this);
        } 

    } 

}
