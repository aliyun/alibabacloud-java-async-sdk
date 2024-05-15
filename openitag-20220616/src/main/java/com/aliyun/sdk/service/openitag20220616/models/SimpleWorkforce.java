// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SimpleWorkforce} extends {@link TeaModel}
 *
 * <p>SimpleWorkforce</p>
 */
public class SimpleWorkforce extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("UserIds")
    private java.util.List < Long > userIds;

    @com.aliyun.core.annotation.NameInMap("WorkNodeId")
    private Integer workNodeId;

    private SimpleWorkforce(Builder builder) {
        this.userIds = builder.userIds;
        this.workNodeId = builder.workNodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimpleWorkforce create() {
        return builder().build();
    }

    /**
     * @return userIds
     */
    public java.util.List < Long > getUserIds() {
        return this.userIds;
    }

    /**
     * @return workNodeId
     */
    public Integer getWorkNodeId() {
        return this.workNodeId;
    }

    public static final class Builder {
        private java.util.List < Long > userIds; 
        private Integer workNodeId; 

        /**
         * UserIds.
         */
        public Builder userIds(java.util.List < Long > userIds) {
            this.userIds = userIds;
            return this;
        }

        /**
         * WorkNodeId.
         */
        public Builder workNodeId(Integer workNodeId) {
            this.workNodeId = workNodeId;
            return this;
        }

        public SimpleWorkforce build() {
            return new SimpleWorkforce(this);
        } 

    } 

}
