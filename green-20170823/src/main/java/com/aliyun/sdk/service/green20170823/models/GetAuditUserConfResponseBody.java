// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuditUserConfResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuditUserConfResponseBody</p>
 */
public class GetAuditUserConfResponseBody extends TeaModel {
    @NameInMap("CustomAudit")
    private Boolean customAudit;

    @NameInMap("RcpLabels")
    private java.util.Map < String, java.util.List<String>> rcpLabels;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserLabels")
    private java.util.Map < String, java.util.List<String>> userLabels;

    private GetAuditUserConfResponseBody(Builder builder) {
        this.customAudit = builder.customAudit;
        this.rcpLabels = builder.rcpLabels;
        this.requestId = builder.requestId;
        this.userLabels = builder.userLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditUserConfResponseBody create() {
        return builder().build();
    }

    /**
     * @return customAudit
     */
    public Boolean getCustomAudit() {
        return this.customAudit;
    }

    /**
     * @return rcpLabels
     */
    public java.util.Map < String, java.util.List<String>> getRcpLabels() {
        return this.rcpLabels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userLabels
     */
    public java.util.Map < String, java.util.List<String>> getUserLabels() {
        return this.userLabels;
    }

    public static final class Builder {
        private Boolean customAudit; 
        private java.util.Map < String, java.util.List<String>> rcpLabels; 
        private String requestId; 
        private java.util.Map < String, java.util.List<String>> userLabels; 

        /**
         * CustomAudit.
         */
        public Builder customAudit(Boolean customAudit) {
            this.customAudit = customAudit;
            return this;
        }

        /**
         * RcpLabels.
         */
        public Builder rcpLabels(java.util.Map < String, java.util.List<String>> rcpLabels) {
            this.rcpLabels = rcpLabels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserLabels.
         */
        public Builder userLabels(java.util.Map < String, java.util.List<String>> userLabels) {
            this.userLabels = userLabels;
            return this;
        }

        public GetAuditUserConfResponseBody build() {
            return new GetAuditUserConfResponseBody(this);
        } 

    } 

}
