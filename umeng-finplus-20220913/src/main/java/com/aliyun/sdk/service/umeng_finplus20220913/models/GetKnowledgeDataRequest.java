// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link GetKnowledgeDataRequest} extends {@link RequestModel}
 *
 * <p>GetKnowledgeDataRequest</p>
 */
public class GetKnowledgeDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private GetKnowledgeDataRequestBody body;

    private GetKnowledgeDataRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public GetKnowledgeDataRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GetKnowledgeDataRequest, Builder> {
        private GetKnowledgeDataRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetKnowledgeDataRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(GetKnowledgeDataRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putQueryParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public GetKnowledgeDataRequest build() {
            return new GetKnowledgeDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetKnowledgeDataRequest} extends {@link TeaModel}
     *
     * <p>GetKnowledgeDataRequest</p>
     */
    public static class GetKnowledgeDataRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("knowledgeIdList")
        private java.util.List<String> knowledgeIdList;

        private GetKnowledgeDataRequestBody(Builder builder) {
            this.appId = builder.appId;
            this.knowledgeIdList = builder.knowledgeIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetKnowledgeDataRequestBody create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return knowledgeIdList
         */
        public java.util.List<String> getKnowledgeIdList() {
            return this.knowledgeIdList;
        }

        public static final class Builder {
            private String appId; 
            private java.util.List<String> knowledgeIdList; 

            private Builder() {
            } 

            private Builder(GetKnowledgeDataRequestBody model) {
                this.appId = model.appId;
                this.knowledgeIdList = model.knowledgeIdList;
            } 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * knowledgeIdList.
             */
            public Builder knowledgeIdList(java.util.List<String> knowledgeIdList) {
                this.knowledgeIdList = knowledgeIdList;
                return this;
            }

            public GetKnowledgeDataRequestBody build() {
                return new GetKnowledgeDataRequestBody(this);
            } 

        } 

    }
}
