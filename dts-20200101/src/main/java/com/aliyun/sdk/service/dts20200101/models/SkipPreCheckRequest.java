// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SkipPreCheckRequest} extends {@link RequestModel}
 *
 * <p>SkipPreCheckRequest</p>
 */
public class SkipPreCheckRequest extends Request {
    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Skip")
    @Validation(required = true)
    private Boolean skip;

    @Query
    @NameInMap("SkipPreCheckItems")
    private String skipPreCheckItems;

    @Query
    @NameInMap("SkipPreCheckNames")
    private String skipPreCheckNames;

    private SkipPreCheckRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.jobId = builder.jobId;
        this.regionId = builder.regionId;
        this.skip = builder.skip;
        this.skipPreCheckItems = builder.skipPreCheckItems;
        this.skipPreCheckNames = builder.skipPreCheckNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkipPreCheckRequest create() {
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return skip
     */
    public Boolean getSkip() {
        return this.skip;
    }

    /**
     * @return skipPreCheckItems
     */
    public String getSkipPreCheckItems() {
        return this.skipPreCheckItems;
    }

    /**
     * @return skipPreCheckNames
     */
    public String getSkipPreCheckNames() {
        return this.skipPreCheckNames;
    }

    public static final class Builder extends Request.Builder<SkipPreCheckRequest, Builder> {
        private String dtsJobId; 
        private String jobId; 
        private String regionId; 
        private Boolean skip; 
        private String skipPreCheckItems; 
        private String skipPreCheckNames; 

        private Builder() {
            super();
        } 

        private Builder(SkipPreCheckRequest response) {
            super(response);
            this.dtsJobId = response.dtsJobId;
            this.jobId = response.jobId;
            this.regionId = response.regionId;
            this.skip = response.skip;
            this.skipPreCheckItems = response.skipPreCheckItems;
            this.skipPreCheckNames = response.skipPreCheckNames;
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
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
         * Skip.
         */
        public Builder skip(Boolean skip) {
            this.putQueryParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * SkipPreCheckItems.
         */
        public Builder skipPreCheckItems(String skipPreCheckItems) {
            this.putQueryParameter("SkipPreCheckItems", skipPreCheckItems);
            this.skipPreCheckItems = skipPreCheckItems;
            return this;
        }

        /**
         * SkipPreCheckNames.
         */
        public Builder skipPreCheckNames(String skipPreCheckNames) {
            this.putQueryParameter("SkipPreCheckNames", skipPreCheckNames);
            this.skipPreCheckNames = skipPreCheckNames;
            return this;
        }

        @Override
        public SkipPreCheckRequest build() {
            return new SkipPreCheckRequest(this);
        } 

    } 

}
