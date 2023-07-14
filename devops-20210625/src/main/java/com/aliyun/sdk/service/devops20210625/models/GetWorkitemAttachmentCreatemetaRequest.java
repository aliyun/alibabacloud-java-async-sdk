// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkitemAttachmentCreatemetaRequest} extends {@link RequestModel}
 *
 * <p>GetWorkitemAttachmentCreatemetaRequest</p>
 */
public class GetWorkitemAttachmentCreatemetaRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("workitemIdentifier")
    @Validation(required = true)
    private String workitemIdentifier;

    @Query
    @NameInMap("fileName")
    @Validation(required = true)
    private String fileName;

    private GetWorkitemAttachmentCreatemetaRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.workitemIdentifier = builder.workitemIdentifier;
        this.fileName = builder.fileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkitemAttachmentCreatemetaRequest create() {
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
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    public static final class Builder extends Request.Builder<GetWorkitemAttachmentCreatemetaRequest, Builder> {
        private String organizationId; 
        private String workitemIdentifier; 
        private String fileName; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkitemAttachmentCreatemetaRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.workitemIdentifier = request.workitemIdentifier;
            this.fileName = request.fileName;
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
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        @Override
        public GetWorkitemAttachmentCreatemetaRequest build() {
            return new GetWorkitemAttachmentCreatemetaRequest(this);
        } 

    } 

}
