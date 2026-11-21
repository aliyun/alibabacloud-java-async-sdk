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
 * {@link UpsertUmodelCommonSchemaRefRequest} extends {@link RequestModel}
 *
 * <p>UpsertUmodelCommonSchemaRefRequest</p>
 */
public class UpsertUmodelCommonSchemaRefRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("group")
    @com.aliyun.core.annotation.Validation(required = true)
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    private UpsertUmodelCommonSchemaRefRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.dryRun = builder.dryRun;
        this.group = builder.group;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertUmodelCommonSchemaRefRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<UpsertUmodelCommonSchemaRefRequest, Builder> {
        private String workspace; 
        private Boolean dryRun; 
        private String group; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(UpsertUmodelCommonSchemaRefRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.dryRun = request.dryRun;
            this.group = request.group;
            this.version = request.version;
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
         * <p>Specifies whether to perform a dry run for this request. Valid values:</p>
         * <ul>
         * <li>true: Sends a check request without performing actual changes.</li>
         * <li>false: Sends a normal request.
         * Default value: false.</li>
         * </ul>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The public Umodel schema group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>card-service-daily01</p>
         */
        public Builder group(String group) {
            this.putQueryParameter("group", group);
            this.group = group;
            return this;
        }

        /**
         * <p>The version number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0</p>
         */
        public Builder version(String version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public UpsertUmodelCommonSchemaRefRequest build() {
            return new UpsertUmodelCommonSchemaRefRequest(this);
        } 

    } 

}
