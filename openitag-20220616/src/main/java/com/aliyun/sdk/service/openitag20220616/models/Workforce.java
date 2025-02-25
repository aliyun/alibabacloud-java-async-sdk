// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Workforce} extends {@link TeaModel}
 *
 * <p>Workforce</p>
 */
public class Workforce extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List < SimpleUser > users;

    @com.aliyun.core.annotation.NameInMap("WorkNodeId")
    private Integer workNodeId;

    private Workforce(Builder builder) {
        this.nodeType = builder.nodeType;
        this.users = builder.users;
        this.workNodeId = builder.workNodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Workforce create() {
        return builder().build();
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return users
     */
    public java.util.List < SimpleUser > getUsers() {
        return this.users;
    }

    /**
     * @return workNodeId
     */
    public Integer getWorkNodeId() {
        return this.workNodeId;
    }

    public static final class Builder {
        private String nodeType; 
        private java.util.List < SimpleUser > users; 
        private Integer workNodeId; 

        /**
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List < SimpleUser > users) {
            this.users = users;
            return this;
        }

        /**
         * WorkNodeId.
         */
        public Builder workNodeId(Integer workNodeId) {
            this.workNodeId = workNodeId;
            return this;
        }

        public Workforce build() {
            return new Workforce(this);
        } 

    } 

}
