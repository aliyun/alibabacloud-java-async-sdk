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
 * {@link KillJobsRequest} extends {@link RequestModel}
 *
 * <p>KillJobsRequest</p>
 */
public class KillJobsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private KillJobsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KillJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<KillJobsRequest, Builder> {
        private String body; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(KillJobsRequest request) {
            super(request);
            this.body = request.body;
            this.region = request.region;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The list of jobs to terminate. The instanceId is obtained from the job instance ID returned by ListJobInfos, and the projectName is obtained from the project name returned by ListProjects.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;instanceId&quot;: &quot;&quot;,
         *             &quot;projectName&quot;: &quot;&quot;
         *       },
         *       {
         *             &quot;instanceId&quot;: &quot;&quot;,
         *             &quot;projectName&quot;: &quot;&quot;
         *       }
         * ]</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The tenant ID.</p>
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
        public KillJobsRequest build() {
            return new KillJobsRequest(this);
        } 

    } 

}
