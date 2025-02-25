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
 * {@link ListScriptsRequest} extends {@link RequestModel}
 *
 * <p>ListScriptsRequest</p>
 */
public class ListScriptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptName")
    private String scriptName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    private ListScriptsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.scriptId = builder.scriptId;
        this.scriptName = builder.scriptName;
        this.scriptType = builder.scriptType;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScriptsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * @return scriptType
     */
    public String getScriptType() {
        return this.scriptType;
    }

    /**
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static final class Builder extends Request.Builder<ListScriptsRequest, Builder> {
        private String clusterId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String scriptId; 
        private String scriptName; 
        private String scriptType; 
        private java.util.List<String> statuses; 

        private Builder() {
            super();
        } 

        private Builder(ListScriptsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.scriptId = request.scriptId;
            this.scriptName = request.scriptName;
            this.scriptType = request.scriptType;
            this.statuses = request.statuses;
        } 

        /**
         * <p>Cluster ID.</p>
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
         * <p>The maximum number of records to retrieve at once.</p>
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
         * <p>Marks the current position to start reading from.</p>
         * 
         * <strong>example:</strong>
         * <p>dd6b1b2a-5837-5237-abe4-ff0c89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Region ID.</p>
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

        /**
         * <p>The script ID. Only common scripts are supported.</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>The name of the script. Only common scripts are supported. Fuzzy search is supported.</p>
         */
        public Builder scriptName(String scriptName) {
            this.putQueryParameter("ScriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * <p>Type of cluster script. Possible values:</p>
         * <ul>
         * <li>BOOTSTRAP: Bootstrap script.</li>
         * <li>NORMAL: Regular cluster script.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BOOTSTRAP</p>
         */
        public Builder scriptType(String scriptType) {
            this.putQueryParameter("ScriptType", scriptType);
            this.scriptType = scriptType;
            return this;
        }

        /**
         * <p>The status of the script. Only common scripts are supported.</p>
         */
        public Builder statuses(java.util.List<String> statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        @Override
        public ListScriptsRequest build() {
            return new ListScriptsRequest(this);
        } 

    } 

}
