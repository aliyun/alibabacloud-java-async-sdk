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
 * {@link QueryThingModelRequest} extends {@link RequestModel}
 *
 * <p>QueryThingModelRequest</p>
 */
public class QueryThingModelRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private QueryThingModelRequest(Builder builder) {
        super(builder);
        this.functionBlockId = builder.functionBlockId;
        this.iotInstanceId = builder.iotInstanceId;
        this.modelVersion = builder.modelVersion;
        this.productKey = builder.productKey;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryThingModelRequest create() {
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

    public static final class Builder extends Request.Builder<QueryThingModelRequest, Builder> {
        private String functionBlockId; 
        private String iotInstanceId; 
        private String modelVersion; 
        private String productKey; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(QueryThingModelRequest request) {
            super(request);
            this.functionBlockId = request.functionBlockId;
            this.iotInstanceId = request.iotInstanceId;
            this.modelVersion = request.modelVersion;
            this.productKey = request.productKey;
            this.resourceGroupId = request.resourceGroupId;
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
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The version number of the TSL model.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/150318.html">ListThingModelVersion</a> operation to view the version numbers of the TSL model for a product.</p>
         * <p>If you do not specify this parameter, the TSL model that is in the draft status is queried. If you specify this parameter, the TSL model of the specified version is queried.</p>
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

        @Override
        public QueryThingModelRequest build() {
            return new QueryThingModelRequest(this);
        } 

    } 

}
