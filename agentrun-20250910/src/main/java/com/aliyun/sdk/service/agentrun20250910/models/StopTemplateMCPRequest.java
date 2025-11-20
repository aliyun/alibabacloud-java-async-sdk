// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link StopTemplateMCPRequest} extends {@link RequestModel}
 *
 * <p>StopTemplateMCPRequest</p>
 */
public class StopTemplateMCPRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    private StopTemplateMCPRequest(Builder builder) {
        super(builder);
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopTemplateMCPRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<StopTemplateMCPRequest, Builder> {
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(StopTemplateMCPRequest request) {
            super(request);
            this.templateName = request.templateName;
        } 

        /**
         * templateName.
         */
        public Builder templateName(String templateName) {
            this.putPathParameter("templateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public StopTemplateMCPRequest build() {
            return new StopTemplateMCPRequest(this);
        } 

    } 

}
