// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketInventoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketInventoryResponseBody</p>
 */
public class GetBucketInventoryResponseBody extends TeaModel {
    @ParentIgnore("InventoryConfiguration")
    @NameInMap("Destination")
    private InventoryDestination destination;

    @ParentIgnore("InventoryConfiguration")
    @NameInMap("Filter")
    private InventoryFilter filter;

    @ParentIgnore("InventoryConfiguration")
    @NameInMap("Id")
    private String id;

    @ParentIgnore("InventoryConfiguration")
    @NameInMap("IncludedObjectVersions")
    private String includedObjectVersions;

    @ParentIgnore("InventoryConfiguration")
    @NameInMap("IsEnabled")
    private Boolean isEnabled;

    @ParentIgnore("InventoryConfiguration")
    @NameInMap("OptionalFields")
    private OptionalFields optionalFields;

    @ParentIgnore("InventoryConfiguration")
    @NameInMap("Schedule")
    private InventorySchedule schedule;

    private GetBucketInventoryResponseBody(Builder builder) {
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

    public static GetBucketInventoryResponseBody create() {
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
         * id
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
         * status
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        /**
         * OptionalFields.
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
        public java.util.List < InventoryOptionalField > getField() {
            return this.field;
        }

        public static final class Builder {
            private java.util.List < InventoryOptionalField > field; 

            /**
             * Field.
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
