// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGlobalResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateGlobalResourceRequest</p>
 */
public class CreateGlobalResourceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ResourceName")
    @Validation(required = true)
    private String resourceName;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private CreateGlobalResourceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGlobalResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<CreateGlobalResourceRequest, Builder> {
        private String clientToken; 
        private String clusterId; 
        private String resourceName; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateGlobalResourceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.clusterId = request.clusterId;
            this.resourceName = request.resourceName;
            this.resourceType = request.resourceType;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public CreateGlobalResourceRequest build() {
            return new CreateGlobalResourceRequest(this);
        } 

    } 

}
