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
    @com.aliyun.core.annotation.NameInMap("IncludeMulticloud")
    private Boolean includeMulticloud;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private DescribeContainerCriteriaRequest(Builder builder) {
        super(builder);
        this.groupField = builder.groupField;
        this.includeMulticloud = builder.includeMulticloud;
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
     * @return includeMulticloud
     */
    public Boolean getIncludeMulticloud() {
        return this.includeMulticloud;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<DescribeContainerCriteriaRequest, Builder> {
        private String groupField; 
        private Boolean includeMulticloud; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerCriteriaRequest request) {
            super(request);
            this.groupField = request.groupField;
            this.includeMulticloud = request.includeMulticloud;
            this.value = request.value;
        } 

        /**
         * <p>The search field. Valid values:</p>
         * <ul>
         * <li><strong>pod</strong>: Pod.</li>
         * <li><strong>appName</strong>: Application name.</li>
         * <li><strong>clusterId</strong>: Cluster ID.</li>
         * <li><strong>namespace</strong>: Namespace.</li>
         * <li><strong>image</strong>: Image.</li>
         * <li><strong>containerScan</strong>: Container scan.</li>
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
         * <p>Specifies whether to include connected multi-cloud clusters in the cluster search criteria. If this parameter is set to true, GroupField must be set to clusterId. If this parameter is not specified or is set to false, the original search criteria are used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeMulticloud(Boolean includeMulticloud) {
            this.putQueryParameter("IncludeMulticloud", includeMulticloud);
            this.includeMulticloud = includeMulticloud;
            return this;
        }

        /**
         * <p>The value of the search field. Fuzzy search is supported for application names, node names, namespaces, cluster names, public IP addresses, pod IP addresses, regions, pods, instance IDs, cluster IDs, and container IDs.</p>
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
