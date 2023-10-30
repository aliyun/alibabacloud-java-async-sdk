// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFeatureEntityResponseBody} extends {@link TeaModel}
 *
 * <p>GetFeatureEntityResponseBody</p>
 */
public class GetFeatureEntityResponseBody extends TeaModel {
    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("JoinId")
    private String joinId;

    @NameInMap("Name")
    private String name;

    @NameInMap("Owner")
    private String owner;

    @NameInMap("ProjectId")
    private String projectId;

    @NameInMap("ProjectName")
    private String projectName;

    @NameInMap("RequestId")
    private String requestId;

    private GetFeatureEntityResponseBody(Builder builder) {
        this.gmtCreateTime = builder.gmtCreateTime;
        this.joinId = builder.joinId;
        this.name = builder.name;
        this.owner = builder.owner;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFeatureEntityResponseBody create() {
        return builder().build();
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return joinId
     */
    public String getJoinId() {
        return this.joinId;
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String gmtCreateTime; 
        private String joinId; 
        private String name; 
        private String owner; 
        private String projectId; 
        private String projectName; 
        private String requestId; 

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * JoinId.
         */
        public Builder joinId(String joinId) {
            this.joinId = joinId;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFeatureEntityResponseBody build() {
            return new GetFeatureEntityResponseBody(this);
        } 

    } 

}
