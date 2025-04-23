// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link SetGtmAccessModeRequest} extends {@link RequestModel}
 *
 * <p>SetGtmAccessModeRequest</p>
 */
public class SetGtmAccessModeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyId;

    private SetGtmAccessModeRequest(Builder builder) {
        super(builder);
        this.accessMode = builder.accessMode;
        this.lang = builder.lang;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetGtmAccessModeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessMode
     */
    public String getAccessMode() {
        return this.accessMode;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return strategyId
     */
    public String getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder extends Request.Builder<SetGtmAccessModeRequest, Builder> {
        private String accessMode; 
        private String lang; 
        private String strategyId; 

        private Builder() {
            super();
        } 

        private Builder(SetGtmAccessModeRequest request) {
            super(request);
            this.accessMode = request.accessMode;
            this.lang = request.lang;
            this.strategyId = request.strategyId;
        } 

        /**
         * <p>The desired access policy. Valid values:</p>
         * <ul>
         * <li><strong>AUTO: performs automatic switchover between the primary and secondary address pool sets upon failures.</strong></li>
         * <li><strong>DEFAULT: specifies the primary address pool set.</strong></li>
         * <li>**FAILOVER: specifies the secondary address pool set.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        public Builder accessMode(String accessMode) {
            this.putQueryParameter("AccessMode", accessMode);
            this.accessMode = accessMode;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the access policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hra0hx</p>
         */
        public Builder strategyId(String strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public SetGtmAccessModeRequest build() {
            return new SetGtmAccessModeRequest(this);
        } 

    } 

}
