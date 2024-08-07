// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetIdpMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>SetIdpMetadataResponseBody</p>
 */
public class SetIdpMetadataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdpEntityId")
    private String idpEntityId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetIdpMetadataResponseBody(Builder builder) {
        this.idpEntityId = builder.idpEntityId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetIdpMetadataResponseBody create() {
        return builder().build();
    }

    /**
     * @return idpEntityId
     */
    public String getIdpEntityId() {
        return this.idpEntityId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String idpEntityId; 
        private String requestId; 

        /**
         * The entity ID obtained after the IdP metadata file is parsed.
         */
        public Builder idpEntityId(String idpEntityId) {
            this.idpEntityId = idpEntityId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetIdpMetadataResponseBody build() {
            return new SetIdpMetadataResponseBody(this);
        } 

    } 

}
