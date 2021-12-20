// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListChangeSetsRequest} extends {@link RequestModel}
 *
 * <p>ListChangeSetsRequest</p>
 */
public class ListChangeSetsRequest extends Request {
    @Query
    @NameInMap("ChangeSetId")
    private String changeSetId;

    @Query
    @NameInMap("ChangeSetName")
    private java.util.List < String > changeSetName;

    @Query
    @NameInMap("ExecutionStatus")
    private java.util.List < String > executionStatus;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StackId")
    private String stackId;

    @Query
    @NameInMap("Status")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String changeSetId; 
        private java.util.List < String > changeSetName; 
        private java.util.List < String > executionStatus; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String stackId; 
        private java.util.List < String > status; 

        /**
         * <p>ChangeSetId.</p>
         */
        public Builder changeSetId(String changeSetId) {
            this.putQueryParameter("ChangeSetId", changeSetId);
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * <p>ChangeSetName.</p>
         */
        public Builder changeSetName(java.util.List < String > changeSetName) {
            this.putQueryParameter("ChangeSetName", changeSetName);
            this.changeSetName = changeSetName;
            return this;
        }

        /**
         * <p>ExecutionStatus.</p>
         */
        public Builder executionStatus(java.util.List < String > executionStatus) {
            this.putQueryParameter("ExecutionStatus", executionStatus);
            this.executionStatus = executionStatus;
            return this;
        }

        /**
         * <p>PageNumber.</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>StackId.</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>Status.</p>
         */
        public Builder status(java.util.List < String > status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        public ListChangeSetsRequest build() {
            return new ListChangeSetsRequest(this);
        } 

    } 

}
