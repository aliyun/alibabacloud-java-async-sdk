// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeStoragePoolInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStoragePoolInfoResponseBody</p>
 */
public class DescribeStoragePoolInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeStoragePoolInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStoragePoolInfoResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeStoragePoolInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeStoragePoolInfoResponseBody build() {
            return new DescribeStoragePoolInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStoragePoolInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStoragePoolInfoResponseBody</p>
     */
    public static class StoragePools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Class")
        private String _class;

        @com.aliyun.core.annotation.NameInMap("DnIdList")
        private java.util.List<String> dnIdList;

        @com.aliyun.core.annotation.NameInMap("DnIdString")
        private String dnIdString;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IdleDNIdList")
        private java.util.List<String> idleDNIdList;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UnDeletableDNId")
        private String unDeletableDNId;

        private StoragePools(Builder builder) {
            this._class = builder._class;
            this.dnIdList = builder.dnIdList;
            this.dnIdString = builder.dnIdString;
            this.extra = builder.extra;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.idleDNIdList = builder.idleDNIdList;
            this.name = builder.name;
            this.unDeletableDNId = builder.unDeletableDNId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoragePools create() {
            return builder().build();
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return dnIdList
         */
        public java.util.List<String> getDnIdList() {
            return this.dnIdList;
        }

        /**
         * @return dnIdString
         */
        public String getDnIdString() {
            return this.dnIdString;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return idleDNIdList
         */
        public java.util.List<String> getIdleDNIdList() {
            return this.idleDNIdList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unDeletableDNId
         */
        public String getUnDeletableDNId() {
            return this.unDeletableDNId;
        }

        public static final class Builder {
            private String _class; 
            private java.util.List<String> dnIdList; 
            private String dnIdString; 
            private String extra; 
            private String gmtCreated; 
            private String gmtModified; 
            private java.util.List<String> idleDNIdList; 
            private String name; 
            private String unDeletableDNId; 

            private Builder() {
            } 

            private Builder(StoragePools model) {
                this._class = model._class;
                this.dnIdList = model.dnIdList;
                this.dnIdString = model.dnIdString;
                this.extra = model.extra;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.idleDNIdList = model.idleDNIdList;
                this.name = model.name;
                this.unDeletableDNId = model.unDeletableDNId;
            } 

            /**
             * Class.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * DnIdList.
             */
            public Builder dnIdList(java.util.List<String> dnIdList) {
                this.dnIdList = dnIdList;
                return this;
            }

            /**
             * <p>DN id</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-xdb-s-pxcshr****rh7fn2654fc</p>
             */
            public Builder dnIdString(String dnIdString) {
                this.dnIdString = dnIdString;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
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
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * IdleDNIdList.
             */
            public Builder idleDNIdList(java.util.List<String> idleDNIdList) {
                this.idleDNIdList = idleDNIdList;
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
             * UnDeletableDNId.
             */
            public Builder unDeletableDNId(String unDeletableDNId) {
                this.unDeletableDNId = unDeletableDNId;
                return this;
            }

            public StoragePools build() {
                return new StoragePools(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeStoragePoolInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStoragePoolInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StoragePools")
        private java.util.List<StoragePools> storagePools;

        private Data(Builder builder) {
            this.storagePools = builder.storagePools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return storagePools
         */
        public java.util.List<StoragePools> getStoragePools() {
            return this.storagePools;
        }

        public static final class Builder {
            private java.util.List<StoragePools> storagePools; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.storagePools = model.storagePools;
            } 

            /**
             * StoragePools.
             */
            public Builder storagePools(java.util.List<StoragePools> storagePools) {
                this.storagePools = storagePools;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
