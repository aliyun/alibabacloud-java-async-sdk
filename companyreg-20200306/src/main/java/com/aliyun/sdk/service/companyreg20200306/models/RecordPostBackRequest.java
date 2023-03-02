// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecordPostBackRequest} extends {@link RequestModel}
 *
 * <p>RecordPostBackRequest</p>
 */
public class RecordPostBackRequest extends Request {
    @Query
    @NameInMap("bizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("bizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("contactor")
    @Validation(required = true)
    private String contactor;

    @Query
    @NameInMap("content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("entityKey")
    @Validation(required = true)
    private String entityKey;

    private RecordPostBackRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.contactor = builder.contactor;
        this.content = builder.content;
        this.entityKey = builder.entityKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecordPostBackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return contactor
     */
    public String getContactor() {
        return this.contactor;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return entityKey
     */
    public String getEntityKey() {
        return this.entityKey;
    }

    public static final class Builder extends Request.Builder<RecordPostBackRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private String contactor; 
        private String content; 
        private String entityKey; 

        private Builder() {
            super();
        } 

        private Builder(RecordPostBackRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.contactor = request.contactor;
            this.content = request.content;
            this.entityKey = request.entityKey;
        } 

        /**
         * bizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("bizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * bizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("bizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * contactor.
         */
        public Builder contactor(String contactor) {
            this.putQueryParameter("contactor", contactor);
            this.contactor = contactor;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.putQueryParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * entityKey.
         */
        public Builder entityKey(String entityKey) {
            this.putQueryParameter("entityKey", entityKey);
            this.entityKey = entityKey;
            return this;
        }

        @Override
        public RecordPostBackRequest build() {
            return new RecordPostBackRequest(this);
        } 

    } 

}
