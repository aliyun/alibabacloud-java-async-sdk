// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link DetectTerraformStateResponseBody} extends {@link TeaModel}
 *
 * <p>DetectTerraformStateResponseBody</p>
 */
public class DetectTerraformStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("detectionId")
    private String detectionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DetectTerraformStateResponseBody(Builder builder) {
        this.detectionId = builder.detectionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectTerraformStateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectionId
     */
    public String getDetectionId() {
        return this.detectionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String detectionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DetectTerraformStateResponseBody model) {
            this.detectionId = model.detectionId;
            this.requestId = model.requestId;
        } 

        /**
         * detectionId.
         */
        public Builder detectionId(String detectionId) {
            this.detectionId = detectionId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BF75EF50-955D-5E1F-AB23-A657C2C6D3C7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetectTerraformStateResponseBody build() {
            return new DetectTerraformStateResponseBody(this);
        } 

    } 

}
