// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetSuppressionListLevelResponseBody} extends {@link TeaModel}
 *
 * <p>GetSuppressionListLevelResponseBody</p>
 */
public class GetSuppressionListLevelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuppressionListLevel")
    private String suppressionListLevel;

    private GetSuppressionListLevelResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.suppressionListLevel = builder.suppressionListLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSuppressionListLevelResponseBody create() {
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
     * @return suppressionListLevel
     */
    public String getSuppressionListLevel() {
        return this.suppressionListLevel;
    }

    public static final class Builder {
        private String requestId; 
        private String suppressionListLevel; 

        private Builder() {
        } 

        private Builder(GetSuppressionListLevelResponseBody model) {
            this.requestId = model.requestId;
            this.suppressionListLevel = model.suppressionListLevel;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuppressionListLevel.
         */
        public Builder suppressionListLevel(String suppressionListLevel) {
            this.suppressionListLevel = suppressionListLevel;
            return this;
        }

        public GetSuppressionListLevelResponseBody build() {
            return new GetSuppressionListLevelResponseBody(this);
        } 

    } 

}
