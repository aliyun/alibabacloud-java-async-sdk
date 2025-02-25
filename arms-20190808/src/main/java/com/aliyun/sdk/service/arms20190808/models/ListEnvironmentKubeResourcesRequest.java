// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListEnvironmentKubeResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListEnvironmentKubeResourcesRequest</p>
 */
public class ListEnvironmentKubeResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Kind")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelSelectors")
    private java.util.Map<String, String> labelSelectors;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListEnvironmentKubeResourcesRequest(Builder builder) {
        super(builder);
        this.environmentId = builder.environmentId;
        this.kind = builder.kind;
        this.labelSelectors = builder.labelSelectors;
        this.namespace = builder.namespace;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentKubeResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return labelSelectors
     */
    public java.util.Map<String, String> getLabelSelectors() {
        return this.labelSelectors;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListEnvironmentKubeResourcesRequest, Builder> {
        private String environmentId; 
        private String kind; 
        private java.util.Map<String, String> labelSelectors; 
        private String namespace; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvironmentKubeResourcesRequest request) {
            super(request);
            this.environmentId = request.environmentId;
            this.kind = request.kind;
            this.labelSelectors = request.labelSelectors;
            this.namespace = request.namespace;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The environment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>The resource type. Valid values: Pod, Deployment, and Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Pod</p>
         */
        public Builder kind(String kind) {
            this.putQueryParameter("Kind", kind);
            this.kind = kind;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder labelSelectors(java.util.Map<String, String> labelSelectors) {
            String labelSelectorsShrink = shrink(labelSelectors, "LabelSelectors", "json");
            this.putQueryParameter("LabelSelectors", labelSelectorsShrink);
            this.labelSelectors = labelSelectors;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListEnvironmentKubeResourcesRequest build() {
            return new ListEnvironmentKubeResourcesRequest(this);
        } 

    } 

}
