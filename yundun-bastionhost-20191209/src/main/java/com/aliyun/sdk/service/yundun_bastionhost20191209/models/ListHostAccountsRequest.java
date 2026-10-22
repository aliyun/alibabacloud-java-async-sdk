// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListHostAccountsRequest} extends {@link RequestModel}
 *
 * <p>ListHostAccountsRequest</p>
 */
public class ListHostAccountsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostAccountName")
    private String hostAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hostId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostIds")
    private String hostIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolName")
    private String protocolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListHostAccountsRequest(Builder builder) {
        super(builder);
        this.hostAccountName = builder.hostAccountName;
        this.hostId = builder.hostId;
        this.hostIds = builder.hostIds;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.protocolName = builder.protocolName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostAccountsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAccountName
     */
    public String getHostAccountName() {
        return this.hostAccountName;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return hostIds
     */
    public String getHostIds() {
        return this.hostIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return protocolName
     */
    public String getProtocolName() {
        return this.protocolName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListHostAccountsRequest, Builder> {
        private String hostAccountName; 
        private String hostId; 
        private String hostIds; 
        private String instanceId; 
        private String pageNumber; 
        private String pageSize; 
        private Long projectId; 
        private String protocolName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListHostAccountsRequest request) {
            super(request);
            this.hostAccountName = request.hostAccountName;
            this.hostId = request.hostId;
            this.hostIds = request.hostIds;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.protocolName = request.protocolName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the host account to query. The name can be up to 128 characters in length. Only exact match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder hostAccountName(String hostAccountName) {
            this.putQueryParameter("HostAccountName", hostAccountName);
            this.hostAccountName = hostAccountName;
            return this;
        }

        /**
         * <p>The ID of the host whose accounts you want to query. You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to query the host ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hostId(String hostId) {
            this.putQueryParameter("HostId", hostId);
            this.hostId = hostId;
            return this;
        }

        /**
         * <p>The array of host IDs whose accounts you want to query. &gt; If the HostId parameter is specified and its value is not 0, this parameter is ignored. This parameter takes effect only when the value of the HostId parameter is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;2&quot;,&quot;3&quot;]</p>
         */
        public Builder hostIds(String hostIds) {
            this.putQueryParameter("HostIds", hostIds);
            this.hostIds = hostIds;
            return this;
        }

        /**
         * <p>The ID of the Bastionhost instance to which the host belongs. You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number of the current page in a paging query. Default value: <strong>1</strong>.</p>
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
         * <p>The maximum number of entries to return on each page in a paging query. <br>The maximum value of the PageSize parameter is 100. Default value: 20. If you leave this parameter empty, 20 entries are returned by default. &gt; Specify a value for the PageSize parameter.</p>
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
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The protocol name of the host account to query. <br>Valid values:</p>
         * <ul>
         * <li>SSH</li>
         * <li>RDP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SSH</p>
         */
        public Builder protocolName(String protocolName) {
            this.putQueryParameter("ProtocolName", protocolName);
            this.protocolName = protocolName;
            return this;
        }

        /**
         * <p>The region ID of the Bastionhost instance to which the host belongs. For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListHostAccountsRequest build() {
            return new ListHostAccountsRequest(this);
        } 

    } 

}
