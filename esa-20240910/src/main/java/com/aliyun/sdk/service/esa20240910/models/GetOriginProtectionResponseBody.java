// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private GetOriginProtectionResponseBody(Builder builder) {
        this.currentIPWhitelist = builder.currentIPWhitelist;
        this.diffIPWhitelist = builder.diffIPWhitelist;
        this.latestIPWhitelist = builder.latestIPWhitelist;
        this.needUpdate = builder.needUpdate;
        this.originConverge = builder.originConverge;
        this.originProtection = builder.originProtection;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOriginProtectionResponseBody create() {
        return builder().build();
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
        private CurrentIPWhitelist currentIPWhitelist; 
        private DiffIPWhitelist diffIPWhitelist; 
        private LatestIPWhitelist latestIPWhitelist; 
        private Boolean needUpdate; 
        private String originConverge; 
        private String originProtection; 
        private String requestId; 
        private Long siteId; 

        /**
         * CurrentIPWhitelist.
         */
        public Builder currentIPWhitelist(CurrentIPWhitelist currentIPWhitelist) {
            this.currentIPWhitelist = currentIPWhitelist;
            return this;
        }

        /**
         * DiffIPWhitelist.
         */
        public Builder diffIPWhitelist(DiffIPWhitelist diffIPWhitelist) {
            this.diffIPWhitelist = diffIPWhitelist;
            return this;
        }

        /**
         * LatestIPWhitelist.
         */
        public Builder latestIPWhitelist(LatestIPWhitelist latestIPWhitelist) {
            this.latestIPWhitelist = latestIPWhitelist;
            return this;
        }

        /**
         * NeedUpdate.
         */
        public Builder needUpdate(Boolean needUpdate) {
            this.needUpdate = needUpdate;
            return this;
        }

        /**
         * OriginConverge.
         */
        public Builder originConverge(String originConverge) {
            this.originConverge = originConverge;
            return this;
        }

        /**
         * OriginProtection.
         */
        public Builder originProtection(String originProtection) {
            this.originProtection = originProtection;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteId.
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
        private java.util.List < String > iPv4;

        @com.aliyun.core.annotation.NameInMap("IPv6")
        private java.util.List < String > iPv6;

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
        public java.util.List < String > getIPv4() {
            return this.iPv4;
        }

        /**
         * @return iPv6
         */
        public java.util.List < String > getIPv6() {
            return this.iPv6;
        }

        public static final class Builder {
            private java.util.List < String > iPv4; 
            private java.util.List < String > iPv6; 

            /**
             * IPv4.
             */
            public Builder iPv4(java.util.List < String > iPv4) {
                this.iPv4 = iPv4;
                return this;
            }

            /**
             * IPv6.
             */
            public Builder iPv6(java.util.List < String > iPv6) {
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
        private java.util.List < String > iPv4;

        @com.aliyun.core.annotation.NameInMap("IPv6")
        private java.util.List < String > iPv6;

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
        public java.util.List < String > getIPv4() {
            return this.iPv4;
        }

        /**
         * @return iPv6
         */
        public java.util.List < String > getIPv6() {
            return this.iPv6;
        }

        public static final class Builder {
            private java.util.List < String > iPv4; 
            private java.util.List < String > iPv6; 

            /**
             * IPv4.
             */
            public Builder iPv4(java.util.List < String > iPv4) {
                this.iPv4 = iPv4;
                return this;
            }

            /**
             * IPv6.
             */
            public Builder iPv6(java.util.List < String > iPv6) {
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
        private java.util.List < String > iPv4;

        @com.aliyun.core.annotation.NameInMap("IPv6")
        private java.util.List < String > iPv6;

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
        public java.util.List < String > getIPv4() {
            return this.iPv4;
        }

        /**
         * @return iPv6
         */
        public java.util.List < String > getIPv6() {
            return this.iPv6;
        }

        public static final class Builder {
            private java.util.List < String > iPv4; 
            private java.util.List < String > iPv6; 

            /**
             * IPv4.
             */
            public Builder iPv4(java.util.List < String > iPv4) {
                this.iPv4 = iPv4;
                return this;
            }

            /**
             * IPv6.
             */
            public Builder iPv6(java.util.List < String > iPv6) {
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
        private java.util.List < String > iPv4;

        @com.aliyun.core.annotation.NameInMap("IPv6")
        private java.util.List < String > iPv6;

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
        public java.util.List < String > getIPv4() {
            return this.iPv4;
        }

        /**
         * @return iPv6
         */
        public java.util.List < String > getIPv6() {
            return this.iPv6;
        }

        public static final class Builder {
            private java.util.List < String > iPv4; 
            private java.util.List < String > iPv6; 

            /**
             * IPv4.
             */
            public Builder iPv4(java.util.List < String > iPv4) {
                this.iPv4 = iPv4;
                return this;
            }

            /**
             * IPv6.
             */
            public Builder iPv6(java.util.List < String > iPv6) {
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

            /**
             * AddedIPWhitelist.
             */
            public Builder addedIPWhitelist(AddedIPWhitelist addedIPWhitelist) {
                this.addedIPWhitelist = addedIPWhitelist;
                return this;
            }

            /**
             * NoChangeIpWhitelist.
             */
            public Builder noChangeIpWhitelist(NoChangeIpWhitelist noChangeIpWhitelist) {
                this.noChangeIpWhitelist = noChangeIpWhitelist;
                return this;
            }

            /**
             * RemovedIPWhitelist.
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
        private java.util.List < String > iPv4;

        @com.aliyun.core.annotation.NameInMap("IPv6")
        private java.util.List < String > iPv6;

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
        public java.util.List < String > getIPv4() {
            return this.iPv4;
        }

        /**
         * @return iPv6
         */
        public java.util.List < String > getIPv6() {
            return this.iPv6;
        }

        public static final class Builder {
            private java.util.List < String > iPv4; 
            private java.util.List < String > iPv6; 

            /**
             * IPv4.
             */
            public Builder iPv4(java.util.List < String > iPv4) {
                this.iPv4 = iPv4;
                return this;
            }

            /**
             * IPv6.
             */
            public Builder iPv6(java.util.List < String > iPv6) {
                this.iPv6 = iPv6;
                return this;
            }

            public LatestIPWhitelist build() {
                return new LatestIPWhitelist(this);
            } 

        } 

    }
}
