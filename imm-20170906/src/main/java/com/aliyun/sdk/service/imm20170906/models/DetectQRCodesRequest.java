// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectQRCodesRequest} extends {@link RequestModel}
 *
 * <p>DetectQRCodesRequest</p>
 */
public class DetectQRCodesRequest extends Request {
    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SrcUris")
    @Validation(required = true)
    private String srcUris;

    private DetectQRCodesRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.srcUris = builder.srcUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectQRCodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return srcUris
     */
    public String getSrcUris() {
        return this.srcUris;
    }

    public static final class Builder extends Request.Builder<DetectQRCodesRequest, Builder> {
        private String project; 
        private String regionId; 
        private String srcUris; 

        private Builder() {
            super();
        } 

        private Builder(DetectQRCodesRequest response) {
            super(response);
            this.project = response.project;
            this.regionId = response.regionId;
            this.srcUris = response.srcUris;
        } 

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
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
         * SrcUris.
         */
        public Builder srcUris(String srcUris) {
            this.putQueryParameter("SrcUris", srcUris);
            this.srcUris = srcUris;
            return this;
        }

        @Override
        public DetectQRCodesRequest build() {
            return new DetectQRCodesRequest(this);
        } 

    } 

}
