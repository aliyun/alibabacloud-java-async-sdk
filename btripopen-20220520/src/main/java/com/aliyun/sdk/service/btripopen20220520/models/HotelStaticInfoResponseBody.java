// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelStaticInfoResponseBody} extends {@link TeaModel}
 *
 * <p>HotelStaticInfoResponseBody</p>
 */
public class HotelStaticInfoResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private HotelStaticInfoResponseBody(Builder builder) {
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

    public static HotelStaticInfoResponseBody create() {
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
         * module
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

        public HotelStaticInfoResponseBody build() {
            return new HotelStaticInfoResponseBody(this);
        } 

    } 

    public static class ExpandInfo extends TeaModel {
        @NameInMap("check_in")
        private String checkIn;

        @NameInMap("check_out")
        private String checkOut;

        @NameInMap("decorate_time")
        private String decorateTime;

        @NameInMap("floors")
        private String floors;

        @NameInMap("hotel_facilities")
        private java.util.List < String > hotelFacilities;

        @NameInMap("hotel_type")
        private Integer hotelType;

        @NameInMap("opening_time")
        private String openingTime;

        @NameInMap("room_facilities")
        private java.util.List < String > roomFacilities;

        @NameInMap("rooms")
        private Integer rooms;

        @NameInMap("service")
        private java.util.List < String > service;

        @NameInMap("theme_tag")
        private String themeTag;

