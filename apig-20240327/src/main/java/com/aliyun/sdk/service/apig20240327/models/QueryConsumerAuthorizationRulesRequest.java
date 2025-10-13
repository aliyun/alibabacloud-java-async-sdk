// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link QueryConsumerAuthorizationRulesRequest} extends {@link RequestModel}
 *
 * <p>QueryConsumerAuthorizationRulesRequest</p>
 */
public class QueryConsumerAuthorizationRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiNameLike")
    private String apiNameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumerNameLike")
    private String consumerNameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupByApi")
    private Boolean groupByApi;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("parentResourceId")
    private String parentResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceTypes")
    private String resourceTypes;

    private QueryConsumerAuthorizationRulesRequest(Builder builder) {
        super(builder);
        this.apiNameLike = builder.apiNameLike;
        this.consumerId = builder.consumerId;
        this.consumerNameLike = builder.consumerNameLike;
        this.environmentId = builder.environmentId;
        this.groupByApi = builder.groupByApi;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.parentResourceId = builder.parentResourceId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConsumerAuthorizationRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiNameLike
     */
    public String getApiNameLike() {
        return this.apiNameLike;
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return consumerNameLike
     */
    public String getConsumerNameLike() {
        return this.consumerNameLike;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return groupByApi
     */
    public Boolean getGroupByApi() {
        return this.groupByApi;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentResourceId
     */
    public String getParentResourceId() {
        return this.parentResourceId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<QueryConsumerAuthorizationRulesRequest, Builder> {
        private String apiNameLike; 
        private String consumerId; 
        private String consumerNameLike; 
        private String environmentId; 
        private Boolean groupByApi; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String parentResourceId; 
        private String resourceId; 
        private String resourceType; 
        private String resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(QueryConsumerAuthorizationRulesRequest request) {
            super(request);
            this.apiNameLike = request.apiNameLike;
            this.consumerId = request.consumerId;
            this.consumerNameLike = request.consumerNameLike;
            this.environmentId = request.environmentId;
            this.groupByApi = request.groupByApi;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.parentResourceId = request.parentResourceId;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.resourceTypes = request.resourceTypes;
        } 

        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xx</p>
         */
        public Builder apiNameLike(String apiNameLike) {
            this.putQueryParameter("apiNameLike", apiNameLike);
            this.apiNameLike = apiNameLike;
            return this;
        }

        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-ct21c16m1hkp64hk6qmg</p>
         */
        public Builder consumerId(String consumerId) {
            this.putQueryParameter("consumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>The consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-xxx</p>
         */
        public Builder consumerNameLike(String consumerNameLike) {
            this.putQueryParameter("consumerNameLike", consumerNameLike);
            this.consumerNameLike = consumerNameLike;
            return this;
        }

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cpqnr6tlhtgubc***</p>
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>Specifies whether to group the results by API.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder groupByApi(Boolean groupByApi) {
            this.putQueryParameter("groupByApi", groupByApi);
            this.groupByApi = groupByApi;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The parent resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-li942gy8p01</p>
         */
        public Builder parentResourceId(String parentResourceId) {
            this.putQueryParameter("parentResourceId", parentResourceId);
            this.parentResourceId = parentResourceId;
            return this;
        }

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-li942gy8p03</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("resourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>HttpApiRoute</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * resourceTypes.
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("resourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        @Override
        public QueryConsumerAuthorizationRulesRequest build() {
            return new QueryConsumerAuthorizationRulesRequest(this);
        } 

    } 

}
