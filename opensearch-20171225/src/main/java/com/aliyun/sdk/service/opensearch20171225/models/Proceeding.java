// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link Proceeding} extends {@link TeaModel}
 *
 * <p>Proceeding</p>
 */
public class Proceeding extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("detail")
    private java.util.Map<String, ?> detail;

    @com.aliyun.core.annotation.NameInMap("progress")
    private Float progress;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("subTasks")
    private Proceeding subTasks;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private Proceeding(Builder builder) {
        this.detail = builder.detail;
        this.progress = builder.progress;
        this.status = builder.status;
        this.subTasks = builder.subTasks;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Proceeding create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detail
     */
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    /**
     * @return progress
     */
    public Float getProgress() {
        return this.progress;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subTasks
     */
    public Proceeding getSubTasks() {
        return this.subTasks;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.Map<String, ?> detail; 
        private Float progress; 
        private String status; 
        private Proceeding subTasks; 
        private String type; 

        private Builder() {
        } 

        private Builder(Proceeding model) {
            this.detail = model.detail;
            this.progress = model.progress;
            this.status = model.status;
            this.subTasks = model.subTasks;
            this.type = model.type;
        } 

        /**
         * detail.
         */
        public Builder detail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }

        /**
         * progress.
         */
        public Builder progress(Float progress) {
            this.progress = progress;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * subTasks.
         */
        public Builder subTasks(Proceeding subTasks) {
            this.subTasks = subTasks;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Proceeding build() {
            return new Proceeding(this);
        } 

    } 

}
