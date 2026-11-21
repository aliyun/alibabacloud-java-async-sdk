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
 * {@link UpsertUmodelDataRequest} extends {@link RequestModel}
 *
 * <p>UpsertUmodelDataRequest</p>
 */
public class UpsertUmodelDataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("elements")
    private java.util.List<?> elements;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    private UpsertUmodelDataRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.regionId = builder.regionId;
        this.elements = builder.elements;
        this.dryRun = builder.dryRun;
        this.method = builder.method;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertUmodelDataRequest create() {
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
     * @return elements
     */
    public java.util.List<?> getElements() {
        return this.elements;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    public static final class Builder extends Request.Builder<UpsertUmodelDataRequest, Builder> {
        private String workspace; 
        private String regionId; 
        private java.util.List<?> elements; 
        private Boolean dryRun; 
        private String method; 

        private Builder() {
            super();
        } 

        private Builder(UpsertUmodelDataRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.regionId = request.regionId;
            this.elements = request.elements;
            this.dryRun = request.dryRun;
            this.method = request.method;
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
         * <p>The content of the elements.</p>
         */
        public Builder elements(java.util.List<?> elements) {
            this.putBodyParameter("elements", elements);
            this.elements = elements;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run for this request. Valid values:</p>
         * <ul>
         * <li>true: sends a check request without performing actual changes.</li>
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
         * <p>The method.</p>
         * 
         * <strong>example:</strong>
         * <p>Upsert</p>
         */
        public Builder method(String method) {
            this.putQueryParameter("method", method);
            this.method = method;
            return this;
        }

        @Override
        public UpsertUmodelDataRequest build() {
            return new UpsertUmodelDataRequest(this);
        } 

    } 

}
