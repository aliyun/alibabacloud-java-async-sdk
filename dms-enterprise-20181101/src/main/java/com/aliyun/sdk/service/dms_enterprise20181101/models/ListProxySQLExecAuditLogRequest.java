// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProxySQLExecAuditLogRequest} extends {@link RequestModel}
 *
 * <p>ListProxySQLExecAuditLogRequest</p>
 */
public class ListProxySQLExecAuditLogRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("ExecState")
    private String execState;

    @Query
    @NameInMap("OpUserName")
    private String opUserName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SQLType")
    private String SQLType;

    @Query
    @NameInMap("SearchName")
    private String searchName;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private ListProxySQLExecAuditLogRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.execState = builder.execState;
        this.opUserName = builder.opUserName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.SQLType = builder.SQLType;
        this.searchName = builder.searchName;
        this.startTime = builder.startTime;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProxySQLExecAuditLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return execState
     */
    public String getExecState() {
        return this.execState;
    }

    /**
     * @return opUserName
     */
    public String getOpUserName() {
        return this.opUserName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return SQLType
     */
    public String getSQLType() {
        return this.SQLType;
    }

    /**
     * @return searchName
     */
    public String getSearchName() {
        return this.searchName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListProxySQLExecAuditLogRequest, Builder> {
        private Long endTime; 
        private String execState; 
        private String opUserName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String SQLType; 
        private String searchName; 
        private Long startTime; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListProxySQLExecAuditLogRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.execState = response.execState;
            this.opUserName = response.opUserName;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.SQLType = response.SQLType;
            this.searchName = response.searchName;
            this.startTime = response.startTime;
            this.tid = response.tid;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExecState.
         */
        public Builder execState(String execState) {
            this.putQueryParameter("ExecState", execState);
            this.execState = execState;
            return this;
        }

        /**
         * OpUserName.
         */
        public Builder opUserName(String opUserName) {
            this.putQueryParameter("OpUserName", opUserName);
            this.opUserName = opUserName;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
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
         * SQLType.
         */
        public Builder SQLType(String SQLType) {
            this.putQueryParameter("SQLType", SQLType);
            this.SQLType = SQLType;
            return this;
        }

        /**
         * SearchName.
         */
        public Builder searchName(String searchName) {
            this.putQueryParameter("SearchName", searchName);
            this.searchName = searchName;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
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
        public ListProxySQLExecAuditLogRequest build() {
            return new ListProxySQLExecAuditLogRequest(this);
        } 

    } 

}
