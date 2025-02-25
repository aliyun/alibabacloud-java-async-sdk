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
 * {@link GetWafFilterRequest} extends {@link RequestModel}
 *
 * <p>GetWafFilterRequest</p>
 */
public class GetWafFilterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetWafFilterRequest(Builder builder) {
        super(builder);
        this.phase = builder.phase;
        this.siteId = builder.siteId;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWafFilterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetWafFilterRequest, Builder> {
        private String phase; 
        private Long siteId; 
        private String target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetWafFilterRequest request) {
            super(request);
            this.phase = request.phase;
            this.siteId = request.siteId;
            this.target = request.target;
            this.type = request.type;
        } 

        /**
         * <p>The WAF rule category to which the filter conditions to query belong.</p>
         * 
         * <strong>example:</strong>
         * <p>http_bot</p>
         */
        public Builder phase(String phase) {
            this.putQueryParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The condition for matching incoming requests.</p>
         * 
         * <strong>example:</strong>
         * <p>characteristics</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>http_custom_cc</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetWafFilterRequest build() {
            return new GetWafFilterRequest(this);
        } 

    } 

}
