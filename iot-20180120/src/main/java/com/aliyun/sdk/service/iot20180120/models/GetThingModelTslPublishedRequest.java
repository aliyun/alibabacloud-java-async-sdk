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
 * {@link GetThingModelTslPublishedRequest} extends {@link RequestModel}
 *
 * <p>GetThingModelTslPublishedRequest</p>
 */
public class GetThingModelTslPublishedRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Simple")
    private Boolean simple;

    private GetThingModelTslPublishedRequest(Builder builder) {
        super(builder);
        this.functionBlockId = builder.functionBlockId;
        this.iotInstanceId = builder.iotInstanceId;
        this.modelVersion = builder.modelVersion;
        this.productKey = builder.productKey;
        this.resourceGroupId = builder.resourceGroupId;
        this.simple = builder.simple;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThingModelTslPublishedRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return simple
     */
    public Boolean getSimple() {
        return this.simple;
    }

    public static final class Builder extends Request.Builder<GetThingModelTslPublishedRequest, Builder> {
        private String functionBlockId; 
        private String iotInstanceId; 
        private String modelVersion; 
        private String productKey; 
        private String resourceGroupId; 
        private Boolean simple; 

        private Builder() {
            super();
        } 

        private Builder(GetThingModelTslPublishedRequest request) {
            super(request);
            this.functionBlockId = request.functionBlockId;
            this.iotInstanceId = request.iotInstanceId;
            this.modelVersion = request.modelVersion;
            this.productKey = request.productKey;
            this.resourceGroupId = request.resourceGroupId;
            this.simple = request.simple;
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
         * <p>The version number of the TSL model.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/150318.html">ListThingModelVersion</a> operation to view the version numbers of the TSL model for a product.</p>
         * <p>If you do not specify this parameter, the last published TSL model version is returned.</p>
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
         * <p>Specifies whether to retrieve a simplified TSL model.</p>
         * <ul>
         * <li>true: retrieves a simplified TSL model. A simplified TSL model includes only the <strong>identifier</strong> and <strong>dataType</strong> attributes of properties, services, events, and related input or output parameters. Simplified TSL models can be used by device developers for reference.</li>
         * <li>false: retrieves the complete TSL model. A complete TSL model includes all the parameters and values of properties, services, and events. Complete TSL models can be used by cloud application developers for reference.</li>
         * </ul>
         * <p>Default value: false.</p>
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
        public GetThingModelTslPublishedRequest build() {
            return new GetThingModelTslPublishedRequest(this);
        } 

    } 

}
