// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link QueryGroupIdByGroupNameRequest} extends {@link RequestModel}
 *
 * <p>QueryGroupIdByGroupNameRequest</p>
 */
public class QueryGroupIdByGroupNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private QueryGroupIdByGroupNameRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGroupIdByGroupNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<QueryGroupIdByGroupNameRequest, Builder> {
        private String groupName; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryGroupIdByGroupNameRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The name of the asset group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestGroupName</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10.12.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public QueryGroupIdByGroupNameRequest build() {
            return new QueryGroupIdByGroupNameRequest(this);
        } 

    } 

}
