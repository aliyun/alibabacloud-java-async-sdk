// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RevertPlaybookReleaseRequest} extends {@link RequestModel}
 *
 * <p>RevertPlaybookReleaseRequest</p>
 */
public class RevertPlaybookReleaseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsPublish")
    private Boolean isPublish;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlayReleaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer playReleaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to directly publish the new playbook after the rollback.</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isPublish(Boolean isPublish) {
            this.putBodyParameter("IsPublish", isPublish);
            this.isPublish = isPublish;
            return this;
        }

        /**
         * <p>The version of the playbook that you want to publish.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybookReleases~~">DescribePlaybookReleases</a> operation to query the playbook version.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3f97b56e-064e-47e7-a309-xxxxxxx</p>
         */
        public Builder playReleaseId(Integer playReleaseId) {
            this.putBodyParameter("PlayReleaseId", playReleaseId);
            this.playReleaseId = playReleaseId;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the playbook UUID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>185295a1-c987-4b64-8796-xxxxxxxx</p>
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
