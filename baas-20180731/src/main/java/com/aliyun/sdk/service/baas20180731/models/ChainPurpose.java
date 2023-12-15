// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChainPurpose} extends {@link TeaModel}
 *
 * <p>ChainPurpose</p>
 */
public class ChainPurpose extends TeaModel {
    @NameInMap("Extend")
    private Boolean extend;

    @NameInMap("Id")
    private String id;

    @NameInMap("Item")
    private Boolean item;

    @NameInMap("Key")
    private String key;

    @NameInMap("Name")
    private String name;

    @NameInMap("PurposeItem")
    private String purposeItem;

    @NameInMap("Status")
    private String status;

    @NameInMap("Time")
    private String time;

    private ChainPurpose(Builder builder) {
        this.extend = builder.extend;
        this.id = builder.id;
        this.item = builder.item;
        this.key = builder.key;
        this.name = builder.name;
        this.purposeItem = builder.purposeItem;
        this.status = builder.status;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChainPurpose create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return purposeItem
     */
    public String getPurposeItem() {
        return this.purposeItem;
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
        private Boolean extend; 
        private String id; 
        private Boolean item; 
        private String key; 
        private String name; 
        private String purposeItem; 
        private String status; 
        private String time; 

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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PurposeItem.
         */
        public Builder purposeItem(String purposeItem) {
            this.purposeItem = purposeItem;
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

        public ChainPurpose build() {
            return new ChainPurpose(this);
        } 

    } 

}
