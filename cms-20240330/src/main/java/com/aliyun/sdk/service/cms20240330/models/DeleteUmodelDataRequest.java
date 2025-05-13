// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteUmodelDataRequest} extends {@link RequestModel}
 *
 * <p>DeleteUmodelDataRequest</p>
 */
public class DeleteUmodelDataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private DeleteUmodelDataRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.kind = builder.kind;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUmodelDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteUmodelDataRequest, Builder> {
        private String workspace; 
        private String regionId; 
        private String domain; 
        private String kind; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUmodelDataRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.kind = request.kind;
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * kind.
         */
        public Builder kind(String kind) {
            this.putQueryParameter("kind", kind);
            this.kind = kind;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteUmodelDataRequest build() {
            return new DeleteUmodelDataRequest(this);
        } 

    } 

}
