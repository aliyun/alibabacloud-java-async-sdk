// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterServiceResponseBody</p>
 */
public class DescribeClusterServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceInfo")
    private ServiceInfo serviceInfo;

    private DescribeClusterServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceInfo = builder.serviceInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceInfo
     */
    public ServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    public static final class Builder {
        private String requestId; 
        private ServiceInfo serviceInfo; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceInfo.
         */
        public Builder serviceInfo(ServiceInfo serviceInfo) {
            this.serviceInfo = serviceInfo;
            return this;
        }

        public DescribeClusterServiceResponseBody build() {
            return new DescribeClusterServiceResponseBody(this);
        } 

    } 

    public static class ClusterServiceSummary extends TeaModel {
        @NameInMap("AlertInfo")
        private String alertInfo;

        @NameInMap("Category")
        private String category;

        @NameInMap("DesiredStoppedValue")
        private Integer desiredStoppedValue;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Key")
        private String key;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private ClusterServiceSummary(Builder builder) {
            this.alertInfo = builder.alertInfo;
            this.category = builder.category;
            this.desiredStoppedValue = builder.desiredStoppedValue;
            this.displayName = builder.displayName;
            this.key = builder.key;
            this.status = builder.status;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterServiceSummary create() {
            return builder().build();
        }

        /**
         * @return alertInfo
         */
        public String getAlertInfo() {
            return this.alertInfo;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return desiredStoppedValue
         */
        public Integer getDesiredStoppedValue() {
            return this.desiredStoppedValue;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String alertInfo; 
            private String category; 
            private Integer desiredStoppedValue; 
            private String displayName; 
            private String key; 
            private String status; 
            private String type; 
            private String value; 

            /**
             * AlertInfo.
             */
            public Builder alertInfo(String alertInfo) {
                this.alertInfo = alertInfo;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DesiredStoppedValue.
             */
            public Builder desiredStoppedValue(Integer desiredStoppedValue) {
                this.desiredStoppedValue = desiredStoppedValue;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ClusterServiceSummary build() {
                return new ClusterServiceSummary(this);
            } 

        } 

    }
    public static class ClusterServiceSummaryList extends TeaModel {
        @NameInMap("ClusterServiceSummary")
        private java.util.List < ClusterServiceSummary> clusterServiceSummary;

        private ClusterServiceSummaryList(Builder builder) {
            this.clusterServiceSummary = builder.clusterServiceSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterServiceSummaryList create() {
            return builder().build();
        }

        /**
         * @return clusterServiceSummary
         */
        public java.util.List < ClusterServiceSummary> getClusterServiceSummary() {
            return this.clusterServiceSummary;
        }

        public static final class Builder {
            private java.util.List < ClusterServiceSummary> clusterServiceSummary; 

            /**
             * ClusterServiceSummary.
             */
            public Builder clusterServiceSummary(java.util.List < ClusterServiceSummary> clusterServiceSummary) {
                this.clusterServiceSummary = clusterServiceSummary;
                return this;
            }

            public ClusterServiceSummaryList build() {
                return new ClusterServiceSummaryList(this);
            } 

        } 

    }
    public static class NeedRestartComponentNameList extends TeaModel {
        @NameInMap("Service")
        private java.util.List < String > service;

        private NeedRestartComponentNameList(Builder builder) {
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NeedRestartComponentNameList create() {
            return builder().build();
        }

        /**
         * @return service
         */
        public java.util.List < String > getService() {
            return this.service;
        }

        public static final class Builder {
            private java.util.List < String > service; 

            /**
             * Service.
             */
            public Builder service(java.util.List < String > service) {
                this.service = service;
                return this;
            }

            public NeedRestartComponentNameList build() {
                return new NeedRestartComponentNameList(this);
            } 

        } 

    }
    public static class NeedRestartHostIdList extends TeaModel {
        @NameInMap("Service")
        private java.util.List < String > service;

        private NeedRestartHostIdList(Builder builder) {
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NeedRestartHostIdList create() {
            return builder().build();
        }

        /**
         * @return service
         */
        public java.util.List < String > getService() {
            return this.service;
        }

        public static final class Builder {
            private java.util.List < String > service; 

            /**
             * Service.
             */
            public Builder service(java.util.List < String > service) {
                this.service = service;
                return this;
            }

            public NeedRestartHostIdList build() {
                return new NeedRestartHostIdList(this);
            } 

        } 

    }
    public static class ServiceAction extends TeaModel {
        @NameInMap("ActionName")
        private String actionName;

        @NameInMap("Command")
        private String command;

        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("ServiceName")
        private String serviceName;

        private ServiceAction(Builder builder) {
            this.actionName = builder.actionName;
            this.command = builder.command;
            this.componentName = builder.componentName;
            this.displayName = builder.displayName;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceAction create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String actionName; 
            private String command; 
            private String componentName; 
            private String displayName; 
            private String serviceName; 

            /**
             * ActionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
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
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ServiceAction build() {
                return new ServiceAction(this);
            } 

        } 

    }
    public static class ServiceActionList extends TeaModel {
        @NameInMap("ServiceAction")
        private java.util.List < ServiceAction> serviceAction;

        private ServiceActionList(Builder builder) {
            this.serviceAction = builder.serviceAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceActionList create() {
            return builder().build();
        }

        /**
         * @return serviceAction
         */
        public java.util.List < ServiceAction> getServiceAction() {
            return this.serviceAction;
        }

        public static final class Builder {
            private java.util.List < ServiceAction> serviceAction; 

            /**
             * ServiceAction.
             */
            public Builder serviceAction(java.util.List < ServiceAction> serviceAction) {
                this.serviceAction = serviceAction;
                return this;
            }

            public ServiceActionList build() {
                return new ServiceActionList(this);
            } 

        } 

    }
    public static class ServiceInfo extends TeaModel {
        @NameInMap("ClusterServiceSummaryList")
        private ClusterServiceSummaryList clusterServiceSummaryList;

        @NameInMap("NeedRestartComponentNameList")
        private NeedRestartComponentNameList needRestartComponentNameList;

        @NameInMap("NeedRestartHostIdList")
        private NeedRestartHostIdList needRestartHostIdList;

        @NameInMap("NeedRestartInfo")
        private String needRestartInfo;

        @NameInMap("NeedRestartNum")
        private Integer needRestartNum;

        @NameInMap("ServiceActionList")
        private ServiceActionList serviceActionList;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServiceStatus")
        private String serviceStatus;

        @NameInMap("ServiceVersion")
        private String serviceVersion;

        private ServiceInfo(Builder builder) {
            this.clusterServiceSummaryList = builder.clusterServiceSummaryList;
            this.needRestartComponentNameList = builder.needRestartComponentNameList;
            this.needRestartHostIdList = builder.needRestartHostIdList;
            this.needRestartInfo = builder.needRestartInfo;
            this.needRestartNum = builder.needRestartNum;
            this.serviceActionList = builder.serviceActionList;
            this.serviceName = builder.serviceName;
            this.serviceStatus = builder.serviceStatus;
            this.serviceVersion = builder.serviceVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInfo create() {
            return builder().build();
        }

        /**
         * @return clusterServiceSummaryList
         */
        public ClusterServiceSummaryList getClusterServiceSummaryList() {
            return this.clusterServiceSummaryList;
        }

        /**
         * @return needRestartComponentNameList
         */
        public NeedRestartComponentNameList getNeedRestartComponentNameList() {
            return this.needRestartComponentNameList;
        }

        /**
         * @return needRestartHostIdList
         */
        public NeedRestartHostIdList getNeedRestartHostIdList() {
            return this.needRestartHostIdList;
        }

        /**
         * @return needRestartInfo
         */
        public String getNeedRestartInfo() {
            return this.needRestartInfo;
        }

        /**
         * @return needRestartNum
         */
        public Integer getNeedRestartNum() {
            return this.needRestartNum;
        }

        /**
         * @return serviceActionList
         */
        public ServiceActionList getServiceActionList() {
            return this.serviceActionList;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return serviceVersion
         */
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public static final class Builder {
            private ClusterServiceSummaryList clusterServiceSummaryList; 
            private NeedRestartComponentNameList needRestartComponentNameList; 
            private NeedRestartHostIdList needRestartHostIdList; 
            private String needRestartInfo; 
            private Integer needRestartNum; 
            private ServiceActionList serviceActionList; 
            private String serviceName; 
            private String serviceStatus; 
            private String serviceVersion; 

            /**
             * ClusterServiceSummaryList.
             */
            public Builder clusterServiceSummaryList(ClusterServiceSummaryList clusterServiceSummaryList) {
                this.clusterServiceSummaryList = clusterServiceSummaryList;
                return this;
            }

            /**
             * NeedRestartComponentNameList.
             */
            public Builder needRestartComponentNameList(NeedRestartComponentNameList needRestartComponentNameList) {
                this.needRestartComponentNameList = needRestartComponentNameList;
                return this;
            }

            /**
             * NeedRestartHostIdList.
             */
            public Builder needRestartHostIdList(NeedRestartHostIdList needRestartHostIdList) {
                this.needRestartHostIdList = needRestartHostIdList;
                return this;
            }

            /**
             * NeedRestartInfo.
             */
            public Builder needRestartInfo(String needRestartInfo) {
                this.needRestartInfo = needRestartInfo;
                return this;
            }

            /**
             * NeedRestartNum.
             */
            public Builder needRestartNum(Integer needRestartNum) {
                this.needRestartNum = needRestartNum;
                return this;
            }

            /**
             * ServiceActionList.
             */
            public Builder serviceActionList(ServiceActionList serviceActionList) {
                this.serviceActionList = serviceActionList;
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
             * ServiceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * ServiceVersion.
             */
            public Builder serviceVersion(String serviceVersion) {
                this.serviceVersion = serviceVersion;
                return this;
            }

            public ServiceInfo build() {
                return new ServiceInfo(this);
            } 

        } 

    }
}
