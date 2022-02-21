// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>GrantServiceLinkedRoleResponseBody</p>
 */
public class GrantServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SLRStatus")
    private String SLRStatus;

    private GrantServiceLinkedRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SLRStatus = builder.SLRStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantServiceLinkedRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SLRStatus
     */
    public String getSLRStatus() {
        return this.SLRStatus;
    }

    public static final class Builder {
        private String requestId; 
        private String SLRStatus; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SLRStatus.
         */
        public Builder SLRStatus(String SLRStatus) {
            this.SLRStatus = SLRStatus;
            return this;
        }

        public GrantServiceLinkedRoleResponseBody build() {
            return new GrantServiceLinkedRoleResponseBody(this);
        } 

    } 

}
