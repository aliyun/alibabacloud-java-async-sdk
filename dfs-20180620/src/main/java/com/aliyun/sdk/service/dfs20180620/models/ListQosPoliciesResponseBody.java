// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link ListQosPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListQosPoliciesResponseBody</p>
 */
public class ListQosPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QosPolicies")
    private java.util.List<QosPolicies> qosPolicies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListQosPoliciesResponseBody(Builder builder) {
        this.qosPolicies = builder.qosPolicies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQosPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return qosPolicies
     */
    public java.util.List<QosPolicies> getQosPolicies() {
        return this.qosPolicies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<QosPolicies> qosPolicies; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListQosPoliciesResponseBody model) {
            this.qosPolicies = model.qosPolicies;
            this.requestId = model.requestId;
        } 

        /**
         * QosPolicies.
         */
        public Builder qosPolicies(java.util.List<QosPolicies> qosPolicies) {
            this.qosPolicies = qosPolicies;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQosPoliciesResponseBody build() {
            return new ListQosPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQosPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQosPoliciesResponseBody</p>
     */
    public static class QosPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FederationId")
        private String federationId;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FlowIds")
        private String flowIds;

        @com.aliyun.core.annotation.NameInMap("MaxIOBandWidth")
        private Long maxIOBandWidth;

        @com.aliyun.core.annotation.NameInMap("MaxIOps")
        private Long maxIOps;

        @com.aliyun.core.annotation.NameInMap("MaxMetaQps")
        private Long maxMetaQps;

        @com.aliyun.core.annotation.NameInMap("QosPolicyId")
        private String qosPolicyId;

        @com.aliyun.core.annotation.NameInMap("ZoneIds")
        private String zoneIds;

        private QosPolicies(Builder builder) {
            this.description = builder.description;
            this.federationId = builder.federationId;
            this.fileSystemId = builder.fileSystemId;
            this.flowIds = builder.flowIds;
            this.maxIOBandWidth = builder.maxIOBandWidth;
            this.maxIOps = builder.maxIOps;
            this.maxMetaQps = builder.maxMetaQps;
            this.qosPolicyId = builder.qosPolicyId;
            this.zoneIds = builder.zoneIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QosPolicies create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return federationId
         */
        public String getFederationId() {
            return this.federationId;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return flowIds
         */
        public String getFlowIds() {
            return this.flowIds;
        }

        /**
         * @return maxIOBandWidth
         */
        public Long getMaxIOBandWidth() {
            return this.maxIOBandWidth;
        }

        /**
         * @return maxIOps
         */
        public Long getMaxIOps() {
            return this.maxIOps;
        }

        /**
         * @return maxMetaQps
         */
        public Long getMaxMetaQps() {
            return this.maxMetaQps;
        }

        /**
         * @return qosPolicyId
         */
        public String getQosPolicyId() {
            return this.qosPolicyId;
        }

        /**
         * @return zoneIds
         */
        public String getZoneIds() {
            return this.zoneIds;
        }

        public static final class Builder {
            private String description; 
            private String federationId; 
            private String fileSystemId; 
            private String flowIds; 
            private Long maxIOBandWidth; 
            private Long maxIOps; 
            private Long maxMetaQps; 
            private String qosPolicyId; 
            private String zoneIds; 

            private Builder() {
            } 

            private Builder(QosPolicies model) {
                this.description = model.description;
                this.federationId = model.federationId;
                this.fileSystemId = model.fileSystemId;
                this.flowIds = model.flowIds;
                this.maxIOBandWidth = model.maxIOBandWidth;
                this.maxIOps = model.maxIOps;
                this.maxMetaQps = model.maxMetaQps;
                this.qosPolicyId = model.qosPolicyId;
                this.zoneIds = model.zoneIds;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FederationId.
             */
            public Builder federationId(String federationId) {
                this.federationId = federationId;
                return this;
            }

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * FlowIds.
             */
            public Builder flowIds(String flowIds) {
                this.flowIds = flowIds;
                return this;
            }

            /**
             * MaxIOBandWidth.
             */
            public Builder maxIOBandWidth(Long maxIOBandWidth) {
                this.maxIOBandWidth = maxIOBandWidth;
                return this;
            }

            /**
             * MaxIOps.
             */
            public Builder maxIOps(Long maxIOps) {
                this.maxIOps = maxIOps;
                return this;
            }

            /**
             * MaxMetaQps.
             */
            public Builder maxMetaQps(Long maxMetaQps) {
                this.maxMetaQps = maxMetaQps;
                return this;
            }

            /**
             * QosPolicyId.
             */
            public Builder qosPolicyId(String qosPolicyId) {
                this.qosPolicyId = qosPolicyId;
                return this;
            }

            /**
             * ZoneIds.
             */
            public Builder zoneIds(String zoneIds) {
                this.zoneIds = zoneIds;
                return this;
            }

            public QosPolicies build() {
                return new QosPolicies(this);
            } 

        } 

    }
}
