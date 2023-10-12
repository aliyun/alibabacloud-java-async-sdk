// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Order} extends {@link TeaModel}
 *
 * <p>Order</p>
 */
public class Order extends TeaModel {
    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModify")
    private String gmtModify;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("Output")
    private String output;

    @NameInMap("Params")
    private String params;

    @NameInMap("SchemeId")
    private String schemeId;

    @NameInMap("SchemeName")
    private String schemeName;

    @NameInMap("Status")
    private String status;

    @NameInMap("Title")
    private String title;

    private Order(Builder builder) {
        this.gmtCreate = builder.gmtCreate;
        this.gmtModify = builder.gmtModify;
        this.orderId = builder.orderId;
        this.output = builder.output;
        this.params = builder.params;
        this.schemeId = builder.schemeId;
        this.schemeName = builder.schemeName;
        this.status = builder.status;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Order create() {
        return builder().build();
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModify
     */
    public String getGmtModify() {
        return this.gmtModify;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return schemeId
     */
    public String getSchemeId() {
        return this.schemeId;
    }

    /**
     * @return schemeName
     */
    public String getSchemeName() {
        return this.schemeName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String gmtCreate; 
        private String gmtModify; 
        private String orderId; 
        private String output; 
        private String params; 
        private String schemeId; 
        private String schemeName; 
        private String status; 
        private String title; 

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModify.
         */
        public Builder gmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.params = params;
            return this;
        }

        /**
         * SchemeId.
         */
        public Builder schemeId(String schemeId) {
            this.schemeId = schemeId;
            return this;
        }

        /**
         * SchemeName.
         */
        public Builder schemeName(String schemeName) {
            this.schemeName = schemeName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Order build() {
            return new Order(this);
        } 

    } 

}
