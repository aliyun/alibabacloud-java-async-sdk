// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateSubCrowdResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSubCrowdResponseBody</p>
 */
public class CreateSubCrowdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCrowdId")
    private String subCrowdId;

    private CreateSubCrowdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subCrowdId = builder.subCrowdId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubCrowdResponseBody create() {
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
     * @return subCrowdId
     */
    public String getSubCrowdId() {
        return this.subCrowdId;
    }

    public static final class Builder {
        private String requestId; 
        private String subCrowdId; 

        private Builder() {
        } 

        private Builder(CreateSubCrowdResponseBody model) {
            this.requestId = model.requestId;
            this.subCrowdId = model.subCrowdId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9763624B-5FBB-5E3A-9193-B1ADB554CEAE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubCrowdId.
         */
        public Builder subCrowdId(String subCrowdId) {
            this.subCrowdId = subCrowdId;
            return this;
        }

        public CreateSubCrowdResponseBody build() {
            return new CreateSubCrowdResponseBody(this);
        } 

    } 

}
