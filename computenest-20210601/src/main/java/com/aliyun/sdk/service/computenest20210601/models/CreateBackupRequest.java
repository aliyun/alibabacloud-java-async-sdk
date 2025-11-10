// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CreateBackupRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupRequest</p>
 */
public class CreateBackupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceInstanceId;

    private CreateBackupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<CreateBackupRequest, Builder> {
        private String description; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupRequest request) {
            super(request);
            this.description = request.description;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * <p>Backup description</p>
         * 
         * <strong>example:</strong>
         * <p>No description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the service instance to be transferred to official version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>si-56cfb7ec3a634448a96c</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public CreateBackupRequest build() {
            return new CreateBackupRequest(this);
        } 

    } 

}
