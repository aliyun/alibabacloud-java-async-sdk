// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeNodePoolVulsRequest} extends {@link RequestModel}
 *
 * <p>DescribeNodePoolVulsRequest</p>
 */
public class DescribeNodePoolVulsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nodepool_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodepoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("necessity")
    private String necessity;

    private DescribeNodePoolVulsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.necessity = builder.necessity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodePoolVulsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return necessity
     */
    public String getNecessity() {
        return this.necessity;
    }

    public static final class Builder extends Request.Builder<DescribeNodePoolVulsRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private String necessity; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNodePoolVulsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.necessity = request.necessity;
        } 

        /**
         * <p>Cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c17e742cee942410486f237293d66****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Node pool ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np38f32fdbc60e4a1e957ffde77846****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p>The priority to fix the vulnerability. Separate multiple priorities with commas (,). Valid values:</p>
         * <ul>
         * <li><code>asap</code>: high</li>
         * <li><code>later</code>: medium</li>
         * <li><code>nntf</code>: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asap</p>
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        @Override
        public DescribeNodePoolVulsRequest build() {
            return new DescribeNodePoolVulsRequest(this);
        } 

    } 

}
