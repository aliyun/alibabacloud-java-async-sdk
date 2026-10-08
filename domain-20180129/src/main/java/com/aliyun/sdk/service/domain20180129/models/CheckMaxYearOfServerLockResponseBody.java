// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link CheckMaxYearOfServerLockResponseBody} extends {@link TeaModel}
 *
 * <p>CheckMaxYearOfServerLockResponseBody</p>
 */
public class CheckMaxYearOfServerLockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxYear")
    private Integer maxYear;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckMaxYearOfServerLockResponseBody(Builder builder) {
        this.maxYear = builder.maxYear;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMaxYearOfServerLockResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxYear
     */
    public Integer getMaxYear() {
        return this.maxYear;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxYear; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckMaxYearOfServerLockResponseBody model) {
            this.maxYear = model.maxYear;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Maximum number of years that can be purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxYear(Integer maxYear) {
            this.maxYear = maxYear;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckMaxYearOfServerLockResponseBody build() {
            return new CheckMaxYearOfServerLockResponseBody(this);
        } 

    } 

}
