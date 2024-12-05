// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecuteSqlInstanceRequest} extends {@link RequestModel}
 *
 * <p>ExecuteSqlInstanceRequest</p>
 */
public class ExecuteSqlInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sqlInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sqlInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("combineParam")
    private java.util.Map < String, ? > combineParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dynamicParam")
    private java.util.Map < String, ? > dynamicParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kvpair")
    private java.util.Map < String, ? > kvpair;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("params")
    private java.util.Map < String, ? > params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("staticParam")
    private java.util.Map < String, ? > staticParam;

    private ExecuteSqlInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.database = builder.database;
        this.sqlInstanceId = builder.sqlInstanceId;
        this.combineParam = builder.combineParam;
        this.content = builder.content;
        this.domain = builder.domain;
        this.dynamicParam = builder.dynamicParam;
        this.kvpair = builder.kvpair;
        this.params = builder.params;
        this.staticParam = builder.staticParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteSqlInstanceRequest create() {
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
     * @return sqlInstanceId
     */
    public Long getSqlInstanceId() {
        return this.sqlInstanceId;
    }

    /**
     * @return combineParam
     */
    public java.util.Map < String, ? > getCombineParam() {
        return this.combineParam;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return dynamicParam
     */
    public java.util.Map < String, ? > getDynamicParam() {
        return this.dynamicParam;
    }

    /**
     * @return kvpair
     */
    public java.util.Map < String, ? > getKvpair() {
        return this.kvpair;
    }

    /**
     * @return params
     */
    public java.util.Map < String, ? > getParams() {
        return this.params;
    }

    /**
     * @return staticParam
     */
    public java.util.Map < String, ? > getStaticParam() {
        return this.staticParam;
    }

    public static final class Builder extends Request.Builder<ExecuteSqlInstanceRequest, Builder> {
        private String instanceId; 
        private String database; 
        private Long sqlInstanceId; 
        private java.util.Map < String, ? > combineParam; 
        private String content; 
        private String domain; 
        private java.util.Map < String, ? > dynamicParam; 
        private java.util.Map < String, ? > kvpair; 
        private java.util.Map < String, ? > params; 
        private java.util.Map < String, ? > staticParam; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteSqlInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.database = request.database;
            this.sqlInstanceId = request.sqlInstanceId;
            this.combineParam = request.combineParam;
            this.content = request.content;
            this.domain = request.domain;
            this.dynamicParam = request.dynamicParam;
            this.kvpair = request.kvpair;
            this.params = request.params;
            this.staticParam = request.staticParam;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        public Builder database(String database) {
            this.putPathParameter("database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sqlInstanceId(Long sqlInstanceId) {
            this.putPathParameter("sqlInstanceId", sqlInstanceId);
            this.sqlInstanceId = sqlInstanceId;
            return this;
        }

        /**
         * combineParam.
         */
        public Builder combineParam(java.util.Map < String, ? > combineParam) {
            this.putBodyParameter("combineParam", combineParam);
            this.combineParam = combineParam;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from test</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * domain.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * dynamicParam.
         */
        public Builder dynamicParam(java.util.Map < String, ? > dynamicParam) {
            this.putBodyParameter("dynamicParam", dynamicParam);
            this.dynamicParam = dynamicParam;
            return this;
        }

        /**
         * kvpair.
         */
        public Builder kvpair(java.util.Map < String, ? > kvpair) {
            this.putBodyParameter("kvpair", kvpair);
            this.kvpair = kvpair;
            return this;
        }

        /**
         * params.
         */
        public Builder params(java.util.Map < String, ? > params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        /**
         * staticParam.
         */
        public Builder staticParam(java.util.Map < String, ? > staticParam) {
            this.putBodyParameter("staticParam", staticParam);
            this.staticParam = staticParam;
            return this;
        }

        @Override
        public ExecuteSqlInstanceRequest build() {
            return new ExecuteSqlInstanceRequest(this);
        } 

    } 

}
