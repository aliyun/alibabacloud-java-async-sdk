// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link DeadLetterQueue} extends {@link TeaModel}
 *
 * <p>DeadLetterQueue</p>
 */
public class DeadLetterQueue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    private DeadLetterQueue(Builder builder) {
        this.arn = builder.arn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeadLetterQueue create() {
        return builder().build();
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    public static final class Builder {
        private String arn; 

        /**
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        public DeadLetterQueue build() {
            return new DeadLetterQueue(this);
        } 

    } 

}
