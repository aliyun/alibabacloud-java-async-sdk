// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpLogRequest} extends {@link RequestModel}
 *
 * <p>GetOpLogRequest</p>
 */
public class GetOpLogRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Module")
    private String module;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private GetOpLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.module = builder.module;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpLogRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetOpLogRequest, Builder> {
        private String regionId; 
        private String endTime; 
        private String module; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startTime; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetOpLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.module = request.module;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
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
         * The end of the time range to query. Specify the time in the yyyy-MM-DD HH:mm:ss format.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The functional module for which you want to query operation logs. If you do not specify this parameter, operation logs for all functional modules are returned. Valid values:
         * <p>
         * 
         * *   **PERMISSION**: permissions
         * *   **OWNER**: data owner
         * *   **SQL_CONSOLE**: data query
         * *   **SQL\_CONSOLE\_EXPORT**: query result export
         * *   **DATA_CHANGE**: data change
         * *   **DATA_EXPORT**: data export
         * *   **SQL_REVIEW**: SQL review
         * *   **DT_SYNC**: database and table synchronization
         * *   **DT_DETAIL**: database and table details
         * *   **DB_TASK**: task management
         * *   **INSTANCE_MANAGE**: instance management
         * *   **USER_MANAGE**: user management
         * *   **SECURITY_RULE**: security rule
         * *   **CONFIG_MANAGE**: configuration management
         * *   **RESOURCE_AUTH**: resource authorization
         * *   **ACCESS\_WHITE\_IP**: access IP address allowlist
         */
        public Builder module(String module) {
            this.putQueryParameter("Module", module);
            this.module = module;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values:
         * <p>
         * 
         * *   30
         * *   50
         * *   100
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the yyyy-MM-DD HH:mm:ss format.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetOpLogRequest build() {
            return new GetOpLogRequest(this);
        } 

    } 

}
