// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListResponseRulesRequest} extends {@link RequestModel}
 *
 * <p>ListResponseRulesRequest</p>
 */
public class ListResponseRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseActionType")
    private String responseActionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleName")
    private String responseRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleStatus")
    private Integer responseRuleStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleType")
    private String responseRuleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseTriggerType")
    private String responseTriggerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    private ListResponseRulesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.responseActionType = builder.responseActionType;
        this.responseRuleName = builder.responseRuleName;
        this.responseRuleStatus = builder.responseRuleStatus;
        this.responseRuleType = builder.responseRuleType;
        this.responseTriggerType = builder.responseTriggerType;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResponseRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return responseActionType
     */
    public String getResponseActionType() {
        return this.responseActionType;
    }

    /**
     * @return responseRuleName
     */
    public String getResponseRuleName() {
        return this.responseRuleName;
    }

    /**
     * @return responseRuleStatus
     */
    public Integer getResponseRuleStatus() {
        return this.responseRuleStatus;
    }

    /**
     * @return responseRuleType
     */
    public String getResponseRuleType() {
        return this.responseRuleType;
    }

    /**
     * @return responseTriggerType
     */
    public String getResponseTriggerType() {
        return this.responseTriggerType;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<ListResponseRulesRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String responseActionType; 
        private String responseRuleName; 
        private Integer responseRuleStatus; 
        private String responseRuleType; 
        private String responseTriggerType; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(ListResponseRulesRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.responseActionType = request.responseActionType;
            this.responseRuleName = request.responseRuleName;
            this.responseRuleStatus = request.responseRuleStatus;
            this.responseRuleType = request.responseRuleType;
            this.responseTriggerType = request.responseTriggerType;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResponseActionType.
         */
        public Builder responseActionType(String responseActionType) {
            this.putBodyParameter("ResponseActionType", responseActionType);
            this.responseActionType = responseActionType;
            return this;
        }

        /**
         * ResponseRuleName.
         */
        public Builder responseRuleName(String responseRuleName) {
            this.putBodyParameter("ResponseRuleName", responseRuleName);
            this.responseRuleName = responseRuleName;
            return this;
        }

        /**
         * ResponseRuleStatus.
         */
        public Builder responseRuleStatus(Integer responseRuleStatus) {
            this.putBodyParameter("ResponseRuleStatus", responseRuleStatus);
            this.responseRuleStatus = responseRuleStatus;
            return this;
        }

        /**
         * ResponseRuleType.
         */
        public Builder responseRuleType(String responseRuleType) {
            this.putBodyParameter("ResponseRuleType", responseRuleType);
            this.responseRuleType = responseRuleType;
            return this;
        }

        /**
         * ResponseTriggerType.
         */
        public Builder responseTriggerType(String responseTriggerType) {
            this.putBodyParameter("ResponseTriggerType", responseTriggerType);
            this.responseTriggerType = responseTriggerType;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public ListResponseRulesRequest build() {
            return new ListResponseRulesRequest(this);
        } 

    } 

}
