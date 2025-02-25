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
 * {@link UpdateApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApplicationResponseBody</p>
 */
public class UpdateApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Application")
    private Application application;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateApplicationResponseBody(Builder builder) {
        this.application = builder.application;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return application
     */
    public Application getApplication() {
        return this.application;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Application application; 
        private String requestId; 

        /**
         * <p>The information about the application.</p>
         */
        public Builder application(Application application) {
            this.application = application;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F1F00F41-D24C-5377-831B-C97F739CE1AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateApplicationResponseBody build() {
            return new UpdateApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApplicationResponseBody</p>
     */
    public static class Application extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, ?> tags;

        @com.aliyun.core.annotation.NameInMap("UpdatedDate")
        private String updatedDate;

        private Application(Builder builder) {
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.updatedDate = builder.updatedDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return createdDate
         */
        public String getCreatedDate() {
            return this.createdDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        /**
         * @return updatedDate
         */
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public static final class Builder {
            private String createdDate; 
            private String description; 
            private String name; 
            private String resourceGroupId; 
            private java.util.Map<String, ?> tags; 
            private String updatedDate; 

            /**
             * <p>The time when the application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-07T09:17:46Z</p>
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * <p>The description of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test application</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>My-Application</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxsn4m*****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the application was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-07T10:17:46Z</p>
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
}
