// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecretResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSecretResponseBody</p>
 */
public class DeleteSecretResponseBody extends TeaModel {
    @NameInMap("PlannedDeleteTime")
    private String plannedDeleteTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretName")
    private String secretName;

    private DeleteSecretResponseBody(Builder builder) {
        this.plannedDeleteTime = builder.plannedDeleteTime;
        this.requestId = builder.requestId;
        this.secretName = builder.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecretResponseBody create() {
        return builder().build();
    }

    /**
     * @return plannedDeleteTime
     */
    public String getPlannedDeleteTime() {
        return this.plannedDeleteTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    public static final class Builder {
        private String plannedDeleteTime; 
        private String requestId; 
        private String secretName; 

        /**
         * PlannedDeleteTime.
         */
        public Builder plannedDeleteTime(String plannedDeleteTime) {
            this.plannedDeleteTime = plannedDeleteTime;
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
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        public DeleteSecretResponseBody build() {
            return new DeleteSecretResponseBody(this);
        } 

    } 

}
