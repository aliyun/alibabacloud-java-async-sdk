// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListRiskItemsRequest} extends {@link RequestModel}
 *
 * <p>ListRiskItemsRequest</p>
 */
public class ListRiskItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskCategory")
    private String riskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskId")
    private String riskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskScene")
    private String riskScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private ListRiskItemsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.policyName = builder.policyName;
        this.riskCategory = builder.riskCategory;
        this.riskId = builder.riskId;
        this.riskLevel = builder.riskLevel;
        this.riskScene = builder.riskScene;
        this.status = builder.status;
        this.statusList = builder.statusList;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRiskItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return riskCategory
     */
    public String getRiskCategory() {
        return this.riskCategory;
    }

    /**
     * @return riskId
     */
    public String getRiskId() {
        return this.riskId;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return riskScene
     */
    public String getRiskScene() {
        return this.riskScene;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ListRiskItemsRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private String policyName; 
        private String riskCategory; 
        private String riskId; 
        private String riskLevel; 
        private String riskScene; 
        private String status; 
        private java.util.List<String> statusList; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ListRiskItemsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.policyName = request.policyName;
            this.riskCategory = request.riskCategory;
            this.riskId = request.riskId;
            this.riskLevel = request.riskLevel;
            this.riskScene = request.riskScene;
            this.status = request.status;
            this.statusList = request.statusList;
            this.username = request.username;
        } 

        /**
         * <p>The page number of the current page in a paging query. Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries per page in a paging query. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the risk analysis policy. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Remote logon risk analysis policy</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The risk category. Valid values:</p>
         * <ul>
         * <li><code>data_safe</code>: data security.</li>
         * <li><code>identify_safe</code>: identity security.</li>
         * <li><code>device_safe</code>: device security.</li>
         * <li><code>access_safe</code>: access security.</li>
         * <li><code>ai_agent_safe</code>: Agent security.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>identify_safe</p>
         */
        public Builder riskCategory(String riskCategory) {
            this.putQueryParameter("RiskCategory", riskCategory);
            this.riskCategory = riskCategory;
            return this;
        }

        /**
         * <p>The risk event ID. If specified, the exact risk event is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>69ef648034cf53d7bac7a9c9c912****</p>
         */
        public Builder riskId(String riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><code>High</code>: high risk.</li>
         * <li><code>Medium</code>: medium risk.</li>
         * <li><code>Low</code>: low risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The risk scenario. Valid values:</p>
         * <ul>
         * <li><code>account_share</code>: account sharing.</li>
         * <li><code>account_stolen</code>: account theft.</li>
         * <li><code>device_share</code>: device sharing.</li>
         * <li><code>remote_logon</code>: remote logon from an unusual location.</li>
         * <li><code>sensitive_data_leakage</code>: sensitive data exfiltration.</li>
         * <li><code>compressed_archive_exfil</code>: compressed data exfiltration from the internal network.</li>
         * <li><code>lateral_scanning</code>: lateral scanning.</li>
         * <li><code>ai_skill_malware</code>: malicious Skill.</li>
         * <li><code>ai_config_check</code>: AI configuration check.</li>
         * <li><code>openclaw_vulnerability</code>: OpenClaw vulnerability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>account_stolen</p>
         */
        public Builder riskScene(String riskScene) {
            this.putQueryParameter("RiskScene", riskScene);
            this.riskScene = riskScene;
            return this;
        }

        /**
         * <p>The disposition status of the risk event. This parameter cannot be set together with <code>StatusList</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Unprocess</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The list of disposition statuses of risk events, in Flat serialization format. This parameter cannot be set together with Status.</p>
         */
        public Builder statusList(java.util.List<String> statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>The username associated with the risk event. Fuzzy match is supported. Maximum length: 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>zhang***</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public ListRiskItemsRequest build() {
            return new ListRiskItemsRequest(this);
        } 

    } 

}
