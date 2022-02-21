// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAIPlanTemplatesRequest} extends {@link RequestModel}
 *
 * <p>QueryAIPlanTemplatesRequest</p>
 */
public class QueryAIPlanTemplatesRequest extends Request {
    @Query
    @NameInMap("AppTemplateId")
    @Validation(required = true)
    private String appTemplateId;

    @Query
    @NameInMap("AppVersion")
    @Validation(required = true)
    private String appVersion;

    private QueryAIPlanTemplatesRequest(Builder builder) {
        super(builder);
        this.appTemplateId = builder.appTemplateId;
        this.appVersion = builder.appVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAIPlanTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appTemplateId
     */
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    public static final class Builder extends Request.Builder<QueryAIPlanTemplatesRequest, Builder> {
        private String appTemplateId; 
        private String appVersion; 

        private Builder() {
            super();
        } 

        private Builder(QueryAIPlanTemplatesRequest response) {
            super(response);
            this.appTemplateId = response.appTemplateId;
            this.appVersion = response.appVersion;
        } 

        /**
         * AppTemplateId.
         */
        public Builder appTemplateId(String appTemplateId) {
            this.putQueryParameter("AppTemplateId", appTemplateId);
            this.appTemplateId = appTemplateId;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        @Override
        public QueryAIPlanTemplatesRequest build() {
            return new QueryAIPlanTemplatesRequest(this);
        } 

    } 

}
