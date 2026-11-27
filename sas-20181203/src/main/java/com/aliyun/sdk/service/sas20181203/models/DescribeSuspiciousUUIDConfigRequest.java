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
 * {@link DescribeSuspiciousUUIDConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspiciousUUIDConfigRequest</p>
 */
public class DescribeSuspiciousUUIDConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeSuspiciousUUIDConfigRequest(Builder builder) {
        super(builder);
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspiciousUUIDConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeSuspiciousUUIDConfigRequest, Builder> {
        private Long resourceDirectoryAccountId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspiciousUUIDConfigRequest request) {
            super(request);
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the member accounts in the resource folder (Alibaba Cloud account). You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1766185894104675</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The type of proactive defense to query. Valid values:</p>
         * <ul>
         * <li><strong>auto_breaking</strong>: anti-virus</li>
         * <li><strong>ransomware_breaking</strong>: anti-ransomware (bait capture)</li>
         * <li><strong>webshell_cloud_breaking</strong>: web shell connection defense</li>
         * <li><strong>alinet</strong>: malicious network behavior defense</li>
         * <li><strong>alisecguard</strong>: client self-protection</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alinet</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeSuspiciousUUIDConfigRequest build() {
            return new DescribeSuspiciousUUIDConfigRequest(this);
        } 

    } 

}
