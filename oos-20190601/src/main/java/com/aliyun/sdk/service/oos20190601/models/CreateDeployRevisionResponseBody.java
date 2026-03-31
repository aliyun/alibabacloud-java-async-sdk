// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link CreateDeployRevisionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeployRevisionResponseBody</p>
 */
public class CreateDeployRevisionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Revision")
    private Revision revision;

    private CreateDeployRevisionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.revision = builder.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeployRevisionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return revision
     */
    public Revision getRevision() {
        return this.revision;
    }

    public static final class Builder {
        private String requestId; 
        private Revision revision; 

        private Builder() {
        } 

        private Builder(CreateDeployRevisionResponseBody model) {
            this.requestId = model.requestId;
            this.revision = model.revision;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Revision.
         */
        public Builder revision(Revision revision) {
            this.revision = revision;
            return this;
        }

        public CreateDeployRevisionResponseBody build() {
            return new CreateDeployRevisionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDeployRevisionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDeployRevisionResponseBody</p>
     */
    public static class Revision extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("DeployResourceType")
        private String deployResourceType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Hooks")
        private String hooks;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("RevisionId")
        private String revisionId;

        @com.aliyun.core.annotation.NameInMap("RevisionType")
        private String revisionType;

        private Revision(Builder builder) {
            this.applicationName = builder.applicationName;
            this.deployResourceType = builder.deployResourceType;
            this.description = builder.description;
            this.hooks = builder.hooks;
            this.location = builder.location;
            this.revisionId = builder.revisionId;
            this.revisionType = builder.revisionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Revision create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return deployResourceType
         */
        public String getDeployResourceType() {
            return this.deployResourceType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hooks
         */
        public String getHooks() {
            return this.hooks;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return revisionId
         */
        public String getRevisionId() {
            return this.revisionId;
        }

        /**
         * @return revisionType
         */
        public String getRevisionType() {
            return this.revisionType;
        }

        public static final class Builder {
            private String applicationName; 
            private String deployResourceType; 
            private String description; 
            private String hooks; 
            private String location; 
            private String revisionId; 
            private String revisionType; 

            private Builder() {
            } 

            private Builder(Revision model) {
                this.applicationName = model.applicationName;
                this.deployResourceType = model.deployResourceType;
                this.description = model.description;
                this.hooks = model.hooks;
                this.location = model.location;
                this.revisionId = model.revisionId;
                this.revisionType = model.revisionType;
            } 

            /**
             * ApplicationName.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * DeployResourceType.
             */
            public Builder deployResourceType(String deployResourceType) {
                this.deployResourceType = deployResourceType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Hooks.
             */
            public Builder hooks(String hooks) {
                this.hooks = hooks;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * RevisionId.
             */
            public Builder revisionId(String revisionId) {
                this.revisionId = revisionId;
                return this;
            }

            /**
             * RevisionType.
             */
            public Builder revisionType(String revisionType) {
                this.revisionType = revisionType;
                return this;
            }

            public Revision build() {
                return new Revision(this);
            } 

        } 

    }
}
