// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePreCheckStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribePreCheckStatusRequest</p>
 */
public class DescribePreCheckStatusRequest extends Request {
    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("JobCode")
    @Validation(required = true)
    private String jobCode;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNo")
    private String pageNo;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StructPhase")
    private String structPhase;

    @Query
    @NameInMap("StructType")
    private String structType;

    private DescribePreCheckStatusRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.jobCode = builder.jobCode;
        this.name = builder.name;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.structPhase = builder.structPhase;
        this.structType = builder.structType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePreCheckStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return jobCode
     */
    public String getJobCode() {
        return this.jobCode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return structPhase
     */
    public String getStructPhase() {
        return this.structPhase;
    }

    /**
     * @return structType
     */
    public String getStructType() {
        return this.structType;
    }

    public static final class Builder extends Request.Builder<DescribePreCheckStatusRequest, Builder> {
        private String dtsJobId; 
        private String jobCode; 
        private String name; 
        private String pageNo; 
        private String pageSize; 
        private String regionId; 
        private String structPhase; 
        private String structType; 

        private Builder() {
            super();
        } 

        private Builder(DescribePreCheckStatusRequest request) {
            super(request);
            this.dtsJobId = request.dtsJobId;
            this.jobCode = request.jobCode;
            this.name = request.name;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.structPhase = request.structPhase;
            this.structType = request.structType;
        } 

        /**
         * The ID of the data migration, data synchronization, or change tracking task.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The task code that specifies the type of the DTS subtask. Valid values:
         * <p>
         * 
         * *   **01**: precheck
         * *   **02**: schema migration or initial schema synchronization
         * *   **03**: full data migration or initial full data synchronization
         * *   **04**: incremental data migration or synchronization
         */
        public Builder jobCode(String jobCode) {
            this.putQueryParameter("JobCode", jobCode);
            this.jobCode = jobCode;
            return this;
        }

        /**
         * The filter item used to filter tables in fuzzy match.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of the page to return. The value must be an integer that is greater than **0** and does not exceed the maximum value of the Integer data type. Default value: **1**.
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The filter item used to filter tables, views, and functions during schema migration.
         */
        public Builder structPhase(String structPhase) {
            this.putQueryParameter("StructPhase", structPhase);
            this.structPhase = structPhase;
            return this;
        }

        /**
         * The type of schema definition. Valid values:
         * <p>
         * 
         * *   **before**: schema migration or initial schema synchronization
         * *   **after**: DDL operations performed during incremental data migration or synchronization
         */
        public Builder structType(String structType) {
            this.putQueryParameter("StructType", structType);
            this.structType = structType;
            return this;
        }

        @Override
        public DescribePreCheckStatusRequest build() {
            return new DescribePreCheckStatusRequest(this);
        } 

    } 

}
