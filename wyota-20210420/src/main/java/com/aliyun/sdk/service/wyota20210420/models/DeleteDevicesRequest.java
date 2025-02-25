// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDevicesRequest} extends {@link RequestModel}
 *
 * <p>DeleteDevicesRequest</p>
 */
public class DeleteDevicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Force")
    @com.aliyun.core.annotation.Validation(required = true)
    private String force;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNos")
    private String serialNos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private DeleteDevicesRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.serialNos = builder.serialNos;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public String getForce() {
        return this.force;
    }

    /**
     * @return serialNos
     */
    public String getSerialNos() {
        return this.serialNos;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DeleteDevicesRequest, Builder> {
        private String force; 
        private String serialNos; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDevicesRequest request) {
            super(request);
            this.force = request.force;
            this.serialNos = request.serialNos;
            this.uuids = request.uuids;
        } 

        /**
         * Force.
         */
        public Builder force(String force) {
            this.putBodyParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * SerialNos.
         */
        public Builder serialNos(String serialNos) {
            this.putBodyParameter("SerialNos", serialNos);
            this.serialNos = serialNos;
            return this;
        }

        /**
         * Uuids.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DeleteDevicesRequest build() {
            return new DeleteDevicesRequest(this);
        } 

    } 

}
