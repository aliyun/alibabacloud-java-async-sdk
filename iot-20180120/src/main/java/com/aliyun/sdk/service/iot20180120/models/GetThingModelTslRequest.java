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
 * {@link GetThingModelTslRequest} extends {@link RequestModel}
 *
 * <p>GetThingModelTslRequest</p>
 */
public class GetThingModelTslRequest extends Request {
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
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Simple")
    private Boolean simple;

    private GetThingModelTslRequest(Builder builder) {
        super(builder);
        this.functionBlockId = builder.functionBlockId;
        this.iotInstanceId = builder.iotInstanceId;
        this.modelVersion = builder.modelVersion;
        this.productKey = builder.productKey;
        this.simple = builder.simple;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThingModelTslRequest create() {
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

    /**
     * @return simple
     */
    public Boolean getSimple() {
        return this.simple;
    }

    public static final class Builder extends Request.Builder<GetThingModelTslRequest, Builder> {
        private String functionBlockId; 
        private String iotInstanceId; 
        private String modelVersion; 
        private String productKey; 
        private Boolean simple; 

        private Builder() {
            super();
        } 

        private Builder(GetThingModelTslRequest request) {
            super(request);
            this.functionBlockId = request.functionBlockId;
            this.iotInstanceId = request.iotInstanceId;
            this.modelVersion = request.modelVersion;
            this.productKey = request.productKey;
            this.simple = request.simple;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
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
         * <p>The ProductKey of the product.</p>
         * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
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
         * <p>Specifies whether to retrieve a simplified TSL model.</p>
         * <ul>
         * <li><p><strong>true</strong>: retrieves a simplified TSL model.</p>
         * <p>A simplified TSL model includes only the <strong>identifier</strong> and <strong>dataType</strong> attributes of properties, services, events, and related input or output parameters. Simplified TSL models can be used by device developers for reference.</p>
         * </li>
         * <li><p><strong>false</strong>: retrieves the complete TSL model.</p>
         * <p>A complete TSL model includes all the parameters and values of properties, services, and events. Complete TSL models can be used by cloud application developers for reference.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
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
         * <p>The version number of the TSL model to be queried.</p>
         * <p>If you do not specify this parameter, IoT Platform returns the draft TSL model that is unpublished.</p>
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
         * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
         * <p>If you do not specify this parameter, the default module is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder simple(Boolean simple) {
            this.putQueryParameter("Simple", simple);
            this.simple = simple;
            return this;
        }

        @Override
        public GetThingModelTslRequest build() {
            return new GetThingModelTslRequest(this);
        } 

    } 

}
