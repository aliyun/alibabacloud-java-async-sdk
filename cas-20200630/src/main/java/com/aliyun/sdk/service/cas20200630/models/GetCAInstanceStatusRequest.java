// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCAInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetCAInstanceStatusRequest</p>
 */
public class GetCAInstanceStatusRequest extends Request {
    @Query
    @NameInMap("Identifier")
    private String identifier;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private GetCAInstanceStatusRequest(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCAInstanceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetCAInstanceStatusRequest, Builder> {
        private String identifier; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetCAInstanceStatusRequest request) {
            super(request);
            this.identifier = request.identifier;
            this.instanceId = request.instanceId;
        } 

        /**
         * Identifier.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
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
        public GetCAInstanceStatusRequest build() {
            return new GetCAInstanceStatusRequest(this);
        } 

    } 

}
