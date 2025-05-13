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
 * {@link UpdateUmodelRequest} extends {@link RequestModel}
 *
 * <p>UpdateUmodelRequest</p>
 */
public class UpdateUmodelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("commonSchemaRef")
    private java.util.List<CommonSchemaRef> commonSchemaRef;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    private UpdateUmodelRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.commonSchemaRef = builder.commonSchemaRef;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUmodelRequest create() {
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
     * @return commonSchemaRef
     */
    public java.util.List<CommonSchemaRef> getCommonSchemaRef() {
        return this.commonSchemaRef;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<UpdateUmodelRequest, Builder> {
        private String workspace; 
        private java.util.List<CommonSchemaRef> commonSchemaRef; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUmodelRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.commonSchemaRef = request.commonSchemaRef;
            this.description = request.description;
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
         * commonSchemaRef.
         */
        public Builder commonSchemaRef(java.util.List<CommonSchemaRef> commonSchemaRef) {
            this.putBodyParameter("commonSchemaRef", commonSchemaRef);
            this.commonSchemaRef = commonSchemaRef;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateUmodelRequest build() {
            return new UpdateUmodelRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateUmodelRequest} extends {@link TeaModel}
     *
     * <p>UpdateUmodelRequest</p>
     */
    public static class CommonSchemaRef extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<String> items;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private CommonSchemaRef(Builder builder) {
            this.group = builder.group;
            this.items = builder.items;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonSchemaRef create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return items
         */
        public java.util.List<String> getItems() {
            return this.items;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String group; 
            private java.util.List<String> items; 
            private String version; 

            private Builder() {
            } 

            private Builder(CommonSchemaRef model) {
                this.group = model.group;
                this.items = model.items;
                this.version = model.version;
            } 

            /**
             * group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List<String> items) {
                this.items = items;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public CommonSchemaRef build() {
                return new CommonSchemaRef(this);
            } 

        } 

    }
}
