// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20260101.models;

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
 * {@link SubmitTuringTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitTuringTaskRequest</p>
 */
public class SubmitTuringTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("duration")
    private Integer duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("idempotentKey")
    private String idempotentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imgUrl")
    private String imgUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resolution")
    private String resolution;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskType")
    private String taskType;

    private SubmitTuringTaskRequest(Builder builder) {
        super(builder);
        this.duration = builder.duration;
        this.idempotentKey = builder.idempotentKey;
        this.imgUrl = builder.imgUrl;
        this.resolution = builder.resolution;
        this.resourceType = builder.resourceType;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTuringTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return idempotentKey
     */
    public String getIdempotentKey() {
        return this.idempotentKey;
    }

    /**
     * @return imgUrl
     */
    public String getImgUrl() {
        return this.imgUrl;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<SubmitTuringTaskRequest, Builder> {
        private Integer duration; 
        private String idempotentKey; 
        private String imgUrl; 
        private String resolution; 
        private String resourceType; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTuringTaskRequest request) {
            super(request);
            this.duration = request.duration;
            this.idempotentKey = request.idempotentKey;
            this.imgUrl = request.imgUrl;
            this.resolution = request.resolution;
            this.resourceType = request.resourceType;
            this.taskType = request.taskType;
        } 

        /**
         * duration.
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * idempotentKey.
         */
        public Builder idempotentKey(String idempotentKey) {
            this.putBodyParameter("idempotentKey", idempotentKey);
            this.idempotentKey = idempotentKey;
            return this;
        }

        /**
         * imgUrl.
         */
        public Builder imgUrl(String imgUrl) {
            this.putBodyParameter("imgUrl", imgUrl);
            this.imgUrl = imgUrl;
            return this;
        }

        /**
         * resolution.
         */
        public Builder resolution(String resolution) {
            this.putBodyParameter("resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * taskType.
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("taskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public SubmitTuringTaskRequest build() {
            return new SubmitTuringTaskRequest(this);
        } 

    } 

}
