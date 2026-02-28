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
 * {@link CreateThingScriptRequest} extends {@link RequestModel}
 *
 * <p>CreateThingScriptRequest</p>
 */
public class CreateThingScriptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptType;

    private CreateThingScriptRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.scriptContent = builder.scriptContent;
        this.scriptType = builder.scriptType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateThingScriptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return scriptContent
     */
    public String getScriptContent() {
        return this.scriptContent;
    }

    /**
     * @return scriptType
     */
    public String getScriptType() {
        return this.scriptType;
    }

    public static final class Builder extends Request.Builder<CreateThingScriptRequest, Builder> {
        private String iotInstanceId; 
        private String productKey; 
        private String scriptContent; 
        private String scriptType; 

        private Builder() {
            super();
        } 

        private Builder(CreateThingScriptRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.scriptContent = request.scriptContent;
            this.scriptType = request.scriptType;
        } 

        /**
         * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</li>
         * <li>If the <strong>Overview</strong> page does not appear in the console or no ID is generated for your instance, you do not need to specify this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product.</p>
         * <p>You can view the <strong>ProductKey</strong> on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1Q5XoY****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The content of the script. You must specify this parameter.</p>
         * <p>For more information about script examples, see <a href="https://help.aliyun.com/document_detail/68702.html">What is data parsing</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;function protocolToRawData(jsonObj) {return rawdata; }function rawDataToProtocol(rawData) {return jsonObj; }&quot;</p>
         */
        public Builder scriptContent(String scriptContent) {
            this.putQueryParameter("ScriptContent", scriptContent);
            this.scriptContent = scriptContent;
            return this;
        }

        /**
         * <p>The language of the script. Valid values:</p>
         * <ul>
         * <li>JavaScript</li>
         * <li>Python_27: Python 2.7</li>
         * <li>PHP_72: PHP 7.2</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>JavaScript</p>
         */
        public Builder scriptType(String scriptType) {
            this.putQueryParameter("ScriptType", scriptType);
            this.scriptType = scriptType;
            return this;
        }

        @Override
        public CreateThingScriptRequest build() {
            return new CreateThingScriptRequest(this);
        } 

    } 

}
