// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockMemberRequest} extends {@link RequestModel}
 *
 * <p>LockMemberRequest</p>
 */
public class LockMemberRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("MemberId")
    @Validation(required = true)
    private String memberId;

    private LockMemberRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.memberId = builder.memberId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockMemberRequest create() {
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

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    public static final class Builder extends Request.Builder<LockMemberRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private String memberId; 

        private Builder() {
            super();
        } 

        private Builder(LockMemberRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.memberId = request.memberId;
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

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        @Override
        public LockMemberRequest build() {
            return new LockMemberRequest(this);
        } 

    } 

}
