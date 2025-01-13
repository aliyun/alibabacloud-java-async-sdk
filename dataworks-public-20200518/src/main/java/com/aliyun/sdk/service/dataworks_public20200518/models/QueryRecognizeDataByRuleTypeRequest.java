// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link QueryRecognizeDataByRuleTypeRequest} extends {@link RequestModel}
 *
 * <p>QueryRecognizeDataByRuleTypeRequest</p>
 */
public class QueryRecognizeDataByRuleTypeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecognizeRulesType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recognizeRulesType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private QueryRecognizeDataByRuleTypeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.recognizeRulesType = builder.recognizeRulesType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecognizeDataByRuleTypeRequest create() {
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
     * @return recognizeRulesType
     */
    public String getRecognizeRulesType() {
        return this.recognizeRulesType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryRecognizeDataByRuleTypeRequest, Builder> {
        private String regionId; 
        private String recognizeRulesType; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecognizeDataByRuleTypeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.recognizeRulesType = request.recognizeRulesType;
            this.tenantId = request.tenantId;
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
         * <p>The type of a sensitive data identification rule. You can call the <a href="https://help.aliyun.com/document_detail/2746905.html">QueryRecognizeRulesType</a> operation to obtain the type of the rule.</p>
         * <ul>
         * <li>1: regular expression</li>
         * <li>2: built-in rule</li>
         * <li>3: sample library</li>
         * <li>4: self-generated data identification model</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder recognizeRulesType(String recognizeRulesType) {
            this.putBodyParameter("RecognizeRulesType", recognizeRulesType);
            this.recognizeRulesType = recognizeRulesType;
            return this;
        }

        /**
         * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10241024</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QueryRecognizeDataByRuleTypeRequest build() {
            return new QueryRecognizeDataByRuleTypeRequest(this);
        } 

    } 

}
