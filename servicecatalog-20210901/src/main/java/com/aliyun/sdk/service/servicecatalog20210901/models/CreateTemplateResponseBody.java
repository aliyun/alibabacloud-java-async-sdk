// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTemplateResponseBody</p>
 */
public class CreateTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateUrl")
    private String templateUrl;

    private CreateTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateUrl = builder.templateUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateUrl
     */
    public String getTemplateUrl() {
        return this.templateUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String templateUrl; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The URL of the template.
         */
        public Builder templateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }

        public CreateTemplateResponseBody build() {
            return new CreateTemplateResponseBody(this);
        } 

    } 

}
