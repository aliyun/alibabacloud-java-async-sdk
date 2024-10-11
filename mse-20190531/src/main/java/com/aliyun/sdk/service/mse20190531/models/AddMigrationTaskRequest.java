// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddMigrationTaskRequest} extends {@link RequestModel}
 *
 * <p>AddMigrationTaskRequest</p>
 */
public class AddMigrationTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginInstanceAddress")
    private String originInstanceAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginInstanceName")
    private String originInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginInstanceNamespace")
    private String originInstanceNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectDesc")
    private String projectDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncType")
    private String syncType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetClusterName")
    private String targetClusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetClusterUrl")
    private String targetClusterUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
    private String targetInstanceId;

    private AddMigrationTaskRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterType = builder.clusterType;
        this.originInstanceAddress = builder.originInstanceAddress;
        this.originInstanceName = builder.originInstanceName;
        this.originInstanceNamespace = builder.originInstanceNamespace;
        this.projectDesc = builder.projectDesc;
        this.requestPars = builder.requestPars;
        this.syncType = builder.syncType;
        this.targetClusterName = builder.targetClusterName;
        this.targetClusterUrl = builder.targetClusterUrl;
        this.targetInstanceId = builder.targetInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMigrationTaskRequest create() {
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
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return originInstanceAddress
     */
    public String getOriginInstanceAddress() {
        return this.originInstanceAddress;
    }

    /**
     * @return originInstanceName
     */
    public String getOriginInstanceName() {
        return this.originInstanceName;
    }

    /**
     * @return originInstanceNamespace
     */
    public String getOriginInstanceNamespace() {
        return this.originInstanceNamespace;
    }

    /**
     * @return projectDesc
     */
    public String getProjectDesc() {
        return this.projectDesc;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    /**
     * @return syncType
     */
    public String getSyncType() {
        return this.syncType;
    }

    /**
     * @return targetClusterName
     */
    public String getTargetClusterName() {
        return this.targetClusterName;
    }

    /**
     * @return targetClusterUrl
     */
    public String getTargetClusterUrl() {
        return this.targetClusterUrl;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public static final class Builder extends Request.Builder<AddMigrationTaskRequest, Builder> {
        private String acceptLanguage; 
        private String clusterType; 
        private String originInstanceAddress; 
        private String originInstanceName; 
        private String originInstanceNamespace; 
        private String projectDesc; 
        private String requestPars; 
        private String syncType; 
        private String targetClusterName; 
        private String targetClusterUrl; 
        private String targetInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(AddMigrationTaskRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterType = request.clusterType;
            this.originInstanceAddress = request.originInstanceAddress;
            this.originInstanceName = request.originInstanceName;
            this.originInstanceNamespace = request.originInstanceNamespace;
            this.projectDesc = request.projectDesc;
            this.requestPars = request.requestPars;
            this.syncType = request.syncType;
            this.targetClusterName = request.targetClusterName;
            this.targetClusterUrl = request.targetClusterUrl;
            this.targetInstanceId = request.targetInstanceId;
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
         * <p>The type of the instance. Valid values:</p>
         * <ul>
         * <li>Nacos-Ans</li>
         * <li>ZooKeeper</li>
         * <li>Eureka</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Nacos-Ans</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The endpoint of the source instance node.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1:8848</p>
         */
        public Builder originInstanceAddress(String originInstanceAddress) {
            this.putQueryParameter("OriginInstanceAddress", originInstanceAddress);
            this.originInstanceAddress = originInstanceAddress;
            return this;
        }

        /**
         * <p>The name of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Source instance</p>
         */
        public Builder originInstanceName(String originInstanceName) {
            this.putQueryParameter("OriginInstanceName", originInstanceName);
            this.originInstanceName = originInstanceName;
            return this;
        }

        /**
         * <p>The list of namespaces. This parameter is optional if you want to migrate applications from a Nacos instance.</p>
         * 
         * <strong>example:</strong>
         * <p>namesapceId1,namesapceId2</p>
         */
        public Builder originInstanceNamespace(String originInstanceNamespace) {
            this.putQueryParameter("OriginInstanceNamespace", originInstanceNamespace);
            this.originInstanceNamespace = originInstanceNamespace;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description.</p>
         */
        public Builder projectDesc(String projectDesc) {
            this.putQueryParameter("ProjectDesc", projectDesc);
            this.projectDesc = projectDesc;
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

        /**
         * SyncType.
         */
        public Builder syncType(String syncType) {
            this.putQueryParameter("SyncType", syncType);
            this.syncType = syncType;
            return this;
        }

        /**
         * <p>The name of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Destination instance</p>
         */
        public Builder targetClusterName(String targetClusterName) {
            this.putQueryParameter("TargetClusterName", targetClusterName);
            this.targetClusterName = targetClusterName;
            return this;
        }

        /**
         * <p>The URL of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-66*****-nacos-ans.mse.aliyuncs.com:8848</p>
         */
        public Builder targetClusterUrl(String targetClusterUrl) {
            this.putQueryParameter("TargetClusterUrl", targetClusterUrl);
            this.targetClusterUrl = targetClusterUrl;
            return this;
        }

        /**
         * <p>The ID of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-ud82*****</p>
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        @Override
        public AddMigrationTaskRequest build() {
            return new AddMigrationTaskRequest(this);
        } 

    } 

}
