// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConsistencySnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsistencySnapshotResponseBody</p>
 */
public class GetConsistencySnapshotResponseBody extends TeaModel {
    @NameInMap("ConsistencyResultJsonStr")
    private String consistencyResultJsonStr;

    @NameInMap("RequestId")
    private String requestId;

    private GetConsistencySnapshotResponseBody(Builder builder) {
        this.consistencyResultJsonStr = builder.consistencyResultJsonStr;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsistencySnapshotResponseBody create() {
        return builder().build();
    }

    /**
     * @return consistencyResultJsonStr
     */
    public String getConsistencyResultJsonStr() {
        return this.consistencyResultJsonStr;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String consistencyResultJsonStr; 
        private String requestId; 

        /**
         * ConsistencyResultJsonStr.
         */
        public Builder consistencyResultJsonStr(String consistencyResultJsonStr) {
            this.consistencyResultJsonStr = consistencyResultJsonStr;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConsistencySnapshotResponseBody build() {
            return new GetConsistencySnapshotResponseBody(this);
        } 

    } 

}
