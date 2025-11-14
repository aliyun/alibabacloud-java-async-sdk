// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListCheckPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListCheckPoliciesRequest</p>
 */
public class ListCheckPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckTypes")
    private java.util.List<String> checkTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DependentPolicyId")
    private Long dependentPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private Long policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyShowName")
    private String policyShowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListCheckPoliciesRequest(Builder builder) {
        super(builder);
        this.checkTypes = builder.checkTypes;
        this.currentPage = builder.currentPage;
        this.dependentPolicyId = builder.dependentPolicyId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.policyId = builder.policyId;
        this.policyShowName = builder.policyShowName;
        this.policyType = builder.policyType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckPoliciesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkTypes
     */
    public java.util.List<String> getCheckTypes() {
        return this.checkTypes;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dependentPolicyId
     */
    public Long getDependentPolicyId() {
        return this.dependentPolicyId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyShowName
     */
    public String getPolicyShowName() {
        return this.policyShowName;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListCheckPoliciesRequest, Builder> {
        private java.util.List<String> checkTypes; 
        private Integer currentPage; 
        private Long dependentPolicyId; 
        private String lang; 
        private Integer pageSize; 
        private Long policyId; 
        private String policyShowName; 
        private String policyType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckPoliciesRequest request) {
            super(request);
            this.checkTypes = request.checkTypes;
            this.currentPage = request.currentPage;
            this.dependentPolicyId = request.dependentPolicyId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
            this.policyShowName = request.policyShowName;
            this.policyType = request.policyType;
            this.type = request.type;
        } 

        /**
         * <p>The types of policies to be queried (default queries both custom and system predefined policies).</p>
         */
        public Builder checkTypes(java.util.List<String> checkTypes) {
            this.putQueryParameter("CheckTypes", checkTypes);
            this.checkTypes = checkTypes;
            return this;
        }

        /**
         * <p>Specifies the page number from which to start displaying the query results. The starting value is <strong>1</strong>. The default value is <strong>1</strong>, indicating that the display starts from the <strong>1st</strong> page.</p>
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
         * <p>ID of the associated parent policy.</p>
         * <p>(The specific dependency relationship from low to high is: Section -&gt; Requirement -&gt; Standard)</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000002</p>
         */
        public Builder dependentPolicyId(Long dependentPolicyId) {
            this.putQueryParameter("DependentPolicyId", dependentPolicyId);
            this.dependentPolicyId = dependentPolicyId;
            return this;
        }

        /**
         * <p>Language type for request and response messages, with a default value of <strong>zh</strong>. Possible values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Number of check item information entries displayed per page during pagination. The default value is <strong>50</strong>, indicating 50 entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>ID of the newly added classification setting.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000001</p>
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Name of the newly added classification setting.</p>
         * 
         * <strong>example:</strong>
         * <p>testPolicyName</p>
         */
        public Builder policyShowName(String policyShowName) {
            this.putQueryParameter("PolicyShowName", policyShowName);
            this.policyShowName = policyShowName;
            return this;
        }

        /**
         * <p>Policy type of the custom check item rule:</p>
         * <ul>
         * <li><strong>STANDARD</strong>: New standard</li>
         * <li><strong>REQUIREMENT</strong>: New requirement</li>
         * <li><strong>SECTION</strong>: New section</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>Name of the associated major policy category (required when PolicyType is STANDARD):</p>
         * <ul>
         * <li><strong>AISPM</strong>: AI Configuration Management (AI-SPM)</li>
         * <li><strong>IDENTITY_PERMISSION</strong>: Identity and Permission Management (CIEM)</li>
         * <li><strong>RISK</strong>: Security Risk</li>
         * <li><strong>COMPLIANCE</strong>: Compliance Risk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AISPM</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListCheckPoliciesRequest build() {
            return new ListCheckPoliciesRequest(this);
        } 

    } 

}
