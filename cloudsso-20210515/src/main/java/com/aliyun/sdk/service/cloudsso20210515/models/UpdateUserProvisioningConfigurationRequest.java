// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserProvisioningConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserProvisioningConfigurationRequest</p>
 */
public class UpdateUserProvisioningConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDefaultLandingPage")
    private String newDefaultLandingPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewSessionDuration")
    private Integer newSessionDuration;

    private UpdateUserProvisioningConfigurationRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.newDefaultLandingPage = builder.newDefaultLandingPage;
        this.newSessionDuration = builder.newSessionDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserProvisioningConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return newDefaultLandingPage
     */
    public String getNewDefaultLandingPage() {
        return this.newDefaultLandingPage;
    }

    /**
     * @return newSessionDuration
     */
    public Integer getNewSessionDuration() {
        return this.newSessionDuration;
    }

    public static final class Builder extends Request.Builder<UpdateUserProvisioningConfigurationRequest, Builder> {
        private String directoryId; 
        private String newDefaultLandingPage; 
        private Integer newSessionDuration; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserProvisioningConfigurationRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.newDefaultLandingPage = request.newDefaultLandingPage;
            this.newSessionDuration = request.newSessionDuration;
        } 

        /**
         * The ID of the resource directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The new default URL for a CloudSSO user who logs on to the Alibaba Cloud Management Console.
         * <p>
         * 
         * Default value: https://homenew.console.aliyun.com.
         */
        public Builder newDefaultLandingPage(String newDefaultLandingPage) {
            this.putQueryParameter("NewDefaultLandingPage", newDefaultLandingPage);
            this.newDefaultLandingPage = newDefaultLandingPage;
            return this;
        }

        /**
         * The new duration of the logon session.
         * <p>
         * 
         * Unit: hours.
         * 
         * Valid values: 1 to 24.
         * 
         * Default value: 6.
         */
        public Builder newSessionDuration(Integer newSessionDuration) {
            this.putQueryParameter("NewSessionDuration", newSessionDuration);
            this.newSessionDuration = newSessionDuration;
            return this;
        }

        @Override
        public UpdateUserProvisioningConfigurationRequest build() {
            return new UpdateUserProvisioningConfigurationRequest(this);
        } 

    } 

}
