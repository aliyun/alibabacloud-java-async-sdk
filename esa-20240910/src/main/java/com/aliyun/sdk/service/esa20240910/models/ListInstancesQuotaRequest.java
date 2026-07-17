// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListInstancesQuotaRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesQuotaRequest</p>
 */
public class ListInstancesQuotaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaName;

    private ListInstancesQuotaRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.quotaName = builder.quotaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    public static final class Builder extends Request.Builder<ListInstancesQuotaRequest, Builder> {
        private String instanceIds; 
        private String quotaName; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesQuotaRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.quotaName = request.quotaName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-xcdn-96wblslz****,sp-xcdn-81wblslz****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putBodyParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf:phase:http_anti_scan:actions, waf:phase:http_bot:actions, siteCount</p>
         */
        public Builder quotaName(String quotaName) {
            this.putQueryParameter("QuotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        @Override
        public ListInstancesQuotaRequest build() {
            return new ListInstancesQuotaRequest(this);
        } 

    } 

}
