// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TicketChangingFlightListRequest} extends {@link RequestModel}
 *
 * <p>TicketChangingFlightListRequest</p>
 */
public class TicketChangingFlightListRequest extends Request {
    @Query
    @NameInMap("arr_city")
    private String arrCity;

    @Query
    @NameInMap("dep_city")
    private String depCity;

    @Query
    @NameInMap("dep_date")
    @Validation(required = true)
    private String depDate;

    @Query
    @NameInMap("dis_order_id")
    @Validation(required = true)
    private String disOrderId;

    @Query
    @NameInMap("is_voluntary")
    private Integer isVoluntary;

    @Query
    @NameInMap("traveler_info_list")
    private java.util.List < TravelerInfoList> travelerInfoList;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    @Validation(required = true)
    private String xAcsBtripCorpToken;

    private TicketChangingFlightListRequest(Builder builder) {
        super(builder);
        this.arrCity = builder.arrCity;
        this.depCity = builder.depCity;
        this.depDate = builder.depDate;
        this.disOrderId = builder.disOrderId;
        this.isVoluntary = builder.isVoluntary;
        this.travelerInfoList = builder.travelerInfoList;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketChangingFlightListRequest create() {
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
     * @return depDate
     */
    public String getDepDate() {
        return this.depDate;
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
     * @return travelerInfoList
     */
    public java.util.List < TravelerInfoList> getTravelerInfoList() {
        return this.travelerInfoList;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TicketChangingFlightListRequest, Builder> {
        private String arrCity; 
        private String depCity; 
        private String depDate; 
        private String disOrderId; 
        private Integer isVoluntary; 
        private java.util.List < TravelerInfoList> travelerInfoList; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TicketChangingFlightListRequest request) {
            super(request);
            this.arrCity = request.arrCity;
            this.depCity = request.depCity;
            this.depDate = request.depDate;
            this.disOrderId = request.disOrderId;
            this.isVoluntary = request.isVoluntary;
            this.travelerInfoList = request.travelerInfoList;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * 必填项,到达城市三字码
         */
        public Builder arrCity(String arrCity) {
            this.putQueryParameter("arr_city", arrCity);
            this.arrCity = arrCity;
            return this;
        }

        /**
         * 必填项,出发城市三字码
         */
        public Builder depCity(String depCity) {
            this.putQueryParameter("dep_city", depCity);
            this.depCity = depCity;
            return this;
        }

        /**
         * 必填项,出发时间
         */
        public Builder depDate(String depDate) {
            this.putQueryParameter("dep_date", depDate);
            this.depDate = depDate;
            return this;
        }

        /**
         * 必填项,订单号
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
         * 必填项,需要改签乘客信息
         */
        public Builder travelerInfoList(java.util.List < TravelerInfoList> travelerInfoList) {
            String travelerInfoListShrink = shrink(travelerInfoList, "traveler_info_list", "json");
            this.putQueryParameter("traveler_info_list", travelerInfoListShrink);
            this.travelerInfoList = travelerInfoList;
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
        public TicketChangingFlightListRequest build() {
            return new TicketChangingFlightListRequest(this);
        } 

    } 

    public static class TravelerInfoList extends TeaModel {
        @NameInMap("arr_city")
        @Validation(required = true)
        private String arrCity;

        @NameInMap("dep_city")
        @Validation(required = true)
        private String depCity;

        @NameInMap("name")
        private String name;

        @NameInMap("type")
        private String type;

        @NameInMap("user_id")
        @Validation(required = true)
        private String userId;

        private TravelerInfoList(Builder builder) {
            this.arrCity = builder.arrCity;
            this.depCity = builder.depCity;
            this.name = builder.name;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerInfoList create() {
            return builder().build();
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String arrCity; 
            private String depCity; 
            private String name; 
            private String type; 
            private String userId; 

            /**
             * 到达机场三字码
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
                return this;
            }

            /**
             * 出发机场三字码
             */
            public Builder depCity(String depCity) {
                this.depCity = depCity;
                return this;
            }

            /**
             * 姓名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 乘客类型 (ENUM_INVALID, ADULT, CHILD, INFANT, STUDENT, OTHER)
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 员工编号
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TravelerInfoList build() {
                return new TravelerInfoList(this);
            } 

        } 

    }
}
