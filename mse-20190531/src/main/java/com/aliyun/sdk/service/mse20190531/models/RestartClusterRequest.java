// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartClusterRequest} extends {@link RequestModel}
 *
 * <p>RestartClusterRequest</p>
 */
public class RestartClusterRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PodNameList")
    private String podNameList;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    private RestartClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instanceId = builder.instanceId;
        this.podNameList = builder.podNameList;
        this.requestPars = builder.requestPars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartClusterRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return podNameList
     */
    public String getPodNameList() {
        return this.podNameList;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    public static final class Builder extends Request.Builder<RestartClusterRequest, Builder> {
        private String clusterId; 
        private String instanceId; 
        private String podNameList; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(RestartClusterRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.instanceId = response.instanceId;
            this.podNameList = response.podNameList;
            this.requestPars = response.requestPars;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PodNameList.
         */
        public Builder podNameList(String podNameList) {
            this.putQueryParameter("PodNameList", podNameList);
            this.podNameList = podNameList;
            return this;
        }

        /**
         * RequestPars.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        @Override
        public RestartClusterRequest build() {
            return new RestartClusterRequest(this);
        } 

    } 

}
