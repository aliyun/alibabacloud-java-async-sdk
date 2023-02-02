// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsInstanceBaseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>OnsInstanceBaseInfoResponseBody</p>
 */
public class OnsInstanceBaseInfoResponseBody extends TeaModel {
    @NameInMap("InstanceBaseInfo")
    private InstanceBaseInfo instanceBaseInfo;

    @NameInMap("RequestId")
    private String requestId;

    private OnsInstanceBaseInfoResponseBody(Builder builder) {
        this.instanceBaseInfo = builder.instanceBaseInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsInstanceBaseInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceBaseInfo
     */
    public InstanceBaseInfo getInstanceBaseInfo() {
        return this.instanceBaseInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceBaseInfo instanceBaseInfo; 
        private String requestId; 

        /**
         * The information about the instance.
         */
        public Builder instanceBaseInfo(InstanceBaseInfo instanceBaseInfo) {
            this.instanceBaseInfo = instanceBaseInfo;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsInstanceBaseInfoResponseBody build() {
            return new OnsInstanceBaseInfoResponseBody(this);
        } 

    } 

    public static class Endpoints extends TeaModel {
        @NameInMap("HttpInternalEndpoint")
        private String httpInternalEndpoint;

        @NameInMap("HttpInternetEndpoint")
        private String httpInternetEndpoint;

        @NameInMap("HttpInternetSecureEndpoint")
        private String httpInternetSecureEndpoint;

        @NameInMap("TcpEndpoint")
        private String tcpEndpoint;

        @NameInMap("TcpInternetEndpoint")
        private String tcpInternetEndpoint;

        private Endpoints(Builder builder) {
            this.httpInternalEndpoint = builder.httpInternalEndpoint;
            this.httpInternetEndpoint = builder.httpInternetEndpoint;
            this.httpInternetSecureEndpoint = builder.httpInternetSecureEndpoint;
            this.tcpEndpoint = builder.tcpEndpoint;
            this.tcpInternetEndpoint = builder.tcpInternetEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return httpInternalEndpoint
         */
        public String getHttpInternalEndpoint() {
            return this.httpInternalEndpoint;
        }

        /**
         * @return httpInternetEndpoint
         */
        public String getHttpInternetEndpoint() {
            return this.httpInternetEndpoint;
        }

        /**
         * @return httpInternetSecureEndpoint
         */
        public String getHttpInternetSecureEndpoint() {
            return this.httpInternetSecureEndpoint;
        }

        /**
         * @return tcpEndpoint
         */
        public String getTcpEndpoint() {
            return this.tcpEndpoint;
        }

        /**
         * @return tcpInternetEndpoint
         */
        public String getTcpInternetEndpoint() {
            return this.tcpInternetEndpoint;
        }

        public static final class Builder {
            private String httpInternalEndpoint; 
            private String httpInternetEndpoint; 
            private String httpInternetSecureEndpoint; 
            private String tcpEndpoint; 
            private String tcpInternetEndpoint; 

            /**
             * The private HTTP endpoint of the instance.
             */
            public Builder httpInternalEndpoint(String httpInternalEndpoint) {
                this.httpInternalEndpoint = httpInternalEndpoint;
                return this;
            }

            /**
             * The public HTTP endpoint of the instance.
             */
            public Builder httpInternetEndpoint(String httpInternetEndpoint) {
                this.httpInternetEndpoint = httpInternetEndpoint;
                return this;
            }

            /**
             * The public HTTPS endpoint of the instance.
             */
            public Builder httpInternetSecureEndpoint(String httpInternetSecureEndpoint) {
                this.httpInternetSecureEndpoint = httpInternetSecureEndpoint;
                return this;
            }

            /**
             * The private TCP endpoint of the instance.
             */
            public Builder tcpEndpoint(String tcpEndpoint) {
                this.tcpEndpoint = tcpEndpoint;
                return this;
            }

            /**
             * The public TCP endpoint of the instance.
             * <p>
             * 
             * *   Only instances that are deployed in the China (Chengdu), China (Qingdao), or China (Shenzhen) region can be accessed by using public TCP endpoints.
             * 
             * *   Before you use a public TCP endpoint, make sure that your client SDK meets the following requirements:
             * 
             *     *   TCP client SDK for Java: V2.0.0.Final or later For more information, see [Release notes for the SDK for Java](~~325569~~).
             *     *   TCP client SDK for C++: V3.0.0 or later For more information, see [Release notes for the SDK for C++](~~325570~~).
             * 
             * *   You must pay the data transfer cost when you use a public TCP endpoint. For more information, see [Internet traffic fee](~~325571~~).
             */
            public Builder tcpInternetEndpoint(String tcpInternetEndpoint) {
                this.tcpInternetEndpoint = tcpInternetEndpoint;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    public static class InstanceBaseInfo extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Endpoints")
        private Endpoints endpoints;

        @NameInMap("IndependentNaming")
        private Boolean independentNaming;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceStatus")
        private Integer instanceStatus;

        @NameInMap("InstanceType")
        private Integer instanceType;

        @NameInMap("MaxTps")
        private Long maxTps;

        @NameInMap("ReleaseTime")
        private Long releaseTime;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("TopicCapacity")
        private Integer topicCapacity;

        @NameInMap("spInstanceId")
        private String spInstanceId;

        @NameInMap("spInstanceType")
        private Integer spInstanceType;

        private InstanceBaseInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.endpoints = builder.endpoints;
            this.independentNaming = builder.independentNaming;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.maxTps = builder.maxTps;
            this.releaseTime = builder.releaseTime;
            this.remark = builder.remark;
            this.topicCapacity = builder.topicCapacity;
            this.spInstanceId = builder.spInstanceId;
            this.spInstanceType = builder.spInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceBaseInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endpoints
         */
        public Endpoints getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return independentNaming
         */
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceStatus
         */
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceType
         */
        public Integer getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return maxTps
         */
        public Long getMaxTps() {
            return this.maxTps;
        }

        /**
         * @return releaseTime
         */
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return topicCapacity
         */
        public Integer getTopicCapacity() {
            return this.topicCapacity;
        }

        /**
         * @return spInstanceId
         */
        public String getSpInstanceId() {
            return this.spInstanceId;
        }

        /**
         * @return spInstanceType
         */
        public Integer getSpInstanceType() {
            return this.spInstanceType;
        }

        public static final class Builder {
            private String createTime; 
            private Endpoints endpoints; 
            private Boolean independentNaming; 
            private String instanceId; 
            private String instanceName; 
            private Integer instanceStatus; 
            private Integer instanceType; 
            private Long maxTps; 
            private Long releaseTime; 
            private String remark; 
            private Integer topicCapacity; 
            private String spInstanceId; 
            private Integer spInstanceType; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The endpoints that correspond to different protocols.
             */
            public Builder endpoints(Endpoints endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * Indicates whether the instance uses a namespace. Valid values:
             * <p>
             * 
             * *   **true**: The instance uses a separate namespace. The name of each resource must be unique in the instance. The names of resources in different instances can be the same.
             * *   **false**: The instance does not use a separate namespace. The name of each resource must be globally unique within and across all instances.
             */
            public Builder independentNaming(Boolean independentNaming) {
                this.independentNaming = independentNaming;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the instance.
             * <p>
             * 
             * The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The status of the instance. Valid values:
             * <p>
             * 
             * *   **0**: The instance is being deployed. This value is valid only for Enterprise Platinum Edition instances.
             * *   **2**: The instance has overdue payments. This value is valid only for Standard Edition instances.
             * *   **5**: The instance is running. This value is valid for Standard Edition instances and Enterprise Platinum Edition instances.
             * *   **7**: The instance is being upgraded and is running. This value is valid only for Enterprise Platinum Edition instances.
             */
            public Builder instanceStatus(Integer instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * The instance type. Valid values:
             * <p>
             * 
             * *   **1**: The instance is a Standard Edition instance that uses the pay-as-you-go billing method.
             * *   **2**: The instance is an Enterprise Platinum Edition instance that uses the subscription billing method.
             * 
             * For information about the editions and specifications of Message Queue for Apache RocketMQ instances, see [Instance editions](~~185261~~).
             */
            public Builder instanceType(Integer instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The maximum transactions per second (TPS) for sending and receiving messages. Valid values: 5000, 10000, 20000, 50000, 100000, 200000, 300000, 500000, 800000, and 1000000.
             * <p>
             * 
             * For more information, see the description on the buy page.
             * 
             * >  This parameter is available only for Message Queue for Apache RocketMQ instances of the Enterprise Platinum Edition.
             */
            public Builder maxTps(Long maxTps) {
                this.maxTps = maxTps;
                return this;
            }

            /**
             * The point in time when the Enterprise Platinum Edition instance expires.
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The maximum number of topics that can be created on the instance. Valid values: 25, 50, 100, 300, and 500.
             * <p>
             * 
             * >  This parameter is available only for Message Queue for Apache RocketMQ instances of the Enterprise Platinum Edition.
             */
            public Builder topicCapacity(Integer topicCapacity) {
                this.topicCapacity = topicCapacity;
                return this;
            }

            /**
             * spInstanceId.
             */
            public Builder spInstanceId(String spInstanceId) {
                this.spInstanceId = spInstanceId;
                return this;
            }

            /**
             * spInstanceType.
             */
            public Builder spInstanceType(Integer spInstanceType) {
                this.spInstanceType = spInstanceType;
                return this;
            }

            public InstanceBaseInfo build() {
                return new InstanceBaseInfo(this);
            } 

        } 

    }
}
