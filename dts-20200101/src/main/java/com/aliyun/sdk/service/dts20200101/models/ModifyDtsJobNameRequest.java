// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDtsJobNameRequest} extends {@link RequestModel}
 *
 * <p>ModifyDtsJobNameRequest</p>
 */
public class ModifyDtsJobNameRequest extends Request {
    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("DtsJobName")
    private String dtsJobName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ModifyDtsJobNameRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.dtsJobName = builder.dtsJobName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDtsJobNameRequest create() {
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
     * @return dtsJobName
     */
    public String getDtsJobName() {
        return this.dtsJobName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDtsJobNameRequest, Builder> {
        private String dtsJobId; 
        private String dtsJobName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDtsJobNameRequest response) {
            super(response);
            this.dtsJobId = response.dtsJobId;
            this.dtsJobName = response.dtsJobName;
            this.regionId = response.regionId;
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
         * DtsJobName.
         */
        public Builder dtsJobName(String dtsJobName) {
            this.putQueryParameter("DtsJobName", dtsJobName);
            this.dtsJobName = dtsJobName;
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
        public ModifyDtsJobNameRequest build() {
            return new ModifyDtsJobNameRequest(this);
        } 

    } 

}
