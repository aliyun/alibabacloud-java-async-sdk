// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link DeleteDomainRequest} extends {@link RequestModel}
 *
 * <p>DeleteDomainRequest</p>
 */
public class DeleteDomainRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("domainName")
    @Validation(required = true)
    private String domainName;

    private DeleteDomainRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder<DeleteDomainRequest, Builder> {
        private String project; 
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDomainRequest request) {
            super(request);
            this.project = request.project;
            this.domainName = request.domainName;
        } 

        /**
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The domain name to be deleted.
         */
        public Builder domainName(String domainName) {
            this.putPathParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public DeleteDomainRequest build() {
            return new DeleteDomainRequest(this);
        } 

    } 

}
