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
 * {@link UpdateMetricStoreMeteringModeRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetricStoreMeteringModeRequest</p>
 */
public class UpdateMetricStoreMeteringModeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("metricStore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricStore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("meteringMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String meteringMode;

    private UpdateMetricStoreMeteringModeRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.metricStore = builder.metricStore;
        this.meteringMode = builder.meteringMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetricStoreMeteringModeRequest create() {
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

    /**
     * @return meteringMode
     */
    public String getMeteringMode() {
        return this.meteringMode;
    }

    public static final class Builder extends Request.Builder<UpdateMetricStoreMeteringModeRequest, Builder> {
        private String project; 
        private String metricStore; 
        private String meteringMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetricStoreMeteringModeRequest request) {
            super(request);
            this.project = request.project;
            this.metricStore = request.metricStore;
            this.meteringMode = request.meteringMode;
        } 

        /**
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ChargeByFunction</p>
         */
        public Builder meteringMode(String meteringMode) {
            this.putBodyParameter("meteringMode", meteringMode);
            this.meteringMode = meteringMode;
            return this;
        }

        @Override
        public UpdateMetricStoreMeteringModeRequest build() {
            return new UpdateMetricStoreMeteringModeRequest(this);
        } 

    } 

}
