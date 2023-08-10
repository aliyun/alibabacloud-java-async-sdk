// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCheckReportUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataCheckReportUrlRequest</p>
 */
public class DescribeDataCheckReportUrlRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CheckType")
    @Validation(required = true)
    private Integer checkType;

    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("TbName")
    @Validation(required = true)
    private String tbName;

    private DescribeDataCheckReportUrlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkType = builder.checkType;
        this.dbName = builder.dbName;
        this.dtsJobId = builder.dtsJobId;
        this.tbName = builder.tbName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataCheckReportUrlRequest create() {
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
     * @return checkType
     */
    public Integer getCheckType() {
        return this.checkType;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return tbName
     */
    public String getTbName() {
        return this.tbName;
    }

    public static final class Builder extends Request.Builder<DescribeDataCheckReportUrlRequest, Builder> {
        private String regionId; 
        private Integer checkType; 
        private String dbName; 
        private String dtsJobId; 
        private String tbName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataCheckReportUrlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkType = request.checkType;
            this.dbName = request.dbName;
            this.dtsJobId = request.dtsJobId;
            this.tbName = request.tbName;
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
         * CheckType.
         */
        public Builder checkType(Integer checkType) {
            this.putQueryParameter("CheckType", checkType);
            this.checkType = checkType;
            return this;
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
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * TbName.
         */
        public Builder tbName(String tbName) {
            this.putQueryParameter("TbName", tbName);
            this.tbName = tbName;
            return this;
        }

        @Override
        public DescribeDataCheckReportUrlRequest build() {
            return new DescribeDataCheckReportUrlRequest(this);
        } 

    } 

}
