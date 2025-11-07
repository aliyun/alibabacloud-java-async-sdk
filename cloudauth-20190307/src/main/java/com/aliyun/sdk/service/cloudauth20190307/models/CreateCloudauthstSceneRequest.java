// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link CreateCloudauthstSceneRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudauthstSceneRequest</p>
 */
public class CreateCloudauthstSceneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoreImage")
    private String storeImage;

    private CreateCloudauthstSceneRequest(Builder builder) {
        super(builder);
        this.productCode = builder.productCode;
        this.sceneName = builder.sceneName;
        this.storeImage = builder.storeImage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudauthstSceneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    /**
     * @return storeImage
     */
    public String getStoreImage() {
        return this.storeImage;
    }

    public static final class Builder extends Request.Builder<CreateCloudauthstSceneRequest, Builder> {
        private String productCode; 
        private String sceneName; 
        private String storeImage; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudauthstSceneRequest request) {
            super(request);
            this.productCode = request.productCode;
            this.sceneName = request.sceneName;
            this.storeImage = request.storeImage;
        } 

        /**
         * <p>Product code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SMART_COMPARE</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Scene name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试场景</p>
         */
        public Builder sceneName(String sceneName) {
            this.putQueryParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        /**
         * <p>Whether to deliver the files generated from the authentication to the customer&quot;s OSS:</p>
         * <ul>
         * <li><strong>Y</strong>: Enable</li>
         * <li><strong>N</strong>: Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder storeImage(String storeImage) {
            this.putQueryParameter("StoreImage", storeImage);
            this.storeImage = storeImage;
            return this;
        }

        @Override
        public CreateCloudauthstSceneRequest build() {
            return new CreateCloudauthstSceneRequest(this);
        } 

    } 

}
