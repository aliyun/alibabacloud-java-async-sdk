// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link GlobalHotelBatchGetHotelDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GlobalHotelBatchGetHotelDetailResponseBody</p>
 */
public class GlobalHotelBatchGetHotelDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private GlobalHotelBatchGetHotelDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalHotelBatchGetHotelDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 
        private String tracerId; 

        private Builder() {
        } 

        private Builder(GlobalHotelBatchGetHotelDetailResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tracerId = model.tracerId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>traceId</p>
         */
        public Builder tracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }

        public GlobalHotelBatchGetHotelDetailResponseBody build() {
            return new GlobalHotelBatchGetHotelDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GlobalHotelBatchGetHotelDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelBatchGetHotelDetailResponseBody</p>
     */
    public static class Facilities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Facilities(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Facilities create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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

        public static final class Builder {
            private String description; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Facilities model) {
                this.description = model.description;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Facilities build() {
                return new Facilities(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelBatchGetHotelDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelBatchGetHotelDetailResponseBody</p>
     */
    public static class Pictures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FirstCategoryCode")
        private String firstCategoryCode;

        @com.aliyun.core.annotation.NameInMap("FirstCategoryName")
        private String firstCategoryName;

        @com.aliyun.core.annotation.NameInMap("IsHeadPic")
        private Boolean isHeadPic;

        @com.aliyun.core.annotation.NameInMap("PictureId")
        private String pictureId;

        @com.aliyun.core.annotation.NameInMap("SecondCategoryCode")
        private String secondCategoryCode;

        @com.aliyun.core.annotation.NameInMap("SecondCategoryName")
        private String secondCategoryName;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Pictures(Builder builder) {
            this.description = builder.description;
            this.firstCategoryCode = builder.firstCategoryCode;
            this.firstCategoryName = builder.firstCategoryName;
            this.isHeadPic = builder.isHeadPic;
            this.pictureId = builder.pictureId;
            this.secondCategoryCode = builder.secondCategoryCode;
            this.secondCategoryName = builder.secondCategoryName;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pictures create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return firstCategoryCode
         */
        public String getFirstCategoryCode() {
            return this.firstCategoryCode;
        }

        /**
         * @return firstCategoryName
         */
        public String getFirstCategoryName() {
            return this.firstCategoryName;
        }

        /**
         * @return isHeadPic
         */
        public Boolean getIsHeadPic() {
            return this.isHeadPic;
        }

        /**
         * @return pictureId
         */
        public String getPictureId() {
            return this.pictureId;
        }

        /**
         * @return secondCategoryCode
         */
        public String getSecondCategoryCode() {
            return this.secondCategoryCode;
        }

        /**
         * @return secondCategoryName
         */
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String description; 
            private String firstCategoryCode; 
            private String firstCategoryName; 
            private Boolean isHeadPic; 
            private String pictureId; 
            private String secondCategoryCode; 
            private String secondCategoryName; 
            private String url; 

            private Builder() {
            } 

            private Builder(Pictures model) {
                this.description = model.description;
                this.firstCategoryCode = model.firstCategoryCode;
                this.firstCategoryName = model.firstCategoryName;
                this.isHeadPic = model.isHeadPic;
                this.pictureId = model.pictureId;
                this.secondCategoryCode = model.secondCategoryCode;
                this.secondCategoryName = model.secondCategoryName;
                this.url = model.url;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FirstCategoryCode.
             */
            public Builder firstCategoryCode(String firstCategoryCode) {
                this.firstCategoryCode = firstCategoryCode;
                return this;
            }

            /**
             * FirstCategoryName.
             */
            public Builder firstCategoryName(String firstCategoryName) {
                this.firstCategoryName = firstCategoryName;
                return this;
            }

            /**
             * IsHeadPic.
             */
            public Builder isHeadPic(Boolean isHeadPic) {
                this.isHeadPic = isHeadPic;
                return this;
            }

            /**
             * PictureId.
             */
            public Builder pictureId(String pictureId) {
                this.pictureId = pictureId;
                return this;
            }

            /**
             * SecondCategoryCode.
             */
            public Builder secondCategoryCode(String secondCategoryCode) {
                this.secondCategoryCode = secondCategoryCode;
                return this;
            }

            /**
             * SecondCategoryName.
             */
            public Builder secondCategoryName(String secondCategoryName) {
                this.secondCategoryName = secondCategoryName;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Pictures build() {
                return new Pictures(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelBatchGetHotelDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelBatchGetHotelDetailResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<?> children;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("ItemTypeId")
        private String itemTypeId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Items(Builder builder) {
            this.children = builder.children;
            this.itemName = builder.itemName;
            this.itemTypeId = builder.itemTypeId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List<?> getChildren() {
            return this.children;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return itemTypeId
         */
        public String getItemTypeId() {
            return this.itemTypeId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List<?> children; 
            private String itemName; 
            private String itemTypeId; 
            private String value; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.children = model.children;
                this.itemName = model.itemName;
                this.itemTypeId = model.itemTypeId;
                this.value = model.value;
            } 

            /**
             * Children.
             */
            public Builder children(java.util.List<?> children) {
                this.children = children;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * ItemTypeId.
             */
            public Builder itemTypeId(String itemTypeId) {
                this.itemTypeId = itemTypeId;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelBatchGetHotelDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelBatchGetHotelDetailResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupTypeId")
        private String groupTypeId;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        private Policies(Builder builder) {
            this.groupName = builder.groupName;
            this.groupTypeId = builder.groupTypeId;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupTypeId
         */
        public String getGroupTypeId() {
            return this.groupTypeId;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private String groupName; 
            private String groupTypeId; 
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.groupName = model.groupName;
                this.groupTypeId = model.groupTypeId;
                this.items = model.items;
            } 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * GroupTypeId.
             */
            public Builder groupTypeId(String groupTypeId) {
                this.groupTypeId = groupTypeId;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelBatchGetHotelDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelBatchGetHotelDetailResponseBody</p>
     */
    public static class BedType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BedCount")
        private Integer bedCount;

        @com.aliyun.core.annotation.NameInMap("BedSize")
        private String bedSize;

        @com.aliyun.core.annotation.NameInMap("BedType")
        private String bedType;

        private BedType(Builder builder) {
            this.bedCount = builder.bedCount;
            this.bedSize = builder.bedSize;
            this.bedType = builder.bedType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BedType create() {
            return builder().build();
        }

        /**
         * @return bedCount
         */
        public Integer getBedCount() {
            return this.bedCount;
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
            private Integer bedCount; 
            private String bedSize; 
            private String bedType; 

            private Builder() {
            } 

            private Builder(BedType model) {
                this.bedCount = model.bedCount;
                this.bedSize = model.bedSize;
                this.bedType = model.bedType;
            } 

            /**
             * BedCount.
             */
            public Builder bedCount(Integer bedCount) {
                this.bedCount = bedCount;
                return this;
            }

            /**
             * BedSize.
             */
            public Builder bedSize(String bedSize) {
                this.bedSize = bedSize;
                return this;
            }

            /**
             * BedType.
             */
            public Builder bedType(String bedType) {
                this.bedType = bedType;
                return this;
            }

            public BedType build() {
                return new BedType(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelBatchGetHotelDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelBatchGetHotelDetailResponseBody</p>
     */
    public static class RoomTypesPictures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FirstCategoryCode")
        private String firstCategoryCode;

        @com.aliyun.core.annotation.NameInMap("FirstCategoryName")
        private String firstCategoryName;

        @com.aliyun.core.annotation.NameInMap("IsHeadPic")
        private Boolean isHeadPic;

        @com.aliyun.core.annotation.NameInMap("PictureId")
        private String pictureId;

        @com.aliyun.core.annotation.NameInMap("SecondCategoryCode")
        private String secondCategoryCode;

        @com.aliyun.core.annotation.NameInMap("SecondCategoryName")
        private String secondCategoryName;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private RoomTypesPictures(Builder builder) {
            this.description = builder.description;
            this.firstCategoryCode = builder.firstCategoryCode;
            this.firstCategoryName = builder.firstCategoryName;
            this.isHeadPic = builder.isHeadPic;
            this.pictureId = builder.pictureId;
            this.secondCategoryCode = builder.secondCategoryCode;
            this.secondCategoryName = builder.secondCategoryName;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomTypesPictures create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return firstCategoryCode
         */
        public String getFirstCategoryCode() {
            return this.firstCategoryCode;
        }

        /**
         * @return firstCategoryName
         */
        public String getFirstCategoryName() {
            return this.firstCategoryName;
        }

        /**
         * @return isHeadPic
         */
        public Boolean getIsHeadPic() {
            return this.isHeadPic;
        }

        /**
         * @return pictureId
         */
        public String getPictureId() {
            return this.pictureId;
        }

        /**
         * @return secondCategoryCode
         */
        public String getSecondCategoryCode() {
            return this.secondCategoryCode;
        }

        /**
         * @return secondCategoryName
         */
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String description; 
            private String firstCategoryCode; 
            private String firstCategoryName; 
            private Boolean isHeadPic; 
            private String pictureId; 
            private String secondCategoryCode; 
            private String secondCategoryName; 
            private String url; 

            private Builder() {
            } 

            private Builder(RoomTypesPictures model) {
                this.description = model.description;
                this.firstCategoryCode = model.firstCategoryCode;
                this.firstCategoryName = model.firstCategoryName;
                this.isHeadPic = model.isHeadPic;
                this.pictureId = model.pictureId;
                this.secondCategoryCode = model.secondCategoryCode;
                this.secondCategoryName = model.secondCategoryName;
                this.url = model.url;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FirstCategoryCode.
             */
            public Builder firstCategoryCode(String firstCategoryCode) {
                this.firstCategoryCode = firstCategoryCode;
                return this;
            }

            /**
             * FirstCategoryName.
             */
            public Builder firstCategoryName(String firstCategoryName) {
                this.firstCategoryName = firstCategoryName;
                return this;
            }

            /**
             * IsHeadPic.
             */
            public Builder isHeadPic(Boolean isHeadPic) {
                this.isHeadPic = isHeadPic;
                return this;
            }

            /**
             * PictureId.
             */
            public Builder pictureId(String pictureId) {
                this.pictureId = pictureId;
                return this;
            }

            /**
             * SecondCategoryCode.
             */
            public Builder secondCategoryCode(String secondCategoryCode) {
                this.secondCategoryCode = secondCategoryCode;
                return this;
            }

            /**
             * SecondCategoryName.
             */
            public Builder secondCategoryName(String secondCategoryName) {
                this.secondCategoryName = secondCategoryName;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public RoomTypesPictures build() {
                return new RoomTypesPictures(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelBatchGetHotelDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelBatchGetHotelDetailResponseBody</p>
     */
    public static class RoomTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BedType")
        private java.util.List<BedType> bedType;

        @com.aliyun.core.annotation.NameInMap("Pictures")
        private java.util.List<RoomTypesPictures> pictures;

        @com.aliyun.core.annotation.NameInMap("RoomName")
        private String roomName;

        @com.aliyun.core.annotation.NameInMap("RoomNameCn")
        private String roomNameCn;

        @com.aliyun.core.annotation.NameInMap("RoomSize")
        private Double roomSize;

        @com.aliyun.core.annotation.NameInMap("RoomSizeUnit")
        private String roomSizeUnit;

        @com.aliyun.core.annotation.NameInMap("StandardRoomId")
        private String standardRoomId;

        @com.aliyun.core.annotation.NameInMap("WindowType")
        private String windowType;

        @com.aliyun.core.annotation.NameInMap("WindowTypeDefect")
        private String windowTypeDefect;

        private RoomTypes(Builder builder) {
            this.bedType = builder.bedType;
            this.pictures = builder.pictures;
            this.roomName = builder.roomName;
            this.roomNameCn = builder.roomNameCn;
            this.roomSize = builder.roomSize;
            this.roomSizeUnit = builder.roomSizeUnit;
            this.standardRoomId = builder.standardRoomId;
            this.windowType = builder.windowType;
            this.windowTypeDefect = builder.windowTypeDefect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomTypes create() {
            return builder().build();
        }

        /**
         * @return bedType
         */
        public java.util.List<BedType> getBedType() {
            return this.bedType;
        }

        /**
         * @return pictures
         */
        public java.util.List<RoomTypesPictures> getPictures() {
            return this.pictures;
        }

        /**
         * @return roomName
         */
        public String getRoomName() {
            return this.roomName;
        }

        /**
         * @return roomNameCn
         */
        public String getRoomNameCn() {
            return this.roomNameCn;
        }

        /**
         * @return roomSize
         */
        public Double getRoomSize() {
            return this.roomSize;
        }

        /**
         * @return roomSizeUnit
         */
        public String getRoomSizeUnit() {
            return this.roomSizeUnit;
        }

        /**
         * @return standardRoomId
         */
        public String getStandardRoomId() {
            return this.standardRoomId;
        }

        /**
         * @return windowType
         */
        public String getWindowType() {
            return this.windowType;
        }

        /**
         * @return windowTypeDefect
         */
        public String getWindowTypeDefect() {
            return this.windowTypeDefect;
        }

        public static final class Builder {
            private java.util.List<BedType> bedType; 
            private java.util.List<RoomTypesPictures> pictures; 
            private String roomName; 
            private String roomNameCn; 
            private Double roomSize; 
            private String roomSizeUnit; 
            private String standardRoomId; 
            private String windowType; 
            private String windowTypeDefect; 

            private Builder() {
            } 

            private Builder(RoomTypes model) {
                this.bedType = model.bedType;
                this.pictures = model.pictures;
                this.roomName = model.roomName;
                this.roomNameCn = model.roomNameCn;
                this.roomSize = model.roomSize;
                this.roomSizeUnit = model.roomSizeUnit;
                this.standardRoomId = model.standardRoomId;
                this.windowType = model.windowType;
                this.windowTypeDefect = model.windowTypeDefect;
            } 

            /**
             * BedType.
             */
            public Builder bedType(java.util.List<BedType> bedType) {
                this.bedType = bedType;
                return this;
            }

            /**
             * Pictures.
             */
            public Builder pictures(java.util.List<RoomTypesPictures> pictures) {
                this.pictures = pictures;
                return this;
            }

            /**
             * RoomName.
             */
            public Builder roomName(String roomName) {
                this.roomName = roomName;
                return this;
            }

            /**
             * RoomNameCn.
             */
            public Builder roomNameCn(String roomNameCn) {
                this.roomNameCn = roomNameCn;
                return this;
            }

            /**
             * RoomSize.
             */
            public Builder roomSize(Double roomSize) {
                this.roomSize = roomSize;
                return this;
            }

            /**
             * RoomSizeUnit.
             */
            public Builder roomSizeUnit(String roomSizeUnit) {
                this.roomSizeUnit = roomSizeUnit;
                return this;
            }

            /**
             * StandardRoomId.
             */
            public Builder standardRoomId(String standardRoomId) {
                this.standardRoomId = standardRoomId;
                return this;
            }

            /**
             * WindowType.
             */
            public Builder windowType(String windowType) {
                this.windowType = windowType;
                return this;
            }

            /**
             * WindowTypeDefect.
             */
            public Builder windowTypeDefect(String windowTypeDefect) {
                this.windowTypeDefect = windowTypeDefect;
                return this;
            }

            public RoomTypes build() {
                return new RoomTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelBatchGetHotelDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelBatchGetHotelDetailResponseBody</p>
     */
    public static class Hotels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("CheckInTime")
        private String checkInTime;

        @com.aliyun.core.annotation.NameInMap("CheckOutTime")
        private String checkOutTime;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("CountryName")
        private String countryName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Facilities")
        private java.util.List<Facilities> facilities;

        @com.aliyun.core.annotation.NameInMap("HotelName")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("HotelNameCn")
        private String hotelNameCn;

        @com.aliyun.core.annotation.NameInMap("HotelType")
        private String hotelType;

        @com.aliyun.core.annotation.NameInMap("Latitude")
        private String latitude;

        @com.aliyun.core.annotation.NameInMap("Longitude")
        private String longitude;

        @com.aliyun.core.annotation.NameInMap("OpeningTime")
        private Integer openingTime;

        @com.aliyun.core.annotation.NameInMap("Pictures")
        private java.util.List<Pictures> pictures;

        @com.aliyun.core.annotation.NameInMap("Policies")
        private java.util.List<Policies> policies;

        @com.aliyun.core.annotation.NameInMap("PositionType")
        private String positionType;

        @com.aliyun.core.annotation.NameInMap("RenovationTime")
        private Integer renovationTime;

        @com.aliyun.core.annotation.NameInMap("RoomTypes")
        private java.util.List<RoomTypes> roomTypes;

        @com.aliyun.core.annotation.NameInMap("StandardHotelId")
        private String standardHotelId;

        @com.aliyun.core.annotation.NameInMap("Star")
        private String star;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tel")
        private String tel;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        private Hotels(Builder builder) {
            this.address = builder.address;
            this.checkInTime = builder.checkInTime;
            this.checkOutTime = builder.checkOutTime;
            this.cityName = builder.cityName;
            this.countryName = builder.countryName;
            this.description = builder.description;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.facilities = builder.facilities;
            this.hotelName = builder.hotelName;
            this.hotelNameCn = builder.hotelNameCn;
            this.hotelType = builder.hotelType;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.openingTime = builder.openingTime;
            this.pictures = builder.pictures;
            this.policies = builder.policies;
            this.positionType = builder.positionType;
            this.renovationTime = builder.renovationTime;
            this.roomTypes = builder.roomTypes;
            this.standardHotelId = builder.standardHotelId;
            this.star = builder.star;
            this.status = builder.status;
            this.tel = builder.tel;
            this.timezone = builder.timezone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hotels create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return checkInTime
         */
        public String getCheckInTime() {
            return this.checkInTime;
        }

        /**
         * @return checkOutTime
         */
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return countryName
         */
        public String getCountryName() {
            return this.countryName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return facilities
         */
        public java.util.List<Facilities> getFacilities() {
            return this.facilities;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return hotelNameCn
         */
        public String getHotelNameCn() {
            return this.hotelNameCn;
        }

        /**
         * @return hotelType
         */
        public String getHotelType() {
            return this.hotelType;
        }

        /**
         * @return latitude
         */
        public String getLatitude() {
            return this.latitude;
        }

        /**
         * @return longitude
         */
        public String getLongitude() {
            return this.longitude;
        }

        /**
         * @return openingTime
         */
        public Integer getOpeningTime() {
            return this.openingTime;
        }

        /**
         * @return pictures
         */
        public java.util.List<Pictures> getPictures() {
            return this.pictures;
        }

        /**
         * @return policies
         */
        public java.util.List<Policies> getPolicies() {
            return this.policies;
        }

        /**
         * @return positionType
         */
        public String getPositionType() {
            return this.positionType;
        }

        /**
         * @return renovationTime
         */
        public Integer getRenovationTime() {
            return this.renovationTime;
        }

        /**
         * @return roomTypes
         */
        public java.util.List<RoomTypes> getRoomTypes() {
            return this.roomTypes;
        }

        /**
         * @return standardHotelId
         */
        public String getStandardHotelId() {
            return this.standardHotelId;
        }

        /**
         * @return star
         */
        public String getStar() {
            return this.star;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tel
         */
        public String getTel() {
            return this.tel;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        public static final class Builder {
            private String address; 
            private String checkInTime; 
            private String checkOutTime; 
            private String cityName; 
            private String countryName; 
            private String description; 
            private String errorCode; 
            private String errorMessage; 
            private java.util.List<Facilities> facilities; 
            private String hotelName; 
            private String hotelNameCn; 
            private String hotelType; 
            private String latitude; 
            private String longitude; 
            private Integer openingTime; 
            private java.util.List<Pictures> pictures; 
            private java.util.List<Policies> policies; 
            private String positionType; 
            private Integer renovationTime; 
            private java.util.List<RoomTypes> roomTypes; 
            private String standardHotelId; 
            private String star; 
            private String status; 
            private String tel; 
            private String timezone; 

            private Builder() {
            } 

            private Builder(Hotels model) {
                this.address = model.address;
                this.checkInTime = model.checkInTime;
                this.checkOutTime = model.checkOutTime;
                this.cityName = model.cityName;
                this.countryName = model.countryName;
                this.description = model.description;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.facilities = model.facilities;
                this.hotelName = model.hotelName;
                this.hotelNameCn = model.hotelNameCn;
                this.hotelType = model.hotelType;
                this.latitude = model.latitude;
                this.longitude = model.longitude;
                this.openingTime = model.openingTime;
                this.pictures = model.pictures;
                this.policies = model.policies;
                this.positionType = model.positionType;
                this.renovationTime = model.renovationTime;
                this.roomTypes = model.roomTypes;
                this.standardHotelId = model.standardHotelId;
                this.star = model.star;
                this.status = model.status;
                this.tel = model.tel;
                this.timezone = model.timezone;
            } 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * CheckInTime.
             */
            public Builder checkInTime(String checkInTime) {
                this.checkInTime = checkInTime;
                return this;
            }

            /**
             * CheckOutTime.
             */
            public Builder checkOutTime(String checkOutTime) {
                this.checkOutTime = checkOutTime;
                return this;
            }

            /**
             * CityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * CountryName.
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Facilities.
             */
            public Builder facilities(java.util.List<Facilities> facilities) {
                this.facilities = facilities;
                return this;
            }

            /**
             * HotelName.
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * HotelNameCn.
             */
            public Builder hotelNameCn(String hotelNameCn) {
                this.hotelNameCn = hotelNameCn;
                return this;
            }

            /**
             * HotelType.
             */
            public Builder hotelType(String hotelType) {
                this.hotelType = hotelType;
                return this;
            }

            /**
             * Latitude.
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * Longitude.
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * OpeningTime.
             */
            public Builder openingTime(Integer openingTime) {
                this.openingTime = openingTime;
                return this;
            }

            /**
             * Pictures.
             */
            public Builder pictures(java.util.List<Pictures> pictures) {
                this.pictures = pictures;
                return this;
            }

            /**
             * Policies.
             */
            public Builder policies(java.util.List<Policies> policies) {
                this.policies = policies;
                return this;
            }

            /**
             * PositionType.
             */
            public Builder positionType(String positionType) {
                this.positionType = positionType;
                return this;
            }

            /**
             * RenovationTime.
             */
            public Builder renovationTime(Integer renovationTime) {
                this.renovationTime = renovationTime;
                return this;
            }

            /**
             * RoomTypes.
             */
            public Builder roomTypes(java.util.List<RoomTypes> roomTypes) {
                this.roomTypes = roomTypes;
                return this;
            }

            /**
             * StandardHotelId.
             */
            public Builder standardHotelId(String standardHotelId) {
                this.standardHotelId = standardHotelId;
                return this;
            }

            /**
             * Star.
             */
            public Builder star(String star) {
                this.star = star;
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
             * Tel.
             */
            public Builder tel(String tel) {
                this.tel = tel;
                return this;
            }

            /**
             * Timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public Hotels build() {
                return new Hotels(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelBatchGetHotelDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelBatchGetHotelDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hotels")
        private java.util.List<Hotels> hotels;

        private Data(Builder builder) {
            this.hotels = builder.hotels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hotels
         */
        public java.util.List<Hotels> getHotels() {
            return this.hotels;
        }

        public static final class Builder {
            private java.util.List<Hotels> hotels; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.hotels = model.hotels;
            } 

            /**
             * Hotels.
             */
            public Builder hotels(java.util.List<Hotels> hotels) {
                this.hotels = hotels;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
