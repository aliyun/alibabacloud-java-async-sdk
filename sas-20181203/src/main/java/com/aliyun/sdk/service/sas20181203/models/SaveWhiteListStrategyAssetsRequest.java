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
 * {@link SaveWhiteListStrategyAssetsRequest} extends {@link RequestModel}
 *
 * <p>SaveWhiteListStrategyAssetsRequest</p>
 */
public class SaveWhiteListStrategyAssetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operations")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer relationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long strategyId;

    private SaveWhiteListStrategyAssetsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.operations = builder.operations;
        this.relationType = builder.relationType;
        this.sourceIp = builder.sourceIp;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWhiteListStrategyAssetsRequest create() {
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
     * @return operations
     */
    public String getOperations() {
        return this.operations;
    }

    /**
     * @return relationType
     */
    public Integer getRelationType() {
        return this.relationType;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder extends Request.Builder<SaveWhiteListStrategyAssetsRequest, Builder> {
        private String lang; 
        private String operations; 
        private Integer relationType; 
        private String sourceIp; 
        private Long strategyId; 

        private Builder() {
            super();
        } 

        private Builder(SaveWhiteListStrategyAssetsRequest request) {
            super(request);
            this.lang = request.lang;
            this.operations = request.operations;
            this.relationType = request.relationType;
            this.sourceIp = request.sourceIp;
            this.strategyId = request.strategyId;
        } 

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The operation that you want to perform. This parameter is in the JSON format. The value is case-sensitive. The value contains the following fields:</p>
         * <ul>
         * <li><p><strong>status</strong>: the operation. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the delete operation.</li>
         * <li><strong>1</strong>: the add operation.</li>
         * </ul>
         * </li>
         * <li><p><strong>target</strong>: the UUID of the server.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the value of <strong>target</strong> from the response parameter Uuid.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;status&quot;:0,&quot;target&quot;:&quot;c98dcd24-fa57-4759-b5ec-f8a4ffeed****&quot;}]</p>
         */
        public Builder operations(String operations) {
            this.putQueryParameter("Operations", operations);
            this.operations = operations;
            return this;
        }

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: learning policy.</li>
         * <li><strong>2</strong>: application policy.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder relationType(Integer relationType) {
            this.putQueryParameter("RelationType", relationType);
            this.relationType = relationType;
            return this;
        }

        /**
         * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>115.193.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The ID of the policy.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2730</p>
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public SaveWhiteListStrategyAssetsRequest build() {
            return new SaveWhiteListStrategyAssetsRequest(this);
        } 

    } 

}
