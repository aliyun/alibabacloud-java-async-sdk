// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListConfigRequest} extends {@link RequestModel}
 *
 * <p>ListConfigRequest</p>
 */
public class ListConfigRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("configName")
    private String configName;

    @Query
    @NameInMap("logstoreName")
    @Validation(required = true)
    private String logstoreName;

    @Query
    @NameInMap("offset")
    @Validation(required = true)
    private Long offset;

    @Query
    @NameInMap("size")
    @Validation(required = true)
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
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The name of the Logtail configuration.
         */
        public Builder configName(String configName) {
            this.putQueryParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * The name of the Logstore.
         */
        public Builder logstoreName(String logstoreName) {
            this.putQueryParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * The line from which the query starts. Default value: 0.
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 500.
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
