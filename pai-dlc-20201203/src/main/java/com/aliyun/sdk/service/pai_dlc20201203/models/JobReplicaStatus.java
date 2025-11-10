// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link JobReplicaStatus} extends {@link TeaModel}
 *
 * <p>JobReplicaStatus</p>
 */
public class JobReplicaStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Active")
    private Integer active;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private JobReplicaStatus(Builder builder) {
        this.active = builder.active;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobReplicaStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Integer getActive() {
        return this.active;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Integer active; 
        private String type; 

        private Builder() {
        } 

        private Builder(JobReplicaStatus model) {
            this.active = model.active;
            this.type = model.type;
        } 

        /**
         * Active.
         */
        public Builder active(Integer active) {
            this.active = active;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public JobReplicaStatus build() {
            return new JobReplicaStatus(this);
        } 

    } 

}
