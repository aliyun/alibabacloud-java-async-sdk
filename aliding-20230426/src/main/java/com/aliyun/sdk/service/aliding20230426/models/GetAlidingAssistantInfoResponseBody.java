// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetAlidingAssistantInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlidingAssistantInfoResponseBody</p>
 */
public class GetAlidingAssistantInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("approvalStatus")
    private Integer approvalStatus;

    @com.aliyun.core.annotation.NameInMap("processInstanceId")
    private String processInstanceId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetAlidingAssistantInfoResponseBody(Builder builder) {
        this.approvalStatus = builder.approvalStatus;
        this.processInstanceId = builder.processInstanceId;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlidingAssistantInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvalStatus
     */
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return processInstanceId
     */
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private Integer approvalStatus; 
        private String processInstanceId; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetAlidingAssistantInfoResponseBody model) {
            this.approvalStatus = model.approvalStatus;
            this.processInstanceId = model.processInstanceId;
            this.requestId = model.requestId;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * approvalStatus.
         */
        public Builder approvalStatus(Integer approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * processInstanceId.
         */
        public Builder processInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetAlidingAssistantInfoResponseBody build() {
            return new GetAlidingAssistantInfoResponseBody(this);
        } 

    } 

}
