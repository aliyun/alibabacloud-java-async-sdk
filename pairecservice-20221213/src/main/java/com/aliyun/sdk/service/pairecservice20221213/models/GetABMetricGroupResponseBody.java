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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetABMetricGroupResponseBody model) {
            this.ABMetricIds = model.ABMetricIds;
            this.ABMetricNames = model.ABMetricNames;
            this.description = model.description;
            this.name = model.name;
            this.owner = model.owner;
            this.realtime = model.realtime;
            this.requestId = model.requestId;
            this.sceneId = model.sceneId;
        } 

        /**
         * <p>A comma-separated list of A/B testing metric IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        public Builder ABMetricIds(String ABMetricIds) {
            this.ABMetricIds = ABMetricIds;
            return this;
        }

        /**
         * <p>A comma-separated list of A/B testing metric names.</p>
         * 
         * <strong>example:</strong>
         * <p>pv,uv</p>
         */
        public Builder ABMetricNames(String ABMetricNames) {
            this.ABMetricNames = ABMetricNames;
            return this;
        }

        /**
         * <p>The metric group description.</p>
         * 
         * <strong>example:</strong>
         * <p>访问量相关指标</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The metric group name.</p>
         * 
         * <strong>example:</strong>
         * <p>visits</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The owner.</p>
         * 
         * <strong>example:</strong>
         * <p>2799614***</p>
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>Whether the metric group is a real-time metric group.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder realtime(Boolean realtime) {
            this.realtime = realtime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01D22D08-BA20-5F35-8302-99115F288220</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scene ID. You can get this ID by calling the <a href="https://icms.alibaba-inc.com/content/learn/pai?l=1%5C&m=16768%5C&n=4298955">ListScenes</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
