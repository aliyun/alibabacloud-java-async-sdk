// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ListSmartAGByAccessPointResponseBody} extends {@link TeaModel}
 *
 * <p>ListSmartAGByAccessPointResponseBody</p>
 */
public class ListSmartAGByAccessPointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmartAccessGateways")
    private java.util.List<SmartAccessGateways> smartAccessGateways;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSmartAGByAccessPointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.smartAccessGateways = builder.smartAccessGateways;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSmartAGByAccessPointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smartAccessGateways
     */
    public java.util.List<SmartAccessGateways> getSmartAccessGateways() {
        return this.smartAccessGateways;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SmartAccessGateways> smartAccessGateways; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSmartAGByAccessPointResponseBody model) {
            this.requestId = model.requestId;
            this.smartAccessGateways = model.smartAccessGateways;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AE203140-5D0C-4B4D-88D1-D008206B3A01</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the SAG instance.</p>
         */
        public Builder smartAccessGateways(java.util.List<SmartAccessGateways> smartAccessGateways) {
            this.smartAccessGateways = smartAccessGateways;
            return this;
        }

        /**
         * <p>The number of SAG instances within the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSmartAGByAccessPointResponseBody build() {
            return new ListSmartAGByAccessPointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSmartAGByAccessPointResponseBody} extends {@link TeaModel}
     *
     * <p>ListSmartAGByAccessPointResponseBody</p>
     */
    public static class SmartAccessGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedCcnId")
        private String associatedCcnId;

        @com.aliyun.core.annotation.NameInMap("HardwareVersion")
        private String hardwareVersion;

        @com.aliyun.core.annotation.NameInMap("RoutingStrategy")
        private String routingStrategy;

        @com.aliyun.core.annotation.NameInMap("SmartAGDescription")
        private String smartAGDescription;

        @com.aliyun.core.annotation.NameInMap("SmartAGId")
        private String smartAGId;

        @com.aliyun.core.annotation.NameInMap("SmartAGName")
        private String smartAGName;

        @com.aliyun.core.annotation.NameInMap("SmartAGStatus")
        private String smartAGStatus;

        private SmartAccessGateways(Builder builder) {
            this.associatedCcnId = builder.associatedCcnId;
            this.hardwareVersion = builder.hardwareVersion;
            this.routingStrategy = builder.routingStrategy;
            this.smartAGDescription = builder.smartAGDescription;
            this.smartAGId = builder.smartAGId;
            this.smartAGName = builder.smartAGName;
            this.smartAGStatus = builder.smartAGStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmartAccessGateways create() {
            return builder().build();
        }

        /**
         * @return associatedCcnId
         */
        public String getAssociatedCcnId() {
            return this.associatedCcnId;
        }

        /**
         * @return hardwareVersion
         */
        public String getHardwareVersion() {
            return this.hardwareVersion;
        }

        /**
         * @return routingStrategy
         */
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        /**
         * @return smartAGDescription
         */
        public String getSmartAGDescription() {
            return this.smartAGDescription;
        }

        /**
         * @return smartAGId
         */
        public String getSmartAGId() {
            return this.smartAGId;
        }

        /**
         * @return smartAGName
         */
        public String getSmartAGName() {
            return this.smartAGName;
        }

        /**
         * @return smartAGStatus
         */
        public String getSmartAGStatus() {
            return this.smartAGStatus;
        }

        public static final class Builder {
            private String associatedCcnId; 
            private String hardwareVersion; 
            private String routingStrategy; 
            private String smartAGDescription; 
            private String smartAGId; 
            private String smartAGName; 
            private String smartAGStatus; 

            private Builder() {
            } 

            private Builder(SmartAccessGateways model) {
                this.associatedCcnId = model.associatedCcnId;
                this.hardwareVersion = model.hardwareVersion;
                this.routingStrategy = model.routingStrategy;
                this.smartAGDescription = model.smartAGDescription;
                this.smartAGId = model.smartAGId;
                this.smartAGName = model.smartAGName;
                this.smartAGStatus = model.smartAGStatus;
            } 

            /**
             * <p>The ID of the Cloud Connect Network (CCN) instance with which the SAG instance is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn-l42qf3vpvb****</p>
             */
            public Builder associatedCcnId(String associatedCcnId) {
                this.associatedCcnId = associatedCcnId;
                return this;
            }

            /**
             * <p>The model of the SAG device with which the SAG instance is associated. Valid values:</p>
             * <ul>
             * <li><strong>sag-1000</strong>.</li>
             * <li><strong>sag-100WM</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sag-1000</p>
             */
            public Builder hardwareVersion(String hardwareVersion) {
                this.hardwareVersion = hardwareVersion;
                return this;
            }

            /**
             * <p>The method that the SAG instance uses to synchronize Alibaba Cloud-facing routes. Valid values:</p>
             * <ul>
             * <li><strong>static</strong>: static routing.</li>
             * <li><strong>dynamic</strong>: dynamic routing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>static</p>
             */
            public Builder routingStrategy(String routingStrategy) {
                this.routingStrategy = routingStrategy;
                return this;
            }

            /**
             * <p>The description of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder smartAGDescription(String smartAGDescription) {
                this.smartAGDescription = smartAGDescription;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-p86e06z4geaji1****</p>
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            /**
             * <p>The name of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder smartAGName(String smartAGName) {
                this.smartAGName = smartAGName;
                return this;
            }

            /**
             * <p>The status of the SAG instance. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong>: The SAG device is connected to Alibaba Cloud.</li>
             * <li><strong>offline</strong>: The SAG device is disconnected from Alibaba Cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder smartAGStatus(String smartAGStatus) {
                this.smartAGStatus = smartAGStatus;
                return this;
            }

            public SmartAccessGateways build() {
                return new SmartAccessGateways(this);
            } 

        } 

    }
}
