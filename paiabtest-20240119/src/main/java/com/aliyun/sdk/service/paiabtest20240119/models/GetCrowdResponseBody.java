// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCrowdResponseBody} extends {@link TeaModel}
 *
 * <p>GetCrowdResponseBody</p>
 */
public class GetCrowdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CrowdId")
    private String crowdId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Quantity")
    private String quantity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private String users;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetCrowdResponseBody(Builder builder) {
        this.crowdId = builder.crowdId;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.label = builder.label;
        this.name = builder.name;
        this.quantity = builder.quantity;
        this.requestId = builder.requestId;
        this.users = builder.users;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrowdResponseBody create() {
        return builder().build();
    }

    /**
     * @return crowdId
     */
    public String getCrowdId() {
        return this.crowdId;
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
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return quantity
     */
    public String getQuantity() {
        return this.quantity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return users
     */
    public String getUsers() {
        return this.users;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String crowdId; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String label; 
        private String name; 
        private String quantity; 
        private String requestId; 
        private String users; 
        private String workspaceId; 

        /**
         * CrowdId.
         */
        public Builder crowdId(String crowdId) {
            this.crowdId = crowdId;
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
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.label = label;
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
         * Quantity.
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
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
         * Users.
         */
        public Builder users(String users) {
            this.users = users;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetCrowdResponseBody build() {
            return new GetCrowdResponseBody(this);
        } 

    } 

}
