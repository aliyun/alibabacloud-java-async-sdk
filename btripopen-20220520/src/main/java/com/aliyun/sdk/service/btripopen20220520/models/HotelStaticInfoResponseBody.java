// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HotelStaticInfoResponseBody} extends {@link TeaModel}
 *
 * <p>HotelStaticInfoResponseBody</p>
 */
public class HotelStaticInfoResponseBody extends TeaModel {
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
         * <p>module</p>
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

    /**
     * 
     * {@link HotelStaticInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelStaticInfoResponseBody</p>
     */
    public static class ExpandInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("check_in")
        private String checkIn;

        @com.aliyun.core.annotation.NameInMap("check_out")
        private String checkOut;

        @com.aliyun.core.annotation.NameInMap("decorate_time")
        private String decorateTime;

        @com.aliyun.core.annotation.NameInMap("floors")
        private String floors;

        @com.aliyun.core.annotation.NameInMap("hotel_facilities")
        private java.util.List < String > hotelFacilities;

        @com.aliyun.core.annotation.NameInMap("hotel_type")
        private Integer hotelType;

        @com.aliyun.core.annotation.NameInMap("opening_time")
        private String openingTime;

        @com.aliyun.core.annotation.NameInMap("room_facilities")
        private java.util.List < String > roomFacilities;

        @com.aliyun.core.annotation.NameInMap("rooms")
        private Integer rooms;

        @com.aliyun.core.annotation.NameInMap("service")
        private java.util.List < String > service;

        @com.aliyun.core.annotation.NameInMap("theme_tag")
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
             * decorate_time.
             */
            public Builder decorateTime(String decorateTime) {
                this.decorateTime = decorateTime;
                return this;
            }

            /**
             * floors.
             */
            public Builder floors(String floors) {
                this.floors = floors;
                return this;
            }

            /**
             * hotel_facilities.
             */
            public Builder hotelFacilities(java.util.List < String > hotelFacilities) {
                this.hotelFacilities = hotelFacilities;
                return this;
            }

            /**
             * hotel_type.
             */
            public Builder hotelType(Integer hotelType) {
                this.hotelType = hotelType;
                return this;
            }

            /**
             * opening_time.
             */
            public Builder openingTime(String openingTime) {
                this.openingTime = openingTime;
                return this;
            }

            /**
             * room_facilities.
             */
            public Builder roomFacilities(java.util.List < String > roomFacilities) {
                this.roomFacilities = roomFacilities;
                return this;
            }

            /**
             * rooms.
             */
            public Builder rooms(Integer rooms) {
                this.rooms = rooms;
                return this;
            }

            /**
             * service.
             */
            public Builder service(java.util.List < String > service) {
                this.service = service;
                return this;
            }

            /**
             * theme_tag.
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
    /**
     * 
     * {@link HotelStaticInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelStaticInfoResponseBody</p>
     */
    public static class Imageinfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("tag")
        private Integer tag;

        @com.aliyun.core.annotation.NameInMap("url")
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
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * tag.
             */
            public Builder tag(Integer tag) {
                this.tag = tag;
                return this;
            }

            /**
             * url.
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
    /**
     * 
     * {@link HotelStaticInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelStaticInfoResponseBody</p>
     */
    public static class BedInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bed_desc")
        private String bedDesc;

        @com.aliyun.core.annotation.NameInMap("bed_num")
        private Integer bedNum;

        @com.aliyun.core.annotation.NameInMap("bed_size")
        private String bedSize;

        @com.aliyun.core.annotation.NameInMap("bed_type")
        private String bedType;

        @com.aliyun.core.annotation.NameInMap("length")
        private String length;

        @com.aliyun.core.annotation.NameInMap("width")
        private String width;

