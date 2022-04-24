// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserOmsDataRequest} extends {@link RequestModel}
 *
 * <p>QueryUserOmsDataRequest</p>
 */
public class QueryUserOmsDataRequest extends Request {
    @Query
    @NameInMap("DataType")
    @Validation(required = true)
    private String dataType;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Marker")
    private String marker;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("Table")
    @Validation(required = true)
    private String table;

    private QueryUserOmsDataRequest(Builder builder) {
        super(builder);
        this.dataType = builder.dataType;
        this.endTime = builder.endTime;
        this.marker = builder.marker;
        this.ownerId = builder.ownerId;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserOmsDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    public static final class Builder extends Request.Builder<QueryUserOmsDataRequest, Builder> {
        private String dataType; 
        private String endTime; 
        private String marker; 
        private Long ownerId; 
        private Integer pageSize; 
        private String startTime; 
        private String table; 

        private Builder() {
            super();
        } 

        private Builder(QueryUserOmsDataRequest request) {
            super(request);
            this.dataType = request.dataType;
            this.endTime = request.endTime;
            this.marker = request.marker;
            this.ownerId = request.ownerId;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.table = request.table;
        } 

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Table.
         */
        public Builder table(String table) {
            this.putQueryParameter("Table", table);
            this.table = table;
            return this;
        }

        @Override
        public QueryUserOmsDataRequest build() {
            return new QueryUserOmsDataRequest(this);
        } 

    } 

}
