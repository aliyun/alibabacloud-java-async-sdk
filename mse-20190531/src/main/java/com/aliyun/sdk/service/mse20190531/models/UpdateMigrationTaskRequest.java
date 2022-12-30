// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMigrationTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateMigrationTaskRequest</p>
 */
public class UpdateMigrationTaskRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    @Query
    @NameInMap("Id")
    private String id;

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

    private UpdateMigrationTaskRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterType = builder.clusterType;
        this.id = builder.id;
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

    public static UpdateMigrationTaskRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<UpdateMigrationTaskRequest, Builder> {
        private String acceptLanguage; 
        private String clusterType; 
        private String id; 
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

        private Builder(UpdateMigrationTaskRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterType = request.clusterType;
            this.id = request.id;
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
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * OriginInstanceAddress.
         */
        public Builder originInstanceAddress(String originInstanceAddress) {
            this.putQueryParameter("OriginInstanceAddress", originInstanceAddress);
            this.originInstanceAddress = originInstanceAddress;
            return this;
        }

        /**
         * OriginInstanceName.
         */
        public Builder originInstanceName(String originInstanceName) {
            this.putQueryParameter("OriginInstanceName", originInstanceName);
            this.originInstanceName = originInstanceName;
            return this;
        }

        /**
         * OriginInstanceNamespace.
         */
        public Builder originInstanceNamespace(String originInstanceNamespace) {
            this.putQueryParameter("OriginInstanceNamespace", originInstanceNamespace);
            this.originInstanceNamespace = originInstanceNamespace;
            return this;
        }

        /**
         * ProjectDesc.
         */
        public Builder projectDesc(String projectDesc) {
            this.putQueryParameter("ProjectDesc", projectDesc);
            this.projectDesc = projectDesc;
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

        /**
         * TargetClusterName.
         */
        public Builder targetClusterName(String targetClusterName) {
            this.putQueryParameter("TargetClusterName", targetClusterName);
            this.targetClusterName = targetClusterName;
            return this;
        }

        /**
         * TargetClusterUrl.
         */
        public Builder targetClusterUrl(String targetClusterUrl) {
            this.putQueryParameter("TargetClusterUrl", targetClusterUrl);
            this.targetClusterUrl = targetClusterUrl;
            return this;
        }

        /**
         * TargetInstanceId.
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        @Override
        public UpdateMigrationTaskRequest build() {
            return new UpdateMigrationTaskRequest(this);
        } 

    } 

}
