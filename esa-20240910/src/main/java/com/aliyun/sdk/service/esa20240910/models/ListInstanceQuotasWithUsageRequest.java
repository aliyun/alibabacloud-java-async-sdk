// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstanceQuotasWithUsageRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceQuotasWithUsageRequest</p>
 */
public class ListInstanceQuotasWithUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private ListInstanceQuotasWithUsageRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.quotaNames = builder.quotaNames;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceQuotasWithUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return quotaNames
     */
    public String getQuotaNames() {
        return this.quotaNames;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ListInstanceQuotasWithUsageRequest, Builder> {
        private String instanceId; 
        private String quotaNames; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceQuotasWithUsageRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.quotaNames = request.quotaNames;
            this.siteId = request.siteId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customHttpCert</p>
         */
        public Builder quotaNames(String quotaNames) {
            this.putQueryParameter("QuotaNames", quotaNames);
            this.quotaNames = quotaNames;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ListInstanceQuotasWithUsageRequest build() {
            return new ListInstanceQuotasWithUsageRequest(this);
        } 

    } 

}
