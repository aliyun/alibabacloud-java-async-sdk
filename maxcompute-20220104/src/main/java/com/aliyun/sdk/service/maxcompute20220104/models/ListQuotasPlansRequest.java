// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListQuotasPlansRequest} extends {@link RequestModel}
 *
 * <p>ListQuotasPlansRequest</p>
 */
public class ListQuotasPlansRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListQuotasPlansRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotasPlansRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListQuotasPlansRequest, Builder> {
        private String nickname; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotasPlansRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.region = request.region;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The name of the quota.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>quotaA</p>
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>478403690625249</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListQuotasPlansRequest build() {
            return new ListQuotasPlansRequest(this);
        } 

    } 

}
