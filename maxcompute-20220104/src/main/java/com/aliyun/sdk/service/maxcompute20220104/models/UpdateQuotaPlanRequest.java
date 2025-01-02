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
 * {@link UpdateQuotaPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateQuotaPlanRequest</p>
 */
public class UpdateQuotaPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateQuotaPlanRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.planName = builder.planName;
        this.body = builder.body;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQuotaPlanRequest create() {
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
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
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

    public static final class Builder extends Request.Builder<UpdateQuotaPlanRequest, Builder> {
        private String nickname; 
        private String planName; 
        private String body; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQuotaPlanRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.planName = request.planName;
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
         * <p>The name of the quota plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        public Builder planName(String planName) {
            this.putPathParameter("planName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * <p>The request body parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;name&quot;: &quot;planA&quot;, // The quota is a level-1 quota. You can select only the fields that are related to the quota plan. &quot;quota&quot;: { &quot;name&quot;: &quot;a&quot;, &quot;nickName&quot;: &quot;aaa_nick&quot;, &quot;tenantId&quot;: &quot;10001&quot;, &quot;regionId&quot;: &quot;cn-hangzhou&quot;, &quot;parentId&quot;: &quot;0&quot;, &quot;cluster&quot;: &quot;AT-ODPS-TEST3&quot;, &quot;parameter&quot;: { &quot;minCU&quot;: 40, &quot;maxCU&quot;: 40, &quot;adhocCU&quot;: 0, &quot;elasticMinCU&quot;: 40, &quot;elasticMaxCU&quot;: 40, &quot;enablePreemptiveScheduling&quot;: false, &quot;forceReservedMin&quot;:true, &quot;enablePriority&quot;:false, &quot;singleJobCULimit&quot;:100, &quot;adhocQuotaBeginTimeInSec&quot;: 1345, &quot;adhocQuotaEndTimeInSec&quot;: 1234, &quot;ignoreAdhocQuota&quot;:false }, &quot;subQuotaInfoList&quot;: [ { &quot;nickName&quot;: &quot;WlmFuxiSecondaryOnlineQuotaTest&quot;, &quot;name&quot;: &quot;WlmFuxiSecondaryOnlineQuotaTest&quot;, &quot;type&quot;: &quot;FUXI_ONLINE&quot;, &quot;tenantId&quot;: &quot;10001&quot;, &quot;regionId&quot;: &quot;cn-hangzhou&quot;, &quot;cluster&quot;: &quot;AT-ODPS-TEST3&quot;, &quot;parameter&quot;: { &quot;minCU&quot;: 40, &quot;maxCU&quot;: 40, &quot;adhocCU&quot;: 0, &quot;elasticMinCU&quot;: 40, &quot;elasticMaxCU&quot;: 40, &quot;enablePreemptiveScheduling&quot;: false, &quot;forceReservedMin&quot;:true, &quot;enablePriority&quot;:false, &quot;singleJobCULimit&quot;:100, &quot;adhocQuotaBeginTimeInSec&quot;: 1345, &quot;adhocQuotaEndTimeInSec&quot;: 1234, &quot;ignoreAdhocQuota&quot;:false } } ] } }</p>
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
         * <p>cn-hangzhou</p>
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
        public UpdateQuotaPlanRequest build() {
            return new UpdateQuotaPlanRequest(this);
        } 

    } 

}
