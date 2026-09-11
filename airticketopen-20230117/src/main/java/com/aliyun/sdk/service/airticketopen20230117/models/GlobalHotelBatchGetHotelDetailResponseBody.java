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
         * <p>The business data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>CityCodeRequired</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>City code cannot be empty</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>260E4F99-983D-1919-834C-5C42E98E5B2B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

        @com.aliyun.core.annotation.NameInMap("SubItems")
        private java.util.List<?> subItems;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Facilities(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.subItems = builder.subItems;
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
         * @return subItems
         */
        public java.util.List<?> getSubItems() {
            return this.subItems;
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
            private java.util.List<?> subItems; 
            private String type; 

            private Builder() {
            } 

            private Builder(Facilities model) {
                this.description = model.description;
                this.name = model.name;
                this.subItems = model.subItems;
                this.type = model.type;
            } 

            /**
             * <p>The facility description.</p>
             * 
             * <strong>example:</strong>
             * <p>Outdoor heated swimming pool</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the facility.</p>
             * 
             * <strong>example:</strong>
             * <p>Swimming Pool</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of sub-facilities.</p>
             */
            public Builder subItems(java.util.List<?> subItems) {
                this.subItems = subItems;
                return this;
            }

            /**
             * <p>The type of the facility.</p>
             * 
             * <strong>example:</strong>
             * <p>parkade</p>
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
             * <p>The description of the picture.</p>
             * 
             * <strong>example:</strong>
             * <p>Hotel lobby</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The first-level category code.</p>
             * 
             * <strong>example:</strong>
             * <p>HOTEL</p>
             */
            public Builder firstCategoryCode(String firstCategoryCode) {
                this.firstCategoryCode = firstCategoryCode;
                return this;
            }

            /**
             * <p>The first-level category name.</p>
             * 
             * <strong>example:</strong>
             * <p>Hotel</p>
             */
            public Builder firstCategoryName(String firstCategoryName) {
                this.firstCategoryName = firstCategoryName;
                return this;
            }

            /**
             * <p>Indicates whether the picture is the cover image.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isHeadPic(Boolean isHeadPic) {
                this.isHeadPic = isHeadPic;
                return this;
            }

            /**
             * <p>The picture ID. The URL takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>PIC001</p>
             */
            public Builder pictureId(String pictureId) {
                this.pictureId = pictureId;
                return this;
            }

            /**
             * <p>The second-level category code.</p>
             * 
             * <strong>example:</strong>
             * <p>LOBBY</p>
             */
            public Builder secondCategoryCode(String secondCategoryCode) {
                this.secondCategoryCode = secondCategoryCode;
                return this;
            }

            /**
             * <p>The second-level category name.</p>
             * 
             * <strong>example:</strong>
             * <p>Lobby</p>
             */
            public Builder secondCategoryName(String secondCategoryName) {
                this.secondCategoryName = secondCategoryName;
                return this;
            }

            /**
             * <p>The URL of the picture.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.example.com/1.jpg">https://img.example.com/1.jpg</a></p>
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
             * <p>The list of subkeys.</p>
             */
            public Builder children(java.util.List<?> children) {
                this.children = children;
                return this;
            }

            /**
             * <p>The item name.</p>
             * 
             * <strong>example:</strong>
             * <p>Check-in time</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The item type ID.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_IN_TIME</p>
             */
            public Builder itemTypeId(String itemTypeId) {
                this.itemTypeId = itemTypeId;
                return this;
            }

            /**
             * <p>The text value.</p>
             * 
             * <strong>example:</strong>
             * <p>14:00</p>
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
             * <p>The group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Check-in Policy</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The group type ID.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_IN</p>
             */
            public Builder groupTypeId(String groupTypeId) {
                this.groupTypeId = groupTypeId;
                return this;
            }

            /**
             * <p>The list of policy items.</p>
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
    public static class BedInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BedCount")
        private Integer bedCount;

        @com.aliyun.core.annotation.NameInMap("BedNameCn")
        private String bedNameCn;

        @com.aliyun.core.annotation.NameInMap("BedNameEn")
        private String bedNameEn;

        @com.aliyun.core.annotation.NameInMap("BedSize")
        private String bedSize;

        @com.aliyun.core.annotation.NameInMap("BedType")
        private String bedType;

        private BedInfos(Builder builder) {
            this.bedCount = builder.bedCount;
            this.bedNameCn = builder.bedNameCn;
            this.bedNameEn = builder.bedNameEn;
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
         * @return bedCount
         */
        public Integer getBedCount() {
            return this.bedCount;
        }

        /**
         * @return bedNameCn
         */
        public String getBedNameCn() {
            return this.bedNameCn;
        }

        /**
         * @return bedNameEn
         */
        public String getBedNameEn() {
            return this.bedNameEn;
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
            private String bedNameCn; 
            private String bedNameEn; 
            private String bedSize; 
            private String bedType; 

            private Builder() {
            } 

            private Builder(BedInfos model) {
                this.bedCount = model.bedCount;
                this.bedNameCn = model.bedNameCn;
                this.bedNameEn = model.bedNameEn;
                this.bedSize = model.bedSize;
                this.bedType = model.bedType;
            } 

            /**
             * <p>The number of beds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bedCount(Integer bedCount) {
                this.bedCount = bedCount;
                return this;
            }

            /**
             * <p>The Chinese name of the bed type.</p>
             * 
             * <strong>example:</strong>
             * <p>大床</p>
             */
            public Builder bedNameCn(String bedNameCn) {
                this.bedNameCn = bedNameCn;
                return this;
            }

            /**
             * <p>The English name of the bed type.</p>
             * 
             * <strong>example:</strong>
             * <p>King Bed</p>
             */
            public Builder bedNameEn(String bedNameEn) {
                this.bedNameEn = bedNameEn;
                return this;
            }

            /**
             * <p>The bed width in meters.</p>
             * 
             * <strong>example:</strong>
             * <p>1.83</p>
             */
            public Builder bedSize(String bedSize) {
                this.bedSize = bedSize;
                return this;
            }

            /**
             * <p>The bed type code. This is the original channel code passed through directly. For the meaning of code values, refer to the API documentation.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link GlobalHotelBatchGetHotelDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelBatchGetHotelDetailResponseBody</p>
     */
    public static class BedGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BedInfos")
        private java.util.List<BedInfos> bedInfos;

        private BedGroups(Builder builder) {
            this.bedInfos = builder.bedInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BedGroups create() {
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

            private Builder() {
            } 

            private Builder(BedGroups model) {
                this.bedInfos = model.bedInfos;
            } 

            /**
             * <p>The list of bed types within a group. Items are in an AND relationship.</p>
             */
            public Builder bedInfos(java.util.List<BedInfos> bedInfos) {
                this.bedInfos = bedInfos;
                return this;
            }

            public BedGroups build() {
                return new BedGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelBatchGetHotelDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelBatchGetHotelDetailResponseBody</p>
     */
    public static class RoomTypesFacilities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SubItems")
        private java.util.List<?> subItems;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RoomTypesFacilities(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.subItems = builder.subItems;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomTypesFacilities create() {
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
         * @return subItems
         */
        public java.util.List<?> getSubItems() {
            return this.subItems;
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
            private java.util.List<?> subItems; 
            private String type; 

            private Builder() {
            } 

            private Builder(RoomTypesFacilities model) {
                this.description = model.description;
                this.name = model.name;
                this.subItems = model.subItems;
                this.type = model.type;
            } 

            /**
             * <p>The facility description.</p>
             * 
             * <strong>example:</strong>
             * <p>Popular Facilities</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the facility.</p>
             * 
             * <strong>example:</strong>
             * <p>Parking Lot</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of sub-facilities.</p>
             */
            public Builder subItems(java.util.List<?> subItems) {
                this.subItems = subItems;
                return this;
            }

            /**
             * <p>The type of the facility.</p>
             * 
             * <strong>example:</strong>
             * <p>parkade</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RoomTypesFacilities build() {
                return new RoomTypesFacilities(this);
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
             * <p>The description of the picture.</p>
             * 
             * <strong>example:</strong>
             * <p>Hotel lobby</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The first-level category code.</p>
             * 
             * <strong>example:</strong>
             * <p>HOTEL</p>
             */
            public Builder firstCategoryCode(String firstCategoryCode) {
                this.firstCategoryCode = firstCategoryCode;
                return this;
            }

            /**
             * <p>The first-level category name.</p>
             * 
             * <strong>example:</strong>
             * <p>Hotel</p>
             */
            public Builder firstCategoryName(String firstCategoryName) {
                this.firstCategoryName = firstCategoryName;
                return this;
            }

            /**
             * <p>Indicates whether the picture is the cover image.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isHeadPic(Boolean isHeadPic) {
                this.isHeadPic = isHeadPic;
                return this;
            }

            /**
             * <p>The picture ID. The URL takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>PIC001</p>
             */
            public Builder pictureId(String pictureId) {
                this.pictureId = pictureId;
                return this;
            }

            /**
             * <p>The second-level category code.</p>
             * 
             * <strong>example:</strong>
             * <p>LOBBY</p>
             */
            public Builder secondCategoryCode(String secondCategoryCode) {
                this.secondCategoryCode = secondCategoryCode;
                return this;
            }

            /**
             * <p>The second-level category name.</p>
             * 
             * <strong>example:</strong>
             * <p>Lobby</p>
             */
            public Builder secondCategoryName(String secondCategoryName) {
                this.secondCategoryName = secondCategoryName;
                return this;
            }

            /**
             * <p>The URL of the picture.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.example.com/1.jpg">https://img.example.com/1.jpg</a></p>
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
        @com.aliyun.core.annotation.NameInMap("BedGroups")
        private java.util.List<BedGroups> bedGroups;

        @com.aliyun.core.annotation.NameInMap("Facilities")
        private java.util.List<RoomTypesFacilities> facilities;

        @com.aliyun.core.annotation.NameInMap("Pictures")
        private java.util.List<RoomTypesPictures> pictures;

        @com.aliyun.core.annotation.NameInMap("RoomName")
        private String roomName;

        @com.aliyun.core.annotation.NameInMap("RoomNameCn")
        private String roomNameCn;

        @com.aliyun.core.annotation.NameInMap("RoomSize")
        private String roomSize;

        @com.aliyun.core.annotation.NameInMap("RoomSizeUnit")
        private String roomSizeUnit;

        @com.aliyun.core.annotation.NameInMap("StandardRoomId")
        private String standardRoomId;

        @com.aliyun.core.annotation.NameInMap("WindowType")
        private String windowType;

        @com.aliyun.core.annotation.NameInMap("WindowTypeDefect")
        private String windowTypeDefect;

        private RoomTypes(Builder builder) {
            this.bedGroups = builder.bedGroups;
            this.facilities = builder.facilities;
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
         * @return bedGroups
         */
        public java.util.List<BedGroups> getBedGroups() {
            return this.bedGroups;
        }

        /**
         * @return facilities
         */
        public java.util.List<RoomTypesFacilities> getFacilities() {
            return this.facilities;
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
        public String getRoomSize() {
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
            private java.util.List<BedGroups> bedGroups; 
            private java.util.List<RoomTypesFacilities> facilities; 
            private java.util.List<RoomTypesPictures> pictures; 
            private String roomName; 
            private String roomNameCn; 
            private String roomSize; 
            private String roomSizeUnit; 
            private String standardRoomId; 
            private String windowType; 
            private String windowTypeDefect; 

            private Builder() {
            } 

            private Builder(RoomTypes model) {
                this.bedGroups = model.bedGroups;
                this.facilities = model.facilities;
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
             * <p>The list of bed type groups. This has the same structure as bedInfoJson. Groups are in an OR relationship, and items within a group are in an AND relationship.</p>
             */
            public Builder bedGroups(java.util.List<BedGroups> bedGroups) {
                this.bedGroups = bedGroups;
                return this;
            }

            /**
             * <p>The list of room type facilities.</p>
             */
            public Builder facilities(java.util.List<RoomTypesFacilities> facilities) {
                this.facilities = facilities;
                return this;
            }

            /**
             * <p>The list of room type pictures.</p>
             */
            public Builder pictures(java.util.List<RoomTypesPictures> pictures) {
                this.pictures = pictures;
                return this;
            }

            /**
             * <p>The room type name.</p>
             * 
             * <strong>example:</strong>
             * <p>Deluxe King Room</p>
             */
            public Builder roomName(String roomName) {
                this.roomName = roomName;
                return this;
            }

            /**
             * <p>The Chinese room type name. This value is always in Chinese regardless of the language parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>豪华大床房</p>
             */
            public Builder roomNameCn(String roomNameCn) {
                this.roomNameCn = roomNameCn;
                return this;
            }

            /**
             * <p>The room size. The value is passed through as-is and may be a range.</p>
             * 
             * <strong>example:</strong>
             * <p>35.0</p>
             */
            public Builder roomSize(String roomSize) {
                this.roomSize = roomSize;
                return this;
            }

            /**
             * <p>The unit of the room size. Valid values: SQM (square meters) and SQFT (square feet). Default value: SQM.</p>
             * 
             * <strong>example:</strong>
             * <p>SQM</p>
             */
            public Builder roomSizeUnit(String roomSizeUnit) {
                this.roomSizeUnit = roomSizeUnit;
                return this;
            }

            /**
             * <p>The platform standard room type ID.</p>
             * 
             * <strong>example:</strong>
             * <p>R001</p>
             */
            public Builder standardRoomId(String standardRoomId) {
                this.standardRoomId = standardRoomId;
                return this;
            }

            /**
             * <p>The window type. Valid values:</p>
             * <ul>
             * <li>0: no window.</li>
             * <li>1: with window.</li>
             * <li>2: partially with window.</li>
             * <li>3: frosted or opaque window.</li>
             * <li>4: partially frosted or opaque window.</li>
             * <li>5: floor-to-ceiling window.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WINDOW</p>
             */
            public Builder windowType(String windowType) {
                this.windowType = windowType;
                return this;
            }

            /**
             * <p>The window defect code. Valid values:</p>
             * <ul>
             * <li>0: The window cannot be opened for ventilation.</li>
             * <li>1: The view from the window is obstructed.</li>
             * <li>2: The window faces an interior hotel view.</li>
             * <li>3: The window is located along a corridor or hallway.</li>
             * <li>4: The window can be opened for ventilation and faces an outdoor open environment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SMALL_WINDOW</p>
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
             * <p>The address of the hotel.</p>
             * 
             * <strong>example:</strong>
             * <p>No.33 East Chang An Avenue</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The default check-in time in HH:mm format, based on the hotel\&quot;s local time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>14:00</p>
             */
            public Builder checkInTime(String checkInTime) {
                this.checkInTime = checkInTime;
                return this;
            }

            /**
             * <p>The default check-out time in HH:mm format, based on the hotel\&quot;s local time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>12:00</p>
             */
            public Builder checkOutTime(String checkOutTime) {
                this.checkOutTime = checkOutTime;
                return this;
            }

            /**
             * <p>The city name.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>The country name.</p>
             * 
             * <strong>example:</strong>
             * <p>China</p>
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            /**
             * <p>The description of the hotel.</p>
             * 
             * <strong>example:</strong>
             * <p>Five-star luxury hotel</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The error code for the individual hotel.</p>
             * 
             * <strong>example:</strong>
             * <p>HOTEL_NOT_FOUND</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error description for the individual hotel.</p>
             * 
             * <strong>example:</strong>
             * <p>Hotel does not exist</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The list of facilities.</p>
             */
            public Builder facilities(java.util.List<Facilities> facilities) {
                this.facilities = facilities;
                return this;
            }

            /**
             * <p>The hotel name.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing Hotel</p>
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * <p>The Chinese hotel name. This value is always in Chinese regardless of the language setting.</p>
             * 
             * <strong>example:</strong>
             * <p>北京饭店</p>
             */
            public Builder hotelNameCn(String hotelNameCn) {
                this.hotelNameCn = hotelNameCn;
                return this;
            }

            /**
             * <p>The hotel type (LUXURY/DELUXE/COMFORT).</p>
             * 
             * <strong>example:</strong>
             * <p>LUXURY</p>
             */
            public Builder hotelType(String hotelType) {
                this.hotelType = hotelType;
                return this;
            }

            /**
             * <p>The latitude of the hotel.</p>
             * 
             * <strong>example:</strong>
             * <p>39.9042</p>
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * <p>The longitude of the hotel.</p>
             * 
             * <strong>example:</strong>
             * <p>116.4074</p>
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * <p>The year the hotel opened.</p>
             * 
             * <strong>example:</strong>
             * <p>2018</p>
             */
            public Builder openingTime(Integer openingTime) {
                this.openingTime = openingTime;
                return this;
            }

            /**
             * <p>The list of pictures.</p>
             */
            public Builder pictures(java.util.List<Pictures> pictures) {
                this.pictures = pictures;
                return this;
            }

            /**
             * <p>The hotel policy information.</p>
             */
            public Builder policies(java.util.List<Policies> policies) {
                this.policies = policies;
                return this;
            }

            /**
             * <p>The source of the latitude and longitude coordinates.</p>
             * 
             * <strong>example:</strong>
             * <p>GOOGLE</p>
             */
            public Builder positionType(String positionType) {
                this.positionType = positionType;
                return this;
            }

            /**
             * <p>The year the hotel was last renovated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021</p>
             */
            public Builder renovationTime(Integer renovationTime) {
                this.renovationTime = renovationTime;
                return this;
            }

            /**
             * <p>The list of room types.</p>
             */
            public Builder roomTypes(java.util.List<RoomTypes> roomTypes) {
                this.roomTypes = roomTypes;
                return this;
            }

            /**
             * <p>The platform standard hotel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>H001</p>
             */
            public Builder standardHotelId(String standardHotelId) {
                this.standardHotelId = standardHotelId;
                return this;
            }

            /**
             * <p>The star rating of the hotel.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder star(String star) {
                this.star = star;
                return this;
            }

            /**
             * <p>The hotel status (ONLINE/OFFLINE).</p>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The phone number of the hotel.</p>
             * 
             * <strong>example:</strong>
             * <p>+86-10-65137766</p>
             */
            public Builder tel(String tel) {
                this.tel = tel;
                return this;
            }

            /**
             * <p>The time zone of the hotel in IANA ID format.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
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
             * <p>The list of hotel details.</p>
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
