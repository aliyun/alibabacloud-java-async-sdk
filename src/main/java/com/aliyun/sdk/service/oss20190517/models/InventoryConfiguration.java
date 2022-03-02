// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link InventoryConfiguration} extends {@link TeaModel}
 *
 * <p>InventoryConfiguration</p>
 */
public class InventoryConfiguration extends TeaModel {
    @NameInMap("Destination")
    private InventoryDestination destination;

    @NameInMap("Filter")
    private InventoryFilter filter;

    @NameInMap("Id")
    private String id;

    @NameInMap("IncludedObjectVersions")
    private String includedObjectVersions;

    @NameInMap("IsEnabled")
    private Boolean isEnabled;

    @NameInMap("OptionalFields")
    private OptionalFields optionalFields;

    @NameInMap("Schedule")
    private InventorySchedule schedule;

    private InventoryConfiguration(Builder builder) {
        this.destination = builder.destination;
        this.filter = builder.filter;
        this.id = builder.id;
        this.includedObjectVersions = builder.includedObjectVersions;
        this.isEnabled = builder.isEnabled;
        this.optionalFields = builder.optionalFields;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InventoryConfiguration create() {
        return builder().build();
    }

    /**
     * @return destination
     */
    public InventoryDestination getDestination() {
        return this.destination;
    }

    /**
     * @return filter
     */
    public InventoryFilter getFilter() {
        return this.filter;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return includedObjectVersions
     */
    public String getIncludedObjectVersions() {
        return this.includedObjectVersions;
    }

    /**
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * @return optionalFields
     */
    public OptionalFields getOptionalFields() {
        return this.optionalFields;
    }

    /**
     * @return schedule
     */
    public InventorySchedule getSchedule() {
        return this.schedule;
    }

    public static final class Builder {
        private InventoryDestination destination; 
        private InventoryFilter filter; 
        private String id; 
        private String includedObjectVersions; 
        private Boolean isEnabled; 
        private OptionalFields optionalFields; 
        private InventorySchedule schedule; 

        /**
         * Destination.
         */
        public Builder destination(InventoryDestination destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(InventoryFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * The specified inventory list name, which must be globally unique in the bucket
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * IncludedObjectVersions.
         */
        public Builder includedObjectVersions(String includedObjectVersions) {
            this.includedObjectVersions = includedObjectVersions;
            return this;
        }

        /**
         * IncludedObjectVersions.
         */
        public Builder includedObjectVersions(InventoryIncludedObjectVersions includedObjectVersions) {
            this.includedObjectVersions = includedObjectVersions.getValue();
            return this;
        }

        /**
         * Indicates whether the inventory function is enabled
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        /**
         * The container that stores the configuration fields included in the inventory list
         */
        public Builder optionalFields(OptionalFields optionalFields) {
            this.optionalFields = optionalFields;
            return this;
        }

        /**
         * Schedule.
         */
        public Builder schedule(InventorySchedule schedule) {
            this.schedule = schedule;
            return this;
        }

        public InventoryConfiguration build() {
            return new InventoryConfiguration(this);
        } 

    } 

    public static class OptionalFields extends TeaModel {
        @NameInMap("Field")
        private java.util.List < InventoryOptionalField > fields;

        private OptionalFields(Builder builder) {
            this.fields = builder.fields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionalFields create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.List < InventoryOptionalField > getFields() {
            return this.fields;
        }

        public static final class Builder {
            private java.util.List < InventoryOptionalField > fields; 

            /**
             * field list
             */
            public Builder fields(java.util.List < InventoryOptionalField > fields) {
                this.fields = fields;
                return this;
            }

            public OptionalFields build() {
                return new OptionalFields(this);
            } 

        } 

    }
}
