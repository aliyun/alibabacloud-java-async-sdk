// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link DownloadVerifyRecordIntlRequest} extends {@link RequestModel}
 *
 * <p>DownloadVerifyRecordIntlRequest</p>
 */
public class DownloadVerifyRecordIntlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadMode")
    private String downloadMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    private DownloadVerifyRecordIntlRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.code = builder.code;
        this.downloadMode = builder.downloadMode;
        this.param = builder.param;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadVerifyRecordIntlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return downloadMode
     */
    public String getDownloadMode() {
        return this.downloadMode;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<DownloadVerifyRecordIntlRequest, Builder> {
        private String bizType; 
        private String code; 
        private String downloadMode; 
        private String param; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(DownloadVerifyRecordIntlRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.code = request.code;
            this.downloadMode = request.downloadMode;
            this.param = request.param;
            this.productType = request.productType;
        } 

        /**
         * <p>Business type:</p>
         * <ul>
         * <li>INVOKE_STATISTICS</li>
         * <li>INVOKE_RECORD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INVOKE_RECORD</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>Query code.</p>
         * 
         * <strong>example:</strong>
         * <p>vrf_intl_verify_record_real_id_idv_invoke_statistics_query</p>
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>Download mode:</p>
         * <ul>
         * <li><strong>async</strong>: Asynchronous</li>
         * <li><strong>sync</strong>: Synchronous</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>async</p>
         */
        public Builder downloadMode(String downloadMode) {
            this.putQueryParameter("DownloadMode", downloadMode);
            this.downloadMode = downloadMode;
            return this;
        }

        /**
         * <p>Parameters related to the export and download query task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;productCode&quot;:&quot;FACE_LIVENESS&quot;,&quot;startDs&quot;:&quot;20251121&quot;,&quot;endDs&quot;:&quot;20251128&quot;,&quot;language&quot;:&quot;en&quot;}</p>
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * <p>Product Code.</p>
         * 
         * <strong>example:</strong>
         * <p>KYC</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public DownloadVerifyRecordIntlRequest build() {
            return new DownloadVerifyRecordIntlRequest(this);
        } 

    } 

}
