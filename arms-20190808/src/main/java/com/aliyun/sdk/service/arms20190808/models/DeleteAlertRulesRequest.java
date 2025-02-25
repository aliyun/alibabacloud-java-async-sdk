// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link DeleteAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertRulesRequest</p>
 */
public class DeleteAlertRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteAlertRulesRequest(Builder builder) {
        super(builder);
        this.alertIds = builder.alertIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertIds
     */
    public String getAlertIds() {
        return this.alertIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAlertRulesRequest, Builder> {
        private String alertIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertRulesRequest request) {
            super(request);
            this.alertIds = request.alertIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of the alert rules that you want to delete. The value is a JSON array, for example, <code>[123, 234]</code>. You can call the SearchAlertRules operation and view the <code>Id</code> parameter in the response to obtain the alert rule ID. For more information, see <a href="https://help.aliyun.com/document_detail/175825.html">SearchAlertRules</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[123, 234]</p>
         */
        public Builder alertIds(String alertIds) {
            this.putQueryParameter("AlertIds", alertIds);
            this.alertIds = alertIds;
            return this;
        }

        /**
         * <p>The region ID. Default value: <code>cn-hangzhou</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteAlertRulesRequest build() {
            return new DeleteAlertRulesRequest(this);
        } 

    } 

}
