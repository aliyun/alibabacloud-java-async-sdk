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
 * {@link QueryThingModelExtendConfigPublishedRequest} extends {@link RequestModel}
 *
 * <p>QueryThingModelExtendConfigPublishedRequest</p>
 */
public class QueryThingModelExtendConfigPublishedRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionBlockId")
    private String functionBlockId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelVersion")
    private String modelVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private QueryThingModelExtendConfigPublishedRequest(Builder builder) {
        super(builder);
        this.functionBlockId = builder.functionBlockId;
        this.iotInstanceId = builder.iotInstanceId;
        this.modelVersion = builder.modelVersion;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryThingModelExtendConfigPublishedRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return modelVersion
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<QueryThingModelExtendConfigPublishedRequest, Builder> {
        private String functionBlockId; 
        private String iotInstanceId; 
        private String modelVersion; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryThingModelExtendConfigPublishedRequest request) {
            super(request);
            this.functionBlockId = request.functionBlockId;
            this.iotInstanceId = request.iotInstanceId;
            this.modelVersion = request.modelVersion;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
         * <p>If you do not specify this parameter, the default module is queried.</p>
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
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The version number of the TSL model. If you do not specify this parameter, the last published TSL model is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        public Builder modelVersion(String modelVersion) {
            this.putQueryParameter("ModelVersion", modelVersion);
            this.modelVersion = modelVersion;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product.</p>
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

        @Override
        public QueryThingModelExtendConfigPublishedRequest build() {
            return new QueryThingModelExtendConfigPublishedRequest(this);
        } 

    } 

}
