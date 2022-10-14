// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StorageRankDTO} extends {@link TeaModel}
 *
 * <p>StorageRankDTO</p>
 */
public class StorageRankDTO extends TeaModel {
    @NameInMap("dbStorageRank")
    private java.util.List < DbStorageRank > dbStorageRank;

    @NameInMap("smallFileCntRank")
    private java.util.List < SmallFileCntRank > smallFileCntRank;

    @NameInMap("tableStorageRank")
    private java.util.List < TableStorageRank > tableStorageRank;

    private StorageRankDTO(Builder builder) {
        this.dbStorageRank = builder.dbStorageRank;
        this.smallFileCntRank = builder.smallFileCntRank;
        this.tableStorageRank = builder.tableStorageRank;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StorageRankDTO create() {
        return builder().build();
    }

    /**
     * @return dbStorageRank
     */
    public java.util.List < DbStorageRank > getDbStorageRank() {
        return this.dbStorageRank;
    }

    /**
     * @return smallFileCntRank
     */
    public java.util.List < SmallFileCntRank > getSmallFileCntRank() {
        return this.smallFileCntRank;
    }

    /**
     * @return tableStorageRank
     */
    public java.util.List < TableStorageRank > getTableStorageRank() {
        return this.tableStorageRank;
    }

    public static final class Builder {
        private java.util.List < DbStorageRank > dbStorageRank; 
        private java.util.List < SmallFileCntRank > smallFileCntRank; 
        private java.util.List < TableStorageRank > tableStorageRank; 

        /**
         * 库存储排名
         */
        public Builder dbStorageRank(java.util.List < DbStorageRank > dbStorageRank) {
            this.dbStorageRank = dbStorageRank;
            return this;
        }

        /**
         * 小文件数量排名
         */
        public Builder smallFileCntRank(java.util.List < SmallFileCntRank > smallFileCntRank) {
            this.smallFileCntRank = smallFileCntRank;
            return this;
        }

        /**
         * 表存储排名
         */
        public Builder tableStorageRank(java.util.List < TableStorageRank > tableStorageRank) {
            this.tableStorageRank = tableStorageRank;
            return this;
        }

        public StorageRankDTO build() {
            return new StorageRankDTO(this);
        } 

    } 

}
