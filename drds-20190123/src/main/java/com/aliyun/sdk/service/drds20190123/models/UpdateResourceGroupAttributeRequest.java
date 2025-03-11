// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link UpdateResourceGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceGroupAttributeRequest</p>
 */
public class UpdateResourceGroupAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateResourceGroupAttributeRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.newResourceGroupId = builder.newResourceGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceGroupAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return newResourceGroupId
     */
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateResourceGroupAttributeRequest, Builder> {
        private String drdsInstanceId; 
        private String newResourceGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceGroupAttributeRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
            this.newResourceGroupId = request.newResourceGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the instance that you want to transfer.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/139284.html">DescribeDrdsInstances</a> operation to view the details of the instances under the account, including the instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds***********</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the resource group that you want to specify.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to view the details of the resource groups, including the resource group IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-***************</p>
         */
        public Builder newResourceGroupId(String newResourceGroupId) {
            this.putQueryParameter("NewResourceGroupId", newResourceGroupId);
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the region where the instance you want to transfer is located.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/139284.html">DescribeDrdsInstances</a> operation to view the details of the instances under the account, including the region IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateResourceGroupAttributeRequest build() {
            return new UpdateResourceGroupAttributeRequest(this);
        } 

    } 

}
