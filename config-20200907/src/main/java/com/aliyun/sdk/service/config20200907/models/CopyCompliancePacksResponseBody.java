// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link CopyCompliancePacksResponseBody} extends {@link TeaModel}
 *
 * <p>CopyCompliancePacksResponseBody</p>
 */
public class CopyCompliancePacksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CopyRulesResult")
    private Boolean copyRulesResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CopyCompliancePacksResponseBody(Builder builder) {
        this.copyRulesResult = builder.copyRulesResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyCompliancePacksResponseBody create() {
        return builder().build();
    }

    /**
     * @return copyRulesResult
     */
    public Boolean getCopyRulesResult() {
        return this.copyRulesResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean copyRulesResult; 
        private String requestId; 

        /**
         * <p>Indicates whether the compliance packages are replicated. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder copyRulesResult(Boolean copyRulesResult) {
            this.copyRulesResult = copyRulesResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9E1E69DE-BDED-581E-B559-0C15690901D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CopyCompliancePacksResponseBody build() {
            return new CopyCompliancePacksResponseBody(this);
        } 

    } 

}
