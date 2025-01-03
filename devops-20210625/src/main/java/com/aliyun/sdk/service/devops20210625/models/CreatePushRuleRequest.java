// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreatePushRuleRequest} extends {@link RequestModel}
 *
 * <p>CreatePushRuleRequest</p>
 */
public class CreatePushRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ruleInfos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RuleInfos> ruleInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<RuleInfos> getRuleInfos() {
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
        private java.util.List<RuleInfos> ruleInfos; 
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>187687</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder ruleInfos(java.util.List<RuleInfos> ruleInfos) {
            this.putBodyParameter("ruleInfos", ruleInfos);
            this.ruleInfos = ruleInfos;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
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

    /**
     * 
     * {@link CreatePushRuleRequest} extends {@link TeaModel}
     *
     * <p>CreatePushRuleRequest</p>
     */
    public static class RuleInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkerName")
        private String checkerName;

        @com.aliyun.core.annotation.NameInMap("checkerType")
        private String checkerType;

        @com.aliyun.core.annotation.NameInMap("extraMessage")
        private String extraMessage;

        @com.aliyun.core.annotation.NameInMap("fileRuleRegexes")
        private java.util.List<String> fileRuleRegexes;

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
        public java.util.List<String> getFileRuleRegexes() {
            return this.fileRuleRegexes;
        }

        public static final class Builder {
            private String checkerName; 
            private String checkerType; 
            private String extraMessage; 
            private java.util.List<String> fileRuleRegexes; 

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
            public Builder fileRuleRegexes(java.util.List<String> fileRuleRegexes) {
                this.fileRuleRegexes = fileRuleRegexes;
                return this;
            }

            public RuleInfos build() {
                return new RuleInfos(this);
            } 

        } 

    }
}
