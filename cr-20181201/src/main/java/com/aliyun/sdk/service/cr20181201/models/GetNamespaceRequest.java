// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNamespaceRequest} extends {@link RequestModel}
 *
 * <p>GetNamespaceRequest</p>
 */
public class GetNamespaceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetNamespaceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.namespaceName = builder.namespaceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNamespaceRequest create() {
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
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetNamespaceRequest, Builder> {
        private String instanceId; 
        private String namespaceId; 
        private String namespaceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetNamespaceRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.namespaceId = response.namespaceId;
            this.namespaceName = response.namespaceName;
            this.regionId = response.regionId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * NamespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetNamespaceRequest build() {
            return new GetNamespaceRequest(this);
        } 

    } 

}
