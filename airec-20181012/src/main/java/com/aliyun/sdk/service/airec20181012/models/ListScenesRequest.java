// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScenesRequest} extends {@link RequestModel}
 *
 * <p>ListScenesRequest</p>
 */
public class ListScenesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Status")
    private String status;

    private ListScenesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScenesRequest create() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListScenesRequest, Builder> {
        private String instanceId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListScenesRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.status = response.status;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListScenesRequest build() {
            return new ListScenesRequest(this);
        } 

    } 

}
