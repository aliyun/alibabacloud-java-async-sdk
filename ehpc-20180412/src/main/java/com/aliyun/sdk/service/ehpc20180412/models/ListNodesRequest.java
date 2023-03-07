// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesRequest} extends {@link RequestModel}
 *
 * <p>ListNodesRequest</p>
 */
public class ListNodesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("HostNamePrefix")
    private String hostNamePrefix;

    @Query
    @NameInMap("HostNameSuffix")
    private String hostNameSuffix;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("Role")
    private String role;

    @Query
    @NameInMap("Sequence")
    private String sequence;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    private ListNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.filter = builder.filter;
        this.hostName = builder.hostName;
        this.hostNamePrefix = builder.hostNamePrefix;
        this.hostNameSuffix = builder.hostNameSuffix;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.privateIpAddress = builder.privateIpAddress;
        this.role = builder.role;
        this.sequence = builder.sequence;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesRequest create() {
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
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return hostNamePrefix
     */
    public String getHostNamePrefix() {
        return this.hostNamePrefix;
    }

    /**
     * @return hostNameSuffix
     */
    public String getHostNameSuffix() {
        return this.hostNameSuffix;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
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

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<ListNodesRequest, Builder> {
        private String clusterId; 
        private String filter; 
        private String hostName; 
        private String hostNamePrefix; 
        private String hostNameSuffix; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String privateIpAddress; 
        private String role; 
        private String sequence; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.filter = request.filter;
            this.hostName = request.hostName;
            this.hostNamePrefix = request.hostNamePrefix;
            this.hostNameSuffix = request.hostNameSuffix;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.privateIpAddress = request.privateIpAddress;
            this.role = request.role;
            this.sequence = request.sequence;
            this.sortBy = request.sortBy;
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
         * The filter options of the node list.
         * <p>
         * 
         * Format: {"status":"node_status"}. Replace node_status with the node status. Valid values of node_status:
         * 
         * *   uninit: The node is being installed.
         * *   exception: An exception has occurred on the node.
         * *   running: The node is running.
         * *   initing: The node is being initialized.
         * *   releasing: The node is being released.
         * *   untracking: The node is not added to the cluster.
         * *   stopped: The node is stopped.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
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
         * The prefix of the hostname. You can query nodes that have a specified prefix.
         */
        public Builder hostNamePrefix(String hostNamePrefix) {
            this.putQueryParameter("HostNamePrefix", hostNamePrefix);
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }

        /**
         * The suffix of the hostname. You can query nodes that have a specified suffix.
         */
        public Builder hostNameSuffix(String hostNameSuffix) {
            this.putQueryParameter("HostNameSuffix", hostNameSuffix);
            this.hostNameSuffix = hostNameSuffix;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The private IP address of the node.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The type of the node. Valid values:
         * <p>
         * 
         * *   Manager: management node
         * *   Login: logon node
         * *   Compute: compute node
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
         * Default value: Forward
         * 
         * >  Sequence is used in combination with SortBy. If SortBy is set to AddedTime and Sequence is set to Forward, nodes are sorted by the time that they were added in chronological order.
         */
        public Builder sequence(String sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * The sorting method of the node list. Valid values:
         * <p>
         * 
         * *   AddedTime: sorts the nodes by the time that they were added.
         * *   HostName: sorts the nodes by their host names.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public ListNodesRequest build() {
            return new ListNodesRequest(this);
        } 

    } 

}
