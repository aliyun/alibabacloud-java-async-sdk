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

    @com.aliyun.core.annotation.NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("ServiceOwnerId")
    private String serviceOwnerId;

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
        this.serviceManaged = builder.serviceManaged;
        this.serviceName = builder.serviceName;
        this.serviceOwnerId = builder.serviceOwnerId;
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

    public Builder toBuilder() {
        return new Builder(this);
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
        private Boolean serviceManaged; 
        private String serviceName; 
        private String serviceOwnerId; 
        private Integer servicePort; 
        private String serviceSpec; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeStreamingDataServiceResponseBody model) {
            this.createTime = model.createTime;
            this.modifyTime = model.modifyTime;
            this.requestId = model.requestId;
            this.serviceDescription = model.serviceDescription;
            this.serviceId = model.serviceId;
            this.serviceIp = model.serviceIp;
            this.serviceManaged = model.serviceManaged;
            this.serviceName = model.serviceName;
            this.serviceOwnerId = model.serviceOwnerId;
            this.servicePort = model.servicePort;
            this.serviceSpec = model.serviceSpec;
            this.status = model.status;
        } 

        /**
         * <p>The time when the service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time when the service was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T17:00:00Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The description of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>test-adbpgss</p>
         */
        public Builder serviceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The IP address of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        public Builder serviceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }

        /**
         * <p>The service is managed by other aliyun product or not.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>test-adbpgss</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The service account uid of the aliyun product</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder serviceOwnerId(String serviceOwnerId) {
            this.serviceOwnerId = serviceOwnerId;
            return this;
        }

        /**
         * <p>The port number of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        public Builder servicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }

        /**
         * <p>The specifications of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder serviceSpec(String serviceSpec) {
            this.serviceSpec = serviceSpec;
            return this;
        }

        /**
         * <p>The status of the service. Valid values:</p>
         * <ul>
         * <li>Init</li>
         * <li>Running</li>
         * <li>Exception</li>
         * <li>Paused</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
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
