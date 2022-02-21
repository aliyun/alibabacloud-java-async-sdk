// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountJobByConditionRequest} extends {@link RequestModel}
 *
 * <p>CountJobByConditionRequest</p>
 */
public class CountJobByConditionRequest extends Request {
    @Query
    @NameInMap("DestDbType")
    private String destDbType;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("JobType")
    private String jobType;

    @Query
    @NameInMap("Params")
    private String params;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SrcDbType")
    private String srcDbType;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Type")
    private String type;

    private CountJobByConditionRequest(Builder builder) {
        super(builder);
        this.destDbType = builder.destDbType;
        this.groupId = builder.groupId;
        this.jobType = builder.jobType;
        this.params = builder.params;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.srcDbType = builder.srcDbType;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountJobByConditionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destDbType
     */
    public String getDestDbType() {
        return this.destDbType;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return srcDbType
     */
    public String getSrcDbType() {
        return this.srcDbType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CountJobByConditionRequest, Builder> {
        private String destDbType; 
        private String groupId; 
        private String jobType; 
        private String params; 
        private String region; 
        private String regionId; 
        private String srcDbType; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CountJobByConditionRequest response) {
            super(response);
            this.destDbType = response.destDbType;
            this.groupId = response.groupId;
            this.jobType = response.jobType;
            this.params = response.params;
            this.region = response.region;
            this.regionId = response.regionId;
            this.srcDbType = response.srcDbType;
            this.status = response.status;
            this.type = response.type;
        } 

        /**
         * 目标端数据库类型
         */
        public Builder destDbType(String destDbType) {
            this.putQueryParameter("DestDbType", destDbType);
            this.destDbType = destDbType;
            return this;
        }

        /**
         * 父任务id
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * 查询的值，与Type对应
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
         * 源端数据库类型
         */
        public Builder srcDbType(String srcDbType) {
            this.putQueryParameter("SrcDbType", srcDbType);
            this.srcDbType = srcDbType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * 查询类型
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CountJobByConditionRequest build() {
            return new CountJobByConditionRequest(this);
        } 

    } 

}
