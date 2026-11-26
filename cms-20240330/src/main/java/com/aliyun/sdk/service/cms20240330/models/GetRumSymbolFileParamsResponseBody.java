// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetRumSymbolFileParamsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRumSymbolFileParamsResponseBody</p>
 */
public class GetRumSymbolFileParamsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("formData")
    private java.util.Map<String, String> formData;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("uploadUrl")
    private String uploadUrl;

    private GetRumSymbolFileParamsResponseBody(Builder builder) {
        this.formData = builder.formData;
        this.requestId = builder.requestId;
        this.uploadUrl = builder.uploadUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRumSymbolFileParamsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return formData
     */
    public java.util.Map<String, String> getFormData() {
        return this.formData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadUrl
     */
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public static final class Builder {
        private java.util.Map<String, String> formData; 
        private String requestId; 
        private String uploadUrl; 

        private Builder() {
        } 

        private Builder(GetRumSymbolFileParamsResponseBody model) {
            this.formData = model.formData;
            this.requestId = model.requestId;
            this.uploadUrl = model.uploadUrl;
        } 

        /**
         * <p>The collection of signature parameters required for form upload, including key, policy, x-oss-signature-version, x-oss-credential, x-oss-date, and x-oss-signature. The signatures in the examples are for illustration purposes only and cannot be used for actual uploads. Use the complete parameters returned by the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;user/workspace/service-id/1.0.0/build-1/bundle.js.map&quot;,&quot;policy&quot;:&quot;eyJleHBpcmF0aW9uIjoiMjAyNi0wNi0wM1QxMjozMDowMC4wMDBaIiwiY29uZGl0aW9ucyI6W3siYnVja2V0IjoiYnVja2V0In0seyJ4LW9zcy1zaWduYXR1cmUtdmVyc2lvbiI6Ik9TUzQtSE1BQy1TSEEyNTYifSx7Ingtb3NzLWNyZWRlbnRpYWwiOiJBS0lERVhBTVBMRS8yMDI2MDYwMy9jbi1oYW5nemhvdS9vc3MvYWxpeXVuX3Y0X3JlcXVlc3QifSx7Ingtb3NzLWRhdGUiOiIyMDI2MDYwM1QxMjAwMDBaIn0sWyJlcSIsIiRrZXkiLCJ1c2VyL3dvcmtzcGFjZS9zZXJ2aWNlLWlkLzEuMC4wL2J1aWxkLTEvYnVuZGxlLmpzLm1hcCJdLFsiY29udGVudC1sZW5ndGgtcmFuZ2UiLDEsNTI0Mjg4MDAwXV19&quot;,&quot;x-oss-signature-version&quot;:&quot;OSS4-HMAC-SHA256&quot;,&quot;x-oss-credential&quot;:&quot;AKIDEXAMPLE/20260603/cn-hangzhou/oss/aliyun_v4_request&quot;,&quot;x-oss-date&quot;:&quot;20260603T120000Z&quot;,&quot;x-oss-signature&quot;:&quot;0000000000000000000000000000000000000000000000000000000000000000&quot;}</p>
         */
        public Builder formData(java.util.Map<String, String> formData) {
            this.formData = formData;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>request-1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The form upload URL for directly uploading symbol files to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://bucket.oss-cn-hangzhou.aliyuncs.com">https://bucket.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        public Builder uploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }

        public GetRumSymbolFileParamsResponseBody build() {
            return new GetRumSymbolFileParamsResponseBody(this);
        } 

    } 

}
