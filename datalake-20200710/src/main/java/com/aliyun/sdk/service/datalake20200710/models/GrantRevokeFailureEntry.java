// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantRevokeFailureEntry} extends {@link TeaModel}
 *
 * <p>GrantRevokeFailureEntry</p>
 */
public class GrantRevokeFailureEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorDetail")
    private ErrorDetail errorDetail;

    @com.aliyun.core.annotation.NameInMap("GrantRevokeEntry")
    private GrantRevokeEntry grantRevokeEntry;

    private GrantRevokeFailureEntry(Builder builder) {
        this.errorDetail = builder.errorDetail;
        this.grantRevokeEntry = builder.grantRevokeEntry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantRevokeFailureEntry create() {
        return builder().build();
    }

    /**
     * @return errorDetail
     */
    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * @return grantRevokeEntry
     */
    public GrantRevokeEntry getGrantRevokeEntry() {
        return this.grantRevokeEntry;
    }

    public static final class Builder {
        private ErrorDetail errorDetail; 
        private GrantRevokeEntry grantRevokeEntry; 

        /**
         * ErrorDetail.
         */
        public Builder errorDetail(ErrorDetail errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        /**
         * GrantRevokeEntry.
         */
        public Builder grantRevokeEntry(GrantRevokeEntry grantRevokeEntry) {
            this.grantRevokeEntry = grantRevokeEntry;
            return this;
        }

        public GrantRevokeFailureEntry build() {
            return new GrantRevokeFailureEntry(this);
        } 

    } 

}
