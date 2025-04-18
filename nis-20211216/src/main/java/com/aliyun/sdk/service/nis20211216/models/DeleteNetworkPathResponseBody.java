// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link DeleteNetworkPathResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteNetworkPathResponseBody</p>
 */
public class DeleteNetworkPathResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Boolean data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteNetworkPathResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkPathResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteNetworkPathResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Result of operation.</p>
         * <ul>
         * <li><strong>true</strong>: Delete Success.</li>
         * <li><strong>false</strong>: Delete Fail.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C4331873-C534-590F-A905-F66C53B88A47</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteNetworkPathResponseBody build() {
            return new DeleteNetworkPathResponseBody(this);
        } 

    } 

}
