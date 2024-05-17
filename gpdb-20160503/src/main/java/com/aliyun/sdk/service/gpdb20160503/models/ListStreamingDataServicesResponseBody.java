// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStreamingDataServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListStreamingDataServicesResponseBody</p>
 */
public class ListStreamingDataServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceItems")
    private java.util.List < ServiceItems> serviceItems;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListStreamingDataServicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceItems = builder.serviceItems;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStreamingDataServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceItems
     */
    public java.util.List < ServiceItems> getServiceItems() {
        return this.serviceItems;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ServiceItems> serviceItems; 
        private Integer totalRecordCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceItems.
         */
        public Builder serviceItems(java.util.List < ServiceItems> serviceItems) {
            this.serviceItems = serviceItems;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListStreamingDataServicesResponseBody build() {
            return new ListStreamingDataServicesResponseBody(this);
        } 

    } 

    public static class ServiceItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ServiceDescription")
        private String serviceDescription;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceIp")
        private String serviceIp;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private String servicePort;

        @com.aliyun.core.annotation.NameInMap("ServiceSpec")
        private String serviceSpec;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ServiceItems(Builder builder) {
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.serviceDescription = builder.serviceDescription;
            this.serviceId = builder.serviceId;
            this.serviceIp = builder.serviceIp;
            this.serviceName = builder.serviceName;
            this.servicePort = builder.servicePort;
            this.serviceSpec = builder.serviceSpec;
            this.serviceType = builder.serviceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceItems create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return serviceDescription
         */
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceIp
         */
        public String getServiceIp() {
            return this.serviceIp;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return servicePort
         */
        public String getServicePort() {
            return this.servicePort;
        }

        /**
         * @return serviceSpec
         */
        public String getServiceSpec() {
            return this.serviceSpec;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String modifyTime; 
            private String serviceDescription; 
            private String serviceId; 
            private String serviceIp; 
            private String serviceName; 
            private String servicePort; 
            private String serviceSpec; 
            private String serviceType; 
            private String status; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ServiceDescription.
             */
            public Builder serviceDescription(String serviceDescription) {
                this.serviceDescription = serviceDescription;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * ServiceIp.
             */
            public Builder serviceIp(String serviceIp) {
                this.serviceIp = serviceIp;
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
             * ServicePort.
             */
            public Builder servicePort(String servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * ServiceSpec.
             */
            public Builder serviceSpec(String serviceSpec) {
                this.serviceSpec = serviceSpec;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ServiceItems build() {
                return new ServiceItems(this);
            } 

        } 

    }
}
