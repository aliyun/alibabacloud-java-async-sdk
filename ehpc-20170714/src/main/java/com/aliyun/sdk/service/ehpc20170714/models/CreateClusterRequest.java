// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @Query
    @NameInMap("EcsOrder")
    private EcsOrder ecsOrder;

    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("Application")
    private java.util.List < Application> application;

    @Query
    @NameInMap("ComputeSpotPriceLimit")
    private String computeSpotPriceLimit;

    @Query
    @NameInMap("ComputeSpotStrategy")
    private String computeSpotStrategy;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EcsChargeType")
    private String ecsChargeType;

    @Query
    @NameInMap("EhpcVersion")
    @Validation(required = true)
    private String ehpcVersion;

    @Query
    @NameInMap("HaEnable")
    private Boolean haEnable;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OsTag")
    @Validation(required = true)
    private String osTag;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("RemoteDirectory")
    private String remoteDirectory;

    @Query
    @NameInMap("SccClusterId")
    private String sccClusterId;

    @Query
    @NameInMap("SchedulerType")
    private String schedulerType;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SecurityGroupName")
    private String securityGroupName;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VolumeId")
    private String volumeId;

    @Query
    @NameInMap("VolumeMountpoint")
    private String volumeMountpoint;

    @Query
    @NameInMap("VolumeProtocol")
    private String volumeProtocol;

    @Query
    @NameInMap("VolumeType")
    private String volumeType;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.ecsOrder = builder.ecsOrder;
        this.accountType = builder.accountType;
        this.application = builder.application;
        this.computeSpotPriceLimit = builder.computeSpotPriceLimit;
        this.computeSpotStrategy = builder.computeSpotStrategy;
        this.description = builder.description;
        this.ecsChargeType = builder.ecsChargeType;
        this.ehpcVersion = builder.ehpcVersion;
        this.haEnable = builder.haEnable;
        this.imageId = builder.imageId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.keyPairName = builder.keyPairName;
        this.name = builder.name;
        this.osTag = builder.osTag;
        this.password = builder.password;
        this.remoteDirectory = builder.remoteDirectory;
        this.sccClusterId = builder.sccClusterId;
        this.schedulerType = builder.schedulerType;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupName = builder.securityGroupName;
        this.vSwitchId = builder.vSwitchId;
        this.volumeId = builder.volumeId;
        this.volumeMountpoint = builder.volumeMountpoint;
        this.volumeProtocol = builder.volumeProtocol;
        this.volumeType = builder.volumeType;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecsOrder
     */
    public EcsOrder getEcsOrder() {
        return this.ecsOrder;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return application
     */
    public java.util.List < Application> getApplication() {
        return this.application;
    }

    /**
     * @return computeSpotPriceLimit
     */
    public String getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    /**
     * @return computeSpotStrategy
     */
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ecsChargeType
     */
    public String getEcsChargeType() {
        return this.ecsChargeType;
    }

    /**
     * @return ehpcVersion
     */
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

    /**
     * @return haEnable
     */
    public Boolean getHaEnable() {
        return this.haEnable;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return osTag
     */
    public String getOsTag() {
        return this.osTag;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return remoteDirectory
     */
    public String getRemoteDirectory() {
        return this.remoteDirectory;
    }

    /**
     * @return sccClusterId
     */
    public String getSccClusterId() {
        return this.sccClusterId;
    }

    /**
     * @return schedulerType
     */
    public String getSchedulerType() {
        return this.schedulerType;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return volumeId
     */
    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * @return volumeMountpoint
     */
    public String getVolumeMountpoint() {
        return this.volumeMountpoint;
    }

    /**
     * @return volumeProtocol
     */
    public String getVolumeProtocol() {
        return this.volumeProtocol;
    }

    /**
     * @return volumeType
     */
    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private EcsOrder ecsOrder; 
        private String accountType; 
        private java.util.List < Application> application; 
        private String computeSpotPriceLimit; 
        private String computeSpotStrategy; 
        private String description; 
        private String ecsChargeType; 
        private String ehpcVersion; 
        private Boolean haEnable; 
        private String imageId; 
        private String imageOwnerAlias; 
        private String keyPairName; 
        private String name; 
        private String osTag; 
        private String password; 
        private String remoteDirectory; 
        private String sccClusterId; 
        private String schedulerType; 
        private String securityGroupId; 
        private String securityGroupName; 
        private String vSwitchId; 
        private String volumeId; 
        private String volumeMountpoint; 
        private String volumeProtocol; 
        private String volumeType; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.ecsOrder = request.ecsOrder;
            this.accountType = request.accountType;
            this.application = request.application;
            this.computeSpotPriceLimit = request.computeSpotPriceLimit;
            this.computeSpotStrategy = request.computeSpotStrategy;
            this.description = request.description;
            this.ecsChargeType = request.ecsChargeType;
            this.ehpcVersion = request.ehpcVersion;
            this.haEnable = request.haEnable;
            this.imageId = request.imageId;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.keyPairName = request.keyPairName;
            this.name = request.name;
            this.osTag = request.osTag;
            this.password = request.password;
            this.remoteDirectory = request.remoteDirectory;
            this.sccClusterId = request.sccClusterId;
            this.schedulerType = request.schedulerType;
            this.securityGroupId = request.securityGroupId;
            this.securityGroupName = request.securityGroupName;
            this.vSwitchId = request.vSwitchId;
            this.volumeId = request.volumeId;
            this.volumeMountpoint = request.volumeMountpoint;
            this.volumeProtocol = request.volumeProtocol;
            this.volumeType = request.volumeType;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * EcsOrder.
         */
        public Builder ecsOrder(EcsOrder ecsOrder) {
            this.putQueryParameter("EcsOrder", ecsOrder);
            this.ecsOrder = ecsOrder;
            return this;
        }

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * Application.
         */
        public Builder application(java.util.List < Application> application) {
            this.putQueryParameter("Application", application);
            this.application = application;
            return this;
        }

        /**
         * ComputeSpotPriceLimit.
         */
        public Builder computeSpotPriceLimit(String computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * ComputeSpotStrategy.
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EcsChargeType.
         */
        public Builder ecsChargeType(String ecsChargeType) {
            this.putQueryParameter("EcsChargeType", ecsChargeType);
            this.ecsChargeType = ecsChargeType;
            return this;
        }

        /**
         * EhpcVersion.
         */
        public Builder ehpcVersion(String ehpcVersion) {
            this.putQueryParameter("EhpcVersion", ehpcVersion);
            this.ehpcVersion = ehpcVersion;
            return this;
        }

        /**
         * HaEnable.
         */
        public Builder haEnable(Boolean haEnable) {
            this.putQueryParameter("HaEnable", haEnable);
            this.haEnable = haEnable;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * ImageOwnerAlias.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * KeyPairName.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OsTag.
         */
        public Builder osTag(String osTag) {
            this.putQueryParameter("OsTag", osTag);
            this.osTag = osTag;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * RemoteDirectory.
         */
        public Builder remoteDirectory(String remoteDirectory) {
            this.putQueryParameter("RemoteDirectory", remoteDirectory);
            this.remoteDirectory = remoteDirectory;
            return this;
        }

        /**
         * SccClusterId.
         */
        public Builder sccClusterId(String sccClusterId) {
            this.putQueryParameter("SccClusterId", sccClusterId);
            this.sccClusterId = sccClusterId;
            return this;
        }

        /**
         * SchedulerType.
         */
        public Builder schedulerType(String schedulerType) {
            this.putQueryParameter("SchedulerType", schedulerType);
            this.schedulerType = schedulerType;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SecurityGroupName.
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VolumeId.
         */
        public Builder volumeId(String volumeId) {
            this.putQueryParameter("VolumeId", volumeId);
            this.volumeId = volumeId;
            return this;
        }

        /**
         * VolumeMountpoint.
         */
        public Builder volumeMountpoint(String volumeMountpoint) {
            this.putQueryParameter("VolumeMountpoint", volumeMountpoint);
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }

        /**
         * VolumeProtocol.
         */
        public Builder volumeProtocol(String volumeProtocol) {
            this.putQueryParameter("VolumeProtocol", volumeProtocol);
            this.volumeProtocol = volumeProtocol;
            return this;
        }

        /**
         * VolumeType.
         */
        public Builder volumeType(String volumeType) {
            this.putQueryParameter("VolumeType", volumeType);
            this.volumeType = volumeType;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

    public static class Compute extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        private Integer count;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        private Compute(Builder builder) {
            this.count = builder.count;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Compute create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceType; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public Compute build() {
                return new Compute(this);
            } 

        } 

    }
    public static class Login extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        private Integer count;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        private Login(Builder builder) {
            this.count = builder.count;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Login create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceType; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public Login build() {
                return new Login(this);
            } 

        } 

    }
    public static class Manager extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        private Manager(Builder builder) {
            this.count = builder.count;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Manager create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceType; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public Manager build() {
                return new Manager(this);
            } 

        } 

    }
    public static class EcsOrder extends TeaModel {
        @NameInMap("Compute")
        @Validation(required = true)
        private Compute compute;

        @NameInMap("Login")
        @Validation(required = true)
        private Login login;

        @NameInMap("Manager")
        @Validation(required = true)
        private Manager manager;

        private EcsOrder(Builder builder) {
            this.compute = builder.compute;
            this.login = builder.login;
            this.manager = builder.manager;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsOrder create() {
            return builder().build();
        }

        /**
         * @return compute
         */
        public Compute getCompute() {
            return this.compute;
        }

        /**
         * @return login
         */
        public Login getLogin() {
            return this.login;
        }

        /**
         * @return manager
         */
        public Manager getManager() {
            return this.manager;
        }

        public static final class Builder {
            private Compute compute; 
            private Login login; 
            private Manager manager; 

            /**
             * Compute.
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * Login.
             */
            public Builder login(Login login) {
                this.login = login;
                return this;
            }

            /**
             * Manager.
             */
            public Builder manager(Manager manager) {
                this.manager = manager;
                return this;
            }

            public EcsOrder build() {
                return new EcsOrder(this);
            } 

        } 

    }
    public static class Application extends TeaModel {
        @NameInMap("Tag")
        private String tag;

        private Application(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String tag; 

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
}
