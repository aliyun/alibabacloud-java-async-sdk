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

    @Query
    @NameInMap("MseSessionId")
    private String mseSessionId;

    private UpdateClusterSpecRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterId = builder.clusterId;
        this.clusterSpecification = builder.clusterSpecification;
        this.instanceCount = builder.instanceCount;
        this.instanceId = builder.instanceId;
        this.mseSessionId = builder.mseSessionId;
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

    /**
     * @return mseSessionId
     */
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    public static final class Builder extends Request.Builder<UpdateClusterSpecRequest, Builder> {
        private String acceptLanguage; 
        private String clusterId; 
        private String clusterSpecification; 
        private Integer instanceCount; 
        private String instanceId; 
        private String mseSessionId; 

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
            this.mseSessionId = request.mseSessionId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * 网关名称
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterSpecification.
         */
        public Builder clusterSpecification(String clusterSpecification) {
            this.putQueryParameter("ClusterSpecification", clusterSpecification);
            this.clusterSpecification = clusterSpecification;
            return this;
        }

        /**
         * 节点数量
         */
        public Builder instanceCount(Integer instanceCount) {
            this.putQueryParameter("InstanceCount", instanceCount);
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * 节点规格
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MseSessionId.
         */
        public Builder mseSessionId(String mseSessionId) {
            this.putQueryParameter("MseSessionId", mseSessionId);
            this.mseSessionId = mseSessionId;
            return this;
        }

        @Override
        public UpdateClusterSpecRequest build() {
            return new UpdateClusterSpecRequest(this);
        } 

    } 

}
