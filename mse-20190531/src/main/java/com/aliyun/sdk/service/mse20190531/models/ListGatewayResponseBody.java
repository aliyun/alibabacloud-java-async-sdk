// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayResponseBody</p>
 */
public class ListGatewayResponseBody extends TeaModel {
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

    private ListGatewayResponseBody(Builder builder) {
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

    public static ListGatewayResponseBody create() {
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
         * The return value.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
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

        public ListGatewayResponseBody build() {
            return new ListGatewayResponseBody(this);
        } 

    } 

    public static class InitConfig extends TeaModel {
        @NameInMap("EnableWaf")
        private Boolean enableWaf;

        @NameInMap("SupportWaf")
        private Boolean supportWaf;

        private InitConfig(Builder builder) {
            this.enableWaf = builder.enableWaf;
            this.supportWaf = builder.supportWaf;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitConfig create() {
            return builder().build();
        }

        /**
         * @return enableWaf
         */
        public Boolean getEnableWaf() {
            return this.enableWaf;
        }

        /**
         * @return supportWaf
         */
        public Boolean getSupportWaf() {
            return this.supportWaf;
        }

        public static final class Builder {
            private Boolean enableWaf; 
            private Boolean supportWaf; 

            /**
             * Indicates whether Web Application Firewall (WAF) is enabled.
             */
            public Builder enableWaf(Boolean enableWaf) {
                this.enableWaf = enableWaf;
                return this;
            }

            /**
             * Indicates whether WAF is supported.
             */
            public Builder supportWaf(Boolean supportWaf) {
                this.supportWaf = supportWaf;
                return this;
            }

            public InitConfig build() {
                return new InitConfig(this);
            } 

        } 

    }
    public static class InternetSlb extends TeaModel {
        @NameInMap("GatewaySlbMode")
        private String gatewaySlbMode;

        @NameInMap("GatewaySlbStatus")
        private String gatewaySlbStatus;

        @NameInMap("InternetNetworkFlow")
        private String internetNetworkFlow;

        @NameInMap("SlbId")
        private String slbId;

        @NameInMap("SlbIp")
        private String slbIp;

        @NameInMap("SlbPort")
        private String slbPort;

        @NameInMap("SlbSpec")
        private String slbSpec;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("Type")
        private String type;

        private InternetSlb(Builder builder) {
            this.gatewaySlbMode = builder.gatewaySlbMode;
            this.gatewaySlbStatus = builder.gatewaySlbStatus;
            this.internetNetworkFlow = builder.internetNetworkFlow;
            this.slbId = builder.slbId;
            this.slbIp = builder.slbIp;
            this.slbPort = builder.slbPort;
            this.slbSpec = builder.slbSpec;
            this.statusDesc = builder.statusDesc;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternetSlb create() {
            return builder().build();
        }

        /**
         * @return gatewaySlbMode
         */
        public String getGatewaySlbMode() {
            return this.gatewaySlbMode;
        }

        /**
         * @return gatewaySlbStatus
         */
        public String getGatewaySlbStatus() {
            return this.gatewaySlbStatus;
        }

        /**
         * @return internetNetworkFlow
         */
        public String getInternetNetworkFlow() {
            return this.internetNetworkFlow;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return slbIp
         */
        public String getSlbIp() {
            return this.slbIp;
        }

        /**
         * @return slbPort
         */
        public String getSlbPort() {
            return this.slbPort;
        }

        /**
         * @return slbSpec
         */
        public String getSlbSpec() {
            return this.slbSpec;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String gatewaySlbMode; 
            private String gatewaySlbStatus; 
            private String internetNetworkFlow; 
            private String slbId; 
            private String slbIp; 
            private String slbPort; 
            private String slbSpec; 
            private String statusDesc; 
            private String type; 

            /**
             * The mode of the SLB instance.
             */
            public Builder gatewaySlbMode(String gatewaySlbMode) {
                this.gatewaySlbMode = gatewaySlbMode;
                return this;
            }

            /**
             * The status of the SLB instance.
             */
            public Builder gatewaySlbStatus(String gatewaySlbStatus) {
                this.gatewaySlbStatus = gatewaySlbStatus;
                return this;
            }

            /**
             * The traffic of the gateway.
             */
            public Builder internetNetworkFlow(String internetNetworkFlow) {
                this.internetNetworkFlow = internetNetworkFlow;
                return this;
            }

            /**
             * SLB ID.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * SLB IP.
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * The port number of the SLB instance.
             */
            public Builder slbPort(String slbPort) {
                this.slbPort = slbPort;
                return this;
            }

            /**
             * The specifications of the SLB instance.
             */
            public Builder slbSpec(String slbSpec) {
                this.slbSpec = slbSpec;
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
             * The type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public InternetSlb build() {
                return new InternetSlb(this);
            } 

        } 

    }
    public static class Slb extends TeaModel {
        @NameInMap("GatewaySlbMode")
        private String gatewaySlbMode;

        @NameInMap("GatewaySlbStatus")
        private String gatewaySlbStatus;

        @NameInMap("SlbId")
        private String slbId;

        @NameInMap("SlbIp")
        private String slbIp;

        @NameInMap("SlbPort")
        private String slbPort;

        @NameInMap("SlbSpec")
        private String slbSpec;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("Type")
        private String type;

        private Slb(Builder builder) {
            this.gatewaySlbMode = builder.gatewaySlbMode;
            this.gatewaySlbStatus = builder.gatewaySlbStatus;
            this.slbId = builder.slbId;
            this.slbIp = builder.slbIp;
            this.slbPort = builder.slbPort;
            this.slbSpec = builder.slbSpec;
            this.statusDesc = builder.statusDesc;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Slb create() {
            return builder().build();
        }

        /**
         * @return gatewaySlbMode
         */
        public String getGatewaySlbMode() {
            return this.gatewaySlbMode;
        }

        /**
         * @return gatewaySlbStatus
         */
        public String getGatewaySlbStatus() {
            return this.gatewaySlbStatus;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return slbIp
         */
        public String getSlbIp() {
            return this.slbIp;
        }

        /**
         * @return slbPort
         */
        public String getSlbPort() {
            return this.slbPort;
        }

        /**
         * @return slbSpec
         */
        public String getSlbSpec() {
            return this.slbSpec;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String gatewaySlbMode; 
            private String gatewaySlbStatus; 
            private String slbId; 
            private String slbIp; 
            private String slbPort; 
            private String slbSpec; 
            private String statusDesc; 
            private String type; 

            /**
             * The mode of the SLB instance.
             */
            public Builder gatewaySlbMode(String gatewaySlbMode) {
                this.gatewaySlbMode = gatewaySlbMode;
                return this;
            }

            /**
             * The status of the SLB instance.
             */
            public Builder gatewaySlbStatus(String gatewaySlbStatus) {
                this.gatewaySlbStatus = gatewaySlbStatus;
                return this;
            }

            /**
             * SLB ID.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * SLB IP.
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * The port number of the SLB instance.
             */
            public Builder slbPort(String slbPort) {
                this.slbPort = slbPort;
                return this;
            }

            /**
             * The specifications of the SLB instance.
             */
            public Builder slbSpec(String slbSpec) {
                this.slbSpec = slbSpec;
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
             * The type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Slb build() {
                return new Slb(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AhasOn")
        private Boolean ahasOn;

        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("ArmsOn")
        private Boolean armsOn;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CurrentVersion")
        private String currentVersion;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("GatewayType")
        private String gatewayType;

        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("GatewayVersion")
        private String gatewayVersion;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InitConfig")
        private InitConfig initConfig;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InternetSlb")
        private java.util.List < InternetSlb> internetSlb;

        @NameInMap("LatestVersion")
        private String latestVersion;

        @NameInMap("MseTag")
        private String mseTag;

        @NameInMap("MustUpgrade")
        private Boolean mustUpgrade;

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

        @NameInMap("RollBack")
        private Boolean rollBack;

        @NameInMap("Slb")
        private java.util.List < Slb> slb;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("SupportWasm")
        private Boolean supportWasm;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Upgrade")
        private Boolean upgrade;

        @NameInMap("Vswitch2")
        private String vswitch2;

        private Result(Builder builder) {
            this.ahasOn = builder.ahasOn;
            this.appVersion = builder.appVersion;
            this.armsOn = builder.armsOn;
            this.chargeType = builder.chargeType;
            this.currentVersion = builder.currentVersion;
            this.endDate = builder.endDate;
            this.gatewayType = builder.gatewayType;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gatewayVersion = builder.gatewayVersion;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.initConfig = builder.initConfig;
            this.instanceId = builder.instanceId;
            this.internetSlb = builder.internetSlb;
            this.latestVersion = builder.latestVersion;
            this.mseTag = builder.mseTag;
            this.mustUpgrade = builder.mustUpgrade;
            this.name = builder.name;
            this.primaryUser = builder.primaryUser;
            this.region = builder.region;
            this.replica = builder.replica;
            this.resourceGroupId = builder.resourceGroupId;
            this.rollBack = builder.rollBack;
            this.slb = builder.slb;
            this.spec = builder.spec;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.supportWasm = builder.supportWasm;
            this.tag = builder.tag;
            this.upgrade = builder.upgrade;
            this.vswitch2 = builder.vswitch2;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return ahasOn
         */
        public Boolean getAhasOn() {
            return this.ahasOn;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return armsOn
         */
        public Boolean getArmsOn() {
            return this.armsOn;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return gatewayType
         */
        public String getGatewayType() {
            return this.gatewayType;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gatewayVersion
         */
        public String getGatewayVersion() {
            return this.gatewayVersion;
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
         * @return initConfig
         */
        public InitConfig getInitConfig() {
            return this.initConfig;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return internetSlb
         */
        public java.util.List < InternetSlb> getInternetSlb() {
            return this.internetSlb;
        }

        /**
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
        }

        /**
         * @return mseTag
         */
        public String getMseTag() {
            return this.mseTag;
        }

        /**
         * @return mustUpgrade
         */
        public Boolean getMustUpgrade() {
            return this.mustUpgrade;
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
         * @return rollBack
         */
        public Boolean getRollBack() {
            return this.rollBack;
        }

        /**
         * @return slb
         */
        public java.util.List < Slb> getSlb() {
            return this.slb;
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
         * @return supportWasm
         */
        public Boolean getSupportWasm() {
            return this.supportWasm;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return upgrade
         */
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        /**
         * @return vswitch2
         */
        public String getVswitch2() {
            return this.vswitch2;
        }

        public static final class Builder {
            private Boolean ahasOn; 
            private String appVersion; 
            private Boolean armsOn; 
            private String chargeType; 
            private String currentVersion; 
            private String endDate; 
            private String gatewayType; 
            private String gatewayUniqueId; 
            private String gatewayVersion; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private InitConfig initConfig; 
            private String instanceId; 
            private java.util.List < InternetSlb> internetSlb; 
            private String latestVersion; 
            private String mseTag; 
            private Boolean mustUpgrade; 
            private String name; 
            private String primaryUser; 
            private String region; 
            private Integer replica; 
            private String resourceGroupId; 
            private Boolean rollBack; 
            private java.util.List < Slb> slb; 
            private String spec; 
            private Integer status; 
            private String statusDesc; 
            private Boolean supportWasm; 
            private String tag; 
            private Boolean upgrade; 
            private String vswitch2; 

            /**
             * Indicates whether Application High Availability Service (AHAS) is enabled.
             */
            public Builder ahasOn(Boolean ahasOn) {
                this.ahasOn = ahasOn;
                return this;
            }

            /**
             * The version of the application.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * Indicates whether Application Real-Time Monitoring Service (ARMS) is enabled.
             */
            public Builder armsOn(Boolean armsOn) {
                this.armsOn = armsOn;
                return this;
            }

            /**
             * The billing method.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The current version of the gateway.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * The time when the subscription gateway expires.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * The type of the gateway.
             */
            public Builder gatewayType(String gatewayType) {
                this.gatewayType = gatewayType;
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
             * GatewayVersion.
             */
            public Builder gatewayVersion(String gatewayVersion) {
                this.gatewayVersion = gatewayVersion;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The modification time.
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
             * The configurations.
             */
            public Builder initConfig(InitConfig initConfig) {
                this.initConfig = initConfig;
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
             * The details of the Internet-facing SLB instances.
             */
            public Builder internetSlb(java.util.List < InternetSlb> internetSlb) {
                this.internetSlb = internetSlb;
                return this;
            }

            /**
             * The latest version of the gateway.
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * MseTag.
             */
            public Builder mseTag(String mseTag) {
                this.mseTag = mseTag;
                return this;
            }

            /**
             * Indicates whether the gateway can be forcefully updated.
             */
            public Builder mustUpgrade(Boolean mustUpgrade) {
                this.mustUpgrade = mustUpgrade;
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
             * The information about the user.
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The number of replicas.
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * RollBack.
             */
            public Builder rollBack(Boolean rollBack) {
                this.rollBack = rollBack;
                return this;
            }

            /**
             * The details of the Server Load Balancer (SLB) instances.
             */
            public Builder slb(java.util.List < Slb> slb) {
                this.slb = slb;
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
             * The gateway status.
             * <p>
             * 
             * *   0: The gateway is being created.
             * *   1: The gateway fails to be created.
             * *   2: The gateway is running.
             * *   3: The gateway is changing.
             * *   4: The gateway is scaling down.
             * *   6: The gateway is scaling up.
             * *   8: The gateway is being deleted.
             * *   9: The gateway is suspended and to be released.
             * *   10: The gateway is restarting.
             * *   11: The gateway is being rebuilt.
             * *   12: The gateway is updating.
             * *   13: The gateway fails to be updated.
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
             * Indicates whether WebAssembly (Wasm) is supported.
             */
            public Builder supportWasm(Boolean supportWasm) {
                this.supportWasm = supportWasm;
                return this;
            }

            /**
             * The tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Indicates whether the gateway can be updated.
             */
            public Builder upgrade(Boolean upgrade) {
                this.upgrade = upgrade;
                return this;
            }

            /**
             * The ID of the secondary vSwitch.
             */
            public Builder vswitch2(String vswitch2) {
                this.vswitch2 = vswitch2;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("TotalSize")
        private Long totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Result> result; 
            private Long totalSize; 

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The returned data.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
