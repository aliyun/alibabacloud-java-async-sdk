// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserIdRequest} extends {@link RequestModel}
 *
 * <p>GetUserIdRequest</p>
 */
public class GetUserIdRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("ExternalId")
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
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * ExternalId.
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

    public static class ExternalId extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Issuer")
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

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Issuer.
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
