// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link EditRoutineConfResponseBody} extends {@link TeaModel}
 *
 * <p>EditRoutineConfResponseBody</p>
 */
public class EditRoutineConfResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map<String, ?> content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EditRoutineConfResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditRoutineConfResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, ?> content; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(EditRoutineConfResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The description of the execution errors and the version number of the latest environment configurations.</p>
         */
        public Builder content(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BAECB354-6D42-42C1-87DA-C9992EF1E7C8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EditRoutineConfResponseBody build() {
            return new EditRoutineConfResponseBody(this);
        } 

    } 

}
