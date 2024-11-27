// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsInstanceBaseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>OnsInstanceBaseInfoResponseBody</p>
 */
public class OnsInstanceBaseInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceBaseInfo")
    private InstanceBaseInfo instanceBaseInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the instance.</p>
         */
        public Builder instanceBaseInfo(InstanceBaseInfo instanceBaseInfo) {
            this.instanceBaseInfo = instanceBaseInfo;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6CC46974-65E8-4C20-AB07-D20D102E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsInstanceBaseInfoResponseBody build() {
            return new OnsInstanceBaseInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsInstanceBaseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>OnsInstanceBaseInfoResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HttpInternalEndpoint")
        private String httpInternalEndpoint;

        @com.aliyun.core.annotation.NameInMap("HttpInternetEndpoint")
        private String httpInternetEndpoint;

        @com.aliyun.core.annotation.NameInMap("HttpInternetSecureEndpoint")
        private String httpInternetSecureEndpoint;

        @com.aliyun.core.annotation.NameInMap("TcpEndpoint")
        private String tcpEndpoint;

        @com.aliyun.core.annotation.NameInMap("TcpInternetEndpoint")
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
             * <p>The private HTTP endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://138015630679****.mqrest.cn-chengdu-internal.aliyuncs.com">http://138015630679****.mqrest.cn-chengdu-internal.aliyuncs.com</a></p>
             */
            public Builder httpInternalEndpoint(String httpInternalEndpoint) {
                this.httpInternalEndpoint = httpInternalEndpoint;
                return this;
            }

            /**
             * <p>The public HTTP endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://138015630679****.mqrest.cn-chengdu.aliyuncs.com">http://138015630679****.mqrest.cn-chengdu.aliyuncs.com</a></p>
             */
            public Builder httpInternetEndpoint(String httpInternetEndpoint) {
                this.httpInternetEndpoint = httpInternetEndpoint;
                return this;
            }

            /**
             * <p>The public HTTPS endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://138015630679****.mqrest.cn-chengdu.aliyuncs.com">https://138015630679****.mqrest.cn-chengdu.aliyuncs.com</a></p>
             */
            public Builder httpInternetSecureEndpoint(String httpInternetSecureEndpoint) {
                this.httpInternetSecureEndpoint = httpInternetSecureEndpoint;
                return this;
            }

            /**
             * <p>The private TCP endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://MQ_INST_138015630679****_BAAy1Hac.cn-chengdu.mq-internal.aliyuncs.com:8080">http://MQ_INST_138015630679****_BAAy1Hac.cn-chengdu.mq-internal.aliyuncs.com:8080</a></p>
             */
            public Builder tcpEndpoint(String tcpEndpoint) {
                this.tcpEndpoint = tcpEndpoint;
                return this;
            }

            /**
             * <p>The public TCP endpoint of the instance.</p>
             * <ul>
             * <li><p>Only instances that are deployed in the China (Chengdu), China (Qingdao), or China (Shenzhen) region can be accessed by using public TCP endpoints.</p>
             * </li>
             * <li><p>Before you use a public TCP endpoint, make sure that your client SDK meets the following requirements:</p>
             * <ul>
             * <li>TCP client SDK for Java: V2.0.0.Final or later For more information, see <a href="https://help.aliyun.com/document_detail/325569.html">Release notes for the SDK for Java</a>.</li>
             * <li>TCP client SDK for C++: V3.0.0 or later For more information, see <a href="https://help.aliyun.com/document_detail/325570.html">Release notes for the SDK for C++</a>.</li>
             * </ul>
             * </li>
             * <li><p>You are charged for Internet traffic when you use a public TCP endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/325571.html">Internet traffic fee</a>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="http://MQ_INST_138015630679****_BAAy1Hac.mq.cn-chengdu.aliyuncs.com:80">http://MQ_INST_138015630679****_BAAy1Hac.mq.cn-chengdu.aliyuncs.com:80</a></p>
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
    /**
     * 
     * {@link OnsInstanceBaseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>OnsInstanceBaseInfoResponseBody</p>
     */
    public static class InstanceBaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private Endpoints endpoints;

        @com.aliyun.core.annotation.NameInMap("IndependentNaming")
        private Boolean independentNaming;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private Integer instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private Integer instanceType;

        @com.aliyun.core.annotation.NameInMap("MaxTps")
        private Long maxTps;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private Long releaseTime;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("TopicCapacity")
        private Integer topicCapacity;

        @com.aliyun.core.annotation.NameInMap("spInstanceId")
        private String spInstanceId;

        @com.aliyun.core.annotation.NameInMap("spInstanceType")
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
             * <p>The time when the instance was created. The value of this parameter is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1570701259403</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The endpoints used to access ApsaraMQ for RocketMQ over different protocols.</p>
             */
            public Builder endpoints(Endpoints endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>Indicates whether the instance uses a namespace. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The instance uses a separate namespace. The name of each resource must be unique in the instance. The names of resources in different instances can be the same.</li>
             * <li><strong>false</strong>: The instance does not use a separate namespace. The name of each resource must be globally unique within the instance and across all instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder independentNaming(Boolean independentNaming) {
                this.independentNaming = independentNaming;
                return this;
            }

            /**
             * <p>The ID of the instance</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_138015630679****_BAAy1Hac</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * <p>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The instance is being deployed. This value is valid only for Enterprise Platinum Edition instances.</li>
             * <li><strong>2</strong>: The instance has overdue payments. This value is valid only for Standard Edition instances.</li>
             * <li><strong>5</strong>: The instance is running. This value is valid for Standard Edition instances and Enterprise Platinum Edition instances.</li>
             * <li><strong>7</strong>: The instance is being upgraded and is running. This value is valid only for Enterprise Platinum Edition instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder instanceStatus(Integer instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Standard Edition instances that use the pay-as-you-go billing method.</li>
             * <li><strong>2</strong>: Enterprise Platinum Edition instances that use the subscription billing method.</li>
             * </ul>
             * <p>For information about the editions and specifications of ApsaraMQ for RocketMQ instances, see <a href="https://help.aliyun.com/document_detail/185261.html">Instance editions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder instanceType(Integer instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The maximum messaging transactions per second (TPS). Valid values: 5000, 10000, 20000, 50000, 100000, 200000, 300000, 500000, 800000, and 1000000.</p>
             * <p>You can view the details about messaging TPS on the buy page of ApsaraMQ for RocketMQ.</p>
             * <blockquote>
             * <p>This parameter is available only to the ApsaraMQ for RocketMQ Enterprise Platinum Edition instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder maxTps(Long maxTps) {
                this.maxTps = maxTps;
                return this;
            }

            /**
             * <p>The time when the Enterprise Platinum Edition instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1603555200000</p>
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ons-cn-m7r1r5f****</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The maximum number of topics that can be created on the instance. Valid values: 25, 50, 100, 300, and 500.</p>
             * <blockquote>
             * <p>This parameter is available only to the ApsaraMQ for RocketMQ Enterprise Platinum Edition instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder topicCapacity(Integer topicCapacity) {
                this.topicCapacity = topicCapacity;
                return this;
            }

            /**
             * <p>The commodity ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ons-cn-m7r1r5f****</p>
             */
            public Builder spInstanceId(String spInstanceId) {
                this.spInstanceId = spInstanceId;
                return this;
            }

            /**
             * <p>The commodity type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
