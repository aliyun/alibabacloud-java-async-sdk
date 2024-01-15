// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkitemFileRequest} extends {@link RequestModel}
 *
 * <p>GetWorkitemFileRequest</p>
 */
public class GetWorkitemFileRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("workitemIdentifier")
    @Validation(required = true)
    private String workitemIdentifier;

    @Path
    @NameInMap("fileIdentifier")
    @Validation(required = true)
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
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * workitemIdentifier.
         */
        public Builder workitemIdentifier(String workitemIdentifier) {
            this.putPathParameter("workitemIdentifier", workitemIdentifier);
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }

        /**
         * fileIdentifier.
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
