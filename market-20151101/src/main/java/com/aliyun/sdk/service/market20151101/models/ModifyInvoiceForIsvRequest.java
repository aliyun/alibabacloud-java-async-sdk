// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link ModifyInvoiceForIsvRequest} extends {@link RequestModel}
 *
 * <p>ModifyInvoiceForIsvRequest</p>
 */
public class ModifyInvoiceForIsvRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckNotice")
    private String checkNotice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElectronUrl")
    private String electronUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceId")
    private Long invoiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    private String number;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    private ModifyInvoiceForIsvRequest(Builder builder) {
        super(builder);
        this.checkNotice = builder.checkNotice;
        this.electronUrl = builder.electronUrl;
        this.invoiceId = builder.invoiceId;
        this.number = builder.number;
        this.operateType = builder.operateType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInvoiceForIsvRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkNotice
     */
    public String getCheckNotice() {
        return this.checkNotice;
    }

    /**
     * @return electronUrl
     */
    public String getElectronUrl() {
        return this.electronUrl;
    }

    /**
     * @return invoiceId
     */
    public Long getInvoiceId() {
        return this.invoiceId;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * @return operateType
     */
    public Integer getOperateType() {
        return this.operateType;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyInvoiceForIsvRequest, Builder> {
        private String checkNotice; 
        private String electronUrl; 
        private Long invoiceId; 
        private String number; 
        private Integer operateType; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInvoiceForIsvRequest request) {
            super(request);
            this.checkNotice = request.checkNotice;
            this.electronUrl = request.electronUrl;
            this.invoiceId = request.invoiceId;
            this.number = request.number;
            this.operateType = request.operateType;
            this.type = request.type;
        } 

        /**
         * CheckNotice.
         */
        public Builder checkNotice(String checkNotice) {
            this.putQueryParameter("CheckNotice", checkNotice);
            this.checkNotice = checkNotice;
            return this;
        }

        /**
         * ElectronUrl.
         */
        public Builder electronUrl(String electronUrl) {
            this.putQueryParameter("ElectronUrl", electronUrl);
            this.electronUrl = electronUrl;
            return this;
        }

        /**
         * InvoiceId.
         */
        public Builder invoiceId(Long invoiceId) {
            this.putQueryParameter("InvoiceId", invoiceId);
            this.invoiceId = invoiceId;
            return this;
        }

        /**
         * Number.
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder operateType(Integer operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyInvoiceForIsvRequest build() {
            return new ModifyInvoiceForIsvRequest(this);
        } 

    } 

}
