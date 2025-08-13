// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DeleteEventFieldResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEventFieldResponseBody</p>
 */
public class DeleteEventFieldResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resuleObject")
    private Boolean resuleObject;

    private DeleteEventFieldResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resuleObject = builder.resuleObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventFieldResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resuleObject
     */
    public Boolean getResuleObject() {
        return this.resuleObject;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean resuleObject; 

        private Builder() {
        } 

        private Builder(DeleteEventFieldResponseBody model) {
            this.requestId = model.requestId;
            this.resuleObject = model.resuleObject;
        } 

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result object</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder resuleObject(Boolean resuleObject) {
            this.resuleObject = resuleObject;
            return this;
        }

        public DeleteEventFieldResponseBody build() {
            return new DeleteEventFieldResponseBody(this);
        } 

    } 

}
