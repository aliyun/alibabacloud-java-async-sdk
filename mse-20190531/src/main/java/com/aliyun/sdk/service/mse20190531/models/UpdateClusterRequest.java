// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The alias of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-1</p>
         */
        public Builder clusterAliasName(String clusterAliasName) {
            this.putQueryParameter("ClusterAliasName", clusterAliasName);
            this.clusterAliasName = clusterAliasName;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-78v1l83****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The end time of the O&amp;M window.</p>
         * 
         * <strong>example:</strong>
         * <p>06:00</p>
         */
        public Builder maintenanceEndTime(String maintenanceEndTime) {
            this.putQueryParameter("MaintenanceEndTime", maintenanceEndTime);
            this.maintenanceEndTime = maintenanceEndTime;
            return this;
        }

        /**
         * <p>The start time of the O&amp;M window.</p>
         * 
         * <strong>example:</strong>
         * <p>02:00</p>
         */
        public Builder maintenanceStartTime(String maintenanceStartTime) {
            this.putQueryParameter("MaintenanceStartTime", maintenanceStartTime);
            this.maintenanceStartTime = maintenanceStartTime;
            return this;
        }

        /**
         * <p>The extended request parameters in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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
