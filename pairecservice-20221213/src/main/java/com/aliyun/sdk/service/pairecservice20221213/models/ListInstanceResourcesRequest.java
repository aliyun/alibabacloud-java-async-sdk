// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListInstanceResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceResourcesRequest</p>
 */
public class ListInstanceResourcesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListInstanceResourcesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.category = builder.category;
        this.group = builder.group;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListInstanceResourcesRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String category; 
        private String group; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceResourcesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.category = request.category;
            this.group = request.group;
            this.type = request.type;
        } 

        /**
         * <p>The instance ID. You can obtain the instance ID by calling the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-test1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
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
         * <p>The category of the resource. Valid values:</p>
         * <ul>
         * <li><p>DataManagement</p>
         * </li>
         * <li><p>Engine</p>
         * </li>
         * <li><p>Monitor</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataManagement</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The group of the resource.</p>
         * <p>If <code>Category</code> is <code>DataManagement</code>, valid values are:</p>
         * <ul>
         * <li><p>storage</p>
         * </li>
         * <li><p>modelpipeline</p>
         * </li>
         * <li><p>datastorage</p>
         * </li>
         * <li><p>modeltrain</p>
         * </li>
         * </ul>
         * <p>If <code>Category</code> is <code>Engine</code>, valid values are:</p>
         * <ul>
         * <li><p>feature</p>
         * </li>
         * <li><p>predict</p>
         * </li>
         * <li><p>recall</p>
         * </li>
         * <li><p>recengine</p>
         * </li>
         * </ul>
         * <p>If <code>Category</code> is <code>Monitor</code>, valid values are:</p>
         * <ul>
         * <li><p>logs</p>
         * </li>
         * <li><p>logsback</p>
         * </li>
         * <li><p>coldstart</p>
         * </li>
         * <li><p>deploy</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>storage</p>
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * <p>The type of the resource. If specified, only resources of this type are returned.</p>
         * <ul>
         * <li><p>Hologres</p>
         * </li>
         * <li><p>EAS</p>
         * </li>
         * <li><p>BE</p>
         * </li>
         * <li><p>Rec</p>
         * </li>
         * <li><p>Platform</p>
         * </li>
         * <li><p>SLS</p>
         * </li>
         * <li><p>DataHub</p>
         * </li>
         * <li><p>ApsaraMQ for Kafka</p>
         * </li>
         * <li><p>Realtime Compute for Apache Flink</p>
         * </li>
         * <li><p>ACR</p>
         * </li>
         * <li><p>OSS</p>
         * </li>
         * <li><p>DataWorks</p>
         * </li>
         * <li><p>PAI</p>
         * </li>
         * <li><p>MaxCompute</p>
         * </li>
         * <li><p>Graph Compute Service</p>
         * </li>
         * <li><p>ApsaraDB for Redis</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListInstanceResourcesRequest build() {
            return new ListInstanceResourcesRequest(this);
        } 

    } 

}
