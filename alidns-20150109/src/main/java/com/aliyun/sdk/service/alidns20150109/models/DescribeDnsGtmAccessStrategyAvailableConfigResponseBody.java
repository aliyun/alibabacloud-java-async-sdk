// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAccessStrategyAvailableConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmAccessStrategyAvailableConfigResponseBody</p>
 */
public class DescribeDnsGtmAccessStrategyAvailableConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainAddrPools")
    private DomainAddrPools domainAddrPools;

    @com.aliyun.core.annotation.NameInMap("Ipv4AddrPools")
    private Ipv4AddrPools ipv4AddrPools;

    @com.aliyun.core.annotation.NameInMap("Ipv6AddrPools")
    private Ipv6AddrPools ipv6AddrPools;

    @com.aliyun.core.annotation.NameInMap("Lines")
    private Lines lines;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SelectedDomainLines")
    private SelectedDomainLines selectedDomainLines;

    @com.aliyun.core.annotation.NameInMap("SelectedIpv4Lines")
    private SelectedIpv4Lines selectedIpv4Lines;

    @com.aliyun.core.annotation.NameInMap("SelectedIpv6Lines")
    private SelectedIpv6Lines selectedIpv6Lines;

    @com.aliyun.core.annotation.NameInMap("SuggestSetDefaultLine")
    private Boolean suggestSetDefaultLine;

    private DescribeDnsGtmAccessStrategyAvailableConfigResponseBody(Builder builder) {
        this.domainAddrPools = builder.domainAddrPools;
        this.ipv4AddrPools = builder.ipv4AddrPools;
        this.ipv6AddrPools = builder.ipv6AddrPools;
        this.lines = builder.lines;
        this.requestId = builder.requestId;
        this.selectedDomainLines = builder.selectedDomainLines;
        this.selectedIpv4Lines = builder.selectedIpv4Lines;
        this.selectedIpv6Lines = builder.selectedIpv6Lines;
        this.suggestSetDefaultLine = builder.suggestSetDefaultLine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainAddrPools
     */
    public DomainAddrPools getDomainAddrPools() {
        return this.domainAddrPools;
    }

    /**
     * @return ipv4AddrPools
     */
    public Ipv4AddrPools getIpv4AddrPools() {
        return this.ipv4AddrPools;
    }

    /**
     * @return ipv6AddrPools
     */
    public Ipv6AddrPools getIpv6AddrPools() {
        return this.ipv6AddrPools;
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
     * @return selectedDomainLines
     */
    public SelectedDomainLines getSelectedDomainLines() {
        return this.selectedDomainLines;
    }

    /**
     * @return selectedIpv4Lines
     */
    public SelectedIpv4Lines getSelectedIpv4Lines() {
        return this.selectedIpv4Lines;
    }

    /**
     * @return selectedIpv6Lines
     */
    public SelectedIpv6Lines getSelectedIpv6Lines() {
        return this.selectedIpv6Lines;
    }

    /**
     * @return suggestSetDefaultLine
     */
    public Boolean getSuggestSetDefaultLine() {
        return this.suggestSetDefaultLine;
    }

    public static final class Builder {
        private DomainAddrPools domainAddrPools; 
        private Ipv4AddrPools ipv4AddrPools; 
        private Ipv6AddrPools ipv6AddrPools; 
        private Lines lines; 
        private String requestId; 
        private SelectedDomainLines selectedDomainLines; 
        private SelectedIpv4Lines selectedIpv4Lines; 
        private SelectedIpv6Lines selectedIpv6Lines; 
        private Boolean suggestSetDefaultLine; 

        /**
         * The available address pools of the domain name type.
         */
        public Builder domainAddrPools(DomainAddrPools domainAddrPools) {
            this.domainAddrPools = domainAddrPools;
            return this;
        }

        /**
         * The available address pools of the IPv4 type.
         */
        public Builder ipv4AddrPools(Ipv4AddrPools ipv4AddrPools) {
            this.ipv4AddrPools = ipv4AddrPools;
            return this;
        }

        /**
         * The available address pools of the IPv6 type.
         */
        public Builder ipv6AddrPools(Ipv6AddrPools ipv6AddrPools) {
            this.ipv6AddrPools = ipv6AddrPools;
            return this;
        }

        /**
         * The source regions.
         */
        public Builder lines(Lines lines) {
            this.lines = lines;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SelectedDomainLines.
         */
        public Builder selectedDomainLines(SelectedDomainLines selectedDomainLines) {
            this.selectedDomainLines = selectedDomainLines;
            return this;
        }

        /**
         * SelectedIpv4Lines.
         */
        public Builder selectedIpv4Lines(SelectedIpv4Lines selectedIpv4Lines) {
            this.selectedIpv4Lines = selectedIpv4Lines;
            return this;
        }

        /**
         * SelectedIpv6Lines.
         */
        public Builder selectedIpv6Lines(SelectedIpv6Lines selectedIpv6Lines) {
            this.selectedIpv6Lines = selectedIpv6Lines;
            return this;
        }

        /**
         * Indicates whether we recommend that you set the source region to global.
         */
        public Builder suggestSetDefaultLine(Boolean suggestSetDefaultLine) {
            this.suggestSetDefaultLine = suggestSetDefaultLine;
            return this;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody build() {
            return new DescribeDnsGtmAccessStrategyAvailableConfigResponseBody(this);
        } 

    } 

    public static class DomainAddrPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrCount")
        private Integer addrCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DomainAddrPool(Builder builder) {
            this.addrCount = builder.addrCount;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainAddrPool create() {
            return builder().build();
        }

        /**
         * @return addrCount
         */
        public Integer getAddrCount() {
            return this.addrCount;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer addrCount; 
            private String id; 
            private String name; 

            /**
             * The number of addresses in the address pool.
             */
            public Builder addrCount(Integer addrCount) {
                this.addrCount = addrCount;
                return this;
            }

            /**
             * The ID of the address pool.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the address pool.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DomainAddrPool build() {
                return new DomainAddrPool(this);
            } 

        } 

    }
    public static class DomainAddrPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainAddrPool")
        private java.util.List < DomainAddrPool> domainAddrPool;

        private DomainAddrPools(Builder builder) {
            this.domainAddrPool = builder.domainAddrPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainAddrPools create() {
            return builder().build();
        }

        /**
         * @return domainAddrPool
         */
        public java.util.List < DomainAddrPool> getDomainAddrPool() {
            return this.domainAddrPool;
        }

        public static final class Builder {
            private java.util.List < DomainAddrPool> domainAddrPool; 

            /**
             * DomainAddrPool.
             */
            public Builder domainAddrPool(java.util.List < DomainAddrPool> domainAddrPool) {
                this.domainAddrPool = domainAddrPool;
                return this;
            }

            public DomainAddrPools build() {
                return new DomainAddrPools(this);
            } 

        } 

    }
    public static class Ipv4AddrPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrCount")
        private Integer addrCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Ipv4AddrPool(Builder builder) {
            this.addrCount = builder.addrCount;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4AddrPool create() {
            return builder().build();
        }

        /**
         * @return addrCount
         */
        public Integer getAddrCount() {
            return this.addrCount;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer addrCount; 
            private String id; 
            private String name; 

            /**
             * The number of addresses in the address pool.
             */
            public Builder addrCount(Integer addrCount) {
                this.addrCount = addrCount;
                return this;
            }

            /**
             * The ID of the address pool.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the address pool.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Ipv4AddrPool build() {
                return new Ipv4AddrPool(this);
            } 

        } 

    }
    public static class Ipv4AddrPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4AddrPool")
        private java.util.List < Ipv4AddrPool> ipv4AddrPool;

        private Ipv4AddrPools(Builder builder) {
            this.ipv4AddrPool = builder.ipv4AddrPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4AddrPools create() {
            return builder().build();
        }

        /**
         * @return ipv4AddrPool
         */
        public java.util.List < Ipv4AddrPool> getIpv4AddrPool() {
            return this.ipv4AddrPool;
        }

        public static final class Builder {
            private java.util.List < Ipv4AddrPool> ipv4AddrPool; 

            /**
             * Ipv4AddrPool.
             */
            public Builder ipv4AddrPool(java.util.List < Ipv4AddrPool> ipv4AddrPool) {
                this.ipv4AddrPool = ipv4AddrPool;
                return this;
            }

            public Ipv4AddrPools build() {
                return new Ipv4AddrPools(this);
            } 

        } 

    }
    public static class Ipv6AddrPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrCount")
        private Integer addrCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Ipv6AddrPool(Builder builder) {
            this.addrCount = builder.addrCount;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6AddrPool create() {
            return builder().build();
        }

        /**
         * @return addrCount
         */
        public Integer getAddrCount() {
            return this.addrCount;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer addrCount; 
            private String id; 
            private String name; 

            /**
             * The number of addresses in the address pool.
             */
            public Builder addrCount(Integer addrCount) {
                this.addrCount = addrCount;
                return this;
            }

            /**
             * The ID of the address pool.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the address pool.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Ipv6AddrPool build() {
                return new Ipv6AddrPool(this);
            } 

        } 

    }
    public static class Ipv6AddrPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6AddrPool")
        private java.util.List < Ipv6AddrPool> ipv6AddrPool;

        private Ipv6AddrPools(Builder builder) {
            this.ipv6AddrPool = builder.ipv6AddrPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6AddrPools create() {
            return builder().build();
        }

        /**
         * @return ipv6AddrPool
         */
        public java.util.List < Ipv6AddrPool> getIpv6AddrPool() {
            return this.ipv6AddrPool;
        }

        public static final class Builder {
            private java.util.List < Ipv6AddrPool> ipv6AddrPool; 

            /**
             * Ipv6AddrPool.
             */
            public Builder ipv6AddrPool(java.util.List < Ipv6AddrPool> ipv6AddrPool) {
                this.ipv6AddrPool = ipv6AddrPool;
                return this;
            }

            public Ipv6AddrPools build() {
                return new Ipv6AddrPools(this);
            } 

        } 

    }
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

        private Line(Builder builder) {
            this.fatherCode = builder.fatherCode;
            this.groupCode = builder.groupCode;
            this.groupName = builder.groupName;
            this.lineCode = builder.lineCode;
            this.lineName = builder.lineName;
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

        public static final class Builder {
            private String fatherCode; 
            private String groupCode; 
            private String groupName; 
            private String lineCode; 
            private String lineName; 

            /**
             * The parent line code of the source region. Leave it blank if no parent line exists.
             */
            public Builder fatherCode(String fatherCode) {
                this.fatherCode = fatherCode;
                return this;
            }

            /**
             * The line name of the source region.
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * The name of the source region group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The line code of the source region.
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * The code of the source region group.
             */
            public Builder lineName(String lineName) {
                this.lineName = lineName;
                return this;
            }

            public Line build() {
                return new Line(this);
            } 

        } 

    }
    public static class Lines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Line")
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
    public static class SelectedDomainLines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SelectedDomainLine")
        private java.util.List < String > selectedDomainLine;

        private SelectedDomainLines(Builder builder) {
            this.selectedDomainLine = builder.selectedDomainLine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedDomainLines create() {
            return builder().build();
        }

        /**
         * @return selectedDomainLine
         */
        public java.util.List < String > getSelectedDomainLine() {
            return this.selectedDomainLine;
        }

        public static final class Builder {
            private java.util.List < String > selectedDomainLine; 

            /**
             * SelectedDomainLine.
             */
            public Builder selectedDomainLine(java.util.List < String > selectedDomainLine) {
                this.selectedDomainLine = selectedDomainLine;
                return this;
            }

            public SelectedDomainLines build() {
                return new SelectedDomainLines(this);
            } 

        } 

    }
    public static class SelectedIpv4Lines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SelectedIpv4Line")
        private java.util.List < String > selectedIpv4Line;

        private SelectedIpv4Lines(Builder builder) {
            this.selectedIpv4Line = builder.selectedIpv4Line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedIpv4Lines create() {
            return builder().build();
        }

        /**
         * @return selectedIpv4Line
         */
        public java.util.List < String > getSelectedIpv4Line() {
            return this.selectedIpv4Line;
        }

        public static final class Builder {
            private java.util.List < String > selectedIpv4Line; 

            /**
             * SelectedIpv4Line.
             */
            public Builder selectedIpv4Line(java.util.List < String > selectedIpv4Line) {
                this.selectedIpv4Line = selectedIpv4Line;
                return this;
            }

            public SelectedIpv4Lines build() {
                return new SelectedIpv4Lines(this);
            } 

        } 

    }
    public static class SelectedIpv6Lines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SelectedIpv6Line")
        private java.util.List < String > selectedIpv6Line;

        private SelectedIpv6Lines(Builder builder) {
            this.selectedIpv6Line = builder.selectedIpv6Line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedIpv6Lines create() {
            return builder().build();
        }

        /**
         * @return selectedIpv6Line
         */
        public java.util.List < String > getSelectedIpv6Line() {
            return this.selectedIpv6Line;
        }

        public static final class Builder {
            private java.util.List < String > selectedIpv6Line; 

            /**
             * SelectedIpv6Line.
             */
            public Builder selectedIpv6Line(java.util.List < String > selectedIpv6Line) {
                this.selectedIpv6Line = selectedIpv6Line;
                return this;
            }

            public SelectedIpv6Lines build() {
                return new SelectedIpv6Lines(this);
            } 

        } 

    }
}
