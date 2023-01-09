// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateClusterSpecRequest} extends {@link RequestModel}
 *
 * <p>UpdateClusterSpecRequest</p>
 */
public class UpdateClusterSpecRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterSpecification")
    @Validation(required = true)
    private String clusterSpecification;

    @Query
    @NameInMap("InstanceCount")
    @Validation(required = true)
    private Integer instanceCount;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private UpdateClusterSpecRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterId = builder.clusterId;
        this.clusterSpecification = builder.clusterSpecification;
        this.instanceCount = builder.instanceCount;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClusterSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterSpecification
     */
    public String getClusterSpecification() {
        return this.clusterSpecification;
    }

    /**
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateClusterSpecRequest, Builder> {
        private String acceptLanguage; 
        private String clusterId; 
        private String clusterSpecification; 
        private Integer instanceCount; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClusterSpecRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterId = request.clusterId;
            this.clusterSpecification = request.clusterSpecification;
            this.instanceCount = request.instanceCount;
            this.instanceId = request.instanceId;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The destination engine specifications.
         */
        public Builder clusterSpecification(String clusterSpecification) {
            this.putQueryParameter("ClusterSpecification", clusterSpecification);
            this.clusterSpecification = clusterSpecification;
            return this;
        }

        /**
         * The number of destination nodes.
         */
        public Builder instanceCount(Integer instanceCount) {
            this.putQueryParameter("InstanceCount", instanceCount);
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateClusterSpecRequest build() {
            return new UpdateClusterSpecRequest(this);
        } 

    } 

}
