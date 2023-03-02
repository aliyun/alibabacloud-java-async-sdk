// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMemberCapacityInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeMemberCapacityInfoRequest</p>
 */
public class DescribeMemberCapacityInfoRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    private DescribeMemberCapacityInfoRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMemberCapacityInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeMemberCapacityInfoRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMemberCapacityInfoRequest request) {
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
        public DescribeMemberCapacityInfoRequest build() {
            return new DescribeMemberCapacityInfoRequest(this);
        } 

    } 

}
