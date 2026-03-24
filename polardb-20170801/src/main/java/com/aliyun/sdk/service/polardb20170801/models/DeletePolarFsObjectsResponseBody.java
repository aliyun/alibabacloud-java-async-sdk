// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeletePolarFsObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePolarFsObjectsResponseBody</p>
 */
public class DeletePolarFsObjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeletePolarFsObjectsResponseBody(Builder builder) {
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarFsObjectsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String polarFsInstanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeletePolarFsObjectsResponseBody model) {
            this.polarFsInstanceId = model.polarFsInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * PolarFsInstanceId.
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C890995A-CF06-4F4D-8DB8-DD26C2******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeletePolarFsObjectsResponseBody build() {
            return new DeletePolarFsObjectsResponseBody(this);
        } 

    } 

}
