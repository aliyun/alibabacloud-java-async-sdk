// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsInstanceDeleteRequest} extends {@link RequestModel}
 *
 * <p>OnsInstanceDeleteRequest</p>
 */
public class OnsInstanceDeleteRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private OnsInstanceDeleteRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsInstanceDeleteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<OnsInstanceDeleteRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(OnsInstanceDeleteRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public OnsInstanceDeleteRequest build() {
            return new OnsInstanceDeleteRequest(this);
        } 

    } 

}
