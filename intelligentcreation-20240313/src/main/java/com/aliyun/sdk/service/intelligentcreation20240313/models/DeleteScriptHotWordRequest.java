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
 * {@link DeleteScriptHotWordRequest} extends {@link RequestModel}
 *
 * <p>DeleteScriptHotWordRequest</p>
 */
public class DeleteScriptHotWordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("hotWordId")
    private String hotWordId;

    private DeleteScriptHotWordRequest(Builder builder) {
        super(builder);
        this.hotWordId = builder.hotWordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScriptHotWordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotWordId
     */
    public String getHotWordId() {
        return this.hotWordId;
    }

    public static final class Builder extends Request.Builder<DeleteScriptHotWordRequest, Builder> {
        private String hotWordId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScriptHotWordRequest request) {
            super(request);
            this.hotWordId = request.hotWordId;
        } 

        /**
         * hotWordId.
         */
        public Builder hotWordId(String hotWordId) {
            this.putQueryParameter("hotWordId", hotWordId);
            this.hotWordId = hotWordId;
            return this;
        }

        @Override
        public DeleteScriptHotWordRequest build() {
            return new DeleteScriptHotWordRequest(this);
        } 

    } 

}
