// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlertTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertTemplateRequest</p>
 */
public class UpdateAlertTemplateRequest extends Request {
    @Query
    @NameInMap("Annotations")
    private String annotations;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Rule")
    @Validation(required = true)
    private String rule;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private Boolean status;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private UpdateAlertTemplateRequest(Builder builder) {
        super(builder);
        this.annotations = builder.annotations;
        this.id = builder.id;
        this.labels = builder.labels;
        this.matchExpressions = builder.matchExpressions;
        this.message = builder.message;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.rule = builder.rule;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertTemplateRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateAlertTemplateRequest, Builder> {
        private String annotations; 
        private Long id; 
        private String labels; 
        private String matchExpressions; 
        private String message; 
        private String name; 
        private String regionId; 
        private String rule; 
        private Boolean status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertTemplateRequest request) {
            super(request);
            this.annotations = request.annotations;
            this.id = request.id;
            this.labels = request.labels;
            this.matchExpressions = request.matchExpressions;
            this.message = request.message;
            this.name = request.name;
            this.regionId = request.regionId;
            this.rule = request.rule;
            this.status = request.status;
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
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * Status.
         */
        public Builder status(Boolean status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
        public UpdateAlertTemplateRequest build() {
            return new UpdateAlertTemplateRequest(this);
        } 

    } 

}
