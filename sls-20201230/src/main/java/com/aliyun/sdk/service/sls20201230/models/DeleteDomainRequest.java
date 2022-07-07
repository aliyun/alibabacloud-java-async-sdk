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
    @Path
    @NameInMap("domainName")
    @Validation(required = true)
    private String domainName;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private DeleteDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.project = builder.project;
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<DeleteDomainRequest, Builder> {
        private String domainName; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.project = request.project;
        } 

        /**
         * 要删除的域名
         */
        public Builder domainName(String domainName) {
            this.putPathParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * A short description of struct
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public DeleteDomainRequest build() {
            return new DeleteDomainRequest(this);
        } 

    } 

}
