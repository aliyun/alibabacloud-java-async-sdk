// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
         * <p>The type of WAF resources. Valid values:</p>
         * <ul>
         * <li>managed_rules_group: the managed rule group.</li>
         * <li>list: the custom list.</li>
         * <li>page: the custom error page.</li>
         * <li>scene_policy: the scenario-specific policy.</li>
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
