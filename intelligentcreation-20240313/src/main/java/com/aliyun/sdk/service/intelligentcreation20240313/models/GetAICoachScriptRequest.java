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
 * {@link GetAICoachScriptRequest} extends {@link RequestModel}
 *
 * <p>GetAICoachScriptRequest</p>
 */
public class GetAICoachScriptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scriptRecordId")
    private String scriptRecordId;

    private GetAICoachScriptRequest(Builder builder) {
        super(builder);
        this.scriptRecordId = builder.scriptRecordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachScriptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scriptRecordId
     */
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

    public static final class Builder extends Request.Builder<GetAICoachScriptRequest, Builder> {
        private String scriptRecordId; 

        private Builder() {
            super();
        } 

        private Builder(GetAICoachScriptRequest request) {
            super(request);
            this.scriptRecordId = request.scriptRecordId;
        } 

        /**
         * scriptRecordId.
         */
        public Builder scriptRecordId(String scriptRecordId) {
            this.putQueryParameter("scriptRecordId", scriptRecordId);
            this.scriptRecordId = scriptRecordId;
            return this;
        }

        @Override
        public GetAICoachScriptRequest build() {
            return new GetAICoachScriptRequest(this);
        } 

    } 

}
