// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawSkillDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarClawSkillDetailRequest</p>
 */
public class DescribePolarClawSkillDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Slug")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slug;

    private DescribePolarClawSkillDetailRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.slug = builder.slug;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawSkillDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return slug
     */
    public String getSlug() {
        return this.slug;
    }

    public static final class Builder extends Request.Builder<DescribePolarClawSkillDetailRequest, Builder> {
        private String applicationId; 
        private String slug; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarClawSkillDetailRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.slug = request.slug;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alibacloud-rds-copilot</p>
         */
        public Builder slug(String slug) {
            this.putQueryParameter("Slug", slug);
            this.slug = slug;
            return this;
        }

        @Override
        public DescribePolarClawSkillDetailRequest build() {
            return new DescribePolarClawSkillDetailRequest(this);
        } 

    } 

}
