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
    @Validation(required = true)
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

        private Builder(ModifyDtsJobNameRequest request) {
            super(request);
            this.dtsJobId = request.dtsJobId;
            this.dtsJobName = request.dtsJobName;
            this.regionId = request.regionId;
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
         * The new name of the DTS task.
         * <p>
         * 
         * >  We recommend that you specify a descriptive name for easy identification. You do not need to use a unique name.
         */
        public Builder dtsJobName(String dtsJobName) {
            this.putQueryParameter("DtsJobName", dtsJobName);
            this.dtsJobName = dtsJobName;
            return this;
        }

        /**
         * The ID of the region in which the DTS instance resides. For more information, see [List of supported regions](~~141033~~).
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
