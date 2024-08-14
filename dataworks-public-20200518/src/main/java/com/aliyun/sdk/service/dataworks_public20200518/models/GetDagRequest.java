// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDagRequest} extends {@link RequestModel}
 *
 * <p>GetDagRequest</p>
 */
public class GetDagRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 2)
    private Long dagId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    private GetDagRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.projectEnv = builder.projectEnv;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<GetDagRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(GetDagRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.projectEnv = request.projectEnv;
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
         * The ID of the DAG. You can use one of the following method to obtain the ID:
         * <p>
         * 
         * *   Call the [RunCycleDagNodes](~~2780209~~) operation and obtain the value of the **Data** response parameter.
         * *   Call the [RunSmokeTest](~~2780210~~) operation and obtain the value of the **Data** response parameter.
         * *   Call the [RunManualDagNodes](~~2780218~~) operation and obtain the value of the **DagId** response parameter.
         */
        public Builder dagId(Long dagId) {
            this.putBodyParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The environment of the workspace. Valid values: PROD and DEV.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        @Override
        public GetDagRequest build() {
            return new GetDagRequest(this);
        } 

    } 

}
