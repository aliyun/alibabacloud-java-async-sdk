// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateLivePackageChannelCredentialsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLivePackageChannelCredentialsResponseBody</p>
 */
public class UpdateLivePackageChannelCredentialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IngestEndpoints")
    private java.util.List<IngestEndpoints> ingestEndpoints;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateLivePackageChannelCredentialsResponseBody(Builder builder) {
        this.ingestEndpoints = builder.ingestEndpoints;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLivePackageChannelCredentialsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ingestEndpoints
     */
    public java.util.List<IngestEndpoints> getIngestEndpoints() {
        return this.ingestEndpoints;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<IngestEndpoints> ingestEndpoints; 
        private String requestId; 

        /**
         * IngestEndpoints.
         */
        public Builder ingestEndpoints(java.util.List<IngestEndpoints> ingestEndpoints) {
            this.ingestEndpoints = ingestEndpoints;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateLivePackageChannelCredentialsResponseBody build() {
            return new UpdateLivePackageChannelCredentialsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLivePackageChannelCredentialsResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateLivePackageChannelCredentialsResponseBody</p>
     */
    public static class IngestEndpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private IngestEndpoints(Builder builder) {
            this.id = builder.id;
            this.password = builder.password;
            this.url = builder.url;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngestEndpoints create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String id; 
            private String password; 
            private String url; 
            private String username; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public IngestEndpoints build() {
                return new IngestEndpoints(this);
            } 

        } 

    }
}
