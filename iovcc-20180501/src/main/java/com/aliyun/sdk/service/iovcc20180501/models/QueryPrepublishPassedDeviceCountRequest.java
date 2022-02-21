// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPrepublishPassedDeviceCountRequest} extends {@link RequestModel}
 *
 * <p>QueryPrepublishPassedDeviceCountRequest</p>
 */
public class QueryPrepublishPassedDeviceCountRequest extends Request {
    @Query
    @NameInMap("PrepublishId")
    @Validation(required = true)
    private String prepublishId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private QueryPrepublishPassedDeviceCountRequest(Builder builder) {
        super(builder);
        this.prepublishId = builder.prepublishId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPrepublishPassedDeviceCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prepublishId
     */
    public String getPrepublishId() {
        return this.prepublishId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<QueryPrepublishPassedDeviceCountRequest, Builder> {
        private String prepublishId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryPrepublishPassedDeviceCountRequest response) {
            super(response);
            this.prepublishId = response.prepublishId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * PrepublishId.
         */
        public Builder prepublishId(String prepublishId) {
            this.putQueryParameter("PrepublishId", prepublishId);
            this.prepublishId = prepublishId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
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
        public QueryPrepublishPassedDeviceCountRequest build() {
            return new QueryPrepublishPassedDeviceCountRequest(this);
        } 

    } 

}
