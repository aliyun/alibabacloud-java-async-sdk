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
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

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
        this.dryRun = builder.dryRun;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
        private Boolean dryRun; 
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
            this.dryRun = request.dryRun;
            this.kind = request.kind;
            this.name = request.name;
        } 

        /**
         * <p>The name of the workspace.</p>
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
         * <p>The name of the specific Umodel data. If you do not specify this parameter, all Umodel data is included.</p>
         * 
         * <strong>example:</strong>
         * <p>apm</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run of the request. Valid values:</p>
         * <ul>
         * <li>true: sends a check request and does not perform actual changes.</li>
         * <li>false: sends a normal request.
         * Default value: false.</li>
         * </ul>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The kind of the specific Umodel data. If you do not specify this parameter, all kinds are included.</p>
         * 
         * <strong>example:</strong>
         * <p>metric_set</p>
         */
        public Builder kind(String kind) {
            this.putQueryParameter("kind", kind);
            this.kind = kind;
            return this;
        }

        /**
         * <p>The name of the specific Umodel data. If you do not specify this parameter, all Umodel data is included.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
