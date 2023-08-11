// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeploymentBySelectorResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeploymentBySelectorResponseBody</p>
 */
public class GetDeploymentBySelectorResponseBody extends TeaModel {
    @NameInMap("DeploymentNameList")
    private java.util.List < byte[] > deploymentNameList;

    @NameInMap("Mark")
    private String mark;

    @NameInMap("RequestId")
    private String requestId;

    private GetDeploymentBySelectorResponseBody(Builder builder) {
        this.deploymentNameList = builder.deploymentNameList;
        this.mark = builder.mark;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeploymentBySelectorResponseBody create() {
        return builder().build();
    }

    /**
     * @return deploymentNameList
     */
    public java.util.List < byte[] > getDeploymentNameList() {
        return this.deploymentNameList;
    }

    /**
     * @return mark
     */
    public String getMark() {
        return this.mark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < byte[] > deploymentNameList; 
        private String mark; 
        private String requestId; 

        /**
         * The queried workloads.
         */
        public Builder deploymentNameList(java.util.List < byte[] > deploymentNameList) {
            this.deploymentNameList = deploymentNameList;
            return this;
        }

        /**
         * The end-of-data marker.
         */
        public Builder mark(String mark) {
            this.mark = mark;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeploymentBySelectorResponseBody build() {
            return new GetDeploymentBySelectorResponseBody(this);
        } 

    } 

}
