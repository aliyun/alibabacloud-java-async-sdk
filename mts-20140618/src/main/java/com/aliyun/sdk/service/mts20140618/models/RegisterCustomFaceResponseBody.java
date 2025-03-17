// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link RegisterCustomFaceResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterCustomFaceResponseBody</p>
 */
public class RegisterCustomFaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FaceId")
    private String faceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RegisterCustomFaceResponseBody(Builder builder) {
        this.faceId = builder.faceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterCustomFaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return faceId
     */
    public String getFaceId() {
        return this.faceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String faceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RegisterCustomFaceResponseBody model) {
            this.faceId = model.faceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the face.</p>
         * 
         * <strong>example:</strong>
         * <p>c6cc71cb44a9491093818faf9d60****</p>
         */
        public Builder faceId(String faceId) {
            this.faceId = faceId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>91AEA76D-25B5-50DF-9126-AA6BB10FDAF4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterCustomFaceResponseBody build() {
            return new RegisterCustomFaceResponseBody(this);
        } 

    } 

}
