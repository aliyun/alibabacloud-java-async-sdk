// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LocationStorageRankDTO} extends {@link TeaModel}
 *
 * <p>LocationStorageRankDTO</p>
 */
public class LocationStorageRankDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileCnt")
    private Long fileCnt;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("Storage")
    private Long storage;

    private LocationStorageRankDTO(Builder builder) {
        this.fileCnt = builder.fileCnt;
        this.location = builder.location;
        this.storage = builder.storage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LocationStorageRankDTO create() {
        return builder().build();
    }

    /**
     * @return fileCnt
     */
    public Long getFileCnt() {
        return this.fileCnt;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return storage
     */
    public Long getStorage() {
        return this.storage;
    }

    public static final class Builder {
        private Long fileCnt; 
        private String location; 
        private Long storage; 

        /**
         * FileCnt.
         */
        public Builder fileCnt(Long fileCnt) {
            this.fileCnt = fileCnt;
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
         * Storage.
         */
        public Builder storage(Long storage) {
            this.storage = storage;
            return this;
        }

        public LocationStorageRankDTO build() {
            return new LocationStorageRankDTO(this);
        } 

    } 

}
