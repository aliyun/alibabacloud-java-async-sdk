// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevertPlaybookReleaseRequest} extends {@link RequestModel}
 *
 * <p>RevertPlaybookReleaseRequest</p>
 */
public class RevertPlaybookReleaseRequest extends Request {
    @Body
    @NameInMap("IsPublish")
    private Boolean isPublish;

    @Body
    @NameInMap("PlayReleaseId")
    @Validation(required = true)
    private Integer playReleaseId;

    @Body
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    private RevertPlaybookReleaseRequest(Builder builder) {
        super(builder);
        this.isPublish = builder.isPublish;
        this.playReleaseId = builder.playReleaseId;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevertPlaybookReleaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isPublish
     */
    public Boolean getIsPublish() {
        return this.isPublish;
    }

    /**
     * @return playReleaseId
     */
    public Integer getPlayReleaseId() {
        return this.playReleaseId;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public static final class Builder extends Request.Builder<RevertPlaybookReleaseRequest, Builder> {
        private Boolean isPublish; 
        private Integer playReleaseId; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(RevertPlaybookReleaseRequest request) {
            super(request);
            this.isPublish = request.isPublish;
            this.playReleaseId = request.playReleaseId;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * IsPublish.
         */
        public Builder isPublish(Boolean isPublish) {
            this.putBodyParameter("IsPublish", isPublish);
            this.isPublish = isPublish;
            return this;
        }

        /**
         * PlayReleaseId.
         */
        public Builder playReleaseId(Integer playReleaseId) {
            this.putBodyParameter("PlayReleaseId", playReleaseId);
            this.playReleaseId = playReleaseId;
            return this;
        }

        /**
         * PlaybookUuid.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public RevertPlaybookReleaseRequest build() {
            return new RevertPlaybookReleaseRequest(this);
        } 

    } 

}
