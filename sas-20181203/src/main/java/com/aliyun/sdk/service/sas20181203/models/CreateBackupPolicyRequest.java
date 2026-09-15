// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupPolicyRequest</p>
 */
public class CreateBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyRegionId")
    private String policyRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectType")
    private String selectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerType")
    private String serverType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private java.util.List<String> uuidList;

    private CreateBackupPolicyRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.policy = builder.policy;
        this.policyRegionId = builder.policyRegionId;
        this.policyVersion = builder.policyVersion;
        this.selectType = builder.selectType;
        this.serverType = builder.serverType;
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
    public java.util.Map<String, ?> getPolicy() {
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
     * @return selectType
     */
    public String getSelectType() {
        return this.selectType;
    }

    /**
     * @return serverType
     */
    public String getServerType() {
        return this.serverType;
    }

    /**
     * @return uuidList
     */
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<CreateBackupPolicyRequest, Builder> {
        private String name; 
        private java.util.Map<String, ?> policy; 
        private String policyRegionId; 
        private String policyVersion; 
        private String selectType; 
        private String serverType; 
        private java.util.List<String> uuidList; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupPolicyRequest request) {
            super(request);
            this.name = request.name;
            this.policy = request.policy;
            this.policyRegionId = request.policyRegionId;
            this.policyVersion = request.policyVersion;
            this.selectType = request.selectType;
            this.serverType = request.serverType;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>The name of the protection policy to create. Set this parameter to the desired policy name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ServerBackUpPolicy01</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <ul>
         * <li><strong>IsDefault</strong>: The type of the protection policy to create. Valid values:<ul>
         * <li><strong>1</strong>: Recommended policy.</li>
         * <li><strong>0</strong>: Custom policy.</li>
         * </ul>
         * </li>
         * <li><strong>Include</strong>: The file types to protect. To protect all file types, set this parameter to [].</li>
         * <li><strong>Source</strong>: The server folders to protect. To protect all folders, set this parameter to [].</li>
         * <li><strong>ExcludeSystemPath</strong>: Specifies whether to exclude specified folders. Set this parameter to <strong>true</strong> to exclude folders. If you do not want to exclude folders, you do not need to set this parameter.</li>
         * <li><strong>Exclude</strong>: The specified protection folder addresses. If you do not want to specify protection folder addresses, set this parameter to [].</li>
         * <li><strong>Schedule</strong>: The time and interval at which the data backup task is scheduled to run. Specify a non-peak hour that is not on the hour. Examples:<ul>
         * <li>Example 1: I|1583216092|P21D indicates that the data backup starts at 2020-03-03 14:14:52 and the backup policy runs at an interval of 3 weeks.</li>
         * <li>Example 2: I|1583216092|PT24H indicates that the data backup starts at 2020-03-03 14:14:52 and the backup policy runs at an interval of 24 hours.</li>
         * </ul>
         * </li>
         * <li><strong>Retention</strong>: The retention period of backup data, in days. The value 7 indicates 1 week, 365 indicates 1 year, and -1 indicates permanent retention.</li>
         * <li><strong>SpeedLimiter</strong>: The network bandwidth throttling for backup. For example, 0:24:30720 indicates that the network bandwidth throttling for backup is 30 MB/s from 00:00 to 24:00.</li>
         * <li><strong>UseVss</strong>: Specifies whether to enable the Volume Shadow Copy Service (VSS) feature for Windows. Valid values:<ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The VSS (Windows) feature applies only to Windows systems. After this feature is enabled, the issue of individual file backup failures due to process occupation is effectively reduced. We recommend that you enable this feature. After this feature is enabled, file backup for exFAT and FAT32 disk formats is not supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;IsDefault&quot;:1,&quot;Include&quot;:[],&quot;Source&quot;:[],&quot;Schedule&quot;:&quot;I|1648061040|PT24H&quot;,&quot;Retention&quot;:7,&quot;SpeedLimiter&quot;:&quot;&quot;,&quot;ExcludeSystemPath&quot;:true,&quot;Exclude&quot;:[&quot;/bin/&quot;,&quot;/usr/bin/&quot;,&quot;/sbin/&quot;,&quot;/boot/&quot;,&quot;/proc/&quot;,&quot;/sys/&quot;,&quot;/srv/&quot;,&quot;/lib/&quot;,&quot;/selinux/&quot;,&quot;/usr/sbin/&quot;,&quot;/run/&quot;,&quot;/lib32/&quot;,&quot;/lib64/&quot;,&quot;/lost+found/&quot;,&quot;/var/lib/kubelet/&quot;,&quot;/var/lib/ntp/proc&quot;,&quot;/var/lib/container&quot;,&quot;Windows&quot;,&quot;Python27&quot;,&quot;Program Files (x86)&quot;,&quot;Program Files&quot;,&quot;Boot&quot;,&quot;$RECYCLE.BIN&quot;,&quot;System Volume Information&quot;,&quot;Users\Administrator\NTUSER.DAT*&quot;,&quot;ProgramData&quot;,&quot;pagefile.sys&quot;,&quot;Users\Default\NTUSER.DAT*&quot;,&quot;Users\Administrator\ntuser.*&quot;],&quot;UseVss&quot;:true}&quot;</p>
         */
        public Builder policy(java.util.Map<String, ?> policy) {
            String policyShrink = shrink(policy, "Policy", "json");
            this.putQueryParameter("Policy", policyShrink);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The region ID of the non-Alibaba Cloud server.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeSupportRegion~~">DescribeSupportRegion</a> operation to query the regions supported by the anti-ransomware feature, and then select the supported region closest to the region where your non-Alibaba Cloud server resides.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ch-hangzhou</p>
         */
        public Builder policyRegionId(String policyRegionId) {
            this.putQueryParameter("PolicyRegionId", policyRegionId);
            this.policyRegionId = policyRegionId;
            return this;
        }

        /**
         * <p>The version of the protection policy. Set the value to <strong>2.0.0</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * <p>The method used to cover assets. Valid values:</p>
         * <ul>
         * <li><strong>ALL_MACHINE</strong>: All assets.<blockquote>
         * <p>To cover all assets of this type, set this parameter to <strong>ALL_MACHINE</strong>. In this case, <strong>UuidList</strong> is invalid. Only one policy that covers all assets can exist for each server type.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL_MACHINE</p>
         */
        public Builder selectType(String selectType) {
            this.putQueryParameter("SelectType", selectType);
            this.selectType = selectType;
            return this;
        }

        /**
         * <p>The server type. Valid values:</p>
         * <ul>
         * <li><strong>ALIYUN</strong>: Alibaba Cloud server.</li>
         * <li><strong>OUT_CLOUD</strong>: Non-Alibaba Cloud server.</li>
         * <li><strong>TRIPARTITE</strong>: Simple application server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        public Builder serverType(String serverType) {
            this.putQueryParameter("ServerType", serverType);
            this.serverType = serverType;
            return this;
        }

        /**
         * <p>The UUIDs of the servers to protect.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;, &quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;]</p>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
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
