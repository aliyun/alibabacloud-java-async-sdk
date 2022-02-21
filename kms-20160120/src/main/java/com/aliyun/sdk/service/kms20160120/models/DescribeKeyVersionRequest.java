// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKeyVersionRequest} extends {@link RequestModel}
 *
 * <p>DescribeKeyVersionRequest</p>
 */
public class DescribeKeyVersionRequest extends Request {
    @Query
    @NameInMap("KeyId")
    @Validation(required = true)
    private String keyId;

    @Query
    @NameInMap("KeyVersionId")
    @Validation(required = true)
    private String keyVersionId;

    private DescribeKeyVersionRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKeyVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return keyVersionId
     */
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public static final class Builder extends Request.Builder<DescribeKeyVersionRequest, Builder> {
        private String keyId; 
        private String keyVersionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKeyVersionRequest response) {
            super(response);
            this.keyId = response.keyId;
            this.keyVersionId = response.keyVersionId;
        } 

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * KeyVersionId.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.putQueryParameter("KeyVersionId", keyVersionId);
            this.keyVersionId = keyVersionId;
            return this;
        }

        @Override
        public DescribeKeyVersionRequest build() {
            return new DescribeKeyVersionRequest(this);
        } 

    } 

}
