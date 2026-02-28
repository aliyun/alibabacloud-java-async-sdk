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
 * {@link ListOTAModuleByProductRequest} extends {@link RequestModel}
 *
 * <p>ListOTAModuleByProductRequest</p>
 */
public class ListOTAModuleByProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private ListOTAModuleByProductRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOTAModuleByProductRequest create() {
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

    public static final class Builder extends Request.Builder<ListOTAModuleByProductRequest, Builder> {
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(ListOTAModuleByProductRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
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
         * <p>The ProductKey of the product.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1uctKe****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public ListOTAModuleByProductRequest build() {
            return new ListOTAModuleByProductRequest(this);
        } 

    } 

}
