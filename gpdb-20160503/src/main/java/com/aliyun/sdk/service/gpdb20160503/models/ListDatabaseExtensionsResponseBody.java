// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListDatabaseExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabaseExtensionsResponseBody</p>
 */
public class ListDatabaseExtensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Extensions")
    private java.util.List<Extensions> extensions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDatabaseExtensionsResponseBody(Builder builder) {
        this.extensions = builder.extensions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabaseExtensionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extensions
     */
    public java.util.List<Extensions> getExtensions() {
        return this.extensions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Extensions> extensions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDatabaseExtensionsResponseBody model) {
            this.extensions = model.extensions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Extension list.</p>
         */
        public Builder extensions(java.util.List<Extensions> extensions) {
            this.extensions = extensions;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDatabaseExtensionsResponseBody build() {
            return new ListDatabaseExtensionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDatabaseExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabaseExtensionsResponseBody</p>
     */
    public static class Extensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExtensionName")
        private String extensionName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Extensions(Builder builder) {
            this.description = builder.description;
            this.extensionName = builder.extensionName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extensions create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extensionName
         */
        public String getExtensionName() {
            return this.extensionName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String extensionName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Extensions model) {
                this.description = model.description;
                this.extensionName = model.extensionName;
                this.status = model.status;
            } 

            /**
             * <p>The description of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>zhparser</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The extension name.</p>
             * 
             * <strong>example:</strong>
             * <p>zhparser</p>
             */
            public Builder extensionName(String extensionName) {
                this.extensionName = extensionName;
                return this;
            }

            /**
             * <p>The status of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>installed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Extensions build() {
                return new Extensions(this);
            } 

        } 

    }
}
