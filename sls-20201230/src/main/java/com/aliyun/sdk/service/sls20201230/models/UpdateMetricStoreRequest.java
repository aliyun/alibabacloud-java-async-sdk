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
 * {@link UpdateMetricStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetricStoreRequest</p>
 */
public class UpdateMetricStoreRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoSplit")
    private Boolean autoSplit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxSplitShard")
    private Integer maxSplitShard;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ttl")
    private Integer ttl;

    private UpdateMetricStoreRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.name = builder.name;
        this.autoSplit = builder.autoSplit;
        this.maxSplitShard = builder.maxSplitShard;
        this.mode = builder.mode;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetricStoreRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return autoSplit
     */
    public Boolean getAutoSplit() {
        return this.autoSplit;
    }

    /**
     * @return maxSplitShard
     */
    public Integer getMaxSplitShard() {
        return this.maxSplitShard;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<UpdateMetricStoreRequest, Builder> {
        private String project; 
        private String name; 
        private Boolean autoSplit; 
        private Integer maxSplitShard; 
        private String mode; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetricStoreRequest request) {
            super(request);
            this.project = request.project;
            this.name = request.name;
            this.autoSplit = request.autoSplit;
            this.maxSplitShard = request.maxSplitShard;
            this.mode = request.mode;
            this.ttl = request.ttl;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the Metricstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_metric_store</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic sharding.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoSplit(Boolean autoSplit) {
            this.putBodyParameter("autoSplit", autoSplit);
            this.autoSplit = autoSplit;
            return this;
        }

        /**
         * <p>The maximum number of shards into which existing shards can be automatically split. This parameter is valid only when you set the autoSplit parameter to true.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        public Builder maxSplitShard(Integer maxSplitShard) {
            this.putBodyParameter("maxSplitShard", maxSplitShard);
            this.maxSplitShard = maxSplitShard;
            return this;
        }

        /**
         * <p>The type of the Metricstore.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder mode(String mode) {
            this.putBodyParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The retention period of the metric data. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder ttl(Integer ttl) {
            this.putBodyParameter("ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public UpdateMetricStoreRequest build() {
            return new UpdateMetricStoreRequest(this);
        } 

    } 

}
