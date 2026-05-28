// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link OmniSearchQuery} extends {@link TeaModel}
 *
 * <p>OmniSearchQuery</p>
 */
public class OmniSearchQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 200, minLength = 1)
    private String query;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("useCot")
    private Boolean useCot;

    @com.aliyun.core.annotation.NameInMap("useModel")
    private String useModel;

    private OmniSearchQuery(Builder builder) {
        this.query = builder.query;
        this.sessionId = builder.sessionId;
        this.useCot = builder.useCot;
        this.useModel = builder.useModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OmniSearchQuery create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return useCot
     */
    public Boolean getUseCot() {
        return this.useCot;
    }

    /**
     * @return useModel
     */
    public String getUseModel() {
        return this.useModel;
    }

    public static final class Builder {
        private String query; 
        private String sessionId; 
        private Boolean useCot; 
        private String useModel; 

        private Builder() {
        } 

        private Builder(OmniSearchQuery model) {
            this.query = model.query;
            this.sessionId = model.sessionId;
            this.useCot = model.useCot;
            this.useModel = model.useModel;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>今天杭州天气</p>
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * useCot.
         */
        public Builder useCot(Boolean useCot) {
            this.useCot = useCot;
            return this;
        }

        /**
         * useModel.
         */
        public Builder useModel(String useModel) {
            this.useModel = useModel;
            return this;
        }

        public OmniSearchQuery build() {
            return new OmniSearchQuery(this);
        } 

    } 

}
