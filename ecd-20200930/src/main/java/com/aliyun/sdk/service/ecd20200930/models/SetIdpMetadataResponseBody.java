// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SetIdpMetadataResponseBody model) {
            this.idpEntityId = model.idpEntityId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The entity ID obtained after the IdP metadata file is parsed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test****.cn/adfs/services/trust">http://test****.cn/adfs/services/trust</a></p>
         */
        public Builder idpEntityId(String idpEntityId) {
            this.idpEntityId = idpEntityId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
