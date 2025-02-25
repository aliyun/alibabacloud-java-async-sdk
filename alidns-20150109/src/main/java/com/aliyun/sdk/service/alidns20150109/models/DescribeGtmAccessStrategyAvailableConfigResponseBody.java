// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeGtmAccessStrategyAvailableConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmAccessStrategyAvailableConfigResponseBody</p>
 */
public class DescribeGtmAccessStrategyAvailableConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddrPools")
    private AddrPools addrPools;

    @com.aliyun.core.annotation.NameInMap("Lines")
    private Lines lines;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuggestSetDefaultLine")
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
         * <p>The address pools.</p>
         */
        public Builder addrPools(AddrPools addrPools) {
            this.addrPools = addrPools;
            return this;
        }

        /**
         * <p>The Domain Name System (DNS) request sources.</p>
         */
        public Builder lines(Lines lines) {
            this.lines = lines;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C2851BA9-CE56-49AF-8D12-4FC6A49EE688</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the global line is recommended.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder suggestSetDefaultLine(Boolean suggestSetDefaultLine) {
            this.suggestSetDefaultLine = suggestSetDefaultLine;
            return this;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBody build() {
            return new DescribeGtmAccessStrategyAvailableConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGtmAccessStrategyAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmAccessStrategyAvailableConfigResponseBody</p>
     */
    public static class AddrPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrPoolId")
        private String addrPoolId;

        @com.aliyun.core.annotation.NameInMap("AddrPoolName")
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
             * <p>The ID of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>hra0ix</p>
             */
            public Builder addrPoolId(String addrPoolId) {
                this.addrPoolId = addrPoolId;
                return this;
            }

            /**
             * <p>The name of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link DescribeGtmAccessStrategyAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmAccessStrategyAvailableConfigResponseBody</p>
     */
    public static class AddrPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrPool")
        private java.util.List<AddrPool> addrPool;

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
        public java.util.List<AddrPool> getAddrPool() {
            return this.addrPool;
        }

        public static final class Builder {
            private java.util.List<AddrPool> addrPool; 

            /**
             * AddrPool.
             */
            public Builder addrPool(java.util.List<AddrPool> addrPool) {
                this.addrPool = addrPool;
                return this;
            }

            public AddrPools build() {
                return new AddrPools(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGtmAccessStrategyAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmAccessStrategyAvailableConfigResponseBody</p>
     */
    public static class Line extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FatherCode")
        private String fatherCode;

        @com.aliyun.core.annotation.NameInMap("GroupCode")
        private String groupCode;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("LineCode")
        private String lineCode;

        @com.aliyun.core.annotation.NameInMap("LineName")
        private String lineName;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The code of the parent line. No value is returned if no parent line exists.</p>
             * 
             * <strong>example:</strong>
             * <p>telecom</p>
             */
            public Builder fatherCode(String fatherCode) {
                this.fatherCode = fatherCode;
                return this;
            }

            /**
             * <p>The group number of the DNS request source.</p>
             * 
             * <strong>example:</strong>
             * <p>ISP</p>
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * <p>The group name of the DNS request source.</p>
             * 
             * <strong>example:</strong>
             * <p>Mainland China</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The code of the DNS request source.</p>
             * 
             * <strong>example:</strong>
             * <p>cn_telecom_hubei</p>
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * <p>The name of the DNS request source.</p>
             * 
             * <strong>example:</strong>
             * <p>South China</p>
             */
            public Builder lineName(String lineName) {
                this.lineName = lineName;
                return this;
            }

            /**
             * <p>The state of the line. Valid values:</p>
             * <ul>
             * <li><strong>FORBIDDEN</strong>: The line is unavailable.</li>
             * <li><strong>OPTIONAL</strong>: The line is available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FORBIDDEN</p>
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
    /**
     * 
     * {@link DescribeGtmAccessStrategyAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmAccessStrategyAvailableConfigResponseBody</p>
     */
    public static class Lines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Line")
        private java.util.List<Line> line;

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
        public java.util.List<Line> getLine() {
            return this.line;
        }

        public static final class Builder {
            private java.util.List<Line> line; 

            /**
             * Line.
             */
            public Builder line(java.util.List<Line> line) {
                this.line = line;
                return this;
            }

            public Lines build() {
                return new Lines(this);
            } 

        } 

    }
}
