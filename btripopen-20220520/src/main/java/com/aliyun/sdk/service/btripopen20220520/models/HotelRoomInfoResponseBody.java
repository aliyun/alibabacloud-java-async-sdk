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
 * {@link HotelRoomInfoResponseBody} extends {@link TeaModel}
 *
 * <p>HotelRoomInfoResponseBody</p>
 */
public class HotelRoomInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List<Module> module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private HotelRoomInfoResponseBody(Builder builder) {
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

    public static HotelRoomInfoResponseBody create() {
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
    public java.util.List<Module> getModule() {
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
        private java.util.List<Module> module; 
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
        public Builder module(java.util.List<Module> module) {
            this.module = module;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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

        public HotelRoomInfoResponseBody build() {
            return new HotelRoomInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotelRoomInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelRoomInfoResponseBody</p>
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
     * {@link HotelRoomInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelRoomInfoResponseBody</p>
     */
    public static class BedInfoGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bed_infos")
        private java.util.List<BedInfos> bedInfos;

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
        public java.util.List<BedInfos> getBedInfos() {
            return this.bedInfos;
        }

        public static final class Builder {
            private java.util.List<BedInfos> bedInfos; 

            /**
             * bed_infos.
             */
            public Builder bedInfos(java.util.List<BedInfos> bedInfos) {
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
     * {@link HotelRoomInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelRoomInfoResponseBody</p>
     */
    public static class ModuleBedInfos extends TeaModel {
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

        private ModuleBedInfos(Builder builder) {
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

        public static ModuleBedInfos create() {
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

            public ModuleBedInfos build() {
                return new ModuleBedInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelRoomInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelRoomInfoResponseBody</p>
     */
    public static class RoomImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bed_infos2")
        private String bedInfos2;

        @com.aliyun.core.annotation.NameInMap("tag")
        private Integer tag;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private RoomImages(Builder builder) {
            this.bedInfos2 = builder.bedInfos2;
            this.tag = builder.tag;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomImages create() {
            return builder().build();
        }

        /**
         * @return bedInfos2
         */
        public String getBedInfos2() {
            return this.bedInfos2;
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
            private String bedInfos2; 
            private Integer tag; 
            private String url; 

            /**
             * bed_infos2.
             */
            public Builder bedInfos2(String bedInfos2) {
                this.bedInfos2 = bedInfos2;
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

            public RoomImages build() {
                return new RoomImages(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelRoomInfoResponseBody} extends {@link TeaModel}
     *
     * <p>HotelRoomInfoResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bed_info_group_list")
        private java.util.List<BedInfoGroupList> bedInfoGroupList;

        @com.aliyun.core.annotation.NameInMap("bed_infos")
        private java.util.List<ModuleBedInfos> bedInfos;

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

        @com.aliyun.core.annotation.NameInMap("room_desc")
        private String roomDesc;

        @com.aliyun.core.annotation.NameInMap("room_facilities")
        private String roomFacilities;

        @com.aliyun.core.annotation.NameInMap("room_facility_list")
        private java.util.List<String> roomFacilityList;

        @com.aliyun.core.annotation.NameInMap("room_id")
        private String roomId;

        @com.aliyun.core.annotation.NameInMap("room_image")
        private String roomImage;

        @com.aliyun.core.annotation.NameInMap("room_images")
        private java.util.List<RoomImages> roomImages;

        @com.aliyun.core.annotation.NameInMap("room_name")
        private String roomName;

        @com.aliyun.core.annotation.NameInMap("room_type")
        private Integer roomType;

        @com.aliyun.core.annotation.NameInMap("roomarea")
        private String roomarea;

        @com.aliyun.core.annotation.NameInMap("rooms")
        private Integer rooms;

        @com.aliyun.core.annotation.NameInMap("smoke")
        private String smoke;

        @com.aliyun.core.annotation.NameInMap("window")
        private String window;

        @com.aliyun.core.annotation.NameInMap("window_bad")
        private String windowBad;

        @com.aliyun.core.annotation.NameInMap("window_view")
        private String windowView;

        private Module(Builder builder) {
            this.bedInfoGroupList = builder.bedInfoGroupList;
            this.bedInfos = builder.bedInfos;
            this.extraBed = builder.extraBed;
            this.extraBedDesc = builder.extraBedDesc;
            this.floor = builder.floor;
            this.internetWay = builder.internetWay;
            this.maxOccupancy = builder.maxOccupancy;
            this.roomDesc = builder.roomDesc;
            this.roomFacilities = builder.roomFacilities;
            this.roomFacilityList = builder.roomFacilityList;
            this.roomId = builder.roomId;
            this.roomImage = builder.roomImage;
            this.roomImages = builder.roomImages;
            this.roomName = builder.roomName;
            this.roomType = builder.roomType;
            this.roomarea = builder.roomarea;
            this.rooms = builder.rooms;
            this.smoke = builder.smoke;
            this.window = builder.window;
            this.windowBad = builder.windowBad;
            this.windowView = builder.windowView;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return bedInfoGroupList
         */
        public java.util.List<BedInfoGroupList> getBedInfoGroupList() {
            return this.bedInfoGroupList;
        }

        /**
         * @return bedInfos
         */
        public java.util.List<ModuleBedInfos> getBedInfos() {
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
         * @return roomDesc
         */
        public String getRoomDesc() {
            return this.roomDesc;
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
        public java.util.List<String> getRoomFacilityList() {
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
        public java.util.List<RoomImages> getRoomImages() {
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
         * @return smoke
         */
        public String getSmoke() {
            return this.smoke;
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
            private java.util.List<BedInfoGroupList> bedInfoGroupList; 
            private java.util.List<ModuleBedInfos> bedInfos; 
            private Integer extraBed; 
            private String extraBedDesc; 
            private String floor; 
            private String internetWay; 
            private Integer maxOccupancy; 
            private String roomDesc; 
            private String roomFacilities; 
            private java.util.List<String> roomFacilityList; 
            private String roomId; 
            private String roomImage; 
            private java.util.List<RoomImages> roomImages; 
            private String roomName; 
            private Integer roomType; 
            private String roomarea; 
            private Integer rooms; 
            private String smoke; 
            private String window; 
            private String windowBad; 
            private String windowView; 

            /**
             * bed_info_group_list.
             */
            public Builder bedInfoGroupList(java.util.List<BedInfoGroupList> bedInfoGroupList) {
                this.bedInfoGroupList = bedInfoGroupList;
                return this;
            }

            /**
             * bed_infos.
             */
            public Builder bedInfos(java.util.List<ModuleBedInfos> bedInfos) {
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
             * room_desc.
             */
            public Builder roomDesc(String roomDesc) {
                this.roomDesc = roomDesc;
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
            public Builder roomFacilityList(java.util.List<String> roomFacilityList) {
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
            public Builder roomImages(java.util.List<RoomImages> roomImages) {
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
             * smoke.
             */
            public Builder smoke(String smoke) {
                this.smoke = smoke;
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

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
