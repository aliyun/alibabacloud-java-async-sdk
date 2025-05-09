// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListStreamingDataServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListStreamingDataServicesResponseBody</p>
 */
public class ListStreamingDataServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceItems")
    private java.util.List<ServiceItems> serviceItems;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ServiceItems> getServiceItems() {
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
        private java.util.List<ServiceItems> serviceItems; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(ListStreamingDataServicesResponseBody model) {
            this.requestId = model.requestId;
            this.serviceItems = model.serviceItems;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns real-time data service items</p>
         */
        public Builder serviceItems(java.util.List<ServiceItems> serviceItems) {
            this.serviceItems = serviceItems;
            return this;
        }

        /**
         * <p>Total record count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListStreamingDataServicesResponseBody build() {
            return new ListStreamingDataServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStreamingDataServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListStreamingDataServicesResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServiceOwnerId")
        private String serviceOwnerId;

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
            this.serviceManaged = builder.serviceManaged;
            this.serviceName = builder.serviceName;
            this.serviceOwnerId = builder.serviceOwnerId;
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
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceOwnerId
         */
        public String getServiceOwnerId() {
            return this.serviceOwnerId;
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
            private Boolean serviceManaged; 
            private String serviceName; 
            private String serviceOwnerId; 
            private String servicePort; 
            private String serviceSpec; 
            private String serviceType; 
            private String status; 

            private Builder() {
            } 

            private Builder(ServiceItems model) {
                this.createTime = model.createTime;
                this.modifyTime = model.modifyTime;
                this.serviceDescription = model.serviceDescription;
                this.serviceId = model.serviceId;
                this.serviceIp = model.serviceIp;
                this.serviceManaged = model.serviceManaged;
                this.serviceName = model.serviceName;
                this.serviceOwnerId = model.serviceOwnerId;
                this.servicePort = model.servicePort;
                this.serviceSpec = model.serviceSpec;
                this.serviceType = model.serviceType;
                this.status = model.status;
            } 

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-08T16:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Last modified time</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-08T17:00:00Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>Service description.</p>
             * 
             * <strong>example:</strong>
             * <p>test-adbpgss</p>
             */
            public Builder serviceDescription(String serviceDescription) {
                this.serviceDescription = serviceDescription;
                return this;
            }

            /**
             * <p>Service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>Service IP.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1</p>
             */
            public Builder serviceIp(String serviceIp) {
                this.serviceIp = serviceIp;
                return this;
            }

            /**
             * <p>Whether it is a managed service.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-adbpgss</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>Service owner ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder serviceOwnerId(String serviceOwnerId) {
                this.serviceOwnerId = serviceOwnerId;
                return this;
            }

            /**
             * <p>Service port.</p>
             * 
             * <strong>example:</strong>
             * <p>5432</p>
             */
            public Builder servicePort(String servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>Service specification (in CU).</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder serviceSpec(String serviceSpec) {
                this.serviceSpec = serviceSpec;
                return this;
            }

            /**
             * <p>Service type, with the following value:</p>
             * <ul>
             * <li><strong>adbpgss</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>adbpgss</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>Service status, with the following values:</p>
             * <ul>
             * <li><p>Init: Initializing</p>
             * </li>
             * <li><p>Running: In operation</p>
             * </li>
             * <li><p>Exception: Abnormal</p>
             * </li>
             * <li><p>Paused: Suspended</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
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
