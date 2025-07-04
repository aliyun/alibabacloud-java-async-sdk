// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link GetUserIdRequest} extends {@link RequestModel}
 *
 * <p>GetUserIdRequest</p>
 */
public class GetUserIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalId")
    private ExternalId externalId;

    private GetUserIdRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.externalId = builder.externalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return externalId
     */
    public ExternalId getExternalId() {
        return this.externalId;
    }

    public static final class Builder extends Request.Builder<GetUserIdRequest, Builder> {
        private String directoryId; 
        private ExternalId externalId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserIdRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.externalId = request.externalId;
        } 

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The identifier information about the user that is synchronized from an external identity provider (IdP).</p>
         */
        public Builder externalId(ExternalId externalId) {
            String externalIdShrink = shrink(externalId, "ExternalId", "json");
            this.putQueryParameter("ExternalId", externalIdShrink);
            this.externalId = externalId;
            return this;
        }

        @Override
        public GetUserIdRequest build() {
            return new GetUserIdRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetUserIdRequest} extends {@link TeaModel}
     *
     * <p>GetUserIdRequest</p>
     */
    public static class ExternalId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        private ExternalId(Builder builder) {
            this.id = builder.id;
            this.issuer = builder.issuer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalId create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        public static final class Builder {
            private String id; 
            private String issuer; 

            private Builder() {
            } 

            private Builder(ExternalId model) {
                this.id = model.id;
                this.issuer = model.issuer;
            } 

            /**
             * <p>The identifier of the user that is synchronized from an external IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>c73******a5fdd5</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The method for external identity synchronization. Only System for Cross-domain Identity Management (SCIM) synchronization is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>SCIM</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            public ExternalId build() {
                return new ExternalId(this);
            } 

        } 

    }
}
