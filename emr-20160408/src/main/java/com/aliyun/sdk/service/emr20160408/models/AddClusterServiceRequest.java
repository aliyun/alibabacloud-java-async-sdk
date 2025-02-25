// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddClusterServiceRequest} extends {@link RequestModel}
 *
 * <p>AddClusterServiceRequest</p>
 */
public class AddClusterServiceRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Service")
    @Validation(required = true)
    private java.util.List < Service> service;

    private AddClusterServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.comment = builder.comment;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.service = builder.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddClusterServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return service
     */
    public java.util.List < Service> getService() {
        return this.service;
    }

    public static final class Builder extends Request.Builder<AddClusterServiceRequest, Builder> {
        private String clusterId; 
        private String comment; 
        private String regionId; 
        private Long resourceOwnerId; 
        private java.util.List < Service> service; 

        private Builder() {
            super();
        } 

        private Builder(AddClusterServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.comment = request.comment;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.service = request.service;
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
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Service.
         */
        public Builder service(java.util.List < Service> service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        @Override
        public AddClusterServiceRequest build() {
            return new AddClusterServiceRequest(this);
        } 

    } 

    public static class Service extends TeaModel {
        @NameInMap("ServiceName")
        @Validation(required = true)
        private String serviceName;

        @NameInMap("ServiceVersion")
        private String serviceVersion;

        private Service(Builder builder) {
            this.serviceName = builder.serviceName;
            this.serviceVersion = builder.serviceVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Service create() {
            return builder().build();
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceVersion
         */
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public static final class Builder {
            private String serviceName; 
            private String serviceVersion; 

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * ServiceVersion.
             */
            public Builder serviceVersion(String serviceVersion) {
                this.serviceVersion = serviceVersion;
                return this;
            }

            public Service build() {
                return new Service(this);
            } 

        } 

    }
}
