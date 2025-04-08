// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ExportDoNotCallNumbersRequest} extends {@link RequestModel}
 *
 * <p>ExportDoNotCallNumbersRequest</p>
 */
public class ExportDoNotCallNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchPattern")
    private String searchPattern;

    private ExportDoNotCallNumbersRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scope = builder.scope;
        this.searchPattern = builder.searchPattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportDoNotCallNumbersRequest create() {
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return searchPattern
     */
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public static final class Builder extends Request.Builder<ExportDoNotCallNumbersRequest, Builder> {
        private String instanceId; 
        private String scope; 
        private String searchPattern; 

        private Builder() {
            super();
        } 

        private Builder(ExportDoNotCallNumbersRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scope = request.scope;
            this.searchPattern = request.searchPattern;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * SearchPattern.
         */
        public Builder searchPattern(String searchPattern) {
            this.putQueryParameter("SearchPattern", searchPattern);
            this.searchPattern = searchPattern;
            return this;
        }

        @Override
        public ExportDoNotCallNumbersRequest build() {
            return new ExportDoNotCallNumbersRequest(this);
        } 

    } 

}
