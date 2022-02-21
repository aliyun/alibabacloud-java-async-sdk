// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemEffectionServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateProblemEffectionServiceRequest</p>
 */
public class CreateProblemEffectionServiceRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("level")
    private String level;

    @Body
    @NameInMap("pictureUrl")
    private java.util.List < String > pictureUrl;

    @Body
    @NameInMap("problemId")
    @Validation(required = true)
    private Long problemId;

    @Body
    @NameInMap("serviceId")
    private Long serviceId;

    @Body
    @NameInMap("status")
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

        private Builder(CreateProblemEffectionServiceRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.level = response.level;
            this.pictureUrl = response.pictureUrl;
            this.problemId = response.problemId;
            this.serviceId = response.serviceId;
            this.status = response.status;
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
         * 影响描述
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * 影响等级
         */
        public Builder level(String level) {
            this.putBodyParameter("level", level);
            this.level = level;
            return this;
        }

        /**
         * 图片地址
         */
        public Builder pictureUrl(java.util.List < String > pictureUrl) {
            this.putBodyParameter("pictureUrl", pictureUrl);
            this.pictureUrl = pictureUrl;
            return this;
        }

        /**
         * 故障id
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * 影响服务id
         */
        public Builder serviceId(Long serviceId) {
            this.putBodyParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * 影响状态 0 未恢复 1已恢复
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
