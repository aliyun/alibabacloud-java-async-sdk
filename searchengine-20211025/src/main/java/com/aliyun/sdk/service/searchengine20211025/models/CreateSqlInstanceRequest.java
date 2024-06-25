// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSqlInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateSqlInstanceRequest</p>
 */
public class CreateSqlInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parent")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long parent;

    private CreateSqlInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.database = builder.database;
        this.name = builder.name;
        this.parent = builder.parent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSqlInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parent
     */
    public Long getParent() {
        return this.parent;
    }

    public static final class Builder extends Request.Builder<CreateSqlInstanceRequest, Builder> {
        private String instanceId; 
        private String database; 
        private String name; 
        private Long parent; 

        private Builder() {
            super();
        } 

        private Builder(CreateSqlInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.database = request.database;
            this.name = request.name;
            this.parent = request.parent;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * database.
         */
        public Builder database(String database) {
            this.putPathParameter("database", database);
            this.database = database;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * parent.
         */
        public Builder parent(Long parent) {
            this.putBodyParameter("parent", parent);
            this.parent = parent;
            return this;
        }

        @Override
        public CreateSqlInstanceRequest build() {
            return new CreateSqlInstanceRequest(this);
        } 

    } 

}
