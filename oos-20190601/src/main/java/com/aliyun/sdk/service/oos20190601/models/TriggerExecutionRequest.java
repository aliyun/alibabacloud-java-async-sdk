// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerExecutionRequest} extends {@link RequestModel}
 *
 * <p>TriggerExecutionRequest</p>
 */
public class TriggerExecutionRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("ExecutionId")
    @Validation(required = true)
    private String executionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private TriggerExecutionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.content = builder.content;
        this.executionId = builder.executionId;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerExecutionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<TriggerExecutionRequest, Builder> {
        private String clientToken; 
        private String content; 
        private String executionId; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(TriggerExecutionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.content = request.content;
            this.executionId = request.executionId;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ExecutionId.
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public TriggerExecutionRequest build() {
            return new TriggerExecutionRequest(this);
        } 

    } 

}
