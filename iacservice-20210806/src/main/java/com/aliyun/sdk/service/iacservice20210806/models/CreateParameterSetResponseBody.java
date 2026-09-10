// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link CreateParameterSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateParameterSetResponseBody</p>
 */
public class CreateParameterSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("parameterSetId")
    private String parameterSetId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateParameterSetResponseBody(Builder builder) {
        this.parameterSetId = builder.parameterSetId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateParameterSetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameterSetId
     */
    public String getParameterSetId() {
        return this.parameterSetId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String parameterSetId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateParameterSetResponseBody model) {
            this.parameterSetId = model.parameterSetId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The parameter set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pts-3b6cb9fa4751afff89a4b73779e0d</p>
         */
        public Builder parameterSetId(String parameterSetId) {
            this.parameterSetId = parameterSetId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7FA0FF4A-ABD4-54F6-BEAC-B4273EBA10A2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateParameterSetResponseBody build() {
            return new CreateParameterSetResponseBody(this);
        } 

    } 

}
