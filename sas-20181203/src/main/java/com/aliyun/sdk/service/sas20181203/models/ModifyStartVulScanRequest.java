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
 * {@link ModifyStartVulScanRequest} extends {@link RequestModel}
 *
 * <p>ModifyStartVulScanRequest</p>
 */
public class ModifyStartVulScanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private String types;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private ModifyStartVulScanRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.types = builder.types;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStartVulScanRequest create() {
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
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ModifyStartVulScanRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private Long resourceDirectoryAccountId; 
        private String types; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStartVulScanRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.types = request.types;
            this.uuids = request.uuids;
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
         * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
         * <ul>
         * <li>true: performs a dry run only. The system checks the request but does not perform the actual operation.</li>
         * <li>false: performs the request.
         * Default value: false.</li>
         * </ul>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the main account of the member accounts in the resource folder.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>Settings for the vulnerability types to be detected by the quick scan feature. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability.</li>
         * <li><strong>sys</strong>: Windows system vulnerability.</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
         * <li><strong>app</strong>: Application vulnerabilities detected by web scanners.</li>
         * <li><strong>emg</strong>: Emergency vulnerabilities.</li>
         * <li><strong>image</strong>: Container image vulnerabilities.</li>
         * <li><strong>sca</strong>: Application vulnerabilities detected by software constituency parsing.<blockquote>
         * <p>If this parameter is left empty, all vulnerability types are detected.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;cve,sys,cms,app,emg&quot;</p>
         */
        public Builder types(String types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        /**
         * <p>The list of server UUIDs. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/421726.html">DescribeCloudCenterInstances</a> operation to obtain the UUIDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1587bedb-fdb4-48c4-9330-****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ModifyStartVulScanRequest build() {
            return new ModifyStartVulScanRequest(this);
        } 

    } 

}
