// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetThingTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetThingTemplateRequest</p>
 */
public class GetThingTemplateRequest extends Request {
    @Query
    @NameInMap("CategoryKey")
    private String categoryKey;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private GetThingTemplateRequest(Builder builder) {
        super(builder);
        this.categoryKey = builder.categoryKey;
        this.iotInstanceId = builder.iotInstanceId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThingTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryKey
     */
    public String getCategoryKey() {
        return this.categoryKey;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<GetThingTemplateRequest, Builder> {
        private String categoryKey; 
        private String iotInstanceId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetThingTemplateRequest response) {
            super(response);
            this.categoryKey = response.categoryKey;
            this.iotInstanceId = response.iotInstanceId;
            this.resourceGroupId = response.resourceGroupId;
        } 

        /**
         * CategoryKey.
         */
        public Builder categoryKey(String categoryKey) {
            this.putQueryParameter("CategoryKey", categoryKey);
            this.categoryKey = categoryKey;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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

        @Override
        public GetThingTemplateRequest build() {
            return new GetThingTemplateRequest(this);
        } 

    } 

}
