// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListProjectNotifyReceiversRequest} extends {@link RequestModel}
 *
 * <p>ListProjectNotifyReceiversRequest</p>
 */
public class ListProjectNotifyReceiversRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Skip")
    private Integer skip;

    private ListProjectNotifyReceiversRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.skip = builder.skip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectNotifyReceiversRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    public static final class Builder extends Request.Builder<ListProjectNotifyReceiversRequest, Builder> {
        private String instanceId; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private Long projectId; 
        private String regionId; 
        private Integer skip; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectNotifyReceiversRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.skip = request.skip;
        } 

        /**
         * <p>The instance ID of the bastion host. </p>
         * <blockquote>
         * <p>You can invoke <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-zvp282aly06</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name, phone number, or email address of the notification recipient to query. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The number of entries to query. Default value: 20. Maximum value: 100.</p>
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
         * <p>The request token. Leave this parameter empty or set it to an empty string for the first request.</p>
         * 
         * <strong>example:</strong>
         * <p>4ieSWJCwxvW3dk3wF.BqkrZmP72nWu5zJ5NWydMqyEs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * <blockquote>
         * <p>You can call ListProjects to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of entries to skip.</p>
         * <blockquote>
         * <p>This parameter takes effect only when NextToken is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder skip(Integer skip) {
            this.putQueryParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        @Override
        public ListProjectNotifyReceiversRequest build() {
            return new ListProjectNotifyReceiversRequest(this);
        } 

    } 

}
