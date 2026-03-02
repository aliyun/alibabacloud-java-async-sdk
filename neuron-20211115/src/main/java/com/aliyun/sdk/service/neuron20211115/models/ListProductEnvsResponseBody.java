// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListProductEnvsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductEnvsResponseBody</p>
 */
public class ListProductEnvsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("envList")
    private java.util.List<String> envList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListProductEnvsResponseBody(Builder builder) {
        this.envList = builder.envList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductEnvsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envList
     */
    public java.util.List<String> getEnvList() {
        return this.envList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> envList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProductEnvsResponseBody model) {
            this.envList = model.envList;
            this.requestId = model.requestId;
        } 

        /**
         * envList.
         */
        public Builder envList(java.util.List<String> envList) {
            this.envList = envList;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3239281273464326823</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProductEnvsResponseBody build() {
            return new ListProductEnvsResponseBody(this);
        } 

    } 

}
