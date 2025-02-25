// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppRequest</p>
 */
public class UpdateAppRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Icon")
    private String icon;

    @Query
    @NameInMap("Source")
    private String source;

    private UpdateAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.description = builder.description;
        this.icon = builder.icon;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<UpdateAppRequest, Builder> {
        private String appId; 
        private String appName; 
        private String description; 
        private String icon; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.appName = request.appName;
            this.description = request.description;
            this.icon = request.icon;
            this.source = request.source;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
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
         * Icon.
         */
        public Builder icon(String icon) {
            this.putQueryParameter("Icon", icon);
            this.icon = icon;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public UpdateAppRequest build() {
            return new UpdateAppRequest(this);
        } 

    } 

}
