// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlertTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateAlertTemplateRequest</p>
 */
public class CreateAlertTemplateRequest extends Request {
    @Query
    @NameInMap("Annotations")
    private String annotations;

    @Query
    @NameInMap("Labels")
    private String labels;

    @Query
    @NameInMap("MatchExpressions")
    private String matchExpressions;

    @Query
    @NameInMap("Message")
    @Validation(required = true)
    private String message;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ParentId")
    private String parentId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Rule")
    @Validation(required = true)
    private String rule;

    @Query
    @NameInMap("TemplateProvider")
    private String templateProvider;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateAlertTemplateRequest(Builder builder) {
        super(builder);
        this.annotations = builder.annotations;
        this.labels = builder.labels;
        this.matchExpressions = builder.matchExpressions;
        this.message = builder.message;
        this.name = builder.name;
        this.parentId = builder.parentId;
        this.regionId = builder.regionId;
        this.rule = builder.rule;
        this.templateProvider = builder.templateProvider;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotations
     */
    public String getAnnotations() {
        return this.annotations;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return matchExpressions
     */
    public String getMatchExpressions() {
        return this.matchExpressions;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return templateProvider
     */
    public String getTemplateProvider() {
        return this.templateProvider;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateAlertTemplateRequest, Builder> {
        private String annotations; 
        private String labels; 
        private String matchExpressions; 
        private String message; 
        private String name; 
        private String parentId; 
        private String regionId; 
        private String rule; 
        private String templateProvider; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlertTemplateRequest request) {
            super(request);
            this.annotations = request.annotations;
            this.labels = request.labels;
            this.matchExpressions = request.matchExpressions;
            this.message = request.message;
            this.name = request.name;
            this.parentId = request.parentId;
            this.regionId = request.regionId;
            this.rule = request.rule;
            this.templateProvider = request.templateProvider;
            this.type = request.type;
        } 

        /**
         * Annotations.
         */
        public Builder annotations(String annotations) {
            this.putQueryParameter("Annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * MatchExpressions.
         */
        public Builder matchExpressions(String matchExpressions) {
            this.putQueryParameter("MatchExpressions", matchExpressions);
            this.matchExpressions = matchExpressions;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ParentId.
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
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

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * TemplateProvider.
         */
        public Builder templateProvider(String templateProvider) {
            this.putQueryParameter("TemplateProvider", templateProvider);
            this.templateProvider = templateProvider;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateAlertTemplateRequest build() {
            return new CreateAlertTemplateRequest(this);
        } 

    } 

}
