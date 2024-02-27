// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCsrRequest} extends {@link RequestModel}
 *
 * <p>UpdateCsrRequest</p>
 */
public class UpdateCsrRequest extends Request {
    @Query
    @NameInMap("CsrId")
    @Validation(required = true)
    private Long csrId;

    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    private UpdateCsrRequest(Builder builder) {
        super(builder);
        this.csrId = builder.csrId;
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCsrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return csrId
     */
    public Long getCsrId() {
        return this.csrId;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder extends Request.Builder<UpdateCsrRequest, Builder> {
        private Long csrId; 
        private String key; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCsrRequest request) {
            super(request);
            this.csrId = request.csrId;
            this.key = request.key;
        } 

        /**
         * CSR ID。
         */
        public Builder csrId(Long csrId) {
            this.putQueryParameter("CsrId", csrId);
            this.csrId = csrId;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        @Override
        public UpdateCsrRequest build() {
            return new UpdateCsrRequest(this);
        } 

    } 

}
