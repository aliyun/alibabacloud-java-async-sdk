// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link ResourceUsage} extends {@link TeaModel}
 *
 * <p>ResourceUsage</p>
 */
public class ResourceUsage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("granularity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String granularity;

    @com.aliyun.core.annotation.NameInMap("groupBy")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> groupBy;

    @com.aliyun.core.annotation.NameInMap("groups")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private ResourceUsage(Builder builder) {
        this.endTime = builder.endTime;
        this.granularity = builder.granularity;
        this.groupBy = builder.groupBy;
        this.groups = builder.groups;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceUsage create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return groupBy
     */
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String endTime; 
        private String granularity; 
        private java.util.List<String> groupBy; 
        private java.util.List<Groups> groups; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(ResourceUsage model) {
            this.endTime = model.endTime;
            this.granularity = model.granularity;
            this.groupBy = model.groupBy;
            this.groups = model.groups;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The end time of the requested interval, exclusive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T02:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The aggregation granularity used for this query. Valid values: All, Hour, and Day.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>The grouping keys used for this query. This is an empty array if no grouping is applied.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;teamID&quot;]</p>
         */
        public Builder groupBy(java.util.List<String> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>The usage for each group. If no grouping is applied, the usage is aggregated across the entire query range. An empty array is returned if no matching groups are found.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;dimensions&quot;:{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;},&quot;items&quot;:[{&quot;usageName&quot;:&quot;activeVCPU&quot;,&quot;unit&quot;:&quot;CoreSecond&quot;,&quot;total&quot;:5400,&quot;buckets&quot;:[{&quot;startTime&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;quantity&quot;:3600},{&quot;startTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T02:00:00Z&quot;,&quot;quantity&quot;:1800}]}]}]</p>
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The start time of the requested interval, inclusive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public ResourceUsage build() {
            return new ResourceUsage(this);
        } 

    } 

    /**
     * 
     * {@link ResourceUsage} extends {@link TeaModel}
     *
     * <p>ResourceUsage</p>
     */
    public static class Buckets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("quantity")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double quantity;

        @com.aliyun.core.annotation.NameInMap("startTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String startTime;

        private Buckets(Builder builder) {
            this.endTime = builder.endTime;
            this.quantity = builder.quantity;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Buckets create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return quantity
         */
        public Double getQuantity() {
            return this.quantity;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private Double quantity; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Buckets model) {
                this.endTime = model.endTime;
                this.quantity = model.quantity;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end time of the usage statistics for this bucket, exclusive.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-05T01:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The accumulated usage during this time bucket. The unit is specified in the unit field.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder quantity(Double quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>The start time of the usage statistics for this bucket, inclusive.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-05T00:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Buckets build() {
                return new Buckets(this);
            } 

        } 

    }
    /**
     * 
     * {@link ResourceUsage} extends {@link TeaModel}
     *
     * <p>ResourceUsage</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("buckets")
        private java.util.List<Buckets> buckets;

        @com.aliyun.core.annotation.NameInMap("total")
        private Double total;

        @com.aliyun.core.annotation.NameInMap("unit")
        @com.aliyun.core.annotation.Validation(required = true)
        private String unit;

        @com.aliyun.core.annotation.NameInMap("usageName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String usageName;

        private Items(Builder builder) {
            this.buckets = builder.buckets;
            this.total = builder.total;
            this.unit = builder.unit;
            this.usageName = builder.usageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return buckets
         */
        public java.util.List<Buckets> getBuckets() {
            return this.buckets;
        }

        /**
         * @return total
         */
        public Double getTotal() {
            return this.total;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return usageName
         */
        public String getUsageName() {
            return this.usageName;
        }

        public static final class Builder {
            private java.util.List<Buckets> buckets; 
            private Double total; 
            private String unit; 
            private String usageName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.buckets = model.buckets;
                this.total = model.total;
                this.unit = model.unit;
                this.usageName = model.usageName;
            } 

            /**
             * <p>The hourly or daily time buckets with usage data, returned in chronological order. An empty array is returned if no buckets are available. This field is omitted if the granularity is All.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;startTime&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;quantity&quot;:3600},{&quot;startTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T02:00:00Z&quot;,&quot;quantity&quot;:1800}]</p>
             */
            public Builder buckets(java.util.List<Buckets> buckets) {
                this.buckets = buckets;
                return this;
            }

            /**
             * <p>The accumulated usage for the entire query interval. This field is omitted if no accumulated value is available. A value of 0 indicates that the accumulated usage is zero.</p>
             * 
             * <strong>example:</strong>
             * <p>5400</p>
             */
            public Builder total(Double total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The unit of usage. The unit is CoreSecond for CPU, and GiBSecond for memory and disks.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CoreSecond</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The name of the usage item specified in the request.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>activeVCPU</p>
             */
            public Builder usageName(String usageName) {
                this.usageName = usageName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ResourceUsage} extends {@link TeaModel}
     *
     * <p>ResourceUsage</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dimensions")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.Map<String, String> dimensions;

        @com.aliyun.core.annotation.NameInMap("items")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Items> items;

        private Groups(Builder builder) {
            this.dimensions = builder.dimensions;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return dimensions
         */
        public java.util.Map<String, String> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.Map<String, String> dimensions; 
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.dimensions = model.dimensions;
                this.items = model.items;
            } 

            /**
             * <p>The team, template, snapshot, or sandbox version corresponding to the usage in this group.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;}</p>
             */
            public Builder dimensions(java.util.Map<String, String> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The query results for each requested usage item in this group.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;usageName&quot;:&quot;activeVCPU&quot;,&quot;unit&quot;:&quot;CoreSecond&quot;,&quot;total&quot;:5400,&quot;buckets&quot;:[{&quot;startTime&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;quantity&quot;:3600},{&quot;startTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T02:00:00Z&quot;,&quot;quantity&quot;:1800}]}]</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
