// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetVersionResponseBody</p>
 */
public class GetVersionResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Definition")
    private String definition;

    @NameInMap("FlowId")
    private String flowId;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("VersionDescription")
    private String versionDescription;

    @NameInMap("VersionId")
    private String versionId;

    @NameInMap("VersionName")
    private String versionName;

    @NameInMap("VersionStatus")
    private String versionStatus;

    private GetVersionResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.definition = builder.definition;
        this.flowId = builder.flowId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.updateTime = builder.updateTime;
        this.versionDescription = builder.versionDescription;
        this.versionId = builder.versionId;
        this.versionName = builder.versionName;
        this.versionStatus = builder.versionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    /**
     * @return versionStatus
     */
    public String getVersionStatus() {
        return this.versionStatus;
    }

    public static final class Builder {
        private String createTime; 
        private String definition; 
        private String flowId; 
        private String regionId; 
        private String requestId; 
        private String updateTime; 
        private String versionDescription; 
        private String versionId; 
        private String versionName; 
        private String versionStatus; 

        /**
         * The time when the version was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The definition of the workflow to which the version belongs.
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * The ID of the workflow to which the version belongs.
         */
        public Builder flowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * The region where the workflow resides.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the version was last updated.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * The description of the version.
         */
        public Builder versionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * The ID of the version.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * The name of the version.
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        /**
         * The status of the version. **Enabled** indicates that the version is enabled.
         */
        public Builder versionStatus(String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }

        public GetVersionResponseBody build() {
            return new GetVersionResponseBody(this);
        } 

    } 

}
