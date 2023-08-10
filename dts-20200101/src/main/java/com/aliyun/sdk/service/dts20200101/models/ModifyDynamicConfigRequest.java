// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDynamicConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyDynamicConfigRequest</p>
 */
public class ModifyDynamicConfigRequest extends Request {
    @Query
    @NameInMap("ConfigList")
    private String configList;

    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("EnableLimit")
    private Boolean enableLimit;

    @Query
    @NameInMap("JobCode")
    @Validation(required = true)
    private String jobCode;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ModifyDynamicConfigRequest(Builder builder) {
        super(builder);
        this.configList = builder.configList;
        this.dtsJobId = builder.dtsJobId;
        this.enableLimit = builder.enableLimit;
        this.jobCode = builder.jobCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDynamicConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configList
     */
    public String getConfigList() {
        return this.configList;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return enableLimit
     */
    public Boolean getEnableLimit() {
        return this.enableLimit;
    }

    /**
     * @return jobCode
     */
    public String getJobCode() {
        return this.jobCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDynamicConfigRequest, Builder> {
        private String configList; 
        private String dtsJobId; 
        private Boolean enableLimit; 
        private String jobCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDynamicConfigRequest request) {
            super(request);
            this.configList = request.configList;
            this.dtsJobId = request.dtsJobId;
            this.enableLimit = request.enableLimit;
            this.jobCode = request.jobCode;
            this.regionId = request.regionId;
        } 

        /**
         * ConfigList.
         */
        public Builder configList(String configList) {
            this.putQueryParameter("ConfigList", configList);
            this.configList = configList;
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
         * EnableLimit.
         */
        public Builder enableLimit(Boolean enableLimit) {
            this.putQueryParameter("EnableLimit", enableLimit);
            this.enableLimit = enableLimit;
            return this;
        }

        /**
         * JobCode.
         */
        public Builder jobCode(String jobCode) {
            this.putQueryParameter("JobCode", jobCode);
            this.jobCode = jobCode;
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

        @Override
        public ModifyDynamicConfigRequest build() {
            return new ModifyDynamicConfigRequest(this);
        } 

    } 

}
