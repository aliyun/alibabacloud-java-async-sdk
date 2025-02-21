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
 * {@link ListErAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListErAttachmentsResponseBody</p>
 */
public class ListErAttachmentsResponseBody extends TeaModel {
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

    private ListErAttachmentsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListErAttachmentsResponseBody create() {
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
         * <p>The data returned.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is displayed.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3D9D6E7B-365B-5200-BFA6-9B79E269058C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListErAttachmentsResponseBody build() {
            return new ListErAttachmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListErAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListErAttachmentsResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            /**
             * <p>Whether to cross accounts. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The network instance is a cross-account resource.</li>
             * <li><strong>false</strong>: The current network instance is a resource of the current account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder across(Boolean across) {
                this.across = across;
                return this;
            }

            /**
             * <p>Whether to automatically receive all routes from all instances under this Lingjun HUB. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: received automatically.</li>
             * <li><strong>false</strong>: Not received.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoReceiveAllRoute(Boolean autoReceiveAllRoute) {
                this.autoReceiveAllRoute = autoReceiveAllRoute;
                return this;
            }

            /**
             * <p>The time when the activation code was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1669734207000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the Lingjun HUB network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>er-attachment-i1ioibyf</p>
             */
            public Builder erAttachmentId(String erAttachmentId) {
                this.erAttachmentId = erAttachmentId;
                return this;
            }

            /**
             * <p>The name of the Lingjun HUB network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-cn-209300qha01</p>
             */
            public Builder erAttachmentName(String erAttachmentName) {
                this.erAttachmentName = erAttachmentName;
                return this;
            }

            /**
             * <p>The ID of the Lingjun HUB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>er-kkopgtne</p>
             */
            public Builder erId(String erId) {
                this.erId = erId;
                return this;
            }

            /**
             * <p>The time when the O&amp;M task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1640187007000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the network instance. Valid values: <strong>VPD</strong> and <strong>VCC</strong>.</p>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/444430.html">What is Lingjun?</a></p>
             * <p>You can query <strong>Lingjun CIDR blocks</strong> and <strong>Lingjun connections</strong> by <a href="https://help.aliyun.com/document_detail/2331077.html">ListVpds</a> and <a href="https://help.aliyun.com/document_detail/2399526.html">ListVccs</a> respectively.</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-cn-209300qha02</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-wulanchabu-main</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The database type. Valid values:</p>
             * <ul>
             * <li><strong>VPD</strong>: indicates the Lingjun CIDR block.</li>
             * <li><strong>VCC</strong>: indicates a Lingjun connection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VCC</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Lingjun HUB region information.</p>
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
             * <p>The ID of the tenant to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1111156667137893</p>
             */
            public Builder resourceTenantId(String resourceTenantId) {
                this.resourceTenantId = resourceTenantId;
                return this;
            }

            /**
             * <p>The status of the cache reserve instance. Valid values:</p>
             * <ul>
             * <li><strong>Available</strong>: Normal.</li>
             * <li><strong>Not Available</strong>: Not available.</li>
             * <li><strong>Executing</strong>: The task is being executed.</li>
             * <li><strong>Deleting</strong>: The account is being deleted</li>
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
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1655449505171</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListErAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListErAttachmentsResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Content(Builder builder) {
            this.data = builder.data;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Long total; 

            /**
             * <p>The list of Lingjun HUB network instances.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of entries that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
