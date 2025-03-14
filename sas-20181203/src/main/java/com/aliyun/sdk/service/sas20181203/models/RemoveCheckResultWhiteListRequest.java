// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link RemoveCheckResultWhiteListRequest} extends {@link RequestModel}
 *
 * <p>RemoveCheckResultWhiteListRequest</p>
 */
public class RemoveCheckResultWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckGroupId")
    private String checkGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private java.util.List<Long> checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private RemoveCheckResultWhiteListRequest(Builder builder) {
        super(builder);
        this.checkGroupId = builder.checkGroupId;
        this.checkIds = builder.checkIds;
        this.ruleId = builder.ruleId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveCheckResultWhiteListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkGroupId
     */
    public String getCheckGroupId() {
        return this.checkGroupId;
    }

    /**
     * @return checkIds
     */
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<RemoveCheckResultWhiteListRequest, Builder> {
        private String checkGroupId; 
        private java.util.List<Long> checkIds; 
        private Long ruleId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(RemoveCheckResultWhiteListRequest request) {
            super(request);
            this.checkGroupId = request.checkGroupId;
            this.checkIds = request.checkIds;
            this.ruleId = request.ruleId;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Deprecated</p>
         */
        public Builder checkGroupId(String checkGroupId) {
            this.putQueryParameter("CheckGroupId", checkGroupId);
            this.checkGroupId = checkGroupId;
            return this;
        }

        /**
         * <p>The IDs of the check items.</p>
         */
        public Builder checkIds(java.util.List<Long> checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * <p>The ID of the whitelist rule.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to query the IDs of whitelist rules.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Deprecated</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public RemoveCheckResultWhiteListRequest build() {
            return new RemoveCheckResultWhiteListRequest(this);
        } 

    } 

}
