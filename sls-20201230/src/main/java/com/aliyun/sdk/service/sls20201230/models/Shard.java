// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Shard} extends {@link TeaModel}
 *
 * <p>Shard</p>
 */
public class Shard extends TeaModel {
    @NameInMap("createTime")
    private Integer createTime;

    @NameInMap("exclusiveEndKey")
    private String exclusiveEndKey;

    @NameInMap("inclusiveBeginKey")
    private String inclusiveBeginKey;

    @NameInMap("shardID")
    private Integer shardID;

    @NameInMap("status")
    private String status;

    private Shard(Builder builder) {
        this.createTime = builder.createTime;
        this.exclusiveEndKey = builder.exclusiveEndKey;
        this.inclusiveBeginKey = builder.inclusiveBeginKey;
        this.shardID = builder.shardID;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Shard create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    /**
     * @return exclusiveEndKey
     */
    public String getExclusiveEndKey() {
        return this.exclusiveEndKey;
    }

    /**
     * @return inclusiveBeginKey
     */
    public String getInclusiveBeginKey() {
        return this.inclusiveBeginKey;
    }

    /**
     * @return shardID
     */
    public Integer getShardID() {
        return this.shardID;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer createTime; 
        private String exclusiveEndKey; 
        private String inclusiveBeginKey; 
        private Integer shardID; 
        private String status; 

        /**
         * createTime.
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * exclusiveEndKey.
         */
        public Builder exclusiveEndKey(String exclusiveEndKey) {
            this.exclusiveEndKey = exclusiveEndKey;
            return this;
        }

        /**
         * inclusiveBeginKey.
         */
        public Builder inclusiveBeginKey(String inclusiveBeginKey) {
            this.inclusiveBeginKey = inclusiveBeginKey;
            return this;
        }

        /**
         * shardID.
         */
        public Builder shardID(Integer shardID) {
            this.shardID = shardID;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Shard build() {
            return new Shard(this);
        } 

    } 

}
