// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageFacesResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageFacesResponseBody</p>
 */
public class DetectImageFacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Faces")
    private java.util.List < Figure > faces;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetectImageFacesResponseBody(Builder builder) {
        this.faces = builder.faces;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageFacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return faces
     */
    public java.util.List < Figure > getFaces() {
        return this.faces;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Figure > faces; 
        private String requestId; 

        /**
         * Faces.
         */
        public Builder faces(java.util.List < Figure > faces) {
            this.faces = faces;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetectImageFacesResponseBody build() {
            return new DetectImageFacesResponseBody(this);
        } 

    } 

}
