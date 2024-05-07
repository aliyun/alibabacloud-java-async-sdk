// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateClusterRequest} extends {@link RequestModel}
 *
 * <p>UpdateClusterRequest</p>
 */
public class UpdateClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterAliasName")
    private String clusterAliasName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintenanceEndTime")
    private String maintenanceEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintenanceStartTime")
    private String maintenanceStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    private UpdateClusterRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterAliasName = builder.clusterAliasName;
        this.instanceId = builder.instanceId;
        this.maintenanceEndTime = builder.maintenanceEndTime;
        this.maintenanceStartTime = builder.maintenanceStartTime;
        this.requestPars = builder.requestPars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClusterRequest create() {
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
     * @return clusterAliasName
     */
    public String getClusterAliasName() {
        return this.clusterAliasName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maintenanceEndTime
     */
    public String getMaintenanceEndTime() {
        return this.maintenanceEndTime;
    }

    /**
     * @return maintenanceStartTime
     */
    public String getMaintenanceStartTime() {
        return this.maintenanceStartTime;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    public static final class Builder extends Request.Builder<UpdateClusterRequest, Builder> {
        private String acceptLanguage; 
        private String clusterAliasName; 
        private String instanceId; 
        private String maintenanceEndTime; 
        private String maintenanceStartTime; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClusterRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterAliasName = request.clusterAliasName;
            this.instanceId = request.instanceId;
            this.maintenanceEndTime = request.maintenanceEndTime;
            this.maintenanceStartTime = request.maintenanceStartTime;
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
         * The alias of the instance.
         */
        public Builder clusterAliasName(String clusterAliasName) {
            this.putQueryParameter("ClusterAliasName", clusterAliasName);
            this.clusterAliasName = clusterAliasName;
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
         * The end time of the O\&M window.
         */
        public Builder maintenanceEndTime(String maintenanceEndTime) {
            this.putQueryParameter("MaintenanceEndTime", maintenanceEndTime);
            this.maintenanceEndTime = maintenanceEndTime;
            return this;
        }

        /**
         * The start time of the O\&M window.
         */
        public Builder maintenanceStartTime(String maintenanceStartTime) {
            this.putQueryParameter("MaintenanceStartTime", maintenanceStartTime);
            this.maintenanceStartTime = maintenanceStartTime;
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
        public UpdateClusterRequest build() {
            return new UpdateClusterRequest(this);
        } 

    } 

}
