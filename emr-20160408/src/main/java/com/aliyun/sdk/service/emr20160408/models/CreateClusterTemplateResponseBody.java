// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClusterTemplateResponseBody</p>
 */
public class CreateClusterTemplateResponseBody extends TeaModel {
    @NameInMap("ClusterTemplateId")
    private String clusterTemplateId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateClusterTemplateResponseBody(Builder builder) {
        this.clusterTemplateId = builder.clusterTemplateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterTemplateId
     */
    public String getClusterTemplateId() {
        return this.clusterTemplateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterTemplateId; 
        private String requestId; 

        /**
         * ClusterTemplateId.
         */
        public Builder clusterTemplateId(String clusterTemplateId) {
            this.clusterTemplateId = clusterTemplateId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateClusterTemplateResponseBody build() {
            return new CreateClusterTemplateResponseBody(this);
        } 

    } 

}
