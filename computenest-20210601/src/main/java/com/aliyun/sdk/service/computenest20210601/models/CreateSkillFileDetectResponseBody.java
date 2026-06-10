// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CreateSkillFileDetectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSkillFileDetectResponseBody</p>
 */
public class CreateSkillFileDetectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HashKey")
    private String hashKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateSkillFileDetectResponseBody(Builder builder) {
        this.hashKey = builder.hashKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillFileDetectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hashKey
     */
    public String getHashKey() {
        return this.hashKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hashKey; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateSkillFileDetectResponseBody model) {
            this.hashKey = model.hashKey;
            this.requestId = model.requestId;
        } 

        /**
         * HashKey.
         */
        public Builder hashKey(String hashKey) {
            this.hashKey = hashKey;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3F976EF8-C10A-57DC-917C-BB7BEB508FFB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSkillFileDetectResponseBody build() {
            return new CreateSkillFileDetectResponseBody(this);
        } 

    } 

}
