// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFlowControlTaskItemsRequest} extends {@link RequestModel}
 *
 * <p>ListFlowControlTaskItemsRequest</p>
 */
public class ListFlowControlTaskItemsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    private ListFlowControlTaskItemsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowControlTaskItemsRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListFlowControlTaskItemsRequest, Builder> {
        private String instanceId; 
        private String taskId; 
        private Integer page; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowControlTaskItemsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.taskId = request.taskId;
            this.page = request.page;
            this.size = request.size;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
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
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListFlowControlTaskItemsRequest build() {
            return new ListFlowControlTaskItemsRequest(this);
        } 

    } 

}
