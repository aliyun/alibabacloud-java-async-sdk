// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListWuyingServerWorkloadTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListWuyingServerWorkloadTemplateRequest</p>
 */
public class ListWuyingServerWorkloadTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualNodePoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualNodePoolId;

    private ListWuyingServerWorkloadTemplateRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.virtualNodePoolId = builder.virtualNodePoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWuyingServerWorkloadTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return virtualNodePoolId
     */
    public String getVirtualNodePoolId() {
        return this.virtualNodePoolId;
    }

    public static final class Builder extends Request.Builder<ListWuyingServerWorkloadTemplateRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String virtualNodePoolId; 

        private Builder() {
            super();
        } 

        private Builder(ListWuyingServerWorkloadTemplateRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.virtualNodePoolId = request.virtualNodePoolId;
        } 

        /**
         * <p>A compatibility field. The current version does not read this parameter. The operation returns a maximum of the first 100 templates.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A compatibility field. The current version does not read this parameter and does not support token-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>unused</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The virtual node pool ID. <strong>Required</strong>. The node pool must already exist and belong to the current account, but it is not required to be attached to a workstation.</p>
         * <p>If you already have a valid node pool ID, you can directly pass it. If a workstation is already associated with a node pool, you can also obtain the corresponding non-empty <code>VirtualNodePoolId</code> by invoking <a href="~~ListWuyingServer~~">ListWuyingServer</a>. If you do not have a valid ID, do not use an empty value, workstation ID, cluster ID, or the character string <code>null</code> as a substitute.</p>
         * <p><a href="~~CreateWuyingServer~~">CreateWuyingServer</a> only associates existing node pools and does not support automatic creation of node pools. If the node pool does not exist or does not belong to the current account, <code>InvalidParameter.VirtualNodePoolId</code> is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vnp-bp1234567890abcde</p>
         */
        public Builder virtualNodePoolId(String virtualNodePoolId) {
            this.putQueryParameter("VirtualNodePoolId", virtualNodePoolId);
            this.virtualNodePoolId = virtualNodePoolId;
            return this;
        }

        @Override
        public ListWuyingServerWorkloadTemplateRequest build() {
            return new ListWuyingServerWorkloadTemplateRequest(this);
        } 

    } 

}
