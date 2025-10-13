// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link KMSConfig} extends {@link TeaModel}
 *
 * <p>KMSConfig</p>
 */
public class KMSConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("kmsInstanceId")
    private String kmsInstanceId;

    @com.aliyun.core.annotation.NameInMap("kmsKeyId")
    private String kmsKeyId;

    private KMSConfig(Builder builder) {
        this.kmsInstanceId = builder.kmsInstanceId;
        this.kmsKeyId = builder.kmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KMSConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kmsInstanceId
     */
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public static final class Builder {
        private String kmsInstanceId; 
        private String kmsKeyId; 

        private Builder() {
        } 

        private Builder(KMSConfig model) {
            this.kmsInstanceId = model.kmsInstanceId;
            this.kmsKeyId = model.kmsKeyId;
        } 

        /**
         * kmsInstanceId.
         */
        public Builder kmsInstanceId(String kmsInstanceId) {
            this.kmsInstanceId = kmsInstanceId;
            return this;
        }

        /**
         * kmsKeyId.
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public KMSConfig build() {
            return new KMSConfig(this);
        } 

    } 

}
