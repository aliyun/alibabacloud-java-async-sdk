// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListChangeSetsRequest} extends {@link RequestModel}
 *
 * <p>ListChangeSetsRequest</p>
 */
public class ListChangeSetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeSetId")
    private String changeSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeSetName")
    private java.util.List < String > changeSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionStatus")
    private java.util.List < String > executionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private java.util.List < String > status;

    private ListChangeSetsRequest(Builder builder) {
        super(builder);
        this.changeSetId = builder.changeSetId;
        this.changeSetName = builder.changeSetName;
        this.executionStatus = builder.executionStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChangeSetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeSetId
     */
    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * @return changeSetName
     */
    public java.util.List < String > getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * @return executionStatus
     */
    public java.util.List < String > getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListChangeSetsRequest, Builder> {
        private String changeSetId; 
        private java.util.List < String > changeSetName; 
        private java.util.List < String > executionStatus; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String stackId; 
        private java.util.List < String > status; 

        private Builder() {
            super();
        } 

        private Builder(ListChangeSetsRequest request) {
            super(request);
            this.changeSetId = request.changeSetId;
            this.changeSetName = request.changeSetName;
            this.executionStatus = request.executionStatus;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.stackId = request.stackId;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the change set. If detailed information about the change set is not required, you can use this parameter to replace the GetChangeSet operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1f6521a4-05af-4975-afe9-bc4b45ad****</p>
         */
        public Builder changeSetId(String changeSetId) {
            this.putQueryParameter("ChangeSetId", changeSetId);
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * <p>The name of change set N. Maximum value of N: 5. You can use an asterisk (*) as a wildcard for fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChangeSet</p>
         */
        public Builder changeSetName(java.util.List < String > changeSetName) {
            this.putQueryParameter("ChangeSetName", changeSetName);
            this.changeSetName = changeSetName;
            return this;
        }

        /**
         * <p>The execution status of change set N. Maximum value of N: 5. Valid values:</p>
         * <ul>
         * <li>UNAVAILABLE</li>
         * <li>AVAILABLE</li>
         * <li>EXECUTE_IN_PROGRESS</li>
         * <li>EXECUTE_COMPLETE</li>
         * <li>EXECUTE_FAILED</li>
         * <li>OBSOLETE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        public Builder executionStatus(java.util.List < String > executionStatus) {
            this.putQueryParameter("ExecutionStatus", executionStatus);
            this.executionStatus = executionStatus;
            return this;
        }

        /**
         * <p>The page number.<br>Pages start from page 1.<br>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.<br>Valid values: 1 to 50.<br>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the change set. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the stack.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The status of change set N. Maximum value of N: 5. Valid values:</p>
         * <ul>
         * <li>CREATE_PENDING</li>
         * <li>CREATE_IN_PROGRESS</li>
         * <li>CREATE_COMPLETE</li>
         * <li>CREATE_FAILED</li>
         * <li>DELETE_FAILED</li>
         * <li>DELETE_COMPLETE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATE_COMPLETE</p>
         */
        public Builder status(java.util.List < String > status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListChangeSetsRequest build() {
            return new ListChangeSetsRequest(this);
        } 

    } 

}
