// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeNetworkPeerConnectionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkPeerConnectionsRequest</p>
 */
public class DescribeNetworkPeerConnectionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkIds")
    private java.util.List<String> networkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    private DescribeNetworkPeerConnectionsRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.networkIds = builder.networkIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkPeerConnectionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkIds
     */
    public java.util.List<String> getNetworkIds() {
        return this.networkIds;
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

    public static final class Builder extends Request.Builder<DescribeNetworkPeerConnectionsRequest, Builder> {
        private String ensRegionId; 
        private String instanceId; 
        private String name; 
        private java.util.List<String> networkIds; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkPeerConnectionsRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.networkIds = request.networkIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The ID of the ENS node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-xian-unicom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The ID of the network peer connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pcc-5inkeimcipxk26yqtzm4q****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the network peer connection.</p>
         * 
         * <strong>example:</strong>
         * <p>test0</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The IDs of the networks involved in the connection. The query does not distinguish between the requester and accepter.</p>
         */
        public Builder networkIds(java.util.List<String> networkIds) {
            this.putQueryParameter("NetworkIds", networkIds);
            this.networkIds = networkIds;
            return this;
        }

        /**
         * <p>The page number for the returned results. Default: <strong>1</strong>.</p>
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
         * <p>The number of entries to return on each page. Default: <strong>10</strong>. Valid values: <strong>10</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeNetworkPeerConnectionsRequest build() {
            return new DescribeNetworkPeerConnectionsRequest(this);
        } 

    } 

}
