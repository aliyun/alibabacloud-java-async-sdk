// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link LaneMqGroupInfo} extends {@link TeaModel}
 *
 * <p>LaneMqGroupInfo</p>
 */
public class LaneMqGroupInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowClean")
    private Boolean allowClean;

    @com.aliyun.core.annotation.NameInMap("laneId")
    private Long laneId;

    @com.aliyun.core.annotation.NameInMap("laneName")
    private String laneName;

    @com.aliyun.core.annotation.NameInMap("mqGroups")
    private MqGroup mqGroups;

    private LaneMqGroupInfo(Builder builder) {
        this.allowClean = builder.allowClean;
        this.laneId = builder.laneId;
        this.laneName = builder.laneName;
        this.mqGroups = builder.mqGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LaneMqGroupInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowClean
     */
    public Boolean getAllowClean() {
        return this.allowClean;
    }

    /**
     * @return laneId
     */
    public Long getLaneId() {
        return this.laneId;
    }

    /**
     * @return laneName
     */
    public String getLaneName() {
        return this.laneName;
    }

    /**
     * @return mqGroups
     */
    public MqGroup getMqGroups() {
        return this.mqGroups;
    }

    public static final class Builder {
        private Boolean allowClean; 
        private Long laneId; 
        private String laneName; 
        private MqGroup mqGroups; 

        private Builder() {
        } 

        private Builder(LaneMqGroupInfo model) {
            this.allowClean = model.allowClean;
            this.laneId = model.laneId;
            this.laneName = model.laneName;
            this.mqGroups = model.mqGroups;
        } 

        /**
         * allowClean.
         */
        public Builder allowClean(Boolean allowClean) {
            this.allowClean = allowClean;
            return this;
        }

        /**
         * laneId.
         */
        public Builder laneId(Long laneId) {
            this.laneId = laneId;
            return this;
        }

        /**
         * laneName.
         */
        public Builder laneName(String laneName) {
            this.laneName = laneName;
            return this;
        }

        /**
         * mqGroups.
         */
        public Builder mqGroups(MqGroup mqGroups) {
            this.mqGroups = mqGroups;
            return this;
        }

        public LaneMqGroupInfo build() {
            return new LaneMqGroupInfo(this);
        } 

    } 

}
