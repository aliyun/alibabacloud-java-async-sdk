// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppTags")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AppTags> appTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportSendEnabled")
    private Boolean reportSendEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribePeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscribePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscribeStatus;

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.appTags = builder.appTags;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.owner = builder.owner;
        this.regionId = builder.regionId;
        this.reportSendEnabled = builder.reportSendEnabled;
        this.subscribePeriod = builder.subscribePeriod;
        this.subscribeStatus = builder.subscribeStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appTags
     */
    public java.util.List<AppTags> getAppTags() {
        return this.appTags;
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
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reportSendEnabled
     */
    public Boolean getReportSendEnabled() {
        return this.reportSendEnabled;
    }

    /**
     * @return subscribePeriod
     */
    public String getSubscribePeriod() {
        return this.subscribePeriod;
    }

    /**
     * @return subscribeStatus
     */
    public String getSubscribeStatus() {
        return this.subscribeStatus;
    }

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String appName; 
        private java.util.List<AppTags> appTags; 
        private String clientToken; 
        private String description; 
        private String owner; 
        private String regionId; 
        private Boolean reportSendEnabled; 
        private String subscribePeriod; 
        private String subscribeStatus; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest request) {
            super(request);
            this.appName = request.appName;
            this.appTags = request.appTags;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.owner = request.owner;
            this.regionId = request.regionId;
            this.reportSendEnabled = request.reportSendEnabled;
            this.subscribePeriod = request.subscribePeriod;
            this.subscribeStatus = request.subscribeStatus;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>App1</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder appTags(java.util.List<AppTags> appTags) {
            this.putQueryParameter("AppTags", appTags);
            this.appTags = appTags;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
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
         * ReportSendEnabled.
         */
        public Builder reportSendEnabled(Boolean reportSendEnabled) {
            this.putQueryParameter("ReportSendEnabled", reportSendEnabled);
            this.reportSendEnabled = reportSendEnabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly</p>
         */
        public Builder subscribePeriod(String subscribePeriod) {
            this.putQueryParameter("SubscribePeriod", subscribePeriod);
            this.subscribePeriod = subscribePeriod;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Subscribe</p>
         */
        public Builder subscribeStatus(String subscribeStatus) {
            this.putQueryParameter("SubscribeStatus", subscribeStatus);
            this.subscribeStatus = subscribeStatus;
            return this;
        }

        @Override
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAppRequest} extends {@link TeaModel}
     *
     * <p>CreateAppRequest</p>
     */
    public static class AppTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private AppTags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppTags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(AppTags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public AppTags build() {
                return new AppTags(this);
            } 

        } 

    }
}
