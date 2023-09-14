// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDoctorHiveTableRequest} extends {@link RequestModel}
 *
 * <p>GetDoctorHiveTableRequest</p>
 */
public class GetDoctorHiveTableRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DateTime")
    @Validation(required = true)
    private String dateTime;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TableName")
    @Validation(required = true)
    private String tableName;

    private GetDoctorHiveTableRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dateTime = builder.dateTime;
        this.regionId = builder.regionId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorHiveTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dateTime
     */
    public String getDateTime() {
        return this.dateTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<GetDoctorHiveTableRequest, Builder> {
        private String clusterId; 
        private String dateTime; 
        private String regionId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(GetDoctorHiveTableRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dateTime = request.dateTime;
            this.regionId = request.regionId;
            this.tableName = request.tableName;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DateTime.
         */
        public Builder dateTime(String dateTime) {
            this.putQueryParameter("DateTime", dateTime);
            this.dateTime = dateTime;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public GetDoctorHiveTableRequest build() {
            return new GetDoctorHiveTableRequest(this);
        } 

    } 

}
