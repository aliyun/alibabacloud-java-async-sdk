// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link ValidateModelFileRequest} extends {@link RequestModel}
 *
 * <p>ValidateModelFileRequest</p>
 */
public class ValidateModelFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    private ValidateModelFileRequest(Builder builder) {
        super(builder);
        this.filePath = builder.filePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateModelFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    public static final class Builder extends Request.Builder<ValidateModelFileRequest, Builder> {
        private String filePath; 

        private Builder() {
            super();
        } 

        private Builder(ValidateModelFileRequest request) {
            super(request);
            this.filePath = request.filePath;
        } 

        /**
         * <p>File path.</p>
         * 
         * <strong>example:</strong>
         * <p>saf/xxxxxxx/xxx.pmml</p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        @Override
        public ValidateModelFileRequest build() {
            return new ValidateModelFileRequest(this);
        } 

    } 

}
