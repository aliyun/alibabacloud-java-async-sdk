// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeployConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeployConfigResponseBody</p>
 */
public class ListDeployConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListDeployConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMsg = builder.errorMsg;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeployConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String errorMsg; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDeployConfigResponseBody build() {
            return new ListDeployConfigResponseBody(this);
        } 

    } 

    public static class ContainerCodePath extends TeaModel {
        @NameInMap("CodePath")
        private String codePath;

        private ContainerCodePath(Builder builder) {
            this.codePath = builder.codePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerCodePath create() {
            return builder().build();
        }

        /**
         * @return codePath
         */
        public String getCodePath() {
            return this.codePath;
        }

        public static final class Builder {
            private String codePath; 

            /**
             * CodePath.
             */
            public Builder codePath(String codePath) {
                this.codePath = codePath;
                return this;
            }

            public ContainerCodePath build() {
                return new ContainerCodePath(this);
            } 

        } 

    }
    public static class ContainerYamlConf extends TeaModel {
        @NameInMap("ConfigMap")
        private String configMap;

        @NameInMap("ConfigMapList")
        private java.util.List < String > configMapList;

        @NameInMap("CronJob")
        private String cronJob;

        @NameInMap("Deployment")
        private String deployment;

        @NameInMap("SecretList")
        private java.util.List < String > secretList;

        @NameInMap("StatefulSet")
        private String statefulSet;

        private ContainerYamlConf(Builder builder) {
            this.configMap = builder.configMap;
            this.configMapList = builder.configMapList;
            this.cronJob = builder.cronJob;
            this.deployment = builder.deployment;
            this.secretList = builder.secretList;
            this.statefulSet = builder.statefulSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerYamlConf create() {
            return builder().build();
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

        public static final class Builder {
            private String configMap; 
            private java.util.List < String > configMapList; 
            private String cronJob; 
            private String deployment; 
            private java.util.List < String > secretList; 
            private String statefulSet; 

            /**
             * ConfigMap.
             */
            public Builder configMap(String configMap) {
                this.configMap = configMap;
                return this;
            }

            /**
             * ConfigMapList.
             */
            public Builder configMapList(java.util.List < String > configMapList) {
                this.configMapList = configMapList;
                return this;
            }

            /**
             * CronJob.
             */
            public Builder cronJob(String cronJob) {
                this.cronJob = cronJob;
                return this;
            }

            /**
             * Deployment.
             */
            public Builder deployment(String deployment) {
                this.deployment = deployment;
                return this;
            }

            /**
             * SecretList.
             */
            public Builder secretList(java.util.List < String > secretList) {
                this.secretList = secretList;
                return this;
            }

            /**
             * StatefulSet.
             */
            public Builder statefulSet(String statefulSet) {
                this.statefulSet = statefulSet;
                return this;
            }

            public ContainerYamlConf build() {
                return new ContainerYamlConf(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("ContainerCodePath")
        private ContainerCodePath containerCodePath;

        @NameInMap("ContainerYamlConf")
        private ContainerYamlConf containerYamlConf;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.containerCodePath = builder.containerCodePath;
            this.containerYamlConf = builder.containerYamlConf;
            this.envType = builder.envType;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return containerCodePath
         */
        public ContainerCodePath getContainerCodePath() {
            return this.containerCodePath;
        }

        /**
         * @return containerYamlConf
         */
        public ContainerYamlConf getContainerYamlConf() {
            return this.containerYamlConf;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long appId; 
            private ContainerCodePath containerCodePath; 
            private ContainerYamlConf containerYamlConf; 
            private String envType; 
            private Long id; 
            private String name; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ContainerCodePath.
             */
            public Builder containerCodePath(ContainerCodePath containerCodePath) {
                this.containerCodePath = containerCodePath;
                return this;
            }

            /**
             * ContainerYamlConf.
             */
            public Builder containerYamlConf(ContainerYamlConf containerYamlConf) {
                this.containerYamlConf = containerYamlConf;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
