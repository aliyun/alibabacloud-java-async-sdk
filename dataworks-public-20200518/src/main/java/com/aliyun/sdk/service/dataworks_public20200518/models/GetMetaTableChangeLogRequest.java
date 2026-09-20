// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetMetaTableChangeLogRequest} extends {@link RequestModel}
 *
 * <p>GetMetaTableChangeLogRequest</p>
 */
public class GetMetaTableChangeLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeType")
    private String changeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableGuid")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of change. Valid values: CREATE_TABLE, ALTER_TABLE, DROP_TABLE, ADD_PARTITION, and DROP_PARTITION.</p>
         * 
         * <strong>example:</strong>
         * <p>ALTER_TABLE</p>
         */
        public Builder changeType(String changeType) {
            this.putBodyParameter("ChangeType", changeType);
            this.changeType = changeType;
            return this;
        }

        /**
         * <p>The end date of the table change. Format: yyyy-MM-dd HH:mm:ss.</p>
         * <ul>
         * <li>If the date validation fails, the system uses the current time as the end date by default.</li>
         * <li>If both the start date and end date fail validation, the system automatically retrieves the table change records from the last 30 days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2020-06-02 00:00:00</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The type of the changed object. Valid values: TABLE and PARTITION.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>The page number. Used for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The start date of the table change. Format: yyyy-MM-dd HH:mm:ss.</p>
         * <ul>
         * <li>If the date validation fails, the system uses the current time as the start date by default.</li>
         * <li>If both the start date and end date fail validation, the system automatically retrieves the table change records from the last 30 days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2020-06-01 00:00:00</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The globally unique identifier (GUID) of the table. Format: odps.projectName.tableName. You can call <a href="https://help.aliyun.com/document_detail/2780086.html">GetMetaDBTableList</a> to obtain the GUID of the table.</p>
         * <blockquote>
         * <p>Currently, you can call <a href="https://help.aliyun.com/document_detail/2780094.html">GetMetaTableChangeLog</a> to retrieve the change log of only MaxCompute tables.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.engine_name.table_name</p>
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
