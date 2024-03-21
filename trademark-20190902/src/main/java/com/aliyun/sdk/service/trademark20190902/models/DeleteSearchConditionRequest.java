// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSearchConditionRequest} extends {@link RequestModel}
 *
 * <p>DeleteSearchConditionRequest</p>
 */
public class DeleteSearchConditionRequest extends Request {
    @Query
    @NameInMap("ConditionId")
    @Validation(required = true, maximum = 2147483647)
    private Long conditionId;

    @Query
    @NameInMap("SessionId")
    private String sessionId;

    @Query
    @NameInMap("Umid")
    private String umid;

    private DeleteSearchConditionRequest(Builder builder) {
        super(builder);
        this.conditionId = builder.conditionId;
        this.sessionId = builder.sessionId;
        this.umid = builder.umid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSearchConditionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditionId
     */
    public Long getConditionId() {
        return this.conditionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return umid
     */
    public String getUmid() {
        return this.umid;
    }

    public static final class Builder extends Request.Builder<DeleteSearchConditionRequest, Builder> {
        private Long conditionId; 
        private String sessionId; 
        private String umid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSearchConditionRequest request) {
            super(request);
            this.conditionId = request.conditionId;
            this.sessionId = request.sessionId;
            this.umid = request.umid;
        } 

        /**
         * ConditionId.
         */
        public Builder conditionId(Long conditionId) {
            this.putQueryParameter("ConditionId", conditionId);
            this.conditionId = conditionId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Umid.
         */
        public Builder umid(String umid) {
            this.putQueryParameter("Umid", umid);
            this.umid = umid;
            return this;
        }

        @Override
        public DeleteSearchConditionRequest build() {
            return new DeleteSearchConditionRequest(this);
        } 

    } 

}
