// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BaseUserPunishRuleResponse} extends {@link TeaModel}
 *
 * <p>BaseUserPunishRuleResponse</p>
 */
public class BaseUserPunishRuleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List < Results> results;

    private BaseUserPunishRuleResponse(BuilderImpl builder) {
        super(builder);
        this.results = builder.results;
    }

    public static BaseUserPunishRuleResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return results
     */
    public java.util.List < Results> getResults() {
        return this.results;
    }

    public interface Builder extends Response.Builder<BaseUserPunishRuleResponse, Builder> {

        Builder results(java.util.List < Results> results);

        @Override
        BaseUserPunishRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BaseUserPunishRuleResponse, Builder>
            implements Builder {
        private java.util.List < Results> results; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BaseUserPunishRuleResponse response) {
            super(response);
            this.results = response.results;
        } 

        /**
         * results.
         */
        @Override
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        @Override
        public BaseUserPunishRuleResponse build() {
            return new BaseUserPunishRuleResponse(this);
        } 

    } 

    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private Results(Builder builder) {
            this.success = builder.success;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Boolean success; 
            private String userId; 

            /**
             * success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
