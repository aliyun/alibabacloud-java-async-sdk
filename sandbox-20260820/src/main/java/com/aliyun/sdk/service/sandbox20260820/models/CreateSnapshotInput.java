// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link CreateSnapshotInput} extends {@link TeaModel}
 *
 * <p>CreateSnapshotInput</p>
 */
public class CreateSnapshotInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("resourceTags")
    private java.util.List<ResourceTags> resourceTags;

    @com.aliyun.core.annotation.NameInMap("sandboxID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sandboxID;

    @com.aliyun.core.annotation.NameInMap("teamID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String teamID;

    private CreateSnapshotInput(Builder builder) {
        this.name = builder.name;
        this.resourceTags = builder.resourceTags;
        this.sandboxID = builder.sandboxID;
        this.teamID = builder.teamID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceTags
     */
    public java.util.List<ResourceTags> getResourceTags() {
        return this.resourceTags;
    }

    /**
     * @return sandboxID
     */
    public String getSandboxID() {
        return this.sandboxID;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    public static final class Builder {
        private String name; 
        private java.util.List<ResourceTags> resourceTags; 
        private String sandboxID; 
        private String teamID; 

        private Builder() {
        } 

        private Builder(CreateSnapshotInput model) {
            this.name = model.name;
            this.resourceTags = model.resourceTags;
            this.sandboxID = model.sandboxID;
            this.teamID = model.teamID;
        } 

        /**
         * <p>The snapshot name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The resource tags.</p>
         */
        public Builder resourceTags(java.util.List<ResourceTags> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }

        /**
         * <p>The source sandbox ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sbx-****</p>
         */
        public Builder sandboxID(String sandboxID) {
            this.sandboxID = sandboxID;
            return this;
        }

        /**
         * <p>The team ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>70d1****abcd</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        public CreateSnapshotInput build() {
            return new CreateSnapshotInput(this);
        } 

    } 

    /**
     * 
     * {@link CreateSnapshotInput} extends {@link TeaModel}
     *
     * <p>CreateSnapshotInput</p>
     */
    public static class ResourceTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ResourceTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ResourceTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>project</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResourceTags build() {
                return new ResourceTags(this);
            } 

        } 

    }
}
