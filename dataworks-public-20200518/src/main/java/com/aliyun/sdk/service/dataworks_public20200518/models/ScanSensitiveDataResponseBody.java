// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ScanSensitiveDataResponseBody} extends {@link TeaModel}
 *
 * <p>ScanSensitiveDataResponseBody</p>
 */
public class ScanSensitiveDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sensitives")
    private java.util.Map < String, ? > sensitives;

    private ScanSensitiveDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sensitives = builder.sensitives;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanSensitiveDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sensitives
     */
    public java.util.Map < String, ? > getSensitives() {
        return this.sensitives;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > sensitives; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The check result. sensDatas indicates the rules that are used to check the sensitive data. sensDatas includes the following parameters:</p>
         * <ul>
         * <li>hitCount: the number of times that the sensitive data hits the rule.</li>
         * <li>ruleName: the name of the rule.</li>
         * </ul>
         */
        public Builder sensitives(java.util.Map < String, ? > sensitives) {
            this.sensitives = sensitives;
            return this;
        }

        public ScanSensitiveDataResponseBody build() {
            return new ScanSensitiveDataResponseBody(this);
        } 

    } 

}
