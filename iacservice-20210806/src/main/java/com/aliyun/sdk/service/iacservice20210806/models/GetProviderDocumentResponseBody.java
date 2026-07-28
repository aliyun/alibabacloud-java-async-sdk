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
 * {@link GetProviderDocumentResponseBody} extends {@link TeaModel}
 *
 * <p>GetProviderDocumentResponseBody</p>
 */
public class GetProviderDocumentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("document")
    private String document;

    @com.aliyun.core.annotation.NameInMap("providerVersion")
    private String providerVersion;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("terraformResourceType")
    private String terraformResourceType;

    private GetProviderDocumentResponseBody(Builder builder) {
        this.document = builder.document;
        this.providerVersion = builder.providerVersion;
        this.requestId = builder.requestId;
        this.terraformResourceType = builder.terraformResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProviderDocumentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return document
     */
    public String getDocument() {
        return this.document;
    }

    /**
     * @return providerVersion
     */
    public String getProviderVersion() {
        return this.providerVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return terraformResourceType
     */
    public String getTerraformResourceType() {
        return this.terraformResourceType;
    }

    public static final class Builder {
        private String document; 
        private String providerVersion; 
        private String requestId; 
        private String terraformResourceType; 

        private Builder() {
        } 

        private Builder(GetProviderDocumentResponseBody model) {
            this.document = model.document;
            this.providerVersion = model.providerVersion;
            this.requestId = model.requestId;
            this.terraformResourceType = model.terraformResourceType;
        } 

        /**
         * document.
         */
        public Builder document(String document) {
            this.document = document;
            return this;
        }

        /**
         * providerVersion.
         */
        public Builder providerVersion(String providerVersion) {
            this.providerVersion = providerVersion;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * terraformResourceType.
         */
        public Builder terraformResourceType(String terraformResourceType) {
            this.terraformResourceType = terraformResourceType;
            return this;
        }

        public GetProviderDocumentResponseBody build() {
            return new GetProviderDocumentResponseBody(this);
        } 

    } 

}
