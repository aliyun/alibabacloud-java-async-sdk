// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOsVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteOsVersionRequest</p>
 */
public class DeleteOsVersionRequest extends Request {
    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("OsVersionId")
    @Validation(required = true)
    private String osVersionId;

    private DeleteOsVersionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.osVersionId = builder.osVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOsVersionRequest create() {
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
     * @return osVersionId
     */
    public String getOsVersionId() {
        return this.osVersionId;
    }

    public static final class Builder extends Request.Builder<DeleteOsVersionRequest, Builder> {
        private String instanceId; 
        private String osVersionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOsVersionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.osVersionId = request.osVersionId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OsVersionId.
         */
        public Builder osVersionId(String osVersionId) {
            this.putBodyParameter("OsVersionId", osVersionId);
            this.osVersionId = osVersionId;
            return this;
        }

        @Override
        public DeleteOsVersionRequest build() {
            return new DeleteOsVersionRequest(this);
        } 

    } 

}
