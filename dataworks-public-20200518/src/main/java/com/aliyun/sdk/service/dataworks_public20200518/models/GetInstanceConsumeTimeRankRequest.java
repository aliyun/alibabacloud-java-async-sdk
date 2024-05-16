// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceConsumeTimeRankRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceConsumeTimeRankRequest</p>
 */
public class GetInstanceConsumeTimeRankRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizdate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99999999999D, minimum = 2)
    private Long projectId;

    private GetInstanceConsumeTimeRankRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizdate = builder.bizdate;
        this.projectId = builder.projectId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<GetInstanceConsumeTimeRankRequest, Builder> {
        private String regionId; 
        private String bizdate; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceConsumeTimeRankRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizdate = request.bizdate;
            this.projectId = request.projectId;
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

        @Override
        public GetInstanceConsumeTimeRankRequest build() {
            return new GetInstanceConsumeTimeRankRequest(this);
        } 

    } 

}
