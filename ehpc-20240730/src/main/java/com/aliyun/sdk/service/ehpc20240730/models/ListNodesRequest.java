// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListNodesRequest} extends {@link RequestModel}
 *
 * <p>ListNodesRequest</p>
 */
public class ListNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hostnames")
    private java.util.List < String > hostnames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private java.util.List < String > privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueNames")
    private java.util.List < String > queueNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sequence")
    private String sequence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private java.util.List < String > status;

    private ListNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.hostnames = builder.hostnames;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.privateIpAddress = builder.privateIpAddress;
        this.queueNames = builder.queueNames;
        this.sequence = builder.sequence;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
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
     * @return hostnames
     */
    public java.util.List < String > getHostnames() {
        return this.hostnames;
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
    public java.util.List < String > getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return queueNames
     */
    public java.util.List < String > getQueueNames() {
        return this.queueNames;
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

    /**
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListNodesRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > hostnames; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < String > privateIpAddress; 
        private java.util.List < String > queueNames; 
        private String sequence; 
        private String sortBy; 
        private java.util.List < String > status; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.hostnames = request.hostnames;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.privateIpAddress = request.privateIpAddress;
            this.queueNames = request.queueNames;
            this.sequence = request.sequence;
            this.sortBy = request.sortBy;
            this.status = request.status;
        } 

        /**
         * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
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
         * <p>The hostnames of the compute nodes that you want to query.</p>
         */
        public Builder hostnames(java.util.List < String > hostnames) {
            String hostnamesShrink = shrink(hostnames, "Hostnames", "json");
            this.putQueryParameter("Hostnames", hostnamesShrink);
            this.hostnames = hostnames;
            return this;
        }

        /**
         * <p>The page number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The IP addresses of the compute nodes that you want to query.</p>
         */
        public Builder privateIpAddress(java.util.List < String > privateIpAddress) {
            String privateIpAddressShrink = shrink(privateIpAddress, "PrivateIpAddress", "json");
            this.putQueryParameter("PrivateIpAddress", privateIpAddressShrink);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The queues to which the nodes belong.</p>
         */
        public Builder queueNames(java.util.List < String > queueNames) {
            String queueNamesShrink = shrink(queueNames, "QueueNames", "json");
            this.putQueryParameter("QueueNames", queueNamesShrink);
            this.queueNames = queueNames;
            return this;
        }

        /**
         * <p>Specifies whether the results are sorted in ascending or descending order. Valid values: forward (ascending) and backward (descending).</p>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        public Builder sequence(String sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>The sorting method of the node list. Valid values: addedtime: sorted by the time when the node was added. hostname: sorted by hostname. Default value: addedtime.</p>
         * 
         * <strong>example:</strong>
         * <p>AddedTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The states of the compute nodes to be queried.</p>
         */
        public Builder status(java.util.List < String > status) {
            String statusShrink = shrink(status, "Status", "json");
            this.putQueryParameter("Status", statusShrink);
            this.status = status;
            return this;
        }

        @Override
        public ListNodesRequest build() {
            return new ListNodesRequest(this);
        } 

    } 

}
