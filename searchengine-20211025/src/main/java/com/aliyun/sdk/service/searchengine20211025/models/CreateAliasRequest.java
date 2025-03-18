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
 * {@link CreateAliasRequest} extends {@link RequestModel}
 *
 * <p>CreateAliasRequest</p>
 */
public class CreateAliasRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("index")
    private String index;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("newMode")
    private Boolean newMode;

    private CreateAliasRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.alias = builder.alias;
        this.index = builder.index;
        this.newMode = builder.newMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAliasRequest create() {
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

    /**
     * @return newMode
     */
    public Boolean getNewMode() {
        return this.newMode;
    }

    public static final class Builder extends Request.Builder<CreateAliasRequest, Builder> {
        private String instanceId; 
        private String alias; 
        private String index; 
        private Boolean newMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateAliasRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.alias = request.alias;
            this.index = request.index;
            this.newMode = request.newMode;
        } 

        /**
         * <p>The instance ID.</p>
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
         * <p>alias name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder alias(String alias) {
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

        /**
         * <p>Specifies whether the OpenSearch Vector Search Edition instance is of the new version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder newMode(Boolean newMode) {
            this.putQueryParameter("newMode", newMode);
            this.newMode = newMode;
            return this;
        }

        @Override
        public CreateAliasRequest build() {
            return new CreateAliasRequest(this);
        } 

    } 

}
