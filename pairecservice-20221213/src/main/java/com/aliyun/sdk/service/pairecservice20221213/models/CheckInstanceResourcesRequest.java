// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckInstanceResourcesRequest} extends {@link RequestModel}
 *
 * <p>CheckInstanceResourcesRequest</p>
 */
public class CheckInstanceResourcesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("Type")
    private String type;

    @Body
    @NameInMap("Uri")
    private String uri;

    private CheckInstanceResourcesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.type = builder.type;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckInstanceResourcesRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder extends Request.Builder<CheckInstanceResourcesRequest, Builder> {
        private String instanceId; 
        private String type; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(CheckInstanceResourcesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.type = request.type;
            this.uri = request.uri;
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
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        @Override
        public CheckInstanceResourcesRequest build() {
            return new CheckInstanceResourcesRequest(this);
        } 

    } 

}
