// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitDocumentImportJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitDocumentImportJobRequest</p>
 */
public class SubmitDocumentImportJobRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("Docs")
    @Validation(required = true)
    private java.util.List < Docs> docs;

    private SubmitDocumentImportJobRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.docs = builder.docs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDocumentImportJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return docs
     */
    public java.util.List < Docs> getDocs() {
        return this.docs;
    }

    public static final class Builder extends Request.Builder<SubmitDocumentImportJobRequest, Builder> {
        private String agentKey; 
        private java.util.List < Docs> docs; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDocumentImportJobRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.docs = request.docs;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Docs.
         */
        public Builder docs(java.util.List < Docs> docs) {
            this.putQueryParameter("Docs", docs);
            this.docs = docs;
            return this;
        }

        @Override
        public SubmitDocumentImportJobRequest build() {
            return new SubmitDocumentImportJobRequest(this);
        } 

    } 

    public static class Docs extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("StoreId")
        @Validation(required = true)
        private String storeId;

        @NameInMap("TagIds")
        private java.util.List < String > tagIds;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        @NameInMap("URL")
        @Validation(required = true)
        private String URL;

        private Docs(Builder builder) {
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.storeId = builder.storeId;
            this.tagIds = builder.tagIds;
            this.type = builder.type;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Docs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return storeId
         */
        public String getStoreId() {
            return this.storeId;
        }

        /**
         * @return tagIds
         */
        public java.util.List < String > getTagIds() {
            return this.tagIds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String name; 
            private String ownerId; 
            private String storeId; 
            private java.util.List < String > tagIds; 
            private String type; 
            private String URL; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * StoreId.
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            /**
             * TagIds.
             */
            public Builder tagIds(java.util.List < String > tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * URL.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public Docs build() {
                return new Docs(this);
            } 

        } 

    }
}
