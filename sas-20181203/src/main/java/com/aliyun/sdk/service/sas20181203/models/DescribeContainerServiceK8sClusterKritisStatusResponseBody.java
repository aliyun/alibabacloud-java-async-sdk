// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeContainerServiceK8sClusterKritisStatusResponseBody model) {
            this.kritisStatus = model.kritisStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Kritis status of the ACK cluster.</p>
         */
        public Builder kritisStatus(KritisStatus kritisStatus) {
            this.kritisStatus = kritisStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578AB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerServiceK8sClusterKritisStatusResponseBody build() {
            return new DescribeContainerServiceK8sClusterKritisStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerServiceK8sClusterKritisStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerServiceK8sClusterKritisStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(KritisStatus model) {
                this.install = model.install;
            } 

            /**
             * <p>Indicates whether Kritis is installed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
