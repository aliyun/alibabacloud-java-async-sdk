// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMPCoSResourceInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeMPCoSResourceInfoRequest</p>
 */
public class DescribeMPCoSResourceInfoRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    private DescribeMPCoSResourceInfoRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMPCoSResourceInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    public static final class Builder extends Request.Builder<DescribeMPCoSResourceInfoRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMPCoSResourceInfoRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * BizChainId.
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        @Override
        public DescribeMPCoSResourceInfoRequest build() {
            return new DescribeMPCoSResourceInfoRequest(this);
        } 

    } 

}
