// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTemplateScratchResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTemplateScratchResponseBody</p>
 */
public class CreateTemplateScratchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateScratchId")
    private String templateScratchId;

    private CreateTemplateScratchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateScratchId = builder.templateScratchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateScratchResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>84980977-22F0-5421-B30D-B201311D5DCF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>ts-7f7a704cf71c49a6****</p>
         */
        public Builder templateScratchId(String templateScratchId) {
            this.templateScratchId = templateScratchId;
            return this;
        }

        public CreateTemplateScratchResponseBody build() {
            return new CreateTemplateScratchResponseBody(this);
        } 

    } 

}
