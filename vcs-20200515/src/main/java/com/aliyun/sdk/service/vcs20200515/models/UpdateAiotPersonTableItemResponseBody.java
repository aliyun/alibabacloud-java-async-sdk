// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAiotPersonTableItemResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAiotPersonTableItemResponseBody</p>
 */
public class UpdateAiotPersonTableItemResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PersonTableItem")
    private PersonTableItem personTableItem;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateAiotPersonTableItemResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.personTableItem = builder.personTableItem;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAiotPersonTableItemResponseBody create() {
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
     * @return personTableItem
     */
    public PersonTableItem getPersonTableItem() {
        return this.personTableItem;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private PersonTableItem personTableItem; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PersonTableItem.
         */
        public Builder personTableItem(PersonTableItem personTableItem) {
            this.personTableItem = personTableItem;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAiotPersonTableItemResponseBody build() {
            return new UpdateAiotPersonTableItemResponseBody(this);
        } 

    } 

    public static class IdentificationList extends TeaModel {
        @NameInMap("Number")
        private String number;

        @NameInMap("Type")
        private Long type;

        private IdentificationList(Builder builder) {
            this.number = builder.number;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentificationList create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private String number; 
            private Long type; 

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public IdentificationList build() {
                return new IdentificationList(this);
            } 

        } 

    }
    public static class FeatureInfo extends TeaModel {
        @NameInMap("AlgorithmType")
        private String algorithmType;

        @NameInMap("AlgorithmVersion")
        private String algorithmVersion;

        @NameInMap("FeatureData")
        private String featureData;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ObjectId")
        private String objectId;

        @NameInMap("TabIed")
        private String tabIed;

        @NameInMap("Vendor")
        private String vendor;

        private FeatureInfo(Builder builder) {
            this.algorithmType = builder.algorithmType;
            this.algorithmVersion = builder.algorithmVersion;
            this.featureData = builder.featureData;
            this.imageId = builder.imageId;
            this.objectId = builder.objectId;
            this.tabIed = builder.tabIed;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureInfo create() {
            return builder().build();
        }

        /**
         * @return algorithmType
         */
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        /**
         * @return algorithmVersion
         */
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        /**
         * @return featureData
         */
        public String getFeatureData() {
            return this.featureData;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return tabIed
         */
        public String getTabIed() {
            return this.tabIed;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String algorithmType; 
            private String algorithmVersion; 
            private String featureData; 
            private String imageId; 
            private String objectId; 
            private String tabIed; 
            private String vendor; 

            /**
             * AlgorithmType.
             */
            public Builder algorithmType(String algorithmType) {
                this.algorithmType = algorithmType;
                return this;
            }

            /**
             * AlgorithmVersion.
             */
            public Builder algorithmVersion(String algorithmVersion) {
                this.algorithmVersion = algorithmVersion;
                return this;
            }

            /**
             * FeatureData.
             */
            public Builder featureData(String featureData) {
                this.featureData = featureData;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ObjectId.
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * TabIed.
             */
            public Builder tabIed(String tabIed) {
                this.tabIed = tabIed;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public FeatureInfo build() {
                return new FeatureInfo(this);
            } 

        } 

    }
    public static class ImageList extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("EventSort")
        private String eventSort;

        @NameInMap("FeatureInfo")
        private FeatureInfo featureInfo;

        @NameInMap("FileFormat")
        private String fileFormat;

        @NameInMap("Height")
        private Long height;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ShotTime")
        private String shotTime;

        @NameInMap("Size")
        private Long size;

        @NameInMap("StoragePath")
        private String storagePath;

        @NameInMap("Type")
        private String type;

        @NameInMap("Width")
        private Long width;

        private ImageList(Builder builder) {
            this.data = builder.data;
            this.deviceId = builder.deviceId;
            this.eventSort = builder.eventSort;
            this.featureInfo = builder.featureInfo;
            this.fileFormat = builder.fileFormat;
            this.height = builder.height;
            this.imageId = builder.imageId;
            this.shotTime = builder.shotTime;
            this.size = builder.size;
            this.storagePath = builder.storagePath;
            this.type = builder.type;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageList create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return eventSort
         */
        public String getEventSort() {
            return this.eventSort;
        }

        /**
         * @return featureInfo
         */
        public FeatureInfo getFeatureInfo() {
            return this.featureInfo;
        }

        /**
         * @return fileFormat
         */
        public String getFileFormat() {
            return this.fileFormat;
        }

        /**
         * @return height
         */
        public Long getHeight() {
            return this.height;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return shotTime
         */
        public String getShotTime() {
            return this.shotTime;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return storagePath
         */
        public String getStoragePath() {
            return this.storagePath;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return width
         */
        public Long getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String data; 
            private String deviceId; 
            private String eventSort; 
            private FeatureInfo featureInfo; 
            private String fileFormat; 
            private Long height; 
            private String imageId; 
            private String shotTime; 
            private Long size; 
            private String storagePath; 
            private String type; 
            private Long width; 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * EventSort.
             */
            public Builder eventSort(String eventSort) {
                this.eventSort = eventSort;
                return this;
            }

            /**
             * FeatureInfo.
             */
            public Builder featureInfo(FeatureInfo featureInfo) {
                this.featureInfo = featureInfo;
                return this;
            }

            /**
             * FileFormat.
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ShotTime.
             */
            public Builder shotTime(String shotTime) {
                this.shotTime = shotTime;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * StoragePath.
             */
            public Builder storagePath(String storagePath) {
                this.storagePath = storagePath;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Long width) {
                this.width = width;
                return this;
            }

            public ImageList build() {
                return new ImageList(this);
            } 

        } 

    }
    public static class PersonTableItem extends TeaModel {
        @NameInMap("IdentificationList")
        private java.util.List < IdentificationList> identificationList;

        @NameInMap("IdentificationNum")
        private Long identificationNum;

        @NameInMap("ImageList")
        private java.util.List < ImageList> imageList;

        @NameInMap("ImageNum")
        private Long imageNum;

        @NameInMap("LastChange")
        private String lastChange;

        @NameInMap("PersonCode")
        private String personCode;

        @NameInMap("PersonId")
        private String personId;

        @NameInMap("PersonName")
        private String personName;

        @NameInMap("PersonTableId")
        private String personTableId;

        @NameInMap("Remarks")
        private String remarks;

        private PersonTableItem(Builder builder) {
            this.identificationList = builder.identificationList;
            this.identificationNum = builder.identificationNum;
            this.imageList = builder.imageList;
            this.imageNum = builder.imageNum;
            this.lastChange = builder.lastChange;
            this.personCode = builder.personCode;
            this.personId = builder.personId;
            this.personName = builder.personName;
            this.personTableId = builder.personTableId;
            this.remarks = builder.remarks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PersonTableItem create() {
            return builder().build();
        }

        /**
         * @return identificationList
         */
        public java.util.List < IdentificationList> getIdentificationList() {
            return this.identificationList;
        }

        /**
         * @return identificationNum
         */
        public Long getIdentificationNum() {
            return this.identificationNum;
        }

        /**
         * @return imageList
         */
        public java.util.List < ImageList> getImageList() {
            return this.imageList;
        }

        /**
         * @return imageNum
         */
        public Long getImageNum() {
            return this.imageNum;
        }

        /**
         * @return lastChange
         */
        public String getLastChange() {
            return this.lastChange;
        }

        /**
         * @return personCode
         */
        public String getPersonCode() {
            return this.personCode;
        }

        /**
         * @return personId
         */
        public String getPersonId() {
            return this.personId;
        }

        /**
         * @return personName
         */
        public String getPersonName() {
            return this.personName;
        }

        /**
         * @return personTableId
         */
        public String getPersonTableId() {
            return this.personTableId;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        public static final class Builder {
            private java.util.List < IdentificationList> identificationList; 
            private Long identificationNum; 
            private java.util.List < ImageList> imageList; 
            private Long imageNum; 
            private String lastChange; 
            private String personCode; 
            private String personId; 
            private String personName; 
            private String personTableId; 
            private String remarks; 

            /**
             * IdentificationList.
             */
            public Builder identificationList(java.util.List < IdentificationList> identificationList) {
                this.identificationList = identificationList;
                return this;
            }

            /**
             * IdentificationNum.
             */
            public Builder identificationNum(Long identificationNum) {
                this.identificationNum = identificationNum;
                return this;
            }

            /**
             * ImageList.
             */
            public Builder imageList(java.util.List < ImageList> imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * ImageNum.
             */
            public Builder imageNum(Long imageNum) {
                this.imageNum = imageNum;
                return this;
            }

            /**
             * LastChange.
             */
            public Builder lastChange(String lastChange) {
                this.lastChange = lastChange;
                return this;
            }

            /**
             * PersonCode.
             */
            public Builder personCode(String personCode) {
                this.personCode = personCode;
                return this;
            }

            /**
             * PersonId.
             */
            public Builder personId(String personId) {
                this.personId = personId;
                return this;
            }

            /**
             * PersonName.
             */
            public Builder personName(String personName) {
                this.personName = personName;
                return this;
            }

            /**
             * PersonTableId.
             */
            public Builder personTableId(String personTableId) {
                this.personTableId = personTableId;
                return this;
            }

            /**
             * Remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            public PersonTableItem build() {
                return new PersonTableItem(this);
            } 

        } 

    }
}
