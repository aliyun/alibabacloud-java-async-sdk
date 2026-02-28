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
 * {@link CopyThingModelRequest} extends {@link RequestModel}
 *
 * <p>CopyThingModelRequest</p>
 */
public class CopyThingModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceModelVersion")
    private String sourceModelVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceProductKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetProductKey;

    private CopyThingModelRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceModelVersion = builder.sourceModelVersion;
        this.sourceProductKey = builder.sourceProductKey;
        this.targetProductKey = builder.targetProductKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyThingModelRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceModelVersion
     */
    public String getSourceModelVersion() {
        return this.sourceModelVersion;
    }

    /**
     * @return sourceProductKey
     */
    public String getSourceProductKey() {
        return this.sourceProductKey;
    }

    /**
     * @return targetProductKey
     */
    public String getTargetProductKey() {
        return this.targetProductKey;
    }

    public static final class Builder extends Request.Builder<CopyThingModelRequest, Builder> {
        private String iotInstanceId; 
        private String resourceGroupId; 
        private String sourceModelVersion; 
        private String sourceProductKey; 
        private String targetProductKey; 

        private Builder() {
            super();
        } 

        private Builder(CopyThingModelRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceModelVersion = request.sourceModelVersion;
            this.sourceProductKey = request.sourceProductKey;
            this.targetProductKey = request.targetProductKey;
        } 

        /**
         * <p>The ID of the instance. On the <strong>Overview</strong> page in the IoT Platform console, you can view the ID of the instance.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</li>
         * <li>If the <strong>Overview</strong> page or instance ID is not displayed in the IoT Platform console, ignore this parameter.</li>
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
         * <p>The ID of the resource group.</p>
         * <blockquote>
         * <p> You do not need to configure this parameter.</p>
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
         * <p>The version of the TSL model that you want to copy.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/150318.html">ListThingModelVersion</a> operation to view the TSL model versions of a product.</p>
         * 
         * <strong>example:</strong>
         * <p>V1.0.0</p>
         */
        public Builder sourceModelVersion(String sourceModelVersion) {
            this.putQueryParameter("SourceModelVersion", sourceModelVersion);
            this.sourceModelVersion = sourceModelVersion;
            return this;
        }

        /**
         * <p>The ProductKey of the source product.</p>
         * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder sourceProductKey(String sourceProductKey) {
            this.putQueryParameter("SourceProductKey", sourceProductKey);
            this.sourceProductKey = sourceProductKey;
            return this;
        }

        /**
         * <p>The ProductKey of the destination product.</p>
         * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwwG0****</p>
         */
        public Builder targetProductKey(String targetProductKey) {
            this.putQueryParameter("TargetProductKey", targetProductKey);
            this.targetProductKey = targetProductKey;
            return this;
        }

        @Override
        public CopyThingModelRequest build() {
            return new CopyThingModelRequest(this);
        } 

    } 

}
