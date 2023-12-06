// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceSnapshotResponseBody</p>
 */
public class GetResourceSnapshotResponseBody extends TeaModel {
    @NameInMap("CPULimit")
    private String CPULimit;

    @NameInMap("CPURequest")
    private String CPURequest;

    @NameInMap("adpInfo")
    private AdpInfo adpInfo;

    @NameInMap("memoryLimit")
    private String memoryLimit;

    @NameInMap("memoryRequest")
    private String memoryRequest;

    @NameInMap("productInfo")
    private ProductInfo productInfo;

    @NameInMap("specParamConfigs")
    private java.util.List < SpecParamConfigs> specParamConfigs;

    @NameInMap("storageRequest")
    private String storageRequest;

    private GetResourceSnapshotResponseBody(Builder builder) {
        this.CPULimit = builder.CPULimit;
        this.CPURequest = builder.CPURequest;
        this.adpInfo = builder.adpInfo;
        this.memoryLimit = builder.memoryLimit;
        this.memoryRequest = builder.memoryRequest;
        this.productInfo = builder.productInfo;
        this.specParamConfigs = builder.specParamConfigs;
        this.storageRequest = builder.storageRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceSnapshotResponseBody create() {
        return builder().build();
    }

    /**
     * @return CPULimit
     */
    public String getCPULimit() {
        return this.CPULimit;
    }

    /**
     * @return CPURequest
     */
    public String getCPURequest() {
        return this.CPURequest;
    }

    /**
     * @return adpInfo
     */
    public AdpInfo getAdpInfo() {
        return this.adpInfo;
    }

    /**
     * @return memoryLimit
     */
    public String getMemoryLimit() {
        return this.memoryLimit;
    }

    /**
     * @return memoryRequest
     */
    public String getMemoryRequest() {
        return this.memoryRequest;
    }

    /**
     * @return productInfo
     */
    public ProductInfo getProductInfo() {
        return this.productInfo;
    }

    /**
     * @return specParamConfigs
     */
    public java.util.List < SpecParamConfigs> getSpecParamConfigs() {
        return this.specParamConfigs;
    }

    /**
     * @return storageRequest
     */
    public String getStorageRequest() {
        return this.storageRequest;
    }

    public static final class Builder {
        private String CPULimit; 
        private String CPURequest; 
        private AdpInfo adpInfo; 
        private String memoryLimit; 
        private String memoryRequest; 
        private ProductInfo productInfo; 
        private java.util.List < SpecParamConfigs> specParamConfigs; 
        private String storageRequest; 

        /**
         * CPULimit.
         */
        public Builder CPULimit(String CPULimit) {
            this.CPULimit = CPULimit;
            return this;
        }

        /**
         * CPURequest.
         */
        public Builder CPURequest(String CPURequest) {
            this.CPURequest = CPURequest;
            return this;
        }

        /**
         * adpInfo.
         */
        public Builder adpInfo(AdpInfo adpInfo) {
            this.adpInfo = adpInfo;
            return this;
        }

        /**
         * memoryLimit.
         */
        public Builder memoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * memoryRequest.
         */
        public Builder memoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }

        /**
         * productInfo.
         */
        public Builder productInfo(ProductInfo productInfo) {
            this.productInfo = productInfo;
            return this;
        }

        /**
         * specParamConfigs.
         */
        public Builder specParamConfigs(java.util.List < SpecParamConfigs> specParamConfigs) {
            this.specParamConfigs = specParamConfigs;
            return this;
        }

        /**
         * storageRequest.
         */
        public Builder storageRequest(String storageRequest) {
            this.storageRequest = storageRequest;
            return this;
        }

        public GetResourceSnapshotResponseBody build() {
            return new GetResourceSnapshotResponseBody(this);
        } 

    } 

    public static class Components extends TeaModel {
        @NameInMap("CPULimit")
        private String CPULimit;

        @NameInMap("CPURequest")
        private String CPURequest;

        @NameInMap("componentName")
        private String componentName;

