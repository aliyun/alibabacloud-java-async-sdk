// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetABMetricGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetABMetricGroupResponseBody</p>
 */
public class GetABMetricGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ABMetricIds")
    private String ABMetricIds;

    @com.aliyun.core.annotation.NameInMap("ABMetricNames")
    private String ABMetricNames;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("Realtime")
    private Boolean realtime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    private GetABMetricGroupResponseBody(Builder builder) {
        this.ABMetricIds = builder.ABMetricIds;
        this.ABMetricNames = builder.ABMetricNames;
        this.description = builder.description;
        this.name = builder.name;
        this.owner = builder.owner;
        this.realtime = builder.realtime;
        this.requestId = builder.requestId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetABMetricGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return ABMetricIds
     */
    public String getABMetricIds() {
        return this.ABMetricIds;
    }

    /**
     * @return ABMetricNames
     */
    public String getABMetricNames() {
        return this.ABMetricNames;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return realtime
     */
    public Boolean getRealtime() {
        return this.realtime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder {
        private String ABMetricIds; 
        private String ABMetricNames; 
        private String description; 
        private String name; 
        private String owner; 
        private Boolean realtime; 
        private String requestId; 
        private String sceneId; 

        /**
         * ABMetricIds.
         */
        public Builder ABMetricIds(String ABMetricIds) {
            this.ABMetricIds = ABMetricIds;
            return this;
        }

        /**
         * ABMetricNames.
         */
        public Builder ABMetricNames(String ABMetricNames) {
            this.ABMetricNames = ABMetricNames;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * Owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Realtime.
         */
        public Builder realtime(Boolean realtime) {
            this.realtime = realtime;
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
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        public GetABMetricGroupResponseBody build() {
            return new GetABMetricGroupResponseBody(this);
        } 

    } 

}
