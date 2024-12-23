// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ClickhouseConf} extends {@link TeaModel}
 *
 * <p>ClickhouseConf</p>
 */
public class ClickhouseConf extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InitialReplica")
    private Integer initialReplica;

    @com.aliyun.core.annotation.NameInMap("InitialShard")
    private Integer initialShard;

    @com.aliyun.core.annotation.NameInMap("NewNodeCount")
    private Integer newNodeCount;

    @com.aliyun.core.annotation.NameInMap("ResizeType")
    private String resizeType;

    private ClickhouseConf(Builder builder) {
        this.initialReplica = builder.initialReplica;
        this.initialShard = builder.initialShard;
        this.newNodeCount = builder.newNodeCount;
        this.resizeType = builder.resizeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClickhouseConf create() {
        return builder().build();
    }

    /**
     * @return initialReplica
     */
    public Integer getInitialReplica() {
        return this.initialReplica;
    }

    /**
     * @return initialShard
     */
    public Integer getInitialShard() {
        return this.initialShard;
    }

    /**
     * @return newNodeCount
     */
    public Integer getNewNodeCount() {
        return this.newNodeCount;
    }

    /**
     * @return resizeType
     */
    public String getResizeType() {
        return this.resizeType;
    }

    public static final class Builder {
        private Integer initialReplica; 
        private Integer initialShard; 
        private Integer newNodeCount; 
        private String resizeType; 

        /**
         * InitialReplica.
         */
        public Builder initialReplica(Integer initialReplica) {
            this.initialReplica = initialReplica;
            return this;
        }

        /**
         * InitialShard.
         */
        public Builder initialShard(Integer initialShard) {
            this.initialShard = initialShard;
            return this;
        }

        /**
         * NewNodeCount.
         */
        public Builder newNodeCount(Integer newNodeCount) {
            this.newNodeCount = newNodeCount;
            return this;
        }

        /**
         * ResizeType.
         */
        public Builder resizeType(String resizeType) {
            this.resizeType = resizeType;
            return this;
        }

        public ClickhouseConf build() {
            return new ClickhouseConf(this);
        } 

    } 

}
