// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubCorpRequest} extends {@link RequestModel}
 *
 * <p>CreateSubCorpRequest</p>
 */
public class CreateSubCorpRequest extends Request {
    @Body
    @NameInMap("outer_corp_id")
    @Validation(required = true)
    private String outerCorpId;

    @Body
    @NameInMap("outer_corp_name")
    @Validation(required = true)
    private String outerCorpName;

    @Body
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private CreateSubCorpRequest(Builder builder) {
        super(builder);
        this.outerCorpId = builder.outerCorpId;
        this.outerCorpName = builder.outerCorpName;
        this.userId = builder.userId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubCorpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outerCorpId
     */
    public String getOuterCorpId() {
        return this.outerCorpId;
    }

    /**
     * @return outerCorpName
     */
    public String getOuterCorpName() {
        return this.outerCorpName;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<CreateSubCorpRequest, Builder> {
        private String outerCorpId; 
        private String outerCorpName; 
        private String userId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubCorpRequest request) {
            super(request);
            this.outerCorpId = request.outerCorpId;
            this.outerCorpName = request.outerCorpName;
            this.userId = request.userId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * 三方企业id
         */
        public Builder outerCorpId(String outerCorpId) {
            this.putBodyParameter("outer_corp_id", outerCorpId);
            this.outerCorpId = outerCorpId;
            return this;
        }

        /**
         * 三方企业名称
         */
        public Builder outerCorpName(String outerCorpName) {
            this.putBodyParameter("outer_corp_name", outerCorpName);
            this.outerCorpName = outerCorpName;
            return this;
        }

        /**
         * 用户id
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public CreateSubCorpRequest build() {
            return new CreateSubCorpRequest(this);
        } 

    } 

}
