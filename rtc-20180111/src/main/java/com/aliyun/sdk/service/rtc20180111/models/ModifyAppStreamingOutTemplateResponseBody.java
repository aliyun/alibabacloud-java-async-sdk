// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppStreamingOutTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAppStreamingOutTemplateResponseBody</p>
 */
public class ModifyAppStreamingOutTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateId")
    private String templateId;

    private ModifyAppStreamingOutTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppStreamingOutTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder {
        private String requestId; 
        private String templateId; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public ModifyAppStreamingOutTemplateResponseBody build() {
            return new ModifyAppStreamingOutTemplateResponseBody(this);
        } 

    } 

}
