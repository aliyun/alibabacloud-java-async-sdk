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
 * {@link DescribeContainerGroupedFieldDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerGroupedFieldDetailRequest</p>
 */
public class DescribeContainerGroupedFieldDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    @com.aliyun.core.annotation.Validation(required = true)
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupField")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupField;

    private DescribeContainerGroupedFieldDetailRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.groupField = builder.groupField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerGroupedFieldDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return groupField
     */
    public String getGroupField() {
        return this.groupField;
    }

    public static final class Builder extends Request.Builder<DescribeContainerGroupedFieldDetailRequest, Builder> {
        private String criteria; 
        private String groupField; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerGroupedFieldDetailRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.groupField = request.groupField;
        } 

        /**
         * <p>The search conditions that are used to query assets. The value of this parameter is in the JSON format. Separate multiple search conditions with commas (,). Example: <code>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;riskLevel&quot;,&quot;value&quot;:&quot;2&quot;}]</code>.</p>
         * <blockquote>
         * <p> Supported search conditions include the instance ID, instance name, virtual private cloud (VPC) ID, region, and public IP address. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;clusterId&quot;,&quot;value&quot;:&quot;cfd26658431084c73a48dd97328ba8acf&quot;}]</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The filter condition for a grouping and aggregation query. Valid values:</p>
         * <ul>
         * <li><strong>pod</strong></li>
         * <li><strong>appName</strong></li>
         * <li><strong>clusterId</strong></li>
         * <li><strong>namespace</strong></li>
         * <li><strong>image</strong></li>
         * <li><strong>containerScan</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pod</p>
         */
        public Builder groupField(String groupField) {
            this.putQueryParameter("GroupField", groupField);
            this.groupField = groupField;
            return this;
        }

        @Override
        public DescribeContainerGroupedFieldDetailRequest build() {
            return new DescribeContainerGroupedFieldDetailRequest(this);
        } 

    } 

}
