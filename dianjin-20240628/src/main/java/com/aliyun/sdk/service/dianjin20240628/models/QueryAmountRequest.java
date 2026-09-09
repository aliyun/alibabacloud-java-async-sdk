// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link QueryAmountRequest} extends {@link RequestModel}
 *
 * <p>QueryAmountRequest</p>
 */
public class QueryAmountRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aliyunUidList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> aliyunUidList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    private QueryAmountRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.aliyunUidList = builder.aliyunUidList;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAmountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return aliyunUidList
     */
    public java.util.List<String> getAliyunUidList() {
        return this.aliyunUidList;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<QueryAmountRequest, Builder> {
        private String workspaceId; 
        private java.util.List<String> aliyunUidList; 
        private String endDate; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(QueryAmountRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.aliyunUidList = request.aliyunUidList;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder aliyunUidList(java.util.List<String> aliyunUidList) {
            this.putBodyParameter("aliyunUidList", aliyunUidList);
            this.aliyunUidList = aliyunUidList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public QueryAmountRequest build() {
            return new QueryAmountRequest(this);
        } 

    } 

}
