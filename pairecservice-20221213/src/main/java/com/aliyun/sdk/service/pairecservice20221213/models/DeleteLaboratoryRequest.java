// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLaboratoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteLaboratoryRequest</p>
 */
public class DeleteLaboratoryRequest extends Request {
    @Path
    @NameInMap("LaboratoryId")
    @Validation(required = true)
    private String laboratoryId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteLaboratoryRequest(Builder builder) {
        super(builder);
        this.laboratoryId = builder.laboratoryId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLaboratoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return laboratoryId
     */
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteLaboratoryRequest, Builder> {
        private String laboratoryId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLaboratoryRequest request) {
            super(request);
            this.laboratoryId = request.laboratoryId;
            this.instanceId = request.instanceId;
        } 

        /**
         * LaboratoryId.
         */
        public Builder laboratoryId(String laboratoryId) {
            this.putPathParameter("LaboratoryId", laboratoryId);
            this.laboratoryId = laboratoryId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteLaboratoryRequest build() {
            return new DeleteLaboratoryRequest(this);
        } 

    } 

}
