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
 * {@link ListAccessPointNetworkQualitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessPointNetworkQualitiesResponseBody</p>
 */
public class ListAccessPointNetworkQualitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPointNetworkQualities")
    private java.util.List<AccessPointNetworkQualities> accessPointNetworkQualities;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAccessPointNetworkQualitiesResponseBody(Builder builder) {
        this.accessPointNetworkQualities = builder.accessPointNetworkQualities;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessPointNetworkQualitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPointNetworkQualities
     */
    public java.util.List<AccessPointNetworkQualities> getAccessPointNetworkQualities() {
        return this.accessPointNetworkQualities;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AccessPointNetworkQualities> accessPointNetworkQualities; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAccessPointNetworkQualitiesResponseBody model) {
            this.accessPointNetworkQualities = model.accessPointNetworkQualities;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The network quality of the endpoint.</p>
         */
        public Builder accessPointNetworkQualities(java.util.List<AccessPointNetworkQualities> accessPointNetworkQualities) {
            this.accessPointNetworkQualities = accessPointNetworkQualities;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8E8E8C86-1404-122A-A1BB-84BBC2E9A4B1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccessPointNetworkQualitiesResponseBody build() {
            return new ListAccessPointNetworkQualitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccessPointNetworkQualitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessPointNetworkQualitiesResponseBody</p>
     */
    public static class AccessPointNetworkQualities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Loss")
        private String loss;

        @com.aliyun.core.annotation.NameInMap("Rtt")
        private String rtt;

        private AccessPointNetworkQualities(Builder builder) {
            this.id = builder.id;
            this.loss = builder.loss;
            this.rtt = builder.rtt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessPointNetworkQualities create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return loss
         */
        public String getLoss() {
            return this.loss;
        }

        /**
         * @return rtt
         */
        public String getRtt() {
            return this.rtt;
        }

        public static final class Builder {
            private Integer id; 
            private String loss; 
            private String rtt; 

            private Builder() {
            } 

            private Builder(AccessPointNetworkQualities model) {
                this.id = model.id;
                this.loss = model.loss;
                this.rtt = model.rtt;
            } 

            /**
             * <p>The ID of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>115</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The packet loss rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00%</p>
             */
            public Builder loss(String loss) {
                this.loss = loss;
                return this;
            }

            /**
             * <p>The network latency. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>4.98</p>
             */
            public Builder rtt(String rtt) {
                this.rtt = rtt;
                return this;
            }

            public AccessPointNetworkQualities build() {
                return new AccessPointNetworkQualities(this);
            } 

        } 

    }
}
