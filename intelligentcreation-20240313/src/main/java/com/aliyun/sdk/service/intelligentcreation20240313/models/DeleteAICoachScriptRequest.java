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
 * {@link DeleteAICoachScriptRequest} extends {@link RequestModel}
 *
 * <p>DeleteAICoachScriptRequest</p>
 */
public class DeleteAICoachScriptRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptId")
    private String scriptId;

    private DeleteAICoachScriptRequest(Builder builder) {
        super(builder);
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAICoachScriptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<DeleteAICoachScriptRequest, Builder> {
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAICoachScriptRequest request) {
            super(request);
            this.scriptId = request.scriptId;
        } 

        /**
         * scriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putBodyParameter("scriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        @Override
        public DeleteAICoachScriptRequest build() {
            return new DeleteAICoachScriptRequest(this);
        } 

    } 

}
