// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListAddonReleasesRequest} extends {@link RequestModel}
 *
 * <p>ListAddonReleasesRequest</p>
 */
public class ListAddonReleasesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("addonName")
    private String addonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("parentAddonReleaseId")
    private String parentAddonReleaseId;

    private ListAddonReleasesRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.addonName = builder.addonName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.parentAddonReleaseId = builder.parentAddonReleaseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAddonReleasesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return parentAddonReleaseId
     */
    public String getParentAddonReleaseId() {
        return this.parentAddonReleaseId;
    }

    public static final class Builder extends Request.Builder<ListAddonReleasesRequest, Builder> {
        private String policyId; 
        private String addonName; 
        private String maxResults; 
        private String nextToken; 
        private String parentAddonReleaseId; 

        private Builder() {
            super();
        } 

        private Builder(ListAddonReleasesRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.addonName = request.addonName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.parentAddonReleaseId = request.parentAddonReleaseId;
        } 

        /**
         * <p>Policy environment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxxxx</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Addon component name.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-gpu</p>
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("addonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Parent AddonReleaseId.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxxxxx</p>
         */
        public Builder parentAddonReleaseId(String parentAddonReleaseId) {
            this.putQueryParameter("parentAddonReleaseId", parentAddonReleaseId);
            this.parentAddonReleaseId = parentAddonReleaseId;
            return this;
        }

        @Override
        public ListAddonReleasesRequest build() {
            return new ListAddonReleasesRequest(this);
        } 

    } 

}
