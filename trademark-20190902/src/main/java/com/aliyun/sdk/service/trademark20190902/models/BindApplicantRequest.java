// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindApplicantRequest} extends {@link RequestModel}
 *
 * <p>BindApplicantRequest</p>
 */
public class BindApplicantRequest extends Request {
    @Query
    @NameInMap("ApplicantId")
    @Validation(required = true)
    private String applicantId;

    @Query
    @NameInMap("AuthorizationOssKey")
    private String authorizationOssKey;

    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    private BindApplicantRequest(Builder builder) {
        super(builder);
        this.applicantId = builder.applicantId;
        this.authorizationOssKey = builder.authorizationOssKey;
        this.bizId = builder.bizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindApplicantRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicantId
     */
    public String getApplicantId() {
        return this.applicantId;
    }

    /**
     * @return authorizationOssKey
     */
    public String getAuthorizationOssKey() {
        return this.authorizationOssKey;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    public static final class Builder extends Request.Builder<BindApplicantRequest, Builder> {
        private String applicantId; 
        private String authorizationOssKey; 
        private String bizId; 

        private Builder() {
            super();
        } 

        private Builder(BindApplicantRequest request) {
            super(request);
            this.applicantId = request.applicantId;
            this.authorizationOssKey = request.authorizationOssKey;
            this.bizId = request.bizId;
        } 

        /**
         * ApplicantId.
         */
        public Builder applicantId(String applicantId) {
            this.putQueryParameter("ApplicantId", applicantId);
            this.applicantId = applicantId;
            return this;
        }

        /**
         * AuthorizationOssKey.
         */
        public Builder authorizationOssKey(String authorizationOssKey) {
            this.putQueryParameter("AuthorizationOssKey", authorizationOssKey);
            this.authorizationOssKey = authorizationOssKey;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        @Override
        public BindApplicantRequest build() {
            return new BindApplicantRequest(this);
        } 

    } 

}
