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
 * {@link DeletePatchBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePatchBaselineResponseBody</p>
 */
public class DeletePatchBaselineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeletePatchBaselineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePatchBaselineResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>85197066-0209-5775-BBED-99DF9DA44E48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeletePatchBaselineResponseBody build() {
            return new DeletePatchBaselineResponseBody(this);
        } 

    } 

}
