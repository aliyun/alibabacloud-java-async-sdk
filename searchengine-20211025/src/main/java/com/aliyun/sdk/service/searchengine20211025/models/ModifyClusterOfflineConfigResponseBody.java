// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ModifyClusterOfflineConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyClusterOfflineConfigResponseBody</p>
 */
public class ModifyClusterOfflineConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.Map<String, ?> result;

    private ModifyClusterOfflineConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterOfflineConfigResponseBody create() {
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
     * @return result
     */
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map<String, ?> result; 

        private Builder() {
        } 

        private Builder(ModifyClusterOfflineConfigResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder result(java.util.Map<String, ?> result) {
            this.result = result;
            return this;
        }

        public ModifyClusterOfflineConfigResponseBody build() {
            return new ModifyClusterOfflineConfigResponseBody(this);
        } 

    } 

}
