// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateRecognitionLibResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRecognitionLibResponseBody</p>
 */
public class CreateRecognitionLibResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRecognitionLibResponseBody(Builder builder) {
        this.libId = builder.libId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecognitionLibResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String libId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRecognitionLibResponseBody model) {
            this.libId = model.libId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the recognition library created.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong><strong><strong><strong><strong><strong>24b47865c6</strong></strong></strong></strong></strong></strong></em>*</p>
         */
        public Builder libId(String libId) {
            this.libId = libId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRecognitionLibResponseBody build() {
            return new CreateRecognitionLibResponseBody(this);
        } 

    } 

}
