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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    @Body
    @NameInMap("TableGuid")
    @Validation(required = true)
    private String tableGuid;

    private GetMetaTableChangeLogRequest(Builder builder) {
        super(builder);
        this.changeType = builder.changeType;
        this.endDate = builder.endDate;
        this.objectType = builder.objectType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String changeType; 
        private String endDate; 
        private String objectType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String startDate; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaTableChangeLogRequest request) {
            super(request);
            this.changeType = request.changeType;
            this.endDate = request.endDate;
            this.objectType = request.objectType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.startDate = request.startDate;
            this.tableGuid = request.tableGuid;
        } 

        /**
         * ChangeType.
         */
        public Builder changeType(String changeType) {
            this.putBodyParameter("ChangeType", changeType);
            this.changeType = changeType;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
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
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * TableGuid.
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
