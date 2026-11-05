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
         * <p>A compatibility field. The current version does not read this parameter. The operation returns a fixed maximum of the first 100 templates.</p>
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
         * <p>The ID of the virtual node pool. This parameter is <strong>required</strong>. The node pool must belong to the current account. You can call <a href="~~ListWuyingServer~~">ListWuyingServer</a> to obtain the ID.</p>
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
