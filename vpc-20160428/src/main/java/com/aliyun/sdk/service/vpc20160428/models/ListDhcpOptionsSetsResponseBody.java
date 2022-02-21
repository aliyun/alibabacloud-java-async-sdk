// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDhcpOptionsSetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDhcpOptionsSetsResponseBody</p>
 */
public class ListDhcpOptionsSetsResponseBody extends TeaModel {
    @NameInMap("DhcpOptionsSets")
    private java.util.List < DhcpOptionsSets> dhcpOptionsSets;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListDhcpOptionsSetsResponseBody(Builder builder) {
        this.dhcpOptionsSets = builder.dhcpOptionsSets;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDhcpOptionsSetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dhcpOptionsSets
     */
    public java.util.List < DhcpOptionsSets> getDhcpOptionsSets() {
        return this.dhcpOptionsSets;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DhcpOptionsSets> dhcpOptionsSets; 
        private String nextToken; 
        private String requestId; 

        /**
         * DhcpOptionsSets.
         */
        public Builder dhcpOptionsSets(java.util.List < DhcpOptionsSets> dhcpOptionsSets) {
            this.dhcpOptionsSets = dhcpOptionsSets;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDhcpOptionsSetsResponseBody build() {
            return new ListDhcpOptionsSetsResponseBody(this);
        } 

    } 

    public static class DhcpOptions extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainNameServers")
        private String domainNameServers;

        private DhcpOptions(Builder builder) {
            this.domainName = builder.domainName;
            this.domainNameServers = builder.domainNameServers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DhcpOptions create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainNameServers
         */
        public String getDomainNameServers() {
            return this.domainNameServers;
        }

        public static final class Builder {
            private String domainName; 
            private String domainNameServers; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainNameServers.
             */
            public Builder domainNameServers(String domainNameServers) {
                this.domainNameServers = domainNameServers;
                return this;
            }

            public DhcpOptions build() {
                return new DhcpOptions(this);
            } 

        } 

    }
    public static class DhcpOptionsSets extends TeaModel {
        @NameInMap("AssociateVpcCount")
        private Integer associateVpcCount;

        @NameInMap("DhcpOptions")
        private DhcpOptions dhcpOptions;

        @NameInMap("DhcpOptionsSetDescription")
        private String dhcpOptionsSetDescription;

        @NameInMap("DhcpOptionsSetId")
        private String dhcpOptionsSetId;

        @NameInMap("DhcpOptionsSetName")
        private String dhcpOptionsSetName;

        @NameInMap("OwnerId")
        private Long ownerId;

        @NameInMap("Status")
        private String status;

        private DhcpOptionsSets(Builder builder) {
            this.associateVpcCount = builder.associateVpcCount;
            this.dhcpOptions = builder.dhcpOptions;
            this.dhcpOptionsSetDescription = builder.dhcpOptionsSetDescription;
            this.dhcpOptionsSetId = builder.dhcpOptionsSetId;
            this.dhcpOptionsSetName = builder.dhcpOptionsSetName;
            this.ownerId = builder.ownerId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DhcpOptionsSets create() {
            return builder().build();
        }

        /**
         * @return associateVpcCount
         */
        public Integer getAssociateVpcCount() {
            return this.associateVpcCount;
        }

        /**
         * @return dhcpOptions
         */
        public DhcpOptions getDhcpOptions() {
            return this.dhcpOptions;
        }

        /**
         * @return dhcpOptionsSetDescription
         */
        public String getDhcpOptionsSetDescription() {
            return this.dhcpOptionsSetDescription;
        }

        /**
         * @return dhcpOptionsSetId
         */
        public String getDhcpOptionsSetId() {
            return this.dhcpOptionsSetId;
        }

        /**
         * @return dhcpOptionsSetName
         */
        public String getDhcpOptionsSetName() {
            return this.dhcpOptionsSetName;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer associateVpcCount; 
            private DhcpOptions dhcpOptions; 
            private String dhcpOptionsSetDescription; 
            private String dhcpOptionsSetId; 
            private String dhcpOptionsSetName; 
            private Long ownerId; 
            private String status; 

            /**
             * AssociateVpcCount.
             */
            public Builder associateVpcCount(Integer associateVpcCount) {
                this.associateVpcCount = associateVpcCount;
                return this;
            }

            /**
             * DhcpOptions.
             */
            public Builder dhcpOptions(DhcpOptions dhcpOptions) {
                this.dhcpOptions = dhcpOptions;
                return this;
            }

            /**
             * DhcpOptionsSetDescription.
             */
            public Builder dhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
                this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
                return this;
            }

            /**
             * DhcpOptionsSetId.
             */
            public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
                this.dhcpOptionsSetId = dhcpOptionsSetId;
                return this;
            }

            /**
             * DhcpOptionsSetName.
             */
            public Builder dhcpOptionsSetName(String dhcpOptionsSetName) {
                this.dhcpOptionsSetName = dhcpOptionsSetName;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DhcpOptionsSets build() {
                return new DhcpOptionsSets(this);
            } 

        } 

    }
}
