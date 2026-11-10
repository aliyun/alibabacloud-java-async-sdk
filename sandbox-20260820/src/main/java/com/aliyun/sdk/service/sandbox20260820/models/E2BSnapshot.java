// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link E2BSnapshot} extends {@link TeaModel}
 *
 * <p>E2BSnapshot</p>
 */
public class E2BSnapshot extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpuCount")
    private Float cpuCount;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("expiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("memoryMB")
    private Integer memoryMB;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("snapshotID")
    private String snapshotID;

    @com.aliyun.core.annotation.NameInMap("sourceSandboxID")
    private String sourceSandboxID;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("tag")
    private String tag;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("teamName")
    private String teamName;

    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    private E2BSnapshot(Builder builder) {
        this.cpuCount = builder.cpuCount;
        this.createdTime = builder.createdTime;
        this.expiredTime = builder.expiredTime;
        this.memoryMB = builder.memoryMB;
        this.name = builder.name;
        this.resourceGroupID = builder.resourceGroupID;
        this.snapshotID = builder.snapshotID;
        this.sourceSandboxID = builder.sourceSandboxID;
        this.status = builder.status;
        this.tag = builder.tag;
        this.teamID = builder.teamID;
        this.teamName = builder.teamName;
        this.userID = builder.userID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BSnapshot create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuCount
     */
    public Float getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return memoryMB
     */
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return snapshotID
     */
    public String getSnapshotID() {
        return this.snapshotID;
    }

    /**
     * @return sourceSandboxID
     */
    public String getSourceSandboxID() {
        return this.sourceSandboxID;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return teamName
     */
    public String getTeamName() {
        return this.teamName;
    }

    /**
     * @return userID
     */
    public String getUserID() {
        return this.userID;
    }

    public static final class Builder {
        private Float cpuCount; 
        private String createdTime; 
        private String expiredTime; 
        private Integer memoryMB; 
        private String name; 
        private String resourceGroupID; 
        private String snapshotID; 
        private String sourceSandboxID; 
        private String status; 
        private String tag; 
        private String teamID; 
        private String teamName; 
        private String userID; 

        private Builder() {
        } 

        private Builder(E2BSnapshot model) {
            this.cpuCount = model.cpuCount;
            this.createdTime = model.createdTime;
            this.expiredTime = model.expiredTime;
            this.memoryMB = model.memoryMB;
            this.name = model.name;
            this.resourceGroupID = model.resourceGroupID;
            this.snapshotID = model.snapshotID;
            this.sourceSandboxID = model.sourceSandboxID;
            this.status = model.status;
            this.tag = model.tag;
            this.teamID = model.teamID;
            this.teamName = model.teamName;
            this.userID = model.userID;
        } 

        /**
         * <p>The CPU specifications of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpuCount(Float cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * <p>The creation time of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>1793685726000</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The expiration time of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>1796277726000</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>The memory specifications of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder memoryMB(Integer memoryMB) {
            this.memoryMB = memoryMB;
            return this;
        }

        /**
         * <p>The short name of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-****</p>
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * <p>The snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0d66****b374</p>
         */
        public Builder snapshotID(String snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

        /**
         * <p>The source sandbox ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sbx-****</p>
         */
        public Builder sourceSandboxID(String sourceSandboxID) {
            this.sourceSandboxID = sourceSandboxID;
            return this;
        }

        /**
         * <p>The snapshot status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The snapshot tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * <p>The team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A66****b892</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The team name.</p>
         * 
         * <strong>example:</strong>
         * <p>teamName</p>
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>155****</p>
         */
        public Builder userID(String userID) {
            this.userID = userID;
            return this;
        }

        public E2BSnapshot build() {
            return new E2BSnapshot(this);
        } 

    } 

}
