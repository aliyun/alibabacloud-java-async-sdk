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
 * {@link GetWafQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetWafQuotaRequest</p>
 */
public class GetWafQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Paths")
    private String paths;

    private GetWafQuotaRequest(Builder builder) {
        super(builder);
        this.paths = builder.paths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWafQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return paths
     */
    public String getPaths() {
        return this.paths;
    }

    public static final class Builder extends Request.Builder<GetWafQuotaRequest, Builder> {
        private String paths; 

        private Builder() {
            super();
        } 

        private Builder(GetWafQuotaRequest request) {
            super(request);
            this.paths = request.paths;
        } 

        /**
         * <p>The path of the WAF quota, for example:</p>
         * <ul>
         * <li>managed_rules_group: represents the quota for the WAF managed rules group</li>
         * <li>list: represents the quota for custom lists</li>
         * <li>page: represents the quota for custom response pages</li>
         * <li>scene_policy: represents the quota for scenario protection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>page</p>
         */
        public Builder paths(String paths) {
            this.putQueryParameter("Paths", paths);
            this.paths = paths;
            return this;
        }

        @Override
        public GetWafQuotaRequest build() {
            return new GetWafQuotaRequest(this);
        } 

    } 

}
