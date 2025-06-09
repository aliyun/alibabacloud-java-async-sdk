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
 * {@link ListIngestProcessorsRequest} extends {@link RequestModel}
 *
 * <p>ListIngestProcessorsRequest</p>
 */
public class ListIngestProcessorsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Integer offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("processorName")
    private String processorName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    private ListIngestProcessorsRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.displayName = builder.displayName;
        this.offset = builder.offset;
        this.processorName = builder.processorName;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIngestProcessorsRequest create() {
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
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return processorName
     */
    public String getProcessorName() {
        return this.processorName;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListIngestProcessorsRequest, Builder> {
        private String project; 
        private String displayName; 
        private Integer offset; 
        private String processorName; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListIngestProcessorsRequest request) {
            super(request);
            this.project = request.project;
            this.displayName = request.displayName;
            this.offset = request.offset;
            this.processorName = request.processorName;
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
         * <p>The display name of the ingest processor.</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The offset. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>The identifier of the ingest processor.</p>
         * 
         * <strong>example:</strong>
         * <p>parse-nginx-log</p>
         */
        public Builder processorName(String processorName) {
            this.putQueryParameter("processorName", processorName);
            this.processorName = processorName;
            return this;
        }

        /**
         * <p>The number of entries. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListIngestProcessorsRequest build() {
            return new ListIngestProcessorsRequest(this);
        } 

    } 

}
