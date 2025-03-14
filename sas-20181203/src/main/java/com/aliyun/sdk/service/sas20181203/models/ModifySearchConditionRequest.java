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
 * {@link ModifySearchConditionRequest} extends {@link RequestModel}
 *
 * <p>ModifySearchConditionRequest</p>
 */
public class ModifySearchConditionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterConditions")
    private String filterConditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ModifySearchConditionRequest(Builder builder) {
        super(builder);
        this.filterConditions = builder.filterConditions;
        this.name = builder.name;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySearchConditionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterConditions
     */
    public String getFilterConditions() {
        return this.filterConditions;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifySearchConditionRequest, Builder> {
        private String filterConditions; 
        private String name; 
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifySearchConditionRequest request) {
            super(request);
            this.filterConditions = request.filterConditions;
            this.name = request.name;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * <p>The filter condition. The value of this parameter is in the JSON format and is case-sensitive. The value contains the following fields:</p>
         * <ul>
         * <li><p><strong>filterParams</strong>: the filter-related parameters. The value is in the JSON format. Valid values:</p>
         * <ul>
         * <li><p><strong>label</strong>: the display name of the filter condition in the console.</p>
         * </li>
         * <li><p><strong>value</strong>: the settings of the filter condition. The value is in the JSON format. The value contains the following fields:</p>
         * <ul>
         * <li><strong>name</strong>: the name of the field for filtering. For more information, see the value description of name.</li>
         * <li><strong>value</strong>: the value of the field for filtering.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>LogicalExp</strong>: the logical relationship among multiple filter conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong></li>
         * <li><strong>AND</strong></li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> Value description of <strong>name</strong>:</p>
         * </blockquote>
         * <ul>
         * <li><p>If <strong>Type</strong> is set to <strong>ecs</strong>, you can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported filter conditions.</p>
         * </li>
         * <li><p>If <strong>Type</strong> is set to <strong>cloud_product</strong>, you can call the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation to query the supported filter conditions.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;filterParams&quot;: [
         *         {
         *             &quot;label&quot;: &quot;UUID：xxx&quot;,
         *             &quot;value&quot;: &quot;{&quot;name&quot;:&quot;uuidList&quot;,&quot;value&quot;:&quot;xxx&quot;}&quot;
         *         }
         *     ],
         *     &quot;LogicalExp&quot;: &quot;OR&quot;
         * }</p>
         */
        public Builder filterConditions(String filterConditions) {
            this.putQueryParameter("FilterConditions", filterConditions);
            this.filterConditions = filterConditions;
            return this;
        }

        /**
         * <p>The name of the common filter condition.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>27.223.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of the asset. Default value: <strong>ecs</strong>. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: host</li>
         * <li><strong>cloud_product</strong>: Alibaba Cloud service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifySearchConditionRequest build() {
            return new ModifySearchConditionRequest(this);
        } 

    } 

}
