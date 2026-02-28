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
 * {@link ImportThingModelTslRequest} extends {@link RequestModel}
 *
 * <p>ImportThingModelTslRequest</p>
 */
public class ImportThingModelTslRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionBlockId")
    private String functionBlockId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionBlockName")
    private String functionBlockName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TslStr")
    private String tslStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TslUrl")
    private String tslUrl;

    private ImportThingModelTslRequest(Builder builder) {
        super(builder);
        this.functionBlockId = builder.functionBlockId;
        this.functionBlockName = builder.functionBlockName;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.resourceGroupId = builder.resourceGroupId;
        this.tslStr = builder.tslStr;
        this.tslUrl = builder.tslUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportThingModelTslRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionBlockId
     */
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    /**
     * @return functionBlockName
     */
    public String getFunctionBlockName() {
        return this.functionBlockName;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tslStr
     */
    public String getTslStr() {
        return this.tslStr;
    }

    /**
     * @return tslUrl
     */
    public String getTslUrl() {
        return this.tslUrl;
    }

    public static final class Builder extends Request.Builder<ImportThingModelTslRequest, Builder> {
        private String functionBlockId; 
        private String functionBlockName; 
        private String iotInstanceId; 
        private String productKey; 
        private String resourceGroupId; 
        private String tslStr; 
        private String tslUrl; 

        private Builder() {
            super();
        } 

        private Builder(ImportThingModelTslRequest request) {
            super(request);
            this.functionBlockId = request.functionBlockId;
            this.functionBlockName = request.functionBlockName;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.resourceGroupId = request.resourceGroupId;
            this.tslStr = request.tslStr;
            this.tslUrl = request.tslUrl;
        } 

        /**
         * <p>The identifier of the custom TSL module. Each identifier is unique in a product. The identifier must be 1 to 30 characters in length, and can contain letters, digits, and underscores (_).</p>
         * <p>This parameter must be used in combination with the <strong>FunctionBlockName</strong> parameter. If you do not specify this parameter, the system imports the default module.</p>
         * 
         * <strong>example:</strong>
         * <p>BatteryModule</p>
         */
        public Builder functionBlockId(String functionBlockId) {
            this.putQueryParameter("FunctionBlockId", functionBlockId);
            this.functionBlockId = functionBlockId;
            return this;
        }

        /**
         * <p>The name of the custom module. The name must be 4 to 30 characters in length, and can contain letters, digits, and underscores (_).</p>
         * <p>This parameter must be used in combination with the <strong>FunctionBlockId</strong> parameter. If you do not specify this parameter, the system imports the default module.</p>
         */
        public Builder functionBlockName(String functionBlockName) {
            this.putQueryParameter("FunctionBlockName", functionBlockName);
            this.functionBlockName = functionBlockName;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
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
         * <p>The ProductKey of the product.</p>
         * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * <blockquote>
         * <p> You cannot specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm4l5tcwd****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The TSL model to be edited. The value is a JSON string. The TSL model defines the properties, services, and events of the product.</p>
         * <p>The value of the <strong>TslStr</strong> parameter must conform to the standard TSL data format. For more information, see <a href="https://help.aliyun.com/document_detail/73727.html">TSL data format</a>.</p>
         * <blockquote>
         * <p> To import a TSL model, you must specify the <strong>TslStr</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;schema&quot;:&quot;<a href="https://iotx-tsl.oss-ap-southeast-1.aliyuncs.com/schema.json%22,%22profile%22:%7B%22productKey%22:%22a14TeW****%22%7D,%22properties%22:%5B%5D%7D">https://iotx-tsl.oss-ap-southeast-1.aliyuncs.com/schema.json&quot;,&quot;profile&quot;:{&quot;productKey&quot;:&quot;a14TeW****&quot;},&quot;properties&quot;:[]}</a></p>
         */
        public Builder tslStr(String tslStr) {
            this.putQueryParameter("TslStr", tslStr);
            this.tslStr = tslStr;
            return this;
        }

        /**
         * <p>The URI that is used to store the TSL data in Object Storage Service (OSS).</p>
         * <blockquote>
         * <p> This parameter does not take effect. To import a TSL model, you must specify the <strong>TslStr</strong> parameter.</p>
         * </blockquote>
         */
        public Builder tslUrl(String tslUrl) {
            this.putQueryParameter("TslUrl", tslUrl);
            this.tslUrl = tslUrl;
            return this;
        }

        @Override
        public ImportThingModelTslRequest build() {
            return new ImportThingModelTslRequest(this);
        } 

    } 

}
