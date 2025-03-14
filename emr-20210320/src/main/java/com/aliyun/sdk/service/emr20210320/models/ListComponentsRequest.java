// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ListComponentsRequest} extends {@link RequestModel}
 *
 * <p>ListComponentsRequest</p>
 */
public class ListComponentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationNames")
    private java.util.List<String> applicationNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentNames")
    private java.util.List<String> componentNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentStates")
    private java.util.List<String> componentStates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListComponentsRequest(Builder builder) {
        super(builder);
        this.applicationNames = builder.applicationNames;
        this.clusterId = builder.clusterId;
        this.componentNames = builder.componentNames;
        this.componentStates = builder.componentStates;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationNames
     */
    public java.util.List<String> getApplicationNames() {
        return this.applicationNames;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return componentNames
     */
    public java.util.List<String> getComponentNames() {
        return this.componentNames;
    }

    /**
     * @return componentStates
     */
    public java.util.List<String> getComponentStates() {
        return this.componentStates;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListComponentsRequest, Builder> {
        private java.util.List<String> applicationNames; 
        private String clusterId; 
        private java.util.List<String> componentNames; 
        private java.util.List<String> componentStates; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListComponentsRequest request) {
            super(request);
            this.applicationNames = request.applicationNames;
            this.clusterId = request.clusterId;
            this.componentNames = request.componentNames;
            this.componentStates = request.componentStates;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * <p>应用名称列表。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;HDFS&quot;]</p>
         */
        public Builder applicationNames(java.util.List<String> applicationNames) {
            this.putQueryParameter("ApplicationNames", applicationNames);
            this.applicationNames = applicationNames;
            return this;
        }

        /**
         * <p>集群ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>组件名称列表。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;DataNode&quot;]</p>
         */
        public Builder componentNames(java.util.List<String> componentNames) {
            this.putQueryParameter("ComponentNames", componentNames);
            this.componentNames = componentNames;
            return this;
        }

        /**
         * ComponentStates.
         */
        public Builder componentStates(java.util.List<String> componentStates) {
            this.putQueryParameter("ComponentStates", componentStates);
            this.componentStates = componentStates;
            return this;
        }

        /**
         * <p>一次获取的最大记录数。取值范围：1~100。</p>
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
         * <p>标记当前开始读取的位置，置空表示从头开始。</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>地域ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListComponentsRequest build() {
            return new ListComponentsRequest(this);
        } 

    } 

}
