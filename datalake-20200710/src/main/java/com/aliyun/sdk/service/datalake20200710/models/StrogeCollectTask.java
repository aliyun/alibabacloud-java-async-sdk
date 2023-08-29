// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StrogeCollectTask} extends {@link TeaModel}
 *
 * <p>StrogeCollectTask</p>
 */
public class StrogeCollectTask extends TeaModel {
    @NameInMap("DestinationBucketName")
    private String destinationBucketName;

    @NameInMap("DestinationPrefix")
    private String destinationPrefix;

    @NameInMap("DlfCreated")
    private Boolean dlfCreated;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("Id")
    private String id;

    @NameInMap("InventoryId")
    private String inventoryId;

    @NameInMap("Location")
    private String location;

    @NameInMap("Status")
    private String status;

    @NameInMap("TaskType")
    private String taskType;

    private StrogeCollectTask(Builder builder) {
        this.destinationBucketName = builder.destinationBucketName;
        this.destinationPrefix = builder.destinationPrefix;
        this.dlfCreated = builder.dlfCreated;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.inventoryId = builder.inventoryId;
        this.location = builder.location;
        this.status = builder.status;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StrogeCollectTask create() {
        return builder().build();
    }

    /**
     * @return destinationBucketName
     */
    public String getDestinationBucketName() {
        return this.destinationBucketName;
    }

    /**
     * @return destinationPrefix
     */
    public String getDestinationPrefix() {
        return this.destinationPrefix;
    }

    /**
     * @return dlfCreated
     */
    public Boolean getDlfCreated() {
        return this.dlfCreated;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return inventoryId
     */
    public String getInventoryId() {
        return this.inventoryId;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder {
        private String destinationBucketName; 
        private String destinationPrefix; 
        private Boolean dlfCreated; 
        private String gmtCreate; 
        private String gmtModified; 
        private String id; 
        private String inventoryId; 
        private String location; 
        private String status; 
        private String taskType; 

        /**
         * DestinationBucketName.
         */
        public Builder destinationBucketName(String destinationBucketName) {
            this.destinationBucketName = destinationBucketName;
            return this;
        }

        /**
         * DestinationPrefix.
         */
        public Builder destinationPrefix(String destinationPrefix) {
            this.destinationPrefix = destinationPrefix;
            return this;
        }

        /**
         * DlfCreated.
         */
        public Builder dlfCreated(Boolean dlfCreated) {
            this.dlfCreated = dlfCreated;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * InventoryId.
         */
        public Builder inventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public StrogeCollectTask build() {
            return new StrogeCollectTask(this);
        } 

    } 

}
