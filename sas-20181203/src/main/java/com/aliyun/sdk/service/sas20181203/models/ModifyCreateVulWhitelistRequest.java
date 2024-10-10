// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInfo")
    private String targetInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    @com.aliyun.core.annotation.Validation(required = true)
    private String whitelist;

    private ModifyCreateVulWhitelistRequest(Builder builder) {
        super(builder);
        this.reason = builder.reason;
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
     * @return reason
     */
    public String getReason() {
        return this.reason;
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
        private String reason; 
        private String targetInfo; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCreateVulWhitelistRequest request) {
            super(request);
            this.reason = request.reason;
            this.targetInfo = request.targetInfo;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The reason why you add the vulnerability to the whitelist.</p>
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
         * <p>The applicable scope of the whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>type</strong>: the type of the applicable scope. Valid values:</p>
         * <ul>
         * <li><strong>GroupId</strong>: the ID of a server group</li>
         * <li><strong>Uuid</strong>: the UUID of a server</li>
         * </ul>
         * </li>
         * <li><p><strong>uuids</strong>: the UUIDs of servers</p>
         * </li>
         * <li><p><strong>groupIds</strong>: the IDs of server groups</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> If you leave this parameter empty, all servers are added to the whitelist. If you set the <strong>type</strong> field to <strong>GroupId</strong>, you must also specify the <strong>groupIds</strong> field. If you set <strong>type</strong> to <strong>Uuid</strong>, you must specify the <strong>uuids</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;GroupId&quot;,&quot;uuids&quot;:[],&quot;groupIds&quot;:[10782678]}</p>
         */
        public Builder targetInfo(String targetInfo) {
            this.putQueryParameter("TargetInfo", targetInfo);
            this.targetInfo = targetInfo;
            return this;
        }

        /**
         * <p>The information about the vulnerability that you want to add to the whitelist. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><p><strong>Status</strong>: the status of the vulnerability.</p>
         * </li>
         * <li><p><strong>GmtLast</strong>: the timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
         * </li>
         * <li><p><strong>LaterCount</strong>: the number of vulnerabilities that have the medium priority.</p>
         * </li>
         * <li><p><strong>AsapCount</strong>: the number of vulnerabilities that have the high priority.</p>
         * </li>
         * <li><p><strong>Name</strong>: the name of the vulnerability.</p>
         * </li>
         * <li><p><strong>Type</strong>: the type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>app</strong>: application vulnerability</li>
         * <li><strong>emg</strong>: urgent vulnerability</li>
         * </ul>
         * </li>
         * <li><p><strong>Related</strong>: the Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.</p>
         * </li>
         * <li><p><strong>HandledCount</strong>: the number of handled vulnerabilities.</p>
         * </li>
         * <li><p><strong>AliasName</strong>: the alias of the vulnerability.</p>
         * </li>
         * <li><p><strong>RuleModifyTime</strong>: the time when the vulnerability was last disclosed.</p>
         * </li>
         * <li><p><strong>NntfCount</strong>: the number of vulnerabilities that have the low priority.</p>
         * </li>
         * <li><p><strong>TotalFixCount</strong>: the total number of fixed vulnerabilities.</p>
         * </li>
         * <li><p><strong>Tags</strong>: the tag that is added to the vulnerability.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeGroupedVul~~">DescribeGroupedVul</a> operation to query the information about the vulnerability that you want to add to the whitelist.</p>
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
