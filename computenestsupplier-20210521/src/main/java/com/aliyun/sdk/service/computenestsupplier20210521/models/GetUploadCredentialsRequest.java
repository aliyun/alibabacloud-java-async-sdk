// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link GetUploadCredentialsRequest} extends {@link RequestModel}
 *
 * <p>GetUploadCredentialsRequest</p>
 */
public class GetUploadCredentialsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    private GetUploadCredentialsRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadCredentialsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder extends Request.Builder<GetUploadCredentialsRequest, Builder> {
        private String fileName; 
        private String visibility; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadCredentialsRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.visibility = request.visibility;
        } 

        /**
         * <p>The file name to upload.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>template.yaml</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>Specifies whether the file is publicly accessible. Valid values: <strong>public</strong> or <strong>private</strong>. The default value is <strong>private</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder visibility(String visibility) {
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        @Override
        public GetUploadCredentialsRequest build() {
            return new GetUploadCredentialsRequest(this);
        } 

    } 

}
