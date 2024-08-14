// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceStatusCountRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceStatusCountRequest</p>
 */
public class GetInstanceStatusCountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long projectId;

    private GetInstanceStatusCountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizDate = builder.bizDate;
        this.projectEnv = builder.projectEnv;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceStatusCountRequest create() {
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
     * @return bizDate
     */
    public String getBizDate() {
        return this.bizDate;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetInstanceStatusCountRequest, Builder> {
        private String regionId; 
        private String bizDate; 
        private String projectEnv; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceStatusCountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizDate = request.bizDate;
            this.projectEnv = request.projectEnv;
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
         * The data timestamp of instances.
         */
        public Builder bizDate(String bizDate) {
            this.putBodyParameter("BizDate", bizDate);
            this.bizDate = bizDate;
            return this;
        }

        /**
         * The runtime environment. Valid values: PROD and DEV.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * The workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetInstanceStatusCountRequest build() {
            return new GetInstanceStatusCountRequest(this);
        } 

    } 

}
