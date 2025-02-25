// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChainPurposeInfoAli} extends {@link TeaModel}
 *
 * <p>ChainPurposeInfoAli</p>
 */
public class ChainPurposeInfoAli extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChainPurposeExtend")
    private String chainPurposeExtend;

    @com.aliyun.core.annotation.NameInMap("ChainPurposeItem")
    private String chainPurposeItem;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Purpose")
    private String purpose;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Time")
    private String time;

    private ChainPurposeInfoAli(Builder builder) {
        this.chainPurposeExtend = builder.chainPurposeExtend;
        this.chainPurposeItem = builder.chainPurposeItem;
        this.id = builder.id;
        this.key = builder.key;
        this.purpose = builder.purpose;
        this.status = builder.status;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChainPurposeInfoAli create() {
        return builder().build();
    }

    /**
     * @return chainPurposeExtend
     */
    public String getChainPurposeExtend() {
        return this.chainPurposeExtend;
    }

    /**
     * @return chainPurposeItem
     */
    public String getChainPurposeItem() {
        return this.chainPurposeItem;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return purpose
     */
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private String chainPurposeExtend; 
        private String chainPurposeItem; 
        private String id; 
        private String key; 
        private String purpose; 
        private String status; 
        private String time; 

        /**
         * ChainPurposeExtend.
         */
        public Builder chainPurposeExtend(String chainPurposeExtend) {
            this.chainPurposeExtend = chainPurposeExtend;
            return this;
        }

        /**
         * ChainPurposeItem.
         */
        public Builder chainPurposeItem(String chainPurposeItem) {
            this.chainPurposeItem = chainPurposeItem;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
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
         * Purpose.
         */
        public Builder purpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public ChainPurposeInfoAli build() {
            return new ChainPurposeInfoAli(this);
        } 

    } 

}
