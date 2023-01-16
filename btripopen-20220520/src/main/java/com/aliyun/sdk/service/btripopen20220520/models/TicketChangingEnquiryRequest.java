// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TicketChangingEnquiryRequest} extends {@link RequestModel}
 *
 * <p>TicketChangingEnquiryRequest</p>
 */
public class TicketChangingEnquiryRequest extends Request {
    @Query
    @NameInMap("arr_city")
    @Validation(required = true)
    private String arrCity;

    @Query
    @NameInMap("dep_city")
    @Validation(required = true)
    private String depCity;

    @Query
    @NameInMap("dis_order_id")
    @Validation(required = true)
    private String disOrderId;

    @Query
    @NameInMap("is_voluntary")
    @Validation(required = true)
    private Integer isVoluntary;

    @Query
    @NameInMap("modify_depart_date")
    @Validation(required = true)
    private String modifyDepartDate;

    @Query
    @NameInMap("modify_flight_no")
    @Validation(required = true)
    private String modifyFlightNo;

    @Query
    @NameInMap("session_id")
    @Validation(required = true)
    private String sessionId;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    @Validation(required = true)
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
         * 到达城市三字码
         */
        public Builder arrCity(String arrCity) {
            this.putQueryParameter("arr_city", arrCity);
            this.arrCity = arrCity;
            return this;
        }

        /**
         * 出发城市三字码
         */
        public Builder depCity(String depCity) {
            this.putQueryParameter("dep_city", depCity);
            this.depCity = depCity;
            return this;
        }

        /**
         * 分销外部订单号
         */
        public Builder disOrderId(String disOrderId) {
            this.putQueryParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * 是否自愿:1自愿，0非自愿
         */
        public Builder isVoluntary(Integer isVoluntary) {
            this.putQueryParameter("is_voluntary", isVoluntary);
            this.isVoluntary = isVoluntary;
            return this;
        }

        /**
         * 改签日期，计算改签价格需要传递
         */
        public Builder modifyDepartDate(String modifyDepartDate) {
            this.putQueryParameter("modify_depart_date", modifyDepartDate);
            this.modifyDepartDate = modifyDepartDate;
            return this;
        }

        /**
         * 改签航班号，计算改签价格需要传递
         */
        public Builder modifyFlightNo(String modifyFlightNo) {
            this.putQueryParameter("modify_flight_no", modifyFlightNo);
            this.modifyFlightNo = modifyFlightNo;
            return this;
        }

        /**
         * sessionId
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
