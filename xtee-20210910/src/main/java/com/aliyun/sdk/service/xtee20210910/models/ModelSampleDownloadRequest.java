// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link ModelSampleDownloadRequest} extends {@link RequestModel}
 *
 * <p>ModelSampleDownloadRequest</p>
 */
public class ModelSampleDownloadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    private ModelSampleDownloadRequest(Builder builder) {
        super(builder);
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelSampleDownloadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<ModelSampleDownloadRequest, Builder> {
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(ModelSampleDownloadRequest request) {
            super(request);
            this.regId = request.regId;
        } 

        /**
         * <p>Region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public ModelSampleDownloadRequest build() {
            return new ModelSampleDownloadRequest(this);
        } 

    } 

}
