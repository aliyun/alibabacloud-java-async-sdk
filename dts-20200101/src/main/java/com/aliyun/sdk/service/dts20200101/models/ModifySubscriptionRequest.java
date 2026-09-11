// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link ModifySubscriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifySubscriptionRequest</p>
 */
public class ModifySubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbList")
    private String dbList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reserved")
    private String reserved;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionDataTypeDDL")
    private Boolean subscriptionDataTypeDDL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionDataTypeDML")
    private Boolean subscriptionDataTypeDML;

    private ModifySubscriptionRequest(Builder builder) {
        super(builder);
        this.dbList = builder.dbList;
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.modifyType = builder.modifyType;
        this.regionId = builder.regionId;
        this.reserved = builder.reserved;
        this.resourceGroupId = builder.resourceGroupId;
        this.subscriptionDataTypeDDL = builder.subscriptionDataTypeDDL;
        this.subscriptionDataTypeDML = builder.subscriptionDataTypeDML;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySubscriptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbList
     */
    public String getDbList() {
        return this.dbList;
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reserved
     */
    public String getReserved() {
        return this.reserved;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subscriptionDataTypeDDL
     */
    public Boolean getSubscriptionDataTypeDDL() {
        return this.subscriptionDataTypeDDL;
    }

    /**
     * @return subscriptionDataTypeDML
     */
    public Boolean getSubscriptionDataTypeDML() {
        return this.subscriptionDataTypeDML;
    }

    public static final class Builder extends Request.Builder<ModifySubscriptionRequest, Builder> {
        private String dbList; 
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String modifyType; 
        private String regionId; 
        private String reserved; 
        private String resourceGroupId; 
        private Boolean subscriptionDataTypeDDL; 
        private Boolean subscriptionDataTypeDML; 

        private Builder() {
            super();
        } 

        private Builder(ModifySubscriptionRequest request) {
            super(request);
            this.dbList = request.dbList;
            this.dtsInstanceId = request.dtsInstanceId;
            this.dtsJobId = request.dtsJobId;
            this.modifyType = request.modifyType;
            this.regionId = request.regionId;
            this.reserved = request.reserved;
            this.resourceGroupId = request.resourceGroupId;
            this.subscriptionDataTypeDDL = request.subscriptionDataTypeDDL;
            this.subscriptionDataTypeDML = request.subscriptionDataTypeDML;
        } 

        /**
         * <p>The modified subscription objects, in JSON format. For more information about the definition, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
         * <blockquote>
         * <ul>
         * <li>The new DbList value overwrites the original DbList value. Make sure that the new DbList value contains all the objects that you want to track. Otherwise, objects may be lost. Modify this parameter with caution.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>You can call <a href="https://help.aliyun.com/document_detail/208925.html">DescribeDtsJobDetail</a> to query the original subscription objects.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dtstest&quot;:{&quot;name&quot;:&quot;dtstest&quot;,&quot;all&quot;:true}}</p>
         */
        public Builder dbList(String dbList) {
            this.putQueryParameter("DbList", dbList);
            this.dbList = dbList;
            return this;
        }

        /**
         * <p>The ID of the change tracking instance. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsboss6pn1w******</p>
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the change tracking task. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>boss6pn1w******</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * ModifyType.
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * <p>The region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Reserved.
         */
        public Builder reserved(String reserved) {
            this.putQueryParameter("Reserved", reserved);
            this.reserved = reserved;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies whether the modified task subscribes to DDL data. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The task subscribes to DDL data.</li>
         * <li><strong>false</strong>: The task does not subscribe to DDL data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder subscriptionDataTypeDDL(Boolean subscriptionDataTypeDDL) {
            this.putQueryParameter("SubscriptionDataTypeDDL", subscriptionDataTypeDDL);
            this.subscriptionDataTypeDDL = subscriptionDataTypeDDL;
            return this;
        }

        /**
         * <p>Specifies whether the modified task subscribes to DML data. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The task subscribes to DML data.</li>
         * <li><strong>false</strong>: The task does not subscribe to DML data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder subscriptionDataTypeDML(Boolean subscriptionDataTypeDML) {
            this.putQueryParameter("SubscriptionDataTypeDML", subscriptionDataTypeDML);
            this.subscriptionDataTypeDML = subscriptionDataTypeDML;
            return this;
        }

        @Override
        public ModifySubscriptionRequest build() {
            return new ModifySubscriptionRequest(this);
        } 

    } 

}
