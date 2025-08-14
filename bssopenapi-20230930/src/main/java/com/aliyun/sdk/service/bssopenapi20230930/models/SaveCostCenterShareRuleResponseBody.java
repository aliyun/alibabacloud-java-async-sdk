// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link SaveCostCenterShareRuleResponseBody} extends {@link TeaModel}
 *
 * <p>SaveCostCenterShareRuleResponseBody</p>
 */
public class SaveCostCenterShareRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SaveCostCenterShareRuleResponseBody(Builder builder) {
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveCostCenterShareRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Object metadata; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SaveCostCenterShareRuleResponseBody model) {
            this.metadata = model.metadata;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SaveCostCenterShareRuleResponseBody build() {
            return new SaveCostCenterShareRuleResponseBody(this);
        } 

    } 

}
