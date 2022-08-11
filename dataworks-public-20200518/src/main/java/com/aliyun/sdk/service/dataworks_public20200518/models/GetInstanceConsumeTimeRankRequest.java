// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceConsumeTimeRankRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceConsumeTimeRankRequest</p>
 */
public class GetInstanceConsumeTimeRankRequest extends Request {
    @Body
    @NameInMap("Bizdate")
    @Validation(required = true)
    private String bizdate;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 99999999999D, minimum = 2)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetInstanceConsumeTimeRankRequest(Builder builder) {
        super(builder);
        this.bizdate = builder.bizdate;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceConsumeTimeRankRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizdate
     */
    public String getBizdate() {
        return this.bizdate;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetInstanceConsumeTimeRankRequest, Builder> {
        private String bizdate; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceConsumeTimeRankRequest request) {
            super(request);
            this.bizdate = request.bizdate;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * Bizdate.
         */
        public Builder bizdate(String bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
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

        @Override
        public GetInstanceConsumeTimeRankRequest build() {
            return new GetInstanceConsumeTimeRankRequest(this);
        } 

    } 

}
