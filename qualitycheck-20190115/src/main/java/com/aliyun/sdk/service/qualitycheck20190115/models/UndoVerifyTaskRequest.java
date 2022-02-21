// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UndoVerifyTaskRequest} extends {@link RequestModel}
 *
 * <p>UndoVerifyTaskRequest</p>
 */
public class UndoVerifyTaskRequest extends Request {
    @Query
    @NameInMap("JsonStr")
    @Validation(required = true)
    private String jsonStr;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UndoVerifyTaskRequest(Builder builder) {
        super(builder);
        this.jsonStr = builder.jsonStr;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UndoVerifyTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jsonStr
     */
    public String getJsonStr() {
        return this.jsonStr;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<UndoVerifyTaskRequest, Builder> {
        private String jsonStr; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UndoVerifyTaskRequest response) {
            super(response);
            this.jsonStr = response.jsonStr;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * JsonStr.
         */
        public Builder jsonStr(String jsonStr) {
            this.putQueryParameter("JsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public UndoVerifyTaskRequest build() {
            return new UndoVerifyTaskRequest(this);
        } 

    } 

}
