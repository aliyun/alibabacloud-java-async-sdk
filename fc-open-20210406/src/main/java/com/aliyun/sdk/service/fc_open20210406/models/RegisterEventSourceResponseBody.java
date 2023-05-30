// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterEventSourceResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterEventSourceResponseBody</p>
 */
public class RegisterEventSourceResponseBody extends TeaModel {
    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("sourceArn")
    private String sourceArn;

    private RegisterEventSourceResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.sourceArn = builder.sourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterEventSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return sourceArn
     */
    public String getSourceArn() {
        return this.sourceArn;
    }

    public static final class Builder {
        private String createdTime; 
        private String sourceArn; 

        /**
         * 创建时间
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * 事件源资源标识符
         */
        public Builder sourceArn(String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        public RegisterEventSourceResponseBody build() {
            return new RegisterEventSourceResponseBody(this);
        } 

    } 

}
