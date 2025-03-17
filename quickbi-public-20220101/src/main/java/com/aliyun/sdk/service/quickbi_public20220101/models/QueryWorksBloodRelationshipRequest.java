// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryWorksBloodRelationshipRequest} extends {@link RequestModel}
 *
 * <p>QueryWorksBloodRelationshipRequest</p>
 */
public class QueryWorksBloodRelationshipRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorksId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String worksId;

    private QueryWorksBloodRelationshipRequest(Builder builder) {
        super(builder);
        this.worksId = builder.worksId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWorksBloodRelationshipRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return worksId
     */
    public String getWorksId() {
        return this.worksId;
    }

    public static final class Builder extends Request.Builder<QueryWorksBloodRelationshipRequest, Builder> {
        private String worksId; 

        private Builder() {
            super();
        } 

        private Builder(QueryWorksBloodRelationshipRequest request) {
            super(request);
            this.worksId = request.worksId;
        } 

        /**
         * <p>Obtains the kinship of a data work, including the datasets referenced by each component and query field information. Currently, only supported data works include dashboards, workbooks, and self-service data retrieval.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd****</p>
         */
        public Builder worksId(String worksId) {
            this.putQueryParameter("WorksId", worksId);
            this.worksId = worksId;
            return this;
        }

        @Override
        public QueryWorksBloodRelationshipRequest build() {
            return new QueryWorksBloodRelationshipRequest(this);
        } 

    } 

}
