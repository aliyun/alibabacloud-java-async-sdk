// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetAliDingMinutesContentRequest} extends {@link RequestModel}
 *
 * <p>GetAliDingMinutesContentRequest</p>
 */
public class GetAliDingMinutesContentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("minutesId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String minutesId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetAliDingMinutesContentRequest(Builder builder) {
        super(builder);
        this.minutesId = builder.minutesId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAliDingMinutesContentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return minutesId
     */
    public String getMinutesId() {
        return this.minutesId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetAliDingMinutesContentRequest, Builder> {
        private String minutesId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetAliDingMinutesContentRequest request) {
            super(request);
            this.minutesId = request.minutesId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The DingTalk minutes ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>76327569643231383535353939365f3436383537393431335f32</p>
         */
        public Builder minutesId(String minutesId) {
            this.putBodyParameter("minutesId", minutesId);
            this.minutesId = minutesId;
            return this;
        }

        /**
         * <p>The ID of the effective tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetAliDingMinutesContentRequest build() {
            return new GetAliDingMinutesContentRequest(this);
        } 

    } 

}
