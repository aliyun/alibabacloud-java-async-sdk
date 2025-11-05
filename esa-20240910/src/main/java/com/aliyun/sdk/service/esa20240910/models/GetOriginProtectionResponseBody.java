// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
 *
 * <p>GetOriginProtectionResponseBody</p>
 */
public class GetOriginProtectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoConfirmIPList")
    private String autoConfirmIPList;

    @com.aliyun.core.annotation.NameInMap("CurrentIPWhitelist")
    private CurrentIPWhitelist currentIPWhitelist;

    @com.aliyun.core.annotation.NameInMap("DiffIPWhitelist")
    private DiffIPWhitelist diffIPWhitelist;

    @com.aliyun.core.annotation.NameInMap("LatestIPWhitelist")
    private LatestIPWhitelist latestIPWhitelist;

    @com.aliyun.core.annotation.NameInMap("NeedUpdate")
    private Boolean needUpdate;

    @com.aliyun.core.annotation.NameInMap("OriginConverge")
    private String originConverge;

    @com.aliyun.core.annotation.NameInMap("OriginProtection")
    private String originProtection;

    @com.aliyun.core.annotation.NameInMap("RegionalCurrentIPWhitelist")
    private RegionalCurrentIPWhitelist regionalCurrentIPWhitelist;

    @com.aliyun.core.annotation.NameInMap("RegionalDiffIPWhitelist")
    private RegionalDiffIPWhitelist regionalDiffIPWhitelist;

    @com.aliyun.core.annotation.NameInMap("RegionalLatestIPWhitelist")
    private RegionalLatestIPWhitelist regionalLatestIPWhitelist;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private GetOriginProtectionResponseBody(Builder builder) {
        this.autoConfirmIPList = builder.autoConfirmIPList;
        this.currentIPWhitelist = builder.currentIPWhitelist;
        this.diffIPWhitelist = builder.diffIPWhitelist;
        this.latestIPWhitelist = builder.latestIPWhitelist;
        this.needUpdate = builder.needUpdate;
        this.originConverge = builder.originConverge;
        this.originProtection = builder.originProtection;
        this.regionalCurrentIPWhitelist = builder.regionalCurrentIPWhitelist;
        this.regionalDiffIPWhitelist = builder.regionalDiffIPWhitelist;
        this.regionalLatestIPWhitelist = builder.regionalLatestIPWhitelist;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOriginProtectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoConfirmIPList
     */
    public String getAutoConfirmIPList() {
        return this.autoConfirmIPList;
    }

    /**
     * @return currentIPWhitelist
     */
    public CurrentIPWhitelist getCurrentIPWhitelist() {
        return this.currentIPWhitelist;
    }

    /**
     * @return diffIPWhitelist
     */
    public DiffIPWhitelist getDiffIPWhitelist() {
        return this.diffIPWhitelist;
    }

    /**
     * @return latestIPWhitelist
     */
    public LatestIPWhitelist getLatestIPWhitelist() {
        return this.latestIPWhitelist;
    }

    /**
     * @return needUpdate
     */
    public Boolean getNeedUpdate() {
        return this.needUpdate;
    }

    /**
     * @return originConverge
     */
    public String getOriginConverge() {
        return this.originConverge;
    }

    /**
     * @return originProtection
     */
    public String getOriginProtection() {
        return this.originProtection;
    }

    /**
     * @return regionalCurrentIPWhitelist
     */
    public RegionalCurrentIPWhitelist getRegionalCurrentIPWhitelist() {
        return this.regionalCurrentIPWhitelist;
    }

    /**
     * @return regionalDiffIPWhitelist
     */
    public RegionalDiffIPWhitelist getRegionalDiffIPWhitelist() {
        return this.regionalDiffIPWhitelist;
    }

    /**
     * @return regionalLatestIPWhitelist
     */
    public RegionalLatestIPWhitelist getRegionalLatestIPWhitelist() {
        return this.regionalLatestIPWhitelist;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder {
        private String autoConfirmIPList; 
        private CurrentIPWhitelist currentIPWhitelist; 
        private DiffIPWhitelist diffIPWhitelist; 
        private LatestIPWhitelist latestIPWhitelist; 
        private Boolean needUpdate; 
        private String originConverge; 
        private String originProtection; 
        private RegionalCurrentIPWhitelist regionalCurrentIPWhitelist; 
        private RegionalDiffIPWhitelist regionalDiffIPWhitelist; 
        private RegionalLatestIPWhitelist regionalLatestIPWhitelist; 
        private String requestId; 
        private Long siteId; 

        private Builder() {
        } 

        private Builder(GetOriginProtectionResponseBody model) {
            this.autoConfirmIPList = model.autoConfirmIPList;
            this.currentIPWhitelist = model.currentIPWhitelist;
            this.diffIPWhitelist = model.diffIPWhitelist;
            this.latestIPWhitelist = model.latestIPWhitelist;
            this.needUpdate = model.needUpdate;
            this.originConverge = model.originConverge;
            this.originProtection = model.originProtection;
            this.regionalCurrentIPWhitelist = model.regionalCurrentIPWhitelist;
            this.regionalDiffIPWhitelist = model.regionalDiffIPWhitelist;
            this.regionalLatestIPWhitelist = model.regionalLatestIPWhitelist;
            this.requestId = model.requestId;
            this.siteId = model.siteId;
        } 

        /**
         * AutoConfirmIPList.
         */
        public Builder autoConfirmIPList(String autoConfirmIPList) {
            this.autoConfirmIPList = autoConfirmIPList;
            return this;
        }

        /**
         * <p>The IP whitelist for origin protection used by the website.</p>
         */
        public Builder currentIPWhitelist(CurrentIPWhitelist currentIPWhitelist) {
            this.currentIPWhitelist = currentIPWhitelist;
            return this;
        }

        /**
         * <p>The IP whitelist for origin protection that has been updated.</p>
         */
        public Builder diffIPWhitelist(DiffIPWhitelist diffIPWhitelist) {
            this.diffIPWhitelist = diffIPWhitelist;
            return this;
        }

        /**
         * <p>The latest IP whitelist for origin protection.</p>
         */
        public Builder latestIPWhitelist(LatestIPWhitelist latestIPWhitelist) {
            this.latestIPWhitelist = latestIPWhitelist;
            return this;
        }

        /**
         * <p>Indicates whether the IP whitelist for origin protection needs to be updated. If the currently used IP whitelist is different from the latest IP whitelist, it needs to be updated, and the value is true.</p>
         * <ul>
         * <li>true: The update is required.</li>
         * <li>false: No update is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needUpdate(Boolean needUpdate) {
            this.needUpdate = needUpdate;
            return this;
        }

        /**
         * <p>Indicates whether IP convergence is enabled.</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder originConverge(String originConverge) {
            this.originConverge = originConverge;
            return this;
        }

        /**
         * <p>Indicates whether origin protection is enabled.</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder originProtection(String originProtection) {
            this.originProtection = originProtection;
            return this;
        }

        /**
         * RegionalCurrentIPWhitelist.
         */
        public Builder regionalCurrentIPWhitelist(RegionalCurrentIPWhitelist regionalCurrentIPWhitelist) {
            this.regionalCurrentIPWhitelist = regionalCurrentIPWhitelist;
            return this;
        }

        /**
         * RegionalDiffIPWhitelist.
         */
        public Builder regionalDiffIPWhitelist(RegionalDiffIPWhitelist regionalDiffIPWhitelist) {
            this.regionalDiffIPWhitelist = regionalDiffIPWhitelist;
            return this;
        }

        /**
         * RegionalLatestIPWhitelist.
         */
        public Builder regionalLatestIPWhitelist(RegionalLatestIPWhitelist regionalLatestIPWhitelist) {
            this.regionalLatestIPWhitelist = regionalLatestIPWhitelist;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        public GetOriginProtectionResponseBody build() {
            return new GetOriginProtectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class CurrentIPWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPv4")
        private java.util.List<String> iPv4;

        @com.aliyun.core.annotation.NameInMap("IPv6")
        private java.util.List<String> iPv6;

        private CurrentIPWhitelist(Builder builder) {
            this.iPv4 = builder.iPv4;
            this.iPv6 = builder.iPv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentIPWhitelist create() {
            return builder().build();
        }

        /**
         * @return iPv4
         */
        public java.util.List<String> getIPv4() {
            return this.iPv4;
        }

        /**
         * @return iPv6
         */
        public java.util.List<String> getIPv6() {
            return this.iPv6;
        }

        public static final class Builder {
            private java.util.List<String> iPv4; 
            private java.util.List<String> iPv6; 

            private Builder() {
            } 

            private Builder(CurrentIPWhitelist model) {
                this.iPv4 = model.iPv4;
                this.iPv6 = model.iPv6;
            } 

            /**
             * <p>The IP whitelist for origin protection used by the website, specified as IPv4 addresses or CIDR blocks.</p>
             */
            public Builder iPv4(java.util.List<String> iPv4) {
                this.iPv4 = iPv4;
                return this;
            }

            /**
             * <p>The IP whitelist for origin protection used by the website, specified as IPv6 addresses or CIDR blocks.</p>
             */
            public Builder iPv6(java.util.List<String> iPv6) {
                this.iPv6 = iPv6;
                return this;
            }

            public CurrentIPWhitelist build() {
                return new CurrentIPWhitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class AddedIPWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPv4")
        private java.util.List<String> iPv4;

        @com.aliyun.core.annotation.NameInMap("IPv6")
        private java.util.List<String> iPv6;

        private AddedIPWhitelist(Builder builder) {
            this.iPv4 = builder.iPv4;
            this.iPv6 = builder.iPv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddedIPWhitelist create() {
            return builder().build();
        }

        /**
         * @return iPv4
         */
        public java.util.List<String> getIPv4() {
            return this.iPv4;
        }

        /**
         * @return iPv6
         */
        public java.util.List<String> getIPv6() {
            return this.iPv6;
        }

        public static final class Builder {
            private java.util.List<String> iPv4; 
            private java.util.List<String> iPv6; 

            private Builder() {
            } 

            private Builder(AddedIPWhitelist model) {
                this.iPv4 = model.iPv4;
                this.iPv6 = model.iPv6;
            } 

            /**
             * <p>The IP whitelist for origin protection, specified as IPv4 addresses or CIDR blocks.</p>
             */
            public Builder iPv4(java.util.List<String> iPv4) {
                this.iPv4 = iPv4;
                return this;
            }

            /**
             * <p>The IP whitelist for origin protection, specified as IPv6 addresses or CIDR blocks.</p>
             */
            public Builder iPv6(java.util.List<String> iPv6) {
                this.iPv6 = iPv6;
                return this;
            }

            public AddedIPWhitelist build() {
                return new AddedIPWhitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class NoChangeIpWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPv4")
        private java.util.List<String> iPv4;

        @com.aliyun.core.annotation.NameInMap("IPv6")
        private java.util.List<String> iPv6;

        private NoChangeIpWhitelist(Builder builder) {
            this.iPv4 = builder.iPv4;
            this.iPv6 = builder.iPv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoChangeIpWhitelist create() {
            return builder().build();
        }

        /**
         * @return iPv4
         */
        public java.util.List<String> getIPv4() {
            return this.iPv4;
        }

        /**
         * @return iPv6
         */
        public java.util.List<String> getIPv6() {
            return this.iPv6;
        }

        public static final class Builder {
            private java.util.List<String> iPv4; 
            private java.util.List<String> iPv6; 

            private Builder() {
            } 

            private Builder(NoChangeIpWhitelist model) {
                this.iPv4 = model.iPv4;
                this.iPv6 = model.iPv6;
            } 

            /**
             * <p>The IP whitelist for origin protection, specified as IPv4 addresses or CIDR blocks.</p>
             */
            public Builder iPv4(java.util.List<String> iPv4) {
                this.iPv4 = iPv4;
                return this;
            }

            /**
             * <p>The IP whitelist for origin protection, specified as IPv6 addresses or CIDR blocks.</p>
             */
            public Builder iPv6(java.util.List<String> iPv6) {
                this.iPv6 = iPv6;
                return this;
            }

            public NoChangeIpWhitelist build() {
                return new NoChangeIpWhitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class RemovedIPWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPv4")
        private java.util.List<String> iPv4;

        @com.aliyun.core.annotation.NameInMap("IPv6")
        private java.util.List<String> iPv6;

        private RemovedIPWhitelist(Builder builder) {
            this.iPv4 = builder.iPv4;
            this.iPv6 = builder.iPv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovedIPWhitelist create() {
            return builder().build();
        }

        /**
         * @return iPv4
         */
        public java.util.List<String> getIPv4() {
            return this.iPv4;
        }

        /**
         * @return iPv6
         */
        public java.util.List<String> getIPv6() {
            return this.iPv6;
        }

        public static final class Builder {
            private java.util.List<String> iPv4; 
            private java.util.List<String> iPv6; 

            private Builder() {
            } 

            private Builder(RemovedIPWhitelist model) {
                this.iPv4 = model.iPv4;
                this.iPv6 = model.iPv6;
            } 

            /**
             * <p>The IP whitelist for origin protection, specified as IPv4 addresses or CIDR blocks.</p>
             */
            public Builder iPv4(java.util.List<String> iPv4) {
                this.iPv4 = iPv4;
                return this;
            }

            /**
             * <p>The IP whitelist for origin protection, specified as IPv6 addresses or CIDR blocks.</p>
             */
            public Builder iPv6(java.util.List<String> iPv6) {
                this.iPv6 = iPv6;
                return this;
            }

            public RemovedIPWhitelist build() {
                return new RemovedIPWhitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class DiffIPWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddedIPWhitelist")
        private AddedIPWhitelist addedIPWhitelist;

        @com.aliyun.core.annotation.NameInMap("NoChangeIpWhitelist")
        private NoChangeIpWhitelist noChangeIpWhitelist;

        @com.aliyun.core.annotation.NameInMap("RemovedIPWhitelist")
        private RemovedIPWhitelist removedIPWhitelist;

        private DiffIPWhitelist(Builder builder) {
            this.addedIPWhitelist = builder.addedIPWhitelist;
            this.noChangeIpWhitelist = builder.noChangeIpWhitelist;
            this.removedIPWhitelist = builder.removedIPWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiffIPWhitelist create() {
            return builder().build();
        }

        /**
         * @return addedIPWhitelist
         */
        public AddedIPWhitelist getAddedIPWhitelist() {
            return this.addedIPWhitelist;
        }

        /**
         * @return noChangeIpWhitelist
         */
        public NoChangeIpWhitelist getNoChangeIpWhitelist() {
            return this.noChangeIpWhitelist;
        }

        /**
         * @return removedIPWhitelist
         */
        public RemovedIPWhitelist getRemovedIPWhitelist() {
            return this.removedIPWhitelist;
        }

        public static final class Builder {
            private AddedIPWhitelist addedIPWhitelist; 
            private NoChangeIpWhitelist noChangeIpWhitelist; 
            private RemovedIPWhitelist removedIPWhitelist; 

            private Builder() {
            } 

            private Builder(DiffIPWhitelist model) {
                this.addedIPWhitelist = model.addedIPWhitelist;
                this.noChangeIpWhitelist = model.noChangeIpWhitelist;
                this.removedIPWhitelist = model.removedIPWhitelist;
            } 

            /**
             * <p>The new IP whitelist for origin protection.</p>
             */
            public Builder addedIPWhitelist(AddedIPWhitelist addedIPWhitelist) {
                this.addedIPWhitelist = addedIPWhitelist;
                return this;
            }

            /**
             * <p>The IP whitelist for origin protection that remains unchanged.</p>
             */
            public Builder noChangeIpWhitelist(NoChangeIpWhitelist noChangeIpWhitelist) {
                this.noChangeIpWhitelist = noChangeIpWhitelist;
                return this;
            }

            /**
             * <p>The IP whitelist for origin protection that has been deleted.</p>
             */
            public Builder removedIPWhitelist(RemovedIPWhitelist removedIPWhitelist) {
                this.removedIPWhitelist = removedIPWhitelist;
                return this;
            }

            public DiffIPWhitelist build() {
                return new DiffIPWhitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class LatestIPWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPv4")
        private java.util.List<String> iPv4;

        @com.aliyun.core.annotation.NameInMap("IPv6")
        private java.util.List<String> iPv6;

        private LatestIPWhitelist(Builder builder) {
            this.iPv4 = builder.iPv4;
            this.iPv6 = builder.iPv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestIPWhitelist create() {
            return builder().build();
        }

        /**
         * @return iPv4
         */
        public java.util.List<String> getIPv4() {
            return this.iPv4;
        }

        /**
         * @return iPv6
         */
        public java.util.List<String> getIPv6() {
            return this.iPv6;
        }

        public static final class Builder {
            private java.util.List<String> iPv4; 
            private java.util.List<String> iPv6; 

            private Builder() {
            } 

            private Builder(LatestIPWhitelist model) {
                this.iPv4 = model.iPv4;
                this.iPv6 = model.iPv6;
            } 

            /**
             * <p>The latest IP whitelist for origin protection, specified as IPv4 addresses or CIDR blocks.</p>
             */
            public Builder iPv4(java.util.List<String> iPv4) {
                this.iPv4 = iPv4;
                return this;
            }

            /**
             * <p>The latest IP whitelist for origin protection, specified as IPv6 addresses or CIDR blocks.</p>
             */
            public Builder iPv6(java.util.List<String> iPv6) {
                this.iPv6 = iPv6;
                return this;
            }

            public LatestIPWhitelist build() {
                return new LatestIPWhitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class RegionalIPv4 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private RegionalIPv4(Builder builder) {
            this.cidr = builder.cidr;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionalIPv4 create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String cidr; 
            private String region; 

            private Builder() {
            } 

            private Builder(RegionalIPv4 model) {
                this.cidr = model.cidr;
                this.region = model.region;
            } 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public RegionalIPv4 build() {
                return new RegionalIPv4(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class RegionalIPv6 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private RegionalIPv6(Builder builder) {
            this.cidr = builder.cidr;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionalIPv6 create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String cidr; 
            private String region; 

            private Builder() {
            } 

            private Builder(RegionalIPv6 model) {
                this.cidr = model.cidr;
                this.region = model.region;
            } 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public RegionalIPv6 build() {
                return new RegionalIPv6(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class RegionalCurrentIPWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionalIPv4")
        private java.util.List<RegionalIPv4> regionalIPv4;

        @com.aliyun.core.annotation.NameInMap("RegionalIPv6")
        private java.util.List<RegionalIPv6> regionalIPv6;

        private RegionalCurrentIPWhitelist(Builder builder) {
            this.regionalIPv4 = builder.regionalIPv4;
            this.regionalIPv6 = builder.regionalIPv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionalCurrentIPWhitelist create() {
            return builder().build();
        }

        /**
         * @return regionalIPv4
         */
        public java.util.List<RegionalIPv4> getRegionalIPv4() {
            return this.regionalIPv4;
        }

        /**
         * @return regionalIPv6
         */
        public java.util.List<RegionalIPv6> getRegionalIPv6() {
            return this.regionalIPv6;
        }

        public static final class Builder {
            private java.util.List<RegionalIPv4> regionalIPv4; 
            private java.util.List<RegionalIPv6> regionalIPv6; 

            private Builder() {
            } 

            private Builder(RegionalCurrentIPWhitelist model) {
                this.regionalIPv4 = model.regionalIPv4;
                this.regionalIPv6 = model.regionalIPv6;
            } 

            /**
             * RegionalIPv4.
             */
            public Builder regionalIPv4(java.util.List<RegionalIPv4> regionalIPv4) {
                this.regionalIPv4 = regionalIPv4;
                return this;
            }

            /**
             * RegionalIPv6.
             */
            public Builder regionalIPv6(java.util.List<RegionalIPv6> regionalIPv6) {
                this.regionalIPv6 = regionalIPv6;
                return this;
            }

            public RegionalCurrentIPWhitelist build() {
                return new RegionalCurrentIPWhitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class AddedIPRegionWhitelistRegionalIPv4 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private AddedIPRegionWhitelistRegionalIPv4(Builder builder) {
            this.cidr = builder.cidr;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddedIPRegionWhitelistRegionalIPv4 create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String cidr; 
            private String region; 

            private Builder() {
            } 

            private Builder(AddedIPRegionWhitelistRegionalIPv4 model) {
                this.cidr = model.cidr;
                this.region = model.region;
            } 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public AddedIPRegionWhitelistRegionalIPv4 build() {
                return new AddedIPRegionWhitelistRegionalIPv4(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class AddedIPRegionWhitelistRegionalIPv6 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private AddedIPRegionWhitelistRegionalIPv6(Builder builder) {
            this.cidr = builder.cidr;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddedIPRegionWhitelistRegionalIPv6 create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String cidr; 
            private String region; 

            private Builder() {
            } 

            private Builder(AddedIPRegionWhitelistRegionalIPv6 model) {
                this.cidr = model.cidr;
                this.region = model.region;
            } 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public AddedIPRegionWhitelistRegionalIPv6 build() {
                return new AddedIPRegionWhitelistRegionalIPv6(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class AddedIPRegionWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionalIPv4")
        private java.util.List<AddedIPRegionWhitelistRegionalIPv4> regionalIPv4;

        @com.aliyun.core.annotation.NameInMap("RegionalIPv6")
        private java.util.List<AddedIPRegionWhitelistRegionalIPv6> regionalIPv6;

        private AddedIPRegionWhitelist(Builder builder) {
            this.regionalIPv4 = builder.regionalIPv4;
            this.regionalIPv6 = builder.regionalIPv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddedIPRegionWhitelist create() {
            return builder().build();
        }

        /**
         * @return regionalIPv4
         */
        public java.util.List<AddedIPRegionWhitelistRegionalIPv4> getRegionalIPv4() {
            return this.regionalIPv4;
        }

        /**
         * @return regionalIPv6
         */
        public java.util.List<AddedIPRegionWhitelistRegionalIPv6> getRegionalIPv6() {
            return this.regionalIPv6;
        }

        public static final class Builder {
            private java.util.List<AddedIPRegionWhitelistRegionalIPv4> regionalIPv4; 
            private java.util.List<AddedIPRegionWhitelistRegionalIPv6> regionalIPv6; 

            private Builder() {
            } 

            private Builder(AddedIPRegionWhitelist model) {
                this.regionalIPv4 = model.regionalIPv4;
                this.regionalIPv6 = model.regionalIPv6;
            } 

            /**
             * RegionalIPv4.
             */
            public Builder regionalIPv4(java.util.List<AddedIPRegionWhitelistRegionalIPv4> regionalIPv4) {
                this.regionalIPv4 = regionalIPv4;
                return this;
            }

            /**
             * RegionalIPv6.
             */
            public Builder regionalIPv6(java.util.List<AddedIPRegionWhitelistRegionalIPv6> regionalIPv6) {
                this.regionalIPv6 = regionalIPv6;
                return this;
            }

            public AddedIPRegionWhitelist build() {
                return new AddedIPRegionWhitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class NoChangeIpWhitelistRegionalIPv4 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private NoChangeIpWhitelistRegionalIPv4(Builder builder) {
            this.cidr = builder.cidr;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoChangeIpWhitelistRegionalIPv4 create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String cidr; 
            private String region; 

            private Builder() {
            } 

            private Builder(NoChangeIpWhitelistRegionalIPv4 model) {
                this.cidr = model.cidr;
                this.region = model.region;
            } 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public NoChangeIpWhitelistRegionalIPv4 build() {
                return new NoChangeIpWhitelistRegionalIPv4(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class NoChangeIpWhitelistRegionalIPv6 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private NoChangeIpWhitelistRegionalIPv6(Builder builder) {
            this.cidr = builder.cidr;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoChangeIpWhitelistRegionalIPv6 create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String cidr; 
            private String region; 

            private Builder() {
            } 

            private Builder(NoChangeIpWhitelistRegionalIPv6 model) {
                this.cidr = model.cidr;
                this.region = model.region;
            } 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public NoChangeIpWhitelistRegionalIPv6 build() {
                return new NoChangeIpWhitelistRegionalIPv6(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class RegionalDiffIPWhitelistNoChangeIpWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionalIPv4")
        private java.util.List<NoChangeIpWhitelistRegionalIPv4> regionalIPv4;

        @com.aliyun.core.annotation.NameInMap("RegionalIPv6")
        private java.util.List<NoChangeIpWhitelistRegionalIPv6> regionalIPv6;

        private RegionalDiffIPWhitelistNoChangeIpWhitelist(Builder builder) {
            this.regionalIPv4 = builder.regionalIPv4;
            this.regionalIPv6 = builder.regionalIPv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionalDiffIPWhitelistNoChangeIpWhitelist create() {
            return builder().build();
        }

        /**
         * @return regionalIPv4
         */
        public java.util.List<NoChangeIpWhitelistRegionalIPv4> getRegionalIPv4() {
            return this.regionalIPv4;
        }

        /**
         * @return regionalIPv6
         */
        public java.util.List<NoChangeIpWhitelistRegionalIPv6> getRegionalIPv6() {
            return this.regionalIPv6;
        }

        public static final class Builder {
            private java.util.List<NoChangeIpWhitelistRegionalIPv4> regionalIPv4; 
            private java.util.List<NoChangeIpWhitelistRegionalIPv6> regionalIPv6; 

            private Builder() {
            } 

            private Builder(RegionalDiffIPWhitelistNoChangeIpWhitelist model) {
                this.regionalIPv4 = model.regionalIPv4;
                this.regionalIPv6 = model.regionalIPv6;
            } 

            /**
             * RegionalIPv4.
             */
            public Builder regionalIPv4(java.util.List<NoChangeIpWhitelistRegionalIPv4> regionalIPv4) {
                this.regionalIPv4 = regionalIPv4;
                return this;
            }

            /**
             * RegionalIPv6.
             */
            public Builder regionalIPv6(java.util.List<NoChangeIpWhitelistRegionalIPv6> regionalIPv6) {
                this.regionalIPv6 = regionalIPv6;
                return this;
            }

            public RegionalDiffIPWhitelistNoChangeIpWhitelist build() {
                return new RegionalDiffIPWhitelistNoChangeIpWhitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class RemovedIPRegionWhitelistRegionalIPv4 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private RemovedIPRegionWhitelistRegionalIPv4(Builder builder) {
            this.cidr = builder.cidr;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovedIPRegionWhitelistRegionalIPv4 create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String cidr; 
            private String region; 

            private Builder() {
            } 

            private Builder(RemovedIPRegionWhitelistRegionalIPv4 model) {
                this.cidr = model.cidr;
                this.region = model.region;
            } 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public RemovedIPRegionWhitelistRegionalIPv4 build() {
                return new RemovedIPRegionWhitelistRegionalIPv4(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class RemovedIPRegionWhitelistRegionalIPv6 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private RemovedIPRegionWhitelistRegionalIPv6(Builder builder) {
            this.cidr = builder.cidr;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovedIPRegionWhitelistRegionalIPv6 create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String cidr; 
            private String region; 

            private Builder() {
            } 

            private Builder(RemovedIPRegionWhitelistRegionalIPv6 model) {
                this.cidr = model.cidr;
                this.region = model.region;
            } 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public RemovedIPRegionWhitelistRegionalIPv6 build() {
                return new RemovedIPRegionWhitelistRegionalIPv6(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class RemovedIPRegionWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionalIPv4")
        private java.util.List<RemovedIPRegionWhitelistRegionalIPv4> regionalIPv4;

        @com.aliyun.core.annotation.NameInMap("RegionalIPv6")
        private java.util.List<RemovedIPRegionWhitelistRegionalIPv6> regionalIPv6;

        private RemovedIPRegionWhitelist(Builder builder) {
            this.regionalIPv4 = builder.regionalIPv4;
            this.regionalIPv6 = builder.regionalIPv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovedIPRegionWhitelist create() {
            return builder().build();
        }

        /**
         * @return regionalIPv4
         */
        public java.util.List<RemovedIPRegionWhitelistRegionalIPv4> getRegionalIPv4() {
            return this.regionalIPv4;
        }

        /**
         * @return regionalIPv6
         */
        public java.util.List<RemovedIPRegionWhitelistRegionalIPv6> getRegionalIPv6() {
            return this.regionalIPv6;
        }

        public static final class Builder {
            private java.util.List<RemovedIPRegionWhitelistRegionalIPv4> regionalIPv4; 
            private java.util.List<RemovedIPRegionWhitelistRegionalIPv6> regionalIPv6; 

            private Builder() {
            } 

            private Builder(RemovedIPRegionWhitelist model) {
                this.regionalIPv4 = model.regionalIPv4;
                this.regionalIPv6 = model.regionalIPv6;
            } 

            /**
             * RegionalIPv4.
             */
            public Builder regionalIPv4(java.util.List<RemovedIPRegionWhitelistRegionalIPv4> regionalIPv4) {
                this.regionalIPv4 = regionalIPv4;
                return this;
            }

            /**
             * RegionalIPv6.
             */
            public Builder regionalIPv6(java.util.List<RemovedIPRegionWhitelistRegionalIPv6> regionalIPv6) {
                this.regionalIPv6 = regionalIPv6;
                return this;
            }

            public RemovedIPRegionWhitelist build() {
                return new RemovedIPRegionWhitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class RegionalDiffIPWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddedIPRegionWhitelist")
        private AddedIPRegionWhitelist addedIPRegionWhitelist;

        @com.aliyun.core.annotation.NameInMap("NoChangeIpWhitelist")
        private RegionalDiffIPWhitelistNoChangeIpWhitelist noChangeIpWhitelist;

        @com.aliyun.core.annotation.NameInMap("RemovedIPRegionWhitelist")
        private RemovedIPRegionWhitelist removedIPRegionWhitelist;

        private RegionalDiffIPWhitelist(Builder builder) {
            this.addedIPRegionWhitelist = builder.addedIPRegionWhitelist;
            this.noChangeIpWhitelist = builder.noChangeIpWhitelist;
            this.removedIPRegionWhitelist = builder.removedIPRegionWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionalDiffIPWhitelist create() {
            return builder().build();
        }

        /**
         * @return addedIPRegionWhitelist
         */
        public AddedIPRegionWhitelist getAddedIPRegionWhitelist() {
            return this.addedIPRegionWhitelist;
        }

        /**
         * @return noChangeIpWhitelist
         */
        public RegionalDiffIPWhitelistNoChangeIpWhitelist getNoChangeIpWhitelist() {
            return this.noChangeIpWhitelist;
        }

        /**
         * @return removedIPRegionWhitelist
         */
        public RemovedIPRegionWhitelist getRemovedIPRegionWhitelist() {
            return this.removedIPRegionWhitelist;
        }

        public static final class Builder {
            private AddedIPRegionWhitelist addedIPRegionWhitelist; 
            private RegionalDiffIPWhitelistNoChangeIpWhitelist noChangeIpWhitelist; 
            private RemovedIPRegionWhitelist removedIPRegionWhitelist; 

            private Builder() {
            } 

            private Builder(RegionalDiffIPWhitelist model) {
                this.addedIPRegionWhitelist = model.addedIPRegionWhitelist;
                this.noChangeIpWhitelist = model.noChangeIpWhitelist;
                this.removedIPRegionWhitelist = model.removedIPRegionWhitelist;
            } 

            /**
             * AddedIPRegionWhitelist.
             */
            public Builder addedIPRegionWhitelist(AddedIPRegionWhitelist addedIPRegionWhitelist) {
                this.addedIPRegionWhitelist = addedIPRegionWhitelist;
                return this;
            }

            /**
             * <p>The IP whitelist for origin protection that remains unchanged.</p>
             */
            public Builder noChangeIpWhitelist(RegionalDiffIPWhitelistNoChangeIpWhitelist noChangeIpWhitelist) {
                this.noChangeIpWhitelist = noChangeIpWhitelist;
                return this;
            }

            /**
             * RemovedIPRegionWhitelist.
             */
            public Builder removedIPRegionWhitelist(RemovedIPRegionWhitelist removedIPRegionWhitelist) {
                this.removedIPRegionWhitelist = removedIPRegionWhitelist;
                return this;
            }

            public RegionalDiffIPWhitelist build() {
                return new RegionalDiffIPWhitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class RegionalLatestIPWhitelistRegionalIPv4 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private RegionalLatestIPWhitelistRegionalIPv4(Builder builder) {
            this.cidr = builder.cidr;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionalLatestIPWhitelistRegionalIPv4 create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String cidr; 
            private String region; 

            private Builder() {
            } 

            private Builder(RegionalLatestIPWhitelistRegionalIPv4 model) {
                this.cidr = model.cidr;
                this.region = model.region;
            } 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public RegionalLatestIPWhitelistRegionalIPv4 build() {
                return new RegionalLatestIPWhitelistRegionalIPv4(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class RegionalLatestIPWhitelistRegionalIPv6 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private RegionalLatestIPWhitelistRegionalIPv6(Builder builder) {
            this.cidr = builder.cidr;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionalLatestIPWhitelistRegionalIPv6 create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String cidr; 
            private String region; 

            private Builder() {
            } 

            private Builder(RegionalLatestIPWhitelistRegionalIPv6 model) {
                this.cidr = model.cidr;
                this.region = model.region;
            } 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public RegionalLatestIPWhitelistRegionalIPv6 build() {
                return new RegionalLatestIPWhitelistRegionalIPv6(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginProtectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginProtectionResponseBody</p>
     */
    public static class RegionalLatestIPWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionalIPv4")
        private java.util.List<RegionalLatestIPWhitelistRegionalIPv4> regionalIPv4;

        @com.aliyun.core.annotation.NameInMap("RegionalIPv6")
        private java.util.List<RegionalLatestIPWhitelistRegionalIPv6> regionalIPv6;

        private RegionalLatestIPWhitelist(Builder builder) {
            this.regionalIPv4 = builder.regionalIPv4;
            this.regionalIPv6 = builder.regionalIPv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionalLatestIPWhitelist create() {
            return builder().build();
        }

        /**
         * @return regionalIPv4
         */
        public java.util.List<RegionalLatestIPWhitelistRegionalIPv4> getRegionalIPv4() {
            return this.regionalIPv4;
        }

        /**
         * @return regionalIPv6
         */
        public java.util.List<RegionalLatestIPWhitelistRegionalIPv6> getRegionalIPv6() {
            return this.regionalIPv6;
        }

        public static final class Builder {
            private java.util.List<RegionalLatestIPWhitelistRegionalIPv4> regionalIPv4; 
            private java.util.List<RegionalLatestIPWhitelistRegionalIPv6> regionalIPv6; 

            private Builder() {
            } 

            private Builder(RegionalLatestIPWhitelist model) {
                this.regionalIPv4 = model.regionalIPv4;
                this.regionalIPv6 = model.regionalIPv6;
            } 

            /**
             * RegionalIPv4.
             */
            public Builder regionalIPv4(java.util.List<RegionalLatestIPWhitelistRegionalIPv4> regionalIPv4) {
                this.regionalIPv4 = regionalIPv4;
                return this;
            }

            /**
             * RegionalIPv6.
             */
            public Builder regionalIPv6(java.util.List<RegionalLatestIPWhitelistRegionalIPv6> regionalIPv6) {
                this.regionalIPv6 = regionalIPv6;
                return this;
            }

            public RegionalLatestIPWhitelist build() {
                return new RegionalLatestIPWhitelist(this);
            } 

        } 

    }
}
