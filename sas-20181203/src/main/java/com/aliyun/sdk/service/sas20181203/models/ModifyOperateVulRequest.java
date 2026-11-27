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
 * {@link ModifyOperateVulRequest} extends {@link RequestModel}
 *
 * <p>ModifyOperateVulRequest</p>
 */
public class ModifyOperateVulRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Info")
    @com.aliyun.core.annotation.Validation(required = true)
    private String info;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ModifyOperateVulRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.from = builder.from;
        this.info = builder.info;
        this.operateType = builder.operateType;
        this.reason = builder.reason;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOperateVulRequest create() {
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
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return info
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyOperateVulRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String from; 
        private String info; 
        private String operateType; 
        private String reason; 
        private Long resourceDirectoryAccountId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOperateVulRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.from = request.from;
            this.info = request.info;
            this.operateType = request.operateType;
            this.reason = request.reason;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.type = request.type;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You must use different tokens for different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li>true: Prechecks the request without performing the actual operation.</li>
         * <li>false: Performs the actual operation.</li>
         * </ul>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The source identifier of the request. The value is fixed as <strong>sas</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The information about the vulnerabilities to be processed. This parameter is in JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>name</strong>: The name of the vulnerability.</li>
         * <li><strong>uuid</strong>: The UUID of the server where the vulnerability exists.</li>
         * <li><strong>tag</strong>: The tag of the vulnerability. Valid values:<ul>
         * <li><strong>oval</strong>: Linux software vulnerability</li>
         * <li><strong>system</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For other vulnerability types, you can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to obtain the vulnerability information.</p>
         * </blockquote>
         * <ul>
         * <li><strong>isFront</strong>: Specifies whether the Windows patch is a prerequisite patch. This parameter is required only when you process Windows system vulnerabilities. You can ignore this parameter when you process other types of vulnerabilities. Valid values:<ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can process multiple vulnerabilities at a time. Separate multiple vulnerability information entries with commas (,). You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to obtain the vulnerability information.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;alilinux2:2.1903:ALINUX2-SA-2022:0007&quot;,&quot;uuid&quot;:&quot;a3bb82a8-a3bd-4546-acce-45ac34af****&quot;,&quot;tag&quot;:&quot;oval&quot;,&quot;isFront&quot;:0},{&quot;name&quot;:&quot;alilinux2:2.1903:ALINUX2-SA-2022:0007&quot;,&quot;uuid&quot;:&quot;98a6fecc-88cd-46f2-8e35-f808a388****&quot;,&quot;tag&quot;:&quot;oval&quot;,&quot;isFront&quot;:0}]</p>
         */
        public Builder info(String info) {
            this.putQueryParameter("Info", info);
            this.info = info;
            return this;
        }

        /**
         * <p>The processing method for the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>vul_fix</strong>: Fixes the vulnerability.</li>
         * <li><strong>vul_verify</strong>: Verifies the vulnerability.</li>
         * <li><strong>vul_ignore</strong>: Ignores the vulnerability.</li>
         * <li><strong>vul_undo_ignore</strong>: Cancels ignoring the vulnerability.</li>
         * <li><strong>vul_delete</strong>: Deletes the vulnerability.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vul_fix</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>The reason for ignoring the vulnerability.</p>
         * <blockquote>
         * <p>This parameter is required only when the processing method is <strong>ignore</strong> (that is, <strong>OperateType</strong> is set to <strong>vul_ignore</strong>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>not operate</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the member accounts in the resource folder belong.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>&quot;1234567890123456&quot;</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The type of the vulnerability to be processed. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>emg</strong>: Emergency vulnerability</li>
         * <li><strong>app</strong>: Application vulnerability</li>
         * <li><strong>sca</strong>: Software constituency parsing vulnerability</li>
         * </ul>
         * <blockquote>
         * <p>You cannot execute vulnerability fix operations for emergency vulnerabilities (emg), application vulnerabilities (app), and software constituency parsing vulnerabilities (sca).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyOperateVulRequest build() {
            return new ModifyOperateVulRequest(this);
        } 

    } 

}
