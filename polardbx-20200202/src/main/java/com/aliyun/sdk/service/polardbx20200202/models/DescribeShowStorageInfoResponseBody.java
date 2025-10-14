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
 * {@link DescribeShowStorageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeShowStorageInfoResponseBody</p>
 */
public class DescribeShowStorageInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeShowStorageInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShowStorageInfoResponseBody create() {
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

        private Builder(DescribeShowStorageInfoResponseBody model) {
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

        public DescribeShowStorageInfoResponseBody build() {
            return new DescribeShowStorageInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeShowStorageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShowStorageInfoResponseBody</p>
     */
    public static class StorageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Class")
        private String _class;

        @com.aliyun.core.annotation.NameInMap("DbCount")
        private Long dbCount;

        @com.aliyun.core.annotation.NameInMap("Deletable")
        private Boolean deletable;

        @com.aliyun.core.annotation.NameInMap("GroupCount")
        private Long groupCount;

        @com.aliyun.core.annotation.NameInMap("InstKind")
        private String instKind;

        @com.aliyun.core.annotation.NameInMap("IsHealthy")
        private Boolean isHealthy;

        @com.aliyun.core.annotation.NameInMap("LeaderNode")
        private String leaderNode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("StorageInstName")
        private String storageInstName;

        private StorageInfos(Builder builder) {
            this._class = builder._class;
            this.dbCount = builder.dbCount;
            this.deletable = builder.deletable;
            this.groupCount = builder.groupCount;
            this.instKind = builder.instKind;
            this.isHealthy = builder.isHealthy;
            this.leaderNode = builder.leaderNode;
            this.status = builder.status;
            this.storageInstName = builder.storageInstName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageInfos create() {
            return builder().build();
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return dbCount
         */
        public Long getDbCount() {
            return this.dbCount;
        }

        /**
         * @return deletable
         */
        public Boolean getDeletable() {
            return this.deletable;
        }

        /**
         * @return groupCount
         */
        public Long getGroupCount() {
            return this.groupCount;
        }

        /**
         * @return instKind
         */
        public String getInstKind() {
            return this.instKind;
        }

        /**
         * @return isHealthy
         */
        public Boolean getIsHealthy() {
            return this.isHealthy;
        }

        /**
         * @return leaderNode
         */
        public String getLeaderNode() {
            return this.leaderNode;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return storageInstName
         */
        public String getStorageInstName() {
            return this.storageInstName;
        }

        public static final class Builder {
            private String _class; 
            private Long dbCount; 
            private Boolean deletable; 
            private Long groupCount; 
            private String instKind; 
            private Boolean isHealthy; 
            private String leaderNode; 
            private Long status; 
            private String storageInstName; 

            private Builder() {
            } 

            private Builder(StorageInfos model) {
                this._class = model._class;
                this.dbCount = model.dbCount;
                this.deletable = model.deletable;
                this.groupCount = model.groupCount;
                this.instKind = model.instKind;
                this.isHealthy = model.isHealthy;
                this.leaderNode = model.leaderNode;
                this.status = model.status;
                this.storageInstName = model.storageInstName;
            } 

            /**
             * Class.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * DbCount.
             */
            public Builder dbCount(Long dbCount) {
                this.dbCount = dbCount;
                return this;
            }

            /**
             * Deletable.
             */
            public Builder deletable(Boolean deletable) {
                this.deletable = deletable;
                return this;
            }

            /**
             * GroupCount.
             */
            public Builder groupCount(Long groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * InstKind.
             */
            public Builder instKind(String instKind) {
                this.instKind = instKind;
                return this;
            }

            /**
             * IsHealthy.
             */
            public Builder isHealthy(Boolean isHealthy) {
                this.isHealthy = isHealthy;
                return this;
            }

            /**
             * LeaderNode.
             */
            public Builder leaderNode(String leaderNode) {
                this.leaderNode = leaderNode;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * StorageInstName.
             */
            public Builder storageInstName(String storageInstName) {
                this.storageInstName = storageInstName;
                return this;
            }

            public StorageInfos build() {
                return new StorageInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeShowStorageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShowStorageInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StorageInfos")
        private java.util.List<StorageInfos> storageInfos;

        private Data(Builder builder) {
            this.storageInfos = builder.storageInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return storageInfos
         */
        public java.util.List<StorageInfos> getStorageInfos() {
            return this.storageInfos;
        }

        public static final class Builder {
            private java.util.List<StorageInfos> storageInfos; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.storageInfos = model.storageInfos;
            } 

            /**
             * StorageInfos.
             */
            public Builder storageInfos(java.util.List<StorageInfos> storageInfos) {
                this.storageInfos = storageInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
