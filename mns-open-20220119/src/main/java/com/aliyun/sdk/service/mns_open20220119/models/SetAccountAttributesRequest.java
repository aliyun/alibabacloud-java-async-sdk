// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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
 * {@link SetAccountAttributesRequest} extends {@link RequestModel}
 *
 * <p>SetAccountAttributesRequest</p>
 */
public class SetAccountAttributesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogEnabled")
    private Boolean logEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    private String logStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageTraceEnabled")
    private Boolean messageTraceEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    private SetAccountAttributesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.logEnabled = builder.logEnabled;
        this.logStoreName = builder.logStoreName;
        this.messageTraceEnabled = builder.messageTraceEnabled;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAccountAttributesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return logEnabled
     */
    public Boolean getLogEnabled() {
        return this.logEnabled;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return messageTraceEnabled
     */
    public Boolean getMessageTraceEnabled() {
        return this.messageTraceEnabled;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<SetAccountAttributesRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private Boolean logEnabled; 
        private String logStoreName; 
        private Boolean messageTraceEnabled; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(SetAccountAttributesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.logEnabled = request.logEnabled;
            this.logStoreName = request.logStoreName;
            this.messageTraceEnabled = request.messageTraceEnabled;
            this.projectName = request.projectName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * LogEnabled.
         */
        public Builder logEnabled(Boolean logEnabled) {
            this.putQueryParameter("LogEnabled", logEnabled);
            this.logEnabled = logEnabled;
            return this;
        }

        /**
         * LogStoreName.
         */
        public Builder logStoreName(String logStoreName) {
            this.putQueryParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * MessageTraceEnabled.
         */
        public Builder messageTraceEnabled(Boolean messageTraceEnabled) {
            this.putQueryParameter("MessageTraceEnabled", messageTraceEnabled);
            this.messageTraceEnabled = messageTraceEnabled;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public SetAccountAttributesRequest build() {
            return new SetAccountAttributesRequest(this);
        } 

    } 

}
