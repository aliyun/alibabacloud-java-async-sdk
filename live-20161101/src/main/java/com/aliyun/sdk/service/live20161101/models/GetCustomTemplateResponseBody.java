// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link GetCustomTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomTemplateResponseBody</p>
 */
public class GetCustomTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomTemplate")
    private String customTemplate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Template")
    private String template;

    private GetCustomTemplateResponseBody(Builder builder) {
        this.customTemplate = builder.customTemplate;
        this.requestId = builder.requestId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customTemplate
     */
    public String getCustomTemplate() {
        return this.customTemplate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder {
        private String customTemplate; 
        private String requestId; 
        private String template; 

        private Builder() {
        } 

        private Builder(GetCustomTemplateResponseBody model) {
            this.customTemplate = model.customTemplate;
            this.requestId = model.requestId;
            this.template = model.template;
        } 

        /**
         * <p>The configurations of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{height:1080,scale:[16:9],gop:60,bframes:30,cdesc:h264}</p>
         */
        public Builder customTemplate(String customTemplate) {
            this.customTemplate = customTemplate;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BC1E78D3-FA8B-4457-DEE2-6093E1232254</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>TestTemplate</p>
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }

        public GetCustomTemplateResponseBody build() {
            return new GetCustomTemplateResponseBody(this);
        } 

    } 

}
