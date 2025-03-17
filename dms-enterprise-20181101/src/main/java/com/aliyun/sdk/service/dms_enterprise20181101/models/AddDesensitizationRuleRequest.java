// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link AddDesensitizationRuleRequest} extends {@link RequestModel}
 *
 * <p>AddDesensitizationRuleRequest</p>
 */
public class AddDesensitizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FunctionParams")
    private java.util.List<java.util.Map<String, String>> functionParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleDescription")
    private String ruleDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private AddDesensitizationRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.functionParams = builder.functionParams;
        this.functionType = builder.functionType;
        this.ruleDescription = builder.ruleDescription;
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDesensitizationRuleRequest create() {
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
     * @return functionParams
     */
    public java.util.List<java.util.Map<String, String>> getFunctionParams() {
        return this.functionParams;
    }

    /**
     * @return functionType
     */
    public String getFunctionType() {
        return this.functionType;
    }

    /**
     * @return ruleDescription
     */
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<AddDesensitizationRuleRequest, Builder> {
        private String regionId; 
        private java.util.List<java.util.Map<String, String>> functionParams; 
        private String functionType; 
        private String ruleDescription; 
        private String ruleName; 
        private String ruleType; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(AddDesensitizationRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.functionParams = request.functionParams;
            this.functionType = request.functionType;
            this.ruleDescription = request.ruleDescription;
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
            this.tid = request.tid;
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
         * <p>The parameters of the algorithm.</p>
         */
        public Builder functionParams(java.util.List<java.util.Map<String, String>> functionParams) {
            this.putBodyParameter("FunctionParams", functionParams);
            this.functionParams = functionParams;
            return this;
        }

        /**
         * <p>The type of the masking algorithm.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>FIX_POS : masks characters in the specified position.</li>
         * <li>DATE_ROUNDING: rounds the date.</li>
         * <li>PLAINTEXT: does not mask data.</li>
         * <li>SHA1: masks characters by using the secure hash algorithm 1 (SHA-1)</li>
         * <li>HMAC: masks characters by using the hash-based message authentication code (HMAC).</li>
         * <li>STRING_TRANSFORM: shift characters.</li>
         * <li>NUMBER_ROUNDING: rounds numbers.</li>
         * <li>AES: masks characters by using the advanced encryption standard (AES) algorithm.</li>
         * <li>SHA256: masks characters by using SHA-256 algorithm.</li>
         * <li>DES: masks characters by using the data encryption standard (DES) algorithm.</li>
         * <li>MAP_REPLACE: masks the mapped data.</li>
         * <li>FIX_CHAR: masks fixed characters.</li>
         * <li>DEFAULT: masks all characters.</li>
         * <li>RANDOM_REPLACE: randomly replaces characters.</li>
         * <li>MD5: masks characters by using the MD5 algorithm.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MD5</p>
         */
        public Builder functionType(String functionType) {
            this.putQueryParameter("FunctionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>hash algorithm</p>
         */
        public Builder ruleDescription(String ruleDescription) {
            this.putQueryParameter("RuleDescription", ruleDescription);
            this.ruleDescription = ruleDescription;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>desensitization algorithm test</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The masking algorithm.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>PLAINTEXT</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>TRANSFORM</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ENCRYPT</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>REPLACE</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>HASH</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>MASK</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HASH</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <blockquote>
         * <p> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public AddDesensitizationRuleRequest build() {
            return new AddDesensitizationRuleRequest(this);
        } 

    } 

}
