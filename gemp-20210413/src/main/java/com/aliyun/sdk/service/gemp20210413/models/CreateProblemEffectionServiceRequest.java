// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemEffectionServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateProblemEffectionServiceRequest</p>
 */
public class CreateProblemEffectionServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("level")
    private String level;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pictureUrl")
    private java.util.List < String > pictureUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long problemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceId")
    private Long serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private CreateProblemEffectionServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.level = builder.level;
        this.pictureUrl = builder.pictureUrl;
        this.problemId = builder.problemId;
        this.serviceId = builder.serviceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProblemEffectionServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return pictureUrl
     */
    public java.util.List < String > getPictureUrl() {
        return this.pictureUrl;
    }

    /**
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<CreateProblemEffectionServiceRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String level; 
        private java.util.List < String > pictureUrl; 
        private Long problemId; 
        private Long serviceId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(CreateProblemEffectionServiceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.level = request.level;
            this.pictureUrl = request.pictureUrl;
            this.problemId = request.problemId;
            this.serviceId = request.serviceId;
            this.status = request.status;
        } 

        /**
         * clientToken
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * level.
         */
        public Builder level(String level) {
            this.putBodyParameter("level", level);
            this.level = level;
            return this;
        }

        /**
         * pictureUrl.
         */
        public Builder pictureUrl(java.util.List < String > pictureUrl) {
            this.putBodyParameter("pictureUrl", pictureUrl);
            this.pictureUrl = pictureUrl;
            return this;
        }

        /**
         * problemId.
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * serviceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putBodyParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public CreateProblemEffectionServiceRequest build() {
            return new CreateProblemEffectionServiceRequest(this);
        } 

    } 

}
