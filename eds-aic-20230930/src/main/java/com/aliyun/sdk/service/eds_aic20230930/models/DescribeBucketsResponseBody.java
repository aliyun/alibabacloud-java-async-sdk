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
         * <p>The error code.</p>
         * <blockquote>
         * <p>This parameter is returned only when the call fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned result object.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The return status code of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
             * <p>The name of the bucket owner.</p>
             * 
             * <strong>example:</strong>
             * <p>佳钰</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The unique identifier of the bucket owner.</p>
             * 
             * <strong>example:</strong>
             * <p>395</p>
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
             * <p>The name of the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>tf-testacceu-central-1ensbucketlifecycle44222</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The Entity Tag (ETag) is created when an object is generated. It is used to identify the content of an object.</p>
             * <ul>
             * <li><p>For an object created by a PutObject request, the ETag value is the MD5 hash of the object content.</p>
             * </li>
             * <li><p>For an object created by other methods, the ETag value is a unique value generated based on specific calculation rules. It is not the MD5 hash of the object content.</p>
             * </li>
             * <li><p>The ETag value can be used to check if the object content has changed. Do not use the ETag value as the MD5 hash to verify the data integrity of the object.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5B3C1A2E053D763E1B002CC607C5A0FE1****</p>
             */
            public Builder eTag(String eTag) {
                this.eTag = eTag;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>con</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The time when the object was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2012-02-24T08:42:32.000Z</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>The information about the bucket owner.</p>
             */
            public Builder owner(Owner owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The information about database recovery if the database type is MSSQL. The value is a JSON string that contains the following parameters:</p>
             * <ul>
             * <li><p><strong>name</strong>: The name of the database.</p>
             * </li>
             * <li><p><strong>files</strong>: The path of the database file.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ongoing-request=&quot;true&quot;</p>
             */
            public Builder restoreInfo(String restoreInfo) {
                this.restoreInfo = restoreInfo;
                return this;
            }

            /**
             * <p>The size of the file. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The storage class of the bucket. Valid values:</p>
             * <ul>
             * <li><p>Standard (default): Standard</p>
             * </li>
             * <li><p>IA: Infrequent Access</p>
             * </li>
             * <li><p>Archive: Archive Storage</p>
             * </li>
             * <li><p>ColdArchive: Cold Archive</p>
             * </li>
             * <li><p>DeepColdArchive: Deep Cold Archive</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ARCHIVE</p>
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * <p>The type of the trigger method.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceGroup</p>
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
             * <p>The name of the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>zydctest</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The public endpoint that is used to access the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou.aliyuncs.com</p>
             */
            public Builder extranetEndpoint(String extranetEndpoint) {
                this.extranetEndpoint = extranetEndpoint;
                return this;
            }

            /**
             * <p>The time when the bucket was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-15 17:33:59</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The internal endpoint that is used by a same-region ECS instance to access the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
             */
            public Builder intranetEndpoint(String intranetEndpoint) {
                this.intranetEndpoint = intranetEndpoint;
                return this;
            }

            /**
             * <p>The storage path, such as a path in Hadoop Distributed File System (HDFS) or OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>center</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The information about the objects in the bucket.</p>
             */
            public Builder ossObjectList(java.util.List<OssObjectList> ossObjectList) {
                this.ossObjectList = ossObjectList;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
