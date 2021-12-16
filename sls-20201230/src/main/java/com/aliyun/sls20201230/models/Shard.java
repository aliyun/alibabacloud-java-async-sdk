// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    @NameInMap("serverIp")
    private String serverIp;

    @NameInMap("shardId")
    private Integer shardId;

    @NameInMap("status")
    private String status;


    private Shard(Builder builder) {
        this.createTime = builder.createTime;
        this.exclusiveEndKey = builder.exclusiveEndKey;
        this.inclusiveBeginKey = builder.inclusiveBeginKey;
        this.serverIp = builder.serverIp;
        this.shardId = builder.shardId;
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
     * @return serverIp
     */
    public String getServerIp() {
        return this.serverIp;
    }

    /**
     * @return shardId
     */
    public Integer getShardId() {
        return this.shardId;
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
        private String serverIp; 
        private Integer shardId; 
        private String status; 

        /**
         * <p>createTime</p>
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>exclusiveEndKey</p>
         */
        public Builder exclusiveEndKey(String exclusiveEndKey) {
            this.exclusiveEndKey = exclusiveEndKey;
            return this;
        }

        /**
         * <p>inclusiveBeginKey</p>
         */
        public Builder inclusiveBeginKey(String inclusiveBeginKey) {
            this.inclusiveBeginKey = inclusiveBeginKey;
            return this;
        }

        /**
         * <p>serverIp</p>
         */
        public Builder serverIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }

        /**
         * <p>shard id</p>
         */
        public Builder shardId(Integer shardId) {
            this.shardId = shardId;
            return this;
        }

        /**
         * <p>status</p>
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
