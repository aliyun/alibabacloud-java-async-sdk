// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeBucketsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBucketsResponseBody</p>
 */
public class DescribeBucketsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeBucketsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBucketsResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeBucketsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public DescribeBucketsResponseBody build() {
            return new DescribeBucketsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBucketsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBucketsResponseBody</p>
     */
    public static class Owner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private Owner(Builder builder) {
            this.displayName = builder.displayName;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Owner create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String displayName; 
            private String id; 

            private Builder() {
            } 

            private Builder(Owner model) {
                this.displayName = model.displayName;
                this.id = model.id;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Owner build() {
                return new Owner(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBucketsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBucketsResponseBody</p>
     */
    public static class OssObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("ETag")
        private String eTag;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private Owner owner;

        @com.aliyun.core.annotation.NameInMap("RestoreInfo")
        private String restoreInfo;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private OssObjectList(Builder builder) {
            this.bucketName = builder.bucketName;
            this.eTag = builder.eTag;
            this.key = builder.key;
            this.lastModified = builder.lastModified;
            this.owner = builder.owner;
            this.restoreInfo = builder.restoreInfo;
            this.size = builder.size;
            this.storageClass = builder.storageClass;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssObjectList create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return eTag
         */
        public String getETag() {
            return this.eTag;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return owner
         */
        public Owner getOwner() {
            return this.owner;
        }

        /**
         * @return restoreInfo
         */
        public String getRestoreInfo() {
            return this.restoreInfo;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bucketName; 
            private String eTag; 
            private String key; 
            private String lastModified; 
            private Owner owner; 
            private String restoreInfo; 
            private Long size; 
            private String storageClass; 
            private String type; 

            private Builder() {
            } 

            private Builder(OssObjectList model) {
                this.bucketName = model.bucketName;
                this.eTag = model.eTag;
                this.key = model.key;
                this.lastModified = model.lastModified;
                this.owner = model.owner;
                this.restoreInfo = model.restoreInfo;
                this.size = model.size;
                this.storageClass = model.storageClass;
                this.type = model.type;
            } 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * ETag.
             */
            public Builder eTag(String eTag) {
                this.eTag = eTag;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * LastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(Owner owner) {
                this.owner = owner;
                return this;
            }

            /**
             * RestoreInfo.
             */
            public Builder restoreInfo(String restoreInfo) {
                this.restoreInfo = restoreInfo;
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
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OssObjectList build() {
                return new OssObjectList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBucketsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBucketsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("ExtranetEndpoint")
        private String extranetEndpoint;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("IntranetEndpoint")
        private String intranetEndpoint;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("OssObjectList")
        private java.util.List<OssObjectList> ossObjectList;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private Data(Builder builder) {
            this.bucketName = builder.bucketName;
            this.extranetEndpoint = builder.extranetEndpoint;
            this.gmtCreated = builder.gmtCreated;
            this.intranetEndpoint = builder.intranetEndpoint;
            this.location = builder.location;
            this.ossObjectList = builder.ossObjectList;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return extranetEndpoint
         */
        public String getExtranetEndpoint() {
            return this.extranetEndpoint;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return intranetEndpoint
         */
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return ossObjectList
         */
        public java.util.List<OssObjectList> getOssObjectList() {
            return this.ossObjectList;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String bucketName; 
            private String extranetEndpoint; 
            private String gmtCreated; 
            private String intranetEndpoint; 
            private String location; 
            private java.util.List<OssObjectList> ossObjectList; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bucketName = model.bucketName;
                this.extranetEndpoint = model.extranetEndpoint;
                this.gmtCreated = model.gmtCreated;
                this.intranetEndpoint = model.intranetEndpoint;
                this.location = model.location;
                this.ossObjectList = model.ossObjectList;
                this.regionId = model.regionId;
            } 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * ExtranetEndpoint.
             */
            public Builder extranetEndpoint(String extranetEndpoint) {
                this.extranetEndpoint = extranetEndpoint;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * IntranetEndpoint.
             */
            public Builder intranetEndpoint(String intranetEndpoint) {
                this.intranetEndpoint = intranetEndpoint;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * OssObjectList.
             */
            public Builder ossObjectList(java.util.List<OssObjectList> ossObjectList) {
                this.ossObjectList = ossObjectList;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
