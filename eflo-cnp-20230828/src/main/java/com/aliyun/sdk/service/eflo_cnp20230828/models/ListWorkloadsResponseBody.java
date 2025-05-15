// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link ListWorkloadsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkloadsResponseBody</p>
 */
public class ListWorkloadsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListWorkloadsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkloadsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
        private String accessDeniedDetail; 
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListWorkloadsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Access Denied Information</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Data</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>4AC08332-436C-57A3-9FBA-26772B1A9901</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>total</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWorkloadsResponseBody build() {
            return new ListWorkloadsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkloadsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkloadsResponseBody</p>
     */
    public static class ParamSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("ParamDesc")
        private String paramDesc;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamRegex")
        private String paramRegex;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private String paramValue;

        private ParamSettings(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.paramDesc = builder.paramDesc;
            this.paramName = builder.paramName;
            this.paramRegex = builder.paramRegex;
            this.paramType = builder.paramType;
            this.paramValue = builder.paramValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamSettings create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return paramDesc
         */
        public String getParamDesc() {
            return this.paramDesc;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramRegex
         */
        public String getParamRegex() {
            return this.paramRegex;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        /**
         * @return paramValue
         */
        public String getParamValue() {
            return this.paramValue;
        }

        public static final class Builder {
            private String defaultValue; 
            private String paramDesc; 
            private String paramName; 
            private String paramRegex; 
            private String paramType; 
            private String paramValue; 

            private Builder() {
            } 

            private Builder(ParamSettings model) {
                this.defaultValue = model.defaultValue;
                this.paramDesc = model.paramDesc;
                this.paramName = model.paramName;
                this.paramRegex = model.paramRegex;
                this.paramType = model.paramType;
                this.paramValue = model.paramValue;
            } 

            /**
             * <p>Default Parameter Value</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>Parameter Description</p>
             * 
             * <strong>example:</strong>
             * <p>number</p>
             */
            public Builder paramDesc(String paramDesc) {
                this.paramDesc = paramDesc;
                return this;
            }

            /**
             * <p>Parameter Name</p>
             * 
             * <strong>example:</strong>
             * <p>ITERATION</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>Parameter Regular Expression</p>
             * 
             * <strong>example:</strong>
             * <p>[0-9]+</p>
             */
            public Builder paramRegex(String paramRegex) {
                this.paramRegex = paramRegex;
                return this;
            }

            /**
             * <p>Parameter type</p>
             * 
             * <strong>example:</strong>
             * <p>number</p>
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * <p>Parameter Value</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            public ParamSettings build() {
                return new ParamSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkloadsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkloadsResponseBody</p>
     */
    public static class StaticConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrameWork")
        private String frameWork;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("SoftwareStack")
        private String softwareStack;

        private StaticConfig(Builder builder) {
            this.frameWork = builder.frameWork;
            this.os = builder.os;
            this.parameters = builder.parameters;
            this.softwareStack = builder.softwareStack;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StaticConfig create() {
            return builder().build();
        }

        /**
         * @return frameWork
         */
        public String getFrameWork() {
            return this.frameWork;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return softwareStack
         */
        public String getSoftwareStack() {
            return this.softwareStack;
        }

        public static final class Builder {
            private String frameWork; 
            private String os; 
            private String parameters; 
            private String softwareStack; 

            private Builder() {
            } 

            private Builder(StaticConfig model) {
                this.frameWork = model.frameWork;
                this.os = model.os;
                this.parameters = model.parameters;
                this.softwareStack = model.softwareStack;
            } 

            /**
             * <p>Framework</p>
             * 
             * <strong>example:</strong>
             * <p>PyTorch</p>
             */
            public Builder frameWork(String frameWork) {
                this.frameWork = frameWork;
                return this;
            }

            /**
             * <p>Operating System</p>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>Number of Parameters</p>
             * 
             * <strong>example:</strong>
             * <p>7B</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>Software Stack</p>
             * 
             * <strong>example:</strong>
             * <p>python</p>
             */
            public Builder softwareStack(String softwareStack) {
                this.softwareStack = softwareStack;
                return this;
            }

            public StaticConfig build() {
                return new StaticConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkloadsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkloadsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultCpuPerWorker")
        private Integer defaultCpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("DefaultGpuPerWorker")
        private Integer defaultGpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("DefaultMemoryPerWorker")
        private Integer defaultMemoryPerWorker;

        @com.aliyun.core.annotation.NameInMap("DefaultShareMemory")
        private Integer defaultShareMemory;

        @com.aliyun.core.annotation.NameInMap("Family")
        private String family;

        @com.aliyun.core.annotation.NameInMap("JobKind")
        private String jobKind;

        @com.aliyun.core.annotation.NameInMap("ParamSettings")
        private java.util.List<ParamSettings> paramSettings;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("StaticConfig")
        private StaticConfig staticConfig;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private Long versionId;

        @com.aliyun.core.annotation.NameInMap("WorkloadDescription")
        private String workloadDescription;

        @com.aliyun.core.annotation.NameInMap("WorkloadId")
        private Long workloadId;

        @com.aliyun.core.annotation.NameInMap("WorkloadName")
        private String workloadName;

        @com.aliyun.core.annotation.NameInMap("WorkloadType")
        private String workloadType;

        private Data(Builder builder) {
            this.defaultCpuPerWorker = builder.defaultCpuPerWorker;
            this.defaultGpuPerWorker = builder.defaultGpuPerWorker;
            this.defaultMemoryPerWorker = builder.defaultMemoryPerWorker;
            this.defaultShareMemory = builder.defaultShareMemory;
            this.family = builder.family;
            this.jobKind = builder.jobKind;
            this.paramSettings = builder.paramSettings;
            this.scene = builder.scene;
            this.scope = builder.scope;
            this.staticConfig = builder.staticConfig;
            this.versionId = builder.versionId;
            this.workloadDescription = builder.workloadDescription;
            this.workloadId = builder.workloadId;
            this.workloadName = builder.workloadName;
            this.workloadType = builder.workloadType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return defaultCpuPerWorker
         */
        public Integer getDefaultCpuPerWorker() {
            return this.defaultCpuPerWorker;
        }

        /**
         * @return defaultGpuPerWorker
         */
        public Integer getDefaultGpuPerWorker() {
            return this.defaultGpuPerWorker;
        }

        /**
         * @return defaultMemoryPerWorker
         */
        public Integer getDefaultMemoryPerWorker() {
            return this.defaultMemoryPerWorker;
        }

        /**
         * @return defaultShareMemory
         */
        public Integer getDefaultShareMemory() {
            return this.defaultShareMemory;
        }

        /**
         * @return family
         */
        public String getFamily() {
            return this.family;
        }

        /**
         * @return jobKind
         */
        public String getJobKind() {
            return this.jobKind;
        }

        /**
         * @return paramSettings
         */
        public java.util.List<ParamSettings> getParamSettings() {
            return this.paramSettings;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return staticConfig
         */
        public StaticConfig getStaticConfig() {
            return this.staticConfig;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        /**
         * @return workloadDescription
         */
        public String getWorkloadDescription() {
            return this.workloadDescription;
        }

        /**
         * @return workloadId
         */
        public Long getWorkloadId() {
            return this.workloadId;
        }

        /**
         * @return workloadName
         */
        public String getWorkloadName() {
            return this.workloadName;
        }

        /**
         * @return workloadType
         */
        public String getWorkloadType() {
            return this.workloadType;
        }

        public static final class Builder {
            private Integer defaultCpuPerWorker; 
            private Integer defaultGpuPerWorker; 
            private Integer defaultMemoryPerWorker; 
            private Integer defaultShareMemory; 
            private String family; 
            private String jobKind; 
            private java.util.List<ParamSettings> paramSettings; 
            private String scene; 
            private String scope; 
            private StaticConfig staticConfig; 
            private Long versionId; 
            private String workloadDescription; 
            private Long workloadId; 
            private String workloadName; 
            private String workloadType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.defaultCpuPerWorker = model.defaultCpuPerWorker;
                this.defaultGpuPerWorker = model.defaultGpuPerWorker;
                this.defaultMemoryPerWorker = model.defaultMemoryPerWorker;
                this.defaultShareMemory = model.defaultShareMemory;
                this.family = model.family;
                this.jobKind = model.jobKind;
                this.paramSettings = model.paramSettings;
                this.scene = model.scene;
                this.scope = model.scope;
                this.staticConfig = model.staticConfig;
                this.versionId = model.versionId;
                this.workloadDescription = model.workloadDescription;
                this.workloadId = model.workloadId;
                this.workloadName = model.workloadName;
                this.workloadType = model.workloadType;
            } 

            /**
             * <p>Default CPU Allocation</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder defaultCpuPerWorker(Integer defaultCpuPerWorker) {
                this.defaultCpuPerWorker = defaultCpuPerWorker;
                return this;
            }

            /**
             * <p>Default GPU Allocation</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder defaultGpuPerWorker(Integer defaultGpuPerWorker) {
                this.defaultGpuPerWorker = defaultGpuPerWorker;
                return this;
            }

            /**
             * <p>Default Memory (GB) Allocation</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder defaultMemoryPerWorker(Integer defaultMemoryPerWorker) {
                this.defaultMemoryPerWorker = defaultMemoryPerWorker;
                return this;
            }

            /**
             * <p>Default Shared Memory (GB) Allocation</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder defaultShareMemory(Integer defaultShareMemory) {
                this.defaultShareMemory = defaultShareMemory;
                return this;
            }

            /**
             * <p>Workload Cluster, AI, GPU</p>
             * 
             * <strong>example:</strong>
             * <p>AI</p>
             */
            public Builder family(String family) {
                this.family = family;
                return this;
            }

            /**
             * <p>Training Job Type</p>
             * 
             * <strong>example:</strong>
             * <p>PyTorchJob</p>
             */
            public Builder jobKind(String jobKind) {
                this.jobKind = jobKind;
                return this;
            }

            /**
             * <p>Parameter Settings</p>
             */
            public Builder paramSettings(java.util.List<ParamSettings> paramSettings) {
                this.paramSettings = paramSettings;
                return this;
            }

            /**
             * <p>Workload Usage Scenario</p>
             * 
             * <strong>example:</strong>
             * <p>NLP-LLM</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>Scope Identifier for Workload Usage</p>
             * 
             * <strong>example:</strong>
             * <p>common</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>Static Configuration</p>
             */
            public Builder staticConfig(StaticConfig staticConfig) {
                this.staticConfig = staticConfig;
                return this;
            }

            /**
             * <p>Version ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * <p>Workload Description</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workloadDescription(String workloadDescription) {
                this.workloadDescription = workloadDescription;
                return this;
            }

            /**
             * <p>Workload ID</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder workloadId(Long workloadId) {
                this.workloadId = workloadId;
                return this;
            }

            /**
             * <p>Workload Name</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workloadName(String workloadName) {
                this.workloadName = workloadName;
                return this;
            }

            /**
             * <p>Workload Type</p>
             * 
             * <strong>example:</strong>
             * <p>AI</p>
             */
            public Builder workloadType(String workloadType) {
                this.workloadType = workloadType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
