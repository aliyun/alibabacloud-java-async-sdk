// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySubscriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifySubscriptionRequest</p>
 */
public class ModifySubscriptionRequest extends Request {
    @Query
    @NameInMap("DbList")
    @Validation(required = true)
    private String dbList;

    @Query
    @NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @Query
    @NameInMap("DtsJobId")
    private String dtsJobId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SubscriptionDataTypeDDL")
    @Validation(required = true)
    private Boolean subscriptionDataTypeDDL;

    @Query
    @NameInMap("SubscriptionDataTypeDML")
    @Validation(required = true)
    private Boolean subscriptionDataTypeDML;

    private ModifySubscriptionRequest(Builder builder) {
        super(builder);
        this.dbList = builder.dbList;
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
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
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.subscriptionDataTypeDDL = request.subscriptionDataTypeDDL;
            this.subscriptionDataTypeDML = request.subscriptionDataTypeDML;
        } 

        /**
         * The objects of the change tracking task. The value is a JSON string. For more information, see [Objects of DTS tasks](~~209545~~).
         * <p>
         * 
         * >  You can call the [DescribeDtsJobDetail](~~208925~~) operation to query the original objects of the task.
         */
        public Builder dbList(String dbList) {
            this.putQueryParameter("DbList", dbList);
            this.dbList = dbList;
            return this;
        }

        /**
         * The ID of the change tracking instance. You can call the [DescribeDtsJobs](~~209702~~) operation to query the instance ID.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * The ID of the change tracking task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The ID of the region where the change tracking instance resides. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Specifies whether to retrieve data definition language (DDL) statements. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder subscriptionDataTypeDDL(Boolean subscriptionDataTypeDDL) {
            this.putQueryParameter("SubscriptionDataTypeDDL", subscriptionDataTypeDDL);
            this.subscriptionDataTypeDDL = subscriptionDataTypeDDL;
            return this;
        }

        /**
         * Specifies whether to retrieve data manipulation language (DML) statements. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
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
