// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDBTaskSQLJobDetailRequest} extends {@link RequestModel}
 *
 * <p>ListDBTaskSQLJobDetailRequest</p>
 */
public class ListDBTaskSQLJobDetailRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true, minimum = 1)
    private Long jobId;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private ListDBTaskSQLJobDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobId = builder.jobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDBTaskSQLJobDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListDBTaskSQLJobDetailRequest, Builder> {
        private String regionId; 
        private Long jobId; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListDBTaskSQLJobDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobId = request.jobId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of times that the SQL statement was executed.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The status of the SQL task. Valid values:
         * <p>
         * 
         * *   **INIT**: The SQL task was initialized.
         * *   **PENDING**: The SQL task waited to be run.
         * *   **BE_SCHEDULED**: The SQL task waited to be scheduled.
         * *   **FAIL**: The SQL task failed.
         * *   **SUCCESS**: The SQL task was successful.
         * *   **PAUSE**: The SQL task was paused.
         * *   **DELETE**: The SQL task was deleted.
         * *   **RUNNING**: The SQL task was being run.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The error code that is returned.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the physical database.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListDBTaskSQLJobDetailRequest build() {
            return new ListDBTaskSQLJobDetailRequest(this);
        } 

    } 

}
