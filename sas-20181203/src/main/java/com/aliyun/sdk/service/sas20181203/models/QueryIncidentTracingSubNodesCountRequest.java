// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryIncidentTracingSubNodesCountRequest} extends {@link RequestModel}
 *
 * <p>QueryIncidentTracingSubNodesCountRequest</p>
 */
public class QueryIncidentTracingSubNodesCountRequest extends Request {
    @com.aliyun.core.annotation.NameInMap("VertexIdAndTypeList")
    private java.util.List < java.util.List < String > > vertexIdAndTypeList;

    private QueryIncidentTracingSubNodesCountRequest(Builder builder) {
        super(builder);
        this.vertexIdAndTypeList = builder.vertexIdAndTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIncidentTracingSubNodesCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vertexIdAndTypeList
     */
    public java.util.List < java.util.List < String > > getVertexIdAndTypeList() {
        return this.vertexIdAndTypeList;
    }

    public static final class Builder extends Request.Builder<QueryIncidentTracingSubNodesCountRequest, Builder> {
        private java.util.List < java.util.List < String > > vertexIdAndTypeList; 

        private Builder() {
            super();
        } 

        private Builder(QueryIncidentTracingSubNodesCountRequest request) {
            super(request);
            this.vertexIdAndTypeList = request.vertexIdAndTypeList;
        } 

        /**
         * VertexIdAndTypeList.
         */
        public Builder vertexIdAndTypeList(java.util.List < java.util.List < String > > vertexIdAndTypeList) {
            this.vertexIdAndTypeList = vertexIdAndTypeList;
            return this;
        }

        @Override
        public QueryIncidentTracingSubNodesCountRequest build() {
            return new QueryIncidentTracingSubNodesCountRequest(this);
        } 

    } 

}
