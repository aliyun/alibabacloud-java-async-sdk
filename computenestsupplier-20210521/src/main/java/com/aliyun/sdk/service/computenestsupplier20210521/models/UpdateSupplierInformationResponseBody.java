// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link UpdateSupplierInformationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSupplierInformationResponseBody</p>
 */
public class UpdateSupplierInformationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupplierDesc")
    private String supplierDesc;

    @com.aliyun.core.annotation.NameInMap("SupplierName")
    private String supplierName;

    @com.aliyun.core.annotation.NameInMap("SupplierUrl")
    private String supplierUrl;

    private UpdateSupplierInformationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.supplierDesc = builder.supplierDesc;
        this.supplierName = builder.supplierName;
        this.supplierUrl = builder.supplierUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSupplierInformationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supplierDesc
     */
    public String getSupplierDesc() {
        return this.supplierDesc;
    }

    /**
     * @return supplierName
     */
    public String getSupplierName() {
        return this.supplierName;
    }

    /**
     * @return supplierUrl
     */
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String supplierDesc; 
        private String supplierName; 
        private String supplierUrl; 

        private Builder() {
        } 

        private Builder(UpdateSupplierInformationResponseBody model) {
            this.requestId = model.requestId;
            this.supplierDesc = model.supplierDesc;
            this.supplierName = model.supplierName;
            this.supplierUrl = model.supplierUrl;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The description of service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Test supplier</p>
         */
        public Builder supplierDesc(String supplierDesc) {
            this.supplierDesc = supplierDesc;
            return this;
        }

        /**
         * <p>The name of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        public Builder supplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }

        /**
         * <p>The URL of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.xxx.xxx.cn">http://www.xxx.xxx.cn</a></p>
         */
        public Builder supplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }

        public UpdateSupplierInformationResponseBody build() {
            return new UpdateSupplierInformationResponseBody(this);
        } 

    } 

}
