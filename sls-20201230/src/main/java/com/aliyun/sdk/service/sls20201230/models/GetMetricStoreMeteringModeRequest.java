// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetMetricStoreMeteringModeRequest} extends {@link RequestModel}
 *
 * <p>GetMetricStoreMeteringModeRequest</p>
 */
public class GetMetricStoreMeteringModeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("metricStore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricStore;

    private GetMetricStoreMeteringModeRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.metricStore = builder.metricStore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetricStoreMeteringModeRequest create() {
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
     * @return metricStore
     */
    public String getMetricStore() {
        return this.metricStore;
    }

    public static final class Builder extends Request.Builder<GetMetricStoreMeteringModeRequest, Builder> {
        private String project; 
        private String metricStore; 

        private Builder() {
            super();
        } 

        private Builder(GetMetricStoreMeteringModeRequest request) {
            super(request);
            this.project = request.project;
            this.metricStore = request.metricStore;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>projectName</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>metricStore</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>metricStoreName</p>
         */
        public Builder metricStore(String metricStore) {
            this.putPathParameter("metricStore", metricStore);
            this.metricStore = metricStore;
            return this;
        }

        @Override
        public GetMetricStoreMeteringModeRequest build() {
            return new GetMetricStoreMeteringModeRequest(this);
        } 

    } 

}
