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
 * {@link CreateImageFromAppInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateImageFromAppInstanceGroupRequest</p>
 */
public class CreateImageFromAppInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppCenterImageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCenterImageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    private CreateImageFromAppInstanceGroupRequest(Builder builder) {
        super(builder);
        this.appCenterImageName = builder.appCenterImageName;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageFromAppInstanceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCenterImageName
     */
    public String getAppCenterImageName() {
        return this.appCenterImageName;
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<CreateImageFromAppInstanceGroupRequest, Builder> {
        private String appCenterImageName; 
        private String appInstanceGroupId; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageFromAppInstanceGroupRequest request) {
            super(request);
            this.appCenterImageName = request.appCenterImageName;
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.productType = request.productType;
        } 

        /**
         * <p>The image name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        public Builder appCenterImageName(String appCenterImageName) {
            this.putBodyParameter("AppCenterImageName", appCenterImageName);
            this.appCenterImageName = appCenterImageName;
            return this;
        }

        /**
         * <p>The ID of the delivery group. You can call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> operation to obtain the ID.</p>
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
        public CreateImageFromAppInstanceGroupRequest build() {
            return new CreateImageFromAppInstanceGroupRequest(this);
        } 

    } 

}
