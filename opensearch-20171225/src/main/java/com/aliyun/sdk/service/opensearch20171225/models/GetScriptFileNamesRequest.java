// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScriptFileNamesRequest} extends {@link RequestModel}
 *
 * <p>GetScriptFileNamesRequest</p>
 */
public class GetScriptFileNamesRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("appVersionId")
    @Validation(required = true)
    private String appVersionId;

    @Path
    @NameInMap("scriptName")
    @Validation(required = true)
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

        private Builder(GetScriptFileNamesRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.appVersionId = response.appVersionId;
            this.scriptName = response.scriptName;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * appVersionId.
         */
        public Builder appVersionId(String appVersionId) {
            this.putPathParameter("appVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * scriptName.
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
