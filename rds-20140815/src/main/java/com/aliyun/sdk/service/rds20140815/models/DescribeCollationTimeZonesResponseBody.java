// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCollationTimeZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCollationTimeZonesResponseBody</p>
 */
public class DescribeCollationTimeZonesResponseBody extends TeaModel {
    @NameInMap("CollationTimeZones")
    private CollationTimeZones collationTimeZones;

    @NameInMap("RequestId")
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

        /**
         * An array that consists of the character set collations and time zones that are available for use in ApsaraDB RDS.
         */
        public Builder collationTimeZones(CollationTimeZones collationTimeZones) {
            this.collationTimeZones = collationTimeZones;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCollationTimeZonesResponseBody build() {
            return new DescribeCollationTimeZonesResponseBody(this);
        } 

    } 

    public static class CollationTimeZone extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("StandardTimeOffset")
        private String standardTimeOffset;

        @NameInMap("TimeZone")
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

            /**
             * The description of the character set collations and time zones.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The offset of the UTC time. The offset is in the following format: (UTC+\<i>HH:mm\</i>).
             */
            public Builder standardTimeOffset(String standardTimeOffset) {
                this.standardTimeOffset = standardTimeOffset;
                return this;
            }

            /**
             * The time zone that is available for use in ApsaraDB RDS.
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
    public static class CollationTimeZones extends TeaModel {
        @NameInMap("CollationTimeZone")
        private java.util.List < CollationTimeZone> collationTimeZone;

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
        public java.util.List < CollationTimeZone> getCollationTimeZone() {
            return this.collationTimeZone;
        }

        public static final class Builder {
            private java.util.List < CollationTimeZone> collationTimeZone; 

            /**
             * CollationTimeZone.
             */
            public Builder collationTimeZone(java.util.List < CollationTimeZone> collationTimeZone) {
                this.collationTimeZone = collationTimeZone;
                return this;
            }

            public CollationTimeZones build() {
                return new CollationTimeZones(this);
            } 

        } 

    }
}
