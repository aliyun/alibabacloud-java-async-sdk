// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePushRuleRequest} extends {@link RequestModel}
 *
 * <p>CreatePushRuleRequest</p>
 */
public class CreatePushRuleRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("ruleInfos")
    @Validation(required = true)
    private java.util.List < RuleInfos> ruleInfos;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private CreatePushRuleRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.ruleInfos = builder.ruleInfos;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePushRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return ruleInfos
     */
    public java.util.List < RuleInfos> getRuleInfos() {
        return this.ruleInfos;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<CreatePushRuleRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private java.util.List < RuleInfos> ruleInfos; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePushRuleRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.ruleInfos = request.ruleInfos;
            this.organizationId = request.organizationId;
        } 

        /**
         * repositoryId.
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * ruleInfos.
         */
        public Builder ruleInfos(java.util.List < RuleInfos> ruleInfos) {
            this.putBodyParameter("ruleInfos", ruleInfos);
            this.ruleInfos = ruleInfos;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public CreatePushRuleRequest build() {
            return new CreatePushRuleRequest(this);
        } 

    } 

    public static class RuleInfos extends TeaModel {
        @NameInMap("checkerName")
        private String checkerName;

        @NameInMap("checkerType")
        private String checkerType;

        @NameInMap("extraMessage")
        private String extraMessage;

        @NameInMap("fileRuleRegexes")
        private java.util.List < String > fileRuleRegexes;

        private RuleInfos(Builder builder) {
            this.checkerName = builder.checkerName;
            this.checkerType = builder.checkerType;
            this.extraMessage = builder.extraMessage;
            this.fileRuleRegexes = builder.fileRuleRegexes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfos create() {
            return builder().build();
        }

        /**
         * @return checkerName
         */
        public String getCheckerName() {
            return this.checkerName;
        }

        /**
         * @return checkerType
         */
        public String getCheckerType() {
            return this.checkerType;
        }

        /**
         * @return extraMessage
         */
        public String getExtraMessage() {
            return this.extraMessage;
        }

        /**
         * @return fileRuleRegexes
         */
        public java.util.List < String > getFileRuleRegexes() {
            return this.fileRuleRegexes;
        }

        public static final class Builder {
            private String checkerName; 
            private String checkerType; 
            private String extraMessage; 
            private java.util.List < String > fileRuleRegexes; 

            /**
             * checkerName.
             */
            public Builder checkerName(String checkerName) {
                this.checkerName = checkerName;
                return this;
            }

            /**
             * checkerType.
             */
            public Builder checkerType(String checkerType) {
                this.checkerType = checkerType;
                return this;
            }

            /**
             * extraMessage.
             */
            public Builder extraMessage(String extraMessage) {
                this.extraMessage = extraMessage;
                return this;
            }

            /**
             * fileRuleRegexes.
             */
            public Builder fileRuleRegexes(java.util.List < String > fileRuleRegexes) {
                this.fileRuleRegexes = fileRuleRegexes;
                return this;
            }

            public RuleInfos build() {
                return new RuleInfos(this);
            } 

        } 

    }
}
