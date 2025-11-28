// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link DeletePrivacyRuleRequest} extends {@link RequestModel}
 *
 * <p>DeletePrivacyRuleRequest</p>
 */
public class DeletePrivacyRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivacyRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String privacyRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeletePrivacyRuleRequest(Builder builder) {
        super(builder);
        this.privacyRuleId = builder.privacyRuleId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrivacyRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privacyRuleId
     */
    public String getPrivacyRuleId() {
        return this.privacyRuleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeletePrivacyRuleRequest, Builder> {
        private String privacyRuleId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrivacyRuleRequest request) {
            super(request);
            this.privacyRuleId = request.privacyRuleId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder privacyRuleId(String privacyRuleId) {
            this.putQueryParameter("PrivacyRuleId", privacyRuleId);
            this.privacyRuleId = privacyRuleId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeletePrivacyRuleRequest build() {
            return new DeletePrivacyRuleRequest(this);
        } 

    } 

}
