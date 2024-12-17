// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HotelOrderListQueryResponseBody} extends {@link TeaModel}
 *
 * <p>HotelOrderListQueryResponseBody</p>
 */
public class HotelOrderListQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List < Module> module;

    @com.aliyun.core.annotation.NameInMap("page_info")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private HotelOrderListQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelOrderListQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public java.util.List < Module> getModule() {
        return this.module;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < Module> module; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(java.util.List < Module> module) {
            this.module = module;
            return this;
        }

        /**
         * page_info.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public HotelOrderListQueryResponseBody build() {
            return new HotelOrderListQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotelOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderListQueryResponseBody</p>
     */
    public static class CostCenter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("number")
        private String number;

        private CostCenter(Builder builder) {
            this.corpId = builder.corpId;
            this.id = builder.id;
            this.name = builder.name;
            this.number = builder.number;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostCenter create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        public static final class Builder {
            private String corpId; 
            private Long id; 
            private String name; 
            private String number; 

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            public CostCenter build() {
                return new CostCenter(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderListQueryResponseBody</p>
     */
    public static class Invoice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("invoice_type")
        private Integer invoiceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Invoice(Builder builder) {
            this.id = builder.id;
            this.invoiceType = builder.invoiceType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invoice create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return invoiceType
         */
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long id; 
            private Integer invoiceType; 
            private String title; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * invoice_type.
             */
            public Builder invoiceType(Integer invoiceType) {
                this.invoiceType = invoiceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Invoice build() {
                return new Invoice(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderListQueryResponseBody</p>
     */
    public static class PriceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("category_code")
        private Integer categoryCode;

        @com.aliyun.core.annotation.NameInMap("category_type")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("pay_type")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("price")
        private Double price;

        @com.aliyun.core.annotation.NameInMap("trade_id")
        private String tradeId;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private PriceInfoList(Builder builder) {
            this.category = builder.category;
            this.categoryCode = builder.categoryCode;
            this.categoryType = builder.categoryType;
            this.gmtCreate = builder.gmtCreate;
            this.passengerName = builder.passengerName;
            this.payType = builder.payType;
            this.price = builder.price;
            this.tradeId = builder.tradeId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfoList create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return categoryCode
         */
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        /**
         * @return categoryType
         */
        public Integer getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return price
         */
        public Double getPrice() {
            return this.price;
        }

        /**
         * @return tradeId
         */
        public String getTradeId() {
            return this.tradeId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String category; 
            private Integer categoryCode; 
            private Integer categoryType; 
            private String gmtCreate; 
            private String passengerName; 
            private Integer payType; 
            private Double price; 
            private String tradeId; 
            private Integer type; 

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * category_code.
             */
            public Builder categoryCode(Integer categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * category_type.
             */
            public Builder categoryType(Integer categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * passenger_name.
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * pay_type.
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * price.
             */
            public Builder price(Double price) {
                this.price = price;
                return this;
            }

            /**
             * trade_id.
             */
            public Builder tradeId(String tradeId) {
                this.tradeId = tradeId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public PriceInfoList build() {
                return new PriceInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderListQueryResponseBody</p>
     */
    public static class UserAffiliateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private UserAffiliateList(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAffiliateList create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userId; 
            private String userName; 

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public UserAffiliateList build() {
                return new UserAffiliateList(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderListQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private Long applyId;

        @com.aliyun.core.annotation.NameInMap("btrip_title")
        private String btripTitle;

        @com.aliyun.core.annotation.NameInMap("category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("check_in")
        private String checkIn;

        @com.aliyun.core.annotation.NameInMap("check_out")
        private String checkOut;

        @com.aliyun.core.annotation.NameInMap("city")
        private String city;

        @com.aliyun.core.annotation.NameInMap("city_ad_code")
        private String cityAdCode;

        @com.aliyun.core.annotation.NameInMap("contact_name")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("corp_name")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("cost_center")
        private CostCenter costCenter;

        @com.aliyun.core.annotation.NameInMap("country_code")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("country_name")
        private String countryName;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("extend_field")
        private String extendField;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("guest")
        private String guest;

        @com.aliyun.core.annotation.NameInMap("hotel_name")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("hotel_support_vat_invoice_type")
        private Integer hotelSupportVatInvoiceType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("invoice")
        private Invoice invoice;

        @com.aliyun.core.annotation.NameInMap("night")
        private Integer night;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("order_status_desc")
        private String orderStatusDesc;

        @com.aliyun.core.annotation.NameInMap("order_type")
        private Integer orderType;

        @com.aliyun.core.annotation.NameInMap("order_type_desc")
        private String orderTypeDesc;

        @com.aliyun.core.annotation.NameInMap("price_info_list")
        private java.util.List < PriceInfoList> priceInfoList;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_id")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("room_num")
        private Integer roomNum;

        @com.aliyun.core.annotation.NameInMap("room_type")
        private String roomType;

        @com.aliyun.core.annotation.NameInMap("supplier")
        private String supplier;

        @com.aliyun.core.annotation.NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_business_id")
        private String thirdpartBusinessId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_project_id")
        private String thirdpartProjectId;

        @com.aliyun.core.annotation.NameInMap("user_affiliate_list")
        private java.util.List < UserAffiliateList> userAffiliateList;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private Module(Builder builder) {
            this.applyId = builder.applyId;
            this.btripTitle = builder.btripTitle;
            this.category = builder.category;
            this.checkIn = builder.checkIn;
            this.checkOut = builder.checkOut;
            this.city = builder.city;
            this.cityAdCode = builder.cityAdCode;
            this.contactName = builder.contactName;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.costCenter = builder.costCenter;
            this.countryCode = builder.countryCode;
            this.countryName = builder.countryName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.extendField = builder.extendField;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.guest = builder.guest;
            this.hotelName = builder.hotelName;
            this.hotelSupportVatInvoiceType = builder.hotelSupportVatInvoiceType;
            this.id = builder.id;
            this.invoice = builder.invoice;
            this.night = builder.night;
            this.orderStatus = builder.orderStatus;
            this.orderStatusDesc = builder.orderStatusDesc;
            this.orderType = builder.orderType;
            this.orderTypeDesc = builder.orderTypeDesc;
            this.priceInfoList = builder.priceInfoList;
            this.projectCode = builder.projectCode;
            this.projectId = builder.projectId;
            this.projectTitle = builder.projectTitle;
            this.roomNum = builder.roomNum;
            this.roomType = builder.roomType;
            this.supplier = builder.supplier;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartBusinessId = builder.thirdpartBusinessId;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.thirdpartProjectId = builder.thirdpartProjectId;
            this.userAffiliateList = builder.userAffiliateList;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public Long getApplyId() {
            return this.applyId;
        }

        /**
         * @return btripTitle
         */
        public String getBtripTitle() {
            return this.btripTitle;
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return checkIn
         */
        public String getCheckIn() {
            return this.checkIn;
        }

        /**
         * @return checkOut
         */
        public String getCheckOut() {
            return this.checkOut;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return cityAdCode
         */
        public String getCityAdCode() {
            return this.cityAdCode;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return corpName
         */
        public String getCorpName() {
            return this.corpName;
        }

        /**
         * @return costCenter
         */
        public CostCenter getCostCenter() {
            return this.costCenter;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return countryName
         */
        public String getCountryName() {
            return this.countryName;
        }

        /**
         * @return departId
         */
        public String getDepartId() {
            return this.departId;
        }

        /**
         * @return departName
         */
        public String getDepartName() {
            return this.departName;
        }

        /**
         * @return extendField
         */
        public String getExtendField() {
            return this.extendField;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return guest
         */
        public String getGuest() {
            return this.guest;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return hotelSupportVatInvoiceType
         */
        public Integer getHotelSupportVatInvoiceType() {
            return this.hotelSupportVatInvoiceType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return invoice
         */
        public Invoice getInvoice() {
            return this.invoice;
        }

        /**
         * @return night
         */
        public Integer getNight() {
            return this.night;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return orderStatusDesc
         */
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        /**
         * @return orderType
         */
        public Integer getOrderType() {
            return this.orderType;
        }

        /**
         * @return orderTypeDesc
         */
        public String getOrderTypeDesc() {
            return this.orderTypeDesc;
        }

        /**
         * @return priceInfoList
         */
        public java.util.List < PriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectTitle
         */
        public String getProjectTitle() {
            return this.projectTitle;
        }

        /**
         * @return roomNum
         */
        public Integer getRoomNum() {
            return this.roomNum;
        }

        /**
         * @return roomType
         */
        public String getRoomType() {
            return this.roomType;
        }

        /**
         * @return supplier
         */
        public String getSupplier() {
            return this.supplier;
        }

        /**
         * @return thirdpartApplyId
         */
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        /**
         * @return thirdpartBusinessId
         */
        public String getThirdpartBusinessId() {
            return this.thirdpartBusinessId;
        }

        /**
         * @return thirdpartItineraryId
         */
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        /**
         * @return thirdpartProjectId
         */
        public String getThirdpartProjectId() {
            return this.thirdpartProjectId;
        }

        /**
         * @return userAffiliateList
         */
        public java.util.List < UserAffiliateList> getUserAffiliateList() {
            return this.userAffiliateList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long applyId; 
            private String btripTitle; 
            private Integer category; 
            private String checkIn; 
            private String checkOut; 
            private String city; 
            private String cityAdCode; 
            private String contactName; 
            private String corpId; 
            private String corpName; 
            private CostCenter costCenter; 
            private String countryCode; 
            private String countryName; 
            private String departId; 
            private String departName; 
            private String extendField; 
            private String gmtCreate; 
            private String gmtModified; 
            private String guest; 
            private String hotelName; 
            private Integer hotelSupportVatInvoiceType; 
            private Long id; 
            private Invoice invoice; 
            private Integer night; 
            private Integer orderStatus; 
            private String orderStatusDesc; 
            private Integer orderType; 
            private String orderTypeDesc; 
            private java.util.List < PriceInfoList> priceInfoList; 
            private String projectCode; 
            private Long projectId; 
            private String projectTitle; 
            private Integer roomNum; 
            private String roomType; 
            private String supplier; 
            private String thirdpartApplyId; 
            private String thirdpartBusinessId; 
            private String thirdpartItineraryId; 
            private String thirdpartProjectId; 
            private java.util.List < UserAffiliateList> userAffiliateList; 
            private String userId; 
            private String userName; 

            /**
             * apply_id.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * btrip_title.
             */
            public Builder btripTitle(String btripTitle) {
                this.btripTitle = btripTitle;
                return this;
            }

            /**
             * category.
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * check_in.
             */
            public Builder checkIn(String checkIn) {
                this.checkIn = checkIn;
                return this;
            }

            /**
             * check_out.
             */
            public Builder checkOut(String checkOut) {
                this.checkOut = checkOut;
                return this;
            }

            /**
             * city.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * city_ad_code.
             */
            public Builder cityAdCode(String cityAdCode) {
                this.cityAdCode = cityAdCode;
                return this;
            }

            /**
             * contact_name.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * corp_name.
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            /**
             * cost_center.
             */
            public Builder costCenter(CostCenter costCenter) {
                this.costCenter = costCenter;
                return this;
            }

            /**
             * country_code.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * country_name.
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            /**
             * depart_id.
             */
            public Builder departId(String departId) {
                this.departId = departId;
                return this;
            }

            /**
             * depart_name.
             */
            public Builder departName(String departName) {
                this.departName = departName;
                return this;
            }

            /**
             * extend_field.
             */
            public Builder extendField(String extendField) {
                this.extendField = extendField;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * guest.
             */
            public Builder guest(String guest) {
                this.guest = guest;
                return this;
            }

            /**
             * hotel_name.
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * hotel_support_vat_invoice_type.
             */
            public Builder hotelSupportVatInvoiceType(Integer hotelSupportVatInvoiceType) {
                this.hotelSupportVatInvoiceType = hotelSupportVatInvoiceType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * invoice.
             */
            public Builder invoice(Invoice invoice) {
                this.invoice = invoice;
                return this;
            }

            /**
             * night.
             */
            public Builder night(Integer night) {
                this.night = night;
                return this;
            }

            /**
             * order_status.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * order_status_desc.
             */
            public Builder orderStatusDesc(String orderStatusDesc) {
                this.orderStatusDesc = orderStatusDesc;
                return this;
            }

            /**
             * order_type.
             */
            public Builder orderType(Integer orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * order_type_desc.
             */
            public Builder orderTypeDesc(String orderTypeDesc) {
                this.orderTypeDesc = orderTypeDesc;
                return this;
            }

            /**
             * price_info_list.
             */
            public Builder priceInfoList(java.util.List < PriceInfoList> priceInfoList) {
                this.priceInfoList = priceInfoList;
                return this;
            }

            /**
             * project_code.
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * project_id.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * project_title.
             */
            public Builder projectTitle(String projectTitle) {
                this.projectTitle = projectTitle;
                return this;
            }

            /**
             * room_num.
             */
            public Builder roomNum(Integer roomNum) {
                this.roomNum = roomNum;
                return this;
            }

            /**
             * room_type.
             */
            public Builder roomType(String roomType) {
                this.roomType = roomType;
                return this;
            }

            /**
             * supplier.
             */
            public Builder supplier(String supplier) {
                this.supplier = supplier;
                return this;
            }

            /**
             * thirdpart_apply_id.
             */
            public Builder thirdpartApplyId(String thirdpartApplyId) {
                this.thirdpartApplyId = thirdpartApplyId;
                return this;
            }

            /**
             * thirdpart_business_id.
             */
            public Builder thirdpartBusinessId(String thirdpartBusinessId) {
                this.thirdpartBusinessId = thirdpartBusinessId;
                return this;
            }

            /**
             * thirdpart_itinerary_id.
             */
            public Builder thirdpartItineraryId(String thirdpartItineraryId) {
                this.thirdpartItineraryId = thirdpartItineraryId;
                return this;
            }

            /**
             * thirdpart_project_id.
             */
            public Builder thirdpartProjectId(String thirdpartProjectId) {
                this.thirdpartProjectId = thirdpartProjectId;
                return this;
            }

            /**
             * user_affiliate_list.
             */
            public Builder userAffiliateList(java.util.List < UserAffiliateList> userAffiliateList) {
                this.userAffiliateList = userAffiliateList;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderListQueryResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_number")
        private Integer totalNumber;

        private PageInfo(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.totalNumber = builder.totalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNumber
         */
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private Integer totalNumber; 

            /**
             * page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * page_size.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total_number.
             */
            public Builder totalNumber(Integer totalNumber) {
                this.totalNumber = totalNumber;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
