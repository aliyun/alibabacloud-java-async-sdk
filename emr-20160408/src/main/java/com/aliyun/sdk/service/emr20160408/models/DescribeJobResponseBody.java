// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobResponseBody</p>
 */
public class DescribeJobResponseBody extends TeaModel {
    @NameInMap("FailAct")
    private String failAct;

    @NameInMap("Id")
    private String id;

    @NameInMap("MaxRetry")
    private Integer maxRetry;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RetryInterval")
    private Integer retryInterval;

    @NameInMap("RunParameter")
    private String runParameter;

    @NameInMap("Type")
    private String type;

    private DescribeJobResponseBody(Builder builder) {
        this.failAct = builder.failAct;
        this.id = builder.id;
        this.maxRetry = builder.maxRetry;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.retryInterval = builder.retryInterval;
        this.runParameter = builder.runParameter;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return failAct
     */
    public String getFailAct() {
        return this.failAct;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return maxRetry
     */
    public Integer getMaxRetry() {
        return this.maxRetry;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retryInterval
     */
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return runParameter
     */
    public String getRunParameter() {
        return this.runParameter;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String failAct; 
        private String id; 
        private Integer maxRetry; 
        private String name; 
        private String requestId; 
        private Integer retryInterval; 
        private String runParameter; 
        private String type; 

        /**
         * FailAct.
         */
        public Builder failAct(String failAct) {
            this.failAct = failAct;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * MaxRetry.
         */
        public Builder maxRetry(Integer maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RetryInterval.
         */
        public Builder retryInterval(Integer retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * RunParameter.
         */
        public Builder runParameter(String runParameter) {
            this.runParameter = runParameter;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeJobResponseBody build() {
            return new DescribeJobResponseBody(this);
        } 

    } 

}
