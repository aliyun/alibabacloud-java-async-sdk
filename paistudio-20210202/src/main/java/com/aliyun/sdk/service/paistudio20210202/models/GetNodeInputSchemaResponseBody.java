// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetNodeInputSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeInputSchemaResponseBody</p>
 */
public class GetNodeInputSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColNames")
    private java.util.List<String> colNames;

    @com.aliyun.core.annotation.NameInMap("ColTypes")
    private java.util.List<String> colTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNodeInputSchemaResponseBody(Builder builder) {
        this.colNames = builder.colNames;
        this.colTypes = builder.colTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeInputSchemaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return colNames
     */
    public java.util.List<String> getColNames() {
        return this.colNames;
    }

    /**
     * @return colTypes
     */
    public java.util.List<String> getColTypes() {
        return this.colTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> colNames; 
        private java.util.List<String> colTypes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNodeInputSchemaResponseBody model) {
            this.colNames = model.colNames;
            this.colTypes = model.colTypes;
            this.requestId = model.requestId;
        } 

        /**
         * ColNames.
         */
        public Builder colNames(java.util.List<String> colNames) {
            this.colNames = colNames;
            return this;
        }

        /**
         * ColTypes.
         */
        public Builder colTypes(java.util.List<String> colTypes) {
            this.colTypes = colTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNodeInputSchemaResponseBody build() {
            return new GetNodeInputSchemaResponseBody(this);
        } 

    } 

}
