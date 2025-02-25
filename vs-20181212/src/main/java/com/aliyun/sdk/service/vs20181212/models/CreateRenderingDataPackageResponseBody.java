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
 * {@link CreateRenderingDataPackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRenderingDataPackageResponseBody</p>
 */
public class CreateRenderingDataPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataPackageId")
    private String dataPackageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRenderingDataPackageResponseBody(Builder builder) {
        this.dataPackageId = builder.dataPackageId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRenderingDataPackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataPackageId
     */
    public String getDataPackageId() {
        return this.dataPackageId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataPackageId; 
        private String requestId; 

        /**
         * DataPackageId.
         */
        public Builder dataPackageId(String dataPackageId) {
            this.dataPackageId = dataPackageId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRenderingDataPackageResponseBody build() {
            return new CreateRenderingDataPackageResponseBody(this);
        } 

    } 

}
