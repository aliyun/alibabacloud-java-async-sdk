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
 * {@link GetManagedDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetManagedDataKeyResponseBody</p>
 */
public class GetManagedDataKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataKeyName")
    private String dataKeyName;

    @com.aliyun.core.annotation.NameInMap("DataKeyVersionId")
    private String dataKeyVersionId;

    @com.aliyun.core.annotation.NameInMap("DataKeyVersionName")
    private String dataKeyVersionName;

    @com.aliyun.core.annotation.NameInMap("Plaintext")
    private String plaintext;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetManagedDataKeyResponseBody(Builder builder) {
        this.dataKeyName = builder.dataKeyName;
        this.dataKeyVersionId = builder.dataKeyVersionId;
        this.dataKeyVersionName = builder.dataKeyVersionName;
        this.plaintext = builder.plaintext;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetManagedDataKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataKeyName
     */
    public String getDataKeyName() {
        return this.dataKeyName;
    }

    /**
     * @return dataKeyVersionId
     */
    public String getDataKeyVersionId() {
        return this.dataKeyVersionId;
    }

    /**
     * @return dataKeyVersionName
     */
    public String getDataKeyVersionName() {
        return this.dataKeyVersionName;
    }

    /**
     * @return plaintext
     */
    public String getPlaintext() {
        return this.plaintext;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataKeyName; 
        private String dataKeyVersionId; 
        private String dataKeyVersionName; 
        private String plaintext; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetManagedDataKeyResponseBody model) {
            this.dataKeyName = model.dataKeyName;
            this.dataKeyVersionId = model.dataKeyVersionId;
            this.dataKeyVersionName = model.dataKeyVersionName;
            this.plaintext = model.plaintext;
            this.requestId = model.requestId;
        } 

        /**
         * DataKeyName.
         */
        public Builder dataKeyName(String dataKeyName) {
            this.dataKeyName = dataKeyName;
            return this;
        }

        /**
         * DataKeyVersionId.
         */
        public Builder dataKeyVersionId(String dataKeyVersionId) {
            this.dataKeyVersionId = dataKeyVersionId;
            return this;
        }

        /**
         * DataKeyVersionName.
         */
        public Builder dataKeyVersionName(String dataKeyVersionName) {
            this.dataKeyVersionName = dataKeyVersionName;
            return this;
        }

        /**
         * Plaintext.
         */
        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetManagedDataKeyResponseBody build() {
            return new GetManagedDataKeyResponseBody(this);
        } 

    } 

}
