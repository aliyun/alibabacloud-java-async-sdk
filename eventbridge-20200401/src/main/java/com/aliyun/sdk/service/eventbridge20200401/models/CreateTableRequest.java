// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link CreateTableRequest} extends {@link RequestModel}
 *
 * <p>CreateTableRequest</p>
 */
public class CreateTableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String catalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List<Columns> columns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetentionPolicy")
    private RetentionPolicy retentionPolicy;

    private CreateTableRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.clientToken = builder.clientToken;
        this.columns = builder.columns;
        this.comment = builder.comment;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.retentionPolicy = builder.retentionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return columns
     */
    public java.util.List<Columns> getColumns() {
        return this.columns;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return retentionPolicy
     */
    public RetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    public static final class Builder extends Request.Builder<CreateTableRequest, Builder> {
        private String catalog; 
        private String clientToken; 
        private java.util.List<Columns> columns; 
        private String comment; 
        private String name; 
        private String namespace; 
        private RetentionPolicy retentionPolicy; 

        private Builder() {
            super();
        } 

        private Builder(CreateTableRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.clientToken = request.clientToken;
            this.columns = request.columns;
            this.comment = request.comment;
            this.name = request.name;
            this.namespace = request.namespace;
            this.retentionPolicy = request.retentionPolicy;
        } 

        /**
         * <p>The data catalog to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.putQueryParameter("Catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>The idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>1e9b8f60-3a2c-4d7e-9f1b-8c3d5e7a2b4f</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The column definitions.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;,&quot;Comment&quot;:&quot;主键&quot;}]</p>
         */
        public Builder columns(java.util.List<Columns> columns) {
            String columnsShrink = shrink(columns, "Columns", "json");
            this.putQueryParameter("Columns", columnsShrink);
            this.columns = columns;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>测试事件表</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_table</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The namespace to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The data retention policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;HotTTL&quot;:7,&quot;ColdTTL&quot;:30}</p>
         */
        public Builder retentionPolicy(RetentionPolicy retentionPolicy) {
            String retentionPolicyShrink = shrink(retentionPolicy, "RetentionPolicy", "json");
            this.putQueryParameter("RetentionPolicy", retentionPolicyShrink);
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        @Override
        public CreateTableRequest build() {
            return new CreateTableRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTableRequest} extends {@link TeaModel}
     *
     * <p>CreateTableRequest</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Columns(Builder builder) {
            this.comment = builder.comment;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String comment; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.comment = model.comment;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The description of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>Isp</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The name of the connector.</p>
             * 
             * <strong>example:</strong>
             * <p>kafka-default-agent-alikafka_pre-cn-28t3sfzno003</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>ehpc_cluster</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTableRequest} extends {@link TeaModel}
     *
     * <p>CreateTableRequest</p>
     */
    public static class RetentionPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColdTTL")
        private Integer coldTTL;

        @com.aliyun.core.annotation.NameInMap("HotTTL")
        private Integer hotTTL;

        private RetentionPolicy(Builder builder) {
            this.coldTTL = builder.coldTTL;
            this.hotTTL = builder.hotTTL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetentionPolicy create() {
            return builder().build();
        }

        /**
         * @return coldTTL
         */
        public Integer getColdTTL() {
            return this.coldTTL;
        }

        /**
         * @return hotTTL
         */
        public Integer getHotTTL() {
            return this.hotTTL;
        }

        public static final class Builder {
            private Integer coldTTL; 
            private Integer hotTTL; 

            private Builder() {
            } 

            private Builder(RetentionPolicy model) {
                this.coldTTL = model.coldTTL;
                this.hotTTL = model.hotTTL;
            } 

            /**
             * <p>The cold storage retention time.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder coldTTL(Integer coldTTL) {
                this.coldTTL = coldTTL;
                return this;
            }

            /**
             * <p>The hot storage retention time.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder hotTTL(Integer hotTTL) {
                this.hotTTL = hotTTL;
                return this;
            }

            public RetentionPolicy build() {
                return new RetentionPolicy(this);
            } 

        } 

    }
}
