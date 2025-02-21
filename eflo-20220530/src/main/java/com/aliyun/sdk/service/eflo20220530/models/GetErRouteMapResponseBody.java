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
 * {@link GetErRouteMapResponseBody} extends {@link TeaModel}
 *
 * <p>GetErRouteMapResponseBody</p>
 */
public class GetErRouteMapResponseBody extends TeaModel {
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

    private GetErRouteMapResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErRouteMapResponseBody create() {
        return builder().build();
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

        /**
         * AccessDeniedDetail.
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
         * <p>The returned data.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetErRouteMapResponseBody build() {
            return new GetErRouteMapResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetErRouteMapResponseBody} extends {@link TeaModel}
     *
     * <p>GetErRouteMapResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

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

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

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

        private Content(Builder builder) {
            this.action = builder.action;
            this.description = builder.description;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.erId = builder.erId;
            this.erRouteMapId = builder.erRouteMapId;
            this.erRouteMapName = builder.erRouteMapName;
            this.gmtCreate = builder.gmtCreate;
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

        public static Content create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
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
            private String description; 
            private String destinationCidrBlock; 
            private String erId; 
            private String erRouteMapId; 
            private String erRouteMapName; 
            private String gmtCreate; 
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

            /**
             * <p>Policy behavior; optional values:</p>
             * <ul>
             * <li><strong>permit</strong>: Allow</li>
             * <li><strong>deny</strong>: Rejected</li>
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
             * <p>Policy description</p>
             * 
             * <strong>example:</strong>
             * <p>ssss</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Destination CIDR block</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
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
             * <p>Lingjun HUB routing policy ID</p>
             * 
             * <strong>example:</strong>
             * <p>er-rmap-uwglhzom</p>
             */
            public Builder erRouteMapId(String erRouteMapId) {
                this.erRouteMapId = erRouteMapId;
                return this;
            }

            /**
             * <p>Lingjun HUB routing policy Name</p>
             * 
             * <strong>example:</strong>
             * <p>er-rmap-wulanchabu</p>
             */
            public Builder erRouteMapName(String erRouteMapName) {
                this.erRouteMapName = erRouteMapName;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1648085472000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the agent was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1648085472000</p>
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
             * <p>Receive Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-x25vxrb2</p>
             */
            public Builder receptionInstanceId(String receptionInstanceId) {
                this.receptionInstanceId = receptionInstanceId;
                return this;
            }

            /**
             * <p>Receive Instance Name</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-receprion</p>
             */
            public Builder receptionInstanceName(String receptionInstanceName) {
                this.receptionInstanceName = receptionInstanceName;
                return this;
            }

            /**
             * <p>The tenant to which the receiving instance belongs</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166277</p>
             */
            public Builder receptionInstanceOwner(String receptionInstanceOwner) {
                this.receptionInstanceOwner = receptionInstanceOwner;
                return this;
            }

            /**
             * <p>The type of the received instance. Optional values:</p>
             * <ul>
             * <li><strong>VPD</strong>: Lingjun network segment.</li>
             * <li><strong>VCC</strong>: Lingjun Connection.</li>
             * </ul>
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
             * <p>rg-aekzlki4ehfse4y</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * <p>A smaller sequence number indicates a lower priority. When a route is matched, a policy with a higher priority is preferentially matched.</p>
             * <p><strong>Valid values: 1001 to 2000</strong></p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder routeMapNum(Integer routeMapNum) {
                this.routeMapNum = routeMapNum;
                return this;
            }

            /**
             * <p>The status of the cache reserve instance. Valid values:</p>
             * <ul>
             * <li><strong>Available</strong></li>
             * <li><strong>Not Available</strong>: Unavailable</li>
             * <li><strong>Executing</strong>: Executing</li>
             * <li><strong>Deleting</strong>: The node is being deleted.</li>
             * </ul>
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
             * <p>1655449505171</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Release Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-xgkb2kl</p>
             */
            public Builder transmissionInstanceId(String transmissionInstanceId) {
                this.transmissionInstanceId = transmissionInstanceId;
                return this;
            }

            /**
             * <p>Release Instance Name</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-transimit</p>
             */
            public Builder transmissionInstanceName(String transmissionInstanceName) {
                this.transmissionInstanceName = transmissionInstanceName;
                return this;
            }

            /**
             * <p>The tenant to which the published instance belongs</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166277</p>
             */
            public Builder transmissionInstanceOwner(String transmissionInstanceOwner) {
                this.transmissionInstanceOwner = transmissionInstanceOwner;
                return this;
            }

            /**
             * <p>Publish instance type; optional values:</p>
             * <ul>
             * <li><strong>VPD</strong>: Lingjun network segment.</li>
             * <li><strong>VCC</strong>: Lingjun Connection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPD</p>
             */
            public Builder transmissionInstanceType(String transmissionInstanceType) {
                this.transmissionInstanceType = transmissionInstanceType;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
