// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DeleteServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceVersionRequest</p>
 */
public class DeleteServiceVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private DeleteServiceVersionRequest(Builder builder) {
        super(builder);
        this.serviceId = builder.serviceId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteServiceVersionRequest, Builder> {
        private String serviceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceVersionRequest request) {
            super(request);
            this.serviceId = request.serviceId;
            this.name = request.name;
        } 

        /**
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-xxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The version name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteServiceVersionRequest build() {
            return new DeleteServiceVersionRequest(this);
        } 

    } 

}
