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
 * {@link ValidateTestFileRequest} extends {@link RequestModel}
 *
 * <p>ValidateTestFileRequest</p>
 */
public class ValidateTestFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerModuleId")
    private String customerModuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    private ValidateTestFileRequest(Builder builder) {
        super(builder);
        this.customerModuleId = builder.customerModuleId;
        this.filePath = builder.filePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateTestFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerModuleId
     */
    public String getCustomerModuleId() {
        return this.customerModuleId;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    public static final class Builder extends Request.Builder<ValidateTestFileRequest, Builder> {
        private String customerModuleId; 
        private String filePath; 

        private Builder() {
            super();
        } 

        private Builder(ValidateTestFileRequest request) {
            super(request);
            this.customerModuleId = request.customerModuleId;
            this.filePath = request.filePath;
        } 

        /**
         * <p>Model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>456</p>
         */
        public Builder customerModuleId(String customerModuleId) {
            this.putQueryParameter("CustomerModuleId", customerModuleId);
            this.customerModuleId = customerModuleId;
            return this;
        }

        /**
         * <p>File path.</p>
         * 
         * <strong>example:</strong>
         * <p>saf/xxxxxx/xxxxx.pmml</p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        @Override
        public ValidateTestFileRequest build() {
            return new ValidateTestFileRequest(this);
        } 

    } 

}
