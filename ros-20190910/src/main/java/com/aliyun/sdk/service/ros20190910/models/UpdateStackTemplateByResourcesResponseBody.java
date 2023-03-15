// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStackTemplateByResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateStackTemplateByResourcesResponseBody</p>
 */
public class UpdateStackTemplateByResourcesResponseBody extends TeaModel {
    @NameInMap("NewTemplateBody")
    private String newTemplateBody;

    @NameInMap("OldTemplateBody")
    private String oldTemplateBody;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateStackTemplateByResourcesResponseBody(Builder builder) {
        this.newTemplateBody = builder.newTemplateBody;
        this.oldTemplateBody = builder.oldTemplateBody;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStackTemplateByResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return newTemplateBody
     */
    public String getNewTemplateBody() {
        return this.newTemplateBody;
    }

    /**
     * @return oldTemplateBody
     */
    public String getOldTemplateBody() {
        return this.oldTemplateBody;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String newTemplateBody; 
        private String oldTemplateBody; 
        private String requestId; 

        /**
         * The template content after correction.
         */
        public Builder newTemplateBody(String newTemplateBody) {
            this.newTemplateBody = newTemplateBody;
            return this;
        }

        /**
         * The template content before correction.
         */
        public Builder oldTemplateBody(String oldTemplateBody) {
            this.oldTemplateBody = oldTemplateBody;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateStackTemplateByResourcesResponseBody build() {
            return new UpdateStackTemplateByResourcesResponseBody(this);
        } 

    } 

}
