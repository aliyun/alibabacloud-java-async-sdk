// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmAccessStrategyAvailableConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmAccessStrategyAvailableConfigResponseBody</p>
 */
public class DescribeGtmAccessStrategyAvailableConfigResponseBody extends TeaModel {
    @NameInMap("AddrPools")
    private AddrPools addrPools;

    @NameInMap("Lines")
    private Lines lines;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuggestSetDefaultLine")
    private Boolean suggestSetDefaultLine;

    private DescribeGtmAccessStrategyAvailableConfigResponseBody(Builder builder) {
        this.addrPools = builder.addrPools;
        this.lines = builder.lines;
        this.requestId = builder.requestId;
        this.suggestSetDefaultLine = builder.suggestSetDefaultLine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmAccessStrategyAvailableConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return addrPools
     */
    public AddrPools getAddrPools() {
        return this.addrPools;
    }

    /**
     * @return lines
     */
    public Lines getLines() {
        return this.lines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suggestSetDefaultLine
     */
    public Boolean getSuggestSetDefaultLine() {
        return this.suggestSetDefaultLine;
    }

    public static final class Builder {
        private AddrPools addrPools; 
        private Lines lines; 
        private String requestId; 
        private Boolean suggestSetDefaultLine; 

        /**
         * The address pools.
         */
        public Builder addrPools(AddrPools addrPools) {
            this.addrPools = addrPools;
            return this;
        }

        /**
         * The Domain Name System (DNS) request sources.
         */
        public Builder lines(Lines lines) {
            this.lines = lines;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the global line is recommended.
         */
        public Builder suggestSetDefaultLine(Boolean suggestSetDefaultLine) {
            this.suggestSetDefaultLine = suggestSetDefaultLine;
            return this;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBody build() {
            return new DescribeGtmAccessStrategyAvailableConfigResponseBody(this);
        } 

    } 

    public static class AddrPool extends TeaModel {
        @NameInMap("AddrPoolId")
        private String addrPoolId;

        @NameInMap("AddrPoolName")
        private String addrPoolName;

        private AddrPool(Builder builder) {
            this.addrPoolId = builder.addrPoolId;
            this.addrPoolName = builder.addrPoolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddrPool create() {
            return builder().build();
        }

        /**
         * @return addrPoolId
         */
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        /**
         * @return addrPoolName
         */
        public String getAddrPoolName() {
            return this.addrPoolName;
        }

        public static final class Builder {
            private String addrPoolId; 
            private String addrPoolName; 

            /**
             * The ID of the address pool.
             */
            public Builder addrPoolId(String addrPoolId) {
                this.addrPoolId = addrPoolId;
                return this;
            }

            /**
             * The name of the address pool.
             */
            public Builder addrPoolName(String addrPoolName) {
                this.addrPoolName = addrPoolName;
                return this;
            }

            public AddrPool build() {
                return new AddrPool(this);
            } 

        } 

    }
    public static class AddrPools extends TeaModel {
        @NameInMap("AddrPool")
        private java.util.List < AddrPool> addrPool;

        private AddrPools(Builder builder) {
            this.addrPool = builder.addrPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddrPools create() {
            return builder().build();
        }

        /**
         * @return addrPool
         */
        public java.util.List < AddrPool> getAddrPool() {
            return this.addrPool;
        }

        public static final class Builder {
            private java.util.List < AddrPool> addrPool; 

            /**
             * AddrPool.
             */
            public Builder addrPool(java.util.List < AddrPool> addrPool) {
                this.addrPool = addrPool;
                return this;
            }

            public AddrPools build() {
                return new AddrPools(this);
            } 

        } 

    }
    public static class Line extends TeaModel {
        @NameInMap("FatherCode")
        private String fatherCode;

        @NameInMap("GroupCode")
        private String groupCode;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("LineCode")
        private String lineCode;

        @NameInMap("LineName")
        private String lineName;

        @NameInMap("Status")
        private String status;

        private Line(Builder builder) {
            this.fatherCode = builder.fatherCode;
            this.groupCode = builder.groupCode;
            this.groupName = builder.groupName;
            this.lineCode = builder.lineCode;
            this.lineName = builder.lineName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Line create() {
            return builder().build();
        }

        /**
         * @return fatherCode
         */
        public String getFatherCode() {
            return this.fatherCode;
        }

        /**
         * @return groupCode
         */
        public String getGroupCode() {
            return this.groupCode;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return lineCode
         */
        public String getLineCode() {
            return this.lineCode;
        }

        /**
         * @return lineName
         */
        public String getLineName() {
            return this.lineName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String fatherCode; 
            private String groupCode; 
            private String groupName; 
            private String lineCode; 
            private String lineName; 
            private String status; 

            /**
             * The code of the parent line. No value is returned if no parent line exists.
             */
            public Builder fatherCode(String fatherCode) {
                this.fatherCode = fatherCode;
                return this;
            }

            /**
             * The group number of the DNS request source.
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * The group name of the DNS request source.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The code of the DNS request source.
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * The name of the DNS request source.
             */
            public Builder lineName(String lineName) {
                this.lineName = lineName;
                return this;
            }

            /**
             * The state of the line. Valid values:
             * <p>
             * 
             * *   **FORBIDDEN**: The line is unavailable.
             * *   **OPTIONAL**: The line is available.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Line build() {
                return new Line(this);
            } 

        } 

    }
    public static class Lines extends TeaModel {
        @NameInMap("Line")
        private java.util.List < Line> line;

        private Lines(Builder builder) {
            this.line = builder.line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lines create() {
            return builder().build();
        }

        /**
         * @return line
         */
        public java.util.List < Line> getLine() {
            return this.line;
        }

        public static final class Builder {
            private java.util.List < Line> line; 

            /**
             * Line.
             */
            public Builder line(java.util.List < Line> line) {
                this.line = line;
                return this;
            }

            public Lines build() {
                return new Lines(this);
            } 

        } 

    }
}
