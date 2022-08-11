// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDagRequest} extends {@link RequestModel}
 *
 * <p>GetDagRequest</p>
 */
public class GetDagRequest extends Request {
    @Body
    @NameInMap("DagId")
    @Validation(required = true, minimum = 2)
    private Long dagId;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetDagRequest(Builder builder) {
        super(builder);
        this.dagId = builder.dagId;
        this.projectEnv = builder.projectEnv;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDagRequest, Builder> {
        private Long dagId; 
        private String projectEnv; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDagRequest request) {
            super(request);
            this.dagId = request.dagId;
            this.projectEnv = request.projectEnv;
            this.regionId = request.regionId;
        } 

        /**
         * DagId.
         */
        public Builder dagId(Long dagId) {
            this.putBodyParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * ProjectEnv.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
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
        public GetDagRequest build() {
            return new GetDagRequest(this);
        } 

    } 

}
