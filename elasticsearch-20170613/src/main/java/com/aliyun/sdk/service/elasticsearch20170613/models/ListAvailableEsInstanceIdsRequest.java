// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableEsInstanceIdsRequest} extends {@link RequestModel}
 *
 * <p>ListAvailableEsInstanceIdsRequest</p>
 */
public class ListAvailableEsInstanceIdsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ListAvailableEsInstanceIdsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableEsInstanceIdsRequest create() {
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

    public static final class Builder extends Request.Builder<ListAvailableEsInstanceIdsRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListAvailableEsInstanceIdsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ListAvailableEsInstanceIdsRequest build() {
            return new ListAvailableEsInstanceIdsRequest(this);
        } 

    } 

}
