// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMigrationTaskRequest} extends {@link RequestModel}
 *
 * <p>AddMigrationTaskRequest</p>
 */
public class AddMigrationTaskRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    @Query
    @NameInMap("OriginInstanceAddress")
    private String originInstanceAddress;

    @Query
    @NameInMap("OriginInstanceName")
    private String originInstanceName;

    @Query
    @NameInMap("OriginInstanceNamespace")
    private String originInstanceNamespace;

    @Query
    @NameInMap("ProjectDesc")
    private String projectDesc;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    @Query
    @NameInMap("TargetClusterName")
    private String targetClusterName;

    @Query
    @NameInMap("TargetClusterUrl")
    private String targetClusterUrl;

    @Query
    @NameInMap("TargetInstanceId")
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
            this.targetClusterName = request.targetClusterName;
            this.targetClusterUrl = request.targetClusterUrl;
            this.targetInstanceId = request.targetInstanceId;
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
         * The type of the instance. Valid values:
         * <p>
         * 
         * *   Nacos-Ans
         * *   ZooKeeper
         * *   Eureka
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The endpoint of the source instance node.
         */
        public Builder originInstanceAddress(String originInstanceAddress) {
            this.putQueryParameter("OriginInstanceAddress", originInstanceAddress);
            this.originInstanceAddress = originInstanceAddress;
            return this;
        }

        /**
         * The name of the source instance.
         */
        public Builder originInstanceName(String originInstanceName) {
            this.putQueryParameter("OriginInstanceName", originInstanceName);
            this.originInstanceName = originInstanceName;
            return this;
        }

        /**
         * The list of namespaces. This parameter is optional if you want to migrate applications from a Nacos instance.
         */
        public Builder originInstanceNamespace(String originInstanceNamespace) {
            this.putQueryParameter("OriginInstanceNamespace", originInstanceNamespace);
            this.originInstanceNamespace = originInstanceNamespace;
            return this;
        }

        /**
         * The description.
         */
        public Builder projectDesc(String projectDesc) {
            this.putQueryParameter("ProjectDesc", projectDesc);
            this.projectDesc = projectDesc;
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

        /**
         * The name of the destination instance.
         */
        public Builder targetClusterName(String targetClusterName) {
            this.putQueryParameter("TargetClusterName", targetClusterName);
            this.targetClusterName = targetClusterName;
            return this;
        }

        /**
         * The URL of the destination instance.
         */
        public Builder targetClusterUrl(String targetClusterUrl) {
            this.putQueryParameter("TargetClusterUrl", targetClusterUrl);
            this.targetClusterUrl = targetClusterUrl;
            return this;
        }

        /**
         * The ID of the destination instance.
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
