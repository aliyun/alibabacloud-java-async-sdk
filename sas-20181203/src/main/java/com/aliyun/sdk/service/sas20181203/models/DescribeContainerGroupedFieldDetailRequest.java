// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The search conditions that are used to query assets. The value of this parameter is in the JSON format. Separate multiple search conditions with commas (,). Example: `[{"name":"riskStatus","value":"YES"},{"name":"riskLevel","value":"2"}]`.
         * <p>
         * 
         * >  Supported search conditions include the instance ID, instance name, virtual private cloud (VPC) ID, region, and public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * The filter condition for a grouping and aggregation query. Valid values:
         * <p>
         * 
         * *   **pod**
         * *   **appName**
         * *   **clusterId**
         * *   **namespace**
         * *   **image**
         * *   **containerScan**
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
