// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterWithTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClusterWithTemplateResponseBody</p>
 */
public class CreateClusterWithTemplateResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("CoreOrderId")
    private String coreOrderId;

    @NameInMap("EmrOrderId")
    private String emrOrderId;

    @NameInMap("MasterOrderId")
    private String masterOrderId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateClusterWithTemplateResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.coreOrderId = builder.coreOrderId;
        this.emrOrderId = builder.emrOrderId;
        this.masterOrderId = builder.masterOrderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterWithTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return coreOrderId
     */
    public String getCoreOrderId() {
        return this.coreOrderId;
    }

    /**
     * @return emrOrderId
     */
    public String getEmrOrderId() {
        return this.emrOrderId;
    }

    /**
     * @return masterOrderId
     */
    public String getMasterOrderId() {
        return this.masterOrderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterId; 
        private String coreOrderId; 
        private String emrOrderId; 
        private String masterOrderId; 
        private String requestId; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CoreOrderId.
         */
        public Builder coreOrderId(String coreOrderId) {
            this.coreOrderId = coreOrderId;
            return this;
        }

        /**
         * EmrOrderId.
         */
        public Builder emrOrderId(String emrOrderId) {
            this.emrOrderId = emrOrderId;
            return this;
        }

        /**
         * MasterOrderId.
         */
        public Builder masterOrderId(String masterOrderId) {
            this.masterOrderId = masterOrderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateClusterWithTemplateResponseBody build() {
            return new CreateClusterWithTemplateResponseBody(this);
        } 

    } 

}
