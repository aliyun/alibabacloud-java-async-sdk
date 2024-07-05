// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveAppResourceResponseBody} extends {@link TeaModel}
 *
 * <p>MoveAppResourceResponseBody</p>
 */
public class MoveAppResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedResourceIds")
    private java.util.List < String > failedResourceIds;

    @com.aliyun.core.annotation.NameInMap("NonExistResourceIds")
    private java.util.List < String > nonExistResourceIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private MoveAppResourceResponseBody(Builder builder) {
        this.failedResourceIds = builder.failedResourceIds;
        this.nonExistResourceIds = builder.nonExistResourceIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveAppResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedResourceIds
     */
    public java.util.List < String > getFailedResourceIds() {
        return this.failedResourceIds;
    }

    /**
     * @return nonExistResourceIds
     */
    public java.util.List < String > getNonExistResourceIds() {
        return this.nonExistResourceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > failedResourceIds; 
        private java.util.List < String > nonExistResourceIds; 
        private String requestId; 

        /**
         * The IDs of the resources that failed to be migrated.
         */
        public Builder failedResourceIds(java.util.List < String > failedResourceIds) {
            this.failedResourceIds = failedResourceIds;
            return this;
        }

        /**
         * The IDs of the resources that were not found.
         */
        public Builder nonExistResourceIds(java.util.List < String > nonExistResourceIds) {
            this.nonExistResourceIds = nonExistResourceIds;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public MoveAppResourceResponseBody build() {
            return new MoveAppResourceResponseBody(this);
        } 

    } 

}
