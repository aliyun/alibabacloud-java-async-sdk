// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetCnameFlatteningResponseBody} extends {@link TeaModel}
 *
 * <p>GetCnameFlatteningResponseBody</p>
 */
public class GetCnameFlatteningResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlattenMode")
    private String flattenMode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCnameFlatteningResponseBody(Builder builder) {
        this.flattenMode = builder.flattenMode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCnameFlatteningResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flattenMode
     */
    public String getFlattenMode() {
        return this.flattenMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String flattenMode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCnameFlatteningResponseBody model) {
            this.flattenMode = model.flattenMode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The CNAME flattening mode. Valid values:</p>
         * <ul>
         * <li>flatten_all: flattens all CNAMEs.</li>
         * <li>flatten_all (default): flattens only the root domain.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>flatten_all</p>
         */
        public Builder flattenMode(String flattenMode) {
            this.flattenMode = flattenMode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCnameFlatteningResponseBody build() {
            return new GetCnameFlatteningResponseBody(this);
        } 

    } 

}
