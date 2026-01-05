// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link CreateTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTemplateResponseBody</p>
 */
public class CreateTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateUrl")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.templateUrl = model.templateUrl;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The URL of the template.</p>
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
