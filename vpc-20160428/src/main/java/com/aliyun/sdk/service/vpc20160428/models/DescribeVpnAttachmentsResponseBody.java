// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnAttachmentsResponseBody</p>
 */
public class DescribeVpnAttachmentsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpnAttachments")
    private java.util.List < VpnAttachments> vpnAttachments;

    private DescribeVpnAttachmentsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpnAttachments = builder.vpnAttachments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnAttachmentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpnAttachments
     */
    public java.util.List < VpnAttachments> getVpnAttachments() {
        return this.vpnAttachments;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < VpnAttachments> vpnAttachments; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The list of IPsec-VPN connections associated with the transit router.
         */
        public Builder vpnAttachments(java.util.List < VpnAttachments> vpnAttachments) {
            this.vpnAttachments = vpnAttachments;
            return this;
        }

        public DescribeVpnAttachmentsResponseBody build() {
            return new DescribeVpnAttachmentsResponseBody(this);
        } 

    } 

    public static class VpnAttachments extends TeaModel {
        @NameInMap("AttachType")
        private String attachType;

        @NameInMap("CrossAccountAuthorized")
        private Boolean crossAccountAuthorized;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("TransitRouterId")
        private String transitRouterId;

        @NameInMap("TransitRouterName")
        private String transitRouterName;

        private VpnAttachments(Builder builder) {
            this.attachType = builder.attachType;
            this.crossAccountAuthorized = builder.crossAccountAuthorized;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.transitRouterId = builder.transitRouterId;
            this.transitRouterName = builder.transitRouterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnAttachments create() {
            return builder().build();
        }

        /**
         * @return attachType
         */
        public String getAttachType() {
            return this.attachType;
        }

        /**
         * @return crossAccountAuthorized
         */
        public Boolean getCrossAccountAuthorized() {
            return this.crossAccountAuthorized;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return transitRouterName
         */
        public String getTransitRouterName() {
            return this.transitRouterName;
        }

        public static final class Builder {
            private String attachType; 
            private Boolean crossAccountAuthorized; 
            private String description; 
            private String instanceId; 
            private String name; 
            private String transitRouterId; 
            private String transitRouterName; 

            /**
             * The type of resource that is associated with the IPsec-VPN connection. The value is set to **CEN**, which indicates that the IPsec-VPN connection is associated with a transit router.
             */
            public Builder attachType(String attachType) {
                this.attachType = attachType;
                return this;
            }

            /**
             * Indicates whether the IPsec-VPN connection is associated with a transit router that belongs to another Alibaba Cloud account. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder crossAccountAuthorized(Boolean crossAccountAuthorized) {
                this.crossAccountAuthorized = crossAccountAuthorized;
                return this;
            }

            /**
             * The description of the IPsec-VPN connection.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the IPsec-VPN connection.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the IPsec-VPN connection.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the transit router with which the IPsec-VPN connection is associated.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * The name of the transit router.
             */
            public Builder transitRouterName(String transitRouterName) {
                this.transitRouterName = transitRouterName;
                return this;
            }

            public VpnAttachments build() {
                return new VpnAttachments(this);
            } 

        } 

    }
}
