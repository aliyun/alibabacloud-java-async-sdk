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
 * {@link ListConsumeProcessorsRequest} extends {@link RequestModel}
 *
 * <p>ListConsumeProcessorsRequest</p>
 */
public class ListConsumeProcessorsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private String offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("processorName")
    private String processorName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private String size;

    private ListConsumeProcessorsRequest(Builder builder) {
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

    public static ListConsumeProcessorsRequest create() {
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
    public String getOffset() {
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
    public String getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListConsumeProcessorsRequest, Builder> {
        private String project; 
        private String displayName; 
        private String offset; 
        private String processorName; 
        private String size; 

        private Builder() {
            super();
        } 

        private Builder(ListConsumeProcessorsRequest request) {
            super(request);
            this.project = request.project;
            this.displayName = request.displayName;
            this.offset = request.offset;
            this.processorName = request.processorName;
            this.size = request.size;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The display name of the consumption processor.</p>
         * 
         * <strong>example:</strong>
         * <p>filter-get-request</p>
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
        public Builder offset(String offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>The identifier of the consumption processor.</p>
         * 
         * <strong>example:</strong>
         * <p>consume-processor-1</p>
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
         * <p>100</p>
         */
        public Builder size(String size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListConsumeProcessorsRequest build() {
            return new ListConsumeProcessorsRequest(this);
        } 

    } 

}
