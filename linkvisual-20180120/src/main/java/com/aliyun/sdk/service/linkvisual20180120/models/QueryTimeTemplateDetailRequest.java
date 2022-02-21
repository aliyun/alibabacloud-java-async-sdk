// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTimeTemplateDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryTimeTemplateDetailRequest</p>
 */
public class QueryTimeTemplateDetailRequest extends Request {
    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private QueryTimeTemplateDetailRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTimeTemplateDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<QueryTimeTemplateDetailRequest, Builder> {
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTimeTemplateDetailRequest response) {
            super(response);
            this.templateId = response.templateId;
        } 

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public QueryTimeTemplateDetailRequest build() {
            return new QueryTimeTemplateDetailRequest(this);
        } 

    } 

}
