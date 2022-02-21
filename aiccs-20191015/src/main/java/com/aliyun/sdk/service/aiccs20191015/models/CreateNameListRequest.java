// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNameListRequest} extends {@link RequestModel}
 *
 * <p>CreateNameListRequest</p>
 */
public class CreateNameListRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Namelist")
    private Namelist namelist;

    @Body
    @NameInMap("Routing")
    private Long routing;

    private CreateNameListRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.namelist = builder.namelist;
        this.routing = builder.routing;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNameListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return namelist
     */
    public Namelist getNamelist() {
        return this.namelist;
    }

    /**
     * @return routing
     */
    public Long getRouting() {
        return this.routing;
    }

    public static final class Builder extends Request.Builder<CreateNameListRequest, Builder> {
        private String clientToken; 
        private Namelist namelist; 
        private Long routing; 

        private Builder() {
            super();
        } 

        private Builder(CreateNameListRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.namelist = response.namelist;
            this.routing = response.routing;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Namelist.
         */
        public Builder namelist(Namelist namelist) {
            this.putBodyParameter("Namelist", namelist);
            this.namelist = namelist;
            return this;
        }

        /**
         * Routing.
         */
        public Builder routing(Long routing) {
            this.putBodyParameter("Routing", routing);
            this.routing = routing;
            return this;
        }

        @Override
        public CreateNameListRequest build() {
            return new CreateNameListRequest(this);
        } 

    } 

    public static class Config extends TeaModel {
        @NameInMap("AttachmentSchemaId")
        private Long attachmentSchemaId;

        private Config(Builder builder) {
            this.attachmentSchemaId = builder.attachmentSchemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return attachmentSchemaId
         */
        public Long getAttachmentSchemaId() {
            return this.attachmentSchemaId;
        }

        public static final class Builder {
            private Long attachmentSchemaId; 

            /**
             * AttachmentSchemaId.
             */
            public Builder attachmentSchemaId(Long attachmentSchemaId) {
                this.attachmentSchemaId = attachmentSchemaId;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class Namelist extends TeaModel {
        @NameInMap("Config")
        private Config config;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("TenantId")
        private Long tenantId;

        private Namelist(Builder builder) {
            this.config = builder.config;
            this.description = builder.description;
            this.name = builder.name;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namelist create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
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
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private Config config; 
            private String description; 
            private String name; 
            private Long tenantId; 

            /**
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
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
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Namelist build() {
                return new Namelist(this);
            } 

        } 

    }
}
