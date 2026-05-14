// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link UploadFormInfo} extends {@link TeaModel}
 *
 * <p>UploadFormInfo</p>
 */
public class UploadFormInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("form_data")
    private java.util.Map<String, String> formData;

    private UploadFormInfo(Builder builder) {
        this.endpoint = builder.endpoint;
        this.formData = builder.formData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadFormInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return formData
     */
    public java.util.Map<String, String> getFormData() {
        return this.formData;
    }

    public static final class Builder {
        private String endpoint; 
        private java.util.Map<String, String> formData; 

        private Builder() {
        } 

        private Builder(UploadFormInfo model) {
            this.endpoint = model.endpoint;
            this.formData = model.formData;
        } 

        /**
         * endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * form_data.
         */
        public Builder formData(java.util.Map<String, String> formData) {
            this.formData = formData;
            return this;
        }

        public UploadFormInfo build() {
            return new UploadFormInfo(this);
        } 

    } 

}
