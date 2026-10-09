// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link GetSupabaseProjectSpecResponseBody} extends {@link TeaModel}
 *
 * <p>GetSupabaseProjectSpecResponseBody</p>
 */
public class GetSupabaseProjectSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ZoneIds")
    private java.util.List<String> zoneIds;

    private GetSupabaseProjectSpecResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupabaseProjectSpecResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return zoneIds
     */
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String requestId; 
        private java.util.List<String> zoneIds; 

        private Builder() {
        } 

        private Builder(GetSupabaseProjectSpecResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
            this.zoneIds = model.zoneIds;
        } 

        /**
         * <p>The list of Supabase project specifications.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of zone IDs that support creating Supabase projects.</p>
         */
        public Builder zoneIds(java.util.List<String> zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }

        public GetSupabaseProjectSpecResponseBody build() {
            return new GetSupabaseProjectSpecResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSupabaseProjectSpecResponseBody} extends {@link TeaModel}
     *
     * <p>GetSupabaseProjectSpecResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Free")
        private Boolean free;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Visible")
        private Boolean visible;

        private Items(Builder builder) {
            this.free = builder.free;
            this.spec = builder.spec;
            this.visible = builder.visible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return free
         */
        public Boolean getFree() {
            return this.free;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return visible
         */
        public Boolean getVisible() {
            return this.visible;
        }

        public static final class Builder {
            private Boolean free; 
            private String spec; 
            private Boolean visible; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.free = model.free;
                this.spec = model.spec;
                this.visible = model.visible;
            } 

            /**
             * <p>Indicates whether the specification is free.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder free(Boolean free) {
                this.free = free;
                return this;
            }

            /**
             * <p>The specification code.</p>
             * 
             * <strong>example:</strong>
             * <p>2C4G</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>Indicates whether the specification is visible.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
