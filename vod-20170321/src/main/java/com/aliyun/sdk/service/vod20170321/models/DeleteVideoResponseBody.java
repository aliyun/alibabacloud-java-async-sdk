// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVideoResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteVideoResponseBody</p>
 */
public class DeleteVideoResponseBody extends TeaModel {
    @NameInMap("ForbiddenVideoIds")
    private java.util.List < String > forbiddenVideoIds;

    @NameInMap("NonExistVideoIds")
    private java.util.List < String > nonExistVideoIds;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteVideoResponseBody(Builder builder) {
        this.forbiddenVideoIds = builder.forbiddenVideoIds;
        this.nonExistVideoIds = builder.nonExistVideoIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVideoResponseBody create() {
        return builder().build();
    }

    /**
     * @return forbiddenVideoIds
     */
    public java.util.List < String > getForbiddenVideoIds() {
        return this.forbiddenVideoIds;
    }

    /**
     * @return nonExistVideoIds
     */
    public java.util.List < String > getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > forbiddenVideoIds; 
        private java.util.List < String > nonExistVideoIds; 
        private String requestId; 

        /**
         * ForbiddenVideoIds.
         */
        public Builder forbiddenVideoIds(java.util.List < String > forbiddenVideoIds) {
            this.forbiddenVideoIds = forbiddenVideoIds;
            return this;
        }

        /**
         * NonExistVideoIds.
         */
        public Builder nonExistVideoIds(java.util.List < String > nonExistVideoIds) {
            this.nonExistVideoIds = nonExistVideoIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteVideoResponseBody build() {
            return new DeleteVideoResponseBody(this);
        } 

    } 

}
