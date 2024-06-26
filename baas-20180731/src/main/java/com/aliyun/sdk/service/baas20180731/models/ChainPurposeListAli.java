// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChainPurposeListAli} extends {@link TeaModel}
 *
 * <p>ChainPurposeListAli</p>
 */
public class ChainPurposeListAli extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Extend")
    private Boolean extend;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Item")
    private Boolean item;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Purpose")
    private String purpose;

    private ChainPurposeListAli(Builder builder) {
        this.extend = builder.extend;
        this.id = builder.id;
        this.item = builder.item;
        this.key = builder.key;
        this.purpose = builder.purpose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChainPurposeListAli create() {
        return builder().build();
    }

    /**
     * @return extend
     */
    public Boolean getExtend() {
        return this.extend;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return item
     */
    public Boolean getItem() {
        return this.item;
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

    public static final class Builder {
        private Boolean extend; 
        private String id; 
        private Boolean item; 
        private String key; 
        private String purpose; 

        /**
         * Extend.
         */
        public Builder extend(Boolean extend) {
            this.extend = extend;
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
         * Item.
         */
        public Builder item(Boolean item) {
            this.item = item;
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

        public ChainPurposeListAli build() {
            return new ChainPurposeListAli(this);
        } 

    } 

}
