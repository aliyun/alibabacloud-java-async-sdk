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
 * {@link UpdateQuotaScheduleRequest} extends {@link RequestModel}
 *
 * <p>UpdateQuotaScheduleRequest</p>
 */
public class UpdateQuotaScheduleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateQuotaScheduleRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.body = builder.body;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQuotaScheduleRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
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

    public static final class Builder extends Request.Builder<UpdateQuotaScheduleRequest, Builder> {
        private String nickname; 
        private String body; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQuotaScheduleRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.body = request.body;
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
         * <p>The request body parameters.</p>
         * 
         * <strong>example:</strong>
         * <p># The quota plan immediately takes effect. [ { &quot;type&quot;: &quot;once&quot;, &quot;plan&quot;: &quot;planA&quot;, &quot;operator&quot;:&quot;userA&quot; } ] # The quota plan is scheduled on a regular basis. [ { &quot;id&quot;: &quot;etl_time&quot;, &quot;type&quot;: &quot;daily&quot;, &quot;condition&quot;: { &quot;at&quot;: &quot;0800&quot;, &quot;after&quot;: &quot;2022-04-25T04:23:04Z&quot; // optional }, &quot;plan&quot;: &quot;planA&quot; }, { &quot;id&quot;: &quot;bi&quot;, &quot;type&quot;: &quot;daily&quot;, &quot;condition&quot;: { &quot;at&quot;: &quot;0900&quot;, &quot;after&quot;: &quot;2022-04-25T04:23:04Z&quot; // optional }, &quot;plan&quot;: &quot;planB&quot; }, ]</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
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
        public UpdateQuotaScheduleRequest build() {
            return new UpdateQuotaScheduleRequest(this);
        } 

    } 

}
