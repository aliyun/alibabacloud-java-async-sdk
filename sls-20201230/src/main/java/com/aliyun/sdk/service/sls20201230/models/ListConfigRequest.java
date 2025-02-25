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
 * {@link ListConfigRequest} extends {@link RequestModel}
 *
 * <p>ListConfigRequest</p>
 */
public class ListConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configName")
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("logstoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long size;

    private ListConfigRequest(Builder builder) {
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

    public static ListConfigRequest create() {
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

    public static final class Builder extends Request.Builder<ListConfigRequest, Builder> {
        private String project; 
        private String configName; 
        private String logstoreName; 
        private Long offset; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListConfigRequest request) {
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
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the Logtail configuration, which is used for fuzzy match.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-logstore</p>
         */
        public Builder logstoreName(String logstoreName) {
            this.putQueryParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * <p>The line from which the query starts. Default value: 0.</p>
         * <p>This parameter is required.</p>
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
         * <p>The number of entries per page. Maximum value: 500.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Long size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListConfigRequest build() {
            return new ListConfigRequest(this);
        } 

    } 

}
