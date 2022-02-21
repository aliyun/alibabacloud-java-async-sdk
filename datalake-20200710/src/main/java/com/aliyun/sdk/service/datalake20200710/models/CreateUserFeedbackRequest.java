// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserFeedbackRequest} extends {@link RequestModel}
 *
 * <p>CreateUserFeedbackRequest</p>
 */
public class CreateUserFeedbackRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Score")
    private String score;

    @Body
    @NameInMap("Tags")
    private String tags;

    private CreateUserFeedbackRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.regionId = builder.regionId;
        this.score = builder.score;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserFeedbackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return score
     */
    public String getScore() {
        return this.score;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateUserFeedbackRequest, Builder> {
        private String description; 
        private String regionId; 
        private String score; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserFeedbackRequest response) {
            super(response);
            this.description = response.description;
            this.regionId = response.regionId;
            this.score = response.score;
            this.tags = response.tags;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Score.
         */
        public Builder score(String score) {
            this.putBodyParameter("Score", score);
            this.score = score;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateUserFeedbackRequest build() {
            return new CreateUserFeedbackRequest(this);
        } 

    } 

}
