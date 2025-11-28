// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link CreateScanRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScanRuleResponseBody</p>
 */
public class CreateScanRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScanRuleId")
    private String scanRuleId;

    private CreateScanRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.scanRuleId = builder.scanRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScanRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scanRuleId
     */
    public String getScanRuleId() {
        return this.scanRuleId;
    }

    public static final class Builder {
        private Long code; 
        private String requestId; 
        private String scanRuleId; 

        private Builder() {
        } 

        private Builder(CreateScanRuleResponseBody model) {
            this.code = model.code;
            this.requestId = model.requestId;
            this.scanRuleId = model.scanRuleId;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Request Id</p>
         * 
         * <strong>example:</strong>
         * <p>EAEAB520-2456-5BF2-BCB5-AC998DFA3A51</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScanRuleId.
         */
        public Builder scanRuleId(String scanRuleId) {
            this.scanRuleId = scanRuleId;
            return this;
        }

        public CreateScanRuleResponseBody build() {
            return new CreateScanRuleResponseBody(this);
        } 

    } 

}
