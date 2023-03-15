// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTypeTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceTypeTemplateResponseBody</p>
 */
public class GetResourceTypeTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateBody")
    private java.util.Map < String, ? > templateBody;

    private GetResourceTypeTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateBody = builder.templateBody;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateBody
     */
    public java.util.Map < String, ? > getTemplateBody() {
        return this.templateBody;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > templateBody; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The structure that contains the template body.
         * <p>
         * 
         * The template body must be 1 to 51,200 bytes in length.
         * 
         * For more information, see [Template syntax](~~28857~~).
         */
        public Builder templateBody(java.util.Map < String, ? > templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        public GetResourceTypeTemplateResponseBody build() {
            return new GetResourceTypeTemplateResponseBody(this);
        } 

    } 

}
