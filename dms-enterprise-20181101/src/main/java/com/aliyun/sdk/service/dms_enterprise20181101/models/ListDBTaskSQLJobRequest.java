// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDBTaskSQLJobRequest} extends {@link RequestModel}
 *
 * <p>ListDBTaskSQLJobRequest</p>
 */
public class ListDBTaskSQLJobRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DBTaskGroupId")
    @Validation(required = true, minimum = 1)
    private Long DBTaskGroupId;

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

    private ListDBTaskSQLJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DBTaskGroupId = builder.DBTaskGroupId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDBTaskSQLJobRequest create() {
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
     * @return DBTaskGroupId
     */
    public Long getDBTaskGroupId() {
        return this.DBTaskGroupId;
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

    public static final class Builder extends Request.Builder<ListDBTaskSQLJobRequest, Builder> {
        private String regionId; 
        private Long DBTaskGroupId; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListDBTaskSQLJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DBTaskGroupId = request.DBTaskGroupId;
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
         * DBTaskGroupId.
         */
        public Builder DBTaskGroupId(Long DBTaskGroupId) {
            this.putQueryParameter("DBTaskGroupId", DBTaskGroupId);
            this.DBTaskGroupId = DBTaskGroupId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListDBTaskSQLJobRequest build() {
            return new ListDBTaskSQLJobRequest(this);
        } 

    } 

}
