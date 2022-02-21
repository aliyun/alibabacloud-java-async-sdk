// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImagePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>CreateImagePipelineResponseBody</p>
 */
public class CreateImagePipelineResponseBody extends TeaModel {
    @NameInMap("ImagePipelineId")
    private String imagePipelineId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateImagePipelineResponseBody(Builder builder) {
        this.imagePipelineId = builder.imagePipelineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImagePipelineResponseBody create() {
        return builder().build();
    }

    /**
     * @return imagePipelineId
     */
    public String getImagePipelineId() {
        return this.imagePipelineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String imagePipelineId; 
        private String requestId; 

        /**
         * The ID of the image template.
         */
        public Builder imagePipelineId(String imagePipelineId) {
            this.imagePipelineId = imagePipelineId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateImagePipelineResponseBody build() {
            return new CreateImagePipelineResponseBody(this);
        } 

    } 

}
