// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLayerResponseBody} extends {@link TeaModel}
 *
 * <p>GetLayerResponseBody</p>
 */
public class GetLayerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("LaboratoryId")
    private String laboratoryId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResidualFlow")
    private Long residualFlow;

    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    private GetLayerResponseBody(Builder builder) {
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.laboratoryId = builder.laboratoryId;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.residualFlow = builder.residualFlow;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLayerResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return laboratoryId
     */
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return residualFlow
     */
    public Long getResidualFlow() {
        return this.residualFlow;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder {
        private String description; 
        private String gmtCreateTime; 
        private String laboratoryId; 
        private String name; 
        private String requestId; 
        private Long residualFlow; 
        private String sceneId; 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * LaboratoryId.
         */
        public Builder laboratoryId(String laboratoryId) {
            this.laboratoryId = laboratoryId;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResidualFlow.
         */
        public Builder residualFlow(Long residualFlow) {
            this.residualFlow = residualFlow;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        public GetLayerResponseBody build() {
            return new GetLayerResponseBody(this);
        } 

    } 

}
