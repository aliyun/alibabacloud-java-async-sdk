// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link CreateDirectoryRequest} extends {@link RequestModel}
 *
 * <p>CreateDirectoryRequest</p>
 */
public class CreateDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryName")
    private String directoryName;

    private CreateDirectoryRequest(Builder builder) {
        super(builder);
        this.directoryName = builder.directoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDirectoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryName
     */
    public String getDirectoryName() {
        return this.directoryName;
    }

    public static final class Builder extends Request.Builder<CreateDirectoryRequest, Builder> {
        private String directoryName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDirectoryRequest request) {
            super(request);
            this.directoryName = request.directoryName;
        } 

        /**
         * <p>The name of the directory. The name must be globally unique.</p>
         * <p>Format: The name can contain lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen (-) and cannot contain two consecutive hyphens (-). It cannot start with <code>d-</code>.</p>
         * <p>Length: 2 to 64 characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically generates a name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder directoryName(String directoryName) {
            this.putQueryParameter("DirectoryName", directoryName);
            this.directoryName = directoryName;
            return this;
        }

        @Override
        public CreateDirectoryRequest build() {
            return new CreateDirectoryRequest(this);
        } 

    } 

}
