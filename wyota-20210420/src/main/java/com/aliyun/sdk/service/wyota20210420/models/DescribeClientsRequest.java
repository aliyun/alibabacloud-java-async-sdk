// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

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
 * {@link DescribeClientsRequest} extends {@link RequestModel}
 *
 * <p>DescribeClientsRequest</p>
 */
public class DescribeClientsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerAliUid")
    private String callerAliUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer clientType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomResourceId")
    private String customResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomResourceStatus")
    private Boolean customResourceStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InManage")
    private Boolean inManage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeSubGroups")
    private Boolean includeSubGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnlineStatus")
    private Boolean onlineStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchKeyword")
    private String searchKeyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
    private String terminalGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private java.util.List<String> uuids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WithBindUser")
    private Boolean withBindUser;

    private DescribeClientsRequest(Builder builder) {
        super(builder);
        this.callerAliUid = builder.callerAliUid;
        this.clientType = builder.clientType;
        this.customResourceId = builder.customResourceId;
        this.customResourceStatus = builder.customResourceStatus;
        this.inManage = builder.inManage;
        this.includeSubGroups = builder.includeSubGroups;
        this.maxResults = builder.maxResults;
        this.model = builder.model;
        this.nextToken = builder.nextToken;
        this.onlineStatus = builder.onlineStatus;
        this.platform = builder.platform;
        this.searchKeyword = builder.searchKeyword;
        this.terminalGroupId = builder.terminalGroupId;
        this.uuids = builder.uuids;
        this.withBindUser = builder.withBindUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callerAliUid
     */
    public String getCallerAliUid() {
        return this.callerAliUid;
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return customResourceId
     */
    public String getCustomResourceId() {
        return this.customResourceId;
    }

    /**
     * @return customResourceStatus
     */
    public Boolean getCustomResourceStatus() {
        return this.customResourceStatus;
    }

    /**
     * @return inManage
     */
    public Boolean getInManage() {
        return this.inManage;
    }

    /**
     * @return includeSubGroups
     */
    public Boolean getIncludeSubGroups() {
        return this.includeSubGroups;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return onlineStatus
     */
    public Boolean getOnlineStatus() {
        return this.onlineStatus;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return searchKeyword
     */
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    /**
     * @return terminalGroupId
     */
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    /**
     * @return uuids
     */
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    /**
     * @return withBindUser
     */
    public Boolean getWithBindUser() {
        return this.withBindUser;
    }

    public static final class Builder extends Request.Builder<DescribeClientsRequest, Builder> {
        private String callerAliUid; 
        private Integer clientType; 
        private String customResourceId; 
        private Boolean customResourceStatus; 
        private Boolean inManage; 
        private Boolean includeSubGroups; 
        private Integer maxResults; 
        private String model; 
        private String nextToken; 
        private Boolean onlineStatus; 
        private String platform; 
        private String searchKeyword; 
        private String terminalGroupId; 
        private java.util.List<String> uuids; 
        private Boolean withBindUser; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClientsRequest request) {
            super(request);
            this.callerAliUid = request.callerAliUid;
            this.clientType = request.clientType;
            this.customResourceId = request.customResourceId;
            this.customResourceStatus = request.customResourceStatus;
            this.inManage = request.inManage;
            this.includeSubGroups = request.includeSubGroups;
            this.maxResults = request.maxResults;
            this.model = request.model;
            this.nextToken = request.nextToken;
            this.onlineStatus = request.onlineStatus;
            this.platform = request.platform;
            this.searchKeyword = request.searchKeyword;
            this.terminalGroupId = request.terminalGroupId;
            this.uuids = request.uuids;
            this.withBindUser = request.withBindUser;
        } 

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder callerAliUid(String callerAliUid) {
            this.putQueryParameter("CallerAliUid", callerAliUid);
            this.callerAliUid = callerAliUid;
            return this;
        }

        /**
         * <p>The client type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientType(Integer clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The custom task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-***</p>
         */
        public Builder customResourceId(String customResourceId) {
            this.putBodyParameter("CustomResourceId", customResourceId);
            this.customResourceId = customResourceId;
            return this;
        }

        /**
         * <p>The effective status of the custom task. Valid values:</p>
         * <ul>
         * <li>true: effective.</li>
         * <li>false: ineffective.</li>
         * <li>null: all.</li>
         * </ul>
         */
        public Builder customResourceStatus(Boolean customResourceStatus) {
            this.putBodyParameter("CustomResourceStatus", customResourceStatus);
            this.customResourceStatus = customResourceStatus;
            return this;
        }

        /**
         * <p>Specifies whether the client is managed.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder inManage(Boolean inManage) {
            this.putBodyParameter("InManage", inManage);
            this.inManage = inManage;
            return this;
        }

        /**
         * <p>Specifies whether to include subgroups.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeSubGroups(Boolean includeSubGroups) {
            this.putBodyParameter("IncludeSubGroups", includeSubGroups);
            this.includeSubGroups = includeSubGroups;
            return this;
        }

        /**
         * <p>The maximum number of results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The device model.</p>
         * 
         * <strong>example:</strong>
         * <p>US02-2BFXG</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdEdsXbwG2ZlbWCzN4wTTg6wQvfp7u1BJl4bxCAby41POSaYAlCvfULQpkAnb0ff****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The soft client status.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder onlineStatus(Boolean onlineStatus) {
            this.putBodyParameter("OnlineStatus", onlineStatus);
            this.onlineStatus = onlineStatus;
            return this;
        }

        /**
         * <p>The soft client platform.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder platform(String platform) {
            this.putBodyParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The fuzzy search parameter. Supports fuzzy search by SN, alias, or IP address. This parameter is incompatible with exact search parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>061</p>
         */
        public Builder searchKeyword(String searchKeyword) {
            this.putBodyParameter("SearchKeyword", searchKeyword);
            this.searchKeyword = searchKeyword;
            return this;
        }

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tg-bp103v8x70nasykdjrd1</p>
         */
        public Builder terminalGroupId(String terminalGroupId) {
            this.putBodyParameter("TerminalGroupId", terminalGroupId);
            this.terminalGroupId = terminalGroupId;
            return this;
        }

        /**
         * <p>The UUIDs of the servers to query. Separate multiple UUIDs with commas (,).</p>
         */
        public Builder uuids(java.util.List<String> uuids) {
            this.putBodyParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * <p>Specifies whether to return bound users.</p>
         */
        public Builder withBindUser(Boolean withBindUser) {
            this.putBodyParameter("WithBindUser", withBindUser);
            this.withBindUser = withBindUser;
            return this;
        }

        @Override
        public DescribeClientsRequest build() {
            return new DescribeClientsRequest(this);
        } 

    } 

}
