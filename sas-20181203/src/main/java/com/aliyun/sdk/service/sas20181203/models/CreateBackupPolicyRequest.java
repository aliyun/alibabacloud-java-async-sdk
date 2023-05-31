// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupPolicyRequest</p>
 */
public class CreateBackupPolicyRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Policy")
    @Validation(required = true)
    private java.util.Map < String, ? > policy;

    @Query
    @NameInMap("PolicyRegionId")
    private String policyRegionId;

    @Query
    @NameInMap("PolicyVersion")
    @Validation(required = true)
    private String policyVersion;

    @Query
    @NameInMap("UuidList")
    @Validation(required = true)
    private java.util.List < String > uuidList;

    private CreateBackupPolicyRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.policy = builder.policy;
        this.policyRegionId = builder.policyRegionId;
        this.policyVersion = builder.policyVersion;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policy
     */
    public java.util.Map < String, ? > getPolicy() {
        return this.policy;
    }

    /**
     * @return policyRegionId
     */
    public String getPolicyRegionId() {
        return this.policyRegionId;
    }

    /**
     * @return policyVersion
     */
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<CreateBackupPolicyRequest, Builder> {
        private String name; 
        private java.util.Map < String, ? > policy; 
        private String policyRegionId; 
        private String policyVersion; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupPolicyRequest request) {
            super(request);
            this.name = request.name;
            this.policy = request.policy;
            this.policyRegionId = request.policyRegionId;
            this.policyVersion = request.policyVersion;
            this.uuidList = request.uuidList;
        } 

        /**
         * The name of the anti-ransomware policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * *   **IsDefault**: the type of the anti-ransomware policy. Valid values:
         * <p>
         * 
         *     *   **1**: recommended policy
         *     *   **0**: custom policy
         * 
         * *   **Include**: the format of the files that you want to protect. If you want to protect the files in all formats, set this field to \[].
         * 
         * *   **Source**: the directory that you want to protect. If you want to protect all directories, set this field to \[].
         * 
         * *   **ExcludeSystemPath**: specifies whether to exclude a specific directory from the anti-ransomware policy. If you want to exclude a directory, set this field to **true**. If you do not want to exclude a directory, leave this field empty.
         * 
         * *   **Exclude**: the directory that you want to exclude from the anti-ransomware policy. If you do not want to exclude a directory, set this field to \[].
         * 
         * *   **Schedule**: the start time and interval of a data backup task. We recommend that you specify a start time that begins during off-peak hours but does not start on the hour. Examples:
         * 
         *     *   If you set this field to I|1583216092|P21D, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of three weeks.
         *     *   If you set this field to I|1583216092|PT24H, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of 24 hours.
         * 
         * *   **Retention**: the period during which backup data is retained. Unit: days. If you set this field to 7, backup data is retained for a week. If you set this field to 365, backup data is retained for a year. If you set this field to -1, backup data is permanently retained.
         * 
         * *   **SpeedLimiter**: the limit on the network bandwidth for data backup tasks. If you set this field to 0:24:30720, the maximum bandwidth for a data backup task is 30 MB/s from 00:00 to 24:00.
         * 
         * *   **UseVss**: specifies whether to enable the VSS feature. The feature is available only for Windows servers. Valid values:
         * 
         *     *   **true**: yes
         *     *   **false**: no
         * 
         * >  The VSS feature is available only if you create the anti-ransomware policy for Windows servers. After you enable the feature, the number of backup failures due to running processes is significantly reduced. We recommend that you enable the VSS feature. After you enable the feature, the data of disks that are in the exFAT and FAT32 formats cannot be backed up.
         */
        public Builder policy(java.util.Map < String, ? > policy) {
            String policyShrink = shrink(policy, "Policy", "json");
            this.putQueryParameter("Policy", policyShrink);
            this.policy = policy;
            return this;
        }

        /**
         * The region ID of the server that is not deployed on Alibaba Cloud.
         * <p>
         * 
         * >  We recommend that you specify the ID of the supported region that is the nearest to the location of the server. You can call the [DescribeSupportRegion](~~DescribeSupportRegion~~) operation to query the supported regions of the anti-ransomware feature.
         */
        public Builder policyRegionId(String policyRegionId) {
            this.putQueryParameter("PolicyRegionId", policyRegionId);
            this.policyRegionId = policyRegionId;
            return this;
        }

        /**
         * The version of the anti-ransomware policy. Set the value to **2.0.0**.
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * The UUIDs of the servers that you want to protect.
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public CreateBackupPolicyRequest build() {
            return new CreateBackupPolicyRequest(this);
        } 

    } 

}
