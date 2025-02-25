// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateWmInfoMappingRequest} extends {@link RequestModel}
 *
 * <p>CreateWmInfoMappingRequest</p>
 */
public class CreateWmInfoMappingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmInfoBytesB64")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 400)
    private String wmInfoBytesB64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmInfoSize")
    @com.aliyun.core.annotation.Validation(maximum = 64, minimum = 32)
    private Long wmInfoSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wmType;

    private CreateWmInfoMappingRequest(Builder builder) {
        super(builder);
        this.wmInfoBytesB64 = builder.wmInfoBytesB64;
        this.wmInfoSize = builder.wmInfoSize;
        this.wmType = builder.wmType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWmInfoMappingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return wmInfoBytesB64
     */
    public String getWmInfoBytesB64() {
        return this.wmInfoBytesB64;
    }

    /**
     * @return wmInfoSize
     */
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    /**
     * @return wmType
     */
    public String getWmType() {
        return this.wmType;
    }

    public static final class Builder extends Request.Builder<CreateWmInfoMappingRequest, Builder> {
        private String wmInfoBytesB64; 
        private Long wmInfoSize; 
        private String wmType; 

        private Builder() {
            super();
        } 

        private Builder(CreateWmInfoMappingRequest request) {
            super(request);
            this.wmInfoBytesB64 = request.wmInfoBytesB64;
            this.wmInfoSize = request.wmInfoSize;
            this.wmType = request.wmType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aGVsbG8gc2F*****</p>
         */
        public Builder wmInfoBytesB64(String wmInfoBytesB64) {
            this.putBodyParameter("WmInfoBytesB64", wmInfoBytesB64);
            this.wmInfoBytesB64 = wmInfoBytesB64;
            return this;
        }

        /**
         * WmInfoSize.
         */
        public Builder wmInfoSize(Long wmInfoSize) {
            this.putBodyParameter("WmInfoSize", wmInfoSize);
            this.wmInfoSize = wmInfoSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PureDocument</p>
         */
        public Builder wmType(String wmType) {
            this.putBodyParameter("WmType", wmType);
            this.wmType = wmType;
            return this;
        }

        @Override
        public CreateWmInfoMappingRequest build() {
            return new CreateWmInfoMappingRequest(this);
        } 

    } 

}
