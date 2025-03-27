// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetAICoachTaskSessionHistoryRequest} extends {@link RequestModel}
 *
 * <p>GetAICoachTaskSessionHistoryRequest</p>
 */
public class GetAICoachTaskSessionHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    private GetAICoachTaskSessionHistoryRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sessionId = builder.sessionId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachTaskSessionHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetAICoachTaskSessionHistoryRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sessionId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GetAICoachTaskSessionHistoryRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sessionId = request.sessionId;
            this.uid = request.uid;
        } 

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetAICoachTaskSessionHistoryRequest build() {
            return new GetAICoachTaskSessionHistoryRequest(this);
        } 

    } 

}
