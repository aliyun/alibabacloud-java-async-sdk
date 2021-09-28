// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketInventoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketInventoryResponseBody</p>
 */
public class GetBucketInventoryResponseBody extends TeaModel {
    @ParentIgnore("InventoryConfiguration")
    @NameInMap("Id")
    private String id;

    @ParentIgnore("InventoryConfiguration")
    @NameInMap("IsEnabled")
    private Boolean isEnabled;

    @ParentIgnore("InventoryConfiguration")
    @NameInMap("Destination")
    private InventoryDestination destination;

    @ParentIgnore("InventoryConfiguration")
    @NameInMap("Schedule")
    private InventorySchedule schedule;

    @ParentIgnore("InventoryConfiguration")
    @NameInMap("Filter")
    private InventoryFilter filter;

    @ParentIgnore("InventoryConfiguration")
    @NameInMap("IncludedObjectVersions")
    private InventoryIncludedObjectVersions includedObjectVersions;

    @ParentIgnore("InventoryConfiguration")
    @NameInMap("OptionalFields")
    private OptionalFields optionalFields;


    private GetBucketInventoryResponseBody(Builder builder) {
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

    public static GetBucketInventoryResponseBody create() {
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
    public OptionalFields optionalFields() {
        return this.optionalFields;
    }

    public static final class Builder {
        private String id; 
        private Boolean isEnabled; 
        private InventoryDestination destination; 
        private InventorySchedule schedule; 
        private InventoryFilter filter; 
        private InventoryIncludedObjectVersions includedObjectVersions; 
        private OptionalFields optionalFields; 

        /**
         * <p>id</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>status</p>
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
         * <p>OptionalFields.</p>
         */
        public Builder optionalFields(OptionalFields optionalFields) {
            this.optionalFields = optionalFields;
            return this;
        }

        public GetBucketInventoryResponseBody build() {
            return new GetBucketInventoryResponseBody(this);
        } 

    } 

    public static class OptionalFields extends TeaModel {
        @NameInMap("Field")
        private java.util.List < InventoryOptionalField > field;


        private OptionalFields(Builder builder) {
            this.field = builder.field;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionalFields create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public java.util.List < InventoryOptionalField > field() {
            return this.field;
        }

        public static final class Builder {
            private java.util.List < InventoryOptionalField > field; 

            /**
             * <p>Field.</p>
             */
            public Builder field(java.util.List < InventoryOptionalField > field) {
                this.field = field;
                return this;
            }

            public OptionalFields build() {
                return new OptionalFields(this);
            } 

        } 

    }
}
