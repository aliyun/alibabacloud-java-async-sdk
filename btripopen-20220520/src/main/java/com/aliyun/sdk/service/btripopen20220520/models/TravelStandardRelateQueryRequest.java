// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TravelStandardRelateQueryRequest} extends {@link RequestModel}
 *
 * <p>TravelStandardRelateQueryRequest</p>
 */
public class TravelStandardRelateQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("from_group")
    private Boolean fromGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rule_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsBtripCorpToken;

    private TravelStandardRelateQueryRequest(Builder builder) {
        super(builder);
        this.fromGroup = builder.fromGroup;
        this.ruleId = builder.ruleId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TravelStandardRelateQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromGroup
     */
    public Boolean getFromGroup() {
        return this.fromGroup;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TravelStandardRelateQueryRequest, Builder> {
        private Boolean fromGroup; 
        private Long ruleId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TravelStandardRelateQueryRequest request) {
            super(request);
            this.fromGroup = request.fromGroup;
            this.ruleId = request.ruleId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * from_group.
         */
        public Builder fromGroup(Boolean fromGroup) {
            this.putQueryParameter("from_group", fromGroup);
            this.fromGroup = fromGroup;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6516571</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("rule_id", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>feth00jqwls</p>
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TravelStandardRelateQueryRequest build() {
            return new TravelStandardRelateQueryRequest(this);
        } 

    } 

}
