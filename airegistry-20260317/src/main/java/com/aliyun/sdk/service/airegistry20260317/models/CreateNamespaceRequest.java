// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link CreateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateNamespaceRequest</p>
 */
public class CreateNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanPolicy")
    private String scanPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private CreateNamespaceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.scanPolicy = builder.scanPolicy;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNamespaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scanPolicy
     */
    public String getScanPolicy() {
        return this.scanPolicy;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateNamespaceRequest, Builder> {
        private String description; 
        private String name; 
        private String scanPolicy; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateNamespaceRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.scanPolicy = request.scanPolicy;
            this.tags = request.tags;
        } 

        /**
         * <p>The workspace description.</p>
         * 
         * <strong>example:</strong>
         * <p>用于管理客服场景的Prompt</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>我的Prompt空间</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The scan policy.</p>
         * <p>This parameter contains two configuration items:</p>
         * <ul>
         * <li>minBlockRiskLevel: the risk level for blocking.<ul>
         * <li>high: blocks high-risk items.</li>
         * <li>medium: blocks medium-risk and high-risk items.</li>
         * <li>low: blocks all risk levels including high, medium, and low.</li>
         * </ul>
         * </li>
         * <li>maxSkipRatio: the max false positive rate. If the scan skip ratio exceeds this value, the scan is considered as failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;minBlockRiskLevel&quot;:&quot;medium&quot;,&quot;maxSkipRatio&quot;:0.2}</p>
         */
        public Builder scanPolicy(String scanPolicy) {
            this.putQueryParameter("ScanPolicy", scanPolicy);
            this.scanPolicy = scanPolicy;
            return this;
        }

        /**
         * <p>The tags. Separate multiple tags with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service,production</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateNamespaceRequest build() {
            return new CreateNamespaceRequest(this);
        } 

    } 

}
