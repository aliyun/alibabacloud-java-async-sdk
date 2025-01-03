// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link GetWorkitemFileRequest} extends {@link RequestModel}
 *
 * <p>GetWorkitemFileRequest</p>
 */
public class GetWorkitemFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workitemIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workitemIdentifier;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("fileIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileIdentifier;

    private GetWorkitemFileRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.workitemIdentifier = builder.workitemIdentifier;
        this.fileIdentifier = builder.fileIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkitemFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return workitemIdentifier
     */
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

    /**
     * @return fileIdentifier
     */
    public String getFileIdentifier() {
        return this.fileIdentifier;
    }

    public static final class Builder extends Request.Builder<GetWorkitemFileRequest, Builder> {
        private String organizationId; 
        private String workitemIdentifier; 
        private String fileIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkitemFileRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.workitemIdentifier = request.workitemIdentifier;
            this.fileIdentifier = request.fileIdentifier;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60811b5eed6e867404f6xxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11234455454355</p>
         */
        public Builder workitemIdentifier(String workitemIdentifier) {
            this.putPathParameter("workitemIdentifier", workitemIdentifier);
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dfsdfdsgdsfdsfff</p>
         */
        public Builder fileIdentifier(String fileIdentifier) {
            this.putPathParameter("fileIdentifier", fileIdentifier);
            this.fileIdentifier = fileIdentifier;
            return this;
        }

        @Override
        public GetWorkitemFileRequest build() {
            return new GetWorkitemFileRequest(this);
        } 

    } 

}
