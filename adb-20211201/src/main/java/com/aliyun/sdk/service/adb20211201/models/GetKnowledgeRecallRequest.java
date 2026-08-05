// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetKnowledgeRecallRequest} extends {@link RequestModel}
 *
 * <p>GetKnowledgeRecallRequest</p>
 */
public class GetKnowledgeRecallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Question")
    @com.aliyun.core.annotation.Validation(required = true)
    private String question;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topk")
    private Integer topk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private GetKnowledgeRecallRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.question = builder.question;
        this.topk = builder.topk;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeRecallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * @return topk
     */
    public Integer getTopk() {
        return this.topk;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<GetKnowledgeRecallRequest, Builder> {
        private String DBClusterId; 
        private String question; 
        private Integer topk; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(GetKnowledgeRecallRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.question = request.question;
            this.topk = request.topk;
            this.user = request.user;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp19aaaaaa****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>What are the reports for the clothing category this month?</p>
         */
        public Builder question(String question) {
            this.putQueryParameter("Question", question);
            this.question = question;
            return this;
        }

        /**
         * Topk.
         */
        public Builder topk(Integer topk) {
            this.putQueryParameter("Topk", topk);
            this.topk = topk;
            return this;
        }

        /**
         * User.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public GetKnowledgeRecallRequest build() {
            return new GetKnowledgeRecallRequest(this);
        } 

    } 

}
