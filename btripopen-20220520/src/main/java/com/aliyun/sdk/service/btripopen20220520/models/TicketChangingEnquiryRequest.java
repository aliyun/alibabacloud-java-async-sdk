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
 * {@link TicketChangingEnquiryRequest} extends {@link RequestModel}
 *
 * <p>TicketChangingEnquiryRequest</p>
 */
public class TicketChangingEnquiryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("arr_city")
    @com.aliyun.core.annotation.Validation(required = true)
    private String arrCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dep_city")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dis_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("is_voluntary")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer isVoluntary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modify_depart_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modifyDepartDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modify_flight_no")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modifyFlightNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("session_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TicketChangingEnquiryRequest(Builder builder) {
        super(builder);
        this.arrCity = builder.arrCity;
        this.depCity = builder.depCity;
        this.disOrderId = builder.disOrderId;
        this.isVoluntary = builder.isVoluntary;
        this.modifyDepartDate = builder.modifyDepartDate;
        this.modifyFlightNo = builder.modifyFlightNo;
        this.sessionId = builder.sessionId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketChangingEnquiryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arrCity
     */
    public String getArrCity() {
        return this.arrCity;
    }

    /**
     * @return depCity
     */
    public String getDepCity() {
        return this.depCity;
    }

    /**
     * @return disOrderId
     */
    public String getDisOrderId() {
        return this.disOrderId;
    }

    /**
     * @return isVoluntary
     */
    public Integer getIsVoluntary() {
        return this.isVoluntary;
    }

    /**
     * @return modifyDepartDate
     */
    public String getModifyDepartDate() {
        return this.modifyDepartDate;
    }

    /**
     * @return modifyFlightNo
     */
    public String getModifyFlightNo() {
        return this.modifyFlightNo;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TicketChangingEnquiryRequest, Builder> {
        private String arrCity; 
        private String depCity; 
        private String disOrderId; 
        private Integer isVoluntary; 
        private String modifyDepartDate; 
        private String modifyFlightNo; 
        private String sessionId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TicketChangingEnquiryRequest request) {
            super(request);
            this.arrCity = request.arrCity;
            this.depCity = request.depCity;
            this.disOrderId = request.disOrderId;
            this.isVoluntary = request.isVoluntary;
            this.modifyDepartDate = request.modifyDepartDate;
            this.modifyFlightNo = request.modifyFlightNo;
            this.sessionId = request.sessionId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        public Builder arrCity(String arrCity) {
            this.putQueryParameter("arr_city", arrCity);
            this.arrCity = arrCity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        public Builder depCity(String depCity) {
            this.putQueryParameter("dep_city", depCity);
            this.depCity = depCity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dis123</p>
         */
        public Builder disOrderId(String disOrderId) {
            this.putQueryParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isVoluntary(Integer isVoluntary) {
            this.putQueryParameter("is_voluntary", isVoluntary);
            this.isVoluntary = isVoluntary;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        public Builder modifyDepartDate(String modifyDepartDate) {
            this.putQueryParameter("modify_depart_date", modifyDepartDate);
            this.modifyDepartDate = modifyDepartDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CA1704</p>
         */
        public Builder modifyFlightNo(String modifyFlightNo) {
            this.putQueryParameter("modify_flight_no", modifyFlightNo);
            this.modifyFlightNo = modifyFlightNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ece19e8b1047898a5a98b6487348c2</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("session_id", sessionId);
            this.sessionId = sessionId;
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
        public TicketChangingEnquiryRequest build() {
            return new TicketChangingEnquiryRequest(this);
        } 

    } 

}
