// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link GenerateOpsItemResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateOpsItemResponseBody</p>
 */
public class GenerateOpsItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OpsItemIds")
    private java.util.List<String> opsItemIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateOpsItemResponseBody(Builder builder) {
        this.opsItemIds = builder.opsItemIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOpsItemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return opsItemIds
     */
    public java.util.List<String> getOpsItemIds() {
        return this.opsItemIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> opsItemIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateOpsItemResponseBody model) {
            this.opsItemIds = model.opsItemIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The O&amp;M item list.</p>
         */
        public Builder opsItemIds(java.util.List<String> opsItemIds) {
            this.opsItemIds = opsItemIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DA4F08D4-DA54-5407-84B9-108C71D75B17</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateOpsItemResponseBody build() {
            return new GenerateOpsItemResponseBody(this);
        } 

    } 

}
