// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDhcpOptionsSetResponseBody} extends {@link TeaModel}
 *
 * <p>GetDhcpOptionsSetResponseBody</p>
 */
public class GetDhcpOptionsSetResponseBody extends TeaModel {
    @NameInMap("AssociateVpcs")
    private java.util.List < AssociateVpcs> associateVpcs;

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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private GetDhcpOptionsSetResponseBody(Builder builder) {
        this.associateVpcs = builder.associateVpcs;
        this.dhcpOptions = builder.dhcpOptions;
        this.dhcpOptionsSetDescription = builder.dhcpOptionsSetDescription;
        this.dhcpOptionsSetId = builder.dhcpOptionsSetId;
        this.dhcpOptionsSetName = builder.dhcpOptionsSetName;
        this.ownerId = builder.ownerId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDhcpOptionsSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return associateVpcs
     */
    public java.util.List < AssociateVpcs> getAssociateVpcs() {
        return this.associateVpcs;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List < AssociateVpcs> associateVpcs; 
        private DhcpOptions dhcpOptions; 
        private String dhcpOptionsSetDescription; 
        private String dhcpOptionsSetId; 
        private String dhcpOptionsSetName; 
        private Long ownerId; 
        private String requestId; 
        private String status; 

        /**
         * AssociateVpcs.
         */
        public Builder associateVpcs(java.util.List < AssociateVpcs> associateVpcs) {
            this.associateVpcs = associateVpcs;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetDhcpOptionsSetResponseBody build() {
            return new GetDhcpOptionsSetResponseBody(this);
        } 

    } 

    public static class AssociateVpcs extends TeaModel {
        @NameInMap("AssociateStatus")
        private String associateStatus;

        @NameInMap("VpcId")
        private String vpcId;

        private AssociateVpcs(Builder builder) {
            this.associateStatus = builder.associateStatus;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociateVpcs create() {
            return builder().build();
        }

        /**
         * @return associateStatus
         */
        public String getAssociateStatus() {
            return this.associateStatus;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String associateStatus; 
            private String vpcId; 

            /**
             * AssociateStatus.
             */
            public Builder associateStatus(String associateStatus) {
                this.associateStatus = associateStatus;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public AssociateVpcs build() {
                return new AssociateVpcs(this);
            } 

        } 

    }
    public static class DhcpOptions extends TeaModel {
        @NameInMap("BootFileName")
        private String bootFileName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainNameServers")
        private String domainNameServers;

        @NameInMap("TFTPServerName")
        private String TFTPServerName;

        private DhcpOptions(Builder builder) {
            this.bootFileName = builder.bootFileName;
            this.domainName = builder.domainName;
            this.domainNameServers = builder.domainNameServers;
            this.TFTPServerName = builder.TFTPServerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DhcpOptions create() {
            return builder().build();
        }

        /**
         * @return bootFileName
         */
        public String getBootFileName() {
            return this.bootFileName;
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

        /**
         * @return TFTPServerName
         */
        public String getTFTPServerName() {
            return this.TFTPServerName;
        }

        public static final class Builder {
            private String bootFileName; 
            private String domainName; 
            private String domainNameServers; 
            private String TFTPServerName; 

            /**
             * BootFileName.
             */
            public Builder bootFileName(String bootFileName) {
                this.bootFileName = bootFileName;
                return this;
            }

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

            /**
             * TFTPServerName.
             */
            public Builder TFTPServerName(String TFTPServerName) {
                this.TFTPServerName = TFTPServerName;
                return this;
            }

            public DhcpOptions build() {
                return new DhcpOptions(this);
            } 

        } 

    }
}
