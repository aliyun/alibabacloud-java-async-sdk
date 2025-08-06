// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetPersonalStorageListResponseBody} extends {@link TeaModel}
 *
 * <p>GetPersonalStorageListResponseBody</p>
 */
public class GetPersonalStorageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageInfoList")
    private StorageInfoList storageInfoList;

    private GetPersonalStorageListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.storageInfoList = builder.storageInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPersonalStorageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageInfoList
     */
    public StorageInfoList getStorageInfoList() {
        return this.storageInfoList;
    }

    public static final class Builder {
        private String requestId; 
        private StorageInfoList storageInfoList; 

        private Builder() {
        } 

        private Builder(GetPersonalStorageListResponseBody model) {
            this.requestId = model.requestId;
            this.storageInfoList = model.storageInfoList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StorageInfoList.
         */
        public Builder storageInfoList(StorageInfoList storageInfoList) {
            this.storageInfoList = storageInfoList;
            return this;
        }

        public GetPersonalStorageListResponseBody build() {
            return new GetPersonalStorageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPersonalStorageListResponseBody} extends {@link TeaModel}
     *
     * <p>GetPersonalStorageListResponseBody</p>
     */
    public static class StorageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtranetEndpoint")
        private String extranetEndpoint;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("IntranetEndpoint")
        private String intranetEndpoint;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("StorageACL")
        private String storageACL;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        private StorageInfo(Builder builder) {
            this.extranetEndpoint = builder.extranetEndpoint;
            this.gmtCreate = builder.gmtCreate;
            this.intranetEndpoint = builder.intranetEndpoint;
            this.location = builder.location;
            this.ownerId = builder.ownerId;
            this.storageACL = builder.storageACL;
            this.storageClass = builder.storageClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageInfo create() {
            return builder().build();
        }

        /**
         * @return extranetEndpoint
         */
        public String getExtranetEndpoint() {
            return this.extranetEndpoint;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
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
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return storageACL
         */
        public String getStorageACL() {
            return this.storageACL;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        public static final class Builder {
            private String extranetEndpoint; 
            private String gmtCreate; 
            private String intranetEndpoint; 
            private String location; 
            private Long ownerId; 
            private String storageACL; 
            private String storageClass; 

            private Builder() {
            } 

            private Builder(StorageInfo model) {
                this.extranetEndpoint = model.extranetEndpoint;
                this.gmtCreate = model.gmtCreate;
                this.intranetEndpoint = model.intranetEndpoint;
                this.location = model.location;
                this.ownerId = model.ownerId;
                this.storageACL = model.storageACL;
                this.storageClass = model.storageClass;
            } 

            /**
             * ExtranetEndpoint.
             */
            public Builder extranetEndpoint(String extranetEndpoint) {
                this.extranetEndpoint = extranetEndpoint;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * OwnerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * StorageACL.
             */
            public Builder storageACL(String storageACL) {
                this.storageACL = storageACL;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            public StorageInfo build() {
                return new StorageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPersonalStorageListResponseBody} extends {@link TeaModel}
     *
     * <p>GetPersonalStorageListResponseBody</p>
     */
    public static class StorageInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StorageInfo")
        private java.util.List<StorageInfo> storageInfo;

        private StorageInfoList(Builder builder) {
            this.storageInfo = builder.storageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageInfoList create() {
            return builder().build();
        }

        /**
         * @return storageInfo
         */
        public java.util.List<StorageInfo> getStorageInfo() {
            return this.storageInfo;
        }

        public static final class Builder {
            private java.util.List<StorageInfo> storageInfo; 

            private Builder() {
            } 

            private Builder(StorageInfoList model) {
                this.storageInfo = model.storageInfo;
            } 

            /**
             * StorageInfo.
             */
            public Builder storageInfo(java.util.List<StorageInfo> storageInfo) {
                this.storageInfo = storageInfo;
                return this;
            }

            public StorageInfoList build() {
                return new StorageInfoList(this);
            } 

        } 

    }
}
