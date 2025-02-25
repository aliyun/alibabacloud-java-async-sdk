// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateImagePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>CreateImagePipelineResponseBody</p>
 */
public class CreateImagePipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImagePipelineId")
    private String imagePipelineId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the image template.</p>
         * 
         * <strong>example:</strong>
         * <p>ip-2ze5tsl5bp6nf2b3****</p>
         */
        public Builder imagePipelineId(String imagePipelineId) {
            this.imagePipelineId = imagePipelineId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
