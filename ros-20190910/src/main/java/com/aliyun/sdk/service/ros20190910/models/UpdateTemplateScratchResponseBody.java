// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTemplateScratchResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTemplateScratchResponseBody</p>
 */
public class UpdateTemplateScratchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateScratchId")
    private String templateScratchId;

    private UpdateTemplateScratchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateScratchId = builder.templateScratchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateScratchResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public static final class Builder {
        private String requestId; 
        private String templateScratchId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the scenario.
         */
        public Builder templateScratchId(String templateScratchId) {
            this.templateScratchId = templateScratchId;
            return this;
        }

        public UpdateTemplateScratchResponseBody build() {
            return new UpdateTemplateScratchResponseBody(this);
        } 

    } 

}
