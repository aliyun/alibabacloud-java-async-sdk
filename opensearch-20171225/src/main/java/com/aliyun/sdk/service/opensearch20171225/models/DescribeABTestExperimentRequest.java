// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeABTestExperimentRequest} extends {@link RequestModel}
 *
 * <p>DescribeABTestExperimentRequest</p>
 */
public class DescribeABTestExperimentRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("sceneId")
    @Validation(required = true, maximum = 999999999)
    private Integer sceneId;

    @Path
    @NameInMap("groupId")
    @Validation(required = true, maximum = 999999999)
    private Integer groupId;

    @Path
    @NameInMap("experimentId")
    @Validation(required = true, maximum = 999999999)
    private Integer experimentId;

    private DescribeABTestExperimentRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.sceneId = builder.sceneId;
        this.groupId = builder.groupId;
        this.experimentId = builder.experimentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeABTestExperimentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return sceneId
     */
    public Integer getSceneId() {
        return this.sceneId;
    }

    /**
     * @return groupId
     */
    public Integer getGroupId() {
        return this.groupId;
    }

    /**
     * @return experimentId
     */
    public Integer getExperimentId() {
        return this.experimentId;
    }

    public static final class Builder extends Request.Builder<DescribeABTestExperimentRequest, Builder> {
        private String appGroupIdentity; 
        private Integer sceneId; 
        private Integer groupId; 
        private Integer experimentId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeABTestExperimentRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.sceneId = response.sceneId;
            this.groupId = response.groupId;
            this.experimentId = response.experimentId;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * sceneId.
         */
        public Builder sceneId(Integer sceneId) {
            this.putPathParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * groupId.
         */
        public Builder groupId(Integer groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * experimentId.
         */
        public Builder experimentId(Integer experimentId) {
            this.putPathParameter("experimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        @Override
        public DescribeABTestExperimentRequest build() {
            return new DescribeABTestExperimentRequest(this);
        } 

    } 

}
