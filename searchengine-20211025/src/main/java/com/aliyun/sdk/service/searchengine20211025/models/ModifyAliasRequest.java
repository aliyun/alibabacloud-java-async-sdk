// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ModifyAliasRequest} extends {@link RequestModel}
 *
 * <p>ModifyAliasRequest</p>
 */
public class ModifyAliasRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alias")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alias;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("index")
    private String index;

    private ModifyAliasRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.alias = builder.alias;
        this.index = builder.index;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAliasRequest create() {
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
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return index
     */
    public String getIndex() {
        return this.index;
    }

    public static final class Builder extends Request.Builder<ModifyAliasRequest, Builder> {
        private String instanceId; 
        private String alias; 
        private String index; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAliasRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.alias = request.alias;
            this.index = request.index;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2re****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>alias name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder alias(String alias) {
            this.putPathParameter("alias", alias);
            this.putBodyParameter("alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * <p>index name</p>
         * 
         * <strong>example:</strong>
         * <p>index</p>
         */
        public Builder index(String index) {
            this.putBodyParameter("index", index);
            this.index = index;
            return this;
        }

        @Override
        public ModifyAliasRequest build() {
            return new ModifyAliasRequest(this);
        } 

    } 

}
