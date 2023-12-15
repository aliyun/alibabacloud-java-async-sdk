// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDialogRequest} extends {@link RequestModel}
 *
 * <p>DescribeDialogRequest</p>
 */
public class DescribeDialogRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("DialogId")
    @Validation(required = true)
    private Long dialogId;

    private DescribeDialogRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.dialogId = builder.dialogId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDialogRequest create() {
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
     * @return dialogId
     */
    public Long getDialogId() {
        return this.dialogId;
    }

    public static final class Builder extends Request.Builder<DescribeDialogRequest, Builder> {
        private String agentKey; 
        private Long dialogId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDialogRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.dialogId = request.dialogId;
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
         * DialogId.
         */
        public Builder dialogId(Long dialogId) {
            this.putQueryParameter("DialogId", dialogId);
            this.dialogId = dialogId;
            return this;
        }

        @Override
        public DescribeDialogRequest build() {
            return new DescribeDialogRequest(this);
        } 

    } 

}
