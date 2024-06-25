// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCardSmsTemplateRequest} extends {@link RequestModel}
 *
 * <p>QueryCardSmsTemplateRequest</p>
 */
public class QueryCardSmsTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateCode;

    private QueryCardSmsTemplateRequest(Builder builder) {
        super(builder);
        this.templateCode = builder.templateCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCardSmsTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static final class Builder extends Request.Builder<QueryCardSmsTemplateRequest, Builder> {
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryCardSmsTemplateRequest request) {
            super(request);
            this.templateCode = request.templateCode;
        } 

        /**
         * The code of the message template.
         * <p>
         * 
         * You can view the template code in the **Template Code** column on the **Templates** tab of the **Go China** page in the Alibaba Cloud SMS console.
         * 
         * > Make sure that the message template has been approved.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        @Override
        public QueryCardSmsTemplateRequest build() {
            return new QueryCardSmsTemplateRequest(this);
        } 

    } 

}
