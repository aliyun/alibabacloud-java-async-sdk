// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link CreateTempFileRequest} extends {@link RequestModel}
 *
 * <p>CreateTempFileRequest</p>
 */
public class CreateTempFileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Capacity")
    private Long capacity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CreateTempFileRequest(Builder builder) {
        super(builder);
        this.capacity = builder.capacity;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.prefix = builder.prefix;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTempFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacity
     */
    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<CreateTempFileRequest, Builder> {
        private Long capacity; 
        private String instanceId; 
        private String name; 
        private String prefix; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTempFileRequest request) {
            super(request);
            this.capacity = request.capacity;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.prefix = request.prefix;
            this.taskId = request.taskId;
        } 

        /**
         * Capacity.
         */
        public Builder capacity(Long capacity) {
            this.putBodyParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.putBodyParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public CreateTempFileRequest build() {
            return new CreateTempFileRequest(this);
        } 

    } 

}
