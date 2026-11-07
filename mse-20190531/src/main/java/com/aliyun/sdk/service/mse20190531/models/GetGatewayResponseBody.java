// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link GetGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayResponseBody</p>
 */
public class GetGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetGatewayResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetGatewayResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The gateway information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message that indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The request is processed successfully</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9C96CDF8-9E6C-5AB6-B83C-8F87A10117E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGatewayResponseBody build() {
            return new GetGatewayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
     */
    public static class TimePolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesiredReplica")
        private Integer desiredReplica;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private TimePolicyList(Builder builder) {
            this.desiredReplica = builder.desiredReplica;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimePolicyList create() {
            return builder().build();
        }

        /**
         * @return desiredReplica
         */
        public Integer getDesiredReplica() {
            return this.desiredReplica;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Integer desiredReplica; 
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(TimePolicyList model) {
                this.desiredReplica = model.desiredReplica;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The expected number of replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder desiredReplica(Integer desiredReplica) {
                this.desiredReplica = desiredReplica;
                return this;
            }

            /**
             * <p>The end time in the HH:mm format (24-hour clock).</p>
             * 
             * <strong>example:</strong>
             * <p>18:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time in the HH:mm format (24-hour clock).</p>
             * 
             * <strong>example:</strong>
             * <p>16:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimePolicyList build() {
                return new TimePolicyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
     */
    public static class ElasticPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticType")
        private String elasticType;

        @com.aliyun.core.annotation.NameInMap("MaxReplica")
        private Integer maxReplica;

        @com.aliyun.core.annotation.NameInMap("TimePolicyList")
        private java.util.List<TimePolicyList> timePolicyList;

        private ElasticPolicy(Builder builder) {
            this.elasticType = builder.elasticType;
            this.maxReplica = builder.maxReplica;
            this.timePolicyList = builder.timePolicyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticPolicy create() {
            return builder().build();
        }

        /**
         * @return elasticType
         */
        public String getElasticType() {
            return this.elasticType;
        }

        /**
         * @return maxReplica
         */
        public Integer getMaxReplica() {
            return this.maxReplica;
        }

        /**
         * @return timePolicyList
         */
        public java.util.List<TimePolicyList> getTimePolicyList() {
            return this.timePolicyList;
        }

        public static final class Builder {
            private String elasticType; 
            private Integer maxReplica; 
            private java.util.List<TimePolicyList> timePolicyList; 

            private Builder() {
            } 

            private Builder(ElasticPolicy model) {
                this.elasticType = model.elasticType;
                this.maxReplica = model.maxReplica;
                this.timePolicyList = model.timePolicyList;
            } 

            /**
             * <p>The auto-scaling type. Valid values:</p>
             * <ul>
             * <li>CronHPA: Time-based scaling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CronHPA</p>
             */
            public Builder elasticType(String elasticType) {
                this.elasticType = elasticType;
                return this;
            }

            /**
             * <p>The maximum number of instances for auto-scaling, which is used for horizontal scaling.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxReplica(Integer maxReplica) {
                this.maxReplica = maxReplica;
                return this;
            }

            /**
             * <p>The time-based scaling policy.</p>
             */
            public Builder timePolicyList(java.util.List<TimePolicyList> timePolicyList) {
                this.timePolicyList = timePolicyList;
                return this;
            }

            public ElasticPolicy build() {
                return new ElasticPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
     */
    public static class LogConfigDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogEnabled")
        private Boolean logEnabled;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        private LogConfigDetails(Builder builder) {
            this.logEnabled = builder.logEnabled;
            this.logStoreName = builder.logStoreName;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfigDetails create() {
            return builder().build();
        }

        /**
         * @return logEnabled
         */
        public Boolean getLogEnabled() {
            return this.logEnabled;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private Boolean logEnabled; 
            private String logStoreName; 
            private String projectName; 

            private Builder() {
            } 

            private Builder(LogConfigDetails model) {
                this.logEnabled = model.logEnabled;
                this.logStoreName = model.logStoreName;
                this.projectName = model.projectName;
            } 

            /**
             * <p>Specifies whether log delivery is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logEnabled(Boolean logEnabled) {
                this.logEnabled = logEnabled;
                return this;
            }

            /**
             * <p>The Logstore name.</p>
             * 
             * <strong>example:</strong>
             * <p>mse_access_log</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-log-c173117256e934a96b7fefdf2ef8a8057</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public LogConfigDetails build() {
                return new LogConfigDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
     */
    public static class XtraceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sample")
        private Integer sample;

        @com.aliyun.core.annotation.NameInMap("TraceOn")
        private Boolean traceOn;

        private XtraceDetails(Builder builder) {
            this.sample = builder.sample;
            this.traceOn = builder.traceOn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static XtraceDetails create() {
            return builder().build();
        }

        /**
         * @return sample
         */
        public Integer getSample() {
            return this.sample;
        }

        /**
         * @return traceOn
         */
        public Boolean getTraceOn() {
            return this.traceOn;
        }

        public static final class Builder {
            private Integer sample; 
            private Boolean traceOn; 

            private Builder() {
            } 

            private Builder(XtraceDetails model) {
                this.sample = model.sample;
                this.traceOn = model.traceOn;
            } 

            /**
             * <p>The XTrace sampling rate.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sample(Integer sample) {
                this.sample = sample;
                return this;
            }

            /**
             * <p>Specifies whether XTrace sampling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder traceOn(Boolean traceOn) {
                this.traceOn = traceOn;
                return this;
            }

            public XtraceDetails build() {
                return new XtraceDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Elastic")
        private Boolean elastic;

        @com.aliyun.core.annotation.NameInMap("ElasticPolicy")
        private ElasticPolicy elasticPolicy;

        @com.aliyun.core.annotation.NameInMap("ElasticReplica")
        private Integer elasticReplica;

        @com.aliyun.core.annotation.NameInMap("ElasticType")
        private String elasticType;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LogConfigDetails")
        private LogConfigDetails logConfigDetails;

        @com.aliyun.core.annotation.NameInMap("MseTag")
        private String mseTag;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PrimaryUser")
        private String primaryUser;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Replica")
        private Integer replica;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private String securityGroup;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("TotalReplica")
        private Integer totalReplica;

        @com.aliyun.core.annotation.NameInMap("Vpc")
        private String vpc;

        @com.aliyun.core.annotation.NameInMap("Vswitch")
        private String vswitch;

        @com.aliyun.core.annotation.NameInMap("Vswitch2")
        private String vswitch2;

        @com.aliyun.core.annotation.NameInMap("XtraceDetails")
        private XtraceDetails xtraceDetails;

        private Data(Builder builder) {
            this.chargeType = builder.chargeType;
            this.elastic = builder.elastic;
            this.elasticPolicy = builder.elasticPolicy;
            this.elasticReplica = builder.elasticReplica;
            this.elasticType = builder.elasticType;
            this.endDate = builder.endDate;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.logConfigDetails = builder.logConfigDetails;
            this.mseTag = builder.mseTag;
            this.name = builder.name;
            this.primaryUser = builder.primaryUser;
            this.region = builder.region;
            this.replica = builder.replica;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroup = builder.securityGroup;
            this.spec = builder.spec;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.totalReplica = builder.totalReplica;
            this.vpc = builder.vpc;
            this.vswitch = builder.vswitch;
            this.vswitch2 = builder.vswitch2;
            this.xtraceDetails = builder.xtraceDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return elastic
         */
        public Boolean getElastic() {
            return this.elastic;
        }

        /**
         * @return elasticPolicy
         */
        public ElasticPolicy getElasticPolicy() {
            return this.elasticPolicy;
        }

        /**
         * @return elasticReplica
         */
        public Integer getElasticReplica() {
            return this.elasticReplica;
        }

        /**
         * @return elasticType
         */
        public String getElasticType() {
            return this.elasticType;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return logConfigDetails
         */
        public LogConfigDetails getLogConfigDetails() {
            return this.logConfigDetails;
        }

        /**
         * @return mseTag
         */
        public String getMseTag() {
            return this.mseTag;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return primaryUser
         */
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityGroup
         */
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return totalReplica
         */
        public Integer getTotalReplica() {
            return this.totalReplica;
        }

        /**
         * @return vpc
         */
        public String getVpc() {
            return this.vpc;
        }

        /**
         * @return vswitch
         */
        public String getVswitch() {
            return this.vswitch;
        }

        /**
         * @return vswitch2
         */
        public String getVswitch2() {
            return this.vswitch2;
        }

        /**
         * @return xtraceDetails
         */
        public XtraceDetails getXtraceDetails() {
            return this.xtraceDetails;
        }

        public static final class Builder {
            private String chargeType; 
            private Boolean elastic; 
            private ElasticPolicy elasticPolicy; 
            private Integer elasticReplica; 
            private String elasticType; 
            private String endDate; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String instanceId; 
            private LogConfigDetails logConfigDetails; 
            private String mseTag; 
            private String name; 
            private String primaryUser; 
            private String region; 
            private Integer replica; 
            private String resourceGroupId; 
            private String securityGroup; 
            private String spec; 
            private Integer status; 
            private String statusDesc; 
            private Integer totalReplica; 
            private String vpc; 
            private String vswitch; 
            private String vswitch2; 
            private XtraceDetails xtraceDetails; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chargeType = model.chargeType;
                this.elastic = model.elastic;
                this.elasticPolicy = model.elasticPolicy;
                this.elasticReplica = model.elasticReplica;
                this.elasticType = model.elasticType;
                this.endDate = model.endDate;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.logConfigDetails = model.logConfigDetails;
                this.mseTag = model.mseTag;
                this.name = model.name;
                this.primaryUser = model.primaryUser;
                this.region = model.region;
                this.replica = model.replica;
                this.resourceGroupId = model.resourceGroupId;
                this.securityGroup = model.securityGroup;
                this.spec = model.spec;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.totalReplica = model.totalReplica;
                this.vpc = model.vpc;
                this.vswitch = model.vswitch;
                this.vswitch2 = model.vswitch2;
                this.xtraceDetails = model.xtraceDetails;
            } 

            /**
             * <p>The billing method. Valid values: subscription and pay-as-you-go.</p>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>Specifies whether auto-scaling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder elastic(Boolean elastic) {
                this.elastic = elastic;
                return this;
            }

            /**
             * <p>The auto-scaling policy.</p>
             */
            public Builder elasticPolicy(ElasticPolicy elasticPolicy) {
                this.elasticPolicy = elasticPolicy;
                return this;
            }

            /**
             * <p>The number of auto-scaling replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder elasticReplica(Integer elasticReplica) {
                this.elasticReplica = elasticReplica;
                return this;
            }

            /**
             * <p>The auto-scaling type. Valid values:</p>
             * <ul>
             * <li>CronHPA: Time-based scaling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CronHPA</p>
             */
            public Builder elasticType(String elasticType) {
                this.elasticType = elasticType;
                return this;
            }

            /**
             * <p>The expiration time of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-01 00:00:00</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-7ea3da97b96543e19f6c597cd4a9****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The time when the gateway was created. The time is in GMT and represents the local time of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07T10:07:57.000+0000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the instance was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07T10:07:57.000+0000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-st21ri2****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The log configuration.</p>
             */
            public Builder logConfigDetails(LogConfigDetails logConfigDetails) {
                this.logConfigDetails = logConfigDetails;
                return this;
            }

            /**
             * <p>The resource tags.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;TagKey&quot;:&quot;TagValue&quot;}</p>
             */
            public Builder mseTag(String mseTag) {
                this.mseTag = mseTag;
                return this;
            }

            /**
             * <p>The gateway name.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the primary user who created the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>1231254</p>
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The number of gateway replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm34x43l*****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp11ufzqn6mmb8dtzz82</p>
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * <p>The gateway specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>MSE_GTW_16_32_200_c</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The result status of the data integration synchronization node. Valid values:</p>
             * <ul>
             * <li>0: Creating.</li>
             * <li>1: Creation failed.</li>
             * <li>2: Running.</li>
             * <li>3: Modifying.</li>
             * <li>4: Scaling in.</li>
             * <li>6: Scaling out.</li>
             * <li>8: delete.</li>
             * <li>10: Restarting.</li>
             * <li>11: Rebuilding.</li>
             * <li>12: Upgrading.</li>
             * <li>13: Upgrade failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status description.</p>
             * 
             * <strong>example:</strong>
             * <p>Restarting</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>The total number of replicas, including auto-scaling replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalReplica(Integer totalReplica) {
                this.totalReplica = totalReplica;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1328cm01m6uel42b5zb</p>
             */
            public Builder vpc(String vpc) {
                this.vpc = vpc;
                return this;
            }

            /**
             * <p>The vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp18zeqxx6mpuq843z4n5</p>
             */
            public Builder vswitch(String vswitch) {
                this.vswitch = vswitch;
                return this;
            }

            /**
             * <p>The secondary vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1j6ivhav15ve7q54kq2</p>
             */
            public Builder vswitch2(String vswitch2) {
                this.vswitch2 = vswitch2;
                return this;
            }

            /**
             * <p>The XTrace details.</p>
             */
            public Builder xtraceDetails(XtraceDetails xtraceDetails) {
                this.xtraceDetails = xtraceDetails;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
