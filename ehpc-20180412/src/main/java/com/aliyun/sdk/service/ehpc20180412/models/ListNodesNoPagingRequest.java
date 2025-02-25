// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesNoPagingRequest} extends {@link RequestModel}
 *
 * <p>ListNodesNoPagingRequest</p>
 */
public class ListNodesNoPagingRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("Role")
    private String role;

    @Query
    @NameInMap("Sequence")
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
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the node. You can perform a fuzzy search. MySQL regular expressions are supported.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * The type of the node. Valid values:
         * <p>
         * 
         * *   Manager: management node
         * *   Login: logon node
         * *   Compute: compute node
         * 
         * Default value: Compute.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * The sorting method of the node list. Valid values:
         * <p>
         * 
         * *   Forward: sorts the nodes in chronological order.
         * *   Backward: sorts the nodes in reverse chronological order.
         * 
         * Default value: Forward.
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
