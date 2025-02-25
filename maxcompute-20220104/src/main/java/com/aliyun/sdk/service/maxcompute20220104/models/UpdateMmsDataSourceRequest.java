// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link UpdateMmsDataSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateMmsDataSourceRequest</p>
 */
public class UpdateMmsDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, ?> config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("test")
    private Boolean test;

    private UpdateMmsDataSourceRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.action = builder.action;
        this.config = builder.config;
        this.name = builder.name;
        this.test = builder.test;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMmsDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return config
     */
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return test
     */
    public Boolean getTest() {
        return this.test;
    }

    public static final class Builder extends Request.Builder<UpdateMmsDataSourceRequest, Builder> {
        private Long sourceId; 
        private String action; 
        private java.util.Map<String, ?> config; 
        private String name; 
        private Boolean test; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMmsDataSourceRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.action = request.action;
            this.config = request.config;
            this.name = request.name;
            this.test = request.test;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * action.
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * config.
         */
        public Builder config(java.util.Map<String, ?> config) {
            this.putBodyParameter("config", config);
            this.config = config;
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
         * test.
         */
        public Builder test(Boolean test) {
            this.putBodyParameter("test", test);
            this.test = test;
            return this;
        }

        @Override
        public UpdateMmsDataSourceRequest build() {
            return new UpdateMmsDataSourceRequest(this);
        } 

    } 

}
