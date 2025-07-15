// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateLiveAIStudioResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLiveAIStudioResponseBody</p>
 */
public class CreateLiveAIStudioResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StudioId")
    private String studioId;

    private CreateLiveAIStudioResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.studioId = builder.studioId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveAIStudioResponseBody create() {
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
     * @return studioId
     */
    public String getStudioId() {
        return this.studioId;
    }

    public static final class Builder {
        private String requestId; 
        private String studioId; 

        private Builder() {
        } 

        private Builder(CreateLiveAIStudioResponseBody model) {
            this.requestId = model.requestId;
            this.studioId = model.studioId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17D7526C-69AD-5761-8037-071C27358345</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the virtual studio template.</p>
         * 
         * <strong>example:</strong>
         * <p>369ced1f-c33a-49e5-91da-bdaae3d6c1c2</p>
         */
        public Builder studioId(String studioId) {
            this.studioId = studioId;
            return this;
        }

        public CreateLiveAIStudioResponseBody build() {
            return new CreateLiveAIStudioResponseBody(this);
        } 

    } 

}
