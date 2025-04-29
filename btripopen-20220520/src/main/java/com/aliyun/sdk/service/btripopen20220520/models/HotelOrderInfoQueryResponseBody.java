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
 * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
 *
 * <p>HotelOrderInfoQueryResponseBody</p>
 */
public class HotelOrderInfoQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private HotelOrderInfoQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelOrderInfoQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Module getModule() {
        return this.module;
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
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(HotelOrderInfoQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

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
        public Builder module(Module module) {
            this.module = module;
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

        public HotelOrderInfoQueryResponseBody build() {
            return new HotelOrderInfoQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class BaseOrderInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("book_mode")
        private String bookMode;

        @com.aliyun.core.annotation.NameInMap("booker_id")
        private String bookerId;

        @com.aliyun.core.annotation.NameInMap("booker_name")
        private String bookerName;

        @com.aliyun.core.annotation.NameInMap("btrip_corp_id")
        private String btripCorpId;

        @com.aliyun.core.annotation.NameInMap("category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("check_in_time")
        private Long checkInTime;

        @com.aliyun.core.annotation.NameInMap("check_out_time")
        private Long checkOutTime;

        @com.aliyun.core.annotation.NameInMap("is_agreement_price")
        private Boolean isAgreementPrice;

        @com.aliyun.core.annotation.NameInMap("nights")
        private Integer nights;

        @com.aliyun.core.annotation.NameInMap("order_create_time")
        private Long orderCreateTime;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("order_status_desc")
        private String orderStatusDesc;

        @com.aliyun.core.annotation.NameInMap("pay_status")
        private Integer payStatus;

        @com.aliyun.core.annotation.NameInMap("pay_time")
        private Long payTime;

        @com.aliyun.core.annotation.NameInMap("room_num")
        private Integer roomNum;

        @com.aliyun.core.annotation.NameInMap("settle_type")
        private Integer settleType;

        @com.aliyun.core.annotation.NameInMap("trip_mode")
        private Integer tripMode;

        private BaseOrderInfo(Builder builder) {
            this.bookMode = builder.bookMode;
            this.bookerId = builder.bookerId;
            this.bookerName = builder.bookerName;
            this.btripCorpId = builder.btripCorpId;
            this.category = builder.category;
            this.checkInTime = builder.checkInTime;
            this.checkOutTime = builder.checkOutTime;
            this.isAgreementPrice = builder.isAgreementPrice;
            this.nights = builder.nights;
            this.orderCreateTime = builder.orderCreateTime;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.orderStatusDesc = builder.orderStatusDesc;
            this.payStatus = builder.payStatus;
            this.payTime = builder.payTime;
            this.roomNum = builder.roomNum;
            this.settleType = builder.settleType;
            this.tripMode = builder.tripMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseOrderInfo create() {
            return builder().build();
        }

        /**
         * @return bookMode
         */
        public String getBookMode() {
            return this.bookMode;
        }

        /**
         * @return bookerId
         */
        public String getBookerId() {
            return this.bookerId;
        }

        /**
         * @return bookerName
         */
        public String getBookerName() {
            return this.bookerName;
        }

        /**
         * @return btripCorpId
         */
        public String getBtripCorpId() {
            return this.btripCorpId;
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return checkInTime
         */
        public Long getCheckInTime() {
            return this.checkInTime;
        }

        /**
         * @return checkOutTime
         */
        public Long getCheckOutTime() {
            return this.checkOutTime;
        }

        /**
         * @return isAgreementPrice
         */
        public Boolean getIsAgreementPrice() {
            return this.isAgreementPrice;
        }

        /**
         * @return nights
         */
        public Integer getNights() {
            return this.nights;
        }

        /**
         * @return orderCreateTime
         */
        public Long getOrderCreateTime() {
            return this.orderCreateTime;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
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
         * @return payStatus
         */
        public Integer getPayStatus() {
            return this.payStatus;
        }

        /**
         * @return payTime
         */
        public Long getPayTime() {
            return this.payTime;
        }

        /**
         * @return roomNum
         */
        public Integer getRoomNum() {
            return this.roomNum;
        }

        /**
         * @return settleType
         */
        public Integer getSettleType() {
            return this.settleType;
        }

        /**
         * @return tripMode
         */
        public Integer getTripMode() {
            return this.tripMode;
        }

        public static final class Builder {
            private String bookMode; 
            private String bookerId; 
            private String bookerName; 
            private String btripCorpId; 
            private Integer category; 
            private Long checkInTime; 
            private Long checkOutTime; 
            private Boolean isAgreementPrice; 
            private Integer nights; 
            private Long orderCreateTime; 
            private Long orderId; 
            private Integer orderStatus; 
            private String orderStatusDesc; 
            private Integer payStatus; 
            private Long payTime; 
            private Integer roomNum; 
            private Integer settleType; 
            private Integer tripMode; 

            private Builder() {
            } 

            private Builder(BaseOrderInfo model) {
                this.bookMode = model.bookMode;
                this.bookerId = model.bookerId;
                this.bookerName = model.bookerName;
                this.btripCorpId = model.btripCorpId;
                this.category = model.category;
                this.checkInTime = model.checkInTime;
                this.checkOutTime = model.checkOutTime;
                this.isAgreementPrice = model.isAgreementPrice;
                this.nights = model.nights;
                this.orderCreateTime = model.orderCreateTime;
                this.orderId = model.orderId;
                this.orderStatus = model.orderStatus;
                this.orderStatusDesc = model.orderStatusDesc;
                this.payStatus = model.payStatus;
                this.payTime = model.payTime;
                this.roomNum = model.roomNum;
                this.settleType = model.settleType;
                this.tripMode = model.tripMode;
            } 

            /**
             * book_mode.
             */
            public Builder bookMode(String bookMode) {
                this.bookMode = bookMode;
                return this;
            }

            /**
             * booker_id.
             */
            public Builder bookerId(String bookerId) {
                this.bookerId = bookerId;
                return this;
            }

            /**
             * booker_name.
             */
            public Builder bookerName(String bookerName) {
                this.bookerName = bookerName;
                return this;
            }

            /**
             * btrip_corp_id.
             */
            public Builder btripCorpId(String btripCorpId) {
                this.btripCorpId = btripCorpId;
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
             * check_in_time.
             */
            public Builder checkInTime(Long checkInTime) {
                this.checkInTime = checkInTime;
                return this;
            }

            /**
             * check_out_time.
             */
            public Builder checkOutTime(Long checkOutTime) {
                this.checkOutTime = checkOutTime;
                return this;
            }

            /**
             * is_agreement_price.
             */
            public Builder isAgreementPrice(Boolean isAgreementPrice) {
                this.isAgreementPrice = isAgreementPrice;
                return this;
            }

            /**
             * nights.
             */
            public Builder nights(Integer nights) {
                this.nights = nights;
                return this;
            }

            /**
             * order_create_time.
             */
            public Builder orderCreateTime(Long orderCreateTime) {
                this.orderCreateTime = orderCreateTime;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
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
             * pay_status.
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
                return this;
            }

            /**
             * pay_time.
             */
            public Builder payTime(Long payTime) {
                this.payTime = payTime;
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
             * settle_type.
             */
            public Builder settleType(Integer settleType) {
                this.settleType = settleType;
                return this;
            }

            /**
             * trip_mode.
             */
            public Builder tripMode(Integer tripMode) {
                this.tripMode = tripMode;
                return this;
            }

            public BaseOrderInfo build() {
                return new BaseOrderInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class Department extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cascade_dept_mask")
        private String cascadeDeptMask;

        @com.aliyun.core.annotation.NameInMap("cascade_dept_name")
        private String cascadeDeptName;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("out_depart_id")
        private String outDepartId;

        private Department(Builder builder) {
            this.cascadeDeptMask = builder.cascadeDeptMask;
            this.cascadeDeptName = builder.cascadeDeptName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.outDepartId = builder.outDepartId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Department create() {
            return builder().build();
        }

        /**
         * @return cascadeDeptMask
         */
        public String getCascadeDeptMask() {
            return this.cascadeDeptMask;
        }

        /**
         * @return cascadeDeptName
         */
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
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
         * @return outDepartId
         */
        public String getOutDepartId() {
            return this.outDepartId;
        }

        public static final class Builder {
            private String cascadeDeptMask; 
            private String cascadeDeptName; 
            private String departId; 
            private String departName; 
            private String outDepartId; 

            private Builder() {
            } 

            private Builder(Department model) {
                this.cascadeDeptMask = model.cascadeDeptMask;
                this.cascadeDeptName = model.cascadeDeptName;
                this.departId = model.departId;
                this.departName = model.departName;
                this.outDepartId = model.outDepartId;
            } 

            /**
             * cascade_dept_mask.
             */
            public Builder cascadeDeptMask(String cascadeDeptMask) {
                this.cascadeDeptMask = cascadeDeptMask;
                return this;
            }

            /**
             * cascade_dept_name.
             */
            public Builder cascadeDeptName(String cascadeDeptName) {
                this.cascadeDeptName = cascadeDeptName;
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
             * out_depart_id.
             */
            public Builder outDepartId(String outDepartId) {
                this.outDepartId = outDepartId;
                return this;
            }

            public Department build() {
                return new Department(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class BookerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("booker_role")
        private String bookerRole;

        @com.aliyun.core.annotation.NameInMap("contact_email")
        private String contactEmail;

        @com.aliyun.core.annotation.NameInMap("contact_phone")
        private String contactPhone;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("department")
        private Department department;

        @com.aliyun.core.annotation.NameInMap("en_name")
        private String enName;

        @com.aliyun.core.annotation.NameInMap("job_no")
        private String jobNo;

        @com.aliyun.core.annotation.NameInMap("need_apply")
        private Boolean needApply;

        @com.aliyun.core.annotation.NameInMap("real_name")
        private String realName;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private BookerInfo(Builder builder) {
            this.bookerRole = builder.bookerRole;
            this.contactEmail = builder.contactEmail;
            this.contactPhone = builder.contactPhone;
            this.corpId = builder.corpId;
            this.department = builder.department;
            this.enName = builder.enName;
            this.jobNo = builder.jobNo;
            this.needApply = builder.needApply;
            this.realName = builder.realName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BookerInfo create() {
            return builder().build();
        }

        /**
         * @return bookerRole
         */
        public String getBookerRole() {
            return this.bookerRole;
        }

        /**
         * @return contactEmail
         */
        public String getContactEmail() {
            return this.contactEmail;
        }

        /**
         * @return contactPhone
         */
        public String getContactPhone() {
            return this.contactPhone;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return department
         */
        public Department getDepartment() {
            return this.department;
        }

        /**
         * @return enName
         */
        public String getEnName() {
            return this.enName;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
        }

        /**
         * @return needApply
         */
        public Boolean getNeedApply() {
            return this.needApply;
        }

        /**
         * @return realName
         */
        public String getRealName() {
            return this.realName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String bookerRole; 
            private String contactEmail; 
            private String contactPhone; 
            private String corpId; 
            private Department department; 
            private String enName; 
            private String jobNo; 
            private Boolean needApply; 
            private String realName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(BookerInfo model) {
                this.bookerRole = model.bookerRole;
                this.contactEmail = model.contactEmail;
                this.contactPhone = model.contactPhone;
                this.corpId = model.corpId;
                this.department = model.department;
                this.enName = model.enName;
                this.jobNo = model.jobNo;
                this.needApply = model.needApply;
                this.realName = model.realName;
                this.userId = model.userId;
            } 

            /**
             * booker_role.
             */
            public Builder bookerRole(String bookerRole) {
                this.bookerRole = bookerRole;
                return this;
            }

            /**
             * contact_email.
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * contact_phone.
             */
            public Builder contactPhone(String contactPhone) {
                this.contactPhone = contactPhone;
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
             * department.
             */
            public Builder department(Department department) {
                this.department = department;
                return this;
            }

            /**
             * en_name.
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * job_no.
             */
            public Builder jobNo(String jobNo) {
                this.jobNo = jobNo;
                return this;
            }

            /**
             * need_apply.
             */
            public Builder needApply(Boolean needApply) {
                this.needApply = needApply;
                return this;
            }

            /**
             * real_name.
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public BookerInfo build() {
                return new BookerInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class HotelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("country_code")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("country_name")
        private String countryName;

        @com.aliyun.core.annotation.NameInMap("district_code")
        private String districtCode;

        @com.aliyun.core.annotation.NameInMap("district_name")
        private String districtName;

        @com.aliyun.core.annotation.NameInMap("hotel_address")
        private String hotelAddress;

        @com.aliyun.core.annotation.NameInMap("hotel_brand_code")
        private String hotelBrandCode;

        @com.aliyun.core.annotation.NameInMap("hotel_brand_name")
        private String hotelBrandName;

        @com.aliyun.core.annotation.NameInMap("hotel_group")
        private String hotelGroup;

        @com.aliyun.core.annotation.NameInMap("hotel_id")
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("hotel_name")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("hotel_name_en")
        private String hotelNameEn;

        @com.aliyun.core.annotation.NameInMap("star")
        private String star;

        private HotelInfo(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.countryCode = builder.countryCode;
            this.countryName = builder.countryName;
            this.districtCode = builder.districtCode;
            this.districtName = builder.districtName;
            this.hotelAddress = builder.hotelAddress;
            this.hotelBrandCode = builder.hotelBrandCode;
            this.hotelBrandName = builder.hotelBrandName;
            this.hotelGroup = builder.hotelGroup;
            this.hotelId = builder.hotelId;
            this.hotelName = builder.hotelName;
            this.hotelNameEn = builder.hotelNameEn;
            this.star = builder.star;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelInfo create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
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
         * @return districtCode
         */
        public String getDistrictCode() {
            return this.districtCode;
        }

        /**
         * @return districtName
         */
        public String getDistrictName() {
            return this.districtName;
        }

        /**
         * @return hotelAddress
         */
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        /**
         * @return hotelBrandCode
         */
        public String getHotelBrandCode() {
            return this.hotelBrandCode;
        }

        /**
         * @return hotelBrandName
         */
        public String getHotelBrandName() {
            return this.hotelBrandName;
        }

        /**
         * @return hotelGroup
         */
        public String getHotelGroup() {
            return this.hotelGroup;
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return hotelNameEn
         */
        public String getHotelNameEn() {
            return this.hotelNameEn;
        }

        /**
         * @return star
         */
        public String getStar() {
            return this.star;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private String countryCode; 
            private String countryName; 
            private String districtCode; 
            private String districtName; 
            private String hotelAddress; 
            private String hotelBrandCode; 
            private String hotelBrandName; 
            private String hotelGroup; 
            private String hotelId; 
            private String hotelName; 
            private String hotelNameEn; 
            private String star; 

            private Builder() {
            } 

            private Builder(HotelInfo model) {
                this.cityCode = model.cityCode;
                this.cityName = model.cityName;
                this.countryCode = model.countryCode;
                this.countryName = model.countryName;
                this.districtCode = model.districtCode;
                this.districtName = model.districtName;
                this.hotelAddress = model.hotelAddress;
                this.hotelBrandCode = model.hotelBrandCode;
                this.hotelBrandName = model.hotelBrandName;
                this.hotelGroup = model.hotelGroup;
                this.hotelId = model.hotelId;
                this.hotelName = model.hotelName;
                this.hotelNameEn = model.hotelNameEn;
                this.star = model.star;
            } 

            /**
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
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
             * district_code.
             */
            public Builder districtCode(String districtCode) {
                this.districtCode = districtCode;
                return this;
            }

            /**
             * district_name.
             */
            public Builder districtName(String districtName) {
                this.districtName = districtName;
                return this;
            }

            /**
             * hotel_address.
             */
            public Builder hotelAddress(String hotelAddress) {
                this.hotelAddress = hotelAddress;
                return this;
            }

            /**
             * hotel_brand_code.
             */
            public Builder hotelBrandCode(String hotelBrandCode) {
                this.hotelBrandCode = hotelBrandCode;
                return this;
            }

            /**
             * hotel_brand_name.
             */
            public Builder hotelBrandName(String hotelBrandName) {
                this.hotelBrandName = hotelBrandName;
                return this;
            }

            /**
             * hotel_group.
             */
            public Builder hotelGroup(String hotelGroup) {
                this.hotelGroup = hotelGroup;
                return this;
            }

            /**
             * hotel_id.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
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
             * hotel_name_en.
             */
            public Builder hotelNameEn(String hotelNameEn) {
                this.hotelNameEn = hotelNameEn;
                return this;
            }

            /**
             * star.
             */
            public Builder star(String star) {
                this.star = star;
                return this;
            }

            public HotelInfo build() {
                return new HotelInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class HotelOrderFeeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order_amount")
        private Long orderAmount;

        @com.aliyun.core.annotation.NameInMap("other_fee")
        private Long otherFee;

        @com.aliyun.core.annotation.NameInMap("pay_amount")
        private Long payAmount;

        @com.aliyun.core.annotation.NameInMap("promotion_amount")
        private Long promotionAmount;

        @com.aliyun.core.annotation.NameInMap("total_room_amount")
        private Long totalRoomAmount;

        private HotelOrderFeeInfo(Builder builder) {
            this.orderAmount = builder.orderAmount;
            this.otherFee = builder.otherFee;
            this.payAmount = builder.payAmount;
            this.promotionAmount = builder.promotionAmount;
            this.totalRoomAmount = builder.totalRoomAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelOrderFeeInfo create() {
            return builder().build();
        }

        /**
         * @return orderAmount
         */
        public Long getOrderAmount() {
            return this.orderAmount;
        }

        /**
         * @return otherFee
         */
        public Long getOtherFee() {
            return this.otherFee;
        }

        /**
         * @return payAmount
         */
        public Long getPayAmount() {
            return this.payAmount;
        }

        /**
         * @return promotionAmount
         */
        public Long getPromotionAmount() {
            return this.promotionAmount;
        }

        /**
         * @return totalRoomAmount
         */
        public Long getTotalRoomAmount() {
            return this.totalRoomAmount;
        }

        public static final class Builder {
            private Long orderAmount; 
            private Long otherFee; 
            private Long payAmount; 
            private Long promotionAmount; 
            private Long totalRoomAmount; 

            private Builder() {
            } 

            private Builder(HotelOrderFeeInfo model) {
                this.orderAmount = model.orderAmount;
                this.otherFee = model.otherFee;
                this.payAmount = model.payAmount;
                this.promotionAmount = model.promotionAmount;
                this.totalRoomAmount = model.totalRoomAmount;
            } 

            /**
             * order_amount.
             */
            public Builder orderAmount(Long orderAmount) {
                this.orderAmount = orderAmount;
                return this;
            }

            /**
             * other_fee.
             */
            public Builder otherFee(Long otherFee) {
                this.otherFee = otherFee;
                return this;
            }

            /**
             * pay_amount.
             */
            public Builder payAmount(Long payAmount) {
                this.payAmount = payAmount;
                return this;
            }

            /**
             * promotion_amount.
             */
            public Builder promotionAmount(Long promotionAmount) {
                this.promotionAmount = promotionAmount;
                return this;
            }

            /**
             * total_room_amount.
             */
            public Builder totalRoomAmount(Long totalRoomAmount) {
                this.totalRoomAmount = totalRoomAmount;
                return this;
            }

            public HotelOrderFeeInfo build() {
                return new HotelOrderFeeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class HotelOrderRefundInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cancel_fine")
        private Long cancelFine;

        @com.aliyun.core.annotation.NameInMap("refund_apply_id")
        private Long refundApplyId;

        @com.aliyun.core.annotation.NameInMap("refund_end_time")
        private Long refundEndTime;

        @com.aliyun.core.annotation.NameInMap("refund_price")
        private Long refundPrice;

        @com.aliyun.core.annotation.NameInMap("refund_reason")
        private String refundReason;

        @com.aliyun.core.annotation.NameInMap("refund_start_time")
        private Long refundStartTime;

        @com.aliyun.core.annotation.NameInMap("refund_type")
        private Integer refundType;

        private HotelOrderRefundInfo(Builder builder) {
            this.cancelFine = builder.cancelFine;
            this.refundApplyId = builder.refundApplyId;
            this.refundEndTime = builder.refundEndTime;
            this.refundPrice = builder.refundPrice;
            this.refundReason = builder.refundReason;
            this.refundStartTime = builder.refundStartTime;
            this.refundType = builder.refundType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelOrderRefundInfo create() {
            return builder().build();
        }

        /**
         * @return cancelFine
         */
        public Long getCancelFine() {
            return this.cancelFine;
        }

        /**
         * @return refundApplyId
         */
        public Long getRefundApplyId() {
            return this.refundApplyId;
        }

        /**
         * @return refundEndTime
         */
        public Long getRefundEndTime() {
            return this.refundEndTime;
        }

        /**
         * @return refundPrice
         */
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        /**
         * @return refundReason
         */
        public String getRefundReason() {
            return this.refundReason;
        }

        /**
         * @return refundStartTime
         */
        public Long getRefundStartTime() {
            return this.refundStartTime;
        }

        /**
         * @return refundType
         */
        public Integer getRefundType() {
            return this.refundType;
        }

        public static final class Builder {
            private Long cancelFine; 
            private Long refundApplyId; 
            private Long refundEndTime; 
            private Long refundPrice; 
            private String refundReason; 
            private Long refundStartTime; 
            private Integer refundType; 

            private Builder() {
            } 

            private Builder(HotelOrderRefundInfo model) {
                this.cancelFine = model.cancelFine;
                this.refundApplyId = model.refundApplyId;
                this.refundEndTime = model.refundEndTime;
                this.refundPrice = model.refundPrice;
                this.refundReason = model.refundReason;
                this.refundStartTime = model.refundStartTime;
                this.refundType = model.refundType;
            } 

            /**
             * cancel_fine.
             */
            public Builder cancelFine(Long cancelFine) {
                this.cancelFine = cancelFine;
                return this;
            }

            /**
             * refund_apply_id.
             */
            public Builder refundApplyId(Long refundApplyId) {
                this.refundApplyId = refundApplyId;
                return this;
            }

            /**
             * refund_end_time.
             */
            public Builder refundEndTime(Long refundEndTime) {
                this.refundEndTime = refundEndTime;
                return this;
            }

            /**
             * refund_price.
             */
            public Builder refundPrice(Long refundPrice) {
                this.refundPrice = refundPrice;
                return this;
            }

            /**
             * refund_reason.
             */
            public Builder refundReason(String refundReason) {
                this.refundReason = refundReason;
                return this;
            }

            /**
             * refund_start_time.
             */
            public Builder refundStartTime(Long refundStartTime) {
                this.refundStartTime = refundStartTime;
                return this;
            }

            /**
             * refund_type.
             */
            public Builder refundType(Integer refundType) {
                this.refundType = refundType;
                return this;
            }

            public HotelOrderRefundInfo build() {
                return new HotelOrderRefundInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class ExceedApply extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("exceed_reason")
        private String exceedReason;

        @com.aliyun.core.annotation.NameInMap("exceed_type")
        private Integer exceedType;

        @com.aliyun.core.annotation.NameInMap("flow_no")
        private Long flowNo;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        private ExceedApply(Builder builder) {
            this.exceedReason = builder.exceedReason;
            this.exceedType = builder.exceedType;
            this.flowNo = builder.flowNo;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExceedApply create() {
            return builder().build();
        }

        /**
         * @return exceedReason
         */
        public String getExceedReason() {
            return this.exceedReason;
        }

        /**
         * @return exceedType
         */
        public Integer getExceedType() {
            return this.exceedType;
        }

        /**
         * @return flowNo
         */
        public Long getFlowNo() {
            return this.flowNo;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String exceedReason; 
            private Integer exceedType; 
            private Long flowNo; 
            private Long id; 

            private Builder() {
            } 

            private Builder(ExceedApply model) {
                this.exceedReason = model.exceedReason;
                this.exceedType = model.exceedType;
                this.flowNo = model.flowNo;
                this.id = model.id;
            } 

            /**
             * exceed_reason.
             */
            public Builder exceedReason(String exceedReason) {
                this.exceedReason = exceedReason;
                return this;
            }

            /**
             * exceed_type.
             */
            public Builder exceedType(Integer exceedType) {
                this.exceedType = exceedType;
                return this;
            }

            /**
             * flow_no.
             */
            public Builder flowNo(Long flowNo) {
                this.flowNo = flowNo;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public ExceedApply build() {
                return new ExceedApply(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class ApplyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_business_id")
        private String applyBusinessId;

        @com.aliyun.core.annotation.NameInMap("apply_business_name")
        private String applyBusinessName;

        @com.aliyun.core.annotation.NameInMap("apply_id")
        private String applyId;

        @com.aliyun.core.annotation.NameInMap("exceed_apply")
        private java.util.List<ExceedApply> exceedApply;

        @com.aliyun.core.annotation.NameInMap("itinerary_no")
        private String itineraryNo;

        private ApplyInfo(Builder builder) {
            this.applyBusinessId = builder.applyBusinessId;
            this.applyBusinessName = builder.applyBusinessName;
            this.applyId = builder.applyId;
            this.exceedApply = builder.exceedApply;
            this.itineraryNo = builder.itineraryNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyInfo create() {
            return builder().build();
        }

        /**
         * @return applyBusinessId
         */
        public String getApplyBusinessId() {
            return this.applyBusinessId;
        }

        /**
         * @return applyBusinessName
         */
        public String getApplyBusinessName() {
            return this.applyBusinessName;
        }

        /**
         * @return applyId
         */
        public String getApplyId() {
            return this.applyId;
        }

        /**
         * @return exceedApply
         */
        public java.util.List<ExceedApply> getExceedApply() {
            return this.exceedApply;
        }

        /**
         * @return itineraryNo
         */
        public String getItineraryNo() {
            return this.itineraryNo;
        }

        public static final class Builder {
            private String applyBusinessId; 
            private String applyBusinessName; 
            private String applyId; 
            private java.util.List<ExceedApply> exceedApply; 
            private String itineraryNo; 

            private Builder() {
            } 

            private Builder(ApplyInfo model) {
                this.applyBusinessId = model.applyBusinessId;
                this.applyBusinessName = model.applyBusinessName;
                this.applyId = model.applyId;
                this.exceedApply = model.exceedApply;
                this.itineraryNo = model.itineraryNo;
            } 

            /**
             * apply_business_id.
             */
            public Builder applyBusinessId(String applyBusinessId) {
                this.applyBusinessId = applyBusinessId;
                return this;
            }

            /**
             * apply_business_name.
             */
            public Builder applyBusinessName(String applyBusinessName) {
                this.applyBusinessName = applyBusinessName;
                return this;
            }

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * exceed_apply.
             */
            public Builder exceedApply(java.util.List<ExceedApply> exceedApply) {
                this.exceedApply = exceedApply;
                return this;
            }

            /**
             * itinerary_no.
             */
            public Builder itineraryNo(String itineraryNo) {
                this.itineraryNo = itineraryNo;
                return this;
            }

            public ApplyInfo build() {
                return new ApplyInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class TraverInfosDepartment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cascade_dept_mask")
        private String cascadeDeptMask;

        @com.aliyun.core.annotation.NameInMap("cascade_dept_name")
        private String cascadeDeptName;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("out_depart_id")
        private String outDepartId;

        private TraverInfosDepartment(Builder builder) {
            this.cascadeDeptMask = builder.cascadeDeptMask;
            this.cascadeDeptName = builder.cascadeDeptName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.outDepartId = builder.outDepartId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraverInfosDepartment create() {
            return builder().build();
        }

        /**
         * @return cascadeDeptMask
         */
        public String getCascadeDeptMask() {
            return this.cascadeDeptMask;
        }

        /**
         * @return cascadeDeptName
         */
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
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
         * @return outDepartId
         */
        public String getOutDepartId() {
            return this.outDepartId;
        }

        public static final class Builder {
            private String cascadeDeptMask; 
            private String cascadeDeptName; 
            private String departId; 
            private String departName; 
            private String outDepartId; 

            private Builder() {
            } 

            private Builder(TraverInfosDepartment model) {
                this.cascadeDeptMask = model.cascadeDeptMask;
                this.cascadeDeptName = model.cascadeDeptName;
                this.departId = model.departId;
                this.departName = model.departName;
                this.outDepartId = model.outDepartId;
            } 

            /**
             * cascade_dept_mask.
             */
            public Builder cascadeDeptMask(String cascadeDeptMask) {
                this.cascadeDeptMask = cascadeDeptMask;
                return this;
            }

            /**
             * cascade_dept_name.
             */
            public Builder cascadeDeptName(String cascadeDeptName) {
                this.cascadeDeptName = cascadeDeptName;
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
             * out_depart_id.
             */
            public Builder outDepartId(String outDepartId) {
                this.outDepartId = outDepartId;
                return this;
            }

            public TraverInfosDepartment build() {
                return new TraverInfosDepartment(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class TripCostCenter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost_center_code")
        private String costCenterCode;

        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private String costCenterId;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("external_ext_field")
        private String externalExtField;

        @com.aliyun.core.annotation.NameInMap("fee_type")
        private Integer feeType;

        @com.aliyun.core.annotation.NameInMap("invoice_id")
        private Long invoiceId;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        private TripCostCenter(Builder builder) {
            this.costCenterCode = builder.costCenterCode;
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.externalExtField = builder.externalExtField;
            this.feeType = builder.feeType;
            this.invoiceId = builder.invoiceId;
            this.invoiceTitle = builder.invoiceTitle;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TripCostCenter create() {
            return builder().build();
        }

        /**
         * @return costCenterCode
         */
        public String getCostCenterCode() {
            return this.costCenterCode;
        }

        /**
         * @return costCenterId
         */
        public String getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return externalExtField
         */
        public String getExternalExtField() {
            return this.externalExtField;
        }

        /**
         * @return feeType
         */
        public Integer getFeeType() {
            return this.feeType;
        }

        /**
         * @return invoiceId
         */
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectTitle
         */
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public static final class Builder {
            private String costCenterCode; 
            private String costCenterId; 
            private String costCenterName; 
            private String externalExtField; 
            private Integer feeType; 
            private Long invoiceId; 
            private String invoiceTitle; 
            private String projectCode; 
            private String projectTitle; 

            private Builder() {
            } 

            private Builder(TripCostCenter model) {
                this.costCenterCode = model.costCenterCode;
                this.costCenterId = model.costCenterId;
                this.costCenterName = model.costCenterName;
                this.externalExtField = model.externalExtField;
                this.feeType = model.feeType;
                this.invoiceId = model.invoiceId;
                this.invoiceTitle = model.invoiceTitle;
                this.projectCode = model.projectCode;
                this.projectTitle = model.projectTitle;
            } 

            /**
             * cost_center_code.
             */
            public Builder costCenterCode(String costCenterCode) {
                this.costCenterCode = costCenterCode;
                return this;
            }

            /**
             * cost_center_id.
             */
            public Builder costCenterId(String costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * cost_center_name.
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * external_ext_field.
             */
            public Builder externalExtField(String externalExtField) {
                this.externalExtField = externalExtField;
                return this;
            }

            /**
             * fee_type.
             */
            public Builder feeType(Integer feeType) {
                this.feeType = feeType;
                return this;
            }

            /**
             * invoice_id.
             */
            public Builder invoiceId(Long invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * invoice_title.
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
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
             * project_title.
             */
            public Builder projectTitle(String projectTitle) {
                this.projectTitle = projectTitle;
                return this;
            }

            public TripCostCenter build() {
                return new TripCostCenter(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class TraverInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_info")
        private ApplyInfo applyInfo;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        private Integer certType;

        @com.aliyun.core.annotation.NameInMap("department")
        private TraverInfosDepartment department;

        @com.aliyun.core.annotation.NameInMap("job_no")
        private String jobNo;

        @com.aliyun.core.annotation.NameInMap("telephone")
        private String telephone;

        @com.aliyun.core.annotation.NameInMap("traveler_id")
        private String travelerId;

        @com.aliyun.core.annotation.NameInMap("traveler_name")
        private String travelerName;

        @com.aliyun.core.annotation.NameInMap("traveler_type")
        private Integer travelerType;

        @com.aliyun.core.annotation.NameInMap("trip_cost_center")
        private TripCostCenter tripCostCenter;

        @com.aliyun.core.annotation.NameInMap("user_type")
        private Integer userType;

        private TraverInfos(Builder builder) {
            this.applyInfo = builder.applyInfo;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.department = builder.department;
            this.jobNo = builder.jobNo;
            this.telephone = builder.telephone;
            this.travelerId = builder.travelerId;
            this.travelerName = builder.travelerName;
            this.travelerType = builder.travelerType;
            this.tripCostCenter = builder.tripCostCenter;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraverInfos create() {
            return builder().build();
        }

        /**
         * @return applyInfo
         */
        public ApplyInfo getApplyInfo() {
            return this.applyInfo;
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certType
         */
        public Integer getCertType() {
            return this.certType;
        }

        /**
         * @return department
         */
        public TraverInfosDepartment getDepartment() {
            return this.department;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
        }

        /**
         * @return telephone
         */
        public String getTelephone() {
            return this.telephone;
        }

        /**
         * @return travelerId
         */
        public String getTravelerId() {
            return this.travelerId;
        }

        /**
         * @return travelerName
         */
        public String getTravelerName() {
            return this.travelerName;
        }

        /**
         * @return travelerType
         */
        public Integer getTravelerType() {
            return this.travelerType;
        }

        /**
         * @return tripCostCenter
         */
        public TripCostCenter getTripCostCenter() {
            return this.tripCostCenter;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private ApplyInfo applyInfo; 
            private String certNo; 
            private Integer certType; 
            private TraverInfosDepartment department; 
            private String jobNo; 
            private String telephone; 
            private String travelerId; 
            private String travelerName; 
            private Integer travelerType; 
            private TripCostCenter tripCostCenter; 
            private Integer userType; 

            private Builder() {
            } 

            private Builder(TraverInfos model) {
                this.applyInfo = model.applyInfo;
                this.certNo = model.certNo;
                this.certType = model.certType;
                this.department = model.department;
                this.jobNo = model.jobNo;
                this.telephone = model.telephone;
                this.travelerId = model.travelerId;
                this.travelerName = model.travelerName;
                this.travelerType = model.travelerType;
                this.tripCostCenter = model.tripCostCenter;
                this.userType = model.userType;
            } 

            /**
             * apply_info.
             */
            public Builder applyInfo(ApplyInfo applyInfo) {
                this.applyInfo = applyInfo;
                return this;
            }

            /**
             * cert_no.
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * cert_type.
             */
            public Builder certType(Integer certType) {
                this.certType = certType;
                return this;
            }

            /**
             * department.
             */
            public Builder department(TraverInfosDepartment department) {
                this.department = department;
                return this;
            }

            /**
             * job_no.
             */
            public Builder jobNo(String jobNo) {
                this.jobNo = jobNo;
                return this;
            }

            /**
             * telephone.
             */
            public Builder telephone(String telephone) {
                this.telephone = telephone;
                return this;
            }

            /**
             * traveler_id.
             */
            public Builder travelerId(String travelerId) {
                this.travelerId = travelerId;
                return this;
            }

            /**
             * traveler_name.
             */
            public Builder travelerName(String travelerName) {
                this.travelerName = travelerName;
                return this;
            }

            /**
             * traveler_type.
             */
            public Builder travelerType(Integer travelerType) {
                this.travelerType = travelerType;
                return this;
            }

            /**
             * trip_cost_center.
             */
            public Builder tripCostCenter(TripCostCenter tripCostCenter) {
                this.tripCostCenter = tripCostCenter;
                return this;
            }

            /**
             * user_type.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            public TraverInfos build() {
                return new TraverInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class RoomTraverInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("live_room_no")
        private String liveRoomNo;

        @com.aliyun.core.annotation.NameInMap("room_type_name")
        private String roomTypeName;

        @com.aliyun.core.annotation.NameInMap("traver_infos")
        private java.util.List<TraverInfos> traverInfos;

        private RoomTraverInfo(Builder builder) {
            this.liveRoomNo = builder.liveRoomNo;
            this.roomTypeName = builder.roomTypeName;
            this.traverInfos = builder.traverInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomTraverInfo create() {
            return builder().build();
        }

        /**
         * @return liveRoomNo
         */
        public String getLiveRoomNo() {
            return this.liveRoomNo;
        }

        /**
         * @return roomTypeName
         */
        public String getRoomTypeName() {
            return this.roomTypeName;
        }

        /**
         * @return traverInfos
         */
        public java.util.List<TraverInfos> getTraverInfos() {
            return this.traverInfos;
        }

        public static final class Builder {
            private String liveRoomNo; 
            private String roomTypeName; 
            private java.util.List<TraverInfos> traverInfos; 

            private Builder() {
            } 

            private Builder(RoomTraverInfo model) {
                this.liveRoomNo = model.liveRoomNo;
                this.roomTypeName = model.roomTypeName;
                this.traverInfos = model.traverInfos;
            } 

            /**
             * live_room_no.
             */
            public Builder liveRoomNo(String liveRoomNo) {
                this.liveRoomNo = liveRoomNo;
                return this;
            }

            /**
             * room_type_name.
             */
            public Builder roomTypeName(String roomTypeName) {
                this.roomTypeName = roomTypeName;
                return this;
            }

            /**
             * traver_infos.
             */
            public Builder traverInfos(java.util.List<TraverInfos> traverInfos) {
                this.traverInfos = traverInfos;
                return this;
            }

            public RoomTraverInfo build() {
                return new RoomTraverInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderInfoQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("base_order_info")
        private BaseOrderInfo baseOrderInfo;

        @com.aliyun.core.annotation.NameInMap("booker_info")
        private BookerInfo bookerInfo;

        @com.aliyun.core.annotation.NameInMap("hotel_info")
        private HotelInfo hotelInfo;

        @com.aliyun.core.annotation.NameInMap("hotel_order_fee_info")
        private HotelOrderFeeInfo hotelOrderFeeInfo;

        @com.aliyun.core.annotation.NameInMap("hotel_order_refund_info")
        private java.util.List<HotelOrderRefundInfo> hotelOrderRefundInfo;

        @com.aliyun.core.annotation.NameInMap("room_traver_info")
        private java.util.List<RoomTraverInfo> roomTraverInfo;

        private Module(Builder builder) {
            this.baseOrderInfo = builder.baseOrderInfo;
            this.bookerInfo = builder.bookerInfo;
            this.hotelInfo = builder.hotelInfo;
            this.hotelOrderFeeInfo = builder.hotelOrderFeeInfo;
            this.hotelOrderRefundInfo = builder.hotelOrderRefundInfo;
            this.roomTraverInfo = builder.roomTraverInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return baseOrderInfo
         */
        public BaseOrderInfo getBaseOrderInfo() {
            return this.baseOrderInfo;
        }

        /**
         * @return bookerInfo
         */
        public BookerInfo getBookerInfo() {
            return this.bookerInfo;
        }

        /**
         * @return hotelInfo
         */
        public HotelInfo getHotelInfo() {
            return this.hotelInfo;
        }

        /**
         * @return hotelOrderFeeInfo
         */
        public HotelOrderFeeInfo getHotelOrderFeeInfo() {
            return this.hotelOrderFeeInfo;
        }

        /**
         * @return hotelOrderRefundInfo
         */
        public java.util.List<HotelOrderRefundInfo> getHotelOrderRefundInfo() {
            return this.hotelOrderRefundInfo;
        }

        /**
         * @return roomTraverInfo
         */
        public java.util.List<RoomTraverInfo> getRoomTraverInfo() {
            return this.roomTraverInfo;
        }

        public static final class Builder {
            private BaseOrderInfo baseOrderInfo; 
            private BookerInfo bookerInfo; 
            private HotelInfo hotelInfo; 
            private HotelOrderFeeInfo hotelOrderFeeInfo; 
            private java.util.List<HotelOrderRefundInfo> hotelOrderRefundInfo; 
            private java.util.List<RoomTraverInfo> roomTraverInfo; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.baseOrderInfo = model.baseOrderInfo;
                this.bookerInfo = model.bookerInfo;
                this.hotelInfo = model.hotelInfo;
                this.hotelOrderFeeInfo = model.hotelOrderFeeInfo;
                this.hotelOrderRefundInfo = model.hotelOrderRefundInfo;
                this.roomTraverInfo = model.roomTraverInfo;
            } 

            /**
             * base_order_info.
             */
            public Builder baseOrderInfo(BaseOrderInfo baseOrderInfo) {
                this.baseOrderInfo = baseOrderInfo;
                return this;
            }

            /**
             * booker_info.
             */
            public Builder bookerInfo(BookerInfo bookerInfo) {
                this.bookerInfo = bookerInfo;
                return this;
            }

            /**
             * hotel_info.
             */
            public Builder hotelInfo(HotelInfo hotelInfo) {
                this.hotelInfo = hotelInfo;
                return this;
            }

            /**
             * hotel_order_fee_info.
             */
            public Builder hotelOrderFeeInfo(HotelOrderFeeInfo hotelOrderFeeInfo) {
                this.hotelOrderFeeInfo = hotelOrderFeeInfo;
                return this;
            }

            /**
             * hotel_order_refund_info.
             */
            public Builder hotelOrderRefundInfo(java.util.List<HotelOrderRefundInfo> hotelOrderRefundInfo) {
                this.hotelOrderRefundInfo = hotelOrderRefundInfo;
                return this;
            }

            /**
             * room_traver_info.
             */
            public Builder roomTraverInfo(java.util.List<RoomTraverInfo> roomTraverInfo) {
                this.roomTraverInfo = roomTraverInfo;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
