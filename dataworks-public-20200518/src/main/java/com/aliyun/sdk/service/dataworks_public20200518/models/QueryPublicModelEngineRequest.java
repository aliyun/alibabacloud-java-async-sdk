// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPublicModelEngineRequest} extends {@link RequestModel}
 *
 * <p>QueryPublicModelEngineRequest</p>
 */
public class QueryPublicModelEngineRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    private QueryPublicModelEngineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<QueryPublicModelEngineRequest, Builder> {
        private String regionId; 
        private String projectId; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(QueryPublicModelEngineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
            this.text = request.text;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
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