        @NameInMap("componentReleaseName")
        private String componentReleaseName;

        @NameInMap("componentVersion")
        private String componentVersion;

        @NameInMap("memoryLimit")
        private String memoryLimit;

        @NameInMap("memoryRequest")
        private String memoryRequest;

        @NameInMap("orchestrationValue")
        private String orchestrationValue;

        @NameInMap("status")
        private String status;

        @NameInMap("storageRequest")
        private String storageRequest;

        private Components(Builder builder) {
            this.CPULimit = builder.CPULimit;
            this.CPURequest = builder.CPURequest;
            this.componentName = builder.componentName;
            this.componentReleaseName = builder.componentReleaseName;
            this.componentVersion = builder.componentVersion;
            this.memoryLimit = builder.memoryLimit;
            this.memoryRequest = builder.memoryRequest;
            this.orchestrationValue = builder.orchestrationValue;
            this.status = builder.status;
            this.storageRequest = builder.storageRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return CPULimit
         */
        public String getCPULimit() {
            return this.CPULimit;
        }

        /**
         * @return CPURequest
         */
        public String getCPURequest() {
            return this.CPURequest;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return componentReleaseName
         */
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        /**
         * @return componentVersion
         */
        public String getComponentVersion() {
            return this.componentVersion;
        }

        /**
         * @return memoryLimit
         */
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        /**
         * @return memoryRequest
         */
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        /**
         * @return orchestrationValue
         */
        public String getOrchestrationValue() {
            return this.orchestrationValue;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageRequest
         */
        public String getStorageRequest() {
            return this.storageRequest;
        }

        public static final class Builder {
            private String CPULimit; 
            private String CPURequest; 
            private String componentName; 
            private String componentReleaseName; 
            private String componentVersion; 
            private String memoryLimit; 
            private String memoryRequest; 
            private String orchestrationValue; 
            private String status; 
            private String storageRequest; 

            /**
             * CPULimit.
             */
            public Builder CPULimit(String CPULimit) {
                this.CPULimit = CPULimit;
                return this;
            }

            /**
             * CPURequest.
             */
            public Builder CPURequest(String CPURequest) {
                this.CPURequest = CPURequest;
                return this;
            }

            /**
             * componentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * componentReleaseName.
             */
            public Builder componentReleaseName(String componentReleaseName) {
                this.componentReleaseName = componentReleaseName;
                return this;
            }

            /**
             * componentVersion.
             */
            public Builder componentVersion(String componentVersion) {
                this.componentVersion = componentVersion;
                return this;
            }

            /**
             * memoryLimit.
             */
            public Builder memoryLimit(String memoryLimit) {
                this.memoryLimit = memoryLimit;
                return this;
            }

            /**
             * memoryRequest.
             */
            public Builder memoryRequest(String memoryRequest) {
                this.memoryRequest = memoryRequest;
                return this;
            }

            /**
             * orchestrationValue.
             */
            public Builder orchestrationValue(String orchestrationValue) {
                this.orchestrationValue = orchestrationValue;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * storageRequest.
             */
            public Builder storageRequest(String storageRequest) {
                this.storageRequest = storageRequest;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    public static class AdpInfo extends TeaModel {
        @NameInMap("CPURequest")
        private String CPURequest;

        @NameInMap("componentNum")
        private Integer componentNum;

        @NameInMap("components")
        private java.util.List < Components> components;

        @NameInMap("memoryRequest")
        private String memoryRequest;

        @NameInMap("podNum")
        private Integer podNum;

        @NameInMap("storageRequest")
        private String storageRequest;

        @NameInMap("workloadNum")
        private Integer workloadNum;

        private AdpInfo(Builder builder) {
            this.CPURequest = builder.CPURequest;
            this.componentNum = builder.componentNum;
            this.components = builder.components;
            this.memoryRequest = builder.memoryRequest;
            this.podNum = builder.podNum;
            this.storageRequest = builder.storageRequest;
            this.workloadNum = builder.workloadNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdpInfo create() {
            return builder().build();
        }

        /**
         * @return CPURequest
         */
        public String getCPURequest() {
            return this.CPURequest;
        }

        /**
         * @return componentNum
         */
        public Integer getComponentNum() {
            return this.componentNum;
        }

        /**
         * @return components
         */
        public java.util.List < Components> getComponents() {
            return this.components;
        }

        /**
         * @return memoryRequest
         */
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        /**
         * @return podNum
         */
        public Integer getPodNum() {
            return this.podNum;
        }

        /**
         * @return storageRequest
         */
        public String getStorageRequest() {
            return this.storageRequest;
        }

        /**
         * @return workloadNum
         */
        public Integer getWorkloadNum() {
            return this.workloadNum;
        }

        public static final class Builder {
            private String CPURequest; 
            private Integer componentNum; 
            private java.util.List < Components> components; 
            private String memoryRequest; 
            private Integer podNum; 
            private String storageRequest; 
            private Integer workloadNum; 

            /**
             * CPURequest.
             */
            public Builder CPURequest(String CPURequest) {
                this.CPURequest = CPURequest;
                return this;
            }

            /**
             * componentNum.
             */
            public Builder componentNum(Integer componentNum) {
                this.componentNum = componentNum;
                return this;
            }

            /**
             * components.
             */
            public Builder components(java.util.List < Components> components) {
                this.components = components;
                return this;
            }

            /**
             * memoryRequest.
             */
            public Builder memoryRequest(String memoryRequest) {
                this.memoryRequest = memoryRequest;
                return this;
            }

            /**
             * podNum.
             */
            public Builder podNum(Integer podNum) {
                this.podNum = podNum;
                return this;
            }

            /**
             * storageRequest.
             */
            public Builder storageRequest(String storageRequest) {
                this.storageRequest = storageRequest;
                return this;
            }

            /**
             * workloadNum.
             */
            public Builder workloadNum(Integer workloadNum) {
                this.workloadNum = workloadNum;
                return this;
            }

            public AdpInfo build() {
                return new AdpInfo(this);
            } 

        } 

    }
    public static class ProductInfoComponents extends TeaModel {
        @NameInMap("CPULimit")
        private String CPULimit;

        @NameInMap("CPURequest")
        private String CPURequest;

        @NameInMap("componentName")
        private String componentName;

        @NameInMap("componentReleaseName")
        private String componentReleaseName;

        @NameInMap("componentVersion")
        private String componentVersion;

        @NameInMap("memoryLimit")
        private String memoryLimit;

        @NameInMap("memoryRequest")
        private String memoryRequest;

        @NameInMap("orchestrationValue")
        private String orchestrationValue;

        @NameInMap("status")
        private String status;

        @NameInMap("storageRequest")
        private String storageRequest;

        private ProductInfoComponents(Builder builder) {
            this.CPULimit = builder.CPULimit;
            this.CPURequest = builder.CPURequest;
            this.componentName = builder.componentName;
            this.componentReleaseName = builder.componentReleaseName;
            this.componentVersion = builder.componentVersion;
            this.memoryLimit = builder.memoryLimit;
            this.memoryRequest = builder.memoryRequest;
            this.orchestrationValue = builder.orchestrationValue;
            this.status = builder.status;
            this.storageRequest = builder.storageRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfoComponents create() {
            return builder().build();
        }

        /**
         * @return CPULimit
         */
        public String getCPULimit() {
            return this.CPULimit;
        }

        /**
         * @return CPURequest
         */
        public String getCPURequest() {
            return this.CPURequest;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return componentReleaseName
         */
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        /**
         * @return componentVersion
         */
        public String getComponentVersion() {
            return this.componentVersion;
        }

        /**
         * @return memoryLimit
         */
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        /**
         * @return memoryRequest
         */
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        /**
         * @return orchestrationValue
         */
        public String getOrchestrationValue() {
            return this.orchestrationValue;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageRequest
         */
        public String getStorageRequest() {
            return this.storageRequest;
        }

        public static final class Builder {
            private String CPULimit; 
            private String CPURequest; 
            private String componentName; 
            private String componentReleaseName; 
            private String componentVersion; 
            private String memoryLimit; 
            private String memoryRequest; 
            private String orchestrationValue; 
            private String status; 
            private String storageRequest; 

            /**
             * CPULimit.
             */
            public Builder CPULimit(String CPULimit) {
                this.CPULimit = CPULimit;
                return this;
            }

            /**
             * CPURequest.
             */
            public Builder CPURequest(String CPURequest) {
                this.CPURequest = CPURequest;
                return this;
            }

            /**
             * componentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * componentReleaseName.
             */
            public Builder componentReleaseName(String componentReleaseName) {
                this.componentReleaseName = componentReleaseName;
                return this;
            }

            /**
             * componentVersion.
             */
            public Builder componentVersion(String componentVersion) {
                this.componentVersion = componentVersion;
                return this;
            }

            /**
             * memoryLimit.
             */
            public Builder memoryLimit(String memoryLimit) {
                this.memoryLimit = memoryLimit;
                return this;
            }

            /**
             * memoryRequest.
             */
            public Builder memoryRequest(String memoryRequest) {
                this.memoryRequest = memoryRequest;
                return this;
            }

            /**
             * orchestrationValue.
             */
            public Builder orchestrationValue(String orchestrationValue) {
                this.orchestrationValue = orchestrationValue;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * storageRequest.
             */
            public Builder storageRequest(String storageRequest) {
                this.storageRequest = storageRequest;
                return this;
            }

            public ProductInfoComponents build() {
                return new ProductInfoComponents(this);
            } 

        } 

    }
    public static class ProductInfo extends TeaModel {
        @NameInMap("CPURequest")
        private String CPURequest;

        @NameInMap("componentNum")
        private Integer componentNum;

        @NameInMap("components")
        private java.util.List < ProductInfoComponents> components;

        @NameInMap("memoryRequest")
        private String memoryRequest;

        @NameInMap("podNum")
        private Integer podNum;

        @NameInMap("storageRequest")
        private String storageRequest;

        @NameInMap("workloadNum")
        private Integer workloadNum;

        private ProductInfo(Builder builder) {
            this.CPURequest = builder.CPURequest;
            this.componentNum = builder.componentNum;
            this.components = builder.components;
            this.memoryRequest = builder.memoryRequest;
            this.podNum = builder.podNum;
            this.storageRequest = builder.storageRequest;
            this.workloadNum = builder.workloadNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfo create() {
            return builder().build();
        }

        /**
         * @return CPURequest
         */
        public String getCPURequest() {
            return this.CPURequest;
        }

        /**
         * @return componentNum
         */
        public Integer getComponentNum() {
            return this.componentNum;
        }

        /**
         * @return components
         */
        public java.util.List < ProductInfoComponents> getComponents() {
            return this.components;
        }

        /**
         * @return memoryRequest
         */
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        /**
         * @return podNum
         */
        public Integer getPodNum() {
            return this.podNum;
        }

        /**
         * @return storageRequest
         */
        public String getStorageRequest() {
            return this.storageRequest;
        }

        /**
         * @return workloadNum
         */
        public Integer getWorkloadNum() {
            return this.workloadNum;
        }

        public static final class Builder {
            private String CPURequest; 
            private Integer componentNum; 
            private java.util.List < ProductInfoComponents> components; 
            private String memoryRequest; 
            private Integer podNum; 
            private String storageRequest; 
            private Integer workloadNum; 

            /**
             * CPURequest.
             */
            public Builder CPURequest(String CPURequest) {
                this.CPURequest = CPURequest;
                return this;
            }

            /**
             * componentNum.
             */
            public Builder componentNum(Integer componentNum) {
                this.componentNum = componentNum;
                return this;
            }

            /**
             * components.
             */
            public Builder components(java.util.List < ProductInfoComponents> components) {
                this.components = components;
                return this;
            }

            /**
             * memoryRequest.
             */
            public Builder memoryRequest(String memoryRequest) {
                this.memoryRequest = memoryRequest;
                return this;
            }

            /**
             * podNum.
             */
            public Builder podNum(Integer podNum) {
                this.podNum = podNum;
                return this;
            }

            /**
             * storageRequest.
             */
            public Builder storageRequest(String storageRequest) {
                this.storageRequest = storageRequest;
                return this;
            }

            /**
             * workloadNum.
             */
            public Builder workloadNum(Integer workloadNum) {
                this.workloadNum = workloadNum;
                return this;
            }

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
    public static class SpecParamConfigs extends TeaModel {
        @NameInMap("componentName")
        private String componentName;

        @NameInMap("componentReleaseName")
        private String componentReleaseName;

        @NameInMap("componentSource")
        private String componentSource;

        @NameInMap("componentVersion")
        private String componentVersion;

        @NameInMap("name")
        private String name;

        @NameInMap("paramType")
        private String paramType;

        @NameInMap("parentComponentName")
        private String parentComponentName;

        @NameInMap("parentComponentReleaseName")
        private String parentComponentReleaseName;

        @NameInMap("parentComponentVersion")
        private String parentComponentVersion;

        @NameInMap("value")
        private String value;

        @NameInMap("valueType")
        private String valueType;

        private SpecParamConfigs(Builder builder) {
            this.componentName = builder.componentName;
            this.componentReleaseName = builder.componentReleaseName;
            this.componentSource = builder.componentSource;
            this.componentVersion = builder.componentVersion;
            this.name = builder.name;
            this.paramType = builder.paramType;
            this.parentComponentName = builder.parentComponentName;
            this.parentComponentReleaseName = builder.parentComponentReleaseName;
            this.parentComponentVersion = builder.parentComponentVersion;
            this.value = builder.value;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecParamConfigs create() {
            return builder().build();
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return componentReleaseName
         */
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        /**
         * @return componentSource
         */
        public String getComponentSource() {
            return this.componentSource;
        }

        /**
         * @return componentVersion
         */
        public String getComponentVersion() {
            return this.componentVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        /**
         * @return parentComponentName
         */
        public String getParentComponentName() {
            return this.parentComponentName;
        }

        /**
         * @return parentComponentReleaseName
         */
        public String getParentComponentReleaseName() {
            return this.parentComponentReleaseName;
        }

        /**
         * @return parentComponentVersion
         */
        public String getParentComponentVersion() {
            return this.parentComponentVersion;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String componentName; 
            private String componentReleaseName; 
            private String componentSource; 
            private String componentVersion; 
            private String name; 
            private String paramType; 
            private String parentComponentName; 
            private String parentComponentReleaseName; 
            private String parentComponentVersion; 
            private String value; 
            private String valueType; 

            /**
             * componentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * componentReleaseName.
             */
            public Builder componentReleaseName(String componentReleaseName) {
                this.componentReleaseName = componentReleaseName;
                return this;
            }

            /**
             * componentSource.
             */
            public Builder componentSource(String componentSource) {
                this.componentSource = componentSource;
                return this;
            }

            /**
             * componentVersion.
             */
            public Builder componentVersion(String componentVersion) {
                this.componentVersion = componentVersion;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * paramType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * parentComponentName.
             */
            public Builder parentComponentName(String parentComponentName) {
                this.parentComponentName = parentComponentName;
                return this;
            }

            /**
             * parentComponentReleaseName.
             */
            public Builder parentComponentReleaseName(String parentComponentReleaseName) {
                this.parentComponentReleaseName = parentComponentReleaseName;
                return this;
            }

            /**
             * parentComponentVersion.
             */
            public Builder parentComponentVersion(String parentComponentVersion) {
                this.parentComponentVersion = parentComponentVersion;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * valueType.
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public SpecParamConfigs build() {
                return new SpecParamConfigs(this);
            } 

        } 

    }
}
