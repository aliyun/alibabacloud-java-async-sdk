// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link StartNisTrafficRankingResponseBody} extends {@link TeaModel}
 *
 * <p>StartNisTrafficRankingResponseBody</p>
 */
public class StartNisTrafficRankingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NisTrafficRankingId")
    private String nisTrafficRankingId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartNisTrafficRankingResponseBody(Builder builder) {
        this.nisTrafficRankingId = builder.nisTrafficRankingId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartNisTrafficRankingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nisTrafficRankingId
     */
    public String getNisTrafficRankingId() {
        return this.nisTrafficRankingId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nisTrafficRankingId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(StartNisTrafficRankingResponseBody model) {
            this.nisTrafficRankingId = model.nisTrafficRankingId;
            this.requestId = model.requestId;
        } 

        /**
         * NisTrafficRankingId.
         */
        public Builder nisTrafficRankingId(String nisTrafficRankingId) {
            this.nisTrafficRankingId = nisTrafficRankingId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartNisTrafficRankingResponseBody build() {
            return new StartNisTrafficRankingResponseBody(this);
        } 

    } 

}
