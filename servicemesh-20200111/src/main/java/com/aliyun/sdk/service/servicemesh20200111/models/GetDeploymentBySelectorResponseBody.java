// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link GetDeploymentBySelectorResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeploymentBySelectorResponseBody</p>
 */
public class GetDeploymentBySelectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeploymentNameList")
    private java.util.List<byte[]> deploymentNameList;

    @com.aliyun.core.annotation.NameInMap("Mark")
    private String mark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentNameList
     */
    public java.util.List<byte[]> getDeploymentNameList() {
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
        private java.util.List<byte[]> deploymentNameList; 
        private String mark; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDeploymentBySelectorResponseBody model) {
            this.deploymentNameList = model.deploymentNameList;
            this.mark = model.mark;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried workloads.</p>
         */
        public Builder deploymentNameList(java.util.List<byte[]> deploymentNameList) {
            this.deploymentNameList = deploymentNameList;
            return this;
        }

        /**
         * <p>The end-of-data marker.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ2IjoibWV0YS5rOHMuaW8vdjEiLCJydiI6NTgyMDUzMzk5MCwic3RhcnQiOiJwbXMtYWRhcHRlci1kZGxsXHUwMDA****</p>
         */
        public Builder mark(String mark) {
            this.mark = mark;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>946690C2-41D3-55A0-A501-E2FFAB5F****</p>
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
