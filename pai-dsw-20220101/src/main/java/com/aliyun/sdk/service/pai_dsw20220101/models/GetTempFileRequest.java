// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetTempFileRequest} extends {@link RequestModel}
 *
 * <p>GetTempFileRequest</p>
 */
public class GetTempFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TempFileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tempFileId;

    private GetTempFileRequest(Builder builder) {
        super(builder);
        this.tempFileId = builder.tempFileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTempFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tempFileId
     */
    public String getTempFileId() {
        return this.tempFileId;
    }

    public static final class Builder extends Request.Builder<GetTempFileRequest, Builder> {
        private String tempFileId; 

        private Builder() {
            super();
        } 

        private Builder(GetTempFileRequest request) {
            super(request);
            this.tempFileId = request.tempFileId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tempfile-05cexxxxxxxxx</p>
         */
        public Builder tempFileId(String tempFileId) {
            this.putPathParameter("TempFileId", tempFileId);
            this.tempFileId = tempFileId;
            return this;
        }

        @Override
        public GetTempFileRequest build() {
            return new GetTempFileRequest(this);
        } 

    } 

}
