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
 * {@link ListImportableKMSSecretsForHostRequest} extends {@link RequestModel}
 *
 * <p>ListImportableKMSSecretsForHostRequest</p>
 */
public class ListImportableKMSSecretsForHostRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer hostId;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListImportableKMSSecretsForHostRequest(Builder builder) {
        super(builder);
        this.hostId = builder.hostId;
        this.instanceId = builder.instanceId;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImportableKMSSecretsForHostRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostId
     */
    public Integer getHostId() {
        return this.hostId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListImportableKMSSecretsForHostRequest, Builder> {
        private Integer hostId; 
        private String instanceId; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListImportableKMSSecretsForHostRequest request) {
            super(request);
            this.hostId = request.hostId;
            this.instanceId = request.instanceId;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the host.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to get this ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hostId(Integer hostId) {
            this.putQueryParameter("HostId", hostId);
            this.hostId = hostId;
            return this;
        }

        /**
         * <p>The ID of the bastion host instance.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to get this ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the secret to search for. Fuzzy matching is supported.</p>
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
         * <p>The number of entries to return on each page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token to retrieve the next page of results.</p>
         * <blockquote>
         * <p>You do not need to specify this parameter for the first request. For subsequent requests, use the <code>NextToken</code> value from the previous response.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>42bc833a0a0002dae0b5e8707e68181f</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For details about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and availability zones</a>.</p>
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

        @Override
        public ListImportableKMSSecretsForHostRequest build() {
            return new ListImportableKMSSecretsForHostRequest(this);
        } 

    } 

}
