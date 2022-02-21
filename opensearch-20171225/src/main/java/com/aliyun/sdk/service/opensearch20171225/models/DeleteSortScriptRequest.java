// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSortScriptRequest} extends {@link RequestModel}
 *
 * <p>DeleteSortScriptRequest</p>
 */
public class DeleteSortScriptRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("scriptName")
    @Validation(required = true)
    private String scriptName;

    @Path
    @NameInMap("appVersionId")
    @Validation(required = true)
    private String appVersionId;

    private DeleteSortScriptRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.scriptName = builder.scriptName;
        this.appVersionId = builder.appVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSortScriptRequest create() {
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
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public static final class Builder extends Request.Builder<DeleteSortScriptRequest, Builder> {
        private String appGroupIdentity; 
        private String scriptName; 
        private String appVersionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSortScriptRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.scriptName = response.scriptName;
            this.appVersionId = response.appVersionId;
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
         * scriptName.
         */
        public Builder scriptName(String scriptName) {
            this.putPathParameter("scriptName", scriptName);
            this.scriptName = scriptName;
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

        @Override
        public DeleteSortScriptRequest build() {
            return new DeleteSortScriptRequest(this);
        } 

    } 

}
