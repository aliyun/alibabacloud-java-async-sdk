// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link MNS} extends {@link TeaModel}
 *
 * <p>MNS</p>
 */
public class MNS extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("TopicName")
    private String topicName;

    private MNS(Builder builder) {
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MNS create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder {
        private String topicName; 

        private Builder() {
        } 

        private Builder(MNS model) {
            this.topicName = model.topicName;
        } 

        /**
         * <p>Specifies the name of the ApsaraMQ for MNS topic, which can be found in the topic list for the current region in the left-side navigation pane of the <a href="https://mns.console.aliyun.com/">ApsaraMQ for MNS console</a>. This parameter is required for ApsaraMQ for MNS message notification.</p>
         * 
         * <strong>example:</strong>
         * <p>topic1</p>
         */
        public Builder topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        public MNS build() {
            return new MNS(this);
        } 

    } 

}
