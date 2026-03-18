// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListCredentialProvidersRequest} extends {@link RequestModel}
 *
 * <p>ListCredentialProvidersRequest</p>
 */
public class ListCredentialProvidersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialProviderIds")
    private java.util.List<String> credentialProviderIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialProviderTypes")
    private java.util.List<String> credentialProviderTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    private ListCredentialProvidersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.credentialProviderIds = builder.credentialProviderIds;
        this.credentialProviderTypes = builder.credentialProviderTypes;
        this.filter = builder.filter;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCredentialProvidersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return credentialProviderIds
     */
    public java.util.List<String> getCredentialProviderIds() {
        return this.credentialProviderIds;
    }

    /**
     * @return credentialProviderTypes
     */
    public java.util.List<String> getCredentialProviderTypes() {
        return this.credentialProviderTypes;
    }

    /**
     * @return filter
     */
    public java.util.List<Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static final class Builder extends Request.Builder<ListCredentialProvidersRequest, Builder> {
        private String regionId; 
        private java.util.List<String> credentialProviderIds; 
        private java.util.List<String> credentialProviderTypes; 
        private java.util.List<Filter> filter; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<String> statuses; 

        private Builder() {
            super();
        } 

        private Builder(ListCredentialProvidersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.credentialProviderIds = request.credentialProviderIds;
            this.credentialProviderTypes = request.credentialProviderTypes;
            this.filter = request.filter;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.statuses = request.statuses;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>认证令牌提供商ID列表。</p>
         */
        public Builder credentialProviderIds(java.util.List<String> credentialProviderIds) {
            this.putQueryParameter("CredentialProviderIds", credentialProviderIds);
            this.credentialProviderIds = credentialProviderIds;
            return this;
        }

        /**
         * <p>认证令牌提供商类型列表。</p>
         */
        public Builder credentialProviderTypes(java.util.List<String> credentialProviderTypes) {
            this.putQueryParameter("CredentialProviderTypes", credentialProviderTypes);
            this.credentialProviderTypes = credentialProviderTypes;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(java.util.List<Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>分页查询时每页行数。默认值为20，最大值为100。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>查询凭证（Token），取值为上一次API调用返回的NextToken参数值。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>认证令牌提供商状态列表。</p>
         */
        public Builder statuses(java.util.List<String> statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        @Override
        public ListCredentialProvidersRequest build() {
            return new ListCredentialProvidersRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListCredentialProvidersRequest} extends {@link TeaModel}
     *
     * <p>ListCredentialProvidersRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

        private Filter(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> value; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
