// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryFaceUserBatchRequest} extends {@link RequestModel}
 *
 * <p>QueryFaceUserBatchRequest</p>
 */
public class QueryFaceUserBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> userIdList;

    private QueryFaceUserBatchRequest(Builder builder) {
        super(builder);
        this.isolationId = builder.isolationId;
        this.userIdList = builder.userIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceUserBatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    /**
     * @return userIdList
     */
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

    public static final class Builder extends Request.Builder<QueryFaceUserBatchRequest, Builder> {
        private String isolationId; 
        private java.util.List<String> userIdList; 

        private Builder() {
            super();
        } 

        private Builder(QueryFaceUserBatchRequest request) {
            super(request);
            this.isolationId = request.isolationId;
            this.userIdList = request.userIdList;
        } 

        /**
         * <p>The business isolation ID, which is used to isolate data between different business applications under the same Alibaba Cloud account. Keep this value consistent with the <strong>IsolationId</strong> set when calling the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add users.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZheJiangHZ</p>
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * <p>The list of user IDs. Pass the user IDs that were obtained and saved locally after calling the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add users.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;xqymlby<strong><strong>4whye&quot;,&quot;6qyyb69zqara</strong></strong>&quot;,&quot;64nbfx8****hzmy4&quot;]</p>
         */
        public Builder userIdList(java.util.List<String> userIdList) {
            this.putQueryParameter("UserIdList", userIdList);
            this.userIdList = userIdList;
            return this;
        }

        @Override
        public QueryFaceUserBatchRequest build() {
            return new QueryFaceUserBatchRequest(this);
        } 

    } 

}
