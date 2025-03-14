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
         * <p>The filter condition. Valid values:</p>
         * <ul>
         * <li><strong>pod</strong>: pod</li>
         * <li><strong>appName</strong>: application name</li>
         * <li><strong>clusterId</strong>: cluster ID</li>
         * <li><strong>namespace</strong>: namespace</li>
         * <li><strong>image</strong>: image</li>
         * <li><strong>containerScan</strong>: container scan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clusterId</p>
         */
        public Builder groupField(String groupField) {
            this.putQueryParameter("GroupField", groupField);
            this.groupField = groupField;
            return this;
        }

        /**
         * <p>The value of the filter condition. The value can be an application name, node name, namespace, cluster name, public IP address, pod address, region, pod, instance ID, cluster ID, or container ID. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cfb41a869c71e4678a97021582dd8a****</p>
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
