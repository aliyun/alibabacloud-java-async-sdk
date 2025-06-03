// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link DeleteSecretResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSecretResponseBody</p>
 */
public class DeleteSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlannedDeleteTime")
    private String plannedDeleteTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretName")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteSecretResponseBody model) {
            this.plannedDeleteTime = model.plannedDeleteTime;
            this.requestId = model.requestId;
            this.secretName = model.secretName;
        } 

        /**
         * <p>The time when the secret is scheduled to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-15T07:02:14Z</p>
         */
        public Builder plannedDeleteTime(String plannedDeleteTime) {
            this.plannedDeleteTime = plannedDeleteTime;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>38bbed2a-15e0-45ad-98d4-816ad2ccf4ea</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
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
