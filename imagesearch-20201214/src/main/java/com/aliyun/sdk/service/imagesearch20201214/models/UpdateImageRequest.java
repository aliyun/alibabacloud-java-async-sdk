// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link UpdateImageRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageRequest</p>
 */
public class UpdateImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomContent")
    private String customContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntAttr")
    private Integer intAttr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntAttr2")
    private Integer intAttr2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntAttr3")
    private Integer intAttr3;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntAttr4")
    private Integer intAttr4;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String picName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrAttr")
    private String strAttr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrAttr2")
    private String strAttr2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrAttr3")
    private String strAttr3;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrAttr4")
    private String strAttr4;

    private UpdateImageRequest(Builder builder) {
        super(builder);
        this.customContent = builder.customContent;
        this.instanceName = builder.instanceName;
        this.intAttr = builder.intAttr;
        this.intAttr2 = builder.intAttr2;
        this.intAttr3 = builder.intAttr3;
        this.intAttr4 = builder.intAttr4;
        this.picName = builder.picName;
        this.productId = builder.productId;
        this.strAttr = builder.strAttr;
        this.strAttr2 = builder.strAttr2;
        this.strAttr3 = builder.strAttr3;
        this.strAttr4 = builder.strAttr4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customContent
     */
    public String getCustomContent() {
        return this.customContent;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return intAttr
     */
    public Integer getIntAttr() {
        return this.intAttr;
    }

    /**
     * @return intAttr2
     */
    public Integer getIntAttr2() {
        return this.intAttr2;
    }

    /**
     * @return intAttr3
     */
    public Integer getIntAttr3() {
        return this.intAttr3;
    }

    /**
     * @return intAttr4
     */
    public Integer getIntAttr4() {
        return this.intAttr4;
    }

    /**
     * @return picName
     */
    public String getPicName() {
        return this.picName;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return strAttr
     */
    public String getStrAttr() {
        return this.strAttr;
    }

    /**
     * @return strAttr2
     */
    public String getStrAttr2() {
        return this.strAttr2;
    }

    /**
     * @return strAttr3
     */
    public String getStrAttr3() {
        return this.strAttr3;
    }

    /**
     * @return strAttr4
     */
    public String getStrAttr4() {
        return this.strAttr4;
    }

    public static final class Builder extends Request.Builder<UpdateImageRequest, Builder> {
        private String customContent; 
        private String instanceName; 
        private Integer intAttr; 
        private Integer intAttr2; 
        private Integer intAttr3; 
        private Integer intAttr4; 
        private String picName; 
        private String productId; 
        private String strAttr; 
        private String strAttr2; 
        private String strAttr3; 
        private String strAttr4; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageRequest request) {
            super(request);
            this.customContent = request.customContent;
            this.instanceName = request.instanceName;
            this.intAttr = request.intAttr;
            this.intAttr2 = request.intAttr2;
            this.intAttr3 = request.intAttr3;
            this.intAttr4 = request.intAttr4;
            this.picName = request.picName;
            this.productId = request.productId;
            this.strAttr = request.strAttr;
            this.strAttr2 = request.strAttr2;
            this.strAttr3 = request.strAttr3;
            this.strAttr4 = request.strAttr4;
        } 

        /**
         * <p>The user-defined content. The value can be up to 4,096 characters in length.</p>
         * <blockquote>
         * <p> If you set this parameter, the response includes this parameter and its value. You can add text such as an image description.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zidingyi</p>
         */
        public Builder customContent(String customContent) {
            this.putBodyParameter("CustomContent", customContent);
            this.customContent = customContent;
            return this;
        }

        /**
         * <p>The name of the Image Search instance. The name can be up to 20 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demoinstance1</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The attribute, which is an integer. The attribute can be used to filter images when you search for images. If you set this parameter, the response includes this parameter and its value.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder intAttr(Integer intAttr) {
            this.putBodyParameter("IntAttr", intAttr);
            this.intAttr = intAttr;
            return this;
        }

        /**
         * IntAttr2.
         */
        public Builder intAttr2(Integer intAttr2) {
            this.putBodyParameter("IntAttr2", intAttr2);
            this.intAttr2 = intAttr2;
            return this;
        }

        /**
         * IntAttr3.
         */
        public Builder intAttr3(Integer intAttr3) {
            this.putQueryParameter("IntAttr3", intAttr3);
            this.intAttr3 = intAttr3;
            return this;
        }

        /**
         * IntAttr4.
         */
        public Builder intAttr4(Integer intAttr4) {
            this.putQueryParameter("IntAttr4", intAttr4);
            this.intAttr4 = intAttr4;
            return this;
        }

        /**
         * <p>The name of the image. The name can be up to 512 characters in length.</p>
         * <blockquote>
         * <ul>
         * <li>An image is uniquely identified by the values of the ProductId and PicName parameters.</li>
         * <li>If you add an image whose product ID (ProductId) and image name (PicName) are the same as those of an existing image, the newly added image overwrites the existing image.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>namexxx.jpg</p>
         */
        public Builder picName(String picName) {
            this.putBodyParameter("PicName", picName);
            this.picName = picName;
            return this;
        }

        /**
         * <p>The ID of the product. The ID can be up to 512 characters in length.</p>
         * <blockquote>
         * <p> A product may have multiple images.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2092061_1</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The attribute, which is a string. The value can be up to 128 characters in length. The attribute can be used to filter images. If you set this parameter, the response includes this parameter and its value.</p>
         * 
         * <strong>example:</strong>
         * <p>ss</p>
         */
        public Builder strAttr(String strAttr) {
            this.putBodyParameter("StrAttr", strAttr);
            this.strAttr = strAttr;
            return this;
        }

        /**
         * StrAttr2.
         */
        public Builder strAttr2(String strAttr2) {
            this.putBodyParameter("StrAttr2", strAttr2);
            this.strAttr2 = strAttr2;
            return this;
        }

        /**
         * StrAttr3.
         */
        public Builder strAttr3(String strAttr3) {
            this.putQueryParameter("StrAttr3", strAttr3);
            this.strAttr3 = strAttr3;
            return this;
        }

        /**
         * StrAttr4.
         */
        public Builder strAttr4(String strAttr4) {
            this.putQueryParameter("StrAttr4", strAttr4);
            this.strAttr4 = strAttr4;
            return this;
        }

        @Override
        public UpdateImageRequest build() {
            return new UpdateImageRequest(this);
        } 

    } 

}
