// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVpnAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnAttachmentsResponseBody</p>
 */
public class DescribeVpnAttachmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VpnAttachments")
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9F0725BB-186A-3564-91C3-AAE48042F853</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of IPsec-VPN connections associated with the transit router.</p>
         */
        public Builder vpnAttachments(java.util.List < VpnAttachments> vpnAttachments) {
            this.vpnAttachments = vpnAttachments;
            return this;
        }

        public DescribeVpnAttachmentsResponseBody build() {
            return new DescribeVpnAttachmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpnAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnAttachmentsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnAttachmentsResponseBody</p>
     */
    public static class VpnAttachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachType")
        private String attachType;

        @com.aliyun.core.annotation.NameInMap("CrossAccountAuthorized")
        private Boolean crossAccountAuthorized;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterName")
        private String transitRouterName;

        private VpnAttachments(Builder builder) {
            this.attachType = builder.attachType;
            this.crossAccountAuthorized = builder.crossAccountAuthorized;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.tag = builder.tag;
            this.tags = builder.tags;
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
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
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
            private String tag; 
            private java.util.List < Tags> tags; 
            private String transitRouterId; 
            private String transitRouterName; 

            /**
             * <p>The type of resource that is associated with the IPsec-VPN connection. The value is set to <strong>CEN</strong>, which indicates that the IPsec-VPN connection is associated with a transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>CEN</p>
             */
            public Builder attachType(String attachType) {
                this.attachType = attachType;
                return this;
            }

            /**
             * <p>Indicates whether the IPsec-VPN connection is associated with a transit router that belongs to another Alibaba Cloud account. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder crossAccountAuthorized(Boolean crossAccountAuthorized) {
                this.crossAccountAuthorized = crossAccountAuthorized;
                return this;
            }

            /**
             * <p>The description of the IPsec-VPN connection.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the IPsec-VPN connection.</p>
             * 
             * <strong>example:</strong>
             * <p>vco-p0w2jpkhi2eeop6q6****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the IPsec-VPN connection.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the transit router with which the IPsec-VPN connection is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-p0wkh4yryb1dnanqw****</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * <p>The name of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest2</p>
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
