// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemEffectionServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateProblemEffectionServiceRequest</p>
 */
public class UpdateProblemEffectionServiceRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("effectionServiceId")
    private Long effectionServiceId;

    @Body
    @NameInMap("level")
    private String level;

    @Body
    @NameInMap("picUrl")
    private java.util.List < String > picUrl;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    @Body
    @NameInMap("serviceId")
    private Long serviceId;

    @Body
    @NameInMap("status")
    private String status;

    private UpdateProblemEffectionServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.effectionServiceId = builder.effectionServiceId;
        this.level = builder.level;
        this.picUrl = builder.picUrl;
        this.problemId = builder.problemId;
        this.serviceId = builder.serviceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProblemEffectionServiceRequest create() {
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
     * @return effectionServiceId
     */
    public Long getEffectionServiceId() {
        return this.effectionServiceId;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return picUrl
     */
    public java.util.List < String > getPicUrl() {
        return this.picUrl;
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

    public static final class Builder extends Request.Builder<UpdateProblemEffectionServiceRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Long effectionServiceId; 
        private String level; 
        private java.util.List < String > picUrl; 
        private Long problemId; 
        private Long serviceId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProblemEffectionServiceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.effectionServiceId = request.effectionServiceId;
            this.level = request.level;
            this.picUrl = request.picUrl;
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
         * effectionServiceId.
         */
        public Builder effectionServiceId(Long effectionServiceId) {
            this.putBodyParameter("effectionServiceId", effectionServiceId);
            this.effectionServiceId = effectionServiceId;
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
         * picUrl.
         */
        public Builder picUrl(java.util.List < String > picUrl) {
            this.putBodyParameter("picUrl", picUrl);
            this.picUrl = picUrl;
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
        public UpdateProblemEffectionServiceRequest build() {
            return new UpdateProblemEffectionServiceRequest(this);
        } 

    } 

}
