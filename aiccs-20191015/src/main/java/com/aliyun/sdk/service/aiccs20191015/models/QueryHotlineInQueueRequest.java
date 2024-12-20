// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryHotlineInQueueRequest} extends {@link RequestModel}
 *
 * <p>QueryHotlineInQueueRequest</p>
 */
public class QueryHotlineInQueueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterGroupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerGroupType;

    private QueryHotlineInQueueRequest(Builder builder) {
        super(builder);
        this.outerGroupId = builder.outerGroupId;
        this.outerGroupType = builder.outerGroupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHotlineInQueueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outerGroupId
     */
    public String getOuterGroupId() {
        return this.outerGroupId;
    }

    /**
     * @return outerGroupType
     */
    public String getOuterGroupType() {
        return this.outerGroupType;
    }

    public static final class Builder extends Request.Builder<QueryHotlineInQueueRequest, Builder> {
        private String outerGroupId; 
        private String outerGroupType; 

        private Builder() {
            super();
        } 

        private Builder(QueryHotlineInQueueRequest request) {
            super(request);
            this.outerGroupId = request.outerGroupId;
            this.outerGroupType = request.outerGroupType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder outerGroupId(String outerGroupId) {
            this.putQueryParameter("OuterGroupId", outerGroupId);
            this.outerGroupId = outerGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mybank</p>
         */
        public Builder outerGroupType(String outerGroupType) {
            this.putQueryParameter("OuterGroupType", outerGroupType);
            this.outerGroupType = outerGroupType;
            return this;
        }

        @Override
        public QueryHotlineInQueueRequest build() {
            return new QueryHotlineInQueueRequest(this);
        } 

    } 

}
