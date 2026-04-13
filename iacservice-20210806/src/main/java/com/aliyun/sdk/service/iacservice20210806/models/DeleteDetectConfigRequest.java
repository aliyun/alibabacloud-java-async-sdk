// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link DeleteDetectConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteDetectConfigRequest</p>
 */
public class DeleteDetectConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("detectConfigId")
    private String detectConfigId;

    private DeleteDetectConfigRequest(Builder builder) {
        super(builder);
        this.detectConfigId = builder.detectConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDetectConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectConfigId
     */
    public String getDetectConfigId() {
        return this.detectConfigId;
    }

    public static final class Builder extends Request.Builder<DeleteDetectConfigRequest, Builder> {
        private String detectConfigId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDetectConfigRequest request) {
            super(request);
            this.detectConfigId = request.detectConfigId;
        } 

        /**
         * detectConfigId.
         */
        public Builder detectConfigId(String detectConfigId) {
            this.putPathParameter("detectConfigId", detectConfigId);
            this.detectConfigId = detectConfigId;
            return this;
        }

        @Override
        public DeleteDetectConfigRequest build() {
            return new DeleteDetectConfigRequest(this);
        } 

    } 

}
