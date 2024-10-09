// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyAutoSnapshotPolicyExRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoSnapshotPolicyExRequest</p>
 */
public class ModifyAutoSnapshotPolicyExRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CopiedSnapshotsRetentionDays")
    private Integer copiedSnapshotsRetentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CopyEncryptionConfiguration")
    private CopyEncryptionConfiguration copyEncryptionConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCrossRegionCopy")
    private Boolean enableCrossRegionCopy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetCopyRegions")
    private String targetCopyRegions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("autoSnapshotPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String autoSnapshotPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("autoSnapshotPolicyName")
    private String autoSnapshotPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("repeatWeekdays")
    private String repeatWeekdays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("retentionDays")
    private Integer retentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timePoints")
    private String timePoints;

    private ModifyAutoSnapshotPolicyExRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.copiedSnapshotsRetentionDays = builder.copiedSnapshotsRetentionDays;
        this.copyEncryptionConfiguration = builder.copyEncryptionConfiguration;
        this.enableCrossRegionCopy = builder.enableCrossRegionCopy;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetCopyRegions = builder.targetCopyRegions;
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.autoSnapshotPolicyName = builder.autoSnapshotPolicyName;
        this.regionId = builder.regionId;
        this.repeatWeekdays = builder.repeatWeekdays;
        this.retentionDays = builder.retentionDays;
        this.timePoints = builder.timePoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoSnapshotPolicyExRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return copiedSnapshotsRetentionDays
     */
    public Integer getCopiedSnapshotsRetentionDays() {
        return this.copiedSnapshotsRetentionDays;
    }

    /**
     * @return copyEncryptionConfiguration
     */
    public CopyEncryptionConfiguration getCopyEncryptionConfiguration() {
        return this.copyEncryptionConfiguration;
    }

    /**
     * @return enableCrossRegionCopy
     */
    public Boolean getEnableCrossRegionCopy() {
        return this.enableCrossRegionCopy;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return targetCopyRegions
     */
    public String getTargetCopyRegions() {
        return this.targetCopyRegions;
    }

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    /**
     * @return autoSnapshotPolicyName
     */
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repeatWeekdays
     */
    public String getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    /**
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return timePoints
     */
    public String getTimePoints() {
        return this.timePoints;
    }

    public static final class Builder extends Request.Builder<ModifyAutoSnapshotPolicyExRequest, Builder> {
        private String sourceRegionId; 
        private Integer copiedSnapshotsRetentionDays; 
        private CopyEncryptionConfiguration copyEncryptionConfiguration; 
        private Boolean enableCrossRegionCopy; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String targetCopyRegions; 
        private String autoSnapshotPolicyId; 
        private String autoSnapshotPolicyName; 
        private String regionId; 
        private String repeatWeekdays; 
        private Integer retentionDays; 
        private String timePoints; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoSnapshotPolicyExRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.copiedSnapshotsRetentionDays = request.copiedSnapshotsRetentionDays;
            this.copyEncryptionConfiguration = request.copyEncryptionConfiguration;
            this.enableCrossRegionCopy = request.enableCrossRegionCopy;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.targetCopyRegions = request.targetCopyRegions;
            this.autoSnapshotPolicyId = request.autoSnapshotPolicyId;
            this.autoSnapshotPolicyName = request.autoSnapshotPolicyName;
            this.regionId = request.regionId;
            this.repeatWeekdays = request.repeatWeekdays;
            this.retentionDays = request.retentionDays;
            this.timePoints = request.timePoints;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder copiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
            this.putQueryParameter("CopiedSnapshotsRetentionDays", copiedSnapshotsRetentionDays);
            this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
            return this;
        }

        /**
         * <p>The encryption configurations for cross-region snapshot replication.</p>
         */
        public Builder copyEncryptionConfiguration(CopyEncryptionConfiguration copyEncryptionConfiguration) {
            this.putQueryParameter("CopyEncryptionConfiguration", copyEncryptionConfiguration);
            this.copyEncryptionConfiguration = copyEncryptionConfiguration;
            return this;
        }

        /**
         * <p>The destination region to which to copy the snapshot. You can specify only a single destination region.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableCrossRegionCopy(Boolean enableCrossRegionCopy) {
            this.putQueryParameter("EnableCrossRegionCopy", enableCrossRegionCopy);
            this.enableCrossRegionCopy = enableCrossRegionCopy;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The retention period of the snapshot copy in the destination region. Unit: days. Valid values:</p>
         * <ul>
         * <li>-1: The snapshot is permanently retained.</li>
         * <li>1 to 65535: The automatic snapshot is retained for the specified number of days.</li>
         * </ul>
         * <p>Default value: -1.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cn-hangzhou&quot;]</p>
         */
        public Builder targetCopyRegions(String targetCopyRegions) {
            this.putQueryParameter("TargetCopyRegions", targetCopyRegions);
            this.targetCopyRegions = targetCopyRegions;
            return this;
        }

        /**
         * <p>The name of the automatic snapshot policy. If this parameter is not specified, the original name of the automatic snapshot policy is retained.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp12m37ccmxvbmi5****</p>
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.putQueryParameter("autoSnapshotPolicyId", autoSnapshotPolicyId);
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * <p>The points in time of the day at which to create automatic snapshots. The time must be in UTC+8. Unit: hours. Valid values are 0 to 23, which correspond to the 24 points in time on the hour from 00:00:00 to 23:00:00. For example, a value of 1 indicates 01:00:00.</p>
         * <p>To schedule multiple automatic snapshots to be created in a day, you can specify multiple hours.</p>
         * <ul>
         * <li>You can specify up to 24 points in time.</li>
         * <li>You must set this parameter to a JSON array such as <code>[&quot;0&quot;, &quot;1&quot;, ... &quot;23&quot;]</code>. Separate the points in time with commas (,).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SPTestName</p>
         */
        public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
            this.putQueryParameter("autoSnapshotPolicyName", autoSnapshotPolicyName);
            this.autoSnapshotPolicyName = autoSnapshotPolicyName;
            return this;
        }

        /**
         * <p>The ID of the automatic snapshot policy. You can call the <a href="https://help.aliyun.com/document_detail/25530.html">DescribeAutoSnapshotPolicyEx</a> operation to query available automatic snapshot policies.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The retention period of the automatic snapshot. Unit: days. Valid values:</p>
         * <ul>
         * <li>-1: The automatic snapshot is permanently retained.</li>
         * <li>1 to 65536: The auto snapshot is retained for the specified number of days.</li>
         * </ul>
         * <p>Default value: -1.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1&quot;, &quot;7&quot;]</p>
         */
        public Builder repeatWeekdays(String repeatWeekdays) {
            this.putQueryParameter("repeatWeekdays", repeatWeekdays);
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }

        /**
         * <p>Specifies whether to enable cross-region replication for the automatic snapshot.</p>
         * <ul>
         * <li>true: enables cross-region replication for the automatic snapshot.</li>
         * <li>false: disables cross-region replication for the automatic snapshot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("retentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * <p>The days of the week on which to create automatic snapshots. Valid values are 1 to 7, which correspond to the days of the week. For example, a value of 1 indicates Monday.</p>
         * <p>To schedule multiple automatic snapshots to be created in a week, you can specify multiple days.</p>
         * <ul>
         * <li>You can specify up to seven days over a one-week period.</li>
         * <li>You must set this parameter to a JSON array such as <code>[&quot;1&quot;, &quot;2&quot; ... &quot;7&quot;]</code>. Separate the values in the array with commas (,).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;0&quot;, &quot;1&quot;]</p>
         */
        public Builder timePoints(String timePoints) {
            this.putQueryParameter("timePoints", timePoints);
            this.timePoints = timePoints;
            return this;
        }

        @Override
        public ModifyAutoSnapshotPolicyExRequest build() {
            return new ModifyAutoSnapshotPolicyExRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAutoSnapshotPolicyExRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoSnapshotPolicyExRequest</p>
     */
    public static class Arn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        private Long assumeRoleFor;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        @com.aliyun.core.annotation.NameInMap("Rolearn")
        private String rolearn;

        private Arn(Builder builder) {
            this.assumeRoleFor = builder.assumeRoleFor;
            this.roleType = builder.roleType;
            this.rolearn = builder.rolearn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arn create() {
            return builder().build();
        }

        /**
         * @return assumeRoleFor
         */
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        /**
         * @return rolearn
         */
        public String getRolearn() {
            return this.rolearn;
        }

        public static final class Builder {
            private Long assumeRoleFor; 
            private String roleType; 
            private String rolearn; 

            /**
             * <p>This parameter is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000000</p>
             */
            public Builder assumeRoleFor(Long assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <p>This parameter is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * <p>This parameter is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
             */
            public Builder rolearn(String rolearn) {
                this.rolearn = rolearn;
                return this;
            }

            public Arn build() {
                return new Arn(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAutoSnapshotPolicyExRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoSnapshotPolicyExRequest</p>
     */
    public static class CopyEncryptionConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private java.util.List < Arn> arn;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        private CopyEncryptionConfiguration(Builder builder) {
            this.arn = builder.arn;
            this.encrypted = builder.encrypted;
            this.KMSKeyId = builder.KMSKeyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CopyEncryptionConfiguration create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public java.util.List < Arn> getArn() {
            return this.arn;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public static final class Builder {
            private java.util.List < Arn> arn; 
            private Boolean encrypted; 
            private String KMSKeyId; 

            /**
             * <p>This parameter is not publicly available.</p>
             */
            public Builder arn(java.util.List < Arn> arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>Specifies whether to enable encryption for cross-region snapshot replication. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The ID of the KMS key used for encryption in cross-region snapshot replication.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40826X</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            public CopyEncryptionConfiguration build() {
                return new CopyEncryptionConfiguration(this);
            } 

        } 

    }
}
