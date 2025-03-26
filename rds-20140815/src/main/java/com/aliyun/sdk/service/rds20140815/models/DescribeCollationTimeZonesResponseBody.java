// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeCollationTimeZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCollationTimeZonesResponseBody</p>
 */
public class DescribeCollationTimeZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CollationTimeZones")
    private CollationTimeZones collationTimeZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCollationTimeZonesResponseBody(Builder builder) {
        this.collationTimeZones = builder.collationTimeZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCollationTimeZonesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collationTimeZones
     */
    public CollationTimeZones getCollationTimeZones() {
        return this.collationTimeZones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CollationTimeZones collationTimeZones; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCollationTimeZonesResponseBody model) {
            this.collationTimeZones = model.collationTimeZones;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of the character set collations and time zones that are available.</p>
         */
        public Builder collationTimeZones(CollationTimeZones collationTimeZones) {
            this.collationTimeZones = collationTimeZones;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EAED246-DB18-4C8D-9EB5-C319626F2A77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCollationTimeZonesResponseBody build() {
            return new DescribeCollationTimeZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCollationTimeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCollationTimeZonesResponseBody</p>
     */
    public static class CollationTimeZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("StandardTimeOffset")
        private String standardTimeOffset;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private CollationTimeZone(Builder builder) {
            this.description = builder.description;
            this.standardTimeOffset = builder.standardTimeOffset;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CollationTimeZone create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return standardTimeOffset
         */
        public String getStandardTimeOffset() {
            return this.standardTimeOffset;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String description; 
            private String standardTimeOffset; 
            private String timeZone; 

            private Builder() {
            } 

            private Builder(CollationTimeZone model) {
                this.description = model.description;
                this.standardTimeOffset = model.standardTimeOffset;
                this.timeZone = model.timeZone;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Kabul</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The offset of the UTC time. The offset is in the following format: (UTC+<em>HH:mm</em>).</p>
             * 
             * <strong>example:</strong>
             * <p>(UTC+04:30)</p>
             */
            public Builder standardTimeOffset(String standardTimeOffset) {
                this.standardTimeOffset = standardTimeOffset;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Afghanistan Standard Time</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public CollationTimeZone build() {
                return new CollationTimeZone(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCollationTimeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCollationTimeZonesResponseBody</p>
     */
    public static class CollationTimeZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CollationTimeZone")
        private java.util.List<CollationTimeZone> collationTimeZone;

        private CollationTimeZones(Builder builder) {
            this.collationTimeZone = builder.collationTimeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CollationTimeZones create() {
            return builder().build();
        }

        /**
         * @return collationTimeZone
         */
        public java.util.List<CollationTimeZone> getCollationTimeZone() {
            return this.collationTimeZone;
        }

        public static final class Builder {
            private java.util.List<CollationTimeZone> collationTimeZone; 

            private Builder() {
            } 

            private Builder(CollationTimeZones model) {
                this.collationTimeZone = model.collationTimeZone;
            } 

            /**
             * CollationTimeZone.
             */
            public Builder collationTimeZone(java.util.List<CollationTimeZone> collationTimeZone) {
                this.collationTimeZone = collationTimeZone;
                return this;
            }

            public CollationTimeZones build() {
                return new CollationTimeZones(this);
            } 

        } 

    }
}
