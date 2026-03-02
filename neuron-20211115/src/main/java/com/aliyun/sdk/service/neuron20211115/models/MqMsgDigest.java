// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MqMsgDigest} extends {@link TeaModel}
 *
 * <p>MqMsgDigest</p>
 */
public class MqMsgDigest extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RetryCount")
    private Long retryCount;

    @com.aliyun.core.annotation.NameInMap("StoreSize")
    private Integer storeSize;

    @com.aliyun.core.annotation.NameInMap("StoreTime")
    private String storeTime;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private MqMsgDigest(Builder builder) {
        this.id = builder.id;
        this.retryCount = builder.retryCount;
        this.storeSize = builder.storeSize;
        this.storeTime = builder.storeTime;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MqMsgDigest create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return retryCount
     */
    public Long getRetryCount() {
        return this.retryCount;
    }

    /**
     * @return storeSize
     */
    public Integer getStoreSize() {
        return this.storeSize;
    }

    /**
     * @return storeTime
     */
    public String getStoreTime() {
        return this.storeTime;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder {
        private Long id; 
        private Long retryCount; 
        private Integer storeSize; 
        private String storeTime; 
        private String tags; 

        private Builder() {
        } 

        private Builder(MqMsgDigest model) {
            this.id = model.id;
            this.retryCount = model.retryCount;
            this.storeSize = model.storeSize;
            this.storeTime = model.storeTime;
            this.tags = model.tags;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * RetryCount.
         */
        public Builder retryCount(Long retryCount) {
            this.retryCount = retryCount;
            return this;
        }

        /**
         * StoreSize.
         */
        public Builder storeSize(Integer storeSize) {
            this.storeSize = storeSize;
            return this;
        }

        /**
         * StoreTime.
         */
        public Builder storeTime(String storeTime) {
            this.storeTime = storeTime;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        public MqMsgDigest build() {
            return new MqMsgDigest(this);
        } 

    } 

}
