// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLocalDiskComponentInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListLocalDiskComponentInfoResponseBody</p>
 */
public class ListLocalDiskComponentInfoResponseBody extends TeaModel {
    @NameInMap("ComponentInfoList")
    private ComponentInfoList componentInfoList;

    @NameInMap("RequestId")
    private String requestId;

    private ListLocalDiskComponentInfoResponseBody(Builder builder) {
        this.componentInfoList = builder.componentInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLocalDiskComponentInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return componentInfoList
     */
    public ComponentInfoList getComponentInfoList() {
        return this.componentInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ComponentInfoList componentInfoList; 
        private String requestId; 

        /**
         * ComponentInfoList.
         */
        public Builder componentInfoList(ComponentInfoList componentInfoList) {
            this.componentInfoList = componentInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLocalDiskComponentInfoResponseBody build() {
            return new ListLocalDiskComponentInfoResponseBody(this);
        } 

    } 

    public static class ApmMetrics extends TeaModel {
        @NameInMap("ApmMetric")
        private java.util.List < String > apmMetric;

        private ApmMetrics(Builder builder) {
            this.apmMetric = builder.apmMetric;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApmMetrics create() {
            return builder().build();
        }

        /**
         * @return apmMetric
         */
        public java.util.List < String > getApmMetric() {
            return this.apmMetric;
        }

        public static final class Builder {
            private java.util.List < String > apmMetric; 

            /**
             * ApmMetric.
             */
            public Builder apmMetric(java.util.List < String > apmMetric) {
                this.apmMetric = apmMetric;
                return this;
            }

            public ApmMetrics build() {
                return new ApmMetrics(this);
            } 

        } 

    }
    public static class Options extends TeaModel {
        @NameInMap("Option")
        private java.util.List < String > option;

        private Options(Builder builder) {
            this.option = builder.option;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return option
         */
        public java.util.List < String > getOption() {
            return this.option;
        }

        public static final class Builder {
            private java.util.List < String > option; 

            /**
             * Option.
             */
            public Builder option(java.util.List < String > option) {
                this.option = option;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    public static class MountParam extends TeaModel {
        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Key")
        private String key;

        @NameInMap("Max")
        private Integer max;

        @NameInMap("Min")
        private Integer min;

        @NameInMap("Name")
        private String name;

        @NameInMap("Options")
        private Options options;

        @NameInMap("Tips")
        private String tips;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("ValueType")
        private String valueType;

        private MountParam(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.key = builder.key;
            this.max = builder.max;
            this.min = builder.min;
            this.name = builder.name;
            this.options = builder.options;
            this.tips = builder.tips;
            this.unit = builder.unit;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountParam create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return options
         */
        public Options getOptions() {
            return this.options;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String defaultValue; 
            private String key; 
            private Integer max; 
            private Integer min; 
            private String name; 
            private Options options; 
            private String tips; 
            private String unit; 
            private String valueType; 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(Options options) {
                this.options = options;
                return this;
            }

            /**
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * ValueType.
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public MountParam build() {
                return new MountParam(this);
            } 

        } 

    }
    public static class MountParams extends TeaModel {
        @NameInMap("MountParam")
        private java.util.List < MountParam> mountParam;

        private MountParams(Builder builder) {
            this.mountParam = builder.mountParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountParams create() {
            return builder().build();
        }

        /**
         * @return mountParam
         */
        public java.util.List < MountParam> getMountParam() {
            return this.mountParam;
        }

        public static final class Builder {
            private java.util.List < MountParam> mountParam; 

            /**
             * MountParam.
             */
            public Builder mountParam(java.util.List < MountParam> mountParam) {
                this.mountParam = mountParam;
                return this;
            }

            public MountParams build() {
                return new MountParams(this);
            } 

        } 

    }
    public static class ComponentInfo extends TeaModel {
        @NameInMap("ApmMetrics")
        private ApmMetrics apmMetrics;

        @NameInMap("ComponentDisplayName")
        private String componentDisplayName;

        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("IsolateWarningMsg")
        private String isolateWarningMsg;

        @NameInMap("MountParams")
        private MountParams mountParams;

        @NameInMap("MountWarningMsg")
        private String mountWarningMsg;

        @NameInMap("RebootWarningMsg")
        private String rebootWarningMsg;

        @NameInMap("ServiceDisplayName")
        private String serviceDisplayName;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("SupportDiskHotSwap")
        private Boolean supportDiskHotSwap;

        private ComponentInfo(Builder builder) {
            this.apmMetrics = builder.apmMetrics;
            this.componentDisplayName = builder.componentDisplayName;
            this.componentName = builder.componentName;
            this.isolateWarningMsg = builder.isolateWarningMsg;
            this.mountParams = builder.mountParams;
            this.mountWarningMsg = builder.mountWarningMsg;
            this.rebootWarningMsg = builder.rebootWarningMsg;
            this.serviceDisplayName = builder.serviceDisplayName;
            this.serviceName = builder.serviceName;
            this.supportDiskHotSwap = builder.supportDiskHotSwap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentInfo create() {
            return builder().build();
        }

        /**
         * @return apmMetrics
         */
        public ApmMetrics getApmMetrics() {
            return this.apmMetrics;
        }

        /**
         * @return componentDisplayName
         */
        public String getComponentDisplayName() {
            return this.componentDisplayName;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return isolateWarningMsg
         */
        public String getIsolateWarningMsg() {
            return this.isolateWarningMsg;
        }

        /**
         * @return mountParams
         */
        public MountParams getMountParams() {
            return this.mountParams;
        }

        /**
         * @return mountWarningMsg
         */
        public String getMountWarningMsg() {
            return this.mountWarningMsg;
        }

        /**
         * @return rebootWarningMsg
         */
        public String getRebootWarningMsg() {
            return this.rebootWarningMsg;
        }

        /**
         * @return serviceDisplayName
         */
        public String getServiceDisplayName() {
            return this.serviceDisplayName;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return supportDiskHotSwap
         */
        public Boolean getSupportDiskHotSwap() {
            return this.supportDiskHotSwap;
        }

        public static final class Builder {
            private ApmMetrics apmMetrics; 
            private String componentDisplayName; 
            private String componentName; 
            private String isolateWarningMsg; 
            private MountParams mountParams; 
            private String mountWarningMsg; 
            private String rebootWarningMsg; 
            private String serviceDisplayName; 
            private String serviceName; 
            private Boolean supportDiskHotSwap; 

            /**
             * ApmMetrics.
             */
            public Builder apmMetrics(ApmMetrics apmMetrics) {
                this.apmMetrics = apmMetrics;
                return this;
            }

            /**
             * ComponentDisplayName.
             */
            public Builder componentDisplayName(String componentDisplayName) {
                this.componentDisplayName = componentDisplayName;
                return this;
            }

            /**
             * ComponentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * IsolateWarningMsg.
             */
            public Builder isolateWarningMsg(String isolateWarningMsg) {
                this.isolateWarningMsg = isolateWarningMsg;
                return this;
            }

            /**
             * MountParams.
             */
            public Builder mountParams(MountParams mountParams) {
                this.mountParams = mountParams;
                return this;
            }

            /**
             * MountWarningMsg.
             */
            public Builder mountWarningMsg(String mountWarningMsg) {
                this.mountWarningMsg = mountWarningMsg;
                return this;
            }

            /**
             * RebootWarningMsg.
             */
            public Builder rebootWarningMsg(String rebootWarningMsg) {
                this.rebootWarningMsg = rebootWarningMsg;
                return this;
            }

            /**
             * ServiceDisplayName.
             */
            public Builder serviceDisplayName(String serviceDisplayName) {
                this.serviceDisplayName = serviceDisplayName;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * SupportDiskHotSwap.
             */
            public Builder supportDiskHotSwap(Boolean supportDiskHotSwap) {
                this.supportDiskHotSwap = supportDiskHotSwap;
                return this;
            }

            public ComponentInfo build() {
                return new ComponentInfo(this);
            } 

        } 

    }
    public static class ComponentInfoList extends TeaModel {
        @NameInMap("ComponentInfo")
        private java.util.List < ComponentInfo> componentInfo;

        private ComponentInfoList(Builder builder) {
            this.componentInfo = builder.componentInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentInfoList create() {
            return builder().build();
        }

        /**
         * @return componentInfo
         */
        public java.util.List < ComponentInfo> getComponentInfo() {
            return this.componentInfo;
        }

        public static final class Builder {
            private java.util.List < ComponentInfo> componentInfo; 

            /**
             * ComponentInfo.
             */
            public Builder componentInfo(java.util.List < ComponentInfo> componentInfo) {
                this.componentInfo = componentInfo;
                return this;
            }

            public ComponentInfoList build() {
                return new ComponentInfoList(this);
            } 

        } 

    }
}
