// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerCriteriaRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerCriteriaRequest</p>
 */
public class DescribeContainerCriteriaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupField")
    private String groupField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private DescribeContainerCriteriaRequest(Builder builder) {
        super(builder);
        this.groupField = builder.groupField;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerCriteriaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupField
     */
    public String getGroupField() {
        return this.groupField;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<DescribeContainerCriteriaRequest, Builder> {
        private String groupField; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerCriteriaRequest request) {
            super(request);
            this.groupField = request.groupField;
            this.value = request.value;
        } 

        /**
         * The filter condition. Valid values:
         * <p>
         * 
         * *   **pod**: pod
         * *   **appName**: application name
         * *   **clusterId**: cluster ID
         * *   **namespace**: namespace
         * *   **image**: image
         * *   **containerScan**: container scan
         */
        public Builder groupField(String groupField) {
            this.putQueryParameter("GroupField", groupField);
            this.groupField = groupField;
            return this;
        }

        /**
         * The value of the filter condition. The value can be an application name, node name, namespace, cluster name, public IP address, pod address, region, pod, instance ID, cluster ID, or container ID. Fuzzy match is supported.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public DescribeContainerCriteriaRequest build() {
            return new DescribeContainerCriteriaRequest(this);
        } 

    } 

}
