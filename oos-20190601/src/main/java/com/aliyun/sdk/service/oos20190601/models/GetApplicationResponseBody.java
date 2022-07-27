// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationResponseBody</p>
 */
public class GetApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    private Application application;

    @NameInMap("RequestId")
    private String requestId;

    private GetApplicationResponseBody(Builder builder) {
        this.application = builder.application;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationResponseBody create() {
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
         * Application.
         */
        public Builder application(Application application) {
            this.application = application;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationResponseBody build() {
            return new GetApplicationResponseBody(this);
        } 

    } 

    public static class Application extends TeaModel {
        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @NameInMap("UpdateDate")
        private String updateDate;

        private Application(Builder builder) {
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
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
        public java.util.Map < String, ? > getTags() {
            return this.tags;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String createDate; 
            private String description; 
            private String name; 
            private String resourceGroupId; 
            private java.util.Map < String, ? > tags; 
            private String updateDate; 

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UpdateDate.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
}
