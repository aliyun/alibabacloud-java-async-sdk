// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStreamingDataServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStreamingDataServiceResponseBody</p>
 */
public class DescribeStreamingDataServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceDescription")
    private String serviceDescription;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceIp")
    private String serviceIp;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("ServicePort")
    private Integer servicePort;

    @com.aliyun.core.annotation.NameInMap("ServiceSpec")
    private String serviceSpec;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeStreamingDataServiceResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.modifyTime = builder.modifyTime;
        this.requestId = builder.requestId;
        this.serviceDescription = builder.serviceDescription;
        this.serviceId = builder.serviceId;
        this.serviceIp = builder.serviceIp;
        this.serviceName = builder.serviceName;
        this.servicePort = builder.servicePort;
        this.serviceSpec = builder.serviceSpec;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStreamingDataServiceResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public Integer getServicePort() {
        return this.servicePort;
    }

    /**
     * @return serviceSpec
     */
    public String getServiceSpec() {
        return this.serviceSpec;
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
        private String requestId; 
        private String serviceDescription; 
        private String serviceId; 
        private String serviceIp; 
        private String serviceName; 
        private Integer servicePort; 
        private String serviceSpec; 
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
        public Builder servicePort(Integer servicePort) {
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeStreamingDataServiceResponseBody build() {
            return new DescribeStreamingDataServiceResponseBody(this);
        } 

    } 

}
