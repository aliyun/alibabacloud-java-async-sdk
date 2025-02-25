// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScriptFileNamesRequest} extends {@link RequestModel}
 *
 * <p>GetScriptFileNamesRequest</p>
 */
public class GetScriptFileNamesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("scriptName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptName;

    private GetScriptFileNamesRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appVersionId = builder.appVersionId;
        this.scriptName = builder.scriptName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScriptFileNamesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    public static final class Builder extends Request.Builder<GetScriptFileNamesRequest, Builder> {
        private String appGroupIdentity; 
        private String appVersionId; 
        private String scriptName; 

        private Builder() {
            super();
        } 

        private Builder(GetScriptFileNamesRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appVersionId = request.appVersionId;
            this.scriptName = request.scriptName;
        } 

        /**
         * my_app
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * 123456
         */
        public Builder appVersionId(String appVersionId) {
            this.putPathParameter("appVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * file_names
         */
        public Builder scriptName(String scriptName) {
            this.putPathParameter("scriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        @Override
        public GetScriptFileNamesRequest build() {
            return new GetScriptFileNamesRequest(this);
        } 

    } 

}
