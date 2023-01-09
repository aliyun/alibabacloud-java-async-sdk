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
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

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
        this.acceptLanguage = builder.acceptLanguage;
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
        private String acceptLanguage; 
        private String clusterId; 
        private String instanceId; 
        private String podNameList; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(RestartClusterRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterId = request.clusterId;
            this.instanceId = request.instanceId;
            this.podNameList = request.podNameList;
            this.requestPars = request.requestPars;
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The names of pods. You can specify the names of multiple pods at a time. Separate multiple pod names with commas (,). Example: mse-a8aba010-1629719288255-reg-center-0-1,mse-a8aba010-1629719288255-reg-center-0-2.
         * <p>
         * 
         * The specified pods must belong to the current cluster and be associated with the specified instance. Otherwise, a restart exception occurs.
         */
        public Builder podNameList(String podNameList) {
            this.putQueryParameter("PodNameList", podNameList);
            this.podNameList = podNameList;
            return this;
        }

        /**
         * The extended request parameters in the JSON format.
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
