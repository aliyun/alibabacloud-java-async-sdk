// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyMessageRequest} extends {@link RequestModel}
 *
 * <p>VerifyMessageRequest</p>
 */
public class VerifyMessageRequest extends Request {
    @Body
    @NameInMap("FileData")
    @Validation(required = true)
    private String fileData;

    private VerifyMessageRequest(Builder builder) {
        super(builder);
        this.fileData = builder.fileData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileData
     */
    public String getFileData() {
        return this.fileData;
    }

    public static final class Builder extends Request.Builder<VerifyMessageRequest, Builder> {
        private String fileData; 

        private Builder() {
            super();
        } 

        private Builder(VerifyMessageRequest request) {
            super(request);
            this.fileData = request.fileData;
        } 

        /**
         * FileData.
         */
        public Builder fileData(String fileData) {
            this.putBodyParameter("FileData", fileData);
            this.fileData = fileData;
            return this;
        }

        @Override
        public VerifyMessageRequest build() {
            return new VerifyMessageRequest(this);
        } 

    } 

}
