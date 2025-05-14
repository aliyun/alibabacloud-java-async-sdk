// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link GetErResponseBody} extends {@link TeaModel}
 *
 * <p>GetErResponseBody</p>
 */
public class GetErResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetErResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetErResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.content = model.content;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>Information returned when the call fails</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>308DE9D2-03A6-5B44-A369-67B75D1EE091</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetErResponseBody build() {
            return new GetErResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetErResponseBody} extends {@link TeaModel}
     *
     * <p>GetErResponseBody</p>
     */
    public static class ErAttachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Across")
        private Boolean across;

        @com.aliyun.core.annotation.NameInMap("AutoReceiveAllRoute")
        private Boolean autoReceiveAllRoute;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErAttachmentId")
        private String erAttachmentId;

        @com.aliyun.core.annotation.NameInMap("ErAttachmentName")
        private String erAttachmentName;

        @com.aliyun.core.annotation.NameInMap("ErId")
        private String erId;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceTenantId")
        private String resourceTenantId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private ErAttachments(Builder builder) {
            this.across = builder.across;
            this.autoReceiveAllRoute = builder.autoReceiveAllRoute;
            this.createTime = builder.createTime;
            this.erAttachmentId = builder.erAttachmentId;
            this.erAttachmentName = builder.erAttachmentName;
            this.erId = builder.erId;
            this.gmtModified = builder.gmtModified;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.message = builder.message;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceTenantId = builder.resourceTenantId;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErAttachments create() {
            return builder().build();
        }

        /**
         * @return across
         */
        public Boolean getAcross() {
            return this.across;
        }

        /**
         * @return autoReceiveAllRoute
         */
        public Boolean getAutoReceiveAllRoute() {
            return this.autoReceiveAllRoute;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return erAttachmentId
         */
        public String getErAttachmentId() {
            return this.erAttachmentId;
        }

        /**
         * @return erAttachmentName
         */
        public String getErAttachmentName() {
            return this.erAttachmentName;
        }

        /**
         * @return erId
         */
        public String getErId() {
            return this.erId;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceTenantId
         */
        public String getResourceTenantId() {
            return this.resourceTenantId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private Boolean across; 
            private Boolean autoReceiveAllRoute; 
            private String createTime; 
            private String erAttachmentId; 
            private String erAttachmentName; 
            private String erId; 
            private String gmtModified; 
            private String instanceId; 
            private String instanceName; 
            private String instanceType; 
            private String message; 
            private String regionId; 
            private String resourceGroupId; 
            private String resourceTenantId; 
            private String status; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(ErAttachments model) {
                this.across = model.across;
                this.autoReceiveAllRoute = model.autoReceiveAllRoute;
                this.createTime = model.createTime;
                this.erAttachmentId = model.erAttachmentId;
                this.erAttachmentName = model.erAttachmentName;
                this.erId = model.erId;
                this.gmtModified = model.gmtModified;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceType = model.instanceType;
                this.message = model.message;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceTenantId = model.resourceTenantId;
                this.status = model.status;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>Cross-account</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder across(Boolean across) {
                this.across = across;
                return this;
            }

            /**
             * <p>Receive all routes automatically</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoReceiveAllRoute(Boolean autoReceiveAllRoute) {
                this.autoReceiveAllRoute = autoReceiveAllRoute;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1644283112720</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The connection ID of the Lingjun HUB network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>er-attachment-f32hxfsu</p>
             */
            public Builder erAttachmentId(String erAttachmentId) {
                this.erAttachmentId = erAttachmentId;
                return this;
            }

            /**
             * <p>Network Instance Name</p>
             * 
             * <strong>example:</strong>
             * <p>fudan-egpu</p>
             */
            public Builder erAttachmentName(String erAttachmentName) {
                this.erAttachmentName = erAttachmentName;
                return this;
            }

            /**
             * <p>Lingjun HUB Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>er-kkopgtne</p>
             */
            public Builder erId(String erId) {
                this.erId = erId;
                return this;
            }

            /**
             * <p>The time when the agent was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1649303733000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-kkopgtne</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>zhijiao</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Instance type: VPD and VCC</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>VCC: Lingjun Connection.</li>
             * <li>VPD: Lingjun network segment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPD</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The synchronized region where the ECS instances are deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Resource group instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzzka6bnjvbi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the tenant to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxx</p>
             */
            public Builder resourceTenantId(String resourceTenantId) {
                this.resourceTenantId = resourceTenantId;
                return this;
            }

            /**
             * <p>The status of the intervention entry. Valid value:</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166277</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public ErAttachments build() {
                return new ErAttachments(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetErResponseBody} extends {@link TeaModel}
     *
     * <p>GetErResponseBody</p>
     */
    public static class ErRouteEntrys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("ErId")
        private String erId;

        @com.aliyun.core.annotation.NameInMap("ErRouteEntryId")
        private String erRouteEntryId;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceTenantId")
        private String resourceTenantId;

        @com.aliyun.core.annotation.NameInMap("RouteType")
        private String routeType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private ErRouteEntrys(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.erId = builder.erId;
            this.erRouteEntryId = builder.erRouteEntryId;
            this.gmtModified = builder.gmtModified;
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceTenantId = builder.resourceTenantId;
            this.routeType = builder.routeType;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErRouteEntrys create() {
            return builder().build();
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return erId
         */
        public String getErId() {
            return this.erId;
        }

        /**
         * @return erRouteEntryId
         */
        public String getErRouteEntryId() {
            return this.erRouteEntryId;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceTenantId
         */
        public String getResourceTenantId() {
            return this.resourceTenantId;
        }

        /**
         * @return routeType
         */
        public String getRouteType() {
            return this.routeType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String destinationCidrBlock; 
            private String erId; 
            private String erRouteEntryId; 
            private String gmtModified; 
            private String nextHopId; 
            private String nextHopType; 
            private String regionId; 
            private String resourceGroupId; 
            private String resourceTenantId; 
            private String routeType; 
            private String status; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(ErRouteEntrys model) {
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.erId = model.erId;
                this.erRouteEntryId = model.erRouteEntryId;
                this.gmtModified = model.gmtModified;
                this.nextHopId = model.nextHopId;
                this.nextHopType = model.nextHopType;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceTenantId = model.resourceTenantId;
                this.routeType = model.routeType;
                this.status = model.status;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>Destination CIDR Block</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/9</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>Lingjun HUB Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>er-kkopgtne</p>
             */
            public Builder erId(String erId) {
                this.erId = erId;
                return this;
            }

            /**
             * <p>The ID of the route entry.</p>
             * 
             * <strong>example:</strong>
             * <p>er-rte-xnmsd2kl</p>
             */
            public Builder erRouteEntryId(String erRouteEntryId) {
                this.erRouteEntryId = erRouteEntryId;
                return this;
            }

            /**
             * <p>The time when the cluster was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1623317089000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Next Hop Instance</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-xxkmggkw</p>
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * <p>Next Hop Instance Type</p>
             * 
             * <strong>example:</strong>
             * <p>VCC</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Resource group instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyoj5mg3w54y</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the tenant to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166277</p>
             */
            public Builder resourceTenantId(String resourceTenantId) {
                this.resourceTenantId = resourceTenantId;
                return this;
            }

            /**
             * <p>Route type</p>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            /**
             * <p>The status of the intervention entry. Valid value:</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166277</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public ErRouteEntrys build() {
                return new ErRouteEntrys(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetErResponseBody} extends {@link TeaModel}
     *
     * <p>GetErResponseBody</p>
     */
    public static class ErRouteMaps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("ErId")
        private String erId;

        @com.aliyun.core.annotation.NameInMap("ErRouteMapId")
        private String erRouteMapId;

        @com.aliyun.core.annotation.NameInMap("ErRouteMapName")
        private String erRouteMapName;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ReceptionInstanceId")
        private String receptionInstanceId;

        @com.aliyun.core.annotation.NameInMap("ReceptionInstanceName")
        private String receptionInstanceName;

        @com.aliyun.core.annotation.NameInMap("ReceptionInstanceOwner")
        private String receptionInstanceOwner;

        @com.aliyun.core.annotation.NameInMap("ReceptionInstanceType")
        private String receptionInstanceType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RouteMapNum")
        private Integer routeMapNum;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TransmissionInstanceId")
        private String transmissionInstanceId;

        @com.aliyun.core.annotation.NameInMap("TransmissionInstanceName")
        private String transmissionInstanceName;

        @com.aliyun.core.annotation.NameInMap("TransmissionInstanceOwner")
        private String transmissionInstanceOwner;

        @com.aliyun.core.annotation.NameInMap("TransmissionInstanceType")
        private String transmissionInstanceType;

        private ErRouteMaps(Builder builder) {
            this.action = builder.action;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.erId = builder.erId;
            this.erRouteMapId = builder.erRouteMapId;
            this.erRouteMapName = builder.erRouteMapName;
            this.gmtModified = builder.gmtModified;
            this.message = builder.message;
            this.receptionInstanceId = builder.receptionInstanceId;
            this.receptionInstanceName = builder.receptionInstanceName;
            this.receptionInstanceOwner = builder.receptionInstanceOwner;
            this.receptionInstanceType = builder.receptionInstanceType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.routeMapNum = builder.routeMapNum;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.transmissionInstanceId = builder.transmissionInstanceId;
            this.transmissionInstanceName = builder.transmissionInstanceName;
            this.transmissionInstanceOwner = builder.transmissionInstanceOwner;
            this.transmissionInstanceType = builder.transmissionInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErRouteMaps create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return erId
         */
        public String getErId() {
            return this.erId;
        }

        /**
         * @return erRouteMapId
         */
        public String getErRouteMapId() {
            return this.erRouteMapId;
        }

        /**
         * @return erRouteMapName
         */
        public String getErRouteMapName() {
            return this.erRouteMapName;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return receptionInstanceId
         */
        public String getReceptionInstanceId() {
            return this.receptionInstanceId;
        }

        /**
         * @return receptionInstanceName
         */
        public String getReceptionInstanceName() {
            return this.receptionInstanceName;
        }

        /**
         * @return receptionInstanceOwner
         */
        public String getReceptionInstanceOwner() {
            return this.receptionInstanceOwner;
        }

        /**
         * @return receptionInstanceType
         */
        public String getReceptionInstanceType() {
            return this.receptionInstanceType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return routeMapNum
         */
        public Integer getRouteMapNum() {
            return this.routeMapNum;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return transmissionInstanceId
         */
        public String getTransmissionInstanceId() {
            return this.transmissionInstanceId;
        }

        /**
         * @return transmissionInstanceName
         */
        public String getTransmissionInstanceName() {
            return this.transmissionInstanceName;
        }

        /**
         * @return transmissionInstanceOwner
         */
        public String getTransmissionInstanceOwner() {
            return this.transmissionInstanceOwner;
        }

        /**
         * @return transmissionInstanceType
         */
        public String getTransmissionInstanceType() {
            return this.transmissionInstanceType;
        }

        public static final class Builder {
            private String action; 
            private String createTime; 
            private String description; 
            private String destinationCidrBlock; 
            private String erId; 
            private String erRouteMapId; 
            private String erRouteMapName; 
            private String gmtModified; 
            private String message; 
            private String receptionInstanceId; 
            private String receptionInstanceName; 
            private String receptionInstanceOwner; 
            private String receptionInstanceType; 
            private String regionId; 
            private String resourceGroupId; 
            private Integer routeMapNum; 
            private String status; 
            private String tenantId; 
            private String transmissionInstanceId; 
            private String transmissionInstanceName; 
            private String transmissionInstanceOwner; 
            private String transmissionInstanceType; 

            private Builder() {
            } 

            private Builder(ErRouteMaps model) {
                this.action = model.action;
                this.createTime = model.createTime;
                this.description = model.description;
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.erId = model.erId;
                this.erRouteMapId = model.erRouteMapId;
                this.erRouteMapName = model.erRouteMapName;
                this.gmtModified = model.gmtModified;
                this.message = model.message;
                this.receptionInstanceId = model.receptionInstanceId;
                this.receptionInstanceName = model.receptionInstanceName;
                this.receptionInstanceOwner = model.receptionInstanceOwner;
                this.receptionInstanceType = model.receptionInstanceType;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.routeMapNum = model.routeMapNum;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.transmissionInstanceId = model.transmissionInstanceId;
                this.transmissionInstanceName = model.transmissionInstanceName;
                this.transmissionInstanceOwner = model.transmissionInstanceOwner;
                this.transmissionInstanceType = model.transmissionInstanceType;
            } 

            /**
             * <p>Policy behavior</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>deny: rejects the.</li>
             * <li>permit: The allows.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>permit</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1645766599809</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Policy description</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Destination CIDR Block</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>Lingjun HUB ID</p>
             * 
             * <strong>example:</strong>
             * <p>er-kkopgtne</p>
             */
            public Builder erId(String erId) {
                this.erId = erId;
                return this;
            }

            /**
             * <p>routing policy ID</p>
             * 
             * <strong>example:</strong>
             * <p>er-rmap-xkslnmsr</p>
             */
            public Builder erRouteMapId(String erRouteMapId) {
                this.erRouteMapId = erRouteMapId;
                return this;
            }

            /**
             * <p>The name of the routing policy.</p>
             * 
             * <strong>example:</strong>
             * <p>route-map-name</p>
             */
            public Builder erRouteMapName(String erRouteMapName) {
                this.erRouteMapName = erRouteMapName;
                return this;
            }

            /**
             * <p>The time when the agent was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1623899444000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The message that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-sdkd2gkx</p>
             */
            public Builder receptionInstanceId(String receptionInstanceId) {
                this.receptionInstanceId = receptionInstanceId;
                return this;
            }

            /**
             * <p>The name of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Reception-name</p>
             */
            public Builder receptionInstanceName(String receptionInstanceName) {
                this.receptionInstanceName = receptionInstanceName;
                return this;
            }

            /**
             * <p>The tenant to which the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166277</p>
             */
            public Builder receptionInstanceOwner(String receptionInstanceOwner) {
                this.receptionInstanceOwner = receptionInstanceOwner;
                return this;
            }

            /**
             * <p>The type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>VPD</p>
             */
            public Builder receptionInstanceType(String receptionInstanceType) {
                this.receptionInstanceType = receptionInstanceType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Resource group instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzaq3ypaqkdy</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Policy sequence number (1001-2000)</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder routeMapNum(Integer routeMapNum) {
                this.routeMapNum = routeMapNum;
                return this;
            }

            /**
             * <p>The status of the intervention entry. Valid value:</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>XXQGPROD-zh_CN</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The ID of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-xmglsymg</p>
             */
            public Builder transmissionInstanceId(String transmissionInstanceId) {
                this.transmissionInstanceId = transmissionInstanceId;
                return this;
            }

            /**
             * <p>Source instance name</p>
             * 
             * <strong>example:</strong>
             * <p>test-transmission</p>
             */
            public Builder transmissionInstanceName(String transmissionInstanceName) {
                this.transmissionInstanceName = transmissionInstanceName;
                return this;
            }

            /**
             * <p>The tenant to which the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166277</p>
             */
            public Builder transmissionInstanceOwner(String transmissionInstanceOwner) {
                this.transmissionInstanceOwner = transmissionInstanceOwner;
                return this;
            }

            /**
             * <p>The type of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>VPD</p>
             */
            public Builder transmissionInstanceType(String transmissionInstanceType) {
                this.transmissionInstanceType = transmissionInstanceType;
                return this;
            }

            public ErRouteMaps build() {
                return new ErRouteMaps(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetErResponseBody} extends {@link TeaModel}
     *
     * <p>GetErResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetErResponseBody} extends {@link TeaModel}
     *
     * <p>GetErResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErAttachments")
        private java.util.List<ErAttachments> erAttachments;

        @com.aliyun.core.annotation.NameInMap("ErId")
        private String erId;

        @com.aliyun.core.annotation.NameInMap("ErName")
        private String erName;

        @com.aliyun.core.annotation.NameInMap("ErRouteEntrys")
        private java.util.List<ErRouteEntrys> erRouteEntrys;

        @com.aliyun.core.annotation.NameInMap("ErRouteMaps")
        private java.util.List<ErRouteMaps> erRouteMaps;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("MasterZoneId")
        private String masterZoneId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private Content(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.erAttachments = builder.erAttachments;
            this.erId = builder.erId;
            this.erName = builder.erName;
            this.erRouteEntrys = builder.erRouteEntrys;
            this.erRouteMaps = builder.erRouteMaps;
            this.gmtModified = builder.gmtModified;
            this.masterZoneId = builder.masterZoneId;
            this.message = builder.message;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return erAttachments
         */
        public java.util.List<ErAttachments> getErAttachments() {
            return this.erAttachments;
        }

        /**
         * @return erId
         */
        public String getErId() {
            return this.erId;
        }

        /**
         * @return erName
         */
        public String getErName() {
            return this.erName;
        }

        /**
         * @return erRouteEntrys
         */
        public java.util.List<ErRouteEntrys> getErRouteEntrys() {
            return this.erRouteEntrys;
        }

        /**
         * @return erRouteMaps
         */
        public java.util.List<ErRouteMaps> getErRouteMaps() {
            return this.erRouteMaps;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return masterZoneId
         */
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private java.util.List<ErAttachments> erAttachments; 
            private String erId; 
            private String erName; 
            private java.util.List<ErRouteEntrys> erRouteEntrys; 
            private java.util.List<ErRouteMaps> erRouteMaps; 
            private String gmtModified; 
            private String masterZoneId; 
            private String message; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.erAttachments = model.erAttachments;
                this.erId = model.erId;
                this.erName = model.erName;
                this.erRouteEntrys = model.erRouteEntrys;
                this.erRouteMaps = model.erRouteMaps;
                this.gmtModified = model.gmtModified;
                this.masterZoneId = model.masterZoneId;
                this.message = model.message;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1644283112720</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Network instance information list</p>
             */
            public Builder erAttachments(java.util.List<ErAttachments> erAttachments) {
                this.erAttachments = erAttachments;
                return this;
            }

            /**
             * <p>Lingjun HUB Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>er-aueyxxsy</p>
             */
            public Builder erId(String erId) {
                this.erId = erId;
                return this;
            }

            /**
             * <p>Lingjun HUB Instance Name</p>
             * 
             * <strong>example:</strong>
             * <p>er-heyuan-main</p>
             */
            public Builder erName(String erName) {
                this.erName = erName;
                return this;
            }

            /**
             * <p>The list of route entry information.</p>
             */
            public Builder erRouteEntrys(java.util.List<ErRouteEntrys> erRouteEntrys) {
                this.erRouteEntrys = erRouteEntrys;
                return this;
            }

            /**
             * <p>routing policy information list</p>
             */
            public Builder erRouteMaps(java.util.List<ErRouteMaps> erRouteMaps) {
                this.erRouteMaps = erRouteMaps;
                return this;
            }

            /**
             * <p>The time when the agent was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1627545952000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Primary Zone</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu-b</p>
             */
            public Builder masterZoneId(String masterZoneId) {
                this.masterZoneId = masterZoneId;
                return this;
            }

            /**
             * <p>The message that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Resource group instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzlki4ehfse4y</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the intervention entry. Valid value:</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166277</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
