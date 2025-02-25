// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link GetLinkInfoByUserIdRequest} extends {@link RequestModel}
 *
 * <p>GetLinkInfoByUserIdRequest</p>
 */
public class GetLinkInfoByUserIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private GetLinkInfoByUserIdRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLinkInfoByUserIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetLinkInfoByUserIdRequest, Builder> {
        private String domainId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetLinkInfoByUserIdRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetLinkInfoByUserIdRequest build() {
            return new GetLinkInfoByUserIdRequest(this);
        } 

    } 

}
