// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link LineageRelationship} extends {@link TeaModel}
 *
 * <p>LineageRelationship</p>
 */
public class LineageRelationship extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("DstEntity")
    private LineageEntity dstEntity;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("SrcEntity")
    private LineageEntity srcEntity;

    @com.aliyun.core.annotation.NameInMap("Task")
    private LineageTask task;

    private LineageRelationship(Builder builder) {
        this.createTime = builder.createTime;
        this.dstEntity = builder.dstEntity;
        this.id = builder.id;
        this.srcEntity = builder.srcEntity;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageRelationship create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dstEntity
     */
    public LineageEntity getDstEntity() {
        return this.dstEntity;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return srcEntity
     */
    public LineageEntity getSrcEntity() {
        return this.srcEntity;
    }

    /**
     * @return task
     */
    public LineageTask getTask() {
        return this.task;
    }

    public static final class Builder {
        private Long createTime; 
        private LineageEntity dstEntity; 
        private String id; 
        private LineageEntity srcEntity; 
        private LineageTask task; 

        private Builder() {
        } 

        private Builder(LineageRelationship model) {
            this.createTime = model.createTime;
            this.dstEntity = model.dstEntity;
            this.id = model.id;
            this.srcEntity = model.srcEntity;
            this.task = model.task;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DstEntity.
         */
        public Builder dstEntity(LineageEntity dstEntity) {
            this.dstEntity = dstEntity;
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
         * SrcEntity.
         */
        public Builder srcEntity(LineageEntity srcEntity) {
            this.srcEntity = srcEntity;
            return this;
        }

        /**
         * Task.
         */
        public Builder task(LineageTask task) {
            this.task = task;
            return this;
        }

        public LineageRelationship build() {
            return new LineageRelationship(this);
        } 

    } 

}
