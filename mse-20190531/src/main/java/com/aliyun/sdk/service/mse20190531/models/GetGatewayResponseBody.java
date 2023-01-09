// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayResponseBody</p>
 */
public class GetGatewayResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * The status code returned. A value of 200 indicates that the request is successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the gateway.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGatewayResponseBody build() {
            return new GetGatewayResponseBody(this);
        } 

    } 

    public static class LogConfigDetails extends TeaModel {
        @NameInMap("LogEnabled")
        private Boolean logEnabled;

        @NameInMap("LogStoreName")
        private String logStoreName;

        @NameInMap("ProjectName")
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

            /**
             * Indicates whether Log Service is activated.
             */
            public Builder logEnabled(Boolean logEnabled) {
                this.logEnabled = logEnabled;
                return this;
            }

            /**
             * The name of the Logstore.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * The name of the project.
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
    public static class XtraceDetails extends TeaModel {
        @NameInMap("Sample")
        private Integer sample;

        @NameInMap("TraceOn")
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

            /**
             * The sampling rate of Tracing Analysis.
             */
            public Builder sample(Integer sample) {
                this.sample = sample;
                return this;
            }

            /**
             * Indicates whether sampling by using Tracing Analysis is enabled.
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
    public static class Data extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LogConfigDetails")
        private LogConfigDetails logConfigDetails;

        @NameInMap("MseTag")
        private String mseTag;

        @NameInMap("Name")
        private String name;

        @NameInMap("PrimaryUser")
        private String primaryUser;

        @NameInMap("Region")
        private String region;

        @NameInMap("Replica")
        private Integer replica;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SecurityGroup")
        private String securityGroup;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("Vpc")
        private String vpc;

        @NameInMap("Vswitch")
        private String vswitch;

        @NameInMap("Vswitch2")
        private String vswitch2;

        @NameInMap("XtraceDetails")
        private XtraceDetails xtraceDetails;

        private Data(Builder builder) {
            this.chargeType = builder.chargeType;
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
            private String vpc; 
            private String vswitch; 
            private String vswitch2; 
            private XtraceDetails xtraceDetails; 

            /**
             * The billing method, such as subscription or pay-as-you-go.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The time when the gateway expires.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * The unique ID of the gateway.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * The time when the gateway was created. The time is displayed in GMT. The time is the local time of the region in which the gateway resides.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the gateway was last modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the gateway.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * The log configuration.
             */
            public Builder logConfigDetails(LogConfigDetails logConfigDetails) {
                this.logConfigDetails = logConfigDetails;
                return this;
            }

            /**
             * The tag of the resource.
             */
            public Builder mseTag(String mseTag) {
                this.mseTag = mseTag;
                return this;
            }

            /**
             * The name of the gateway.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The Alibaba Cloud account ID of the user who created the gateway.
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The number of gateway replicas.
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * The specifications of the gateway.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The status of the gateway. Valid values: 0: The gateway is being created. 1: The gateway fails to be created. 2: The gateway is running. 3: The gateway is changing. 4: The gateway is scaling down. 6: The gateway is scaling up. 8: The gateway is being deleted. 10: The gateway is restarting. 11: The gateway is being rebuilt. 12: The gateway is updating. 13: The gateway fails to be updated.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The description of the status.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpc(String vpc) {
                this.vpc = vpc;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vswitch(String vswitch) {
                this.vswitch = vswitch;
                return this;
            }

            /**
             * The ID of the secondary vSwitch.
             */
            public Builder vswitch2(String vswitch2) {
                this.vswitch2 = vswitch2;
                return this;
            }

            /**
             * The details of Tracing Analysis.
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
