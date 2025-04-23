// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListNodesNoPagingRequest} extends {@link RequestModel}
 *
 * <p>ListNodesNoPagingRequest</p>
 */
public class ListNodesNoPagingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sequence")
    private String sequence;

    private ListNodesNoPagingRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.hostName = builder.hostName;
        this.role = builder.role;
        this.sequence = builder.sequence;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesNoPagingRequest create() {
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
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return sequence
     */
    public String getSequence() {
        return this.sequence;
    }

    public static final class Builder extends Request.Builder<ListNodesNoPagingRequest, Builder> {
        private String clusterId; 
        private String hostName; 
        private String role; 
        private String sequence; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesNoPagingRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.hostName = request.hostName;
            this.role = request.role;
            this.sequence = request.sequence;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the node. You can perform a fuzzy search. MySQL regular expressions are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Compute0</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The type of the node. Valid values:</p>
         * <ul>
         * <li>Manager: management node</li>
         * <li>Login: logon node</li>
         * <li>Compute: compute node</li>
         * </ul>
         * <p>Default value: Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>Compute</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>The sorting method of the node list. Valid values:</p>
         * <ul>
         * <li>Forward: sorts the nodes in chronological order.</li>
         * <li>Backward: sorts the nodes in reverse chronological order.</li>
         * </ul>
         * <p>Default value: Forward.</p>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        public Builder sequence(String sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        @Override
        public ListNodesNoPagingRequest build() {
            return new ListNodesNoPagingRequest(this);
        } 

    } 

}
