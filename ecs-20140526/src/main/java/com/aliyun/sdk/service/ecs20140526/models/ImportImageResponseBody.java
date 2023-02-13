// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportImageResponseBody} extends {@link TeaModel}
 *
 * <p>ImportImageResponseBody</p>
 */
public class ImportImageResponseBody extends TeaModel {
    @NameInMap("ImageId")
    private String imageId;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    private ImportImageResponseBody(Builder builder) {
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String imageId; 
        private String regionId; 
        private String requestId; 
        private String taskId; 

        /**
         * The ID of the custom image.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * The region ID of the image.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the image import task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ImportImageResponseBody build() {
            return new ImportImageResponseBody(this);
        } 

    } 

}
