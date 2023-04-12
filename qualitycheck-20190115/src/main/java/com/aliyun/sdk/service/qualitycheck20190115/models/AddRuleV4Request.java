// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRuleV4Request} extends {@link RequestModel}
 *
 * <p>AddRuleV4Request</p>
 */
public class AddRuleV4Request extends Request {
    @Query
    @NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @Body
    @NameInMap("IsCopy")
    private Boolean isCopy;

    @Body
    @NameInMap("JsonStrForRule")
    @Validation(required = true)
    private String jsonStrForRule;

    private AddRuleV4Request(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.isCopy = builder.isCopy;
        this.jsonStrForRule = builder.jsonStrForRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRuleV4Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseMeAgentId
     */
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    /**
     * @return isCopy
     */
    public Boolean getIsCopy() {
        return this.isCopy;
    }

    /**
     * @return jsonStrForRule
     */
    public String getJsonStrForRule() {
        return this.jsonStrForRule;
    }

    public static final class Builder extends Request.Builder<AddRuleV4Request, Builder> {
        private Long baseMeAgentId; 
        private Boolean isCopy; 
        private String jsonStrForRule; 

        private Builder() {
            super();
        } 

        private Builder(AddRuleV4Request request) {
            super(request);
            this.baseMeAgentId = request.baseMeAgentId;
            this.isCopy = request.isCopy;
            this.jsonStrForRule = request.jsonStrForRule;
        } 

        /**
         * baseMeAgentId
         */
        public Builder baseMeAgentId(Long baseMeAgentId) {
            this.putQueryParameter("BaseMeAgentId", baseMeAgentId);
            this.baseMeAgentId = baseMeAgentId;
            return this;
        }

        /**
         * IsCopy.
         */
        public Builder isCopy(Boolean isCopy) {
            this.putBodyParameter("IsCopy", isCopy);
            this.isCopy = isCopy;
            return this;
        }

        /**
         * JsonStrForRule.
         */
        public Builder jsonStrForRule(String jsonStrForRule) {
            this.putBodyParameter("JsonStrForRule", jsonStrForRule);
            this.jsonStrForRule = jsonStrForRule;
            return this;
        }

        @Override
        public AddRuleV4Request build() {
            return new AddRuleV4Request(this);
        } 

    } 

}
