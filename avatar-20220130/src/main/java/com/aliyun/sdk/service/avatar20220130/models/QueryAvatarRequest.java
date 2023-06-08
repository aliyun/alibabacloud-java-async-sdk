// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAvatarRequest} extends {@link RequestModel}
 *
 * <p>QueryAvatarRequest</p>
 */
public class QueryAvatarRequest extends Request {
    @Query
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    private QueryAvatarRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAvatarRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryAvatarRequest, Builder> {
        private String code; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAvatarRequest request) {
            super(request);
            this.code = request.code;
            this.tenantId = request.tenantId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QueryAvatarRequest build() {
            return new QueryAvatarRequest(this);
        } 

    } 

}
