// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishPlaybookRequest} extends {@link RequestModel}
 *
 * <p>PublishPlaybookRequest</p>
 */
public class PublishPlaybookRequest extends Request {
    @Body
    @NameInMap("Description")
    @Validation(maxLength = 128)
    private String description;

    @Body
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    private PublishPlaybookRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishPlaybookRequest create() {
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
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public static final class Builder extends Request.Builder<PublishPlaybookRequest, Builder> {
        private String description; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(PublishPlaybookRequest request) {
            super(request);
            this.description = request.description;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * The description of the released version.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The playbook UUID.
         * <p>
         * 
         * >  You can call the [DescribePlaybooks](~~DescribePlaybooks~~) operation to query the playbook UUID.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public PublishPlaybookRequest build() {
            return new PublishPlaybookRequest(this);
        } 

    } 

}
