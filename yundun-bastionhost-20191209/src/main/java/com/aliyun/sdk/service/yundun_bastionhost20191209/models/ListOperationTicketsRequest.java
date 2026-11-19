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
 * {@link ListOperationTicketsRequest} extends {@link RequestModel}
 *
 * <p>ListOperationTicketsRequest</p>
 */
public class ListOperationTicketsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
    private Integer approvalStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetAddress")
    private String assetAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationTicketId")
    private String operationTicketId;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListOperationTicketsRequest(Builder builder) {
        super(builder);
        this.approvalStatus = builder.approvalStatus;
        this.assetAddress = builder.assetAddress;
        this.instanceId = builder.instanceId;
        this.operationTicketId = builder.operationTicketId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationTicketsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvalStatus
     */
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return assetAddress
     */
    public String getAssetAddress() {
        return this.assetAddress;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operationTicketId
     */
    public String getOperationTicketId() {
        return this.operationTicketId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListOperationTicketsRequest, Builder> {
        private Integer approvalStatus; 
        private String assetAddress; 
        private String instanceId; 
        private String operationTicketId; 
        private String pageNumber; 
        private String pageSize; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationTicketsRequest request) {
            super(request);
            this.approvalStatus = request.approvalStatus;
            this.assetAddress = request.assetAddress;
            this.instanceId = request.instanceId;
            this.operationTicketId = request.operationTicketId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The status of the O&amp;M ticket. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Pending approval.</p>
         * </li>
         * <li><p><strong>2</strong>: Approved.</p>
         * <blockquote>
         * <p>If this parameter is not specified, the default value is 1, and only tickets pending approval are queried.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder approvalStatus(Integer approvalStatus) {
            this.putQueryParameter("ApprovalStatus", approvalStatus);
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * <p>The address of the O&amp;M asset for exact search.</p>
         * 
         * <strong>example:</strong>
         * <p>10.167.XX.XX</p>
         */
        public Builder assetAddress(String assetAddress) {
            this.putQueryParameter("AssetAddress", assetAddress);
            this.assetAddress = assetAddress;
            return this;
        }

        /**
         * <p>The instance ID of the Bastionhost.</p>
         * <blockquote>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the parameter value.</p>
         * </blockquote>
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
         * <p>The ID of the O&amp;M ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder operationTicketId(String operationTicketId) {
            this.putQueryParameter("OperationTicketId", operationTicketId);
            this.operationTicketId = operationTicketId;
            return this;
        }

        /**
         * <p>The page number of the page to return in a paged query. Default value: <strong>1</strong>.</p>
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
         * <p>The maximum number of entries to return on each page in a paged query.<br>Maximum value of PageSize: 1000. Default value: 20. If PageSize is left empty, 20 entries are returned by default.</p>
         * <blockquote>
         * <p>Specify a value for PageSize.</p>
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
         * <p>The region ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>For the mappings between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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

        @Override
        public ListOperationTicketsRequest build() {
            return new ListOperationTicketsRequest(this);
        } 

    } 

}
