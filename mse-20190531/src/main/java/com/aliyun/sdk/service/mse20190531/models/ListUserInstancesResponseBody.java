// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserInstancesResponseBody</p>
 */
public class ListUserInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListUserInstancesResponseBody(Builder builder) {
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

    public static ListUserInstancesResponseBody create() {
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListUserInstancesResponseBody build() {
            return new ListUserInstancesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppClusterId")
        private String appClusterId;

        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("DbPassword")
        private String dbPassword;

        @NameInMap("DbUrl")
        private String dbUrl;

        @NameInMap("DbUserName")
        private String dbUserName;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("EnvironmentId")
        private Long environmentId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ImageVersion")
        private String imageVersion;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IsCreatedRedis")
        private Boolean isCreatedRedis;

        @NameInMap("K8sResourceId")
        private Long k8sResourceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("NameServer")
        private String nameServer;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("PodCidr")
        private String podCidr;

        @NameInMap("PrimaryUser")
        private String primaryUser;

        @NameInMap("Region")
        private String region;

        @NameInMap("Replica")
        private Long replica;

        @NameInMap("SeataServerUniqueId")
        private String seataServerUniqueId;

        @NameInMap("SecurityGroup")
        private String securityGroup;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("Status")
        private Long status;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("StoreMode")
        private String storeMode;

        @NameInMap("Vpc")
        private String vpc;

        @NameInMap("Vswitch")
        private String vswitch;

        @NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.appClusterId = builder.appClusterId;
            this.appVersion = builder.appVersion;
            this.dbPassword = builder.dbPassword;
            this.dbUrl = builder.dbUrl;
            this.dbUserName = builder.dbUserName;
            this.endDate = builder.endDate;
            this.environmentId = builder.environmentId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.imageVersion = builder.imageVersion;
            this.instanceId = builder.instanceId;
            this.isCreatedRedis = builder.isCreatedRedis;
            this.k8sResourceId = builder.k8sResourceId;
            this.name = builder.name;
            this.nameServer = builder.nameServer;
            this.orderId = builder.orderId;
            this.podCidr = builder.podCidr;
            this.primaryUser = builder.primaryUser;
            this.region = builder.region;
            this.replica = builder.replica;
            this.seataServerUniqueId = builder.seataServerUniqueId;
            this.securityGroup = builder.securityGroup;
            this.spec = builder.spec;
            this.startDate = builder.startDate;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.storeMode = builder.storeMode;
            this.vpc = builder.vpc;
            this.vswitch = builder.vswitch;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appClusterId
         */
        public String getAppClusterId() {
            return this.appClusterId;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return dbPassword
         */
        public String getDbPassword() {
            return this.dbPassword;
        }

        /**
         * @return dbUrl
         */
        public String getDbUrl() {
            return this.dbUrl;
        }

        /**
         * @return dbUserName
         */
        public String getDbUserName() {
            return this.dbUserName;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return environmentId
         */
        public Long getEnvironmentId() {
            return this.environmentId;
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
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isCreatedRedis
         */
        public Boolean getIsCreatedRedis() {
            return this.isCreatedRedis;
        }

        /**
         * @return k8sResourceId
         */
        public Long getK8sResourceId() {
            return this.k8sResourceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameServer
         */
        public String getNameServer() {
            return this.nameServer;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return podCidr
         */
        public String getPodCidr() {
            return this.podCidr;
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
        public Long getReplica() {
            return this.replica;
        }

        /**
         * @return seataServerUniqueId
         */
        public String getSeataServerUniqueId() {
            return this.seataServerUniqueId;
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
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return storeMode
         */
        public String getStoreMode() {
            return this.storeMode;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String appClusterId; 
            private String appVersion; 
            private String dbPassword; 
            private String dbUrl; 
            private String dbUserName; 
            private String endDate; 
            private Long environmentId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String imageVersion; 
            private String instanceId; 
            private Boolean isCreatedRedis; 
            private Long k8sResourceId; 
            private String name; 
            private String nameServer; 
            private String orderId; 
            private String podCidr; 
            private String primaryUser; 
            private String region; 
            private Long replica; 
            private String seataServerUniqueId; 
            private String securityGroup; 
            private String spec; 
            private String startDate; 
            private Long status; 
            private String statusDesc; 
            private String storeMode; 
            private String vpc; 
            private String vswitch; 
            private String zoneId; 

            /**
             * AppClusterId.
             */
            public Builder appClusterId(String appClusterId) {
                this.appClusterId = appClusterId;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * DbPassword.
             */
            public Builder dbPassword(String dbPassword) {
                this.dbPassword = dbPassword;
                return this;
            }

            /**
             * DbUrl.
             */
            public Builder dbUrl(String dbUrl) {
                this.dbUrl = dbUrl;
                return this;
            }

            /**
             * DbUserName.
             */
            public Builder dbUserName(String dbUserName) {
                this.dbUserName = dbUserName;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * EnvironmentId.
             */
            public Builder environmentId(Long environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ImageVersion.
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IsCreatedRedis.
             */
            public Builder isCreatedRedis(Boolean isCreatedRedis) {
                this.isCreatedRedis = isCreatedRedis;
                return this;
            }

            /**
             * K8sResourceId.
             */
            public Builder k8sResourceId(Long k8sResourceId) {
                this.k8sResourceId = k8sResourceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NameServer.
             */
            public Builder nameServer(String nameServer) {
                this.nameServer = nameServer;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * PodCidr.
             */
            public Builder podCidr(String podCidr) {
                this.podCidr = podCidr;
                return this;
            }

            /**
             * PrimaryUser.
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Replica.
             */
            public Builder replica(Long replica) {
                this.replica = replica;
                return this;
            }

            /**
             * SeataServerUniqueId.
             */
            public Builder seataServerUniqueId(String seataServerUniqueId) {
                this.seataServerUniqueId = seataServerUniqueId;
                return this;
            }

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * StatusDesc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * StoreMode.
             */
            public Builder storeMode(String storeMode) {
                this.storeMode = storeMode;
                return this;
            }

            /**
             * Vpc.
             */
            public Builder vpc(String vpc) {
                this.vpc = vpc;
                return this;
            }

            /**
             * Vswitch.
             */
            public Builder vswitch(String vswitch) {
                this.vswitch = vswitch;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
