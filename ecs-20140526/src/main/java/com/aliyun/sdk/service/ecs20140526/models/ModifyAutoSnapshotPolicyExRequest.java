// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @com.aliyun.core.annotation.NameInMap("TargetTags")
    private java.util.List<TargetTags> targetTags;

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
        this.targetTags = builder.targetTags;
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
     * @return targetTags
     */
    public java.util.List<TargetTags> getTargetTags() {
        return this.targetTags;
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
        private java.util.List<TargetTags> targetTags; 
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
            this.targetTags = request.targetTags;
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
         * <p>The retention period of cross-region snapshot replicas. Unit: days. Valid values:</p>
         * <ul>
         * <li>-1: Snapshot replicas are permanently retained.</li>
         * <li>1 to 65535: the number of days for which snapshot replicas are retained.</li>
         * </ul>
         * <p>Default value: -1.</p>
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
         * <p>The encryption parameter object for cross-region snapshot replication.</p>
         */
        public Builder copyEncryptionConfiguration(CopyEncryptionConfiguration copyEncryptionConfiguration) {
            this.putQueryParameter("CopyEncryptionConfiguration", copyEncryptionConfiguration);
            this.copyEncryptionConfiguration = copyEncryptionConfiguration;
            return this;
        }

        /**
         * <p>Specifies whether to allow automatic cross-region replication.</p>
         * <ul>
         * <li>true: allowed.</li>
         * <li>false: not allowed.</li>
         * </ul>
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
         * <p>The destination region to which snapshots are replicated. Currently, you can set only one destination region.</p>
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
         * <p>The list of target resource tags. The automatic snapshot policy matches target resources based on tags.
         * This parameter is required when AssociationType is set to AssociatedWithInstanceTag.</p>
         */
        public Builder targetTags(java.util.List<TargetTags> targetTags) {
            this.putQueryParameter("TargetTags", targetTags);
            this.targetTags = targetTags;
            return this;
        }

        /**
         * <p>The ID of the automatic snapshot policy. You can call <a href="https://help.aliyun.com/document_detail/25530.html">DescribeAutoSnapshotPolicyEx</a> to query available automatic snapshot policies.</p>
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
         * <p>The name of the automatic snapshot policy. If this parameter is left empty, the name is not modified.</p>
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
         * <p>The region ID of the automatic snapshot policy. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The days of the week on which automatic snapshots are created. Unit: days. The cycle is weekly. Valid values: 1 to 7. For example, 1 indicates Monday.</p>
         * <p>To create multiple automatic snapshots within a week, specify multiple days:</p>
         * <ul>
         * <li>You can specify up to 7 days.</li>
         * <li>Specify multiple days in a JSON array, such as <code>&quot;1&quot;, &quot;2&quot;, … &quot;7&quot;</code>. Separate the days with commas (,).</li>
         * </ul>
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
         * <p>The retention period of automatic snapshots. Unit: days. Valid values:</p>
         * <ul>
         * <li>-1: Automatic snapshots are permanently retained.</li>
         * <li>1 to 65536: the number of days for which automatic snapshots are retained.</li>
         * </ul>
         * <p>Default value: -1.</p>
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
         * <p>The points in time at which automatic snapshots are created. The time is displayed in UTC+8. Unit: hours. Valid values: 0 to 23, which correspond to the 24 points in time from 00:00 to 23:00. For example, 1 indicates 01:00.</p>
         * <p>To create multiple automatic snapshots within a day, specify multiple points in time:</p>
         * <ul>
         * <li>You can specify up to 24 points in time.</li>
         * <li>Specify multiple points in time in a JSON array, such as <code>&quot;0&quot;, &quot;1&quot;, … &quot;23&quot;</code>. Separate the points in time with commas (,).</li>
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

            private Builder() {
            } 

            private Builder(Arn model) {
                this.assumeRoleFor = model.assumeRoleFor;
                this.roleType = model.roleType;
                this.rolearn = model.rolearn;
            } 

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
        private java.util.List<Arn> arn;

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
        public java.util.List<Arn> getArn() {
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
            private java.util.List<Arn> arn; 
            private Boolean encrypted; 
            private String KMSKeyId; 

            private Builder() {
            } 

            private Builder(CopyEncryptionConfiguration model) {
                this.arn = model.arn;
                this.encrypted = model.encrypted;
                this.KMSKeyId = model.KMSKeyId;
            } 

            /**
             * <p>This parameter is not publicly available.</p>
             */
            public Builder arn(java.util.List<Arn> arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>Specifies whether to enable encryption for cross-region snapshot replication. Valid values:</p>
             * <ul>
             * <li>true: Encryption is enabled. </li>
             * <li>false: Encryption is not enabled.</li>
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
             * <p>The key ID of the KMS key used for encrypted cross-region snapshot replication.</p>
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
    /**
     * 
     * {@link ModifyAutoSnapshotPolicyExRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoSnapshotPolicyExRequest</p>
     */
    public static class TargetTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TargetTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(TargetTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.
             * Valid values of N: 1 to 10.
             * The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. The tag key cannot contain http:// or https://.</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.
             * Valid values of N: 1 to 10. The tag value can be up to 128 characters in length and cannot contain http:// or https://.
             * Note: If you pass in an empty value or an empty string, it indicates any value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TargetTags build() {
                return new TargetTags(this);
            } 

        } 

    }
}
