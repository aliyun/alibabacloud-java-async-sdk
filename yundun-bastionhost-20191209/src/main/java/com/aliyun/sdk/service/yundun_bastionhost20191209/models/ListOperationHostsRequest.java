// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOperationHostsRequest} extends {@link RequestModel}
 *
 * <p>ListOperationHostsRequest</p>
 */
public class ListOperationHostsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostAddress")
    private String hostAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSType")
    private String OSType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceState")
    private String sourceInstanceState;

    private ListOperationHostsRequest(Builder builder) {
        super(builder);
        this.hostAddress = builder.hostAddress;
        this.hostName = builder.hostName;
        this.instanceId = builder.instanceId;
        this.OSType = builder.OSType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.source = builder.source;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.sourceInstanceState = builder.sourceInstanceState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationHostsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAddress
     */
    public String getHostAddress() {
        return this.hostAddress;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return OSType
     */
    public String getOSType() {
        return this.OSType;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return sourceInstanceState
     */
    public String getSourceInstanceState() {
        return this.sourceInstanceState;
    }

    public static final class Builder extends Request.Builder<ListOperationHostsRequest, Builder> {
        private String hostAddress; 
        private String hostName; 
        private String instanceId; 
        private String OSType; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String source; 
        private String sourceInstanceId; 
        private String sourceInstanceState; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationHostsRequest request) {
            super(request);
            this.hostAddress = request.hostAddress;
            this.hostName = request.hostName;
            this.instanceId = request.instanceId;
            this.OSType = request.OSType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.source = request.source;
            this.sourceInstanceId = request.sourceInstanceId;
            this.sourceInstanceState = request.sourceInstanceState;
        } 

        /**
         * <p>The address of the host that you want to query. You can set this parameter to a domain name or an IP address. Only exact match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10.162.172.132</p>
         */
        public Builder hostAddress(String hostAddress) {
            this.putQueryParameter("HostAddress", hostAddress);
            this.hostAddress = hostAddress;
            return this;
        }

        /**
         * <p>The name of the host that you want to query. Only exact match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The ID of the bastion host.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-09k22avmw0q</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The operating system of the host that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>Linux</strong></li>
         * <li><strong>Windows</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.<br>Maximum value: 100. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The source of the host that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>Local</strong></li>
         * <li><strong>Ecs</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Local</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance. Exact match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp19ienyt0yax748****</p>
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * <p>The status of the host that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>Release</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder sourceInstanceState(String sourceInstanceState) {
            this.putQueryParameter("SourceInstanceState", sourceInstanceState);
            this.sourceInstanceState = sourceInstanceState;
            return this;
        }

        @Override
        public ListOperationHostsRequest build() {
            return new ListOperationHostsRequest(this);
        } 

    } 

}
