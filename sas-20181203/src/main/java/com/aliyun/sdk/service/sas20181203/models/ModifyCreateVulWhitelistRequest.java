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
 * {@link ModifyCreateVulWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyCreateVulWhitelistRequest</p>
 */
public class ModifyCreateVulWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInfo")
    private String targetInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    @com.aliyun.core.annotation.Validation(required = true)
    private String whitelist;

    private ModifyCreateVulWhitelistRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.reason = builder.reason;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.targetInfo = builder.targetInfo;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCreateVulWhitelistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return targetInfo
     */
    public String getTargetInfo() {
        return this.targetInfo;
    }

    /**
     * @return whitelist
     */
    public String getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<ModifyCreateVulWhitelistRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String reason; 
        private Long resourceDirectoryAccountId; 
        private String targetInfo; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCreateVulWhitelistRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.reason = request.reason;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.targetInfo = request.targetInfo;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Different requests must use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. Valid values:</p>
         * <ul>
         * <li>true: performs only a dry run without executing the actual operation.</li>
         * <li>false: performs the actual operation.</li>
         * </ul>
         * <p>Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The reason for adding the vulnerability whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>This vulnerability is not harmful</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
         * <blockquote>
         * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The scope in which the whitelist takes effect. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><strong>type</strong>: The type of the scope. Valid values:<ul>
         * <li><strong>GroupId</strong>: server group</li>
         * <li><strong>Uuid</strong>: host asset</li>
         * </ul>
         * </li>
         * <li><strong>uuids</strong>: The collection of host asset UUIDs. The field type is String.</li>
         * <li><strong>groupIds</strong>: The collection of server group IDs. The field type is Long.<blockquote>
         * <p>If this parameter is left empty, the whitelist takes effect on all hosts. If <strong>type</strong> is set to <strong>GroupId</strong>, <strong>groupIds</strong> cannot be empty. If <strong>type</strong> is set to <strong>Uuid</strong>, <strong>uuids</strong> cannot be empty.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;Uuid&quot;,&quot;uuids&quot;:[&quot;b31a708f-5fea-426e-bebe-a7b0893****&quot;,&quot;1f749687-3b5d-4e11-8140-d964673****&quot;],&quot;groupIds&quot;:[]}</p>
         */
        public Builder targetInfo(String targetInfo) {
            this.putQueryParameter("TargetInfo", targetInfo);
            this.targetInfo = targetInfo;
            return this;
        }

        /**
         * <p>The information about the vulnerability to add to the whitelist. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><p><strong>Status</strong>: The status of the vulnerability.</p>
         * </li>
         * <li><p><strong>GmtLast</strong>: The timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
         * </li>
         * <li><p><strong>LaterCount</strong>: The number of medium-priority vulnerabilities.</p>
         * </li>
         * <li><p><strong>AsapCount</strong>: The number of high-priority vulnerabilities.</p>
         * </li>
         * <li><p><strong>Name</strong>: The name of the vulnerability.</p>
         * </li>
         * <li><p><strong>Type</strong>: The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>app</strong>: application vulnerability</li>
         * <li><strong>emg</strong>: emergency vulnerability</li>
         * </ul>
         * </li>
         * <li><p><strong>Related</strong>: The CVE ID of the vulnerability.</p>
         * </li>
         * <li><p><strong>HandledCount</strong>: The number of handled vulnerabilities.</p>
         * </li>
         * <li><p><strong>AliasName</strong>: The alias of the vulnerability.</p>
         * </li>
         * <li><p><strong>RuleModifyTime</strong>: The time when the vulnerability was last published.</p>
         * </li>
         * <li><p><strong>NntfCount</strong>: The number of low-priority vulnerabilities.</p>
         * </li>
         * <li><p><strong>TotalFixCount</strong>: The total number of fixed vulnerabilities.</p>
         * </li>
         * <li><p><strong>Tags</strong>: The tags of the vulnerability.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedVul~~">DescribeGroupedVul</a> operation to obtain the vulnerability information to add to the whitelist.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Status&quot;:0,&quot;GmtLast&quot;:1662281929000,&quot;LaterCount&quot;:0,&quot;AsapCount&quot;:1,&quot;Name&quot;:&quot;oval:com.redhat.rhsa:def:20172836&quot;,&quot;Type&quot;:&quot;cve&quot;,&quot;Related&quot;:&quot;CVE-2017-14491,CVE-2017-14492,CVE-2017-14493,CVE-2017-14494,CVE-2017-14495,CVE-2017-14496&quot;,&quot;HandledCount&quot;:1,&quot;AliasName&quot;:&quot;RHSA-2017:2836-Critical: dnsmasq security update&quot;,&quot;RuleModifyTime&quot;:1535542395000,&quot;NntfCount&quot;:0,&quot;TotalFixCount&quot;:196668,&quot;Tags&quot;:&quot;Exploit Exists,Code Execution&quot;},{&quot;Status&quot;:0,&quot;GmtLast&quot;:1662281933000,&quot;LaterCount&quot;:0,&quot;AsapCount&quot;:1,&quot;Name&quot;:&quot;oval:com.redhat.rhsa:def:20173075&quot;,&quot;Type&quot;:&quot;cve&quot;,&quot;Related&quot;:&quot;CVE-2017-13089,CVE-2017-13090&quot;,&quot;HandledCount&quot;:1,&quot;AliasName&quot;:&quot;RHSA-2017:3075-Important: wget security update&quot;,&quot;RuleModifyTime&quot;:1551432867000,&quot;NntfCount&quot;:0,&quot;TotalFixCount&quot;:369136,&quot;Tags&quot;:&quot;Code Execution&quot;}]</p>
         */
        public Builder whitelist(String whitelist) {
            this.putQueryParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public ModifyCreateVulWhitelistRequest build() {
            return new ModifyCreateVulWhitelistRequest(this);
        } 

    } 

}