        private ExpandInfo(Builder builder) {
            this.checkIn = builder.checkIn;
            this.checkOut = builder.checkOut;
            this.decorateTime = builder.decorateTime;
            this.floors = builder.floors;
            this.hotelFacilities = builder.hotelFacilities;
            this.hotelType = builder.hotelType;
            this.openingTime = builder.openingTime;
            this.roomFacilities = builder.roomFacilities;
            this.rooms = builder.rooms;
            this.service = builder.service;
            this.themeTag = builder.themeTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpandInfo create() {
            return builder().build();
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
         * @return decorateTime
         */
        public String getDecorateTime() {
            return this.decorateTime;
        }

        /**
         * @return floors
         */
        public String getFloors() {
            return this.floors;
        }

        /**
         * @return hotelFacilities
         */
        public java.util.List < String > getHotelFacilities() {
            return this.hotelFacilities;
        }

        /**
         * @return hotelType
         */
        public Integer getHotelType() {
            return this.hotelType;
        }

        /**
         * @return openingTime
         */
        public String getOpeningTime() {
            return this.openingTime;
        }

        /**
         * @return roomFacilities
         */
        public java.util.List < String > getRoomFacilities() {
            return this.roomFacilities;
        }

        /**
         * @return rooms
         */
        public Integer getRooms() {
            return this.rooms;
        }

        /**
         * @return service
         */
        public java.util.List < String > getService() {
            return this.service;
        }

        /**
         * @return themeTag
         */
        public String getThemeTag() {
            return this.themeTag;
        }

        public static final class Builder {
            private String checkIn; 
            private String checkOut; 
            private String decorateTime; 
            private String floors; 
            private java.util.List < String > hotelFacilities; 
            private Integer hotelType; 
            private String openingTime; 
            private java.util.List < String > roomFacilities; 
            private Integer rooms; 
            private java.util.List < String > service; 
            private String themeTag; 

            /**
             * 入住时间（最早入住时间）
             */
            public Builder checkIn(String checkIn) {
                this.checkIn = checkIn;
                return this;
            }

            /**
             * 离店时间（最早离店时间）
             */
            public Builder checkOut(String checkOut) {
                this.checkOut = checkOut;
                return this;
            }

            /**
             * 装修时间
             */
            public Builder decorateTime(String decorateTime) {
                this.decorateTime = decorateTime;
                return this;
            }

            /**
             * 楼层信息
             */
            public Builder floors(String floors) {
                this.floors = floors;
                return this;
            }

            /**
             * 酒店设施
             */
            public Builder hotelFacilities(java.util.List < String > hotelFacilities) {
                this.hotelFacilities = hotelFacilities;
                return this;
            }

            /**
             * 酒店类型
             */
            public Builder hotelType(Integer hotelType) {
                this.hotelType = hotelType;
                return this;
            }

            /**
             * 开业时间
             */
            public Builder openingTime(String openingTime) {
                this.openingTime = openingTime;
                return this;
            }

            /**
             * 房型设施
             */
            public Builder roomFacilities(java.util.List < String > roomFacilities) {
                this.roomFacilities = roomFacilities;
                return this;
            }

            /**
             * 酒店房间数
             */
            public Builder rooms(Integer rooms) {
                this.rooms = rooms;
                return this;
            }

            /**
             * 酒店服务
             */
            public Builder service(java.util.List < String > service) {
                this.service = service;
                return this;
            }

            /**
             * 酒店特色
             */
            public Builder themeTag(String themeTag) {
                this.themeTag = themeTag;
                return this;
            }

            public ExpandInfo build() {
                return new ExpandInfo(this);
            } 

        } 

    }
    public static class Imageinfos extends TeaModel {
        @NameInMap("desc")
        private String desc;

        @NameInMap("tag")
        private Integer tag;

        @NameInMap("url")
        private String url;

        private Imageinfos(Builder builder) {
            this.desc = builder.desc;
            this.tag = builder.tag;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Imageinfos create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return tag
         */
        public Integer getTag() {
            return this.tag;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String desc; 
            private Integer tag; 
            private String url; 

            /**
             * 图片描述
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * 图片类型
             */
            public Builder tag(Integer tag) {
                this.tag = tag;
                return this;
            }

            /**
             * 地址
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Imageinfos build() {
                return new Imageinfos(this);
            } 

        } 

    }
    public static class BedInfos extends TeaModel {
        @NameInMap("bed_desc")
        private String bedDesc;

        @NameInMap("bed_num")
        private Integer bedNum;

        @NameInMap("bed_size")
        private String bedSize;

        @NameInMap("bed_type")
        private String bedType;

        private BedInfos(Builder builder) {
            this.bedDesc = builder.bedDesc;
            this.bedNum = builder.bedNum;
            this.bedSize = builder.bedSize;
            this.bedType = builder.bedType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BedInfos create() {
            return builder().build();
        }

        /**
         * @return bedDesc
         */
        public String getBedDesc() {
            return this.bedDesc;
        }

        /**
         * @return bedNum
         */
        public Integer getBedNum() {
            return this.bedNum;
        }

        /**
         * @return bedSize
         */
        public String getBedSize() {
            return this.bedSize;
        }

        /**
         * @return bedType
         */
        public String getBedType() {
            return this.bedType;
        }

        public static final class Builder {
            private String bedDesc; 
            private Integer bedNum; 
            private String bedSize; 
            private String bedType; 

            /**
             * 床型描述
             */
            public Builder bedDesc(String bedDesc) {
                this.bedDesc = bedDesc;
                return this;
            }

            /**
             * 床型数量
             */
            public Builder bedNum(Integer bedNum) {
                this.bedNum = bedNum;
                return this;
            }

            /**
             * 床型尺寸说明
             */
            public Builder bedSize(String bedSize) {
                this.bedSize = bedSize;
                return this;
            }

            /**
             * 床型
             */
            public Builder bedType(String bedType) {
                this.bedType = bedType;
                return this;
            }

            public BedInfos build() {
                return new BedInfos(this);
            } 

        } 

    }
    public static class RoomInfos extends TeaModel {
        @NameInMap("bed_infos")
        private java.util.List < BedInfos> bedInfos;

        @NameInMap("extra_bed")
        private Integer extraBed;

        @NameInMap("extra_bed_desc")
        private String extraBedDesc;

        @NameInMap("floor")
        private String floor;

        @NameInMap("internet_way")
        private String internetWay;

        @NameInMap("max_occupancy")
        private Integer maxOccupancy;

        @NameInMap("room_facilities")
        private String roomFacilities;

        @NameInMap("room_facility_list")
        private java.util.List < String > roomFacilityList;

        @NameInMap("room_id")
        private String roomId;

        @NameInMap("room_image")
        private String roomImage;

        @NameInMap("room_images")
        private java.util.List < String > roomImages;

        @NameInMap("room_name")
        private String roomName;

        @NameInMap("room_type")
        private Integer roomType;

        @NameInMap("roomarea")
        private String roomarea;

        @NameInMap("rooms")
        private Integer rooms;

        @NameInMap("window")
        private String window;

        @NameInMap("window_bad")
        private String windowBad;

        @NameInMap("window_view")
        private String windowView;

        private RoomInfos(Builder builder) {
            this.bedInfos = builder.bedInfos;
            this.extraBed = builder.extraBed;
            this.extraBedDesc = builder.extraBedDesc;
            this.floor = builder.floor;
            this.internetWay = builder.internetWay;
            this.maxOccupancy = builder.maxOccupancy;
            this.roomFacilities = builder.roomFacilities;
            this.roomFacilityList = builder.roomFacilityList;
            this.roomId = builder.roomId;
            this.roomImage = builder.roomImage;
            this.roomImages = builder.roomImages;
            this.roomName = builder.roomName;
            this.roomType = builder.roomType;
            this.roomarea = builder.roomarea;
            this.rooms = builder.rooms;
            this.window = builder.window;
            this.windowBad = builder.windowBad;
            this.windowView = builder.windowView;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomInfos create() {
            return builder().build();
        }

        /**
         * @return bedInfos
         */
        public java.util.List < BedInfos> getBedInfos() {
            return this.bedInfos;
        }

        /**
         * @return extraBed
         */
        public Integer getExtraBed() {
            return this.extraBed;
        }

        /**
         * @return extraBedDesc
         */
        public String getExtraBedDesc() {
            return this.extraBedDesc;
        }

        /**
         * @return floor
         */
        public String getFloor() {
            return this.floor;
        }

        /**
         * @return internetWay
         */
        public String getInternetWay() {
            return this.internetWay;
        }

        /**
         * @return maxOccupancy
         */
        public Integer getMaxOccupancy() {
            return this.maxOccupancy;
        }

        /**
         * @return roomFacilities
         */
        public String getRoomFacilities() {
            return this.roomFacilities;
        }

        /**
         * @return roomFacilityList
         */
        public java.util.List < String > getRoomFacilityList() {
            return this.roomFacilityList;
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        /**
         * @return roomImage
         */
        public String getRoomImage() {
            return this.roomImage;
        }

        /**
         * @return roomImages
         */
        public java.util.List < String > getRoomImages() {
            return this.roomImages;
        }

        /**
         * @return roomName
         */
        public String getRoomName() {
            return this.roomName;
        }

        /**
         * @return roomType
         */
        public Integer getRoomType() {
            return this.roomType;
        }

        /**
         * @return roomarea
         */
        public String getRoomarea() {
            return this.roomarea;
        }

        /**
         * @return rooms
         */
        public Integer getRooms() {
            return this.rooms;
        }

        /**
         * @return window
         */
        public String getWindow() {
            return this.window;
        }

        /**
         * @return windowBad
         */
        public String getWindowBad() {
            return this.windowBad;
        }

        /**
         * @return windowView
         */
        public String getWindowView() {
            return this.windowView;
        }

        public static final class Builder {
            private java.util.List < BedInfos> bedInfos; 
            private Integer extraBed; 
            private String extraBedDesc; 
            private String floor; 
            private String internetWay; 
            private Integer maxOccupancy; 
            private String roomFacilities; 
            private java.util.List < String > roomFacilityList; 
            private String roomId; 
            private String roomImage; 
            private java.util.List < String > roomImages; 
            private String roomName; 
            private Integer roomType; 
            private String roomarea; 
            private Integer rooms; 
            private String window; 
            private String windowBad; 
            private String windowView; 

            /**
             * 该房型下的床型列表
             */
            public Builder bedInfos(java.util.List < BedInfos> bedInfos) {
                this.bedInfos = bedInfos;
                return this;
            }

            /**
             * 是否可以加床
             */
            public Builder extraBed(Integer extraBed) {
                this.extraBed = extraBed;
                return this;
            }

            /**
             * 加床说明
             */
            public Builder extraBedDesc(String extraBedDesc) {
                this.extraBedDesc = extraBedDesc;
                return this;
            }

            /**
             * 房间所在楼层，如"2"、"2-3"
             */
            public Builder floor(String floor) {
                this.floor = floor;
                return this;
            }

            /**
             * 宽带
             */
            public Builder internetWay(String internetWay) {
                this.internetWay = internetWay;
                return this;
            }

            /**
             * 房间最大容纳人数
             */
            public Builder maxOccupancy(Integer maxOccupancy) {
                this.maxOccupancy = maxOccupancy;
                return this;
            }

            /**
             * 房间设施
             */
            public Builder roomFacilities(String roomFacilities) {
                this.roomFacilities = roomFacilities;
                return this;
            }

            /**
             * 房间设施列表
             */
            public Builder roomFacilityList(java.util.List < String > roomFacilityList) {
                this.roomFacilityList = roomFacilityList;
                return this;
            }

            /**
             * 房型Id
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * 房型主图链接
             */
            public Builder roomImage(String roomImage) {
                this.roomImage = roomImage;
                return this;
            }

            /**
             * 房型图片链接列表
             */
            public Builder roomImages(java.util.List < String > roomImages) {
                this.roomImages = roomImages;
                return this;
            }

            /**
             * 房型名称
             */
            public Builder roomName(String roomName) {
                this.roomName = roomName;
                return this;
            }

            /**
             * 房型类型
             */
            public Builder roomType(Integer roomType) {
                this.roomType = roomType;
                return this;
            }

            /**
             * 面积
             */
            public Builder roomarea(String roomarea) {
                this.roomarea = roomarea;
                return this;
            }

            /**
             * 房间数
             */
            public Builder rooms(Integer rooms) {
                this.rooms = rooms;
                return this;
            }

            /**
             * 窗型
             */
            public Builder window(String window) {
                this.window = window;
                return this;
            }

            /**
             * 窗型缺陷
             */
            public Builder windowBad(String windowBad) {
                this.windowBad = windowBad;
                return this;
            }

            /**
             * 窗景描述
             */
            public Builder windowView(String windowView) {
                this.windowView = windowView;
                return this;
            }

            public RoomInfos build() {
                return new RoomInfos(this);
            } 

        } 

    }
    public static class HotelStaticInfos extends TeaModel {
        @NameInMap("block_room_type_information")
        private java.util.Map < String, String > blockRoomTypeInformation;

        @NameInMap("brand")
        private String brand;

        @NameInMap("brand_name")
        private String brandName;

        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("country")
        private String country;

        @NameInMap("country_code")
        private String countryCode;

        @NameInMap("description")
        private String description;

        @NameInMap("district")
        private String district;

        @NameInMap("district_name")
        private String districtName;

        @NameInMap("expand_info")
        private ExpandInfo expandInfo;

        @NameInMap("hotel_address")
        private String hotelAddress;

        @NameInMap("hotel_en_address")
        private String hotelEnAddress;

        @NameInMap("hotel_en_name")
        private String hotelEnName;

        @NameInMap("hotel_id")
        private String hotelId;

        @NameInMap("hotel_name")
        private String hotelName;

        @NameInMap("hotel_open_time")
        private String hotelOpenTime;

        @NameInMap("hotel_phones")
        private String hotelPhones;

        @NameInMap("hotel_policies")
        private String hotelPolicies;

        @NameInMap("hotelfax")
        private String hotelfax;

        @NameInMap("hotelpics")
        private String hotelpics;

        @NameInMap("imageinfos")
        private java.util.List < Imageinfos> imageinfos;

        @NameInMap("invoice_provider_method")
        private String invoiceProviderMethod;

        @NameInMap("invoice_types")
        private java.util.List < Integer > invoiceTypes;

        @NameInMap("location")
        private String location;

        @NameInMap("province")
        private String province;

        @NameInMap("province_name")
        private String provinceName;

        @NameInMap("rating_average")
        private String ratingAverage;

        @NameInMap("room_infos")
        private java.util.List < RoomInfos> roomInfos;

        @NameInMap("star")
        private String star;

        @NameInMap("star_rate")
        private String starRate;

        @NameInMap("status")
        private String status;

        @NameInMap("themes")
        private String themes;

        @NameInMap("visa_reminding")
        private Boolean visaReminding;

        private HotelStaticInfos(Builder builder) {
            this.blockRoomTypeInformation = builder.blockRoomTypeInformation;
            this.brand = builder.brand;
            this.brandName = builder.brandName;
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.country = builder.country;
            this.countryCode = builder.countryCode;
            this.description = builder.description;
            this.district = builder.district;
            this.districtName = builder.districtName;
            this.expandInfo = builder.expandInfo;
            this.hotelAddress = builder.hotelAddress;
            this.hotelEnAddress = builder.hotelEnAddress;
            this.hotelEnName = builder.hotelEnName;
            this.hotelId = builder.hotelId;
            this.hotelName = builder.hotelName;
            this.hotelOpenTime = builder.hotelOpenTime;
            this.hotelPhones = builder.hotelPhones;
            this.hotelPolicies = builder.hotelPolicies;
            this.hotelfax = builder.hotelfax;
            this.hotelpics = builder.hotelpics;
            this.imageinfos = builder.imageinfos;
            this.invoiceProviderMethod = builder.invoiceProviderMethod;
            this.invoiceTypes = builder.invoiceTypes;
            this.location = builder.location;
            this.province = builder.province;
            this.provinceName = builder.provinceName;
            this.ratingAverage = builder.ratingAverage;
            this.roomInfos = builder.roomInfos;
            this.star = builder.star;
            this.starRate = builder.starRate;
            this.status = builder.status;
            this.themes = builder.themes;
            this.visaReminding = builder.visaReminding;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelStaticInfos create() {
            return builder().build();
        }

        /**
         * @return blockRoomTypeInformation
         */
        public java.util.Map < String, String > getBlockRoomTypeInformation() {
            return this.blockRoomTypeInformation;
        }

        /**
         * @return brand
         */
        public String getBrand() {
            return this.brand;
        }

        /**
         * @return brandName
         */
        public String getBrandName() {
            return this.brandName;
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
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return district
         */
        public String getDistrict() {
            return this.district;
        }

        /**
         * @return districtName
         */
        public String getDistrictName() {
            return this.districtName;
        }

        /**
         * @return expandInfo
         */
        public ExpandInfo getExpandInfo() {
            return this.expandInfo;
        }

        /**
         * @return hotelAddress
         */
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        /**
         * @return hotelEnAddress
         */
        public String getHotelEnAddress() {
            return this.hotelEnAddress;
        }

        /**
         * @return hotelEnName
         */
        public String getHotelEnName() {
            return this.hotelEnName;
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
         * @return hotelOpenTime
         */
        public String getHotelOpenTime() {
            return this.hotelOpenTime;
        }

        /**
         * @return hotelPhones
         */
        public String getHotelPhones() {
            return this.hotelPhones;
        }

        /**
         * @return hotelPolicies
         */
        public String getHotelPolicies() {
            return this.hotelPolicies;
        }

        /**
         * @return hotelfax
         */
        public String getHotelfax() {
            return this.hotelfax;
        }

        /**
         * @return hotelpics
         */
        public String getHotelpics() {
            return this.hotelpics;
        }

        /**
         * @return imageinfos
         */
        public java.util.List < Imageinfos> getImageinfos() {
            return this.imageinfos;
        }

        /**
         * @return invoiceProviderMethod
         */
        public String getInvoiceProviderMethod() {
            return this.invoiceProviderMethod;
        }

        /**
         * @return invoiceTypes
         */
        public java.util.List < Integer > getInvoiceTypes() {
            return this.invoiceTypes;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return provinceName
         */
        public String getProvinceName() {
            return this.provinceName;
        }

        /**
         * @return ratingAverage
         */
        public String getRatingAverage() {
            return this.ratingAverage;
        }

        /**
         * @return roomInfos
         */
        public java.util.List < RoomInfos> getRoomInfos() {
            return this.roomInfos;
        }

        /**
         * @return star
         */
        public String getStar() {
            return this.star;
        }

        /**
         * @return starRate
         */
        public String getStarRate() {
            return this.starRate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return themes
         */
        public String getThemes() {
            return this.themes;
        }

        /**
         * @return visaReminding
         */
        public Boolean getVisaReminding() {
            return this.visaReminding;
        }

        public static final class Builder {
            private java.util.Map < String, String > blockRoomTypeInformation; 
            private String brand; 
            private String brandName; 
            private String cityCode; 
            private String cityName; 
            private String country; 
            private String countryCode; 
            private String description; 
            private String district; 
            private String districtName; 
            private ExpandInfo expandInfo; 
            private String hotelAddress; 
            private String hotelEnAddress; 
            private String hotelEnName; 
            private String hotelId; 
            private String hotelName; 
            private String hotelOpenTime; 
            private String hotelPhones; 
            private String hotelPolicies; 
            private String hotelfax; 
            private String hotelpics; 
            private java.util.List < Imageinfos> imageinfos; 
            private String invoiceProviderMethod; 
            private java.util.List < Integer > invoiceTypes; 
            private String location; 
            private String province; 
            private String provinceName; 
            private String ratingAverage; 
            private java.util.List < RoomInfos> roomInfos; 
            private String star; 
            private String starRate; 
            private String status; 
            private String themes; 
            private Boolean visaReminding; 

            /**
             * 屏蔽房型的信息
             */
            public Builder blockRoomTypeInformation(java.util.Map < String, String > blockRoomTypeInformation) {
                this.blockRoomTypeInformation = blockRoomTypeInformation;
                return this;
            }

            /**
             * 品牌编码
             */
            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            /**
             * 品牌名称
             */
            public Builder brandName(String brandName) {
                this.brandName = brandName;
                return this;
            }

            /**
             * 城市编码
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * 城市名称
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * 所属国家名称
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * 所属国家Code
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * 酒店描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 行政区编码
             */
            public Builder district(String district) {
                this.district = district;
                return this;
            }

            /**
             * 行政区名称
             */
            public Builder districtName(String districtName) {
                this.districtName = districtName;
                return this;
            }

            /**
             * 酒店扩展信息
             */
            public Builder expandInfo(ExpandInfo expandInfo) {
                this.expandInfo = expandInfo;
                return this;
            }

            /**
             * 酒店地址
             */
            public Builder hotelAddress(String hotelAddress) {
                this.hotelAddress = hotelAddress;
                return this;
            }

            /**
             * 酒店英文地址
             */
            public Builder hotelEnAddress(String hotelEnAddress) {
                this.hotelEnAddress = hotelEnAddress;
                return this;
            }

            /**
             * 酒店英文名
             */
            public Builder hotelEnName(String hotelEnName) {
                this.hotelEnName = hotelEnName;
                return this;
            }

            /**
             * 酒店id
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * 酒店名称
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * 酒店开业时间
             */
            public Builder hotelOpenTime(String hotelOpenTime) {
                this.hotelOpenTime = hotelOpenTime;
                return this;
            }

            /**
             * 酒店电话如有多个使用英文逗号,拼接
             */
            public Builder hotelPhones(String hotelPhones) {
                this.hotelPhones = hotelPhones;
                return this;
            }

            /**
             * 酒店入住政策(针对国际酒店，儿童及加床信息)
             */
            public Builder hotelPolicies(String hotelPolicies) {
                this.hotelPolicies = hotelPolicies;
                return this;
            }

            /**
             * 酒店传真如有多个使用英文逗号,拼接
             */
            public Builder hotelfax(String hotelfax) {
                this.hotelfax = hotelfax;
                return this;
            }

            /**
             * 逗号分隔多张图片
             */
            public Builder hotelpics(String hotelpics) {
                this.hotelpics = hotelpics;
                return this;
            }

            /**
             * 图片列表
             */
            public Builder imageinfos(java.util.List < Imageinfos> imageinfos) {
                this.imageinfos = imageinfos;
                return this;
            }

            /**
             * 发票提供方式
             */
            public Builder invoiceProviderMethod(String invoiceProviderMethod) {
                this.invoiceProviderMethod = invoiceProviderMethod;
                return this;
            }

            /**
             * 发票类型
             */
            public Builder invoiceTypes(java.util.List < Integer > invoiceTypes) {
                this.invoiceTypes = invoiceTypes;
                return this;
            }

            /**
             * 酒店地址的经纬度(高德)
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * 所属省份code
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * 所属省份名称
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            /**
             * 酒店评分
             */
            public Builder ratingAverage(String ratingAverage) {
                this.ratingAverage = ratingAverage;
                return this;
            }

            /**
             * 房型列表
             */
            public Builder roomInfos(java.util.List < RoomInfos> roomInfos) {
                this.roomInfos = roomInfos;
                return this;
            }

            /**
             * 酒店档次(档次不是星级)
             */
            public Builder star(String star) {
                this.star = star;
                return this;
            }

            /**
             * 旅游局评定星级
             */
            public Builder starRate(String starRate) {
                this.starRate = starRate;
                return this;
            }

            /**
             * 状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 酒店主题
             */
            public Builder themes(String themes) {
                this.themes = themes;
                return this;
            }

            /**
             * 国家维度的签证提示
             */
            public Builder visaReminding(Boolean visaReminding) {
                this.visaReminding = visaReminding;
                return this;
            }

            public HotelStaticInfos build() {
                return new HotelStaticInfos(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("hotel_static_infos")
        private java.util.List < HotelStaticInfos> hotelStaticInfos;

        private Module(Builder builder) {
            this.hotelStaticInfos = builder.hotelStaticInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return hotelStaticInfos
         */
        public java.util.List < HotelStaticInfos> getHotelStaticInfos() {
            return this.hotelStaticInfos;
        }

        public static final class Builder {
            private java.util.List < HotelStaticInfos> hotelStaticInfos; 

            /**
             * hotel_static_infos.
             */
            public Builder hotelStaticInfos(java.util.List < HotelStaticInfos> hotelStaticInfos) {
                this.hotelStaticInfos = hotelStaticInfos;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
