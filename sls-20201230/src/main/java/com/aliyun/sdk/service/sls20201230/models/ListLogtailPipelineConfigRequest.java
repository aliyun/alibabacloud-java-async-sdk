// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListLogtailPipelineConfigRequest} extends {@link RequestModel}
 *
 * <p>ListLogtailPipelineConfigRequest</p>
 */
public class ListLogtailPipelineConfigRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("configName")
    private String configName;

    @Query
    @NameInMap("logstore")
    private String logstore;

    @Query
    @NameInMap("offset")
    private Long offset;

    @Query
    @NameInMap("size")
    @Validation(maximum = 500)
    private Long size;

    private ListLogtailPipelineConfigRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.configName = builder.configName;
        this.logstore = builder.logstore;
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
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
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
        private String logstore; 
        private Long offset; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListLogtailPipelineConfigRequest request) {
            super(request);
            this.project = request.project;
            this.configName = request.configName;
            this.logstore = request.logstore;
            this.offset = request.offset;
            this.size = request.size;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * configName.
         */
        public Builder configName(String configName) {
            this.putQueryParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.putQueryParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * size.
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
