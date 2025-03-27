// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DeleteAppInstancesRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppInstancesRequest</p>
 */
public class DeleteAppInstancesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> appInstanceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    private DeleteAppInstancesRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceIds = builder.appInstanceIds;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceIds
     */
    public java.util.List<String> getAppInstanceIds() {
        return this.appInstanceIds;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<DeleteAppInstancesRequest, Builder> {
        private String appInstanceGroupId; 
        private java.util.List<String> appInstanceIds; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppInstancesRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceIds = request.appInstanceIds;
            this.productType = request.productType;
        } 

        /**
         * <p>The ID of the delivery group. You can call the <a href="https://help.aliyun.com/document_detail/428506.html">listAppInstanceGroup</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The IDs of application instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder appInstanceIds(java.util.List<String> appInstanceIds) {
            this.putBodyParameter("AppInstanceIds", appInstanceIds);
            this.appInstanceIds = appInstanceIds;
            return this;
        }

        /**
         * <p>The product type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>CloudApp: App Streaming</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public DeleteAppInstancesRequest build() {
            return new DeleteAppInstancesRequest(this);
        } 

    } 

}
