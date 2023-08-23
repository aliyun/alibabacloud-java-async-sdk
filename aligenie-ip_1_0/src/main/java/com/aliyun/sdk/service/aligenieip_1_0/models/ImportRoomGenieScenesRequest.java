// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportRoomGenieScenesRequest} extends {@link RequestModel}
 *
 * <p>ImportRoomGenieScenesRequest</p>
 */
public class ImportRoomGenieScenesRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("RoomNo")
    @Validation(required = true)
    private String roomNo;

    @Body
    @NameInMap("SceneList")
    private java.util.List < SceneList> sceneList;

    private ImportRoomGenieScenesRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.roomNo = builder.roomNo;
        this.sceneList = builder.sceneList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportRoomGenieScenesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return roomNo
     */
    public String getRoomNo() {
        return this.roomNo;
    }

    /**
     * @return sceneList
     */
    public java.util.List < SceneList> getSceneList() {
        return this.sceneList;
    }

    public static final class Builder extends Request.Builder<ImportRoomGenieScenesRequest, Builder> {
        private String hotelId; 
        private String roomNo; 
        private java.util.List < SceneList> sceneList; 

        private Builder() {
            super();
        } 

        private Builder(ImportRoomGenieScenesRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.roomNo = request.roomNo;
            this.sceneList = request.sceneList;
        } 

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * RoomNo.
         */
        public Builder roomNo(String roomNo) {
            this.putBodyParameter("RoomNo", roomNo);
            this.roomNo = roomNo;
            return this;
        }

        /**
         * SceneList.
         */
        public Builder sceneList(java.util.List < SceneList> sceneList) {
            String sceneListShrink = shrink(sceneList, "SceneList", "json");
            this.putBodyParameter("SceneList", sceneListShrink);
            this.sceneList = sceneList;
            return this;
        }

        @Override
        public ImportRoomGenieScenesRequest build() {
            return new ImportRoomGenieScenesRequest(this);
        } 

    } 

    public static class AttributeValues extends TeaModel {
        @NameInMap("AttributeName")
        @Validation(required = true)
        private String attributeName;

        @NameInMap("AttributeValue")
        @Validation(required = true)
        private String attributeValue;

        private AttributeValues(Builder builder) {
            this.attributeName = builder.attributeName;
            this.attributeValue = builder.attributeValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeValues create() {
            return builder().build();
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return attributeValue
         */
        public String getAttributeValue() {
            return this.attributeValue;
        }

        public static final class Builder {
            private String attributeName; 
            private String attributeValue; 

            /**
             * AttributeName.
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * AttributeValue.
             */
            public Builder attributeValue(String attributeValue) {
                this.attributeValue = attributeValue;
                return this;
            }

            public AttributeValues build() {
                return new AttributeValues(this);
            } 

        } 

    }
    public static class Device extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        private String category;

        @NameInMap("DeviceIndex")
        private Integer deviceIndex;

        @NameInMap("DeviceNumber")
        @Validation(required = true)
        private String deviceNumber;

        @NameInMap("Type")
        private Integer type;

        private Device(Builder builder) {
            this.category = builder.category;
            this.deviceIndex = builder.deviceIndex;
            this.deviceNumber = builder.deviceNumber;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Device create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deviceIndex
         */
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        /**
         * @return deviceNumber
         */
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String category; 
            private Integer deviceIndex; 
            private String deviceNumber; 
            private Integer type; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DeviceIndex.
             */
            public Builder deviceIndex(Integer deviceIndex) {
                this.deviceIndex = deviceIndex;
                return this;
            }

            /**
             * DeviceNumber.
             */
            public Builder deviceNumber(String deviceNumber) {
                this.deviceNumber = deviceNumber;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Device build() {
                return new Device(this);
            } 

        } 

    }
    public static class Actions extends TeaModel {
        @NameInMap("AttributeValues")
        private java.util.List < AttributeValues> attributeValues;

        @NameInMap("Device")
        private Device device;

        @NameInMap("Reply")
        private String reply;

        @NameInMap("Type")
        private Integer type;

        private Actions(Builder builder) {
            this.attributeValues = builder.attributeValues;
            this.device = builder.device;
            this.reply = builder.reply;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return attributeValues
         */
        public java.util.List < AttributeValues> getAttributeValues() {
            return this.attributeValues;
        }

        /**
         * @return device
         */
        public Device getDevice() {
            return this.device;
        }

        /**
         * @return reply
         */
        public String getReply() {
            return this.reply;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < AttributeValues> attributeValues; 
            private Device device; 
            private String reply; 
            private Integer type; 

            /**
             * AttributeValues.
             */
            public Builder attributeValues(java.util.List < AttributeValues> attributeValues) {
                this.attributeValues = attributeValues;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(Device device) {
                this.device = device;
                return this;
            }

            /**
             * Reply.
             */
            public Builder reply(String reply) {
                this.reply = reply;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
    public static class TriggersAttributeValues extends TeaModel {
        @NameInMap("AttributeName")
        @Validation(required = true)
        private String attributeName;

        @NameInMap("AttributeValue")
        @Validation(required = true)
        private String attributeValue;

        private TriggersAttributeValues(Builder builder) {
            this.attributeName = builder.attributeName;
            this.attributeValue = builder.attributeValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggersAttributeValues create() {
            return builder().build();
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return attributeValue
         */
        public String getAttributeValue() {
            return this.attributeValue;
        }

        public static final class Builder {
            private String attributeName; 
            private String attributeValue; 

            /**
             * AttributeName.
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * AttributeValue.
             */
            public Builder attributeValue(String attributeValue) {
                this.attributeValue = attributeValue;
                return this;
            }

            public TriggersAttributeValues build() {
                return new TriggersAttributeValues(this);
            } 

        } 

    }
    public static class TriggersDevice extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        private String category;

        @NameInMap("DeviceIndex")
        private String deviceIndex;

        @NameInMap("DeviceNumber")
        @Validation(required = true)
        private String deviceNumber;

        private TriggersDevice(Builder builder) {
            this.category = builder.category;
            this.deviceIndex = builder.deviceIndex;
            this.deviceNumber = builder.deviceNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggersDevice create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deviceIndex
         */
        public String getDeviceIndex() {
            return this.deviceIndex;
        }

        /**
         * @return deviceNumber
         */
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        public static final class Builder {
            private String category; 
            private String deviceIndex; 
            private String deviceNumber; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DeviceIndex.
             */
            public Builder deviceIndex(String deviceIndex) {
                this.deviceIndex = deviceIndex;
                return this;
            }

            /**
             * DeviceNumber.
             */
            public Builder deviceNumber(String deviceNumber) {
                this.deviceNumber = deviceNumber;
                return this;
            }

            public TriggersDevice build() {
                return new TriggersDevice(this);
            } 

        } 

    }
    public static class Triggers extends TeaModel {
        @NameInMap("AttributeValues")
        private java.util.List < TriggersAttributeValues> attributeValues;

        @NameInMap("CorpusList")
        private java.util.List < String > corpusList;

        @NameInMap("Device")
        private TriggersDevice device;

        @NameInMap("Type")
        @Validation(required = true)
        private Integer type;

        private Triggers(Builder builder) {
            this.attributeValues = builder.attributeValues;
            this.corpusList = builder.corpusList;
            this.device = builder.device;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Triggers create() {
            return builder().build();
        }

        /**
         * @return attributeValues
         */
        public java.util.List < TriggersAttributeValues> getAttributeValues() {
            return this.attributeValues;
        }

        /**
         * @return corpusList
         */
        public java.util.List < String > getCorpusList() {
            return this.corpusList;
        }

        /**
         * @return device
         */
        public TriggersDevice getDevice() {
            return this.device;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < TriggersAttributeValues> attributeValues; 
            private java.util.List < String > corpusList; 
            private TriggersDevice device; 
            private Integer type; 

            /**
             * AttributeValues.
             */
            public Builder attributeValues(java.util.List < TriggersAttributeValues> attributeValues) {
                this.attributeValues = attributeValues;
                return this;
            }

            /**
             * CorpusList.
             */
            public Builder corpusList(java.util.List < String > corpusList) {
                this.corpusList = corpusList;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(TriggersDevice device) {
                this.device = device;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Triggers build() {
                return new Triggers(this);
            } 

        } 

    }
    public static class SceneList extends TeaModel {
        @NameInMap("Actions")
        @Validation(required = true)
        private java.util.List < Actions> actions;

        @NameInMap("Description")
        private String description;

        @NameInMap("Display")
        @Validation(required = true)
        private Boolean display;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("SceneName")
        @Validation(required = true)
        private String sceneName;

        @NameInMap("TriggerLogical")
        @Validation(required = true)
        private Integer triggerLogical;

        @NameInMap("Triggers")
        @Validation(required = true)
        private java.util.List < Triggers> triggers;

        private SceneList(Builder builder) {
            this.actions = builder.actions;
            this.description = builder.description;
            this.display = builder.display;
            this.icon = builder.icon;
            this.sceneName = builder.sceneName;
            this.triggerLogical = builder.triggerLogical;
            this.triggers = builder.triggers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneList create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < Actions> getActions() {
            return this.actions;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return triggerLogical
         */
        public Integer getTriggerLogical() {
            return this.triggerLogical;
        }

        /**
         * @return triggers
         */
        public java.util.List < Triggers> getTriggers() {
            return this.triggers;
        }

        public static final class Builder {
            private java.util.List < Actions> actions; 
            private String description; 
            private Boolean display; 
            private String icon; 
            private String sceneName; 
            private Integer triggerLogical; 
            private java.util.List < Triggers> triggers; 

            /**
             * Actions.
             */
            public Builder actions(java.util.List < Actions> actions) {
                this.actions = actions;
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
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * SceneName.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * TriggerLogical.
             */
            public Builder triggerLogical(Integer triggerLogical) {
                this.triggerLogical = triggerLogical;
                return this;
            }

            /**
             * Triggers.
             */
            public Builder triggers(java.util.List < Triggers> triggers) {
                this.triggers = triggers;
                return this;
            }

            public SceneList build() {
                return new SceneList(this);
            } 

        } 

    }
}
