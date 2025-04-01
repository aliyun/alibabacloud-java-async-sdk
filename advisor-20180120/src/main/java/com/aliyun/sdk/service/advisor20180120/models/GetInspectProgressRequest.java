// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link GetInspectProgressRequest} extends {@link RequestModel}
 *
 * <p>GetInspectProgressRequest</p>
 */
public class GetInspectProgressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssumeAliyunId")
    private Long assumeAliyunId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetInspectProgressRequest(Builder builder) {
        super(builder);
        this.assumeAliyunId = builder.assumeAliyunId;
        this.taskId = builder.taskId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInspectProgressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assumeAliyunId
     */
    public Long getAssumeAliyunId() {
        return this.assumeAliyunId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetInspectProgressRequest, Builder> {
        private Long assumeAliyunId; 
        private Long taskId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetInspectProgressRequest request) {
            super(request);
            this.assumeAliyunId = request.assumeAliyunId;
            this.taskId = request.taskId;
            this.token = request.token;
        } 

        /**
         * AssumeAliyunId.
         */
        public Builder assumeAliyunId(Long assumeAliyunId) {
            this.putQueryParameter("AssumeAliyunId", assumeAliyunId);
            this.assumeAliyunId = assumeAliyunId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetInspectProgressRequest build() {
            return new GetInspectProgressRequest(this);
        } 

    } 

}
