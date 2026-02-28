// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link GetThingTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetThingTemplateRequest</p>
 */
public class GetThingTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryKey")
    private String categoryKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
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

        private Builder(GetThingTemplateRequest request) {
            super(request);
            this.categoryKey = request.categoryKey;
            this.iotInstanceId = request.iotInstanceId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Lighting</p>
         */
        public Builder categoryKey(String categoryKey) {
            this.putQueryParameter("CategoryKey", categoryKey);
            this.categoryKey = categoryKey;
            return this;
        }

        /**
         * <p>The identifier of the category that you want to query.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/150316.html">ListThingTemplates</a> operation and view all category keys in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm4l5tcwd****</p>
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
