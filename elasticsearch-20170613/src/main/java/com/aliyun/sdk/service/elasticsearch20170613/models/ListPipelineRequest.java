// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPipelineRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineRequest</p>
 */
public class ListPipelineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer size;

    private ListPipelineRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.pipelineId = builder.pipelineId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListPipelineRequest, Builder> {
        private String instanceId; 
        private Integer page; 
        private String pipelineId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelineRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.page = request.page;
            this.pipelineId = request.pipelineId;
            this.size = request.size;
        } 

        /**
         * <p>The Logstash instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-oew1qbgl****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number of the current page in a paged query. Valid values: 1 to 200. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The pipeline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline_test</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>The number of pipelines per page in a paged query. Valid values: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListPipelineRequest build() {
            return new ListPipelineRequest(this);
        } 

    } 

}
