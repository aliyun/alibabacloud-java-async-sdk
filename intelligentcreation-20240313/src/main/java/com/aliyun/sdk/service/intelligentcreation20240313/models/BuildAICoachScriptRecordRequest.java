// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link BuildAICoachScriptRecordRequest} extends {@link RequestModel}
 *
 * <p>BuildAICoachScriptRecordRequest</p>
 */
public class BuildAICoachScriptRecordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptJsonUrl")
    private String scriptJsonUrl;

    private BuildAICoachScriptRecordRequest(Builder builder) {
        super(builder);
        this.scriptJsonUrl = builder.scriptJsonUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuildAICoachScriptRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scriptJsonUrl
     */
    public String getScriptJsonUrl() {
        return this.scriptJsonUrl;
    }

    public static final class Builder extends Request.Builder<BuildAICoachScriptRecordRequest, Builder> {
        private String scriptJsonUrl; 

        private Builder() {
            super();
        } 

        private Builder(BuildAICoachScriptRecordRequest request) {
            super(request);
            this.scriptJsonUrl = request.scriptJsonUrl;
        } 

        /**
         * scriptJsonUrl.
         */
        public Builder scriptJsonUrl(String scriptJsonUrl) {
            this.putBodyParameter("scriptJsonUrl", scriptJsonUrl);
            this.scriptJsonUrl = scriptJsonUrl;
            return this;
        }

        @Override
        public BuildAICoachScriptRecordRequest build() {
            return new BuildAICoachScriptRecordRequest(this);
        } 

    } 

}
