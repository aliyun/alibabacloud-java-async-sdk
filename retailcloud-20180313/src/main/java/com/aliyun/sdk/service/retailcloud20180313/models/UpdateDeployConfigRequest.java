// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDeployConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeployConfigRequest</p>
 */
public class UpdateDeployConfigRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("CodePath")
    private String codePath;

    @Query
    @NameInMap("ConfigMap")
    private String configMap;

    @Query
    @NameInMap("ConfigMapList")
    private java.util.List < String > configMapList;

    @Query
    @NameInMap("CronJob")
    private String cronJob;

    @Query
    @NameInMap("Deployment")
    private String deployment;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("SecretList")
    private java.util.List < String > secretList;

    @Query
    @NameInMap("StatefulSet")
    private String statefulSet;

    private UpdateDeployConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.codePath = builder.codePath;
        this.configMap = builder.configMap;
        this.configMapList = builder.configMapList;
        this.cronJob = builder.cronJob;
        this.deployment = builder.deployment;
        this.id = builder.id;
        this.secretList = builder.secretList;
        this.statefulSet = builder.statefulSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeployConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return codePath
     */
    public String getCodePath() {
        return this.codePath;
    }

    /**
     * @return configMap
     */
    public String getConfigMap() {
        return this.configMap;
    }

    /**
     * @return configMapList
     */
    public java.util.List < String > getConfigMapList() {
        return this.configMapList;
    }

    /**
     * @return cronJob
     */
    public String getCronJob() {
        return this.cronJob;
    }

    /**
     * @return deployment
     */
    public String getDeployment() {
        return this.deployment;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return secretList
     */
    public java.util.List < String > getSecretList() {
        return this.secretList;
    }

    /**
     * @return statefulSet
     */
    public String getStatefulSet() {
        return this.statefulSet;
    }

    public static final class Builder extends Request.Builder<UpdateDeployConfigRequest, Builder> {
        private Long appId; 
        private String codePath; 
        private String configMap; 
        private java.util.List < String > configMapList; 
        private String cronJob; 
        private String deployment; 
        private Long id; 
        private java.util.List < String > secretList; 
        private String statefulSet; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeployConfigRequest request) {
            super(request);
            this.appId = request.appId;
            this.codePath = request.codePath;
            this.configMap = request.configMap;
            this.configMapList = request.configMapList;
            this.cronJob = request.cronJob;
            this.deployment = request.deployment;
            this.id = request.id;
            this.secretList = request.secretList;
            this.statefulSet = request.statefulSet;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * CodePath.
         */
        public Builder codePath(String codePath) {
            this.putQueryParameter("CodePath", codePath);
            this.codePath = codePath;
            return this;
        }

        /**
         * ConfigMap.
         */
        public Builder configMap(String configMap) {
            this.putQueryParameter("ConfigMap", configMap);
            this.configMap = configMap;
            return this;
        }

        /**
         * ConfigMapList.
         */
        public Builder configMapList(java.util.List < String > configMapList) {
            this.putQueryParameter("ConfigMapList", configMapList);
            this.configMapList = configMapList;
            return this;
        }

        /**
         * CronJob.
         */
        public Builder cronJob(String cronJob) {
            this.putQueryParameter("CronJob", cronJob);
            this.cronJob = cronJob;
            return this;
        }

        /**
         * Deployment.
         */
        public Builder deployment(String deployment) {
            this.putQueryParameter("Deployment", deployment);
            this.deployment = deployment;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * SecretList.
         */
        public Builder secretList(java.util.List < String > secretList) {
            this.putQueryParameter("SecretList", secretList);
            this.secretList = secretList;
            return this;
        }

        /**
         * StatefulSet.
         */
        public Builder statefulSet(String statefulSet) {
            this.putQueryParameter("StatefulSet", statefulSet);
            this.statefulSet = statefulSet;
            return this;
        }

        @Override
        public UpdateDeployConfigRequest build() {
            return new UpdateDeployConfigRequest(this);
        } 

    } 

}
