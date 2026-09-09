// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateHiveResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHiveResponseBody</p>
 */
public class CreateHiveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HiveId")
    private String hiveId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHiveResponseBody(Builder builder) {
        this.hiveId = builder.hiveId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHiveResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hiveId
     */
    public String getHiveId() {
        return this.hiveId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hiveId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateHiveResponseBody model) {
            this.hiveId = model.hiveId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hive-6c1418bf513e400bb697307c077a0ec3</p>
         */
        public Builder hiveId(String hiveId) {
            this.hiveId = hiveId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHiveResponseBody build() {
            return new CreateHiveResponseBody(this);
        } 

    } 

}
