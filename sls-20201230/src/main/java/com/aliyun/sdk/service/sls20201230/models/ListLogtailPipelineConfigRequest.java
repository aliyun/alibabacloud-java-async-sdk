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
 * {@link ListLogtailPipelineConfigRequest} extends {@link RequestModel}
 *
 * <p>ListLogtailPipelineConfigRequest</p>
 */
public class ListLogtailPipelineConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configName")
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("logstoreName")
    private String logstoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Long size;

    private ListLogtailPipelineConfigRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.configName = builder.configName;
        this.logstoreName = builder.logstoreName;
        this.offset = builder.offset;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogtailPipelineConfigRequest create() {
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
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListLogtailPipelineConfigRequest, Builder> {
        private String project; 
        private String configName; 
        private String logstoreName; 
        private Long offset; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListLogtailPipelineConfigRequest request) {
            super(request);
            this.project = request.project;
            this.configName = request.configName;
            this.logstoreName = request.logstoreName;
            this.offset = request.offset;
            this.size = request.size;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the Logtail pipeline configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>logtail-config-sample</p>
         */
        public Builder configName(String configName) {
            this.putQueryParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        public Builder logstoreName(String logstoreName) {
            this.putQueryParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * <p>The line from which the query starts.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>The number of Logtail pipeline configurations per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(Long size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListLogtailPipelineConfigRequest build() {
            return new ListLogtailPipelineConfigRequest(this);
        } 

    } 

}
