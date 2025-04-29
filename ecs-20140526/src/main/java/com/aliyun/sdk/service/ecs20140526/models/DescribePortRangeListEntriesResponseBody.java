// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribePortRangeListEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortRangeListEntriesResponseBody</p>
 */
public class DescribePortRangeListEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entries")
    private java.util.List<Entries> entries;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePortRangeListEntriesResponseBody(Builder builder) {
        this.entries = builder.entries;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortRangeListEntriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entries
     */
    public java.util.List<Entries> getEntries() {
        return this.entries;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Entries> entries; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePortRangeListEntriesResponseBody model) {
            this.entries = model.entries;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Port list entries.</p>
         */
        public Builder entries(java.util.List<Entries> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>882304EC-5CE2-5860-98ED-3FA1D8D74A0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortRangeListEntriesResponseBody build() {
            return new DescribePortRangeListEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePortRangeListEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortRangeListEntriesResponseBody</p>
     */
    public static class Entries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        private Entries(Builder builder) {
            this.description = builder.description;
            this.portRange = builder.portRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entries create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        public static final class Builder {
            private String description; 
            private String portRange; 

            private Builder() {
            } 

            private Builder(Entries model) {
                this.description = model.description;
                this.portRange = model.portRange;
            } 

            /**
             * <p>The description of the port range.</p>
             * 
             * <strong>example:</strong>
             * <p>Description information of PortRangeList</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The port range.</p>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            public Entries build() {
                return new Entries(this);
            } 

        } 

    }
}
