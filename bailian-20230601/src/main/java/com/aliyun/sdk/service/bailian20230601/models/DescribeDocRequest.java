// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDocRequest} extends {@link RequestModel}
 *
 * <p>DescribeDocRequest</p>
 */
public class DescribeDocRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("DocId")
    @Validation(required = true)
    private String docId;

    private DescribeDocRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.docId = builder.docId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    public static final class Builder extends Request.Builder<DescribeDocRequest, Builder> {
        private String agentKey; 
        private String docId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDocRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.docId = request.docId;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * DocId.
         */
        public Builder docId(String docId) {
            this.putQueryParameter("DocId", docId);
            this.docId = docId;
            return this;
        }

        @Override
        public DescribeDocRequest build() {
            return new DescribeDocRequest(this);
        } 

    } 

}
