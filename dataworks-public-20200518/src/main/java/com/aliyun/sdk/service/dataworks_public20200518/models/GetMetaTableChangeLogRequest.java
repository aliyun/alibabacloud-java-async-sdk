// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableChangeLogRequest} extends {@link RequestModel}
 *
 * <p>GetMetaTableChangeLogRequest</p>
 */
public class GetMetaTableChangeLogRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("ChangeType")
    private String changeType;

    @Body
    @NameInMap("EndDate")
    private String endDate;

    @Body
    @NameInMap("ObjectType")
    private String objectType;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    @Body
    @NameInMap("TableGuid")
    @Validation(required = true)
    private String tableGuid;

    private GetMetaTableChangeLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.changeType = builder.changeType;
        this.endDate = builder.endDate;
        this.objectType = builder.objectType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.tableGuid = builder.tableGuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableChangeLogRequest create() {
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
     * @return changeType
     */
    public String getChangeType() {
        return this.changeType;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    public static final class Builder extends Request.Builder<GetMetaTableChangeLogRequest, Builder> {
        private String regionId; 
        private String changeType; 
        private String endDate; 
        private String objectType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startDate; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaTableChangeLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.changeType = request.changeType;
            this.endDate = request.endDate;
            this.objectType = request.objectType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
            this.tableGuid = request.tableGuid;
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
         * The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.
         * <p>
         * 
         * *   By default, the system uses the current time as the value of this parameter if the time that you specify is invalid.
         * *   If both the values of the StartDate and EndDate parameters are invalid, the system automatically queries the change logs that are generated within the last 30 days.
         */
        public Builder changeType(String changeType) {
            this.putBodyParameter("ChangeType", changeType);
            this.changeType = changeType;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.
         * <p>
         * 
         * *   By default, the system uses the current time as the value of this parameter if the time that you specify is invalid.
         * *   If both the values of the StartDate and EndDate parameters are invalid, the system automatically queries the change logs that are generated within the last 30 days.
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * The globally unique identifier (GUID) of the table. Specify the GUID in the format of odps.projectName.tableName. You can call the [GetMetaDBTableList](~~173916~~) operation to query the GUID of the table.
         * <p>
         * 
         * >  To query the change logs of a MaxCompute table, you must call the [GetMetaTableChangeLog](~~173925~~) operation.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The type of the change. Valid values: CREATE_TABLE, ALTER_TABLE, DROP_TABLE, ADD_PARTITION, and DROP_PARTITION.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * The entity on which the change is made. Valid values: TABLE and PARTITION.
         */
        public Builder tableGuid(String tableGuid) {
            this.putBodyParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        @Override
        public GetMetaTableChangeLogRequest build() {
            return new GetMetaTableChangeLogRequest(this);
        } 

    } 

}
