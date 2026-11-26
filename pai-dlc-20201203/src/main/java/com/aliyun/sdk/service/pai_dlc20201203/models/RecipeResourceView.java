// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RecipeResourceView} extends {@link TeaModel}
 *
 * <p>RecipeResourceView</p>
 */
public class RecipeResourceView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private Long resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("Specs")
    private java.util.List<RecipeSpec> specs;

    private RecipeResourceView(Builder builder) {
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.specs = builder.specs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecipeResourceView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceId
     */
    public Long getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return specs
     */
    public java.util.List<RecipeSpec> getSpecs() {
        return this.specs;
    }

    public static final class Builder {
        private Long resourceId; 
        private String resourceType; 
        private java.util.List<RecipeSpec> specs; 

        private Builder() {
        } 

        private Builder(RecipeResourceView model) {
            this.resourceId = model.resourceId;
            this.resourceType = model.resourceType;
            this.specs = model.specs;
        } 

        /**
         * <p>资源池行 ID</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder resourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>资源池类型，取值：train / eval</p>
         * 
         * <strong>example:</strong>
         * <p>train</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>资源规格列表，采用 CustomJob 资源形状（与入参 open_struct_RecipeSpec 同构），回显存储值</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;PodCount&quot;:1,&quot;CPU&quot;:&quot;4&quot;,&quot;Memory&quot;:&quot;8Gi&quot;,&quot;GPU&quot;:&quot;1&quot;,&quot;GPUType&quot;:&quot;A100&quot;,&quot;QuotaId&quot;:&quot;quotag2uo09dyp40&quot;}]</p>
         */
        public Builder specs(java.util.List<RecipeSpec> specs) {
            this.specs = specs;
            return this;
        }

        public RecipeResourceView build() {
            return new RecipeResourceView(this);
        } 

    } 

}
