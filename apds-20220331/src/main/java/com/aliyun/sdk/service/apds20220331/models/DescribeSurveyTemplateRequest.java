// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link DescribeSurveyTemplateRequest} extends {@link RequestModel}
 *
 * <p>DescribeSurveyTemplateRequest</p>
 */
public class DescribeSurveyTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private DescribeSurveyTemplateRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSurveyTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeSurveyTemplateRequest, Builder> {
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSurveyTemplateRequest request) {
            super(request);
            this.resourceType = request.resourceType;
        } 

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeSurveyTemplateRequest build() {
            return new DescribeSurveyTemplateRequest(this);
        } 

    } 

}
