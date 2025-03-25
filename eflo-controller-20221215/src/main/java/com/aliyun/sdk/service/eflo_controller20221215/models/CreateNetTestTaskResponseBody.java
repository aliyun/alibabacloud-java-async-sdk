// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link CreateNetTestTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetTestTaskResponseBody</p>
 */
public class CreateNetTestTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TestId")
    private String testId;

    private CreateNetTestTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.testId = builder.testId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetTestTaskResponseBody create() {
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
     * @return testId
     */
    public String getTestId() {
        return this.testId;
    }

    public static final class Builder {
        private String requestId; 
        private String testId; 

        private Builder() {
        } 

        private Builder(CreateNetTestTaskResponseBody model) {
            this.requestId = model.requestId;
            this.testId = model.testId;
        } 

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>启动测试任务ID，网络测试任务的唯一标志。</p>
         * 
         * <strong>example:</strong>
         * <p>dr-uf6i0tv2refv8wz*****</p>
         */
        public Builder testId(String testId) {
            this.testId = testId;
            return this;
        }

        public CreateNetTestTaskResponseBody build() {
            return new CreateNetTestTaskResponseBody(this);
        } 

    } 

}
