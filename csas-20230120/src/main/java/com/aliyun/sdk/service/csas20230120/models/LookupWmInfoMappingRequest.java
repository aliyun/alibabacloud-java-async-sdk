// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LookupWmInfoMappingRequest} extends {@link RequestModel}
 *
 * <p>LookupWmInfoMappingRequest</p>
 */
public class LookupWmInfoMappingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WmInfoSize")
    @com.aliyun.core.annotation.Validation(maximum = 64, minimum = 32)
    private Long wmInfoSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WmInfoUint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wmInfoUint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WmType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wmType;

    private LookupWmInfoMappingRequest(Builder builder) {
        super(builder);
        this.wmInfoSize = builder.wmInfoSize;
        this.wmInfoUint = builder.wmInfoUint;
        this.wmType = builder.wmType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LookupWmInfoMappingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return wmInfoSize
     */
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    /**
     * @return wmInfoUint
     */
    public String getWmInfoUint() {
        return this.wmInfoUint;
    }

    /**
     * @return wmType
     */
    public String getWmType() {
        return this.wmType;
    }

    public static final class Builder extends Request.Builder<LookupWmInfoMappingRequest, Builder> {
        private Long wmInfoSize; 
        private String wmInfoUint; 
        private String wmType; 

        private Builder() {
            super();
        } 

        private Builder(LookupWmInfoMappingRequest request) {
            super(request);
            this.wmInfoSize = request.wmInfoSize;
            this.wmInfoUint = request.wmInfoUint;
            this.wmType = request.wmType;
        } 

        /**
         * WmInfoSize.
         */
        public Builder wmInfoSize(Long wmInfoSize) {
            this.putQueryParameter("WmInfoSize", wmInfoSize);
            this.wmInfoSize = wmInfoSize;
            return this;
        }

        /**
         * WmInfoUint.
         */
        public Builder wmInfoUint(String wmInfoUint) {
            this.putQueryParameter("WmInfoUint", wmInfoUint);
            this.wmInfoUint = wmInfoUint;
            return this;
        }

        /**
         * WmType.
         */
        public Builder wmType(String wmType) {
            this.putQueryParameter("WmType", wmType);
            this.wmType = wmType;
            return this;
        }

        @Override
        public LookupWmInfoMappingRequest build() {
            return new LookupWmInfoMappingRequest(this);
        } 

    } 

}
