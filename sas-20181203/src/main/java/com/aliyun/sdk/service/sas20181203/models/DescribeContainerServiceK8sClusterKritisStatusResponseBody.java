// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerServiceK8sClusterKritisStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerServiceK8sClusterKritisStatusResponseBody</p>
 */
public class DescribeContainerServiceK8sClusterKritisStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KritisStatus")
    private KritisStatus kritisStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeContainerServiceK8sClusterKritisStatusResponseBody(Builder builder) {
        this.kritisStatus = builder.kritisStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerServiceK8sClusterKritisStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return kritisStatus
     */
    public KritisStatus getKritisStatus() {
        return this.kritisStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private KritisStatus kritisStatus; 
        private String requestId; 

        /**
         * The Kritis status of the ACK cluster.
         */
        public Builder kritisStatus(KritisStatus kritisStatus) {
            this.kritisStatus = kritisStatus;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerServiceK8sClusterKritisStatusResponseBody build() {
            return new DescribeContainerServiceK8sClusterKritisStatusResponseBody(this);
        } 

    } 

    public static class KritisStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Install")
        private Boolean install;

        private KritisStatus(Builder builder) {
            this.install = builder.install;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KritisStatus create() {
            return builder().build();
        }

        /**
         * @return install
         */
        public Boolean getInstall() {
            return this.install;
        }

        public static final class Builder {
            private Boolean install; 

            /**
             * Indicates whether Kritis is installed. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder install(Boolean install) {
                this.install = install;
                return this;
            }

            public KritisStatus build() {
                return new KritisStatus(this);
            } 

        } 

    }
}
