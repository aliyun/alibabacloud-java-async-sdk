// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>CreateEnvironmentRequest</p>
 */
public class CreateEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextEnvironmentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextEnvironmentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private CreateEnvironmentRequest(Builder builder) {
        super(builder);
        this.environmentName = builder.environmentName;
        this.nextEnvironmentName = builder.nextEnvironmentName;
        this.rule = builder.rule;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnvironmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentName
     */
    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * @return nextEnvironmentName
     */
    public String getNextEnvironmentName() {
        return this.nextEnvironmentName;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<CreateEnvironmentRequest, Builder> {
        private String environmentName; 
        private String nextEnvironmentName; 
        private String rule; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnvironmentRequest request) {
            super(request);
            this.environmentName = request.environmentName;
            this.nextEnvironmentName = request.nextEnvironmentName;
            this.rule = request.rule;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder environmentName(String environmentName) {
            this.putQueryParameter("EnvironmentName", environmentName);
            this.environmentName = environmentName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder nextEnvironmentName(String nextEnvironmentName) {
            this.putQueryParameter("NextEnvironmentName", nextEnvironmentName);
            this.nextEnvironmentName = nextEnvironmentName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public CreateEnvironmentRequest build() {
            return new CreateEnvironmentRequest(this);
        } 

    } 

}
