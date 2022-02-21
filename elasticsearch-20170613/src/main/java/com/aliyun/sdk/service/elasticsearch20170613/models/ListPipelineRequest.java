// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineRequest</p>
 */
public class ListPipelineRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("page")
    @Validation(maximum = 200, minimum = 1)
    private Integer page;

    @Query
    @NameInMap("pipelineId")
    private String pipelineId;

    @Query
    @NameInMap("size")
    @Validation(maximum = 200, minimum = 1)
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

        private Builder(ListPipelineRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.page = response.page;
            this.pipelineId = response.pipelineId;
            this.size = response.size;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * pipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * size.
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
