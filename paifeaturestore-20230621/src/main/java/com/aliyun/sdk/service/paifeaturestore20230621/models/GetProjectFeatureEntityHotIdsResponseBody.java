// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectFeatureEntityHotIdsResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectFeatureEntityHotIdsResponseBody</p>
 */
public class GetProjectFeatureEntityHotIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("HotIds")
    private String hotIds;

    @com.aliyun.core.annotation.NameInMap("NextSeqNumber")
    private String nextSeqNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProjectFeatureEntityHotIdsResponseBody(Builder builder) {
        this.count = builder.count;
        this.hotIds = builder.hotIds;
        this.nextSeqNumber = builder.nextSeqNumber;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectFeatureEntityHotIdsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return hotIds
     */
    public String getHotIds() {
        return this.hotIds;
    }

    /**
     * @return nextSeqNumber
     */
    public String getNextSeqNumber() {
        return this.nextSeqNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private String hotIds; 
        private String nextSeqNumber; 
        private String requestId; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * HotIds.
         */
        public Builder hotIds(String hotIds) {
            this.hotIds = hotIds;
            return this;
        }

        /**
         * NextSeqNumber.
         */
        public Builder nextSeqNumber(String nextSeqNumber) {
            this.nextSeqNumber = nextSeqNumber;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProjectFeatureEntityHotIdsResponseBody build() {
            return new GetProjectFeatureEntityHotIdsResponseBody(this);
        } 

    } 

}
