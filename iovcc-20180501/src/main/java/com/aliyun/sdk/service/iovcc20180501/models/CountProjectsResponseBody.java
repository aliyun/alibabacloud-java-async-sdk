// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>CountProjectsResponseBody</p>
 */
public class CountProjectsResponseBody extends TeaModel {
    @NameInMap("ProjectCount")
    private Integer projectCount;

    @NameInMap("RequestId")
    private String requestId;

    private CountProjectsResponseBody(Builder builder) {
        this.projectCount = builder.projectCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return projectCount
     */
    public Integer getProjectCount() {
        return this.projectCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer projectCount; 
        private String requestId; 

        /**
         * ProjectCount.
         */
        public Builder projectCount(Integer projectCount) {
            this.projectCount = projectCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CountProjectsResponseBody build() {
            return new CountProjectsResponseBody(this);
        } 

    } 

}
