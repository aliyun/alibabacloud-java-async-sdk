// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelDetailRequest} extends {@link RequestModel}
 *
 * <p>GetModelDetailRequest</p>
 */
public class GetModelDetailRequest extends Request {
    @Query
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    private Long algorithmId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private GetModelDetailRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmId
     */
    public Long getAlgorithmId() {
        return this.algorithmId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetModelDetailRequest, Builder> {
        private Long algorithmId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetModelDetailRequest response) {
            super(response);
            this.algorithmId = response.algorithmId;
            this.version = response.version;
        } 

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(Long algorithmId) {
            this.putQueryParameter("AlgorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetModelDetailRequest build() {
            return new GetModelDetailRequest(this);
        } 

    } 

}
