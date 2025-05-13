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
 * {@link GetUmodelResponseBody} extends {@link TeaModel}
 *
 * <p>GetUmodelResponseBody</p>
 */
public class GetUmodelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("commonSchemaRef")
    private java.util.List<CommonSchemaRef> commonSchemaRef;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private GetUmodelResponseBody(Builder builder) {
        this.commonSchemaRef = builder.commonSchemaRef;
        this.description = builder.description;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUmodelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private java.util.List<CommonSchemaRef> commonSchemaRef; 
        private String description; 
        private String regionId; 
        private String requestId; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(GetUmodelResponseBody model) {
            this.commonSchemaRef = model.commonSchemaRef;
            this.description = model.description;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.workspace = model.workspace;
        } 

        /**
         * commonSchemaRef.
         */
        public Builder commonSchemaRef(java.util.List<CommonSchemaRef> commonSchemaRef) {
            this.commonSchemaRef = commonSchemaRef;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetUmodelResponseBody build() {
            return new GetUmodelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUmodelResponseBody} extends {@link TeaModel}
     *
     * <p>GetUmodelResponseBody</p>
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
