// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ManageAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>ManageAlertRulesRequest</p>
 */
public class ManageAlertRulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ManageAlertRulesUnifiedActionInput body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("callSource")
    private String callSource;

    private ManageAlertRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.body = builder.body;
        this.callSource = builder.callSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageAlertRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return body
     */
    public ManageAlertRulesUnifiedActionInput getBody() {
        return this.body;
    }

    /**
     * @return callSource
     */
    public String getCallSource() {
        return this.callSource;
    }

    public static final class Builder extends Request.Builder<ManageAlertRulesRequest, Builder> {
        private String regionId; 
        private ManageAlertRulesUnifiedActionInput body; 
        private String callSource; 

        private Builder() {
            super();
        } 

        private Builder(ManageAlertRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.body = request.body;
            this.callSource = request.callSource;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(ManageAlertRulesUnifiedActionInput body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * callSource.
         */
        public Builder callSource(String callSource) {
            this.putQueryParameter("callSource", callSource);
            this.callSource = callSource;
            return this;
        }

        @Override
        public ManageAlertRulesRequest build() {
            return new ManageAlertRulesRequest(this);
        } 

    } 

}