        private BedInfos(Builder builder) {
            this.bedDesc = builder.bedDesc;
            this.bedNum = builder.bedNum;
            this.bedSize = builder.bedSize;
            this.bedType = builder.bedType;
            this.length = builder.length;
            this.width = builder.width;
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

        /**
         * @return length
         */
        public String getLength() {
            return this.length;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bedDesc; 
            private Integer bedNum; 
            private String bedSize; 
            private String bedType; 
            private String length; 
            private String width; 

            /**
             * bed_desc.
             */
            public Builder bedDesc(String bedDesc) {
                this.bedDesc = bedDesc;
                return this;
            }

            /**
             * bed_num.
             */
            public Builder bedNum(Integer bedNum) {
                this.bedNum = bedNum;
                return this;
            }

            /**
             * bed_size.
             */
            public Builder bedSize(String bedSize) {
                this.bedSize = bedSize;
                return this;
            }

            /**
             * bed_type.
             */
            public Builder bedType(String bedType) {
                this.bedType = bedType;
                return this;
            }

            /**
             * length.
             */
            public Builder length(String length) {
                this.length = length;
                return this;
            }

            /**
             * width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public BedInfos build() {
                return new BedInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelStaticInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelStaticInfoResponseBody</p>
     */
    public static class BedInfoGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bed_Infos")
        private java.util.List < BedInfos> bedInfos;

        private BedInfoGroupList(Builder builder) {
            this.bedInfos = builder.bedInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BedInfoGroupList create() {
            return builder().build();
        }

        /**
         * @return bedInfos
         */
        public java.util.List < BedInfos> getBedInfos() {
            return this.bedInfos;
        }

        public static final class Builder {
            private java.util.List < BedInfos> bedInfos; 

            /**
             * bed_Infos.
             */
            public Builder bedInfos(java.util.List < BedInfos> bedInfos) {
                this.bedInfos = bedInfos;
                return this;
            }

            public BedInfoGroupList build() {
                return new BedInfoGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelStaticInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelStaticInfoResponseBody</p>
     */
    public static class RoomInfosBedInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bed_desc")
        private String bedDesc;

        @com.aliyun.core.annotation.NameInMap("bed_num")
        private Integer bedNum;

        @com.aliyun.core.annotation.NameInMap("bed_size")
        private String bedSize;

        @com.aliyun.core.annotation.NameInMap("bed_type")
        private String bedType;

        @com.aliyun.core.annotation.NameInMap("length")
        private String length;

        @com.aliyun.core.annotation.NameInMap("width")
        private String width;

        private RoomInfosBedInfos(Builder builder) {
            this.bedDesc = builder.bedDesc;
            this.bedNum = builder.bedNum;
            this.bedSize = builder.bedSize;
            this.bedType = builder.bedType;
            this.length = builder.length;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomInfosBedInfos create() {
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

        /**
         * @return length
         */
        public String getLength() {
            return this.length;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bedDesc; 
            private Integer bedNum; 
            private String bedSize; 
            private String bedType; 
            private String length; 
            private String width; 

            /**
             * bed_desc.
             */
            public Builder bedDesc(String bedDesc) {
                this.bedDesc = bedDesc;
                return this;
            }

            /**
             * bed_num.
             */
            public Builder bedNum(Integer bedNum) {
                this.bedNum = bedNum;
                return this;
            }

            /**
             * bed_size.
             */
            public Builder bedSize(String bedSize) {
                this.bedSize = bedSize;
                return this;
            }

            /**
             * bed_type.
             */
            public Builder bedType(String bedType) {
                this.bedType = bedType;
                return this;
            }

            /**
             * length.
             */
            public Builder length(String length) {
                this.length = length;
                return this;
            }

            /**
             * width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public RoomInfosBedInfos build() {
                return new RoomInfosBedInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelStaticInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelStaticInfoResponseBody</p>
     */
    public static class RoomInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bed_info_group_list")
        private java.util.List < BedInfoGroupList> bedInfoGroupList;

        @com.aliyun.core.annotation.NameInMap("bed_infos")
        private java.util.List < RoomInfosBedInfos> bedInfos;

        @com.aliyun.core.annotation.NameInMap("extra_bed")
        private Integer extraBed;

        @com.aliyun.core.annotation.NameInMap("extra_bed_desc")
        private String extraBedDesc;

        @com.aliyun.core.annotation.NameInMap("floor")
        private String floor;

        @com.aliyun.core.annotation.NameInMap("internet_way")
        private String internetWay;

        @com.aliyun.core.annotation.NameInMap("max_occupancy")
        private Integer maxOccupancy;

        @com.aliyun.core.annotation.NameInMap("room_facilities")
        private String roomFacilities;

        @com.aliyun.core.annotation.NameInMap("room_facility_list")
        private java.util.List < String > roomFacilityList;

        @com.aliyun.core.annotation.NameInMap("room_id")
        private String roomId;

        @com.aliyun.core.annotation.NameInMap("room_image")
        private String roomImage;

        @com.aliyun.core.annotation.NameInMap("room_images")
        private java.util.List < String > roomImages;

        @com.aliyun.core.annotation.NameInMap("room_name")
        private String roomName;

        @com.aliyun.core.annotation.NameInMap("room_type")
        private Integer roomType;

        @com.aliyun.core.annotation.NameInMap("roomarea")
        private String roomarea;

        @com.aliyun.core.annotation.NameInMap("rooms")
        private Integer rooms;

        @com.aliyun.core.annotation.NameInMap("window")
        private String window;

        @com.aliyun.core.annotation.NameInMap("window_bad")
        private String windowBad;

        @com.aliyun.core.annotation.NameInMap("window_view")
        private String windowView;

        private RoomInfos(Builder builder) {
            this.bedInfoGroupList = builder.bedInfoGroupList;
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
         * @return bedInfoGroupList
         */
        public java.util.List < BedInfoGroupList> getBedInfoGroupList() {
            return this.bedInfoGroupList;
        }

        /**
         * @return bedInfos
         */
        public java.util.List < RoomInfosBedInfos> getBedInfos() {
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
            private java.util.List < BedInfoGroupList> bedInfoGroupList; 
            private java.util.List < RoomInfosBedInfos> bedInfos; 
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
             * bed_info_group_list.
             */
            public Builder bedInfoGroupList(java.util.List < BedInfoGroupList> bedInfoGroupList) {
                this.bedInfoGroupList = bedInfoGroupList;
                return this;
            }

            /**
             * bed_infos.
             */
            public Builder bedInfos(java.util.List < RoomInfosBedInfos> bedInfos) {
                this.bedInfos = bedInfos;
                return this;
            }

            /**
             * extra_bed.
             */
            public Builder extraBed(Integer extraBed) {
                this.extraBed = extraBed;
                return this;
            }

            /**
             * extra_bed_desc.
             */
            public Builder extraBedDesc(String extraBedDesc) {
                this.extraBedDesc = extraBedDesc;
                return this;
            }

            /**
             * floor.
             */
            public Builder floor(String floor) {
                this.floor = floor;
                return this;
            }

            /**
             * internet_way.
             */
            public Builder internetWay(String internetWay) {
                this.internetWay = internetWay;
                return this;
            }

            /**
             * max_occupancy.
             */
            public Builder maxOccupancy(Integer maxOccupancy) {
                this.maxOccupancy = maxOccupancy;
                return this;
            }

            /**
             * room_facilities.
             */
            public Builder roomFacilities(String roomFacilities) {
                this.roomFacilities = roomFacilities;
                return this;
            }

            /**
             * room_facility_list.
             */
            public Builder roomFacilityList(java.util.List < String > roomFacilityList) {
                this.roomFacilityList = roomFacilityList;
                return this;
            }

            /**
             * room_id.
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * room_image.
             */
            public Builder roomImage(String roomImage) {
                this.roomImage = roomImage;
                return this;
            }

            /**
             * room_images.
             */
            public Builder roomImages(java.util.List < String > roomImages) {
                this.roomImages = roomImages;
                return this;
            }

            /**
             * room_name.
             */
            public Builder roomName(String roomName) {
                this.roomName = roomName;
                return this;
            }

            /**
             * room_type.
             */
            public Builder roomType(Integer roomType) {
                this.roomType = roomType;
                return this;
            }

            /**
             * roomarea.
             */
            public Builder roomarea(String roomarea) {
                this.roomarea = roomarea;
                return this;
            }

            /**
             * rooms.
             */
            public Builder rooms(Integer rooms) {
                this.rooms = rooms;
                return this;
            }

            /**
             * window.
             */
            public Builder window(String window) {
                this.window = window;
                return this;
            }

            /**
             * window_bad.
             */
            public Builder windowBad(String windowBad) {
                this.windowBad = windowBad;
                return this;
            }

            /**
             * window_view.
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
    /**
     * 
     * {@link HotelStaticInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelStaticInfoResponseBody</p>
     */
    public static class HotelStaticInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("block_room_type_information")
        private java.util.Map < String, String > blockRoomTypeInformation;

        @com.aliyun.core.annotation.NameInMap("brand")
        private String brand;

        @com.aliyun.core.annotation.NameInMap("brand_name")
        private String brandName;

        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("country_code")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("district")
        private String district;

        @com.aliyun.core.annotation.NameInMap("district_name")
        private String districtName;

        @com.aliyun.core.annotation.NameInMap("expand_info")
        private ExpandInfo expandInfo;

        @com.aliyun.core.annotation.NameInMap("hotel_address")
        private String hotelAddress;

        @com.aliyun.core.annotation.NameInMap("hotel_en_address")
        private String hotelEnAddress;

        @com.aliyun.core.annotation.NameInMap("hotel_en_name")
        private String hotelEnName;

        @com.aliyun.core.annotation.NameInMap("hotel_id")
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("hotel_name")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("hotel_open_time")
        private String hotelOpenTime;

        @com.aliyun.core.annotation.NameInMap("hotel_phones")
        private String hotelPhones;

        @com.aliyun.core.annotation.NameInMap("hotel_policies")
        private String hotelPolicies;

        @com.aliyun.core.annotation.NameInMap("hotelfax")
        private String hotelfax;

        @com.aliyun.core.annotation.NameInMap("hotelpics")
        private String hotelpics;

        @com.aliyun.core.annotation.NameInMap("imageinfos")
        private java.util.List < Imageinfos> imageinfos;

        @com.aliyun.core.annotation.NameInMap("invoice_provider_method")
        private String invoiceProviderMethod;

        @com.aliyun.core.annotation.NameInMap("invoice_types")
        private java.util.List < Integer > invoiceTypes;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("province_name")
        private String provinceName;

        @com.aliyun.core.annotation.NameInMap("rating_average")
        private String ratingAverage;

        @com.aliyun.core.annotation.NameInMap("room_infos")
        private java.util.List < RoomInfos> roomInfos;

        @com.aliyun.core.annotation.NameInMap("star")
        private String star;

        @com.aliyun.core.annotation.NameInMap("star_rate")
        private String starRate;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("themes")
        private String themes;

        @com.aliyun.core.annotation.NameInMap("visa_reminding")
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
             * block_room_type_information.
             */
            public Builder blockRoomTypeInformation(java.util.Map < String, String > blockRoomTypeInformation) {
                this.blockRoomTypeInformation = blockRoomTypeInformation;
                return this;
            }

            /**
             * brand.
             */
            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            /**
             * brand_name.
             */
            public Builder brandName(String brandName) {
                this.brandName = brandName;
                return this;
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
             * country.
             */
            public Builder country(String country) {
                this.country = country;
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
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * district.
             */
            public Builder district(String district) {
                this.district = district;
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
             * expand_info.
             */
            public Builder expandInfo(ExpandInfo expandInfo) {
                this.expandInfo = expandInfo;
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
             * hotel_en_address.
             */
            public Builder hotelEnAddress(String hotelEnAddress) {
                this.hotelEnAddress = hotelEnAddress;
                return this;
            }

            /**
             * hotel_en_name.
             */
            public Builder hotelEnName(String hotelEnName) {
                this.hotelEnName = hotelEnName;
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
             * hotel_open_time.
             */
            public Builder hotelOpenTime(String hotelOpenTime) {
                this.hotelOpenTime = hotelOpenTime;
                return this;
            }

            /**
             * hotel_phones.
             */
            public Builder hotelPhones(String hotelPhones) {
                this.hotelPhones = hotelPhones;
                return this;
            }

            /**
             * hotel_policies.
             */
            public Builder hotelPolicies(String hotelPolicies) {
                this.hotelPolicies = hotelPolicies;
                return this;
            }

            /**
             * hotelfax.
             */
            public Builder hotelfax(String hotelfax) {
                this.hotelfax = hotelfax;
                return this;
            }

            /**
             * hotelpics.
             */
            public Builder hotelpics(String hotelpics) {
                this.hotelpics = hotelpics;
                return this;
            }

            /**
             * imageinfos.
             */
            public Builder imageinfos(java.util.List < Imageinfos> imageinfos) {
                this.imageinfos = imageinfos;
                return this;
            }

            /**
             * invoice_provider_method.
             */
            public Builder invoiceProviderMethod(String invoiceProviderMethod) {
                this.invoiceProviderMethod = invoiceProviderMethod;
                return this;
            }

            /**
             * invoice_types.
             */
            public Builder invoiceTypes(java.util.List < Integer > invoiceTypes) {
                this.invoiceTypes = invoiceTypes;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * province_name.
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            /**
             * rating_average.
             */
            public Builder ratingAverage(String ratingAverage) {
                this.ratingAverage = ratingAverage;
                return this;
            }

            /**
             * room_infos.
             */
            public Builder roomInfos(java.util.List < RoomInfos> roomInfos) {
                this.roomInfos = roomInfos;
                return this;
            }

            /**
             * star.
             */
            public Builder star(String star) {
                this.star = star;
                return this;
            }

            /**
             * star_rate.
             */
            public Builder starRate(String starRate) {
                this.starRate = starRate;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * themes.
             */
            public Builder themes(String themes) {
                this.themes = themes;
                return this;
            }

            /**
             * visa_reminding.
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
    /**
     * 
     * {@link HotelStaticInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelStaticInfoResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hotel_static_infos")
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
