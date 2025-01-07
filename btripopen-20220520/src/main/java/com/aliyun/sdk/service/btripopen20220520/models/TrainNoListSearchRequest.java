// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TrainNoListSearchRequest} extends {@link RequestModel}
 *
 * <p>TrainNoListSearchRequest</p>
 */
public class TrainNoListSearchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("arr_location")
    @com.aliyun.core.annotation.Validation(required = true)
    private String arrLocation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dep_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dep_location")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depLocation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("option")
    @com.aliyun.core.annotation.Validation(required = true)
    private Option option;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    private String orderId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TrainNoListSearchRequest(Builder builder) {
        super(builder);
        this.arrLocation = builder.arrLocation;
        this.depDate = builder.depDate;
        this.depLocation = builder.depLocation;
        this.option = builder.option;
        this.orderId = builder.orderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainNoListSearchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arrLocation
     */
    public String getArrLocation() {
        return this.arrLocation;
    }

    /**
     * @return depDate
     */
    public String getDepDate() {
        return this.depDate;
    }

    /**
     * @return depLocation
     */
    public String getDepLocation() {
        return this.depLocation;
    }

    /**
     * @return option
     */
    public Option getOption() {
        return this.option;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TrainNoListSearchRequest, Builder> {
        private String arrLocation; 
        private String depDate; 
        private String depLocation; 
        private Option option; 
        private String orderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainNoListSearchRequest request) {
            super(request);
            this.arrLocation = request.arrLocation;
            this.depDate = request.depDate;
            this.depLocation = request.depLocation;
            this.option = request.option;
            this.orderId = request.orderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder arrLocation(String arrLocation) {
            this.putBodyParameter("arr_location", arrLocation);
            this.arrLocation = arrLocation;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-16</p>
         */
        public Builder depDate(String depDate) {
            this.putBodyParameter("dep_date", depDate);
            this.depDate = depDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder depLocation(String depLocation) {
            this.putBodyParameter("dep_location", depLocation);
            this.depLocation = depLocation;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder option(Option option) {
            String optionShrink = shrink(option, "option", "json");
            this.putBodyParameter("option", optionShrink);
            this.option = option;
            return this;
        }

        /**
         * order_id.
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TrainNoListSearchRequest build() {
            return new TrainNoListSearchRequest(this);
        } 

    } 

    /**
     * 
     * {@link TrainNoListSearchRequest} extends {@link TeaModel}
     *
     * <p>TrainNoListSearchRequest</p>
     */
    public static class Option extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("need_transfer")
        private Boolean needTransfer;

        private Option(Builder builder) {
            this.needTransfer = builder.needTransfer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Option create() {
            return builder().build();
        }

        /**
         * @return needTransfer
         */
        public Boolean getNeedTransfer() {
            return this.needTransfer;
        }

        public static final class Builder {
            private Boolean needTransfer; 

            /**
             * need_transfer.
             */
            public Builder needTransfer(Boolean needTransfer) {
                this.needTransfer = needTransfer;
                return this;
            }

            public Option build() {
                return new Option(this);
            } 

        } 

    }
}
