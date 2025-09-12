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
 * {@link TravelStandardScopeSaveRequest} extends {@link RequestModel}
 *
 * <p>TravelStandardScopeSaveRequest</p>
 */
public class TravelStandardScopeSaveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("from_group")
    private Boolean fromGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rule_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scope")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2, minimum = 1)
    private Integer scope;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsBtripCorpToken;

    private TravelStandardScopeSaveRequest(Builder builder) {
        super(builder);
        this.fromGroup = builder.fromGroup;
        this.ruleId = builder.ruleId;
        this.scope = builder.scope;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TravelStandardScopeSaveRequest create() {
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
     * @return scope
     */
    public Integer getScope() {
        return this.scope;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TravelStandardScopeSaveRequest, Builder> {
        private Boolean fromGroup; 
        private Long ruleId; 
        private Integer scope; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TravelStandardScopeSaveRequest request) {
            super(request);
            this.fromGroup = request.fromGroup;
            this.ruleId = request.ruleId;
            this.scope = request.scope;
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
         * <p>1</p>
         */
        public Builder scope(Integer scope) {
            this.putQueryParameter("scope", scope);
            this.scope = scope;
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
        public TravelStandardScopeSaveRequest build() {
            return new TravelStandardScopeSaveRequest(this);
        } 

    } 

}
