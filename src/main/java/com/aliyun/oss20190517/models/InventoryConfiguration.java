// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link InventoryConfiguration} extends {@link TeaModel}
 *
 * <p>InventoryConfiguration</p>
 */
public class InventoryConfiguration extends TeaModel {
    @NameInMap("Id")
    private String id;

    @NameInMap("IsEnabled")
    private Boolean isEnabled;

    @NameInMap("Destination")
    private InventoryDestination destination;

    @NameInMap("Schedule")
    private InventorySchedule schedule;

    @NameInMap("Filter")
    private InventoryFilter filter;

    @NameInMap("IncludedObjectVersions")
    private InventoryIncludedObjectVersions includedObjectVersions;

    @NameInMap("OptionalFields")
    private java.util.List < InventoryOptionalField > optionalFields;


    private InventoryConfiguration(Builder builder) {
        this.id = builder.id;
        this.isEnabled = builder.isEnabled;
        this.destination = builder.destination;
        this.schedule = builder.schedule;
        this.filter = builder.filter;
        this.includedObjectVersions = builder.includedObjectVersions;
        this.optionalFields = builder.optionalFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InventoryConfiguration create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String id() {
        return this.id;
    }

    /**
     * @return isEnabled
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * @return destination
     */
    public InventoryDestination destination() {
        return this.destination;
    }

    /**
     * @return schedule
     */
    public InventorySchedule schedule() {
        return this.schedule;
    }

    /**
     * @return filter
     */
    public InventoryFilter filter() {
        return this.filter;
    }

    /**
     * @return includedObjectVersions
     */
    public InventoryIncludedObjectVersions includedObjectVersions() {
        return this.includedObjectVersions;
    }

    /**
     * @return optionalFields
     */
    public java.util.List < InventoryOptionalField > optionalFields() {
        return this.optionalFields;
    }

    public static final class Builder {
        private String id; 
        private Boolean isEnabled; 
        private InventoryDestination destination; 
        private InventorySchedule schedule; 
        private InventoryFilter filter; 
        private InventoryIncludedObjectVersions includedObjectVersions; 
        private java.util.List < InventoryOptionalField > optionalFields; 

        /**
         * <p>The specified inventory list name, which must be globally unique in the bucket</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Indicates whether the inventory function is enabled</p>
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        /**
         * <p>Destination.</p>
         */
        public Builder destination(InventoryDestination destination) {
            this.destination = destination;
            return this;
        }

        /**
         * <p>Schedule.</p>
         */
        public Builder schedule(InventorySchedule schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * <p>Filter.</p>
         */
        public Builder filter(InventoryFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * <p>IncludedObjectVersions.</p>
         */
        public Builder includedObjectVersions(InventoryIncludedObjectVersions includedObjectVersions) {
            this.includedObjectVersions = includedObjectVersions;
            return this;
        }

        /**
         * <p>The container that stores the configuration fields included in the inventory list</p>
         */
        public Builder optionalFields(java.util.List < InventoryOptionalField > optionalFields) {
            this.optionalFields = optionalFields;
            return this;
        }

        public InventoryConfiguration build() {
            return new InventoryConfiguration(this);
        } 

    } 

}
