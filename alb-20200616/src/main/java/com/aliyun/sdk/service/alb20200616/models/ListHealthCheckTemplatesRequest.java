// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHealthCheckTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListHealthCheckTemplatesRequest</p>
 */
public class ListHealthCheckTemplatesRequest extends Request {
    @Query
    @NameInMap("HealthCheckTemplateIds")
    private java.util.List < String > healthCheckTemplateIds;

    @Query
    @NameInMap("HealthCheckTemplateNames")
    private java.util.List < String > healthCheckTemplateNames;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private ListHealthCheckTemplatesRequest(Builder builder) {
        super(builder);
        this.healthCheckTemplateIds = builder.healthCheckTemplateIds;
        this.healthCheckTemplateNames = builder.healthCheckTemplateNames;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHealthCheckTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return healthCheckTemplateIds
     */
    public java.util.List < String > getHealthCheckTemplateIds() {
        return this.healthCheckTemplateIds;
    }

    /**
     * @return healthCheckTemplateNames
     */
    public java.util.List < String > getHealthCheckTemplateNames() {
        return this.healthCheckTemplateNames;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListHealthCheckTemplatesRequest, Builder> {
        private java.util.List < String > healthCheckTemplateIds; 
        private java.util.List < String > healthCheckTemplateNames; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListHealthCheckTemplatesRequest response) {
            super(response);
            this.healthCheckTemplateIds = response.healthCheckTemplateIds;
            this.healthCheckTemplateNames = response.healthCheckTemplateNames;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
        } 

        /**
         * 健康检查模板ID列表
         */
        public Builder healthCheckTemplateIds(java.util.List < String > healthCheckTemplateIds) {
            this.putQueryParameter("HealthCheckTemplateIds", healthCheckTemplateIds);
            this.healthCheckTemplateIds = healthCheckTemplateIds;
            return this;
        }

        /**
         * 健康检查模板名称列表
         */
        public Builder healthCheckTemplateNames(java.util.List < String > healthCheckTemplateNames) {
            this.putQueryParameter("HealthCheckTemplateNames", healthCheckTemplateNames);
            this.healthCheckTemplateNames = healthCheckTemplateNames;
            return this;
        }

        /**
         * 查询数量
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListHealthCheckTemplatesRequest build() {
            return new ListHealthCheckTemplatesRequest(this);
        } 

    } 

}
