// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPublicModelEngineRequest} extends {@link RequestModel}
 *
 * <p>QueryPublicModelEngineRequest</p>
 */
public class QueryPublicModelEngineRequest extends Request {
    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    private QueryPublicModelEngineRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPublicModelEngineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<QueryPublicModelEngineRequest, Builder> {
        private String projectId; 
        private String regionId; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(QueryPublicModelEngineRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.text = request.text;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
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

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public QueryPublicModelEngineRequest build() {
            return new QueryPublicModelEngineRequest(this);
        } 

    } 

}
