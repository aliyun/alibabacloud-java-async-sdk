// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShardTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeShardTaskInfoRequest</p>
 */
public class DescribeShardTaskInfoRequest extends Request {
    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceTableName")
    @Validation(required = true)
    private String sourceTableName;

    @Query
    @NameInMap("TargetTableName")
    @Validation(required = true, maxLength = 100, minLength = 1)
    private String targetTableName;

    private DescribeShardTaskInfoRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.regionId = builder.regionId;
        this.sourceTableName = builder.sourceTableName;
        this.targetTableName = builder.targetTableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShardTaskInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceTableName
     */
    public String getSourceTableName() {
        return this.sourceTableName;
    }

    /**
     * @return targetTableName
     */
    public String getTargetTableName() {
        return this.targetTableName;
    }

    public static final class Builder extends Request.Builder<DescribeShardTaskInfoRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String regionId; 
        private String sourceTableName; 
        private String targetTableName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeShardTaskInfoRequest response) {
            super(response);
            this.dbName = response.dbName;
            this.drdsInstanceId = response.drdsInstanceId;
            this.regionId = response.regionId;
            this.sourceTableName = response.sourceTableName;
            this.targetTableName = response.targetTableName;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SourceTableName.
         */
        public Builder sourceTableName(String sourceTableName) {
            this.putQueryParameter("SourceTableName", sourceTableName);
            this.sourceTableName = sourceTableName;
            return this;
        }

        /**
         * TargetTableName.
         */
        public Builder targetTableName(String targetTableName) {
            this.putQueryParameter("TargetTableName", targetTableName);
            this.targetTableName = targetTableName;
            return this;
        }

        @Override
        public DescribeShardTaskInfoRequest build() {
            return new DescribeShardTaskInfoRequest(this);
        } 

    } 

}
