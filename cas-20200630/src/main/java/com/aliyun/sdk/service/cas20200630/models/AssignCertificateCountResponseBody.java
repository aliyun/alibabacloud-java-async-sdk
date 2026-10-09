// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link AssignCertificateCountResponseBody} extends {@link TeaModel}
 *
 * <p>AssignCertificateCountResponseBody</p>
 */
public class AssignCertificateCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertCount")
    private Integer certCount;

    @com.aliyun.core.annotation.NameInMap("CurrentYearFreeCertCount")
    private Integer currentYearFreeCertCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssignCertificateCountResponseBody(Builder builder) {
        this.certCount = builder.certCount;
        this.currentYearFreeCertCount = builder.currentYearFreeCertCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignCertificateCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certCount
     */
    public Integer getCertCount() {
        return this.certCount;
    }

    /**
     * @return currentYearFreeCertCount
     */
    public Integer getCurrentYearFreeCertCount() {
        return this.currentYearFreeCertCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer certCount; 
        private Integer currentYearFreeCertCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssignCertificateCountResponseBody model) {
            this.certCount = model.certCount;
            this.currentYearFreeCertCount = model.currentYearFreeCertCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of allocated certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder certCount(Integer certCount) {
            this.certCount = certCount;
            return this;
        }

        /**
         * <p>The number of free certificates in the current year.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder currentYearFreeCertCount(Integer currentYearFreeCertCount) {
            this.currentYearFreeCertCount = currentYearFreeCertCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E77C4794-F24F-58CB-9929-F0F0C0EDE7B2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssignCertificateCountResponseBody build() {
            return new AssignCertificateCountResponseBody(this);
        } 

    } 

}
